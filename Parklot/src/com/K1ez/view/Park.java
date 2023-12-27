/*
 * Created by JFormDesigner on Wed Dec 14 02:31:07 CST 2022
 */
package com.K1ez.view;
import com.K1ez.conn.ParkDao;
import com.K1ez.conn.QueryDao;
import com.K1ez.model.CarInf;
import com.K1ez.util.StringUtil;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author 物联网2101张奕辰
 */
public class Park extends JFrame {
    public Park() {
        initComponents();
    }

    private void ParkAction(ActionEvent e) {
        String carid = CarId.getText().toString();
        String color = Color.getText().toString();
        String driver = Driver.getText().toString();
        int lotid = comboBox1.getSelectedIndex() + 1;
        if(StringUtil.isEmpty(carid)){
            JOptionPane.showMessageDialog(this,"车牌号不能为空");
            return;
        }

        if(StringUtil.isEmpty(color)){
            JOptionPane.showMessageDialog(this,"汽车颜色未填写");
            return;
        }

        if(StringUtil.isEmpty(driver)){
            JOptionPane.showMessageDialog(this,"请填写驾驶人姓名");
            return;
        }

        ParkDao parkDao = new ParkDao();
        ParkDao parkrec = new ParkDao();
        CarInf cartmp = new CarInf();
        cartmp.setCarId(carid);
        cartmp.setColor(color);
        cartmp.setDriver(driver);
        cartmp.setLotid(lotid);

        boolean car = parkDao.Park(cartmp);
        if(car == false){
            JOptionPane.showMessageDialog(this,"车牌号填写错误或车位已满");
        }
        else {
            JOptionPane.showMessageDialog(this,"停车成功");
            boolean carrec = parkrec.Record(cartmp);
            if(carrec == false){
                JOptionPane.showMessageDialog(this,"Error");
            }
        }
    }

    private void reset(ActionEvent e) {
        this.CarId.setText("");
        this.Color.setText("");
        this.Driver.setText("");// TODO add your code here
    }

    private void back(ActionEvent e) {
        this.dispose();
        login log = new login();
    }

    private void Entry(ActionEvent e) {
        ParkAction(e);
    }

    private void Park(ActionEvent e) {
        // TODO add your code here
    }

    private void Out(ActionEvent e) {
        this.dispose();
        Goout go = new Goout();
    }

