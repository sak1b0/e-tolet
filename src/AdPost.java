import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class AdPost {

	private JFrame frame;
	private JTextField area;
	private JTextField rent;
	private JTextField contactNum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdPost window = new AdPost();
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
	Connection con=null;
	
	public AdPost() {
		initialize();
		con=Connector.dbconnector();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setType(Type.POPUP);
		frame.setBounds(100, 100, 1000, 684);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Image img = new ImageIcon(this.getClass().getResource("/home_blur.png")).getImage(); //pic declare
		
		JLabel lblArea = new JLabel("Area:");
		lblArea.setHorizontalAlignment(SwingConstants.TRAILING);
		lblArea.setForeground(Color.WHITE);
		lblArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblArea.setBounds(503, 115, 56, 16);
		frame.getContentPane().add(lblArea);
		
		JLabel lblRent = new JLabel("Rent:");
		lblRent.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRent.setForeground(Color.WHITE);
		lblRent.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRent.setBounds(503, 160, 56, 16);
		frame.getContentPane().add(lblRent);
		
		JLabel lblContactNumber = new JLabel("Contact Number:");
		lblContactNumber.setHorizontalAlignment(SwingConstants.TRAILING);
		lblContactNumber.setForeground(Color.WHITE);
		lblContactNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblContactNumber.setBounds(401, 205, 158, 16);
		frame.getContentPane().add(lblContactNumber);
		
		JLabel lblFullAddress = new JLabel("Full Address:");
		lblFullAddress.setHorizontalAlignment(SwingConstants.TRAILING);
		lblFullAddress.setForeground(Color.WHITE);
		lblFullAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFullAddress.setBounds(437, 293, 122, 25);
		frame.getContentPane().add(lblFullAddress);
		
		JLabel lblOtherDetails = new JLabel("Other Details:");
		lblOtherDetails.setHorizontalAlignment(SwingConstants.TRAILING);
		lblOtherDetails.setForeground(Color.WHITE);
		lblOtherDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblOtherDetails.setBounds(434, 426, 125, 25);
		frame.getContentPane().add(lblOtherDetails);
		
		JLabel lblFamilybachelor = new JLabel("Family/Bachelor:");
		lblFamilybachelor.setHorizontalAlignment(SwingConstants.TRAILING);
		lblFamilybachelor.setForeground(Color.WHITE);
		lblFamilybachelor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFamilybachelor.setBounds(398, 59, 161, 32);
		frame.getContentPane().add(lblFamilybachelor);
		
		area = new JTextField();
		area.setFont(new Font("Tahoma", Font.PLAIN, 18));
		area.setBounds(573, 108, 312, 32);
		frame.getContentPane().add(area);
		area.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {" Any", " Family", " Bachelor (Male)", " Bachelor (Female)"}));
		comboBox.setBounds(573, 61, 312, 30);
		frame.getContentPane().add(comboBox);
		
		rent = new JTextField();
		rent.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rent.setBounds(573, 153, 312, 32);
		frame.getContentPane().add(rent);
		rent.setColumns(10);
		
		contactNum = new JTextField();
		contactNum.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contactNum.setBounds(573, 198, 312, 33);
		frame.getContentPane().add(contactNum);
		contactNum.setColumns(10);
		
		JButton postAdBtn = new JButton("Post Ad");

		postAdBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		postAdBtn.setBounds(677, 547, 122, 32);
		frame.getContentPane().add(postAdBtn);
		
		JLabel lblNoMoreWall = new JLabel("No more wall hunting!");
		lblNoMoreWall.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNoMoreWall.setForeground(Color.RED);
		lblNoMoreWall.setVerticalAlignment(SwingConstants.TOP);
		lblNoMoreWall.setBounds(32, 53, 312, 245);
		frame.getContentPane().add(lblNoMoreWall);
		
		JLabel label = new JLabel();
		label.setBounds(32, 395, 158, 184);
		frame.getContentPane().add(label);
		
		JTextArea fullAddress = new JTextArea();
		fullAddress.setWrapStyleWord(true);
		fullAddress.setLineWrap(true);
		fullAddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		fullAddress.setBounds(573, 244, 312, 126);
		frame.getContentPane().add(fullAddress);

		JScrollPane addrScrollPane = new JScrollPane(fullAddress);
		addrScrollPane.setBounds(571, 244, 314, 126);
		frame.getContentPane().add(addrScrollPane);
		
		JTextArea otherDetails = new JTextArea();
		otherDetails.setWrapStyleWord(true);
		otherDetails.setLineWrap(true);
		otherDetails.setFont(new Font("Tahoma", Font.PLAIN, 18));
		otherDetails.setBounds(571, 383, 314, 126);
		frame.getContentPane().add(otherDetails);
		
		JScrollPane dtlScrollPane = new JScrollPane(otherDetails);
		dtlScrollPane.setBounds(571, 383, 314, 126);
		frame.getContentPane().add(dtlScrollPane);
		
		JLabel lbloptional = new JLabel("(Optional)");
		lbloptional.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbloptional.setForeground(Color.WHITE);
		lbloptional.setBounds(458, 452, 74, 16);
		frame.getContentPane().add(lbloptional);
		
		JLabel mainLabel = new JLabel();
		mainLabel.setForeground(Color.WHITE);
		mainLabel.setBounds(0, 0, 982, 640);
		mainLabel.setIcon(new ImageIcon(img));
		frame.getContentPane().add(mainLabel);
		
		
		postAdBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
					
					if(area.getText().equals("") || rent.getText().equals("") || contactNum.getText().equals("") || fullAddress.equals(""))
						throw new Exception();
					
					String query="insert into adsTable (EID,Area,Rent,Contact,Address,Others,For) values (?,?,?,?,?,?,?)";
					PreparedStatement pst= con.prepareStatement(query);
					//pst.setString(1,"dummy");
					pst.setString(2,area.getText());
					pst.setString(3,rent.getText());
					pst.setString(4,contactNum.getText());
					pst.setString(5,fullAddress.getText());
					pst.setString(6,otherDetails.getText());
					String s=String.valueOf(comboBox.getSelectedItem());
					pst.setString(7,s);
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Your Ad was successfully posted :) ");
					
					area.setText("");
					rent.setText("");
					contactNum.setText("");
					fullAddress.setText("");
					otherDetails.setText("");
					comboBox.setSelectedIndex(-1);
					
					pst.close();
				//	frame.setVisible(false);
					frame.dispose();
					Frame1 f=new Frame1();
					String[] args = new String[0];
					f.main(args);
					
					
				}catch(Exception e)
				{
					JOptionPane.showMessageDialog(frame,"All the fields must be completed\n(Others is optional)","Incomplete Form",JOptionPane.WARNING_MESSAGE);
					//System.out.println(e);
				}
				finally{
					//System.out.println(String.valueOf(comboBox.getSelectedItem()));
				}
				
			}
		});
		
		
		
	}
}
