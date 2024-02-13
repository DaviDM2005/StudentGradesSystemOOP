class Student(
    val name: String,
    val id: Int,
    val grades: List<Int>)
{


    fun avgGrade(): Double {
        if (grades.isEmpty()) {
            return 0.0
        }
        return grades.sum() / grades.size.toDouble()
    }

    fun hasPassed(passingGrade: Int = 60): Boolean {
        return grades.all { it >= passingGrade }
    }


}




fun main(){


    while (true){

        print("Enter your name: ")
        val name = readln().capitalize()

        print("Enter your id: ")
        val userid = readln().toInt()

        print("How many subjects do you study? ")
        val n = readln().toInt()

        val grades = mutableListOf<Int>()

        for (i in 1..n) {
            print("Enter grade for subject $i: ")
            val grade = readln().toInt()
            grades.add(grade)
        }


        val student = Student(name, userid, grades)

        println("Average grade: ${student.avgGrade()}")
        println("Has passed all subjects: ${student.hasPassed()}")

    }



}