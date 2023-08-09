class Management(
    name: String,
    geburtsdatum: String,
    adresse: String,
    telefonNr: String,
    email: String,
    abteilung: String,
    gehalt: Double,
    ueberstunde: Double
) : Position(name, geburtsdatum, adresse, telefonNr, email, abteilung, gehalt, ueberstunde)
{

    //  Aufgabenverwaltung für Programmierer Team
   fun assignTasksToChefProgrammierer(chefProgrammierer: ChefProgrammierer) {
        val tasksWithDeadline = mapOf(
            "Design" to "10.09.23",
            "Entwicklung" to "30.09.23",
            "Produkttest" to "15.10.23"
        )

        chefProgrammierer.assignTasksWithDeadline(tasksWithDeadline)
        println("Aufgaben zugewiesene Dem Chef-Programmierer: ${chefProgrammierer.name}.")
    }

    // Aufgabenverwaltung für Buchhaltung Team
   fun assignTasksToChefbuchhalter(chefBuchhalter: Chefbuchhalter) {
        val tasksWithDeadline = mapOf(
            "Rechnungbearbeitung" to "10.9.23",
            "Finanzberichte erstellen" to "20.9.23",
            "Buchhaltungsprüfung" to "30.9.23"
        )

        chefBuchhalter.assignTasksWithDeadline(tasksWithDeadline)
        println(" Aufgaben zugewiesene Dem Chef Buchhalter: ${chefBuchhalter.name}.")
    }

    // Urlaubt
   fun urlaubsgenehmigung(employee: Position, days: Int) {
        if (employee is Programmierer || employee is Buchhalter) {
            employee.setVacationDays(days)
            println("Der Urlaubstag des Mitarbeiters ${employee.name} wurde für $days Tage angenommen")
        } else {
            println("Urlaubsanträge werden nicht angenommen")
        }
    }

    // Überstunden Rechnen

   fun addOvertimeHours(employee: Position, hours: Double) {
        if (employee is Programmierer || employee is Buchhalter) {
            employee.ueberstunde += hours
        }
    }

   fun getOvertimeHours(employee: Position) {
        if (employee is Programmierer || employee is Buchhalter)
        {
         println("Mitarbeiter ${employee.name} hat diesen Monat insgesamt ${employee.ueberstunde} Überstunden geleistet ")
        } else {
            println("Der Mitarbeiter hat diesen Monat insgesamt x Überstunden geleistet")
        }
    }

}
