class ChefProgrammierer(
        name: String,
        geburtsdatum: String,
        adresse: String,
        telefonNr: String,
        email: String,
        abteilung: String,
        gehalt: Double,
        überstunde: Double,
    ) : Position (name, geburtsdatum, adresse, telefonNr, email, abteilung, gehalt, überstunde)
    {
        // Task von Chef Manager bekommen
        fun assignTasksWithDeadline(tasksWithDeadline: Map<String, String>) {
            var tasks: MutableList<String> = mutableListOf()
            tasks.addAll(tasksWithDeadline.keys)
            println("Team $abteilung tasks with deadlines:")
            for ((task, deadline) in tasksWithDeadline) {
                println("- $task (Deadline: $deadline)")
            }
        }
        // Arbeitsteilung im Team
        fun assignTasksToProgrammierer(programmierer: Programmierer, task: String, deadline: String) {
            programmierer.assignTask(task, deadline)
            println("Team Programmierer: Die Aufgabe '$task' wird Programmierer ${programmierer.name} mit Frist $deadline zugewiesen.")
        }

    }