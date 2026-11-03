package Day.Day17_Practics;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PuzzleGame extends JFrame implements ActionListener, MouseListener
{   
    JButton[] puzzleBtns = new JButton[9];
    JLabel label = new JLabel("퍼즐게임", JLabel.CENTER);
    JButton startBtn, exitBtn;
    int[] panCount = new int[9];
    int last = 0;
    boolean isStart = false;

    public PuzzleGame()
    {
        setTitle("퍼즐게임");

        JPanel panel = new JPanel();
        panel.add(label);
        panel.setBounds(10, 10, 350, 35);
        add(panel);

        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3, 5, 5));
        for (int i = 0; i < puzzleBtns.length; i++)
        {
            puzzleBtns[i] = new JButton(String.valueOf(i + 1));
            puzzleBtns[i].setFont(new Font("궁서체", Font.BOLD, 45));
            puzzleBtns[i].addActionListener(this);
            puzzleBtns[i].addMouseListener(this);
            panel.add(puzzleBtns[i]);
        }
        setLayout(null);
        panel.setBounds(10, 50, 350, 350);
        add(panel);

        panel = new JPanel();
        startBtn = new JButton("시작");
        exitBtn = new JButton("종료");
        panel.add(startBtn);
        panel.add(exitBtn);
        panel.setBounds(10, 410, 350, 35);
        add(panel);

        setSize(380, 500);
        setVisible(true);

        exitBtn.addActionListener(this);
        exitBtn.addMouseListener(this);
        startBtn.addActionListener(this);
        startBtn.addMouseListener(this);
    }

    public static void main(String[] args)
    {
       new PuzzleGame();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == exitBtn)
        {
            JOptionPane.showMessageDialog(this, "게임을 종료합니다");
            System.exit(0);
        }
        else if (e.getSource() == startBtn)
        {
            isStart = true;
            getRand();
            puzzleLayout();
        }

        for (int i = 0; i < puzzleBtns.length; i++)
        {   
            if (!isStart)
            {
                return;
            }
            if (e.getSource() == puzzleBtns[last])
            {
                return;
            }
            if (e.getSource() == puzzleBtns[i])
            {
                panCount[i] = puzzleBtns.length - 1;
                panCount[last] = Integer.parseInt(puzzleBtns[i].getText()) - 1;
                last = i;
                puzzleLayout();
                if (isEnd())
                {
                    int n = JOptionPane.showConfirmDialog(this, "종료할까요?", "종료",
                                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                    if (n == JOptionPane.YES_OPTION)
                    {
                        System.exit(0);
                    }
                    else
                    {
                        getRand();
                        puzzleLayout();
                    }
                }
            }
        }
    }

    public boolean isEnd()
    {
        for (int i = 0; i < puzzleBtns.length; i++)
        {
            if (panCount[i] != i)
            {
                return false;
            }
        }
        return true;
    }

    public void getRand()
    {
        for (int i = 0; i < puzzleBtns.length; i++)
        {
            panCount[i] = (int)(Math.random() * 9);
            for (int j = 0; j < i; j++)
            {
                if (panCount[i] == panCount[j])
                {
                    i--;
                    break;
                }
            }
        }
        for (int i = 0; i < puzzleBtns.length; i++)
        {
            if (panCount[i] == puzzleBtns.length - 1)
            {
                last = i;
                break;
            }
        }
    }

    public void puzzleLayout()
    {
        for (int i = 0; i < puzzleBtns.length; i++)
        {
            if (last == i)
            {
                puzzleBtns[i].setText("");
            }
            else
            {
                puzzleBtns[i].setText(String.valueOf(panCount[i] + 1));
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
        if (e.getSource() == exitBtn)
        {
            exitBtn.setBackground(Color.green);
        }
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
        if (e.getSource() == exitBtn)
        {
            exitBtn.setBackground(Color.white);
        }
    }
}
