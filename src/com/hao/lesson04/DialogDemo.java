package com.hao.lesson04;

import java.awt.Container;
import java.awt.Dialog;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

//主窗口
public class DialogDemo  extends JFrame{
	
	public DialogDemo() {
		this.setVisible(true);
		this.setSize(700,500);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//JFrame 放东西，容器
		Container container = this.getContentPane();
		//绝对布局
		container.setLayout(null);
		//按钮
		JButton button = new JButton("点击弹出一个对话框");
		button.setBounds(30,30,200,50);
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//弹窗
				MyDialogDemo myDialogDemo = new MyDialogDemo();
			}
		});
		//点击这个按钮的时候，弹出一个弹框
		container.add(button);
	}
	public static void main(String[] args) {
		new DialogDemo();
	}
}

//弹出的窗口
class MyDialogDemo extends JDialog{
	public MyDialogDemo() {
		this.setVisible(true);
		this.setBounds(100,100,500,500);
//		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		Container container = this.getContentPane();
		container.setLayout(null);
		container.add(new Label("学JAVA"));
	}
}