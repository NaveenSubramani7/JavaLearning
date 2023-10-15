LaunchQuizApp is a java directory which will contain the Quiz Game application.

**About Nature of the Application:**
A player can start the quiz game by entering his name, then the player has to choose the quiz level, it could be either "Beginneer or Advanced". Depends on his selection the category of respective questions will appear, after the player completes the game. He will know about the score of the Quiz.

1. If the player selects the "Beginner Level Quiz", player has to take up 5 questions with the total maximum score of 10.
   a. For each correct answer, he/she will get "+2".
   b. For each wrong answer, he/she will get "-1".
   c. Player can also choose option to skip, he/she will get "0".
2. If the player selects the "Advanced Level Quiz", player has to take up 5 questions with the total maximum score of 25.
   a. For each correct answer, he/she will get "+5".
   b. For each wrong answer, he/she will get "-2".
   c. Player can also choose option to skip, he/she will get "0".


**Developer notes:**
The Application starts with LaunchQuiz.java, then it calls GamePlay.java implementations class where it controls the flow by invoking the Player1.java, BeginnerQuiz.java, AdvancedQuiz.java to flow through the application to play the game.
The BeginnerQuiz and AdvancedQuiz internally extends the QuizDao.java and implements the Play.java interface.

Note: We haven't implemented the exception handling concept yet.
