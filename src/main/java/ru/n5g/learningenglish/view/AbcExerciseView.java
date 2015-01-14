package ru.n5g.learningenglish.view;

import ru.n5g.learningenglish.controller.AbcExerciseController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;

/**
 * Диктовка алфавита
 * Belyaev Gleb
 * 11.12.13.
 */
public class AbcExerciseView implements ExerciseView {
    private AbcExerciseController controller;

    private JButton startButton;
    private JLabel resultTestTextLabel;


    private JLabel progressLabel;
    private JLabel countRightAnswerLabel;
    private JLabel enteringLetterTextStartLabel;
    private JTextField enteringLetterText;
    private JLabel rightAnswerLabel;
    private JLabel inputResultLabel;

    private JButton replaceButton;
    private JButton nextButton;


    public AbcExerciseView() {
        this.controller = new AbcExerciseController(this);
        initComponents();
    }

    /**
     * Портатип страницы
     * http://joxi.ru/qymoUv3JTJC-IcBiTYw
     */
    private void initComponents() {
        startButton = new JButton("Начать");
        startButton.setBounds(70, 20, 200, 40);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickStart();
            }
        });
        startButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    controller.clickStart();
                }
            }
        });

        resultTestTextLabel = new JLabel();
        resultTestTextLabel.setBounds(25, 80, 320, 20);
        resultTestTextLabel.setVisible(false);

        progressLabel = new JLabel();
        progressLabel.setBounds(20, 5, 100, 20);
        progressLabel.setVisible(false);

        countRightAnswerLabel = new JLabel();
        countRightAnswerLabel.setBounds(120, 5, 180, 20);
        countRightAnswerLabel.setVisible(false);

        enteringLetterTextStartLabel = new JLabel("Введите букву которая прозвучала:");
        enteringLetterTextStartLabel.setBounds(25, 45, 235, 20);
        enteringLetterTextStartLabel.setVisible(false);

        enteringLetterText = new JTextField();
        enteringLetterText.setBounds(240, 45, 20, 20);
        enteringLetterText.setVisible(false);
        enteringLetterText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                controller.clickNext();
            }
        });
        enteringLetterText.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent keyEvent) {
                controller.enteredSymbol();
            }
        });

        rightAnswerLabel = new JLabel();
        rightAnswerLabel.setBounds(265, 45, 20, 20);
        rightAnswerLabel.setVisible(false);

        inputResultLabel = new JLabel();
        inputResultLabel.setBounds(295, 42, 24, 24);
        inputResultLabel.setVisible(false);

        replaceButton = new JButton("Повторить");
        replaceButton.setBounds(20, 80, 110, 25);
        replaceButton.setVisible(false);
        replaceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                controller.clickReplace();
                enteringLetterText.grabFocus();
            }
        });

        nextButton = new JButton("Следующая буква");
        nextButton.setBounds(150, 80, 180, 25);
        nextButton.setVisible(false);
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                controller.clickNext();
                enteringLetterText.grabFocus();
            }
        });

        JFrame frame = new JFrame("Диктовка английского алфовита");
        frame.setBounds(400, 400, 350, 150);
        frame.setLayout(null);

        frame.add(startButton);
        frame.add(resultTestTextLabel);
        frame.add(progressLabel);
        frame.add(countRightAnswerLabel);
        frame.add(enteringLetterTextStartLabel);
        frame.add(enteringLetterText);
        frame.add(rightAnswerLabel);
        frame.add(inputResultLabel);
        frame.add(replaceButton);
        frame.add(nextButton);

        frame.setVisible(true);
    }

    @Override
    public void setVisibleStartPage(boolean isVisible) {
        startButton.setVisible(isVisible);
        resultTestTextLabel.setVisible(isVisible);
        if (isVisible)
            startButton.grabFocus();
    }

    @Override
    public void setVisibleLessonPage(boolean isVisible) {
        progressLabel.setVisible(isVisible);
        countRightAnswerLabel.setVisible(isVisible);
        enteringLetterTextStartLabel.setVisible(isVisible);
        enteringLetterText.setVisible(isVisible);
        rightAnswerLabel.setVisible(isVisible);
        inputResultLabel.setVisible(isVisible);
        replaceButton.setVisible(isVisible);
        nextButton.setVisible(isVisible);

        if (isVisible)
            enteringLetterText.grabFocus();
    }

    @Override
    public void setCounterRepetition(String counterRepetition) {    }

    @Override
    public void setCounterRepetition(Integer currentQuestion, Integer countQuestions) {
        progressLabel.setText("Прогресс: " + currentQuestion + "/" + countQuestions);
    }

    @Override
    public void setTrueQuestions(String correctAnswers) {
    }

    @Override
    public void setPassedQuestions(String passedQuestions) {

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
        inputResultLabel.setIcon(null);
        enteringLetterText.setText("");
    }

    @Override
    public String getEnteredText() {
        String word = enteringLetterText.getText();
        String symbol = "none";
        if (word != null && !word.isEmpty()) {
            symbol = String.valueOf(word.charAt(0)).toUpperCase();
        }
        return symbol;
    }

    @Override
    public void setRightAnswer(String rightAnswer) {
        rightAnswerLabel.setText(rightAnswer);
    }

    @Override
    public void setResultTest(String resultTest) {

    }

    @Override
    public void setResultTest(Integer rightAnswers, Integer countQuestions) {
        resultTestTextLabel.setText("Ваше результат: правильных ответов " + rightAnswers + " из " + countQuestions);
    }

    @Override
    public void setTextForInput(String textForInput) {

    }

    @Override
    public void setCountRightAnswer(Integer rightAnswers, Integer countQuestions){
        countRightAnswerLabel.setText("Правильных ответов " + rightAnswers + " из " + countQuestions);
    }
}
