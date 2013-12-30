package ru.n5g.learningenglish.view;


import ru.n5g.learningenglish.words.MonthsWords;

/**
 * Gleb Belyaev
 * 13.12.13.
 */
public class MonthExerciseView extends ExerciseViewImpl {

    public MonthExerciseView() {
        super(new MonthsWords());
    }

    @Override
    protected void initComponents() {
        super.initComponents();
        frame.setTitle("Диктовка название месяца");
        commandInfoLabel.setText("Введите название месяца на английском:");
    }
}
