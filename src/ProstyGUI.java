import java.awt.Dimension;

import javax.swing.*;
public class ProstyGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame ramka = new JFrame();
		JButton przycisk = new JButton("Kliknij mnie teraz!");
		przycisk.setLabel("Etykieta");
		
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ramka.getContentPane().add(przycisk);
		ramka.setSize(300, 300);
		ramka.setVisible(true);
	}

}
