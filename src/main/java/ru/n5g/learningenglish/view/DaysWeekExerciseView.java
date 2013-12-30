package ru.n5g.learningenglish.view;

import ru.n5g.learningenglish.words.DaysWeeksWords;

/**
 * Gleb Belyaev
 * 13.12.13.
 */
public class DaysWeekExerciseView extends ExerciseViewImpl {

    public DaysWeekExerciseView() {
        super(new DaysWeeksWords());
    }

    @Override
    protected void initComponents() {
        super.initComponents();
        frame.setTitle("Диктовка дней недели");
        commandInfoLabel.setText("Введите название дня недели на английском:");
        commandInfoLabel.setBounds(30, 35, 300, 20);
    }
}
