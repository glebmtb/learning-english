package ru.n5g.learningenglish.controller;

import ru.n5g.learningenglish.view.ExerciseView;

/**
 * @author Gleb Belyaev
 */
public abstract class ExerciseControllerAbs<WordRusType, WordEngType> {
    protected ExerciseView view;

    protected Integer currentQuestion;
    protected Integer totalQuestions;
    protected Integer trueQuestions;
    protected boolean isEnteredAnswer;


    protected ExerciseControllerAbs(ExerciseView view) {
        this.view = view;
    }

    public void clickStart() {
        view.setVisibleStartPage(false);
        view.setVisibleLessonPage(true);

        currentQuestion = 0;
        totalQuestions = getTotalQuestions();
        trueQuestions = 0;
        view.setTrueQuestions("0");
        nextQuestion();
    }

    protected abstract Integer getTotalQuestions();

    public void clickNext() {
        if (currentQuestion.equals(totalQuestions)) {
            view.setResultTest("правельных ответов: " + trueQuestions + " из: " + totalQuestions);
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
        view.setCounterRepetition(currentQuestion + "/" + totalQuestions);
        view.setPassedQuestions(String.valueOf(currentQuestion - 1));
        view.setTrueQuestions(trueQuestions.toString());
        view.setTextForInput(getNewQuestion());
        isEnteredAnswer = false;
    }

    public void clickVerify() {
        if (isEnteredAnswer) {
            return;
        }
        String enteredWord = view.getEnteredText();
        if (enteredWord != null && !enteredWord.isEmpty()) {
            enteredWord = enteredWord.trim().toLowerCase();
        }
        String rightWord = getRightAnswer().toLowerCase();
        boolean isRight = rightWord.equals(enteredWord);
        view.setResultQuestion(isRight);
        if (isRight) {
            trueQuestions++;
        } else {
            view.setRightAnswer(rightWord);
        }

        isEnteredAnswer = true;
    }

    protected abstract String getRightAnswer();

    protected abstract String getNewQuestion();
}
