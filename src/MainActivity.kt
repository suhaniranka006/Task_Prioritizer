fun main() {
    // Create notification manager (COMPOSITION)
    val manager = NotificationManager()

    // Create different task types (POLYMORPHISM)
    val t1 = WorkTask("Finish report", "2025-08-20", Priority.MEDIUM)
    val t2 = PersonalTask("Organize room", "2025-08-18", Priority.LOW)
    val t3=WorkTask("complete another oops project","23-09-8",Priority.HIGH)
    // Add tasks using simple interface (ABSTRACTION)
    manager.addTask(t1)
    manager.addTask(t2)
    manager.addTask(t3)
    // Send reminders - complex logic hidden (ABSTRACTION + ENCAPSULATION)
    manager.sendReminders()
}