package ru.n5g.learningenglish.controller;

import ru.n5g.learningenglish.service.IrregularVerbsService;
import ru.n5g.learningenglish.service.Lesson;
import ru.n5g.learningenglish.util.Mp3Player;
import ru.n5g.learningenglish.view.IrregularVerbsView;

/**
 * Неправильные глаголы
 */
public class IrregularVerbsController extends ExerciseControllerAbs {
    protected IrregularVerbsView view;
    private IrregularVerbsService service;
    private Lesson lesson;

    public IrregularVerbsController(IrregularVerbsView view) {
        super(view);
        this.view = view;
        this.service = new IrregularVerbsService();
        view.setMaxWord(service.sizeDictionary());
    }

    @Override
    public void clickStart() {
        lesson = service.start(view.getStartWord(), view.getEndWord());
        super.clickStart();
    }

    public void clickVerify() {
        if (isEnteredAnswer) {
            return;
        }

        String[] enteredWords = view.getEnteredTexts();
        if (enteredWords[0] != null && !enteredWords[0].isEmpty()) {
            enteredWords[0] = enteredWords[0].trim().toLowerCase();
        }
        if (enteredWords[1] != null && !enteredWords[1].isEmpty()) {
            enteredWords[1] = enteredWords[1].trim().toLowerCase();
        }
        if (enteredWords[2] != null && !enteredWords[2].isEmpty()) {
            enteredWords[2] = enteredWords[2].trim().toLowerCase();
        }

        boolean isRight = lesson.checkAnswer(enteredWords[0], enteredWords[1], enteredWords[2]);

        view.setResultQuestion(isRight);
        if (isRight) {
            trueQuestions++;
        } else {
            view.setRightAnswers(lesson.getAnswer());
            wrongAnswer();
        }

        Mp3Player.play("irregularverbs/" + lesson.geInfinitiveWord());
        isEnteredAnswer = true;
    }

    @Override
    protected Integer getTotalQuestions() {
        return currentQuestion;
    }

    @Override
    protected void nextQuestion() {
        lesson.nextQuestion();
        super.nextQuestion();
        view.setCounterRepetition(lesson.wordsLearned() + "/" + lesson.countWordsOnLesson());
    }

    @Override
    protected String getRightAnswer() {
        return null;  //не требуеться
    }

    @Override
    protected String getNewQuestion() {
        return lesson.translateWord();
    }

    @Override
    protected boolean isFinish() {
        return lesson.isFinished();
    }
}
