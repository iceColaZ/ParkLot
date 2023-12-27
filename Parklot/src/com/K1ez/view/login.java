/*
 * Created by JFormDesigner on Mon Dec 12 01:32:12 CST 2022
 */
package com.K1ez.view;
import com.K1ez.conn.AdminDao;
import com.K1ez.model.Admin;
import com.K1ez.util.StringUtil;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author 物联网2101张奕辰 2022/12/12 2:50AM
 * 本文件已进行必要注明。
 */
public class login extends JFrame {
    public static void main(String[] args) {
        login log = new login();
    }

    public login() {
        initComponents();
    }

    private void reset(ActionEvent e) {
        resetValue();
    }

    private void login(ActionEvent e) {
        loginAction(e);// TODO add your code here
    }

    private void loginAction(ActionEvent e) {
        String userName = username.getText().toString(); //从文本框中得到输入的用户名
        String passWord = password.getText().toString(); //从文本框中得到输入的密码
        /**
         * 检查用户名和密码是否为空的if
         */
        if(StringUtil.isEmpty(userName)){
            JOptionPane.showMessageDialog(this,"用户名不能为空");
            return;
        }
        if(StringUtil.isEmpty(passWord)){
            JOptionPane.showMessageDialog(this,"密码不能为空");
            return;
        }

        AdminDao adminDao = new AdminDao();//新建数据库连接管理员的接口类
        Admin adminTmp = new Admin();//新建管理员类，方便存放数据
        adminTmp.setUserName(userName);
        adminTmp.setPassWord(passWord);//将文本框中得到的用户名和密码放入存放类中。
        Admin admin = adminDao.login(adminTmp);//新建一个admin类用于存放数据库的返回结果。
        /**
         * 如果查询结果无误，AdminDao中的login方法会把密码数据包以admin类的形式返回
         * 如果查询出现错误，会返回一个null的admin类，因此可以以此作为判断依据来看登录是否成功
         * 判断的if语句如下
         */
        if(admin == null){
            JOptionPane.showMessageDialog(this,"用户名或密码错误");
        }
        else {
            JOptionPane.showMessageDialog(this,userName+"正在作为系统管理员登录。");
            this.dispose();//关闭当前窗口
            new MainFrm();//打开主界面进行操作
        }
    }

    private void park(ActionEvent e) {
        Park park = new Park();
        this.dispose();
        //TODO add your code here
    }

    private void initComponents() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        dialogPane = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        username = new JTextField();
        label3 = new JLabel();
        loginButton = new JButton();
        button1 = new JButton();
        button2 = new JButton();
        password = new JPasswordField();
        label4 = new JLabel();

        //======== this ========
        setTitle("\u8f66\u5e93\u7ba1\u7406\u7cfb\u7edf\u767b\u5f55");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/image/\u5bc6\u7801.png")).getImage());
        var contentPane = getContentPane();

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setOpaque(false);

            //---- label1 ----
            label1.setText("\u8f66\u5e93\u7ba1\u7406\u7cfb\u7edf\u767b\u5f55");
            label1.setIcon(new ImageIcon(getClass().getResource("/image/\u6c7d\u8f66 (1).png")));
            label1.setFont(new Font("\u7b49\u7ebf Light", Font.BOLD, 20));

            //---- label2 ----
            label2.setText("\u7528\u6237\u540d");
            label2.setFont(new Font("\u7b49\u7ebf Light", Font.PLAIN, 16));
            label2.setIcon(new ImageIcon(getClass().getResource("/image/\u7528\u6237_\u586b\u5145.png")));

            //---- username ----
            username.setOpaque(false);

            //---- label3 ----
            label3.setText("\u5bc6\u7801");
            label3.setFont(new Font("\u7b49\u7ebf Light", Font.PLAIN, 16));
            label3.setIcon(new ImageIcon(getClass().getResource("/image/\u5bc6\u7801.png")));

            //---- loginButton ----
            loginButton.setText("\u767b\u5f55");
            loginButton.setOpaque(false);
            loginButton.addActionListener(e -> login(e));

            //---- button1 ----
            button1.setText("\u505c\u8f66");
            button1.addActionListener(e -> park(e));

            //---- button2 ----
            button2.setText("\u91cd\u7f6e");
            button2.addActionListener(e -> reset(e));

            //---- label4 ----
            label4.setIcon(new ImageIcon(getClass().getResource("/image/img.png")));
            label4.setMaximumSize(new Dimension(586, 113));
            label4.setMinimumSize(new Dimension(586, 113));

            GroupLayout dialogPaneLayout = new GroupLayout(dialogPane);
            dialogPaneLayout.setHonorsVisibility(false);
            dialogPane.setLayout(dialogPaneLayout);
            dialogPaneLayout.setHorizontalGroup(
                dialogPaneLayout.createParallelGroup()
                    .addGroup(dialogPaneLayout.createSequentialGroup()
                        .addGroup(dialogPaneLayout.createParallelGroup()
                            .addGroup(dialogPaneLayout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.TRAILING, dialogPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label2)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(dialogPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(dialogPaneLayout.createSequentialGroup()
                                .addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
                            .addComponent(username, GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(password, GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(button2)
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, dialogPaneLayout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label1)
                        .addGap(182, 182, 182))
                    .addComponent(label4, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
            );
            dialogPaneLayout.setVerticalGroup(
                dialogPaneLayout.createParallelGroup()
                    .addGroup(dialogPaneLayout.createSequentialGroup()
                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(dialogPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(username, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(dialogPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label3)
                            .addComponent(button2)
                            .addComponent(password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(dialogPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(loginButton)
                            .addComponent(button1))
                        .addGap(38, 38, 38))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(dialogPane, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(dialogPane, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    private void resetValue() {
        username.setText("");
        password.setText("");
    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel dialogPane;
    private JLabel label1;
    private JLabel label2;
    private JTextField username;
    private JLabel label3;
    private JButton loginButton;
    private JButton button1;
    private JButton button2;
    private JPasswordField password;
    private JLabel label4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
