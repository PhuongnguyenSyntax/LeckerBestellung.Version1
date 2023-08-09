
open class Position(
    val name: String,
    val geburtsdatum: String,
    val adresse: String,
    val telefonNr: String,
    val email: String,
    val abteilung: String,
    var gehalt: Double,
    var ueberstunde: Double
) {
    // Print info von Position
    fun printPositionInfo() {
        println("Name: $name")
        println("Geburtsdatum: $geburtsdatum")
        println("Adresse: $adresse")
        println("TelefonNr: $telefonNr")
        println("Email: $email")
        println("Abteilung: $abteilung")
        println("Gehalt: $gehalt")
        println("Überstunde: $ueberstunde")
    }
    // Methode zum hinzufügen von Urlaubtstage
    /*ich benutze privat var vacationDays, deswegen brauche ich auch get-set zum Urlaubtage eingeben, den code habe ich
    von Youtube gelernt.
     */

    private var vacationDays: Int = 0
    fun setVacationDays(days: Int) {
        vacationDays = days
    }
    fun getVacationDays(): Int {
        return vacationDays
    }




}