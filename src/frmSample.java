import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class frmSample extends JFrame implements ActionListener{
	JButton btn00, btn01, btn02, btn10, btn11, btn12, btn20, btn21, btn22;
	int player = 1;
	int array[][] = new int[3][3];
	Random r = new Random();
	int btnCount = 0;

	public frmSample() {
		// TODO Auto-generated constructor stub
		setSize(374, 397);
		setTitle("Tic-Tac-Toe Game");
		setLayout(null);
		setResizable(false);
		setLocation(Toolkit.getDefaultToolkit().getScreenSize().width/3, Toolkit.getDefaultToolkit().getScreenSize().height/5);
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\eclipse_project\\Tic Tac Toe\\src\\tic-tac-toe.png"));

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				array[i][j] = r.nextInt(1000);
			}
		}

		setBackground(Color.red);

		btn00 = new JButton();
		add(btn00);
		btn00.setBounds(0, 0, 120, 120);
		btn00.addActionListener(this);
		btn00.setFont(new Font("Aerial", Font.BOLD, 70));
		btn00.setBackground(Color.white);
		btn00.setBorder(BorderFactory.createLineBorder(Color.black));
		btn00.setCursor(new Cursor(HAND_CURSOR));

		btn01 = new JButton();
		add(btn01);
		btn01.setBounds(120, 0, 120, 120);
		btn01.addActionListener(this);
		btn01.setFont(new Font("Aerial", Font.BOLD, 70));
		btn01.setBackground(Color.white);
		btn01.setBorder(BorderFactory.createLineBorder(Color.black));
		btn01.setCursor(new Cursor(HAND_CURSOR));

		btn02 = new JButton();
		add(btn02);
		btn02.setBounds(240, 0, 120, 120);
		btn02.addActionListener(this);
		btn02.setFont(new Font("Aerial", Font.BOLD, 70));
		btn02.setBackground(Color.white);
		btn02.setBorder(BorderFactory.createLineBorder(Color.black));
		btn02.setCursor(new Cursor(HAND_CURSOR));

		btn10 = new JButton();
		add(btn10);
		btn10.setBounds(0, 120, 120, 120);
		btn10.addActionListener(this);
		btn10.setFont(new Font("Aerial", Font.BOLD, 70));
		btn10.setBackground(Color.white);
		btn10.setBorder(BorderFactory.createLineBorder(Color.black));
		btn10.setCursor(new Cursor(HAND_CURSOR));

		btn11 = new JButton();
		add(btn11);
		btn11.setBounds(120, 120, 120, 120);
		btn11.addActionListener(this);
		btn11.setFont(new Font("Aerial", Font.BOLD, 70));
		btn11.setBackground(Color.white);
		btn11.setBorder(BorderFactory.createLineBorder(Color.black));
		btn11.setCursor(new Cursor(HAND_CURSOR));

		btn12 = new JButton();
		add(btn12);
		btn12.setBounds(240, 120, 120, 120);
		btn12.addActionListener(this);
		btn12.setFont(new Font("Aerial", Font.BOLD, 70));
		btn12.setBackground(Color.white);
		btn12.setBorder(BorderFactory.createLineBorder(Color.black));
		btn12.setCursor(new Cursor(HAND_CURSOR));

		btn20 = new JButton();
		add(btn20);
		btn20.setBounds(0, 240, 120, 120);
		btn20.addActionListener(this);
		btn20.setFont(new Font("Aerial", Font.BOLD, 70));
		btn20.setBackground(Color.white);
		btn20.setBorder(BorderFactory.createLineBorder(Color.black));
		btn20.setCursor(new Cursor(HAND_CURSOR));

		btn21 = new JButton();
		add(btn21);
		btn21.setBounds(120, 240, 120, 120);
		btn21.addActionListener(this);
		btn21.setFont(new Font("Aerial", Font.BOLD, 70));
		btn21.setBackground(Color.white);
		btn21.setBorder(BorderFactory.createLineBorder(Color.black));
		btn21.setCursor(new Cursor(HAND_CURSOR));

		btn22 = new JButton();
		add(btn22);
		btn22.setBounds(240, 240, 120, 120);
		btn22.addActionListener(this);
		btn22.setFont(new Font("Aerial", Font.BOLD, 70));
		btn22.setBackground(Color.white);
		btn22.setBorder(BorderFactory.createLineBorder(Color.black));
		btn22.setCursor(new Cursor(HAND_CURSOR));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try
		{
			if(e.getSource() == btn00)
			{
				if(player == 1)
				{
					array[0][0] = 1;
					btn00.setText("O");

					check();

					player = 2;
				}
				else if(player == 2)
				{
					array[0][0] = 2;
					btn00.setText("X");

					check();

					player = 1;
				}
				btn00.setEnabled(false);
				btn00.setBackground(Color.yellow);

				tieCondition();
			}
			if(e.getSource() == btn01)
			{
				if(player == 1)
				{
					array[0][1] = 1;
					btn01.setText("O");

					check();

					player = 2;
				}
				else if(player == 2)
				{
					array[0][1] = 2;
					btn01.setText("X");

					check();

					player = 1;
				}
				btn01.setEnabled(false);
				btn01.setBackground(Color.yellow);

				tieCondition();
			}
			if(e.getSource() == btn02)
			{
				if(player == 1)
				{
					array[0][2] = 1;
					btn02.setText("O");

					check();

					player = 2;
				}
				else if(player == 2)
				{
					array[0][2] = 2;
					btn02.setText("X");

					check();

					player = 1;
				}
				btn02.setEnabled(false);
				btn02.setBackground(Color.yellow);

				tieCondition();
			}
			if(e.getSource() == btn10)
			{
				if(player == 1)
				{
					array[1][0] = 1;
					btn10.setText("O");

					check();

					player = 2;
				}
				else if(player == 2)
				{
					array[1][0] = 2;
					btn10.setText("X");

					check();

					player = 1;
				}
				btn10.setEnabled(false);
				btn10.setBackground(Color.yellow);

				tieCondition();
			}
			if(e.getSource() == btn11)
			{
				if(player == 1)
				{
					array[1][1] = 1;
					btn11.setText("O");

					check();

					player = 2;
				}
				else if(player == 2)
				{
					array[1][1] = 2;
					btn11.setText("X");

					check();

					player = 1;
				}
				btn11.setEnabled(false);
				btn11.setBackground(Color.yellow);

				tieCondition();
			}
			if(e.getSource() == btn12)
			{
				if(player == 1)
				{
					array[1][2] = 1;
					btn12.setText("O");

					check();

					player = 2;
				}
				else if(player == 2)
				{
					array[1][2] = 2;
					btn12.setText("X");

					check();

					player = 1;
				}
				btn12.setEnabled(false);
				btn12.setBackground(Color.yellow);

				tieCondition();
			}
			if(e.getSource() == btn20)
			{
				if(player == 1)
				{
					array[2][0] = 1;
					btn20.setText("O");

					check();

					player = 2;
				}
				else if(player == 2)
				{array[2][0] = 2;
					btn20.setText("X");

					check();

					player = 1;
				}
				btn20.setEnabled(false);
				btn20.setBackground(Color.yellow);

				tieCondition();
			}
			if(e.getSource() == btn21)
			{
				if(player == 1)
				{
					array[2][1] = 1;
					btn21.setText("O");

					check();

					player = 2;
				}
				else if(player == 2)
				{
					array[2][1] = 2;
					btn21.setText("X");

					check();

					player = 1;
				}
				btn21.setEnabled(false);
				btn21.setBackground(Color.yellow);

				tieCondition();
			}
			if(e.getSource() == btn22)
			{
				if(player == 1)
				{
					array[2][2] = 1;
					btn22.setText("O");

					check();

					player = 2;
				}
				else if(player == 2)
				{
					array[2][2] = 2;
					btn22.setText("X");

					check();

					player = 1;
				}
				btn22.setEnabled(false);
				btn22.setBackground(Color.yellow);

				tieCondition();
			}
			Toolkit.getDefaultToolkit().beep();
		}
		catch(Exception ex){}
	}
	public void check()
	{
		if(player == 1)
		{
			if((array[0][0] == array[1][0] && array[1][0] == array[2][0]) || (array[2][0] == array[2][1] && array[2][1] == array[2][2]) || (array[0][2] == array[1][2] && array[1][2] == array[2][2]) || (array[0][0] == array[0][1] && array[0][1] == array[0][2]) || (array[0][0] == array[1][1] && array[1][1] == array[2][2]) || (array[0][2] == array[1][1] && array[1][1] == array[2][0]) || (array[0][1] == array[1][1] && array[1][1] == array[2][1]) || (array[1][0] == array[1][1] && array[1][1] == array[1][2]))
			{
				setColor();
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showMessageDialog(null, "PLAYER-1(O) WON", "Winner", JOptionPane.PLAIN_MESSAGE);
				System.exit(7);
			}
		}
		else if(player == 2)
		{
			if((array[0][0] == array[1][0] && array[1][0] == array[2][0]) || (array[2][0] == array[2][1] && array[2][1] == array[2][2]) || (array[0][2] == array[1][2] && array[1][2] == array[2][2]) || (array[0][0] == array[0][1] && array[0][1] == array[0][2]) || (array[0][0] == array[1][1] && array[1][1] == array[2][2]) || (array[0][2] == array[1][1] && array[1][1] == array[2][0])  || (array[0][1] == array[1][1] && array[1][1] == array[2][1]) || (array[1][0] == array[1][1] && array[1][1] == array[1][2]))
			{
				setColor();
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showMessageDialog(null, "PLAYER-2(X) WON", "Winner", JOptionPane.PLAIN_MESSAGE);
				System.exit(7);
			}
		}
	}
	void setColor()
	{
		if(array[0][0] == array[1][0] && array[1][0] == array[2][0])
		{
			btn00.setBackground(Color.RED);
			btn10.setBackground(Color.RED);
			btn20.setBackground(Color.RED);
		}
		else if(array[2][0] == array[2][1] && array[2][1] == array[2][2])
		{
			btn20.setBackground(Color.RED);
			btn21.setBackground(Color.RED);
			btn22.setBackground(Color.RED);
		}
		else if(array[0][2] == array[1][2] && array[1][2] == array[2][2])
		{
			btn02.setBackground(Color.RED);
			btn12.setBackground(Color.RED);
			btn22.setBackground(Color.RED);
		}
		else if(array[0][0] == array[0][1] && array[0][1] == array[0][2])
		{
			btn00.setBackground(Color.RED);
			btn01.setBackground(Color.RED);
			btn02.setBackground(Color.RED);
		}
		else if(array[0][0] == array[1][1] && array[1][1] == array[2][2])
		{
			btn00.setBackground(Color.RED);
			btn11.setBackground(Color.RED);
			btn22.setBackground(Color.RED);
		}
		else if(array[0][2] == array[1][1] && array[1][1] == array[2][0])
		{
			btn02.setBackground(Color.RED);
			btn11.setBackground(Color.RED);
			btn20.setBackground(Color.RED);
		}
		else if(array[0][1] == array[1][1] && array[1][1] == array[2][1])
		{
			btn01.setBackground(Color.RED);
			btn11.setBackground(Color.RED);
			btn21.setBackground(Color.RED);
		}
		else if(array[1][0] == array[1][1] && array[1][1] == array[1][2])
		{
			btn10.setBackground(Color.RED);
			btn11.setBackground(Color.RED);
			btn12.setBackground(Color.RED);
		}
	}
	void tieCondition()
	{
		btnCount++;
		if(btnCount == 9)
		{
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog(null, "Match Tied", "Tie", JOptionPane.WARNING_MESSAGE);
			System.exit(7);
		}
	}
}
