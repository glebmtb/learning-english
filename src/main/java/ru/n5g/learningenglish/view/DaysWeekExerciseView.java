package ru.n5g.learningenglish.view;

import ru.n5g.learningenglish.controller.DaysWeekExerciseController;

/**
 * Gleb Belyaev
 * 13.12.13.
 */
public class DaysWeekExerciseView extends ExerciseViewAbs{
    private DaysWeekExerciseController controller;

    public DaysWeekExerciseView() {
        controller = new DaysWeekExerciseController(this);
    }

    @Override
    protected void initComponents() {
        super.initComponents();
        frame.setTitle("Диктовка дней недели");
        commandInfoLabel.setText("Введите название дня недели на английском:");
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
