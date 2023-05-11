import java.swing.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame TELA = new JFrame ("Alo, Mundo");
		JLabel TEXTO = new JLabel ("Linguagem Java");
		
		TELA.setLayout(null);
		TELA.getContentPane() .add(TEXTO);
		
		TEXTO.setBounds(30, 20, 210, 20);
		
		TELA.setSize(280,100);
		TELA.setVisible(true);
		TELA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
