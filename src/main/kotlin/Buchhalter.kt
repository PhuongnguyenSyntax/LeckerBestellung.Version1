class Buchhalter(
    name: String,
    geburtsdatum: String,
    adresse: String,
    telefonNr: String,
    email: String,
    abteilung: String,
    gehalt: Double,
    ueberstunde: Double
) : Position (name, geburtsdatum, adresse, telefonNr, email, abteilung, gehalt, ueberstunde)
{
    // Task von Chef Buchhalter bekommen
    var tasksWithDeadlines: MutableMap<String, String> = mutableMapOf()
    fun assignTask(task: String, deadline: String) {
        tasksWithDeadlines[task] = deadline
    }

    // zugewiesene Aufgabenliste
    fun displayAssignedTasks() {
        println("zugewiesene Aufgabenliste:")
        for ((task, deadline) in tasksWithDeadlines) {
            println("Aufgabe: $task - Deadline: $deadline")
        }
    }

    //Sortimen
    fun sortTasksByDeadline() {
        val sortedTasks = tasksWithDeadlines.toList().sortedBy { (_, deadline) -> deadline }
        tasksWithDeadlines.clear()
        tasksWithDeadlines.putAll(sortedTasks)
    }
}