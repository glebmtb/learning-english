package ru.n5g.learningenglish.controller;

import ru.n5g.learningenglish.util.Mp3Player;
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
        Mp3Player.play("questionwords/" + rightAnswer);
        return rightAnswer;
    }
}
