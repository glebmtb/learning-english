package ru.n5g.learningenglish.controller;

import ru.n5g.learningenglish.view.AbcExerciseView;

/**
 * Belyaev Gleb
 * 11.12.13.
 */
public class AbcExerciseController {
    private AbcExerciseView view;

    public AbcExerciseController(AbcExerciseView view) {
        this.view = view;
    }

    public void clickStart() {
        view.setVisibleButtonStart(false);
    }
}
