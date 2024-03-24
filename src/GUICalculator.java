/*
Author: Tenny Akihary
Class: *** ***
Project: *** **
Purpose: Create a calculator using GUI methods.
 */
package GUICalculator;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class GUICalculator extends JFrame {

    //Create buttons textfields, and panels
    private JButton JB1, JB2, JB3, JB4, JB5, JB6, JB7, JB8, JB9, JB0, JB00, 
            plusJB, perJB, subJB, multJB, divJB, eqJB, cJB, CAJB, offJB;
    private JPanel textPanel, numPanel, opPanel, clearPanel;
    private JTextArea calcOut;
    
    //Variables to hold input
    String input = "";
    double num = 0;
    
    
    //No-Argument Constructor
    public GUICalculator(){
        createUserInterface();
    }
    
    //Create and position GUI components
    private void createUserInterface(){
        //Get content pane and set layout to null
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.LIGHT_GRAY);
        contentPane.setLayout(null);
        
        //Setup Output Panel
        textPanel = new JPanel();
        textPanel.setLayout(null);
        textPanel.setBounds(20,30,640,40);
        textPanel.setBackground(Color.WHITE);
        contentPane.add(textPanel);
        
        
        //Setup Text Field
        calcOut = new JTextArea();
        calcOut.setBounds(20,10,600,20);
        calcOut.setText("0");
        calcOut.setEditable(false);
        calcOut.setBackground(Color.WHITE);
        textPanel.add(calcOut);
        
        //Setup the number panel
        numPanel = new JPanel();
        numPanel.setLayout(null);
        numPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
        numPanel.setBounds(20,100,220,280);
        numPanel.setBackground(Color.LIGHT_GRAY);
        contentPane.add(numPanel);
        
        //Setup buttons in number panel
        JB1 = new JButton();
        JB1.setBounds(20,20,60,60);
        JB1.setText("1");
        JB1.setBackground(Color.CYAN);
        numPanel.add(JB1);
        JB1.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    JB1ActionPerformed(event);
                }
            }
        );
        
        JB2 = new JButton();
        JB2.setBounds(80,20,60,60);
        JB2.setText("2");
        JB2.setBackground(Color.CYAN);
        numPanel.add(JB2);
        JB2.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    JB2ActionPerformed(event);
                }
            }
        );
        
        JB3 = new JButton();
        JB3.setBounds(140,20,60,60);
        JB3.setText("3");
        JB3.setBackground(Color.CYAN);
        numPanel.add(JB3);
        JB3.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    JB3ActionPerformed(event);
                }
            }
        );
        
        JB4 = new JButton();
        JB4.setBounds(20,80,60,60);
        JB4.setText("4");
        JB4.setBackground(Color.CYAN);
        numPanel.add(JB4);
        JB4.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    JB4ActionPerformed(event);
                }
            }
        );
        
        JB5 = new JButton();
        JB5.setBounds(80,80,60,60);
        JB5.setText("5");
        JB5.setBackground(Color.CYAN);
        numPanel.add(JB5);
        JB5.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    JB5ActionPerformed(event);
                }
            }
        );
        
        JB6 = new JButton();
        JB6.setBounds(140,80,60,60);
        JB6.setText("6");
        JB6.setBackground(Color.CYAN);
        numPanel.add(JB6);
        JB6.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    JB6ActionPerformed(event);
                }
            }
        );
        
        JB7 = new JButton();
        JB7.setBounds(20,140,60,60);
        JB7.setText("7");
        JB7.setBackground(Color.CYAN);
        numPanel.add(JB7);
        JB7.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    JB7ActionPerformed(event);
                }
            }
        );
        
        JB8 = new JButton();
        JB8.setBounds(80,140,60,60);
        JB8.setText("8");
        JB8.setBackground(Color.CYAN);
        numPanel.add(JB8);
        JB8.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    JB8ActionPerformed(event);
                }
            }
        );
        
        JB9 = new JButton();
        JB9.setBounds(140,140,60,60);
        JB9.setText("9");
        JB9.setBackground(Color.CYAN);
        numPanel.add(JB9);
        JB9.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    JB9ActionPerformed(event);
                }
            }
        );
        
        JB0 = new JButton();
        JB0.setBounds(20,200,60,60);
        JB0.setText("0");
        JB0.setBackground(Color.CYAN);
        numPanel.add(JB0);
        JB0.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    JB0ActionPerformed(event);
                }
            }
        );
        
        JB00 = new JButton();
        JB00.setBounds(80,200,120,60);
        JB00.setText("00");
        JB00.setBackground(Color.CYAN);
        numPanel.add(JB00);
        JB00.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    JB00ActionPerformed(event);
                }
            }
        );
        
        //Setup operator panel
        opPanel = new JPanel();
        opPanel.setLayout(null);
        opPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
        opPanel.setBounds(300,100,180,280);
        opPanel.setBackground(Color.LIGHT_GRAY);
        contentPane.add(opPanel);
        
        //Setup all buttons for operator panel
        plusJB = new JButton();
        plusJB.setBounds(20,20,60,160);
        plusJB.setFont(new Font("SansSerif", Font.PLAIN, 18));
        plusJB.setText("+");
        plusJB.setBackground(Color.CYAN);
        opPanel.add(plusJB);
        plusJB.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    plusJBActionPerformed(event);
                }
            }
        );
        
        perJB = new JButton();
        perJB.setBounds(20,200,60,60);
        perJB.setFont(new Font("SansSerif", Font.PLAIN, 18));
        perJB.setText(".");
        perJB.setBackground(Color.CYAN);
        opPanel.add(perJB);
        perJB.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    perJBActionPerformed(event);
                }
            }
        );
        
        subJB = new JButton();
        subJB.setBounds(100,20,60,60);
        subJB.setFont(new Font("SansSerif", Font.PLAIN, 18));
        subJB.setText("-");
        subJB.setBackground(Color.CYAN);
        opPanel.add(subJB);
        subJB.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    subJBActionPerformed(event);
                }
            }
        );
        
        multJB = new JButton();
        multJB.setBounds(100,80,60,60);
        multJB.setFont(new Font("SansSerif", Font.PLAIN, 18));
        multJB.setText("*");
        multJB.setBackground(Color.CYAN);
        opPanel.add(multJB);
        multJB.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    multJBActionPerformed(event);
                }
            }
        );
        
        divJB = new JButton();
        divJB.setBounds(100,140,60,60);
        divJB.setFont(new Font("SansSerif", Font.PLAIN, 18));
        divJB.setText("/");
        divJB.setBackground(Color.CYAN);
        opPanel.add(divJB);
        divJB.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    divJBActionPerformed(event);
                }
            }
        );
        
        eqJB = new JButton();
        eqJB.setBounds(100,200,60,60);
        eqJB.setFont(new Font("SansSerif", Font.PLAIN, 18));
        eqJB.setText("=");
        eqJB.setBackground(Color.CYAN);
        opPanel.add(eqJB);
        eqJB.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    eqJBActionPerformed(event);
                }
            }
        );
        
        //Setup clear panel
        clearPanel = new JPanel();
        clearPanel.setLayout(null);
        clearPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
        clearPanel.setBounds(540,100,120,180);
        clearPanel.setBackground(Color.LIGHT_GRAY);
        contentPane.add(clearPanel);
        
        //Setup buttons for clear panel
        cJB = new JButton();
        cJB.setBounds(20,20,80,60);
        cJB.setText("C");
        cJB.setBackground(Color.CYAN);
        clearPanel.add(cJB);
        cJB.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    cJBActionPerformed(event);
                }
            }
        );
        
        CAJB = new JButton();
        CAJB.setBounds(20,100,80,60);
        CAJB.setText("C/A");
        CAJB.setBackground(Color.CYAN);
        clearPanel.add(CAJB);
        CAJB.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    CAJBActionPerformed(event);
                }
            }
        );
        
        offJB = new JButton();
        offJB.setBounds(560,300,80,60);
        offJB.setText("OFF");
        offJB.setBackground(Color.CYAN);
        contentPane.add(offJB);
        offJB.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    offJBActionPerformed(event);
                }
            }
        );
        
        //Set Properties of app's window
        setTitle("Calculator");
        setSize(690,440);
        setVisible(true);
        
    }//End method createUserInterface
    
    //Method for 1 button
    private void JB1ActionPerformed(ActionEvent event){
        calcOut.append("1");
        input = input + 1;
    }
    
    //Method for 2 button
    private void JB2ActionPerformed(ActionEvent event){
        calcOut.append("2");
        input = input + 2;
    }
    
    //Method for 3 button
    private void JB3ActionPerformed(ActionEvent event){
        calcOut.append("3");
        input = input + 3;
    }
    
    //Method for 4 button
    private void JB4ActionPerformed(ActionEvent event){
        calcOut.append("4");
        input = input + 4;
    }
    
    //Method for 5 button
    private void JB5ActionPerformed(ActionEvent event){
        calcOut.append("5");
        input = input + 5;
    }
    
    //Method for 6 button
    private void JB6ActionPerformed(ActionEvent event){
        calcOut.append("6");
        input = input + 6;
    }
    
    //Method for 7 button
    private void JB7ActionPerformed(ActionEvent event){
        calcOut.append("7");
        input = input + 7;
    }
    
    //Method for 8 button
    private void JB8ActionPerformed(ActionEvent event){
        calcOut.append("8");
        input = input + 8;
    }
    
    //Method for 9 button
    private void JB9ActionPerformed(ActionEvent event){
        calcOut.append("9");
        input = input + 9;
    }
    
    //Method for 0 button
    private void JB0ActionPerformed(ActionEvent event){
        calcOut.append("0");
        input = input + 0;
    }
    
    //Method for 00 button
    private void JB00ActionPerformed(ActionEvent event){
        calcOut.append("00");
        input = input + "00";
    }
    
    //Method for + button
    private void plusJBActionPerformed(ActionEvent event){
        calcOut.append("+");
        input = input + "+";
    }
    
    //Method for . button
    private void perJBActionPerformed(ActionEvent event){
        calcOut.append(".");
        input = input + ".";
    }
    
    //Method for - button
    private void subJBActionPerformed(ActionEvent event){
        calcOut.append("-");
        input = input + "-";
    }
    
    //Method for * button
    private void multJBActionPerformed(ActionEvent event){
        calcOut.append("*");
        input = input + "*";
    }
    
    //Method for / button
    private void divJBActionPerformed(ActionEvent event){
        calcOut.append("/");
        input = input + "/";
    }
    
    //Method for = button
    private void eqJBActionPerformed(ActionEvent event){
        for (int i = input.length()-1; i > -1; i--) {
            char t = input.charAt(i);
            if(t == '/' || t == '*' || t == '-' || t == '+'){
                break;
            }else {
                input = input.substring(0,i);
            }
        }
    }
    
    //Method for C button
    private void cJBActionPerformed(ActionEvent event){
        int i;
        char t = '\0';
        for (i = input.length()-1; i > -1; i--) {
            t = input.charAt(i);
            if(t == '/' || t == '*' || t == '-' || t == '+'){
                break;
            }else {
                input = input.substring(0,i);
            }
        }
        //input = input.substring(0,i) + t;
        calcOut.setText(input);
    }
    
    //Method for CA button
    private void CAJBActionPerformed(ActionEvent event){
        calcOut.setText("0");
        input = "";
    }
    
    //Method for off button
    private void offJBActionPerformed(ActionEvent event){
        System.exit(1);
    }
    
    public static void main(String[] args) {
        GUICalculator app = new GUICalculator();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
