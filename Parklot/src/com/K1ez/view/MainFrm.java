/*
 * Created by JFormDesigner on Fri Dec 16 05:17:06 CST 2022
 */

package com.K1ez.view;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author ÎïÁªÍø2101ÕÅÞÈ³½
 */
public class MainFrm extends JFrame {
    public MainFrm() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        initComponents();
    }

    private void About(ActionEvent e) {
        JOptionPane.showMessageDialog(this,"author:sut iot2101 ÕÅÞÈ³½¡¢Ñî·áºÕ¡¢º«×ÓÐñ");
    }

    private void editPsw(ActionEvent e) {
        Edit edit = new Edit();
    }

    private void search(ActionEvent e) {
        CarQuery car = new CarQuery();
    }

    private void addcar(ActionEvent e) {
        Park park = new Park();
    }

    private void closewindow(ActionEvent e) {
        this.dispose();
    }

    private void openrecord(ActionEvent e) {
        RecordQuery recordQuery = new RecordQuery();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menuItem1 = new JMenuItem();
        menuItem2 = new JMenuItem();
        menu2 = new JMenu();
        menuItem3 = new JMenuItem();
        menuItem4 = new JMenuItem();
        menu3 = new JMenu();
        menuItem5 = new JMenuItem();
        menu4 = new JMenu();
        menuItem7 = new JMenuItem();

        //======== this ========
        setTitle("\u8f66\u5e93\u4fe1\u606f\u4e3b\u754c\u9762");
        setIconImage(new ImageIcon(getClass().getResource("/image/\u5bc6\u7801.png")).getImage());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("\u7cfb\u7edf\u8bbe\u7f6e");
                menu1.setIcon(new ImageIcon(getClass().getResource("/image/138\u8bbe\u7f6e\u3001\u7cfb\u7edf\u8bbe\u7f6e\u3001\u529f\u80fd\u8bbe\u7f6e\u3001\u5c5e\u6027.png")));

                //---- menuItem1 ----
                menuItem1.setText("\u4fee\u6539\u5bc6\u7801");
                menuItem1.setIcon(new ImageIcon(getClass().getResource("/image/\u5bc6\u7801.png")));
                menuItem1.addActionListener(e -> editPsw(e));
                menu1.add(menuItem1);

                //---- menuItem2 ----
                menuItem2.setText("\u9000\u51fa\u7cfb\u7edf");
                menuItem2.setIcon(new ImageIcon(getClass().getResource("/image/\u5173\u673a.png")));
                menuItem2.addActionListener(e -> closewindow(e));
                menu1.add(menuItem2);
            }
            menuBar1.add(menu1);

            //======== menu2 ========
            {
                menu2.setText("\u8f66\u8f86\u7ba1\u7406");
                menu2.setIcon(new ImageIcon(getClass().getResource("/image/\u6c7d\u8f66 (2).png")));

                //---- menuItem3 ----
                menuItem3.setText("\u8f66\u8f86\u7f16\u8f91");
                menuItem3.setIcon(new ImageIcon(getClass().getResource("/image/icon_\u6dfb\u52a0.png")));
                menuItem3.addActionListener(e -> addcar(e));
                menu2.add(menuItem3);

                //---- menuItem4 ----
                menuItem4.setText("\u8f66\u5e93\u7ba1\u7406");
                menuItem4.setIcon(new ImageIcon(getClass().getResource("/image/\u5217\u8868.png")));
                menuItem4.addActionListener(e -> search(e));
                menu2.add(menuItem4);
            }
            menuBar1.add(menu2);

            //======== menu3 ========
            {
                menu3.setText("\u5386\u53f2\u8bb0\u5f55");
                menu3.setIcon(new ImageIcon(getClass().getResource("/image/_\u5386\u53f2\u5c0f.png")));

                //---- menuItem5 ----
                menuItem5.setText("\u505c\u8f66\u8bb0\u5f55");
                menuItem5.setIcon(new ImageIcon(getClass().getResource("/image/_\u5386\u53f2\u5c0f2.png")));
                menuItem5.addActionListener(e -> openrecord(e));
                menu3.add(menuItem5);
            }
            menuBar1.add(menu3);

            //======== menu4 ========
            {
                menu4.setText("\u5e2e\u52a9");
                menu4.setIcon(new ImageIcon(getClass().getResource("/image/\u5e2e\u52a9 (1).png")));

                //---- menuItem7 ----
                menuItem7.setText("\u5173\u4e8e...");
                menuItem7.setIcon(new ImageIcon(getClass().getResource("/image/\u7528\u6237_\u586b\u5145.png")));
                menuItem7.addActionListener(e -> About(e));
                menu4.add(menuItem7);
            }
            menuBar1.add(menu4);
        }
        setJMenuBar(menuBar1);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGap(0, 880, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGap(0, 607, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem menuItem1;
    private JMenuItem menuItem2;
    private JMenu menu2;
    private JMenuItem menuItem3;
    private JMenuItem menuItem4;
    private JMenu menu3;
    private JMenuItem menuItem5;
    private JMenu menu4;
    private JMenuItem menuItem7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
