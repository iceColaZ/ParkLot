/*
 * Created by JFormDesigner on Sat Dec 17 17:59:38 CST 2022
 */

package com.K1ez.view;

import com.K1ez.conn.QueryDao;
import com.K1ez.model.CarInf;
import com.K1ez.model.Record;

import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.Vector;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.*;

/**
 * @author ������2101���ȳ�
 */
public class RecordQuery extends JFrame {
    /**
     * �˷��������ռ����ݿⷵ�صĽ�������б������ñ��
     * @param record
     */
    private void setTable(Record record){
        DefaultTableModel dft = (DefaultTableModel) cartable.getModel();//���ñ��Ĭ��ģ��
        dft.setRowCount(0);
        QueryDao queryDao = new QueryDao();//����ӿ��࣬׼���������ݿ�����
        List<Record> recordList = queryDao.getRecordList(record);//�����µ�List�����ڴ洢���ݿⷵ�ص�ֵ
        for(Record rec:recordList){//for������recordList�е����ݴ洢��Vector�У������β����趨�õı��
            Vector v = new Vector();
            v.add(rec.getCarId());
            v.add(rec.getColor());
            v.add(rec.getLotId());
            v.add(rec.getDriver());
            v.add(rec.getEntrydate());
            v.add(rec.getEntrytime());
            dft.addRow(v);
        }
    }

    public RecordQuery() {
        initComponents();
    }

    /**
     * �������ר���ڼ��������е����ݲ����ݵ�setTable��
     * @param e
     */
    private void search(ActionEvent e) {
        Record record = new Record();//���ڴ���������ݵ�����
        record.setCarId(searchtextfield.getText().toString());//��������л�ȡ����������
        setTable(record);//ִ�����������ɱ��
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        searchtextfield = new JTextField();
        label1 = new JLabel();
        searchbutton = new JButton();
        scrollPane1 = new JScrollPane();
        cartable = new JTable();

        //======== this ========
        setTitle("\u505c\u8f66\u8bb0\u5f55\u67e5\u8be2");
        setIconImage(new ImageIcon(getClass().getResource("/image/\u6c7d\u8f66 (2).png")).getImage());
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("\u8f66\u724c\u53f7\uff1a");
        label1.setFont(new Font("\u7b49\u7ebf Light", Font.BOLD, 16));
        label1.setIcon(new ImageIcon(getClass().getResource("/image/\u6c7d\u8f66 (2).png")));

        //---- searchbutton ----
        searchbutton.setText("\u67e5\u8be2");
        searchbutton.setIcon(new ImageIcon(getClass().getResource("/image/\u6b63\u786e.png")));
        searchbutton.addActionListener(e -> search(e));

        //======== scrollPane1 ========
        {

            //---- cartable ----
            cartable.setModel(new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                    "\u8f66\u724c\u53f7", "\u6c7d\u8f66\u989c\u8272", "\u8f66\u4f4d\u53f7", "\u9a7e\u9a76\u5458", "\u767b\u8bb0\u65e5\u671f", "\u767b\u8bb0\u65f6\u95f4"
                }
            ));
            scrollPane1.setViewportView(cartable);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(115, 115, 115)
                    .addComponent(label1)
                    .addGap(18, 18, 18)
                    .addComponent(searchtextfield, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(searchbutton)
                    .addContainerGap(125, Short.MAX_VALUE))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(searchtextfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label1)
                        .addComponent(searchbutton))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JTextField searchtextfield;
    private JLabel label1;
    private JButton searchbutton;
    private JScrollPane scrollPane1;
    private JTable cartable;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
