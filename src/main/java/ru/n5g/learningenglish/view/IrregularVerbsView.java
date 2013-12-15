package ru.n5g.learningenglish.view;

import javax.swing.*;

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


    @Override
    protected void initComponents() {
        super.initComponents();

        frame.setTitle("Диктовка неправельных глаголов");
        commandInfoLabel.setText("Введите три формы неправельного глагола:");
        commandInfoLabel.setBounds(30, 35, 300, 20);

        frame.remove(inputFieldResponse);
        frame.remove(rightAnswerLabel);

        int xPosition = 20;
        int heightLabel = 90;
        int leftMargin = 10;

        inputField1Response = new JTextField();
        inputField1Response.setBounds(xPosition, 100, heightLabel, 20);
        inputField1Response.setVisible(false);

        rightAnswer1Label = new JLabel();
        rightAnswer1Label.setBounds(xPosition, 80, heightLabel, 20);
        rightAnswer1Label.setVisible(false);

        inputField2Response = new JTextField();
        inputField2Response.setBounds(xPosition += heightLabel + leftMargin, 100, heightLabel, 20);
        inputField2Response.setVisible(false);

        rightAnswer2Label = new JLabel();
        rightAnswer2Label.setBounds(xPosition, 80, heightLabel, 20);
        rightAnswer2Label.setVisible(false);

        inputField3Response = new JTextField();
        inputField3Response.setBounds(xPosition += heightLabel + leftMargin, 100, heightLabel, 20);
        inputField3Response.setVisible(false);

        rightAnswer3Label = new JLabel();
        rightAnswer3Label.setBounds(xPosition, 80, heightLabel, 20);
        rightAnswer3Label.setVisible(false);

        inputResultLabel.setLocation(xPosition + heightLabel + leftMargin, 98);

        frame.add(rightAnswer1Label);
        frame.add(rightAnswer2Label);
        frame.add(rightAnswer3Label);

        frame.add(inputField1Response);
        frame.add(inputField2Response);
        frame.add(inputField3Response);
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

        if (isVisible)
            inputField1Response.grabFocus();
    }

    @Override
    protected void clickNext() {
        //TODO: implement this method
        inputField1Response.grabFocus();
    }

    @Override
    protected void clickVerify() {
        //TODO: implement this method
        inputField1Response.grabFocus();
    }

    @Override
    protected void clickEnterInInputField() {
        //TODO: implement this method
        inputField1Response.grabFocus();
    }

    @Override
    protected void clickStart() {
        setVisibleStartPage(false);
        setVisibleLessonPage(true);
        setResultQuestion(true);
        setRightAnswers(new String[]{"saw", "saw", "saw"});
    }

    @Override
    public void setRightAnswer(String rightAnswer) {

    }

    public void setRightAnswers(String rightAnswers[]) {
        rightAnswer1Label.setText(rightAnswers[0]);
        rightAnswer2Label.setText(rightAnswers[1]);
        rightAnswer3Label.setText(rightAnswers[2]);
    }
}
