class Chefbuchhalter(
    name: String,
    geburtsdatum: String,
    adresse: String,
    telefonNr: String,
    email: String,
    abteilung: String,
    gehalt: Double,
    ueberstunde: Double,
) : Position (name, geburtsdatum, adresse, telefonNr, email, abteilung, gehalt, ueberstunde)
{
    // Task von Chef Manager bekommen
    val tasks: MutableList<String> = mutableListOf()
    fun assignTasksWithDeadline(tasksWithDeadline: Map<String, String>) {
        tasks.clear()
        tasks.addAll(tasksWithDeadline.keys)
        println("Team $abteilung tasks with deadlines:")
        for ((task, deadline) in tasksWithDeadline) {
            println("- $task (Deadline: $deadline)")
        }
    }

        //Arbeitsteilung im Team
        fun assignTasksToBuchhalter(buchhalter: Buchhalter, task: String, deadline: String) {
            buchhalter.assignTask(task, deadline)
            println("Team Buchhaltung: Die Aufgabe '$task' wird Buchhalter ${buchhalter.name} mit Frist $deadline zugewiesen.")
        }
    }
