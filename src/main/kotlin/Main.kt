import java.lang.System

fun main(args: Array<String>)
{
    // Login
    // User und Passwort Erstellen
    val managerAccount = Account("manager", "1234")
    val chefProAccount = Account("chefpro", "1234")
    val pro1Account = Account("pro1", "1234")
    val pro2Account = Account("pro2", "1234")
    val pro3Account = Account("pro3", "1234")
    val chefBuchAccount = Account("chefbuch", "1234")
    val buch1Account = Account("buch1", "1234")
    val buch2Account = Account("buch2", "1234")
    val buch3Account = Account("buch3", "1234")

    // Position erstellen ( 1 Manager, 1 Chef - Team Programmierer, 3 Mitarbeiter Team Programmierer, 1 Chef - Team Buchhalter, 3 Mitarbeiter Team Buchhalter)
    val manager = Management("Andy Bemmann", "01.01.1980", "Hauptstraße 1, 00078 Berlin", "0123456789", "chef@goldensyntax.com", "Management", 5000.0, 5.0)
    val chefProgrammierer = ChefProgrammierer("John Doe", "15.05.1990", "Nebenstrasse.3 07890 Berlin", "987654321", "chefPro@goldensyntax.com", "Programmierer", 4000.0, 6.0)
    val chefBuch = Chefbuchhalter("Maria Ann", "15.08.1988", "Bahnhofstrasse 456", "98765432009", "MariaBuch@Syntax.com", "Buchhaltung", 4000.0, 5.0)
    val programmierer1 = Programmierer("Henry Old","21.12.1989","Lindenstrasse.7 098765 Berlin","14890987","HenryProgrammer@syntax.com","Programmierer", 3000.0, 4.0)
    val programmierer2 = Programmierer("Myla Gomz","20.1.1987","Lindenstrasse.13 098765 Berlin","14890999","MylaProgrammer@syntax.com","Programmierer", 3000.0, 9.0)
    val programmierer3 = Programmierer("Nolan Heinz","21.12.1989","Lindenstrasse.24 098765 Berlin","14890967","NolanProgrammer@syntax.com","Programmierer", 3000.0, 6.0)
    val buchhalter1 = Buchhalter("Lina Bock","21.12.1989","Lindenstrasse.89 098765 Berlin","189990987","LinaBuchhalter@syntax.com","Buchhaltung", 3000.0, 4.0)
    val buchhalter2 = Buchhalter("Patrick","20.1.1986","RonneburgStr.68 098765 Berlin","14834999","PatrickBuchhalter@syntax.com","Buchhaltung", 3000.0, 9.0)
    val buchhalter3 = Buchhalter("Anja","28.1.1985","RonneburgStr.70 098765 Berlin","148349123","anjaBuchhalter@syntax.com","Buchhaltung", 3000.0, 3.0)

    // Liste von Aufgabe mit Deadline von team Programmierer erstellen
    var task1 = "Design"
    var deadline1 = "10.09.23"

    var task2="Entwicklung"
    var deadline2="30.09.23"

    var task3 = "Produkttest"
    var deadline3="15.10.23"

    var taskPlus1 = "Fehlerbehebung"
    var deadlineTaskPlus1 = "27.10.23"
    var taskPlus2 = "Dokumentation"
    var deadlineTaskPlus2 = "29.10.23"
    var taskPlus3 = "Optimierung"
    var deadlineTaskPlus3 = "3.11.23"
    var taskPlus4 = "Veröffentlichung"
    var deadlineTaskPlus4 = "7.11.23"

    // Liste von Aufgabe mit Deadline von team Buchhalter erstellen

    var taskB1 = "Rechnungbearbeitung"
    var deadlineB1 = "10.09.23"

    var taskB2 = "Finanzberichte erstellen"
    var deadlineB2= "20.09.23"

    var taskB3 = "Buchhaltungsprüfung"
    var deadlineB3 = "30.09.23"

    // Mit verschiedenen Positionen anmelden, jede Position sieht unterschiedliche Informationen.

    while (true)
    {
        println("Bitte geben Sie den Benutzname ein:")
        val inputUserName = readLine()
        println("Bitte geben Sie das Passwort ein:")
        val inputPassword = readLine()

        if (inputUserName == managerAccount.username && inputPassword == managerAccount.password) {
            println("Manager eingeloggt.")
            println("----------")
            // printInfo
            println("Personal Info: ")
            manager.printPositionInfo()
            println("----------")
            Thread.sleep(300)


            //  Arbeitsverteilung für Chef Programmierer

            manager.assignTasksToChefProgrammierer(chefProgrammierer)
            println("----------")
            Thread.sleep(300)


            // Arbeitsverteilung für Chef Buchhalter
            manager.assignTasksToChefbuchhalter(chefBuch)
            println("----------")
            Thread.sleep(300)


            // Urlaubsgenehmigung
            manager.urlaubsgenehmigung(programmierer1, 5)
            manager.urlaubsgenehmigung(buchhalter1, 7)
            println("----------")
            Thread.sleep(300)


            // Überstunden Rechnen
            manager.addOvertimeHours(programmierer1, 5.0)
            manager.addOvertimeHours(buchhalter1, 3.0)
            manager.getOvertimeHours(programmierer1)
            manager.getOvertimeHours(buchhalter1)
            println("----------")

            // für Jede büberstunde bekommen Mitarbeiter 20€, Monaliche Bonus rechnen.
            val bonusProgrammierer = manager.calculateMonatlicheBonus(programmierer1)
            val bonusBuchhalter = manager.calculateMonatlicheBonus(buchhalter1)

            break
        } else if (inputUserName == chefProAccount.username && inputPassword == chefProAccount.password) {
            println("Chef Programmierer eingeloggt.")

            // Print Info
            println("Personal Info: ")
            chefProgrammierer.printPositionInfo()
            println("----------")
            Thread.sleep(300)

            // Task von Manager bekommen
            manager.assignTasksToChefProgrammierer(chefProgrammierer)
            println("----------")
            Thread.sleep(300)

             // Arbeitsteilung im Team Programmierer

            chefProgrammierer.assignTasksToProgrammierer(programmierer1, task1, deadline1)
            chefProgrammierer.assignTasksToProgrammierer(programmierer2, task2, deadline2)
            chefProgrammierer.assignTasksToProgrammierer(programmierer3, taskPlus4, deadlineTaskPlus4)
            chefProgrammierer.assignTasksToProgrammierer(programmierer3, taskPlus2, deadlineTaskPlus2)
            chefProgrammierer.assignTasksToProgrammierer(programmierer3, taskPlus3, deadlineTaskPlus3)
            chefProgrammierer.assignTasksToProgrammierer(programmierer3, task3, deadline3)
            chefProgrammierer.assignTasksToProgrammierer(programmierer3, taskPlus1, deadlineTaskPlus1)
            println("----------")
            Thread.sleep(300)
            break


        } else if (inputUserName == chefBuchAccount.username && inputPassword == chefProAccount.password) {
            println("Chef Buchhalter eingeloggt.")
            println("----------")

            // Print Info
            println("Personal Info: ")
            chefBuch.printPositionInfo()
            println("----------")
            Thread.sleep(300)

            // Task von Manager bekommen
            manager.assignTasksToChefbuchhalter(chefBuch)
            println("----------")
            Thread.sleep(300)


            //Arbeitsteilung im Team Buchhalter

            chefBuch.assignTasksToBuchhalter(buchhalter1, taskB1, deadlineB1)
            chefBuch.assignTasksToBuchhalter(buchhalter2, taskB2, deadlineB2)
            chefBuch.assignTasksToBuchhalter(buchhalter3,taskB3,deadlineB3)
            println("----------")
            Thread.sleep(300)

            break

        } else if (inputUserName == pro1Account.username && inputPassword == pro1Account.password) {
            println("Programmierer eingeloggt.")

            // Print Info
            println("Personal Info: ")
            programmierer1.printPositionInfo()
            println("----------")
            Thread.sleep(300)

            //  zugewiesene Aufgabenliste
            chefProgrammierer.assignTasksToProgrammierer(programmierer1, task1, deadline1)

            // Ordnen die Arbeit nach Fristen
            programmierer1.sortTasksByDeadline()
            programmierer1.displayAssignedTasks()
            break
        }else if (inputUserName == pro2Account.username && inputPassword == pro2Account.password){
            println("Programmierer eingeloggt.")

            // Print Info
            println("Personal Info: ")
            programmierer2.printPositionInfo()
            println("----------")
            Thread.sleep(300)

            //  zugewiesene Aufgabenliste
            chefProgrammierer.assignTasksToProgrammierer(programmierer2, task2, deadline2)

            // Ordnen die Arbeit nach Fristen
            programmierer2.sortTasksByDeadline()
            programmierer2.displayAssignedTasks()
            break
        }else if (inputUserName == pro3Account.username && inputPassword == pro3Account.password){
            println("Programmierer eingeloggt.")
            println("----------")

            // Print Info
            println("Personal Info: ")
            programmierer3.printPositionInfo()
            println("----------")
            Thread.sleep(300)

            //  zugewiesene Aufgabenliste von Chef Programmierer
            println("zugewiesene Aufgabenliste von Chef Programmierer")
            chefProgrammierer.assignTasksToProgrammierer(programmierer3, taskPlus4, deadlineTaskPlus4)
            chefProgrammierer.assignTasksToProgrammierer(programmierer3, taskPlus2, deadlineTaskPlus2)
            chefProgrammierer.assignTasksToProgrammierer(programmierer3, taskPlus3, deadlineTaskPlus3)
            chefProgrammierer.assignTasksToProgrammierer(programmierer3, task3, deadline3)
            chefProgrammierer.assignTasksToProgrammierer(programmierer3, taskPlus1, deadlineTaskPlus1)
            println("----------")


            // Ordnen die Aufgabe nach Fristen

            println("Die Aufgabe werden in der Reihenfolge ihrer Fristen angeordnet ")
            programmierer3.sortTasksByDeadline()
            programmierer3.displayAssignedTasks()
            break

        } else if (inputUserName == buch1Account.username && inputPassword == buch1Account.password) {
            println("Buchhalter eingeloggt.")

            // Print Info
            println("Personal Info: ")
            buchhalter1.printPositionInfo()
            println("----------")
            Thread.sleep(300)

            //  zugewiesene Aufgabenliste
            chefBuch.assignTasksToBuchhalter(buchhalter1, taskB1, deadlineB1)

            // Ordnen die Arbeit nach Fristen
            buchhalter1.sortTasksByDeadline()
            buchhalter1.displayAssignedTasks()
            break
        } else if (inputUserName == buch2Account.username && inputPassword == buch2Account.password) {
            println("Buchhalter eingeloggt.")

            // Print Info
            println("Personal Info: ")
            buchhalter2.printPositionInfo()
            println("----------")
            Thread.sleep(300)

            //  zugewiesene Aufgabenliste
            chefBuch.assignTasksToBuchhalter(buchhalter2, taskB2, deadlineB2)

            // Ordnen die Arbeit nach Fristen
            buchhalter2.sortTasksByDeadline()
            buchhalter2.displayAssignedTasks()
            break

        } else if (inputUserName == buch3Account.username && inputPassword == buch3Account.password) {
            println("Buchhalter eingeloggt.")

            // Print Info
            println("Personal Info: ")
            buchhalter3.printPositionInfo()
            println("----------")
            Thread.sleep(300)

            //  zugewiesene Aufgabenliste
            chefBuch.assignTasksToBuchhalter(buchhalter3, taskB3, deadlineB3)

            // Ordnen die Arbeit nach Fristen
            buchhalter3.sortTasksByDeadline()
            buchhalter3.displayAssignedTasks()
            break
        } else
        {
            println("Benutzername oder Passwort falsch. Bitte geben Sie die Daten erneut ein.")
        }
    }



    // Bonus : neu Mitarbeiter hinzufügen
    println("----------------------")
    println("----------------------")
    println("----------------------")
    println("Bonus Aufgabe: Neu Mitarbeiter hinzufügen")

    // neu Position und Account erstellen
    val system = System()
    val programmierer4 = Programmierer("Max Baumann", "01.01.1980", "Musterstraße 123", "123456789", "max@goldenSyntax.com", "Management", 3000.0, 0.0)
    val pro4Account = Account("pro4", "1234")
    system.addEmployee(programmierer4, pro4Account)
    println("----------")

}