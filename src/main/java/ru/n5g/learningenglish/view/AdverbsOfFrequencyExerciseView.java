package ru.n5g.learningenglish.view;

import ru.n5g.learningenglish.util.AdverbsOfFrequency;

/**
 * @author Belyaev
 */
public class AdverbsOfFrequencyExerciseView extends ExerciseViewImpl {

    public AdverbsOfFrequencyExerciseView() {
        super(new AdverbsOfFrequency());
    }

    @Override
    protected void initComponents() {
        super.initComponents();
        frame.setTitle("Диктовка наречий частотности");
        commandInfoLabel.setText("Введите наречия частотности на английском:");
        commandInfoLabel.setBounds(30, 35, 300, 20);
    }
}
