package ru.mirea.lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballMatch extends JFrame implements ActionListener {
    private int milanScore = 0; //голы милана
    private int madridScore = 0; //голы мадрида
    private JButton milanButton; //кнопка для увеличения счёта милана
    private JButton madridButton; //кнопка для увеличения счёта реала
    private JLabel scoreLabel;//счёт
    private JLabel lastScorerLabel; //последний забивший
    private JLabel winnerLabel; //победитель

    public FootballMatch() {
        setTitle("Football Match"); //заголовок и размер окна
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        milanButton = new JButton("AC Milan");//инициализация кнопок
        milanButton.addActionListener(this);
        madridButton = new JButton("Real Madrid");
        madridButton.addActionListener(this);
        //Добавление ActionListener для обработки нажатия на кнопку

        //инициализация и настрйока меток
        scoreLabel = new JLabel("Result: 0 X 0");
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");


        // Установка GridLayout для размещения компонентов на форме
        setLayout(new GridLayout(4, 1));
        add(milanButton);
        add(madridButton);
        add(scoreLabel);
        add(lastScorerLabel);
        add(winnerLabel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == milanButton) {
            milanScore++;
            lastScorerLabel.setText("Last Scorer: AC Milan");
        } else if (e.getSource() == madridButton) {
            madridScore++;
            lastScorerLabel.setText("Last Scorer: Real Madrid");
        }

        updateScoreLabel();
        updateWinnerLabel();
    }

    private void updateScoreLabel() {
        scoreLabel.setText("Result: " + milanScore + " X " + madridScore);
    }

    private void updateWinnerLabel() {
        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (milanScore < madridScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                FootballMatch match = new FootballMatch();
                match.setVisible(true);
            }
        });
    }
}
