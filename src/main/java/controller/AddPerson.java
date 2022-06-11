package controller;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddPerson extends JFrame implements Screen{

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtHo;
	private JTextField txtTen;
	private JTextField txtNgaysinh;
	private JTextField txtCutru;
	private JTextField txtNoisinh;
	private JTextField txtDantoc;
	private JTextField txtTongiao;
	private JTextField txtQHchuho;
	private JTextField txtNgheNghiep;
	private JTextField txtSDT;
	private JTextField txtTTHonnhan;
	private JTextField txtIDGD;
	private static AddPerson instance;
	/**
	 * Launch the application.
	 */

	public static AddPerson getInstance(){
		if(instance == null){
			instance = new AddPerson();
		}
		return instance;
	}
	@Override
	public void Render() {
		setLocationRelativeTo(null);
		getInstance().setVisible(true);
	}

	@Override
	public void Destroy() {
		getInstance().setVisible(false);
	}
	/**
	 * Create the frame.
	 */
	private AddPerson() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 676);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Th\u00EAm d\u00E2n c\u01B0");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("ID:");
		
		JLabel lblNewLabel_2 = new JLabel("H\u1ECD");
		
		JLabel lblNewLabel_3 = new JLabel("T\u00EAn:");
		
		JLabel lblNewLabel_4 = new JLabel("Ng\u00E0y sinh:");
		
		JLabel lblNewLabel_5 = new JLabel("N\u01A1i c\u01B0 tr\u00FA:");
		
		JLabel lblNewLabel_6 = new JLabel("N\u01A1i sinh:");
		
		JLabel lblNewLabel_7 = new JLabel("Gi\u1EDBi t\u00EDnh:");
		
		JLabel lblNewLabel_8 = new JLabel("D\u00E2n t\u1ED9c:");
		
		JLabel lblNewLabel_9 = new JLabel("T\u00F4n gi\u00E1o:");
		
		JLabel lblNewLabel_10 = new JLabel("MQH ch\u1EE7 h\u1ED9:");
		
		JLabel lblNewLabel_11 = new JLabel("Ngh\u1EC1 nghi\u1EC7p:");
		
		JLabel lblNewLabel_12 = new JLabel("S\u1ED1 \u0110T:");
		
		JLabel lblNewLabel_13 = new JLabel("TT H\u00F4n nh\u00E2n:");
		
		JLabel lblNewLabel_14 = new JLabel("ID_GD:");
		
		txtID = new JTextField();
		txtID.setColumns(10);
		
		txtHo = new JTextField();
		txtHo.setColumns(10);
		
		txtTen = new JTextField();
		txtTen.setColumns(10);
		
		txtNgaysinh = new JTextField();
		txtNgaysinh.setColumns(10);
		
		txtCutru = new JTextField();
		txtCutru.setColumns(10);
		
		txtNoisinh = new JTextField();
		txtNoisinh.setColumns(10);
		
		JRadioButton rbtnNam = new JRadioButton("Nam");
		
		JRadioButton rbtnNu = new JRadioButton("N\u1EEF");
		
		txtDantoc = new JTextField();
		txtDantoc.setColumns(10);
		
		txtTongiao = new JTextField();
		txtTongiao.setColumns(10);
		
		txtQHchuho = new JTextField();
		txtQHchuho.setColumns(10);
		
		txtNgheNghiep = new JTextField();
		txtNgheNghiep.setColumns(10);
		
		txtSDT = new JTextField();
		txtSDT.setColumns(10);
		
		txtTTHonnhan = new JTextField();
		txtTTHonnhan.setColumns(10);
		
		txtIDGD = new JTextField();
		txtIDGD.setColumns(10);
		
		JButton btnBack = new JButton("Tr\u1EDF v\u1EC1");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getInstance().Destroy();
				Home.getInstance().Render();
			}
		});

		JButton btnAdd = new JButton("Th\u00EAm");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(119, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
					.addGap(111))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(43)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
						.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_10, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
						.addComponent(lblNewLabel_11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_13, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_14, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addComponent(txtNoisinh)
							.addComponent(txtTen)
							.addComponent(txtHo)
							.addComponent(txtID, GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
							.addComponent(txtNgaysinh, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
							.addComponent(txtCutru))
						.addComponent(txtDantoc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTongiao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtQHchuho, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNgheNghiep, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtSDT, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTTHonnhan, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addComponent(txtIDGD)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(rbtnNam, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(rbtnNu, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(50, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(258, Short.MAX_VALUE)
					.addComponent(btnAdd)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnBack)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(txtID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(txtHo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(txtTen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(txtNgaysinh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(txtCutru, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6)
						.addComponent(txtNoisinh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_7)
							.addGap(18)
							.addComponent(lblNewLabel_8)
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_9)
								.addComponent(txtTongiao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_10)
								.addComponent(txtQHchuho, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_11)
								.addComponent(txtNgheNghiep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_12)
								.addComponent(txtSDT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_13)
								.addComponent(txtTTHonnhan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_14)
								.addComponent(txtIDGD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(rbtnNam)
								.addComponent(rbtnNu))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtDantoc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnBack)
						.addComponent(btnAdd))
					.addGap(21))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
