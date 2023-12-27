/*
 * Created by JFormDesigner on Fri Dec 16 06:35:14 CST 2022
 */

package com.K1ez.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author ÎïÁªÍø2101ÕÅÞÈ³½
 */
public class Edit extends JFrame {
    public Edit() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        frame1 = new JFrame();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        oldpsw = new JTextField();
        currentpsw = new JTextField();
        returnpsw = new JTextField();
        button1 = new JButton();
        button2 = new JButton();

        //======== frame1 ========
        {
            frame1.setTitle("\u4fee\u6539\u5bc6\u7801");
            frame1.setIconImage(new ImageIcon(getClass().getResource("/image/138\u8bbe\u7f6e\u3001\u7cfb\u7edf\u8bbe\u7f6e\u3001\u529f\u80fd\u8bbe\u7f6e\u3001\u5c5e\u6027.png")).getImage());
            frame1.setMinimumSize(new Dimension(613, 381));
            frame1.setMaximizedBounds(new Rectangle(0, 0, 0, 0));
            frame1.setAlwaysOnTop(true);
            frame1.setVisible(true);
            var frame1ContentPane = frame1.getContentPane();

            //---- label1 ----
            label1.setText("\u65e7\u5bc6\u7801");

            //---- label2 ----
            label2.setText("\u65b0\u5bc6\u7801");

            //---- label3 ----
            label3.setText("\u91cd\u65b0\u8f93\u5165");

            //---- button1 ----
            button1.setText("\u786e\u8ba4\u4fee\u6539");

            //---- button2 ----
            button2.setText("\u91cd\u7f6e");

            GroupLayout frame1ContentPaneLayout = new GroupLayout(frame1ContentPane);
            frame1ContentPane.setLayout(frame1ContentPaneLayout);
            frame1ContentPaneLayout.setHorizontalGroup(
                frame1ContentPaneLayout.createParallelGroup()
                    .addGroup(frame1ContentPaneLayout.createSequentialGroup()
                        .addGroup(frame1ContentPaneLayout.createParallelGroup()
                            .addGroup(frame1ContentPaneLayout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addGroup(frame1ContentPaneLayout.createParallelGroup()
                                    .addComponent(label1)
                                    .addComponent(label2)
                                    .addComponent(label3))
                                .addGap(36, 36, 36)
                                .addGroup(frame1ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(oldpsw, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(currentpsw, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(returnpsw, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)))
                            .addGroup(frame1ContentPaneLayout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(button1)
                                .addGap(62, 62, 62)
                                .addComponent(button2)))
                        .addContainerGap(163, Short.MAX_VALUE))
            );
            frame1ContentPaneLayout.setVerticalGroup(
                frame1ContentPaneLayout.createParallelGroup()
                    .addGroup(frame1ContentPaneLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(frame1ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label1)
                            .addComponent(oldpsw, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(frame1ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2)
                            .addComponent(currentpsw, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(frame1ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label3)
                            .addComponent(returnpsw, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(frame1ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button1)
                            .addComponent(button2))
                        .addGap(47, 47, 47))
            );
            frame1.pack();
            frame1.setLocationRelativeTo(frame1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JFrame frame1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField oldpsw;
    private JTextField currentpsw;
    private JTextField returnpsw;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
