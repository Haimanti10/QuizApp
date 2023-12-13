package com.example.myquizapp

object Constants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = " correct_answers"
    fun getQuestions():ArrayList<Question>{
        val questionList=ArrayList<Question>()


        val q1=Question(
            1, "Which Food item is this?", R.drawable.burger,"Pizza","Burger","Chowmin","Pasta",2)
        questionList.add(q1)

        val q2=Question(
            2, "Which Food item is this?", R.drawable.biriyani,"Biriyani","Fried Rice","Chowmin","Dal makhni",1)
        questionList.add(q2)


        val q3=Question(
            3, "Which Food item is this?", R.drawable.dosa,"Pizza","Plain Dosa","Chhole Bhature","Masala Dosa",4)
        questionList.add(q3)


        val q4=Question(
            4, "Which Food item is this?", R.drawable.chowmin,"Pizza","Burger","Chowmin","Pasta",3)
        questionList.add(q4)


        val q5=Question(
            5, "Which Food item is this?", R.drawable.golgappa,"Pav Bhaji","Golgappa","Chowmin","Chhole bhature",2)
        questionList.add(q5)

        val q6=Question(
            6, "Which Food item is this?", R.drawable.samosa,"Pizza","samosa","Chowmin","Pasta",2)
        questionList.add(q6)


        val q7=Question(
            7, "Which Food item is this?", R.drawable.momos,"Momos","Burger","Chowmin","Pasta",1)
        questionList.add(q7)


        val q8=Question(
            1, "Which Food item is this?", R.drawable.pizza,"Pizza","Burger","Chowmin","Pasta",1)
        questionList.add(q8)

        val q9=Question(
            1, "Which Food item is this?", R.drawable.purisabji,"Pizza","Puri Sabji","Chowmin","Pasta",2)
        questionList.add(q9)


      
        return questionList
    }
}