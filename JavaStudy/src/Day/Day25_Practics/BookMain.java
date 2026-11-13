package Day.Day25_Practics;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class BookMain extends JFrame implements ActionListener, MouseListener
{
    JLabel label;
    JLabel pageLabel;
    JTextField textField;
    JButton searchBtn;
    JButton prevBtn;
    JButton nextBtn;
    JButton guideBtn;
    DefaultTableModel tableModel;
    JTable table;
    JPanel panel = new JPanel();

    int totalPage = 0;
    int curPage = 1;
    //BookSystem bookSystem = new BookSystem();

    public BookMain()
    {
        label = new JLabel("Book Center", JLabel.CENTER);
        label.setFont(new Font("맑은 고딕", Font.BOLD, 45));
        setLayout(null);
        label.setBounds(10, 15, 770, 55);
        add(label);

        textField = new JTextField();
        textField.setBounds(10, 80, 350, 30);
        add(textField);

        searchBtn = new JButton("검색");
        searchBtn.setBounds(365, 80, 100, 30);
        add(searchBtn);

        guideBtn = new JButton("목록");
        guideBtn.setBounds(470, 80, 100, 30);
        add(guideBtn);

        String[] col = { "번호", "", "책제목", "저자", "가격" };
        String[][] row = new String[0][5];
        tableModel = new DefaultTableModel(row, col)
        {
            @Override
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }
            
        };
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 115, 770, 400);
        add(scrollPane);

        prevBtn = new JButton("이전");
        nextBtn = new JButton("다음");
        pageLabel = new JLabel("0 page / 0 pages");
        panel.add(prevBtn);
        panel.add(pageLabel);
        panel.add(nextBtn);
        panel.setBounds(10, 525, 770, 35);
        add(panel);

        setSize(800, 640);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        bookPrint();

        prevBtn.addActionListener(this);
        nextBtn.addActionListener(this);
        guideBtn.addActionListener(this);
        searchBtn.addActionListener(this);
        textField.addActionListener(this);
        table.addMouseListener(this);
    }
    
    public void bookPrint()
    {
        panel.setVisible(true);
        for (int i = tableModel.getRowCount() - 1; i >= 0; i--)
        {
            tableModel.removeRow(i);
        }
        // totalPage = (int)(Math.ceil(BookSystem.getBList().size() / 10.0));
        // ArrayList<BookVO> list = bs.bookListData(curPage);
        // DecimalFormat format = new DecimalFormat("###,###");
        // for (BookVO vo : list)
        // {
        //     String[] data = 
        //     {
        //         String.valueOf(vo.getNo()),
        //         "",
        //         vo.getTitle(),
        //         vo.getAuthor(),
        //         format.format(vo.getPrice()) + "원"
        //     };
        //     tableModel.addRow(data);
        // }
        // pageLabel.setText(curPage + " page / " + totalPage + " pages");
    }

    public void findData(String fd)
    {

    }

    public static void main(String[] args)
    {
        try
        {
            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
        } 
        catch (Exception ex)
        {
            
        }
        new BookMain();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == prevBtn)
        {
            if (curPage <= 1)
            {
                return;
            }
            curPage--;
            bookPrint();
        }
        else if (e.getSource() == nextBtn)
        {
            if (curPage >= totalPage)
            {
                return;
            }
            curPage++;
            bookPrint();
        }
        else if (e.getSource() == guideBtn)
        {
            curPage = 1;
            bookPrint();
        }
        else if (e.getSource() == searchBtn || e.getSource() == textField)
        {
            String fd = textField.getText();
            if (fd.trim().length() < 1)
            {
                return;
            }
            findData(fd);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        if (e.getSource() == table)
        {
            if (e.getClickCount() == 2)
            {
                // int row = table.getSelectedRow();
                // String no = tableModel.getValueAt(row, 0).toString();
                // BookVO vo = bs.bookDetailData(Integer.parseInt(no));
                // String msg = "책제목 : " + vo.getTitle() + 
                //             "\n저자 : " + vo.getAuthor() +
                //             "\n가격 : " + vo.getPrice() + 
                //             "\n총페이지 : " + vo.getPages() +
                //             "\n출판일 : " + vo.getPubdate();
                // JOptionPane.showMessageDialog(this, msg);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
        
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
        
    }
}
