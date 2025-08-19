/**
 * NOTIFICATION MANAGER: Demonstrates Composition + Encapsulation + Abstraction
 * COMPOSITION: HAS-A list of Task objects
 * ENCAPSULATION: Internal task list is private (data hiding)
 * ABSTRACTION: Complex sorting logic hidden behind simple methods
 * POLYMORPHISM: Works with any Task subclass through base class reference
 */
class NotificationManager {

    // COMPOSITION + ENCAPSULATION: Private list of composed Task objects
    private val tasks = mutableListOf<Task>()

    /**
     * PUBLIC INTERFACE: Abstraction - simple method to add tasks
     * POLYMORPHISM: Accepts any subclass of Task (WorkTask, PersonalTask, etc.)
     */
    fun addTask(task: Task) {
        tasks.add(task)
    }

    /**
     * COMPLEX LOGIC HIDDEN: Abstraction - sorting implementation hidden
     * Returns sorted list by priority (descending) then deadline (ascending)
     */
    fun sortTasks(): List<Task> {
        return tasks.sortedWith(
            compareByDescending<Task> {
                it.priority  // Sort by Priority enum (HIGH first)
            }.thenBy { it.deadline }  // Then by deadline string
        )
    }

    /**
     * ABSTRACTION: Simple method hiding complex operations
     * 1. Sorts tasks internally
     * 2. Iterates through sorted list
     * 3. Uses Task's polymorphism (getDetails() works for all subclasses)
     */
    fun sendReminders() {
        println("\n📢 Task Reminders:")
        sortTasks().forEach { task ->
            println("   🔔 ${task.getDetails()}")
        }
    }
}