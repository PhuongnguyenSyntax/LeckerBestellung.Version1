fun main(args: Array<String>)
{
    // Login
    // User und Passwort Erstellen und einlogen
    val managerAccount = Account("manager", "1234")
    val chefProAccount = Account("chefpro", "1234")
    val pro1Account = Account("pro1", "1234")
    val pro2Account = Account("pro2", "1234")
    val pro3Account = Account("pro3", "1234")
    val chefBuchAccount = Account("chefbuch", "1234")
    val buch1Account = Account("buch1", "1234")
    val buch2Account = Account("buch2", "1234")
    val buch3Account = Account("buch3", "1234")

    //
    val manager = Management("Andy Bemmann", "01.01.1980", "Hauptstraße 1, 00078 Berlin", "0123456789", "chef@goldensyntax.com", "Management", 5000.0, 5.0)
    val chefProgrammierer = ChefProgrammierer("John Doe", "15.05.1990", "Nebenstrasse.3 07890 Berlin", "987654321", "chefPro@goldensyntax.com", "Programmierer", 4000.0, 6.0)
    val chefBuch = Chefbuchhalter("Maria Ann", "15.08.1988", "Bahnhofstrasse 456", "98765432009", "john@example.com", "Buchhaltung", 4000.0, 5.0)
    val programmierer1 = Programmierer("Henry Old","21.12.1989","Lindenstrasse.7 098765 Berlin","14890987","HenryProgrammer@syntax.com","Programmierer", 3000.0, 4.0)
    val programmierer2 = Programmierer("Myla Gomz","20.1.1987","Lindenstrasse.13 098765 Berlin","14890999","MylaProgrammer@syntax.com","Programmierer", 3000.0, 9.0)
    val programmierer3 = Programmierer("Nolan Heinz","21.12.1989","Lindenstrasse.24 098765 Berlin","14890967","NolanProgrammer@syntax.com","Programmierer", 3000.0, 6.0)
    var buchhalter1 = Buchhalter("Lina Bock","21.12.1989","Lindenstrasse.89 098765 Berlin","189990987","LinaBuchhalter@syntax.com","Buchhaltung", 3000.0, 4.0)
    var buchhalter2 = Buchhalter("Patrick","20.1.1986","RonneburgStr.68 098765 Berlin","14834999","PatrickBuchhalter@syntax.com","Buchhaltung", 3000.0, 9.0)
    var buchhalter3 = Buchhalter("Anja","28.1.1985","RonneburgStr.70 098765 Berlin","148349123","anjaBuchhalter@syntax.com","Buchhaltung", 3000.0, 3.0)


    while (true)
    {
        println("Bitte geben Sie Benutzname ein:")
        val inputUserName = readLine()
        println("Bitte geben Sie Passwort ein:")
        val inputPassword = readLine()
        if (inputUserName == managerAccount.username && inputPassword == managerAccount.password) {
            println("Manager eingeloggt.")
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
            break
        } else if (inputUserName == chefProAccount.username && inputPassword == chefProAccount.password) {
            println("Chef Programmierer eingeloggt.")

            // Print Info
            println("Personal Info: ")
            chefProgrammierer.printPositionInfo()
            println("----------")
            Thread.sleep(300)

             // Arbeitsteilung im Team Programmierer

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
            var deadlineTaskPlus4 = "10.11.23"

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

            // Print Info
            println("Personal Info: ")
            chefBuch.printPositionInfo()
            println("----------")
            Thread.sleep(300)
            //


            //Arbeitsteilung im Team Buchhalter

            var taskB1 = "Rechnungbearbeitung"
            var deadlineB1 = "10.09.23"

            var taskB2 = "Finanzberichte erstellen"
            var deadlineB2= "20.09.23"

            var taskB3 = "Buchhaltungsprüfung"
            var deadlineB3 = "30.09.23"

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
            programmierer1.displayAssignedTasks()

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
            programmierer2.displayAssignedTasks()

            // Ordnen die Arbeit nach Fristen
            programmierer2.sortTasksByDeadline()
            programmierer2.displayAssignedTasks()
            break
        }else if (inputUserName == pro3Account.username && inputPassword == pro3Account.password){
            println("Programmierer eingeloggt.")

            // Print Info
            println("Personal Info: ")
            programmierer3.printPositionInfo()
            println("----------")
            Thread.sleep(300)

            //  zugewiesene Aufgabenliste
            programmierer3.displayAssignedTasks()

            // Ordnen die Arbeit nach Fristen
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
            buchhalter1.displayAssignedTasks()

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
            buchhalter2.displayAssignedTasks()

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
            buchhalter3.displayAssignedTasks()

            // Ordnen die Arbeit nach Fristen
            buchhalter3.sortTasksByDeadline()
            buchhalter3.displayAssignedTasks()
            break
        } else
        {
            println("Benutzername oder Passwort falsch. Bitte geben Sie erneut ein.")
        }
    }








}