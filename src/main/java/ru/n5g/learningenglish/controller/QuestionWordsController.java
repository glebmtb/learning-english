package ru.n5g.learningenglish.controller;

import ru.n5g.learningenglish.util.PlayerMpr3;
import ru.n5g.learningenglish.util.RandomAndTranslate;
import ru.n5g.learningenglish.view.ExerciseView;

/**
 * @author Belyaev
 */
public class QuestionWordsController extends ExerciseControllerAbsImpl {


    public QuestionWordsController(ExerciseView view, RandomAndTranslate adverbsOfFrequency) {
        super(view, adverbsOfFrequency);
    }

    @Override
    protected String getRightAnswer() {
        String rightAnswer = super.getRightAnswer();
        PlayerMpr3.play("questionwords/" + rightAnswer);
        return rightAnswer;
    }
}
