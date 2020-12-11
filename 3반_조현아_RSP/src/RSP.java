import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class RSP extends JFrame implements ActionListener {
	
	static final int ROCK = 0;
	static final int SCISSOR = 1;
	static final int PAPER = 2;
	
	JTextField information, output;
	JPanel panel;
	JButton rock, scissor, paper;
	
	RSP() {
		setTitle("°Ô°Õº¸");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 3));
		
		
		information = new JTextField();
		information.setText("Select one of the buttons below!");
		
		output = new JTextField(20);
		
		rock = new JButton("ROCK");
		scissor = new JButton("SCISSOR");
		paper = new JButton("PAPER");
		
		rock.addActionListener(this);
		scissor.addActionListener(this);
		paper.addActionListener(this);
		
		panel.add(rock);
		panel.add(scissor);
		panel.add(paper);
		
		add(information, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		add(output, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Random r = new Random();
		int computer = r.nextInt(3);
		
		if(e.getSource() == rock)
			if(computer == ROCK)
				output.setText("It's a tie");
			else if(computer == SCISSOR)
				output.setText("User Won!");
			else 
				output.setText("The Computer Won!");
		
		else if(e.getSource() == scissor)
			if(computer == ROCK)
				output.setText("The Computer Won!");
			else if(computer == SCISSOR)
				output.setText("It's a tie");
			else 
				output.setText("User Won!");
		
		else
			if(computer == ROCK)
				output.setText("User Won!");
			else if(computer == SCISSOR)
				output.setText("The Computer Won!");
			else 
				output.setText("It's a tie");
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RSP start = new RSP();

	}

}
