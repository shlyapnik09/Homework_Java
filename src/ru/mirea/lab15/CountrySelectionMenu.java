package ru.mirea.lab15;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountrySelectionMenu {
    private static String[] countries = {"Россия", "США", "Китай", "Украина"}; // Список стран
    private static String[] countryInfo = {
            "Столица - Москва, Население - 146 млн, Язык - русский",
            "Столица - Вашингтон, Население - 328 млн, Язык - английский",
            "Столицы - Пекин, Население - 143 млн, Язык - китайский",
            "Столица - Киев, население - 43,7, Язык - украинский"
    }; // Информация о странах

    public static void main(String[] args) {
        JFrame frame = new JFrame("Выбор страны");
        JComboBox<String> countryList = new JComboBox<>(countries);
        JTextArea countryInfoArea = new JTextArea();
        countryInfoArea.setEditable(false);

        countryList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = countryList.getSelectedIndex(); // Получаем индекс выбранной страны
                countryInfoArea.setText(countryInfo[index]); // Выводим информацию о выбранной стране
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Выберите страну: "));
        panel.add(countryList);
        panel.add(new JLabel("Информация о стране: "));
        panel.add(countryInfoArea);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
