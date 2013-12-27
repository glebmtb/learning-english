package ru.n5g.learningenglish.view;

import ru.n5g.learningenglish.controller.NumberFrom0ToMoreExerciseController;

/**
 * Gleb Belyaev
 * 12.12.13.
 */
public class NumberFrom0ToMoreExerciseView extends ExerciseViewAbs {
    private NumberFrom0ToMoreExerciseController controller;

    public NumberFrom0ToMoreExerciseView() {
        controller = new NumberFrom0ToMoreExerciseController(this);
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

    @Override
    protected void initComponents() {
        super.initComponents();
        frame.setBounds(400, 400, 550, 210);
        rightAnswerLabel.setFont(rightAnswerLabel.getFont().deriveFont(10f));
        rightAnswerLabel.setBounds(10, 80, 530, 20);
        inputFieldResponse.setBounds(10, 100, 500, 20);
        inputResultLabel.setBounds(510, 98, 24, 24);
    }
}
