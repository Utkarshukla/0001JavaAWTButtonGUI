package com.UI;

import java.awt.*;
import java.awt.event.*;
// only awt UI
class MyFrame extends Frame implements ActionListener {
	/**
	 * For serialization
	 */
	private static final long serialVersionUID = 1L;
	int count =0;
	Label l;
	Button b;
	public MyFrame() {
		super("Button Demo");
		l = new Label("  "+count);
		b = new Button("Click Me");
		setLayout(new FlowLayout());
		add(l);
		add(b);
		b.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		e.getActionCommand();
		if (e.getSource() == b) {
			count++;
			l.setText("  " + count);
		}
	}
}

/**
 * @author Utkarsh Shukla
 * @description First GUI program using AWT 
 */
public class Main {

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
		f.setSize(400, 400);
		f.setVisible(true);
		
	}

}
