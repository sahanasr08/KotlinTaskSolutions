package com.example.kotlintasksolutions

data class Student(val name: String, val id: String, var grade: Int) {
    val marks = mutableMapOf<String, Int>()
}

data class Subject(val name: String, val teacher: String, val credits: Int)

class School {
    val students = mutableMapOf<String, Student>()
    val subjects = mutableMapOf<String, Subject>()

    fun addStudent(student: Student) {
        students[student.id] = student
    }

    fun addSubject(subject: Subject) {
        subjects[subject.name] = subject
    }

    fun assignMarks(studentId: String, subjectName: String, mark: Int) {
        val student = students[studentId]
        val subject = subjects[subjectName]
        if (student != null && subject != null) {
            student.marks[subjectName] = mark
        } else {
            println("Student or Subject doesn't exist")
        }
    }

    fun getStudentAverage(studentId: String): Double? {
        val student = students[studentId]
        return if (student != null && student.marks.isNotEmpty()) {
            student.marks.values.average()
        } else {
            null
        }
    }

    fun getStudentGrade(studentId: String): String? {
        val average = getStudentAverage(studentId)
        return average?.let {
            when {
                it >= 90 -> "A"
                it >= 80 -> "B"
                it >= 70 -> "C"
                it >= 60 -> "D"
                else -> "F"
            }
        }
    }
}

fun main() {
    val school = School()

    school.addSubject(Subject("English", "Kavitha", 4))
    school.addSubject(Subject("Maths", "Manjunath", 3))
    school.addSubject(Subject("Science", "Ramesh", 3))

    school.addStudent(Student("Bhavya", "01", 10))
    school.addStudent(Student("Sneha", "02", 9))
    school.addStudent(Student("Alexa", "03", 11))

    school.assignMarks("01", "English", 85)
    school.assignMarks("01", "Maths", 90)
    school.assignMarks("01", "Science", 75)

    school.assignMarks("02", "English", 95)
    school.assignMarks("02", "Maths", 85)
    school.assignMarks("02", "Science", 80)

    school.assignMarks("03", "English", 70)
    school.assignMarks("03", "Maths", 65)
    school.assignMarks("03", "Science", 60)

    println("Student Bhavya: Average marks = ${"%.2f".format(school.getStudentAverage("01"))}, Grade = ${school.getStudentGrade("01")}")
    println("Student Sneha: Average marks = ${"%.2f".format(school.getStudentAverage("02"))}, Grade = ${school.getStudentGrade("02")}")
    println("Student Alexa: Average marks = ${"%.2f".format(school.getStudentAverage("03"))}, Grade = ${school.getStudentGrade("03")}")
}