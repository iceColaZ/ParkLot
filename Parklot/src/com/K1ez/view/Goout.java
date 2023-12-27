/*
 * Created by JFormDesigner on Thu Dec 15 20:26:54 CST 2022
 */

package com.K1ez.view;

import com.K1ez.conn.ParkDao;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author 物联网2101张奕辰
 */
public class Goout extends JFrame {
    public Goout() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
    }

    private void Back(ActionEvent e) {
        this.dispose();
        Park park = new Park();
    }

    private void Out(ActionEvent e) {
        int lotid = lot.getSelectedIndex()+1;
        ParkDao parkdao = new ParkDao();
        boolean temp = parkdao.Out(lotid);

        if(temp == false){
            JOptionPane.showMessageDialog(this,"操作失败，您的车可能不在停车场内");
        }
        else{
            JOptionPane.showMessageDialog(this,"车辆登出成功");
            this.dispose();
            Park park = new Park();
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        lot = new JComboBox<>();
        okButton = new JButton();
        cancelButton = new JButton();

        //======== this ========
        setTitle("\u9a76\u51fa\u767b\u8bb0");
        setIconImage(new ImageIcon(getClass().getResource("/image/\u5bc6\u7801.png")).getImage());
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {

                //---- label1 ----
                label1.setText("\u8f66\u8f86\u9a76\u51fa");
                label1.setFont(new Font("\u7b49\u7ebf Light", Font.BOLD, 20));
                label1.setIcon(new ImageIcon(getClass().getResource("/image/\u6c7d\u8f66 (1).png")));

                //---- label2 ----
                label2.setText("\u60a8\u6240\u5728\u7684\u8f66\u4f4d");
                label2.setIcon(new ImageIcon(getClass().getResource("/image/\u7528\u6237_\u586b\u5145.png")));
                label2.setFont(new Font("\u7b49\u7ebf Light", Font.PLAIN, 16));

                //---- lot ----
                lot.setModel(new DefaultComboBoxModel<>(new String[] {
                    "\u8f66\u4f4d1",
                    "\u8f66\u4f4d2",
                    "\u8f66\u4f4d3",
                    "\u8f66\u4f4d4",
                    "\u8f66\u4f4d5",
                    "\u8f66\u4f4d6",
                    "\u8f66\u4f4d7",
                    "\u8f66\u4f4d8",
                    "\u8f66\u4f4d9",
                    "\u8f66\u4f4d10",
                    "\u8f66\u4f4d11",
                    "\u8f66\u4f4d12",
                    "\u8f66\u4f4d13",
                    "\u8f66\u4f4d14",
                    "\u8f66\u4f4d15",
                    "\u8f66\u4f4d16",
                    "\u8f66\u4f4d17",
                    "\u8f66\u4f4d18",
                    "\u8f66\u4f4d19",
                    "\u8f66\u4f4d20"
                }));

                //---- okButton ----
                okButton.setText("\u9a76\u51fa");
                okButton.addActionListener(e -> Out(e));

                //---- cancelButton ----
                cancelButton.setText("\u8fd4\u56de");
                cancelButton.addActionListener(e -> Back(e));

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addGap(157, 157, 157)
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addGap(98, 98, 98)
                                    .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(label2)
                                        .addComponent(okButton, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
                                    .addGap(32, 32, 32)
                                    .addGroup(contentPanelLayout.createParallelGroup()
                                        .addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lot, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))))
                            .addContainerGap(98, Short.MAX_VALUE))
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(label1)
                            .addGap(18, 18, 18)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label2)
                                .addComponent(lot, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(okButton)
                                .addComponent(cancelButton))
                            .addGap(30, 30, 30))
                );
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel label1;
    private JLabel label2;
    private JComboBox<String> lot;
    private JButton okButton;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
