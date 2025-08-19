fun main() {
    // Create notification manager (COMPOSITION)
    val manager = NotificationManager()

    // Create different task types (POLYMORPHISM)
    val t1 = WorkTask("Finish report", "2025-08-20", Priority.HIGH)
    val t2 = PersonalTask("Buy groceries", "2025-08-18", Priority.MEDIUM)

    // Add tasks using simple interface (ABSTRACTION)
    manager.addTask(t1)
    manager.addTask(t2)

    // Send reminders - complex logic hidden (ABSTRACTION + ENCAPSULATION)
    manager.sendReminders()
}