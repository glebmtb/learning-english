package ru.n5g.learningenglish.view;

import ru.n5g.learningenglish.controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Belyaev Gleb 11.12.13.
 */
public class StartViewImpl implements StartView{
    private final static int WIDTH_WINDOW = 300;
    private final static int HEIGHT_WINDOW = 590;
    private Controller controller;

    public StartViewImpl() throws HeadlessException {
        controller = new Controller(this);
        initComponents();
    }

    private void initComponents() {
        int yPosition = 0;
        int leftMargin = 10;
        int widthButton = 272;
        int heightButton = 40;

        JButton allExercises = new JButton("Все упражнения по очереди");
        allExercises.setBounds(leftMargin, yPosition += 10, widthButton, heightButton);
        allExercises.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickAllExercises();
            }
        });

        JButton abcExercise = new JButton("Алфавит");
        abcExercise.setBounds(leftMargin, yPosition += 80, widthButton, heightButton);
        abcExercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickAbcExercise();
            }
        });

        JButton numberFrom1To10Exercise = new JButton("Числа N1-10");
        numberFrom1To10Exercise.setBounds(leftMargin, yPosition += 50, widthButton, heightButton);
        numberFrom1To10Exercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickNumberFrom1To10Exercise();
            }
        });

        JButton numberFrom1To1999999999Exercise = new JButton("Числа N1-1,999,999,999");
        numberFrom1To1999999999Exercise.setBounds(leftMargin, yPosition += 50, widthButton, heightButton);
        numberFrom1To1999999999Exercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickNumberFrom1To1999999999Exercise();
            }
        });

        JButton numberFrom1stTo31thExercise = new JButton("Числительные N1st-31th");
        numberFrom1stTo31thExercise.setBounds(leftMargin, yPosition += 50, widthButton, heightButton);
        numberFrom1stTo31thExercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickNumberFrom1stTo31thExercise();
            }
        });

        JButton clockExercise = new JButton("Время");
        clockExercise.setBounds(leftMargin, yPosition += 50, widthButton, heightButton);
        clockExercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickClockExercise();
            }
        });

        JButton daysWeekExercise = new JButton("Дни недели");
        daysWeekExercise.setBounds(leftMargin, yPosition += 50, widthButton, heightButton);
        daysWeekExercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickDaysWeekExercise();
            }
        });

        JButton monthExercise = new JButton("Месяца");
        monthExercise.setBounds(leftMargin, yPosition += 50, widthButton, heightButton);
        monthExercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickMonthExercise();
            }
        });

        JButton yearExercise = new JButton("Года");
        yearExercise.setBounds(leftMargin, yPosition += 50, widthButton, heightButton);
        yearExercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickYearExercise();
            }
        });

        JButton result = new JButton("Результаты");
        result.setBounds(leftMargin, yPosition += 70, 130, heightButton);
        result.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickResult();
            }
        });

        JButton settings = new JButton("Настройки");
        settings.setBounds(136 + leftMargin + 6, yPosition, 130, heightButton);
        settings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickSettings();
            }
        });

        JFrame mainFrame = new JFrame("Изучение английского");
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setBounds(400, 200, WIDTH_WINDOW, HEIGHT_WINDOW);
        mainFrame.setLayout(null);

        mainFrame.add(allExercises);
        mainFrame.add(abcExercise);
        mainFrame.add(numberFrom1To10Exercise);
        mainFrame.add(numberFrom1To1999999999Exercise);
        mainFrame.add(numberFrom1stTo31thExercise);
        mainFrame.add(clockExercise);
        mainFrame.add(daysWeekExercise);
        mainFrame.add(monthExercise);
        mainFrame.add(yearExercise);
        mainFrame.add(result);
        mainFrame.add(settings);

        mainFrame.setVisible(true);
    }

}
