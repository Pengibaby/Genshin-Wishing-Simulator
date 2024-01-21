import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class MainWindow {

	private JFrame frame;
	private ArrayList<JTextField> listOfPullDisplays = new ArrayList();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Gacha Simulator");
		frame.setBounds(50, 50, 923, 760);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setVisible(true);
		
		
		
		//Creates the objects.
		FiveStar fivestarObj = new FiveStar();
		FourStar fourstarObj = new FourStar();
		ThreeStar threestarObj = new ThreeStar();
		
		
		
		//Pull displays
		//Pull number one display
		JTextField pullOne = new JTextField();
		pullOne.setEditable(false);
		pullOne.setHorizontalAlignment(JTextField.CENTER);
		pullOne.setBounds(10, 150, 154, 73);
		frame.getContentPane().add(pullOne);
		pullOne.setColumns(10);
		
		//Pull number two display
		JTextField pullTwo = new JTextField();
		pullTwo.setEditable(false);
		pullTwo.setHorizontalAlignment(JTextField.CENTER);
		pullTwo.setBounds(190, 150, 154, 73);
		frame.getContentPane().add(pullTwo);
		pullTwo.setColumns(10);
		
		//Pukk number three display
		JTextField pullThree = new JTextField();
		pullThree.setEditable(false);
		pullThree.setHorizontalAlignment(JTextField.CENTER);
		pullThree.setBounds(375, 150, 154, 73);
		frame.getContentPane().add(pullThree);
		pullThree.setColumns(10);
		
		//Pull number four display
		JTextField pullFour = new JTextField();
		pullFour.setEditable(false);
		pullFour.setHorizontalAlignment(JTextField.CENTER);
		pullFour.setBounds(560, 150, 154, 73);
		frame.getContentPane().add(pullFour);
		pullFour.setColumns(10);
		
		//Pull number five display
		JTextField pullFive = new JTextField();
		pullFive.setEditable(false);
		pullFive.setHorizontalAlignment(JTextField.CENTER);
		pullFive.setBounds(743, 150, 154, 73);
		frame.getContentPane().add(pullFive);
		pullFive.setColumns(10);
		
		//Pull number six display
		JTextField pullSix = new JTextField();
		pullSix.setEditable(false);
		pullSix.setHorizontalAlignment(JTextField.CENTER);
		pullSix.setBounds(10, 312, 154, 73);
		frame.getContentPane().add(pullSix);
		pullSix.setColumns(10);
		
		//Pull number seven display
		JTextField pullSeven = new JTextField();
		pullSeven.setEditable(false);
		pullSeven.setHorizontalAlignment(JTextField.CENTER);
		pullSeven.setBounds(190, 312, 154, 73);
		frame.getContentPane().add(pullSeven);
		pullSeven.setColumns(10);
		
		//Pukk number eight display
		JTextField pullEight = new JTextField();
		pullEight.setEditable(false);
		pullEight.setHorizontalAlignment(JTextField.CENTER);
		pullEight.setBounds(375, 312, 154, 73);
		frame.getContentPane().add(pullEight);
		pullEight.setColumns(10);
		
		//Pull number nine display
		JTextField pullNine = new JTextField();
		pullNine.setEditable(false);
		pullNine.setHorizontalAlignment(JTextField.CENTER);
		pullNine.setBounds(560, 312, 154, 73);
		frame.getContentPane().add(pullNine);
		pullNine.setColumns(10);
		
		//Pull number ten display
		JTextField pullTen = new JTextField();
		pullTen.setEditable(false);
		pullTen.setHorizontalAlignment(JTextField.CENTER);
		pullTen.setBounds(743, 312, 154, 73);
		frame.getContentPane().add(pullTen);
		pullTen.setColumns(10);
		
		//Add all display textfields to the array list in order.
		this.listOfPullDisplays.add(pullOne);
		this.listOfPullDisplays.add(pullTwo);
		this.listOfPullDisplays.add(pullThree);
		this.listOfPullDisplays.add(pullFour);
		this.listOfPullDisplays.add(pullFive);
		this.listOfPullDisplays.add(pullSix);
		this.listOfPullDisplays.add(pullSeven);
		this.listOfPullDisplays.add(pullEight);
		this.listOfPullDisplays.add(pullNine);
		this.listOfPullDisplays.add(pullTen);
		
		
		//Pity Labels
		//Current five star pity label
		JLabel CurrentPityLabel = new JLabel("Current 5* Pity:");
		CurrentPityLabel.setBounds(28, 46, 112, 14);
		CurrentPityLabel.setFont(new Font("Arial", Font.BOLD, 14));
		frame.getContentPane().add(CurrentPityLabel);
		
		//five star pity number label
		JLabel fiveStarPityLabel = new JLabel("0");
		fiveStarPityLabel.setBounds(141, 46, 56, 14);
		fiveStarPityLabel.setFont(new Font("Arial", Font.BOLD, 14));
		frame.getContentPane().add(fiveStarPityLabel);
		
		//Current four star pity label
		JLabel CurrentFourPityLabel = new JLabel("Current 4* Pity:");
		CurrentFourPityLabel.setBounds(217, 46, 112, 14);
		CurrentFourPityLabel.setFont(new Font("Arial", Font.BOLD, 14));
		frame.getContentPane().add(CurrentFourPityLabel);
		
		//four star pity number label
		JLabel fourStarPityLabel = new JLabel("0");
		fourStarPityLabel.setBounds(332, 46, 56, 14);
		fourStarPityLabel.setFont(new Font("Arial", Font.BOLD, 14));
		frame.getContentPane().add(fourStarPityLabel);
		
		//50/50 label
		JLabel fiftyFiftyLabel = new JLabel("50/50:");
		fiftyFiftyLabel.setBounds(451, 46, 49, 14);
		fiftyFiftyLabel.setFont(new Font("Arial", Font.BOLD, 14));
		frame.getContentPane().add(fiftyFiftyLabel);
		
		//four star pity number label
		JLabel fiftyFiftyLabelYesOrNo = new JLabel("Yes");
		fiftyFiftyLabelYesOrNo.setBounds(503, 46, 56, 14);
		fiftyFiftyLabelYesOrNo.setFont(new Font("Arial", Font.BOLD, 14));
		frame.getContentPane().add(fiftyFiftyLabelYesOrNo);
		
		
		
		//Buttons
		//10 pull button
		JButton TenPullButton = new JButton("10 Pull");
		TenPullButton.setBounds(761, 29, 136, 45);
		frame.getContentPane().add(TenPullButton);
		
		//Single pull button
		JButton SinglePullButton = new JButton("1 Pull");
		SinglePullButton.setBounds(615, 29, 136, 45);
		frame.getContentPane().add(SinglePullButton);
		
		//Single pull button function
		SinglePullButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Calls the OnePull() function.
				OnePull(fivestarObj, fourstarObj, threestarObj, fiveStarPityLabel, fourStarPityLabel, fiftyFiftyLabelYesOrNo, 0);
				//Set all other textfield to opaque color and no text
				for(int i = 1; i < listOfPullDisplays.size(); i++) {
					listOfPullDisplays.get(i).setText("");
					listOfPullDisplays.get(i).setOpaque(false);
				}
			}
		});
		SinglePullButton.setFont(new Font("Arial", Font.BOLD, 18));
		
		//Ten pull button function
		TenPullButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Count of pulls starts at 0
				int count = 0;
				//While count is not 10.
				while(count != 10) {
					//Do one pull
					OnePull(fivestarObj, fourstarObj, threestarObj, fiveStarPityLabel, fourStarPityLabel, fiftyFiftyLabelYesOrNo, count);
					//Increment count.
					count++;
				}
			}
		});
		TenPullButton.setFont(new Font("Arial", Font.BOLD, 18));
	}
	
	/**
	 * Function that does a single pull on the banner.
	 * @param fivestarObj				five star pool object
	 * @param fourstarObj				four star pool object
	 * @param threestarObj				three star pool object
	 * @param fiveStarPityLabel			pity label for five stars
	 * @param fourStarPityLabel			pity label for four stars
	 * @param fiftyFiftyLabelYesOrNo	are we at a fifty fifty label
	 * @param listIndex					Index of the ArrayList of pull display labels.
	 */
	private void OnePull(FiveStar fivestarObj, FourStar fourstarObj, ThreeStar threestarObj, JLabel fiveStarPityLabel, JLabel fourStarPityLabel, JLabel fiftyFiftyLabelYesOrNo, int listIndex) {
		//Increment both 5 star and 4 star pity counter
		fivestarObj.incrementPity();
		fourstarObj.incrementPity();
		//Are we at 5 star pity
		if(fivestarObj.getPity() != 90) {
			//Set the nase rate of the 5 star and 3 star pool if the pity is 75 or higher.
			if(fivestarObj.getPity() >= 75) {
				fivestarObj.setBaseRate(fivestarObj.getBaseRate() + 20);
				threestarObj.setBaseRate(threestarObj.getBaseRate() + 20);
				System.out.println(Integer.toString(fivestarObj.getBaseRate()) + ", " + Integer.toString(threestarObj.getBaseRate()));
			}
			//not at 5 star pity, but are we at 4 star pity
			if(fourstarObj.getPity() != 10) {
				//not at 4 star pity either
				int ThreeFourFive = 1 + (int)(Math.random() * 1000);
				//Lucky to get 5 star?
				if(ThreeFourFive <= fivestarObj.getBaseRate()) {
					//Got 5 star
					fivestarObj.resetFiveStar();
					fourstarObj.resetFourStar();
					threestarObj.resetThreeStar();
					
					String fiveStarName = "";
					//Are we at 50/50
					if(fivestarObj.atFiftyFifty()) {
						//if at 50/50, generate random number, either 0 or 1
						int fiftyFiftyWin = (int)(Math.random() * 2);
						//do we win 50/50
						if(fiftyFiftyWin == 0) {
							//Lost 50/50
							fiveStarName = fivestarObj.getRandomStandardFiveStar();
							//no longer at a 50/50
							fivestarObj.setFiftyFifty(false);
							fiftyFiftyLabelYesOrNo.setText("No");
						} else {
							//win 50/50, so now we are still at a 50/50
							fiveStarName = fivestarObj.getLimitedFiveStar();
						}
					} else {
						//not at 50/50, so guranteed limited 5 star.
						fiveStarName = fivestarObj.getLimitedFiveStar();
						//now we are at 50/50
						fivestarObj.setFiftyFifty(true);
						fiftyFiftyLabelYesOrNo.setText("Yes");
					}
					
					
					fiveStarPityLabel.setText(Integer.toString(fivestarObj.getPity()));
					fourStarPityLabel.setText(Integer.toString(fourstarObj.getPity()));
					
					listOfPullDisplays.get(listIndex).setText(fiveStarName);
					listOfPullDisplays.get(listIndex).setBackground(Color.YELLOW);
					listOfPullDisplays.get(listIndex).setForeground(Color.BLACK);
					listOfPullDisplays.get(listIndex).setOpaque(true);
				} else if(ThreeFourFive >= threestarObj.getBaseRate() && ThreeFourFive < fourstarObj.getBaseRate()) {
					//Got 3 star
					String threeStarName = threestarObj.getRandomThreeStar();
					
					fiveStarPityLabel.setText(Integer.toString(fivestarObj.getPity()));
					fourStarPityLabel.setText(Integer.toString(fourstarObj.getPity()));
					
					listOfPullDisplays.get(listIndex).setText(threeStarName);
					listOfPullDisplays.get(listIndex).setBackground(Color.BLUE);
					listOfPullDisplays.get(listIndex).setForeground(Color.WHITE);
					listOfPullDisplays.get(listIndex).setOpaque(true);
				} else if(ThreeFourFive >= fourstarObj.getBaseRate()) {
					//Got 4 star
					fourstarObj.resetFourStar();
					String fourStarName = fourstarObj.getRandomFourStar();
					
					fiveStarPityLabel.setText(Integer.toString(fivestarObj.getPity()));
					fourStarPityLabel.setText(Integer.toString(fourstarObj.getPity()));
					
					listOfPullDisplays.get(listIndex).setText(fourStarName);
					listOfPullDisplays.get(listIndex).setBackground(new Color(205, 0, 255));
					listOfPullDisplays.get(listIndex).setForeground(Color.BLACK);
					listOfPullDisplays.get(listIndex).setOpaque(true);
				}
			} else {
				//at 4 star pity
				fourstarObj.resetFourStar();
				String fourStarName = fourstarObj.getRandomFourStar();
				
				fiveStarPityLabel.setText(Integer.toString(fivestarObj.getPity()));
				fourStarPityLabel.setText(Integer.toString(fourstarObj.getPity()));
				
				listOfPullDisplays.get(listIndex).setText(fourStarName);
				listOfPullDisplays.get(listIndex).setBackground(new Color(205, 0, 255));
				listOfPullDisplays.get(listIndex).setForeground(Color.BLACK);
				listOfPullDisplays.get(listIndex).setOpaque(true);
			}
		} else {
			//At 5 star pity
			fivestarObj.resetFiveStar();
			fourstarObj.resetFourStar();
			threestarObj.resetThreeStar();
			
			String fiveStarName = "";
			//Are we at 50/50
			if(fivestarObj.atFiftyFifty()) {
				//if at 50/50, generate random number, either 0 or 1
				int fiftyFiftyWin = (int)(Math.random() * 2);
				//do we win 50/50
				if(fiftyFiftyWin == 0) {
					//Lost 50/50
					fiveStarName = fivestarObj.getRandomStandardFiveStar();
					//no longer at a 50/50
					fivestarObj.setFiftyFifty(false);
					fiftyFiftyLabelYesOrNo.setText("No");
				} else {
					//win 50/50, so now we are still at a 50/50
					fiveStarName = fivestarObj.getLimitedFiveStar();
				}
			} else {
				//not at 50/50, so guranteed limited 5 star.
				fiveStarName = fivestarObj.getLimitedFiveStar();
				//now we are at 50/50
				fivestarObj.setFiftyFifty(true);
				fiftyFiftyLabelYesOrNo.setText("Yes");
			}
			
			
			fiveStarPityLabel.setText(Integer.toString(fivestarObj.getPity()));
			fourStarPityLabel.setText(Integer.toString(fourstarObj.getPity()));
			
			listOfPullDisplays.get(listIndex).setText(fiveStarName);
			listOfPullDisplays.get(listIndex).setBackground(Color.YELLOW);
			listOfPullDisplays.get(listIndex).setForeground(Color.BLACK);
			listOfPullDisplays.get(listIndex).setOpaque(true);
		}
	}
}
