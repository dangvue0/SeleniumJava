package com.dangvue0.testme;
import org.openqa.selenium.Keys;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.*;
import java.io.File;
import java.util.Set;

public class gui {
    static String maintab;

    public static void main(String[] args) {
        seleni d = new seleni();
        JFrame frame = new JFrame("OpenList for Chrome:Java");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        JPanel panel1 = new JPanel();
        panel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), ""));
        JPanel panel2 = new JPanel();
//        panel2.setBackground(Color.CYAN);
//        panel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Pane 2"));
        JPanel panel3 = new JPanel();
        panel3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Pane 3"));

        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("File");

        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        JMenuItem mitem1 = new JMenuItem(new AbstractAction("Open File") {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("OpenFileMenu is Clicked.");
                JFileChooser fileChooser = new JFileChooser();
                int option = fileChooser.showOpenDialog(frame);
                if(option == JFileChooser.APPROVE_OPTION){
                    File file = fileChooser.getSelectedFile();
                    System.out.println("FileOpen working");
//                    label.setText("File Selected: " + file.getName());
                }else{
                    System.out.println("FileOpen canceled");
//                    label.setText("Open command canceled");
                }
            }
        });

        JMenuItem mitem2 = new JMenuItem(new AbstractAction("Save As...") {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Save As... is Clicked.");
            }

        });
        JMenuItem mitem3 = new JMenuItem(new AbstractAction("Website") {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Website... is Clicked.");
            }
        });

        JMenuItem mitem4 = new JMenuItem("About Us");

        m1.add(mitem1);
        m1.add(mitem2);
        m2.add(mitem3);
        m2.add(mitem4);

        JTextArea txtarea = new JTextArea(20, 30);

//        String b = txtarea.getText();
//        String[] strArray = b.split("\n");
//        someFunction(strArray);

        JButton butn = new JButton("Open Tabs");
        butn.setPreferredSize(new Dimension(110, 45));
        butn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b = txtarea.getText();
                String[] strArray = b.split("\n");


                for (String wordSearch : strArray) {
                    d.opentab(wordSearch);
                }
            }
        });

        JButton butn2 = new JButton("Close Tabs");
        butn2.setPreferredSize(new Dimension(110, 45));
        butn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Set<String> tabs = d.driver.getWindowHandles();

                for (String tab : tabs) {
                    d.driver.switchTo().window(tab);
                    if (!tab.equals(maintab)) {
                        d.driver.close();
                    }
                }
                for (String tab : tabs) {
                    d.driver.switchTo().window(tab);
                }


            }
        });

        JButton butn3 = new JButton("Start Chrome");
        butn3.setPreferredSize(new Dimension(110, 45));
        butn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d.setprop();
                d.startChrome();
                d.searchyoutube("OMG");
                maintab = d.getDefaultwindow();
            }
        });

        panel1.add(txtarea);
        panel2.add(butn);
        panel2.add(butn2);
        panel2.add(butn3);

        frame.setLayout(new FlowLayout(1));
        frame.add(panel1);
        frame.add(panel2);
//        frame.add(panel3);
        frame.add(mb);
        frame.setJMenuBar(mb);

        frame.setVisible(true);

//        String[] list = {"Japanese My Boo", "Coldplay", "Gundam"};
//        thisfunction(list);
    }

    public static void thisfunction(String[] list) {
        for (String item: list) {
            int getIndex = Arrays.asList(list).indexOf(item);
            System.out.println(item + " " + getIndex);
        }
    }

    public static void menuSelected(MenuEvent m1) {

    }


}
