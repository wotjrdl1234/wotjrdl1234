package com.kh.chap01_container.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;

public class list2 extends JFrame{

	public list2()
    {
               
        String title[] = {"순위", "이름", "제약사" , "가격"};
        JButton btn1 = new JButton("돌아가기");
        JButton btn2 = new JButton("Next");
        btn1.setBounds(410, 400, 100, 100);
        btn2.setBounds(410, 200, 100, 100);        
        getContentPane().add(btn1);
        getContentPane().add(btn2);
        String data[][] = {
                {"1", "A약", "A제약", "1000"},
                {"2", "B약", "A제약", "1000"},
                {"3", "C약", "A제약", "1000"},
                {"4", "C약", "A제약", "1000"},
                {"5", "C약", "A제약", "1000"},
                {"6", "C약", "A제약", "1000"},
                {"7", "C약", "A제약", "1000"},
                {"8", "D약", "A제약", "1000"}
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
