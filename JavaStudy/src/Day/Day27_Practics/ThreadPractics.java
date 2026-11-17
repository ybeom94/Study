package Day.Day27_Practics;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ThreadPractics extends JFrame implements ActionListener
{
    JProgressBar[] bar = new JProgressBar[5];
    JButton startBtn;
    JButton endBtn;

    static int rank;
    BarThread[] thread = new BarThread[5];

    public ThreadPractics()
    {
        startBtn = new JButton("시작");
        endBtn = new JButton("종료");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1, 5, 5));
        Color[] color =
        { Color.cyan, Color.yellow, Color.orange, Color.magenta, Color.pink };
        for (int i = 0; i < bar.length; i++)
        {
            bar[i] = new JProgressBar();
            bar[i].setMinimum(0);
            bar[i].setMaximum(100);
            bar[i].setStringPainted(true);
            bar[i].setBackground(Color.white);
            bar[i].setForeground(color[i]);
            panel.add(bar[i]);
        }
        JPanel panel2 = new JPanel();
        panel2.add(startBtn);
        panel2.add(endBtn);

        add("Center", panel);
        add("South", panel2);

        setSize(640, 350);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        startBtn.addActionListener(this);
        endBtn.addActionListener(this);
    }
    
    class BarThread extends Thread
    {
        int index;

        public BarThread(int index)
        {
            this.index = index;
        }
        
        public void run()
        {
            for (int i = 0; i <= 100; i++)
            {
                bar[index].setValue(i);
                int a = (int) (Math.random() * 300);
                try
                {
                    Thread.sleep(a);
                } catch (Exception e)
                {

                }
                if (i == 100)
                {
                    rank++;
                    interrupt();
                }
            }
            System.out.println((index + 1) + "번째 " + rank + "등");
        }
    }

    public static void main(String[] args)
    {
        new ThreadPractics();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == startBtn)
        {
            for (int i = 0; i < 5; i++)
            {
                thread[i] = new BarThread(i);
                thread[i].start();
            }
            
        }
        if (e.getSource() == endBtn)
        {
            System.exit(0);
        }
    }

}
