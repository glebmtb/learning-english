package ru.n5g.learningenglish.view;

import ru.n5g.learningenglish.util.JLabelUtilKt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;

import static ru.n5g.learningenglish.util.JLabelUtilKt.newLabel;
import static ru.n5g.learningenglish.util.JLabelUtilKt.newLabelFollow;

/**
 * @author Belyaev
 */
public abstract class ExerciseViewAbs implements ExerciseView {

    protected JButton startButton;
    protected JLabel resultTestTextLabel;
    protected JLabel resultTestLabel;

    protected JLabel counterRepetitionLabel;
    protected JLabel correctAnswersTextStartLabel;
    protected JLabel correctAnswersLabel;
    protected JLabel correctAnswersTextFromLabel;
    protected JLabel passedQuestionsLabel;

    protected JLabel commandInfoLabel;
    protected JLabel textForInputLabel;
    protected JLabel rightAnswerLabel;
    protected JTextField inputFieldResponse;
    protected JLabel inputResultLabel;

    protected JButton verifyButton;
    protected JButton nextButton;

    protected JFrame frame;

    public ExerciseViewAbs() {
        initComponents();
    }

    /**
     * Протатип
     * http://joxi.ru/TaypUv3JTJDAIVQRmQs
     */
    protected void initComponents() {
        startButton = new JButton("Начать");
        startButton.setBounds(75, 30, 200, 40);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickStart();
            }
        });
        startButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    clickStart();
                }
            }
        });

        resultTestTextLabel = new JLabel("Ваше результат:");
        resultTestTextLabel.setBounds(30, 125, 110, 20);
        resultTestTextLabel.setVisible(false);

        resultTestLabel = new JLabel();
        resultTestLabel.setBounds(140, 125, 200, 20);
        resultTestLabel.setVisible(false);

        counterRepetitionLabel = new JLabel();
        counterRepetitionLabel.setBounds(20, 15, 40, 20);
        counterRepetitionLabel.setVisible(false);

        correctAnswersTextStartLabel = newLabel("Правильных ответов:", 120, 15, false);
        correctAnswersLabel = newLabelFollow(correctAnswersTextStartLabel, "", false, 2);
        correctAnswersTextFromLabel = newLabelFollow(correctAnswersLabel, "из:", false);
        passedQuestionsLabel = newLabelFollow(correctAnswersTextFromLabel, "", false, 2);

        commandInfoLabel = new JLabel("Введите цифру на английском языке:");
        commandInfoLabel.setBounds(30, 35, 250, 20);
        commandInfoLabel.setVisible(false);

        textForInputLabel = new JLabel();
        textForInputLabel.setBounds(30, 55, 250, 20);
        textForInputLabel.setVisible(false);

        rightAnswerLabel = new JLabel();
        rightAnswerLabel.setBounds(30, 80, 250, 20);
        rightAnswerLabel.setVisible(false);

        inputFieldResponse = new JTextField();
        inputFieldResponse.setBounds(30, 100, 250, 20);
        inputFieldResponse.setVisible(false);
        inputFieldResponse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                clickEnterInInputField();
            }
        });

        inputResultLabel = new JLabel();
        inputResultLabel.setBounds(295, 98, 24, 24);
        inputResultLabel.setVisible(false);

        verifyButton = new JButton("Проверить");
        verifyButton.setBounds(20, 135, 110, 25);
        verifyButton.setVisible(false);
        verifyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickVerify();
                grabFocus();
            }
        });

        nextButton = new JButton("Дальше");
        nextButton.setBounds(150, 135, 180, 25);
        nextButton.setVisible(false);
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickNext();
                grabFocus();
            }
        });

        frame = new JFrame("Диктовка цифр");
        frame.setBounds(400, 400, 360, 210);
        frame.setLayout(null);

        frame.add(startButton);
        frame.add(resultTestTextLabel);
        frame.add(resultTestLabel);
        frame.add(counterRepetitionLabel);
        frame.add(correctAnswersTextStartLabel);
        frame.add(correctAnswersLabel);
        frame.add(correctAnswersTextFromLabel);
        frame.add(passedQuestionsLabel);
        frame.add(commandInfoLabel);
        frame.add(rightAnswerLabel);
        frame.add(textForInputLabel);
        frame.add(inputFieldResponse);
        frame.add(inputResultLabel);
        frame.add(verifyButton);
        frame.add(nextButton);

        frame.setVisible(true);
    }

    protected abstract void clickNext();

    protected abstract void clickVerify();

    protected abstract void clickEnterInInputField();

    protected abstract void clickStart();

    @Override
    public void setVisibleStartPage(boolean isVisible) {
        startButton.setVisible(isVisible);
        resultTestTextLabel.setVisible(isVisible);
        resultTestLabel.setVisible(isVisible);
        if (isVisible)
            startButton.grabFocus();
    }

    @Override
    public void setVisibleLessonPage(boolean isVisible) {
        counterRepetitionLabel.setVisible(isVisible);
        correctAnswersTextStartLabel.setVisible(isVisible);
        correctAnswersLabel.setVisible(isVisible);
        correctAnswersTextFromLabel.setVisible(isVisible);
        passedQuestionsLabel.setVisible(isVisible);
        commandInfoLabel.setVisible(isVisible);
        rightAnswerLabel.setVisible(isVisible);
        textForInputLabel.setVisible(isVisible);
        inputFieldResponse.setVisible(isVisible);
        inputResultLabel.setVisible(isVisible);
        verifyButton.setVisible(isVisible);
        nextButton.setVisible(isVisible);
        if (isVisible)
            grabFocus();
    }

    @Override
    public void setCounterRepetition(String counterRepetition) {
        counterRepetitionLabel.setText(counterRepetition);
    }

    @Override
    public void setTrueQuestions(String correctAnswers) {
        correctAnswersLabel.setText(correctAnswers);
    }

    @Override
    public void setPassedQuestions(String passedQuestions) {
        passedQuestionsLabel.setText(passedQuestions);
        resizeCounter();
    }

    private void resizeCounter() {
        correctAnswersLabel.setSize(correctAnswersLabel.getPreferredSize());
        passedQuestionsLabel.setSize(passedQuestionsLabel.getPreferredSize());

        JLabelUtilKt.locationFollow(correctAnswersTextFromLabel, correctAnswersLabel);
        JLabelUtilKt.locationFollow(passedQuestionsLabel, correctAnswersTextFromLabel, 2);
    }

    @Override
    public void setResultQuestion(boolean isSuccessfully) {
        String packageIco = "/ru/n5g/learningenglish/ico/";
        URL iconFile;
        if (isSuccessfully) {
            iconFile = getClass().getResource(packageIco + "yes.png");
        } else {
            iconFile = getClass().getResource(packageIco + "no.png");
        }
        Icon inputResultIcon;
        inputResultIcon = new ImageIcon(iconFile);
        inputResultLabel.setIcon(inputResultIcon);
    }

    @Override
    public void clearInformantsResultQuestion() {
        inputFieldResponse.setText("");
        rightAnswerLabel.setText("");
        inputResultLabel.setIcon(null);
    }

    @Override
    public String getEnteredText() {
        return inputFieldResponse.getText();
    }

    @Override
    public void setTextForInput(String textForInput) {
        textForInputLabel.setText(textForInput);
    }

    @Override
    public void setRightAnswer(String rightAnswer) {
        rightAnswerLabel.setText(rightAnswer);
    }

    @Override
    public void setResultTest(String resultTest) {
        resultTestLabel.setText(resultTest);
    }

    protected void grabFocus() {
        inputFieldResponse.grabFocus();
    }

    @Override
    public void setResultTest(Integer rightAnswers, Integer countQuestions) {

    }

    @Override
    public void setCounterRepetition(Integer currentQuestion, Integer countQuestions) {

    }

    @Override
    public void setCountRightAnswer(Integer rightAnswers, Integer countQuestions) {

    }
}
