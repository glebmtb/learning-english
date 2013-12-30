package ru.n5g.learningenglish.view;

import ru.n5g.learningenglish.controller.ExerciseControllerAbsImpl;
import ru.n5g.learningenglish.util.RandomAndTranslate;
import ru.n5g.learningenglish.words.Words;

/**
 * @author Belyaev
 */
public class ExerciseViewImpl extends ExerciseViewAbs {
    protected ExerciseControllerAbsImpl controller;


    public ExerciseViewImpl(Words<String, String> words) {
        controller = new ExerciseControllerAbsImpl(this, words);
    }

    @Override
    protected void clickNext() {
        controller.clickNext();
    }

    @Override
    protected void clickVerify() {
        controller.clickVerify();
    }

    @Override
    protected void clickEnterInInputField() {
        controller.clickEnterInInputField();
    }

    @Override
    protected void clickStart() {
        controller.clickStart();
    }
}
