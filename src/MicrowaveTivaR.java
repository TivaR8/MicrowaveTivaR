import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MicrowaveTivaR {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MicrowaveTivaR window = new MicrowaveTivaR();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MicrowaveTivaR() {
		initialize();
		// Put all of the Global variables here.
		double TWOITEMS = 0.5;
		double THREEITEMS = 1;
		
		// All in seconds of how long it should be in for
		double SUBTIME = 60;
		double PIZZATIME = 45;
		double SOUPTIME = 135;
		
		// Booleans
		boolean subSelected = false;
		boolean pizzaSelected = false;
		boolean soupSelected = false;
		boolean oneItemSelected = false;
		boolean twoItemsSelected = false;
		boolean threeItemsSelected = false;
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 20, 147));
		frame.setBounds(100, 100, 408, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSub = new JButton("Sub");
		btnSub.addActionListener(new ActionListener() {
			// Sub
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSub.setBounds(10, 36, 89, 23);
		frame.getContentPane().add(btnSub);
		
		JButton btnPizza = new JButton("Pizza");
		btnPizza.addActionListener(new ActionListener() {
			// Pizza
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPizza.setBounds(143, 36, 89, 23);
		frame.getContentPane().add(btnPizza);
		
		JButton btnSoup = new JButton("Soup");
		btnSoup.addActionListener(new ActionListener() {
			// Soup
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSoup.setBounds(275, 36, 89, 23);
		frame.getContentPane().add(btnSoup);
		
		JLabel lblQuestionFood = new JLabel("Select the food:");
		lblQuestionFood.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuestionFood.setBounds(10, 11, 354, 14);
		frame.getContentPane().add(lblQuestionFood);
		
		JLabel lblQuestionItemNum = new JLabel("Select number of items:");
		lblQuestionItemNum.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuestionItemNum.setBounds(10, 88, 354, 14);
		frame.getContentPane().add(lblQuestionItemNum);
		
		JButton btnOneItem = new JButton("1");
		btnOneItem.addActionListener(new ActionListener() {
			// One Item
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOneItem.setBounds(10, 113, 89, 23);
		frame.getContentPane().add(btnOneItem);
		
		JButton btnTwoItems = new JButton("2");
		btnTwoItems.addActionListener(new ActionListener() {
			// Two Items
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTwoItems.setBounds(143, 113, 89, 23);
		frame.getContentPane().add(btnTwoItems);
		
		JButton btnThreeItems = new JButton("3");
		btnThreeItems.addActionListener(new ActionListener() {
			// Three Items
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThreeItems.setBounds(275, 113, 89, 23);
		frame.getContentPane().add(btnThreeItems);
		
		JLabel lblAnswer = new JLabel("=");
		lblAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer.setBounds(10, 173, 354, 14);
		frame.getContentPane().add(lblAnswer);
	}
}
