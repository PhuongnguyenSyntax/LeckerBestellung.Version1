class System {
    val accounts: MutableList<Account> = mutableListOf()
    val positions: MutableList<Position> = mutableListOf()

    fun addEmployee(employee: Position, account: Account) {
        positions.add(employee)
        accounts.add(account)
        println("Neuer Mitarbeiter ${employee.name} hinzugefügt.")
    }
}