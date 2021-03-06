package ru.n5g.learningenglish.view;

import ru.n5g.learningenglish.words.QuestionWords;

/**
 * @author Belyaev
 */
public class QuestionWordsView extends ExerciseViewImpl {

    public QuestionWordsView() {
        super(new QuestionWords());
    }

    @Override
    protected void initComponents() {
        super.initComponents();
        frame.setTitle("Диктовка вопросительных слов");
        commandInfoLabel.setText("Введите вопросительное слово на английском:");
        commandInfoLabel.setBounds(30, 35, 300, 20);
    }
}
