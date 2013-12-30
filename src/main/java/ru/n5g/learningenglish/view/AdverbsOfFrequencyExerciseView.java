package ru.n5g.learningenglish.view;

import ru.n5g.learningenglish.words.AdverbsOfFrequencyWords;

/**
 * @author Belyaev
 */
public class AdverbsOfFrequencyExerciseView extends ExerciseViewImpl {

    public AdverbsOfFrequencyExerciseView() {
        super(new AdverbsOfFrequencyWords());
    }

    @Override
    protected void initComponents() {
        super.initComponents();
        frame.setTitle("Диктовка наречий частотности");
        commandInfoLabel.setText("Введите наречия частотности на английском:");
        commandInfoLabel.setBounds(30, 35, 300, 20);
    }
}
