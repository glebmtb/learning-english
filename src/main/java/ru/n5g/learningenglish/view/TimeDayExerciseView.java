package ru.n5g.learningenglish.view;

import ru.n5g.learningenglish.words.TimeDaysWords;

/**
 * Gleb Belyaev
 * 13.12.13.
 */
public class TimeDayExerciseView extends ExerciseViewImpl {

    public TimeDayExerciseView() {
        super(new TimeDaysWords());
    }

    @Override
    protected void initComponents() {
        super.initComponents();
        frame.setTitle("Диктовка время суток");
        commandInfoLabel.setText("Введите название времени суток на английском:");
        commandInfoLabel.setBounds(30, 35, 300, 20);
    }
}
