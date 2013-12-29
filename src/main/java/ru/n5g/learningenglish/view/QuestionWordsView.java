package ru.n5g.learningenglish.view;

import ru.n5g.learningenglish.controller.QuestionWordsController;
import ru.n5g.learningenglish.util.QuestionWords;

/**
 * @author Belyaev
 */
public class QuestionWordsView extends ExerciseViewImpl {

    public QuestionWordsView() {
        super(new QuestionWords());
        controller =  new QuestionWordsController(this, new QuestionWords());
    }

    @Override
    protected void initComponents() {
        super.initComponents();
        frame.setTitle("Диктовка вопросительных слов");
        commandInfoLabel.setText("Введите вопросительное слово на английском:");
        commandInfoLabel.setBounds(30, 35, 300, 20);
    }
}
