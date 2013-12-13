package ru.n5g.learningenglish.view;

import ru.n5g.learningenglish.controller.StartController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Belyaev Gleb 11.12.13.
 */
public class StartViewImpl implements StartView {
    private final static int WIDTH_WINDOW = 305;
    private final static int HEIGHT_WINDOW = 645;
    private StartController controller;

    public StartViewImpl() throws HeadlessException {
        controller = new StartController(this);
        initComponents();
    }

    //TODO добавить неправельные глаголы
    private void initComponents() {
        int yPosition = 0;
        int leftMargin = 10;
        int topMargin = 5;
        int widthButton = 272;
        int heightButton = 35;

        JButton allExercises = new JButton("Все упражнения по очереди");
        allExercises.setBounds(leftMargin, yPosition += 10, widthButton, heightButton);
        allExercises.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickAllExercises();
            }
        });
        allExercises.setEnabled(false); //TODO

        JButton abcExercise = new JButton("Алфавит");
        abcExercise.setBounds(leftMargin, yPosition += heightButton + topMargin + 20, widthButton, heightButton);
        abcExercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickAbcExercise();
            }
        });

        JButton numberFrom1To10Exercise = new JButton("Числа N0-20");
        numberFrom1To10Exercise.setBounds(leftMargin, yPosition += heightButton + topMargin, widthButton, heightButton);
        numberFrom1To10Exercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickNumberFrom1To10Exercise();
            }
        });

        JButton numberFrom1To1999999999Exercise = new JButton("Числа N0-1,999,999,999");
        numberFrom1To1999999999Exercise.setBounds(leftMargin, yPosition += heightButton + topMargin, widthButton, heightButton);
        numberFrom1To1999999999Exercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickNumberFrom1To1999999999Exercise();
            }
        });

        JButton numberFrom1stTo31thExercise = new JButton("Числительные N1st-31th");
        numberFrom1stTo31thExercise.setBounds(leftMargin, yPosition += heightButton + topMargin, widthButton, heightButton);
        numberFrom1stTo31thExercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickNumberFrom1stTo31thExercise();
            }
        });
        numberFrom1stTo31thExercise.setEnabled(false); //TODO

        JButton clockExercise = new JButton("Время");
        clockExercise.setBounds(leftMargin, yPosition += heightButton + topMargin, widthButton, heightButton);
        clockExercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickClockExercise();
            }
        });
        clockExercise.setEnabled(false); //TODO

        JButton daysWeekExercise = new JButton("Дни недели");
        daysWeekExercise.setBounds(leftMargin, yPosition += heightButton + topMargin, widthButton, heightButton);
        daysWeekExercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickDaysWeekExercise();
            }
        });

        JButton monthExercise = new JButton("Месяца");
        monthExercise.setBounds(leftMargin, yPosition += heightButton + topMargin, widthButton, heightButton);
        monthExercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickMonthExercise();
            }
        });

        JButton timesYearExercise = new JButton("Времена года");
        timesYearExercise.setBounds(leftMargin, yPosition += heightButton + topMargin, widthButton, heightButton);
        timesYearExercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickTimesYearExercise();
            }
        });

        JButton yearExercise = new JButton("Года");
        yearExercise.setBounds(leftMargin, yPosition += heightButton + topMargin, widthButton, heightButton);
        yearExercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickYearExercise();
            }
        });
        yearExercise.setEnabled(false); //TODO

        JButton irregularVerbsExercise = new JButton("Неправельные глаголы");
        irregularVerbsExercise.setBounds(leftMargin, yPosition += heightButton + topMargin, widthButton, heightButton);
        irregularVerbsExercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickIrregularVerbsExercise();
            }
        });
        irregularVerbsExercise.setEnabled(false); //TODO

        JButton result = new JButton("Результаты");
        result.setBounds(leftMargin, yPosition += heightButton + topMargin + 20, 130, heightButton);
        result.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickResult();
            }
        });
        result.setEnabled(false); //TODO

        JButton settings = new JButton("Настройки");
        settings.setBounds(136 + leftMargin + 6, yPosition, 130, heightButton);
        settings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickSettings();
            }
        });
        settings.setEnabled(false); //TODO

        JFrame mainFrame = new JFrame("Изучение английского");
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setBounds(400, 200, WIDTH_WINDOW, yPosition + heightButton + topMargin + 40);
        mainFrame.setLayout(null);

        mainFrame.add(allExercises);
        mainFrame.add(abcExercise);
        mainFrame.add(numberFrom1To10Exercise);
        mainFrame.add(numberFrom1To1999999999Exercise);
        mainFrame.add(numberFrom1stTo31thExercise);
        mainFrame.add(clockExercise);
        mainFrame.add(daysWeekExercise);
        mainFrame.add(monthExercise);
        mainFrame.add(timesYearExercise);
        mainFrame.add(yearExercise);
        mainFrame.add(irregularVerbsExercise);
        mainFrame.add(result);
        mainFrame.add(settings);

        mainFrame.setVisible(true);
    }

}
