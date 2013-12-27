package ru.n5g.learningenglish.view;

import ru.n5g.learningenglish.controller.TimeDayExerciseController;

/**
 * Gleb Belyaev
 * 13.12.13.
 */
public class TimeDayExerciseView extends ExerciseViewAbs {
    private TimeDayExerciseController controller;

    public TimeDayExerciseView() {
        controller = new TimeDayExerciseController(this);
    }

    @Override
    protected void initComponents() {
        super.initComponents();
        frame.setTitle("Диктовка время суток");
        commandInfoLabel.setText("Введите название времени суток на английском:");
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
