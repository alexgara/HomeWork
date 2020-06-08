package HW8;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    public static final int WINDOW_POS_X = 400;
    public static final int WINDOW_POS_Y = 400;
    public static final int WINDOW_WIDTH = 600;
    private static final int WINDOW_HEIGHT = 650;

    private SettingsWindow settingsWindow;
    private BattleMap battleMap;

    public GameWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(WINDOW_POS_X, WINDOW_POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("TICTACTOE");

        settingsWindow = new SettingsWindow(this);
        battleMap = new BattleMap(this);
        add(battleMap, BorderLayout.CENTER);

        Font fontBig = new Font("SputnikDisplay Bold", Font.BOLD, 100);
        Font fontSmall = new Font("SputnikDisplay Bold", Font.BOLD, 14);

        JPanel panel = new JPanel(new GridLayout(1, 2));

        JPanel panelTitle = new JPanel(new GridLayout(1, 2));

        JLabel label = new JLabel("TICTACTOE");
        label.setBounds(300, 300, 400, 200);
        panelTitle.add(label);
        label.setFont(fontBig);
        label.setBackground(Color.white);
        label.setForeground(Color.orange);

        JButton buttonStartNewGame = new JButton("Новая игра");
        panel.add(buttonStartNewGame);
        buttonStartNewGame.setFont(fontSmall);
        buttonStartNewGame.setBackground(Color.orange);
        buttonStartNewGame.setForeground(Color.white);

        JButton buttonExit = new JButton("Выход");
        panel.add(buttonExit);
        buttonExit.setFont(fontSmall);
        buttonExit.setBackground(Color.orange);
        buttonExit.setForeground(Color.white);

        buttonStartNewGame.addActionListener(e -> {
            settingsWindow.setVisible(true);
        });

        buttonExit.addActionListener(e -> {
            System.exit(0);
        });

        add(panel, BorderLayout.SOUTH);
        add(panelTitle, BorderLayout.CENTER);

        setVisible(true);
    }

    public void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int dotsToWin) {
        battleMap.startNewGame(gameMode, fieldSizeX, fieldSizeY, dotsToWin);
    }
}