import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;
import java.sql.*;


public class Frame1 {
	
	
	private JFrame mainFrame;
	
	public static int x=1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection con=null;
	/**
	 * Create the application.
	 */
	
	public Frame1() {
		initialize();
		con=Connector.dbconnector();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame();
		mainFrame.setTitle("eTO-LET");
		mainFrame.getContentPane().setBackground(new Color(105, 105, 105));
		DefaultListModel<String> dlm= new DefaultListModel<String>();
		
		mainFrame.setLocationRelativeTo(null);
		
		JList<String> list = new JList<String>();
		list.setBounds(1, 1, 237, 615);
		//list.setCellRenderer(new TransparentListCellRenderer());
		list.setForeground(Color.WHITE);
		
		JButton btnNewButton = new JButton("click");
		btnNewButton.setBounds(442, 537, 97, 25);
		btnNewButton.setToolTipText("Hello");
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBackground(Color.RED);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dlm.addElement("robin");
				
				dlm.addElement("sakib");
				
				list.setModel(dlm);
			}
		});
		Image img = new ImageIcon(this.getClass().getResource("/home_blur.png")).getImage();
		mainFrame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea("sakib");
		textArea.setBounds(1, 1, 281, 197);
		textArea.setOpaque(false);
		textArea.setBackground(new Color(0,0,0,0));
		
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
		mainFrame.getContentPane().add(textArea);
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(326, 166, 283, 199);
		scrollPane.setOpaque(false);
		
		list.setBackground(Color.DARK_GRAY);
		list.setFont(new Font("Tahoma", Font.PLAIN, 25));
						mainFrame.getContentPane().add(list);
		
		JScrollPane menuSrollPane = new JScrollPane(list);
		menuSrollPane.setBounds(23, 18, 239, 617);
		
		menuSrollPane.setOpaque(false);
		
		JButton btnPostNewAd = new JButton("Post New Ad");
		btnPostNewAd.setBounds(685, 423, 210, 41);
		btnPostNewAd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			//	mainFrame.setVisible(false);
				mainFrame.dispose();
				AdPost ad = new AdPost();
				String[] args = new String[0];
				ad.main(args);
				
				
			}
		});
		btnPostNewAd.setFont(new Font("Tahoma", Font.PLAIN, 26));
		mainFrame.getContentPane().add(menuSrollPane);
		mainFrame.getContentPane().add(scrollPane);
		mainFrame.getContentPane().add(btnNewButton);
		mainFrame.getContentPane().add(btnPostNewAd);
		
		JButton btnLoadData = new JButton("load data");
		btnLoadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
			}
		});
		btnLoadData.setBounds(668, 263, 97, 25);
		mainFrame.getContentPane().add(btnLoadData);
		
		
		JLabel jlbl1 = new JLabel("");
		jlbl1.setBounds(0, 0, 982, 653);
		jlbl1.setForeground(Color.BLACK);
		jlbl1.setIcon(new ImageIcon(img));
		jlbl1.setIcon(new ImageIcon(img));
		mainFrame.getContentPane().add(jlbl1);
		mainFrame.setBounds(100, 100, 1000, 700);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


