package ru.n5g.learningenglish.view;

import ru.n5g.learningenglish.controller.NumeralExerciseController;

/**
 * Gleb Belyaev
 * 13.12.13.
 */
public class NumeralExerciseView extends ExerciseViewAbs {
    private NumeralExerciseController controller;

    public NumeralExerciseView() {
        controller = new NumeralExerciseController(this);
    }

    @Override
    protected void initComponents() {
        super.initComponents();
        frame.setTitle("Диктовка числительных");
        commandInfoLabel.setText("Введите числительное на английском:");
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
