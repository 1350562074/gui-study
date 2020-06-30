package com.hao.lesson02;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionEvent {

	public static void main(String[] args) {
		// 按下按钮，触发一些事件
		Frame frame = new Frame();
		Button button = new Button();
		
		//因为addActionListener()需要ActionListener
		MyActionListener myActionListener = new MyActionListener();
		button.addActionListener(myActionListener);
		
		frame.add(button,BorderLayout.CENTER);
		frame.pack();
		
		windowClose(frame);
		frame.setVisible(true);
	}
	
	private static void windowClose(Frame frame) {
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}

}

//事件监听
class MyActionListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("aaa");
	}
}
