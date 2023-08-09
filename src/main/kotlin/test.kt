fun main() {
    // test Arbeitsverteilung
    val manager = Management("Max Mustermann", "01.01.1980", "Musterstraße 123", "123456789", "max@example.com", "Management", 1000.0, 5.0)
    val chefPro = ChefProgrammierer("John Doe", "15.05.1990", "Examplestreet 456", "987654321", "john@example.com", "Programmierer", 5000.0, 5.0)
    val chefBuch = Chefbuchhalter("Maria Ann", "15.08.1988", "Bahnhofstrasse 456", "98765432009", "john@example.com", "Buchhaltung", 4000.0, 5.0)
    manager.assignTasksToChefbuchhalter(chefBuch)
    manager.assignTasksToChefProgrammierer(chefPro)
    println("----------")
   // test Arbeitsverteilung im team
    val programmierer1 = Programmierer("Henry Old","21.12.1989","Lindenstrasse.7 098765 Berlin","14890987","HenryProgrammer@syntax.com","Programmierer", 3000.0, 4.0)
    val programmierer2 = Programmierer("Myla Gomz","20.1.1987","Lindenstrasse.13 098765 Berlin","14890999","MylaProgrammer@syntax.com","Programmierer", 3000.0, 9.0)
    val programmierer3 = Programmierer("Nolan Heinz","21.12.1989","Lindenstrasse.24 098765 Berlin","14890967","NolanProgrammer@syntax.com","Programmierer", 3000.0, 6.0)

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



    chefPro.assignTasksToProgrammierer(programmierer3, taskPlus4, deadlineTaskPlus4)
    chefPro.assignTasksToProgrammierer(programmierer3, taskPlus2, deadlineTaskPlus2)
    chefPro.assignTasksToProgrammierer(programmierer3, taskPlus3, deadlineTaskPlus3)
    chefPro.assignTasksToProgrammierer(programmierer1, task1, deadline1)
    chefPro.assignTasksToProgrammierer(programmierer2, task2, deadline2)
    chefPro.assignTasksToProgrammierer(programmierer3, task3, deadline3)
    chefPro.assignTasksToProgrammierer(programmierer3, taskPlus1, deadlineTaskPlus1)

    println("----------")

    // test Arbeitsverteilung im team
    var buchhalter1 = Buchhalter("Lina Bock","21.12.1989","Lindenstrasse.89 098765 Berlin","189990987","LinaBuchhalter@syntax.com","Buchhaltung", 3000.0, 4.0)
    var buchhalter2 = Buchhalter("Patrick","20.1.1986","RonneburgStr.68 098765 Berlin","14834999","PatrickBuchhalter@syntax.com","Buchhaltung", 3000.0, 9.0)

    var taskB1 = "Rechnungbearbeitung"
    var deadlineB1 = "10.09.23"

    var taskB2 = "Finanzberichte erstellen"
    var deadlineB2= "20.09.23"

    chefBuch.assignTasksToBuchhalter(buchhalter1, taskB1, deadline1)
    chefBuch.assignTasksToBuchhalter(buchhalter2, taskB2, deadlineB2)
    println("----------")

    // test Urblaubsgenehmigung
    manager.urlaubsgenehmigung(programmierer1, 5)
    manager.urlaubsgenehmigung(buchhalter1, 7)
    println("----------")

    // test überstunden rechnen
    manager.addOvertimeHours(programmierer1, 5.0)
    manager.addOvertimeHours(buchhalter1, 3.0)

    manager.getOvertimeHours(programmierer1)
    manager.getOvertimeHours(buchhalter1)
    println("----------")

    // test list von aufgabe
    programmierer3.displayAssignedTasks()
    buchhalter1.displayAssignedTasks()
    println("----------")

    // Ordnen die Arbeit nach Fristen
    programmierer3.sortTasksByDeadline()
    // Zeigen die To-Do-Liste nach Frist sortiert
    programmierer3.displayAssignedTasks()


}