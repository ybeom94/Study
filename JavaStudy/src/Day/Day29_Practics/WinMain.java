package Day.Day29_Practics;

import java.util.*;
import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WinMain extends JFrame implements ActionListener, Runnable
{
    JTextArea textArea;
    JTextField textField;
    JButton connectBtn;
    JButton exitBtn;

    String name;

    Socket socket; // 서버와 연결되는 기기
    BufferedReader in; // 서버에서 보낸 값 읽기
    OutputStream out; // 서버로 요청한 값

    final String[] colors = {"\u001B[31m", "\u001B[32m", "\u001B[33m", "\u001B[34m"};

    public WinMain()
    {
        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        textField = new JTextField(30);
        textField.setEnabled(false);
        connectBtn = new JButton("접속");
        exitBtn = new JButton("종료");

        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(connectBtn);
        panel.add(exitBtn);

        add("Center", scrollPane);
        add("South", panel);

        setSize(500, 400);
        setVisible(true);

        connectBtn.addActionListener(this);
        exitBtn.addActionListener(this);
        textField.addActionListener(this);
    }

    public static void main(String[] args)
    {
        new WinMain();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == exitBtn)
        {
            dispose();
            System.exit(0);
        }

        if (e.getSource() == connectBtn)
        {
            name = JOptionPane.showInputDialog(("이름 입력 : "));
            try
            {
                // 서버 연결
                socket = new Socket("localhost", 3355);
                // 요청 위치, 응답 위치
                out = socket.getOutputStream(); // 서버로 전송
                in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 요청에 대한 응답값 받는다.
            } 
            catch (Exception ex)
            {

            }
            finally
            {
                new Thread(this).start(); // 서버에서 들어오는 값을 받아서 계속 출력
                // run() 호출
                connectBtn.setEnabled(false);
                textField.setEnabled(true);
                textField.requestFocus();
            }
        }
        
        if (e.getSource() == textField)
        {
            String msg = textField.getText();
            if (msg.length() < 1)
            {
                return;
            }
            // 서버로 전송
            try
            {
                int rand = (int)(Math.random() * colors.length);
                String color = colors[rand];
                out.write((color + "[" + name + "]\u001B[0m" + msg + "\n").getBytes());
            } 
            catch (Exception ex)
            {

            }
            finally
            {
                textField.setText("");
                textField.requestFocus();
            }
            
        }
    }

    // 서버에서 응답한 결과값을 받아서 출력 => Thread
    // 클라이언트 : 본인 / 서버 : 스레드 => 두개가 동시에 처리
    @Override
    public void run()
    {
        try
        {
            while (true)
            {
                // 서버로 부터 값을 받는다
                String msg = in.readLine();
                // 받은 값을 TextArea에 출력
                textArea.append(msg + "\n");
            }
        } 
        catch (Exception e)
        {
            
        }
    }
}
