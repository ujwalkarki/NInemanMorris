package main;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class UIGameMenu {
	
	public UIGameMenu(){
		JMenu file = new JMenu("File");
		JMenuItem main = new JMenuItem("Main Menu");
		JMenuItem reset = new JMenuItem("Reset");
		JMenuItem exit = new JMenuItem("Exit");
		
		file.add(main);
		file.add(reset);
		file.add(exit);
		
		main.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				gameView.startScreen();
			}
		});
		
		reset.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				gameView.resetGame();
			}
		});
		
		exit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		
		
		JMenu help = new JMenu("Help");
		JMenuItem howTo = new JMenuItem("How To Play");
		help.add(howTo);
		
		howTo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				new Dialog(new UIGameInstructions(), "Alert", false);
			}
		});
		
		this.add(file);
		this.add(edit);
		this.add(help);
	}
	
	public void setEnabledUndo(boolean isEnable){
		this.undo.setEnabled(isEnable);
	}
}