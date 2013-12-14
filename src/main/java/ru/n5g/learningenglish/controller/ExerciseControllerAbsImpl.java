package ru.n5g.learningenglish.controller;

import ru.n5g.learningenglish.Settings;
import ru.n5g.learningenglish.util.RandomAndTranslate;
import ru.n5g.learningenglish.view.ExerciseView;

/**
 * @author Belyaev
 */
public class ExerciseControllerAbsImpl extends ExerciseControllerAbs {
    private RandomAndTranslate adverbsOfFrequency;
    private String word;

    public ExerciseControllerAbsImpl(ExerciseView view, RandomAndTranslate adverbsOfFrequency) {
        super(view);
        this.adverbsOfFrequency = adverbsOfFrequency;
    }

    @Override
    protected Integer getTotalQuestions() {
        return Settings.numberRepetitionsAdverbsOfFrequency;
    }

    @Override
    protected String getRightAnswer() {
        String translate = adverbsOfFrequency.translate(word);
        return translate;
    }

    @Override
    protected String getNewQuestion() {
        word = adverbsOfFrequency.getRandom();
        return word;
    }
}
