# Kotlin Student Grades Project

This Kotlin project allows users to input their name, ID, and grades for multiple subjects, and then calculates the average grade and determines whether the student has passed all subjects based on a passing grade threshold.

## Student Class

The `Student` class represents a student with the following properties:

- `name`: Student's name
- `id`: Student's ID
- `grades`: List of grades for the subjects

The class provides the following functions:

### `avgGrade()`

Calculates and returns the average grade for the student. If the grades list is empty, it returns `0.0`.

### `hasPassed(passingGrade: Int = 60)`

Checks whether the student has passed all subjects based on a passing grade threshold. The default passing grade is set to `60`, but you can customize it by providing an argument.

## Usage in `main` function

The `main` function continuously prompts the user to enter their name, ID, and grades for the subjects. It then creates a `Student` object and displays the average grade and whether the student has passed all subjects.

```kotlin
fun main() {
    while (true) {
        print("Enter your name: ")
        val name = readLine()?.capitalize()

        print("Enter your id: ")
        val userId = readLine()?.toInt()

        print("How many subjects do you study? ")
        val n = readLine()?.toInt()

        val grades = mutableListOf<Int>()

        for (i in 1..n!!) {
            print("Enter grade for subject $i: ")
            val grade = readLine()?.toInt()
            grades.add(grade!!)
        }

        val student = Student(name!!, userId!!, grades)

        println("Average grade: ${student.avgGrade()}")
        println("Has passed all subjects: ${student.hasPassed()}")
    }
}
