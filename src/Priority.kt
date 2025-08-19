enum class Priority {
    HIGH, MEDIUM, LOW
}


/**
 * ENUM CLASS: Represents fixed priority levels for tasks
 * WHY: Type safety - only these 3 values allowed, no invalid inputs
 * HOW: Use Priority.HIGH, Priority.MEDIUM, Priority.LOW
 * WHEN: For any fixed set of options (status, categories, types)
 * THOUGHT: Better than strings/numbers - prevents errors, self-documenting
 */