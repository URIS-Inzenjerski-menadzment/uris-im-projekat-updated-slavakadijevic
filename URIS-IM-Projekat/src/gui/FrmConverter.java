package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import numberSystem.Binary;
import numberSystem.Decimal;
import numberSystem.Hexadecimal;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;

import java.awt.Rectangle;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class FrmConverter extends JFrame {

	private JPanel contentPane;
	private JTextField textBinary;
	private JTextField textDecimal;
	private JTextField textHexadecimal;
	private JTextField textConversionNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmConverter frame = new FrmConverter();
					frame.setVisible(true);
					frame.setSize(600, 300);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmConverter() {
		setTitle("Smart Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setSize(800, 600);     
		
		JPanel panelCenter = new JPanel();
		panelCenter.setBackground(new Color(255, 182, 193));
		contentPane.add(panelCenter, BorderLayout.CENTER);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {200, 35, 34, 200, 0};
		gridBagLayout.rowHeights = new int[]{30, 20, 20, 20, 14, 23, 23, 23, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelCenter.setLayout(gridBagLayout);
		
		JLabel lblConversionNumber = new JLabel("Enter number for convesion:");
		lblConversionNumber.setFont(new Font("Calibri", Font.ITALIC, 13));
		GridBagConstraints gbc_lblConversionNumber = new GridBagConstraints();
		gbc_lblConversionNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblConversionNumber.gridx = 0;
		gbc_lblConversionNumber.gridy = 1;
		panelCenter.add(lblConversionNumber, gbc_lblConversionNumber);
		
		JLabel lblBinary = new JLabel("Binary:");
		lblBinary.setFont(new Font("Calibri", Font.ITALIC, 13));
		GridBagConstraints gbc_lblBinary = new GridBagConstraints();
		gbc_lblBinary.anchor = GridBagConstraints.EAST;
		gbc_lblBinary.insets = new Insets(0, 0, 5, 5);
		gbc_lblBinary.gridx = 2;
		gbc_lblBinary.gridy = 1;
		panelCenter.add(lblBinary, gbc_lblBinary);
		
		textBinary = new JTextField();
		GridBagConstraints gbc_textBinary = new GridBagConstraints();
		gbc_textBinary.fill = GridBagConstraints.HORIZONTAL;
		gbc_textBinary.insets = new Insets(0, 0, 5, 0);
		gbc_textBinary.gridx = 3;
		gbc_textBinary.gridy = 1;
		panelCenter.add(textBinary, gbc_textBinary);
		textBinary.setColumns(10);
		textBinary.setEditable(false);
		
		textConversionNumber = new JTextField();
		GridBagConstraints gbc_textConversionNumber = new GridBagConstraints();
		gbc_textConversionNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_textConversionNumber.insets = new Insets(0, 0, 5, 5);
		gbc_textConversionNumber.gridx = 0;
		gbc_textConversionNumber.gridy = 2;
		panelCenter.add(textConversionNumber, gbc_textConversionNumber);
		textConversionNumber.setColumns(10);
		
		JLabel lblNumberSystem = new JLabel("Choose number system for conversion:");
		lblNumberSystem.setFont(new Font("Calibri", Font.ITALIC, 13));
		GridBagConstraints gbc_lblNumberSystem = new GridBagConstraints();
		gbc_lblNumberSystem.anchor = GridBagConstraints.EAST;
		gbc_lblNumberSystem.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumberSystem.gridx = 0;
		gbc_lblNumberSystem.gridy = 4;
		panelCenter.add(lblNumberSystem, gbc_lblNumberSystem);
		
		JLabel lblDecimal = new JLabel("Decimal:");
		lblDecimal.setFont(new Font("Calibri", Font.ITALIC, 13));
		GridBagConstraints gbc_lblDecimal = new GridBagConstraints();
		gbc_lblDecimal.anchor = GridBagConstraints.EAST;
		gbc_lblDecimal.insets = new Insets(0, 0, 5, 5);
		gbc_lblDecimal.gridx = 2;
		gbc_lblDecimal.gridy = 4;
		panelCenter.add(lblDecimal, gbc_lblDecimal);
		
		textDecimal = new JTextField();
		GridBagConstraints gbc_textDecimal = new GridBagConstraints();
		gbc_textDecimal.fill = GridBagConstraints.HORIZONTAL;
		gbc_textDecimal.insets = new Insets(0, 0, 5, 0);
		gbc_textDecimal.gridx = 3;
		gbc_textDecimal.gridy = 4;
		panelCenter.add(textDecimal, gbc_textDecimal);
		textDecimal.setColumns(10);
		textDecimal.setEditable(false);
		
		JRadioButton rdbtnBinary = new JRadioButton("Binary");
		rdbtnBinary.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		rdbtnBinary.setBackground(new Color(255, 250, 250));
		rdbtnBinary.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_rdbtnBinary = new GridBagConstraints();
		gbc_rdbtnBinary.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnBinary.gridx = 0;
		gbc_rdbtnBinary.gridy = 5;
		panelCenter.add(rdbtnBinary, gbc_rdbtnBinary);
		
		JRadioButton rdbtnDecimal = new JRadioButton("Decimal");
		rdbtnDecimal.setBackground(new Color(255, 250, 250));
		rdbtnDecimal.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		rdbtnDecimal.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_rdbtnDecimal = new GridBagConstraints();
		gbc_rdbtnDecimal.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnDecimal.gridx = 0;
		gbc_rdbtnDecimal.gridy = 6;
		panelCenter.add(rdbtnDecimal, gbc_rdbtnDecimal);
		
		JRadioButton rdbtnHexadecimal = new JRadioButton("Hexadecimal");
		rdbtnHexadecimal.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		rdbtnHexadecimal.setBackground(new Color(255, 250, 250));
		rdbtnHexadecimal.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnHexadecimal.setSelected(true);
		GridBagConstraints gbc_rdbtnHexadecimal = new GridBagConstraints();
		gbc_rdbtnHexadecimal.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnHexadecimal.gridx = 0;
		gbc_rdbtnHexadecimal.gridy = 7;
		panelCenter.add(rdbtnHexadecimal, gbc_rdbtnHexadecimal);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnHexadecimal);
		buttonGroup.add(rdbtnDecimal);
		buttonGroup.add(rdbtnBinary);
		
		JLabel lblHexadecimal = new JLabel("Hexadecimal:");
		lblHexadecimal.setFont(new Font("Calibri", Font.ITALIC, 13));
		GridBagConstraints gbc_lblHexadecimal = new GridBagConstraints();
		gbc_lblHexadecimal.anchor = GridBagConstraints.EAST;
		gbc_lblHexadecimal.insets = new Insets(0, 0, 5, 5);
		gbc_lblHexadecimal.gridx = 2;
		gbc_lblHexadecimal.gridy = 7;
		panelCenter.add(lblHexadecimal, gbc_lblHexadecimal);
		
		textHexadecimal = new JTextField();
		GridBagConstraints gbc_textHexadecimal = new GridBagConstraints();
		gbc_textHexadecimal.insets = new Insets(0, 0, 5, 0);
		gbc_textHexadecimal.fill = GridBagConstraints.HORIZONTAL;
		gbc_textHexadecimal.gridx = 3;
		gbc_textHexadecimal.gridy = 7;
		panelCenter.add(textHexadecimal, gbc_textHexadecimal);
		textHexadecimal.setColumns(10);
		textHexadecimal.setEditable(false);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.setBackground(new Color(192, 192, 192));
		btnConvert.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!textConversionNumber.getText().equals("")) {				
					if(rdbtnBinary.isSelected()) {
						String conversionNumber = textConversionNumber.getText();
						boolean isBinaryNumber;
						
						try {
							Integer.parseInt(conversionNumber,2);
							isBinaryNumber = true;
						}catch(Exception e1) {
							isBinaryNumber = false;
						}
						if(isBinaryNumber) {
							convertBinaryNumber(conversionNumber);
						}else {
							JOptionPane.showMessageDialog(contentPane, "Insert a binary number, please.");
						}
					}else if(rdbtnDecimal.isSelected()) {
						String conversionNumber = textConversionNumber.getText();
						boolean isDecimalNumber;
						
						try {
							Integer.parseInt(conversionNumber);
							isDecimalNumber = true;
						}catch(Exception e2) {
							isDecimalNumber = false;
						}
						if(isDecimalNumber) {
							convertDecimalNumber(conversionNumber);
						}else {
							JOptionPane.showMessageDialog(contentPane, "Insert a whole number, please.");
						}						
					}else {
						String conversionNumber = textConversionNumber.getText();
						boolean isHexadecimalNumber;
						
						try {
							Integer.parseInt(conversionNumber,16);						
							isHexadecimalNumber = true;
						}catch(Exception e3) {
							isHexadecimalNumber = false;
						}
						if(isHexadecimalNumber) {
							convertHexadecimalNumber(conversionNumber);
						}else {
							JOptionPane.showMessageDialog(contentPane, "Insert a hexadecimal number, please.");
						}
					}				
				}else {
					JOptionPane.showMessageDialog(contentPane, "Insert a number, please.");
				}
			}
				
				
			}
		);
		btnConvert.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 13));
		GridBagConstraints gbc_btnConvert = new GridBagConstraints();
		gbc_btnConvert.insets = new Insets(0, 0, 0, 5);
		gbc_btnConvert.gridx = 0;
		gbc_btnConvert.gridy = 8;
		panelCenter.add(btnConvert, gbc_btnConvert);
	}
	
	public void convertBinaryNumber(String conversionNumber) {
		Binary binary = new Binary(conversionNumber);
		int decimal = binary.convertToDecimal();
		String hexadecimal = binary.convertToHexadecimal();
		
		textBinary.setText(conversionNumber);
		textDecimal.setText(String.valueOf(decimal));
		textHexadecimal.setText(hexadecimal);
	}
	
	public void convertDecimalNumber(String conversionNumber) {
		Decimal decimal = new Decimal(Integer.parseInt(conversionNumber));
		String binary = decimal.convertToBinary();
		String hexadecimal = decimal.convertToHexadecimal();
		
		textBinary.setText(binary);
		textDecimal.setText(conversionNumber);
		textHexadecimal.setText(hexadecimal);
	}
	
	public void convertHexadecimalNumber(String conversionNumber) {
		Hexadecimal hexadecimal = new Hexadecimal(conversionNumber);
		String binary = hexadecimal.convertToBinary();
		int decimal = hexadecimal.convertToDecimal();
		
		textBinary.setText(binary);
		textDecimal.setText(String.valueOf(decimal));
		textHexadecimal.setText(conversionNumber);
		
	}
}

