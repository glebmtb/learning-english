package ru.n5g.learningenglish.controller;

import ru.n5g.learningenglish.view.ExerciseView;

/**
 * @author Gleb Belyaev
 */
public abstract class ExerciseControllerAbs<WordRusType, WordEngType> {
    protected ExerciseView view;

    protected Integer currentQuestion;
    protected Integer trueQuestions;
    protected boolean isEnteredAnswer;


    protected ExerciseControllerAbs(ExerciseView view) {
        this.view = view;
    }

    public void clickStart() {
        view.setVisibleStartPage(false);
        view.setVisibleLessonPage(true);

        currentQuestion = 0;
        trueQuestions = 0;
        view.setTrueQuestions("0");
        nextQuestion();
    }

    protected abstract Integer getTotalQuestions();

    public void clickNext() {
        if (isFinish()) {
            view.setResultTest("правельных ответов: " + trueQuestions + " из: " + getTotalQuestions());
            view.setVisibleStartPage(true);
            view.setVisibleLessonPage(false);
            return;
        }
        nextQuestion();
    }

    public void clickEnterInInputField() {
        if (isEnteredAnswer) {
            clickNext();
        } else {
            clickVerify();
        }
    }

    protected void nextQuestion() {
        currentQuestion++;
        view.clearInformantsResultQuestion();
        view.setCounterRepetition(currentQuestion + "/" + getTotalQuestions());
        view.setPassedQuestions(String.valueOf(currentQuestion - 1));
        view.setTrueQuestions(trueQuestions.toString());
        view.setTextForInput(getNewQuestion());
        isEnteredAnswer = false;
    }

    public void clickVerify() {
        if (isEnteredAnswer) {
            return;
        }

        boolean isRight = isRightAnswer();
        view.setResultQuestion(isRight);
        if (isRight) {
            correctAnswer();
        } else {
            wrongAnswer();
        }

        playWord();
        isEnteredAnswer = true;
    }

    protected void playWord() {

    }

    private boolean isRightAnswer() {
        String enteredWord = view.getEnteredText();
        if (enteredWord != null && !enteredWord.isEmpty()) {
            enteredWord = enteredWord.trim().toLowerCase();
        }
        String rightWord = getRightAnswer().toLowerCase();
        rightWord.equals(enteredWord);
        return rightWord.equals(enteredWord);
    }

    protected void wrongAnswer() {
        view.setRightAnswer(getRightAnswer());
    }

    protected void correctAnswer() {
        trueQuestions++;
    }

    protected abstract String getRightAnswer();

    protected abstract String getNewQuestion();

    protected boolean isFinish() {
        return currentQuestion.equals(getTotalQuestions());
    }
}
