package com.kh.chap01_container.view;

import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class list extends JFrame {
			
	
	public list()
	    {
	               
	        String title[] = {"����", "�̸�", "�����" , "����"};
	        JButton btn1 = new JButton("���ư���");
	        btn1.setBounds(410, 400, 100, 100);
	        getContentPane().add(btn1);
	        String data[][] = {
	                {"1", "A��", "A����", "1000"},
	                {"2", "B��", "A����", "1000"},
	                {"3", "C��", "A����", "1000"},
	                {"4", "C��", "A����", "1000"},
	                {"5", "C��", "A����", "1000"},
	                {"6", "C��", "A����", "1000"},
	                {"7", "C��", "A����", "1000"},
	                {"8", "D��", "A����", "1000"}
	        };
	        
	        JTable table = new JTable(data, title);
	        
	        getContentPane().add(table);
	        table.setBounds(100,100,100,100);
	        setSize(900, 600);
	        setVisible(true);
	        setLocationRelativeTo(null);
	 


	    	    
	    }
	    
	    public static void main(String args[])
	    {
	        list jtable = new list();
	        jtable.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    }
	
}
