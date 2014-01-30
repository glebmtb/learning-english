package ru.n5g.learningenglish.view;

import ru.n5g.learningenglish.controller.IrregularVerbsController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author Belyaev
 */
public class IrregularVerbsView extends ExerciseViewAbs {

    protected JLabel rightAnswer1Label;
    protected JLabel rightAnswer2Label;
    protected JLabel rightAnswer3Label;

    protected JTextField inputField1Response;
    protected JTextField inputField2Response;
    protected JTextField inputField3Response;

    protected JLabel intervalWords;
    protected JTextField startWord;
    protected JTextField endWord;

    protected IrregularVerbsController controller;

    public IrregularVerbsView() {
        controller = new IrregularVerbsController(this);
    }

    @Override
    protected void initComponents() {
        super.initComponents();

        frame.setTitle("Диктовка неправильных глаголов");
        commandInfoLabel.setText("Введите три формы неправильного глагола:");
        commandInfoLabel.setBounds(30, 35, 300, 20);

        frame.remove(inputFieldResponse);
        frame.remove(rightAnswerLabel);

        int xPosition = 20;
        int heightLabel = 90;
        int leftMargin = 10;

        inputField1Response = new JTextField();
        inputField1Response.setBounds(xPosition, 100, heightLabel, 20);
        inputField1Response.setVisible(false);
        inputField1Response.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                inputField2Response.grabFocus();
            }
        });

        rightAnswer1Label = new JLabel();
        rightAnswer1Label.setBounds(xPosition, 80, heightLabel, 20);
        rightAnswer1Label.setVisible(false);

        inputField2Response = new JTextField();
        inputField2Response.setBounds(xPosition += heightLabel + leftMargin, 100, heightLabel, 20);
        inputField2Response.setVisible(false);
        inputField2Response.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                inputField3Response.grabFocus();
            }
        });
        inputField2Response.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE && inputField2Response.getText().isEmpty()) {
                    inputField1Response.grabFocus();
                }
            }
        });

        rightAnswer2Label = new JLabel();
        rightAnswer2Label.setBounds(xPosition, 80, heightLabel, 20);
        rightAnswer2Label.setVisible(false);

        inputField3Response = new JTextField();
        inputField3Response.setBounds(xPosition += heightLabel + leftMargin, 100, heightLabel, 20);
        inputField3Response.setVisible(false);
        inputField3Response.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                clickEnterInInputField();
            }
        });
        inputField3Response.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE && inputField3Response.getText().isEmpty()) {
                    inputField2Response.grabFocus();
                }
            }
        });

        rightAnswer3Label = new JLabel();
        rightAnswer3Label.setBounds(xPosition, 80, heightLabel, 20);
        rightAnswer3Label.setVisible(false);

        inputResultLabel.setLocation(xPosition + heightLabel + leftMargin, 98);

        intervalWords = new JLabel("Можно выбрать промежуток слов:");
        intervalWords.setBounds(20, 80, 200, 20);

        startWord = new JTextField("0");
        startWord.setBounds(225, 80, 50, 20);

        endWord = new JTextField();
        endWord.setBounds(275, 80, 50, 20);

        frame.add(rightAnswer1Label);
        frame.add(rightAnswer2Label);
        frame.add(rightAnswer3Label);

        frame.add(inputField1Response);
        frame.add(inputField2Response);
        frame.add(inputField3Response);

        frame.add(intervalWords);
        frame.add(startWord);
        frame.add(endWord);
    }

    @Override
    public void setVisibleLessonPage(boolean isVisible) {
        super.setVisibleLessonPage(isVisible);

        rightAnswer1Label.setVisible(isVisible);
        rightAnswer2Label.setVisible(isVisible);
        rightAnswer3Label.setVisible(isVisible);

        inputField1Response.setVisible(isVisible);
        inputField2Response.setVisible(isVisible);
        inputField3Response.setVisible(isVisible);
    }

    @Override
    public void setVisibleStartPage(boolean isVisible) {
        super.setVisibleStartPage(isVisible);
        intervalWords.setVisible(isVisible);
        startWord.setVisible(isVisible);
        endWord.setVisible(isVisible);
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
        inputField3Response.grabFocus();
        controller.clickEnterInInputField();
    }

    @Override
    protected void clickStart() {
        controller.clickStart();
        grabFocus();
    }

    @Override
    @Deprecated //используете setRightAnswers
    public void setRightAnswer(String rightAnswer) {
        //не требуеться  смтотрите setRightAnswers
    }

    @Deprecated  //используете getEnteredTexts
    public String getEnteredText() {
        //не требуеться смотрите getEnteredTexts
        return "";
    }

    @Override
    public void clearInformantsResultQuestion() {
        super.clearInformantsResultQuestion();

        rightAnswer1Label.setText("");
        rightAnswer2Label.setText("");
        rightAnswer3Label.setText("");

        inputField1Response.setText("");
        inputField2Response.setText("");
        inputField3Response.setText("");

        grabFocus();
    }

    public String[] getEnteredTexts() {
        return new String[]{inputField1Response.getText(), inputField2Response.getText(), inputField3Response.getText()};
    }

    public void setRightAnswers(String rightAnswers[]) {
        rightAnswer1Label.setText(rightAnswers[0]);
        rightAnswer2Label.setText(rightAnswers[1]);
        rightAnswer3Label.setText(rightAnswers[2]);
    }

    @Override
    protected void grabFocus() {
        inputField1Response.grabFocus();
    }

    public void setMaxWord(String maxWord){
        endWord.setText(maxWord);
    }

    public int getStartWord(){
        return Integer.valueOf(startWord.getText());
    }

    public int getEndWord(){
        return Integer.valueOf(endWord.getText());
    }
}