    private void Check(ActionEvent e) {
        QueryDao queryDao = new QueryDao();
        String str = queryDao.Lotqry();
        if(str == null){
            JOptionPane.showMessageDialog(this,"车位目前已满！");
        }else{
            JOptionPane.showMessageDialog(this,"目前车位"+str+"为空");
        }
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        dialogPane = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        CarId = new JTextField();
        label3 = new JLabel();
        Color = new JTextField();
        button2 = new JButton();
        label5 = new JLabel();
        Driver = new JTextField();
        button1 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        comboBox1 = new JComboBox<>();
        label6 = new JLabel();
        button5 = new JButton();
        label4 = new JLabel();

        //======== this ========
        setTitle("\u6cca\u8f66\u767b\u8bb0");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/image/\u5bc6\u7801.png")).getImage());
        setVisible(true);
        var contentPane = getContentPane();

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setOpaque(false);

            //---- label1 ----
            label1.setText("\u5165\u5e93\u767b\u8bb0");
            label1.setIcon(new ImageIcon(getClass().getResource("/image/\u6c7d\u8f66 (1).png")));
            label1.setFont(new Font("\u7b49\u7ebf Light", Font.BOLD, 24));

            //---- label2 ----
            label2.setText("\u8f66\u724c\u53f7");
            label2.setFont(new Font("\u7b49\u7ebf Light", Font.PLAIN, 16));
            label2.setIcon(new ImageIcon(getClass().getResource("/image/\u7528\u6237-\u5706.png")));

            //---- CarId ----
            CarId.setOpaque(false);

            //---- label3 ----
            label3.setText("\u6c7d\u8f66\u989c\u8272");
            label3.setFont(new Font("\u7b49\u7ebf Light", Font.PLAIN, 16));
            label3.setIcon(new ImageIcon(getClass().getResource("/image/\u5bc6\u7801.png")));

            //---- Color ----
            Color.setOpaque(false);

            //---- button2 ----
            button2.setText("\u91cd\u7f6e");
            button2.addActionListener(e -> reset(e));

            //---- label5 ----
            label5.setText("\u9a7e\u9a76\u4eba");
            label5.setFont(new Font("\u7b49\u7ebf Light", Font.PLAIN, 16));
            label5.setIcon(new ImageIcon(getClass().getResource("/image/\u7528\u6237_\u586b\u5145.png")));

            //---- button1 ----
            button1.setText("\u767b\u8bb0");
            button1.addActionListener(e -> {
			Park(e);
			Park(e);
			Entry(e);
		});

            //---- button3 ----
            button3.setText("< \u8fd4\u56de");
            button3.addActionListener(e -> back(e));

            //---- button4 ----
            button4.setText("\u67e5\u770b\u8f66\u4f4d");
            button4.addActionListener(e -> Check(e));

            //---- comboBox1 ----
            comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
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

            //---- label6 ----
            label6.setText("\u9009\u62e9\u8f66\u4f4d");
            label6.setFont(new Font("\u7b49\u7ebf Light", Font.PLAIN, 16));
            label6.setIcon(new ImageIcon(getClass().getResource("/image/\u5bc6\u7801.png")));

            //---- button5 ----
            button5.setText("\u767b\u51fa");
            button5.addActionListener(e -> Out(e));

            GroupLayout dialogPaneLayout = new GroupLayout(dialogPane);
            dialogPaneLayout.setHonorsVisibility(false);
            dialogPane.setLayout(dialogPaneLayout);
            dialogPaneLayout.setHorizontalGroup(
                dialogPaneLayout.createParallelGroup()
                    .addGroup(dialogPaneLayout.createSequentialGroup()
                        .addGroup(dialogPaneLayout.createParallelGroup()
                            .addGroup(dialogPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(button3)
                                .addGap(108, 108, 108)
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))
                            .addGroup(dialogPaneLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(dialogPaneLayout.createParallelGroup()
                                    .addGroup(dialogPaneLayout.createSequentialGroup()
                                        .addGroup(dialogPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addGroup(dialogPaneLayout.createSequentialGroup()
                                                .addComponent(label5)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Driver, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(dialogPaneLayout.createSequentialGroup()
                                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(button5, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(dialogPaneLayout.createParallelGroup()
                                            .addComponent(label6)
                                            .addGroup(dialogPaneLayout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(button4)
                                                .addGap(30, 30, 30)
                                                .addComponent(button2, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(dialogPaneLayout.createSequentialGroup()
                                        .addComponent(label2)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CarId, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(dialogPaneLayout.createParallelGroup()
                                            .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Color, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            dialogPaneLayout.setVerticalGroup(
                dialogPaneLayout.createParallelGroup()
                    .addGroup(dialogPaneLayout.createSequentialGroup()
                        .addGroup(dialogPaneLayout.createParallelGroup()
                            .addComponent(button3)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(dialogPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                            .addComponent(CarId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3)
                            .addComponent(Color, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(dialogPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label5)
                            .addComponent(Driver, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6)
                            .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(dialogPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button1)
                            .addComponent(button2)
                            .addComponent(button4)
                            .addComponent(button5))
                        .addContainerGap(33, Short.MAX_VALUE))
            );
        }

        //---- label4 ----
        label4.setIcon(new ImageIcon(getClass().getResource("/image/img.png")));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(dialogPane, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 610, GroupLayout.PREFERRED_SIZE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(dialogPane, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel dialogPane;
    private JLabel label1;
    private JLabel label2;
    private JTextField CarId;
    private JLabel label3;
    private JTextField Color;
    private JButton button2;
    private JLabel label5;
    private JTextField Driver;
    private JButton button1;
    private JButton button3;
    private JButton button4;
    private JComboBox<String> comboBox1;
    private JLabel label6;
    private JButton button5;
    private JLabel label4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
