package Day.Day15_Practics;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MusicListWindow extends JFrame implements ActionListener
{   
    JTable table;
    DefaultTableModel model;
    JButton b1, b2;
    MusicSystem gMusic = new MelonMusic();

    public MusicListWindow ()
    {
        b1 = new JButton("지니뮤직");
        b2 = new JButton("멜론");
        JPanel panel = new JPanel();
        panel.add(b1);
        panel.add(b2);
        add("North", panel);

        String[] col = {"순위", "노래명", "가수명", "앨범"};
        String[][] row = new String[0][4];
        model = new DefaultTableModel(row, col);
        table = new JTable(model);
        table.getTableHeader().setReorderingAllowed(false);
        table.setRowHeight(35);
        JScrollPane scroll = new JScrollPane(table);

        add("Center", scroll);
        setSize(800, 600);
        setVisible(true);

        print();

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void print()
    {
        for (int i = model.getRowCount() -1 ; i >= 0; i--)
        {
            model.removeRow(i);
        }

        ArrayList<MusicVO> musicVOs = gMusic.musicListData();
        for (MusicVO vo : musicVOs)
        {
            String[] data = 
            {
                String.valueOf(vo.getRank()),
                vo.getTitle(),
                vo.getArtist(),
                vo.getAlbum()
            };
            model.addRow(data);
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args)
    {
        new MusicListWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == b1)
        {
            gMusic = new GenieMusic();
            print();
        }
        else if (e.getSource() == b2)
        {
            gMusic = new MelonMusic();
            print();
        }
    }
}
