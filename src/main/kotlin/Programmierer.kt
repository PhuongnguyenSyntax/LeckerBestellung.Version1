class Programmierer (
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
    //Task von Chef Programmierer bekommen
    var tasksWithDeadlines: MutableMap<String, String> = mutableMapOf()
    fun assignTask(task: String, deadline: String) {
        tasksWithDeadlines[task] = deadline
    }

    // zugewiesene Aufgabenliste von Chef
    fun displayAssignedTasks() {
        println("zugewiesene Aufgabenliste von Chef Programmierer:")
        for ((task, deadline) in tasksWithDeadlines) {
            println("Aufgabe: $task - Deadline: $deadline")
        }
    }

    // Sortieren die Aufgaben nach dem Fälligkeitsdatum.
    fun sortTasksByDeadline() {
        val sortedTasks = tasksWithDeadlines.toList().sortedBy { (_, deadline) -> deadline }
        tasksWithDeadlines.clear()
        tasksWithDeadlines.putAll(sortedTasks)
    }

}