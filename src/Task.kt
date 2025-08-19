abstract class Task (
    var title:String,
    var deadline:String,
    var priority:Priority //has a relationship - composition
) {

    //add fun getdetails to print task info

    fun getDetails(): String {
        return "Task: $title : Deadline: $deadline | priority: $priority"
    }

}


/**
 * ABSTRACT CLASS: Base template for all task types
 * WHY: Ensures all tasks have title, deadline, priority + common functionality
 * HOW: Other task types must inherit from this (WorkTask, PersonalTask, etc.)
 * WHEN: Use when you need to enforce common structure across multiple task types
 * NOTE: Cannot create Task() directly - must create subclasses
 */
//abstract class Task(
//    var title: String,       // Task name/description
//    var deadline: String,    // Due date/time
//    var priority: Priority   // Importance level (HIGH, MEDIUM, LOW)
//) {
//    /**
//     * Returns formatted string with complete task information
//     * USAGE: println(task.getDetails()) -> "Task: Meeting | Deadline: Today | Priority: HIGH"
//     */
//    fun getDetails(): String {
//        return "Task: $title | Deadline: $deadline | Priority: $priority"
//    }
//}