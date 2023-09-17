package sistema;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class GUI extends JFrame {
    private JPanel contentPane;

    private int mouseX, mouseY;
    private JPasswordField passwordField;
    private JPasswordField passwordField_1;
    
    int xx,xy;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GUI frame = new GUI();
                    frame.setUndecorated(true);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public GUI() {
    	setTitle("Pantalla de registro");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 832, 448);
        contentPane = new JPanel();
        contentPane.setBackground(Color.DARK_GRAY);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        Button button = new Button("SignUp");
        button.setForeground(Color.WHITE);
        button.setBackground(new Color(241,57,83));
        button.setBounds(495, 379, 250, 33);
        contentPane.add(button);
        
        
        TextField textField = new TextField();
        textField.setBounds(495, 58, 250, 33);
        contentPane.add(textField);
        
        
        JLabel lblNewLabel = new JLabel("USUARIO");
        lblNewLabel.setBackground(Color.BLACK);
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel.setBounds(491, 29, 72, 23);
        contentPane.add(lblNewLabel);
        
        TextField textField_1 = new TextField();
        textField_1.setBounds(495, 136, 250, 33);
        contentPane.add(textField_1);
        
        JLabel lblNewLabel_1 = new JLabel("EMAIL");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_1.setBounds(493, 116, 46, 14);
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("CONTRASEÑA");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_2.setBounds(495, 196, 91, 14);
        contentPane.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("REPETIR CONTRASEÑA");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_3.setBounds(491, 278, 157, 14);
        contentPane.add(lblNewLabel_3);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(495, 221, 250, 33);
        contentPane.add(passwordField);
        
        passwordField_1 = new JPasswordField();
        passwordField_1.setBounds(495, 302, 250, 33);
        contentPane.add(passwordField_1);
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(495, 253, 250, 2);
        contentPane.add(separator_1);
        
        JSeparator separator = new JSeparator();
        separator.setBounds(495, 167, 250, 2);
        contentPane.add(separator);
        
        JSeparator separator_2 = new JSeparator();
        separator_2.setBounds(495, 333, 250, 2);
        contentPane.add(separator_2);
        
        JSeparator separator_3 = new JSeparator();
        separator_3.setBounds(495, 89, 250, 2);
        contentPane.add(separator_3);
        
        JLabel lbl_close = new JLabel("X");
        lbl_close.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		System.exit(ABORT);
        	}
        });
        lbl_close.setForeground(new Color(241,57,83));
        lbl_close.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_close.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lbl_close.setBounds(781, 11, 47, 23);
        contentPane.add(lbl_close);
        
        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                xx = e.getX();
                 xy = e.getY();
             
            }
        });
  
        lblNewLabel_4.addMouseMotionListener(new MouseMotionAdapter() {
        	@Override
        	public void mouseDragged(MouseEvent e) {
        		
        		int x = e.getXOnScreen();

		        int y = e.getYOnScreen();

		       GUI.this.setLocation(x - xx, y - xy);
        	}
        		
        });
        lblNewLabel_4.setIcon(new ImageIcon(GUI.class.getResource("/sistema/images/user_folder_20282.png")));
        lblNewLabel_4.setBounds(-30, 0, 500, 412);
        contentPane.add(lblNewLabel_4);
    }
}