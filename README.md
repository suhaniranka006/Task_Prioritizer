# 🎯 Task Prioritizer with Notifications
## 📌Overview

This is a **console-based Kotlin project** that helps users manage and prioritize tasks with deadlines.

It demonstrates **Object-Oriented Programming (OOP)** concepts and clean design principles, while showing how notifications can be handled in a productivity app.

The system automatically sorts tasks by priority and deadline, ensuring users always see the most important tasks first.

## 📌OOP Concepts Used

### 1.Encapsulation
Example:

**abstract class Task(val title: String, val deadline: String, val priority: Priority)**


> All data related to a task is bundled inside the Task class.

### 2.Inheritance
Example:

**class WorkTask(...) : Task(...)
class PersonalTask(...) : Task(...)**


> WorkTask and PersonalTask inherit from the base Task class.

### 3.Composition
Example:

**class NotificationManager { private val tasks = mutableListOf<Task>() }**


> NotificationManager “has-a” list of tasks.

### 4.Enum Class
Example:

**enum class Priority { LOW, MEDIUM, HIGH }**


> Represents task priorities clearly.

### 5.Higher-Order Functions & Lambdas
Example:

**tasks.sortedWith(compareByDescending<Task> { it.priority }.thenBy { it.deadline })**


>Sort tasks by priority and deadline concisely.

### 6.Destructuring & Map/Loop usage
Example:

**tasks.forEach { task -> println(task.getDetails()) }**

## 📌UML Class Diagram
classDiagram
    class Task {
        - title: String
        - deadline: String
        - priority: Priority
        + getDetails(): String
    }

    class WorkTask {
        + getDetails(): String
    }

    class PersonalTask {
        + getDetails(): String
    }

    class NotificationManager {
        - tasks: MutableList<Task>
        + addTask(task: Task): Unit
        + sortTasks(): List<Task>
        + sendReminders(): Unit
    }

    enum Priority {
        LOW
        MEDIUM
        HIGH
    }

    Task <|-- WorkTask
    Task <|-- PersonalTask
    NotificationManager "1" --> "*" Task : manages

## 📌How the Program Works (Flow)

1.Create Task objects → WorkTask or PersonalTask.

2.Add tasks to NotificationManager.

3.Sort tasks by priority → deadline.

4.Send reminders → print sorted tasks to console.

## 📌Sample Run (Output)

📢 Task Reminders:

   🔔 Task: complete another oops project : Deadline: 23-09-8 | priority: HIGH
   
   🔔 Task: Finish report : Deadline: 2025-08-20 | priority: MEDIUM
   
   🔔 Task: Organize room : Deadline: 2025-08-18 | priority: LOW

## 📌Future Enhancements

-Add task categories (like Health, Fitness, Study).

-Support repeating tasks with auto-reminders.

-Allow unequal priority weight for tasks.

-Create a simple Android app with notifications UI.

-Store tasks in database or cloud for persistence.
