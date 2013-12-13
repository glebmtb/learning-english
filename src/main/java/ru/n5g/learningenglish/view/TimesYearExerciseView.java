package ru.n5g.learningenglish.view;

import ru.n5g.learningenglish.controller.TimesYearExerciseController;

/**
 * Gleb Belyaev
 * 13.12.13.
 */
public class TimesYearExerciseView extends ExerciseViewAbs {

    private TimesYearExerciseController controller;

    public TimesYearExerciseView() {
        controller = new TimesYearExerciseController(this);
    }

    @Override
    protected void initComponents() {
        super.initComponents();
        frame.setTitle("Диктовка название времен года");
        commandInfoLabel.setText("Введите название времени года на английском:");
        commandInfoLabel.setBounds(30, 35, 300, 20);
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
