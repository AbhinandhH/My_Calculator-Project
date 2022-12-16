import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    boolean isOperatorClicked = false;
    boolean isPlusClicked = false;
    boolean isMinusClicked = false;
    boolean isDivClicked =  false;
    boolean isMultiClicked = false;
    boolean isDotClicked = false;
    String oldValue;
    String newValue = "0";
    JFrame jf;
    JLabel displayLabel;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton zeroButton;
    JButton multiButton;
    JButton divButton;
    JButton minusButton;
    JButton dotButton;
    JButton clearButton;
    JButton equalButton;
    JButton plusButton;
    Calculator(){
        jf = new JFrame("MY CALCULATOR");
        jf.setLocation(400,200);
        jf.setLayout(null);
        jf.setSize(550,600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        displayLabel = new JLabel();
        displayLabel.setBounds(30, 50, 380, 55);
        displayLabel.setBackground(Color.GRAY);
        displayLabel.setForeground(Color.WHITE);
        displayLabel.setFont(new Font("", Font.BOLD, 30));
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        jf.add(displayLabel);

        sevenButton = new JButton("7");
        sevenButton.setBounds(30, 120, 80, 80);
        sevenButton.setFont(new Font("",1, 40));
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.setBounds(130, 120, 80, 80);
        eightButton.setFont(new Font("",1, 40));
        eightButton.addActionListener(this);
        jf.add(eightButton);

        nineButton = new JButton("9");
        nineButton.setBounds(230, 120, 80, 80);
        nineButton.setFont(new Font("",1, 40));
        nineButton.addActionListener(this);
        jf.add(nineButton);

        multiButton = new JButton("X");
        multiButton.setBounds(330, 120, 80, 80);
        multiButton.setFont(new Font("",0, 40));
        multiButton.addActionListener(this);
        jf.add(multiButton);

        divButton = new JButton("/");
        divButton.setBounds(330, 420, 80, 80);
        divButton.setFont(new Font("",0, 40));
        divButton.addActionListener(this);
        jf.add(divButton);

        fourButton = new JButton("4");
        fourButton.setBounds(30, 220 , 80, 80);
        fourButton.setFont(new Font("",1, 40));
        fourButton.addActionListener(this);
        jf.add(fourButton);

        fiveButton = new JButton("5");
        fiveButton.setBounds(130, 220 , 80, 80);
        fiveButton.setFont(new Font("",1, 40));
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        sixButton = new JButton("6");
        sixButton.setBounds(230, 220 , 80, 80);
        sixButton.setFont(new Font("",1, 40));
        sixButton.addActionListener(this);
        jf.add(sixButton);

        minusButton = new JButton("-");
        minusButton.setBounds(330, 220, 80, 80);
        minusButton.setFont(new Font("",0, 40));
        minusButton.addActionListener(this);
        jf.add(minusButton);

        oneButton = new JButton("1");
        oneButton.setBounds(30, 320 , 80, 80);
        oneButton.setFont(new Font("",1, 40));
        oneButton.addActionListener(this);
        jf.add(oneButton);

        twoButton = new JButton("2");
        twoButton.setBounds(130, 320 , 80, 80);
        twoButton.setFont(new Font("",1, 40));
        twoButton.addActionListener(this);
        jf.add(twoButton);

        threeButton = new JButton("3");
        threeButton.setBounds(230, 320 , 80, 80);
        threeButton.setFont(new Font("",1, 40));
        threeButton.addActionListener(this);
        jf.add(threeButton);

        plusButton = new JButton("+");
        plusButton.setBounds(330, 320, 80, 80);
        plusButton.setFont(new Font("",0, 40));
        plusButton.addActionListener(this);
        jf.add(plusButton);

        clearButton = new JButton("C");
        clearButton.setBounds(430, 120, 80, 80);
        clearButton.setFont(new Font("",0, 40));
        clearButton.addActionListener(this);
        jf.add(clearButton);

        zeroButton = new JButton("0");
        zeroButton.setBounds(130, 420, 80, 80);
        zeroButton.setFont(new Font("",1, 40));
        zeroButton.addActionListener(this);
        jf.add(zeroButton);

        dotButton = new JButton(".");
        dotButton.setBounds(30, 420, 80, 80);
        dotButton.setFont(new Font("",1, 40));
        dotButton.addActionListener(this);
        jf.add(dotButton);

        equalButton = new JButton("=");
        equalButton.setBounds(230, 420, 80, 80);
        equalButton.setFont(new Font("",1, 40));
        equalButton.addActionListener(this);
        jf.add(equalButton);

        jf.setVisible(true);
    }

    public static void main(String[] args) {
         new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == oneButton){
            if(isOperatorClicked) {
                displayLabel.setText("1");
                isOperatorClicked = false;

            }else{
                displayLabel.setText(displayLabel.getText() + "1");
            }
        }else if (e.getSource() == twoButton){
            if(isOperatorClicked){
                displayLabel.setText("2");
                isOperatorClicked = false;
            }else{
                displayLabel.setText(displayLabel.getText() + "2");
            }
        }else if(e.getSource() == threeButton){
            if(isOperatorClicked){
                displayLabel.setText("3");
                isOperatorClicked = false;
            }else{
                displayLabel.setText(displayLabel.getText() + "3");
            }
        }else if(e.getSource() == fourButton){
            if(isOperatorClicked){
                displayLabel.setText("4");
                isOperatorClicked = false;
            }else{
                displayLabel.setText(displayLabel.getText() + "4");
            }
        }else if(e.getSource() == fiveButton){
           if(isOperatorClicked){
               displayLabel.setText("5");
               isOperatorClicked = false;
           }else{
               displayLabel.setText(displayLabel.getText() + "5");
           }
        }else if(e.getSource() == sixButton){
            if(isOperatorClicked){
                displayLabel.setText("6");
                isOperatorClicked = false;
            }else{
                displayLabel.setText(displayLabel.getText() + "6");
            }
        }else if(e.getSource() == sevenButton){
            if(isOperatorClicked){
                displayLabel.setText("7");
                isOperatorClicked = false;
            }else{
                displayLabel.setText(displayLabel.getText() + "7");
            }
        }else if(e.getSource() == eightButton){
            if(isOperatorClicked){
                displayLabel.setText("8");
                isOperatorClicked = false;
            }else{
                displayLabel.setText(displayLabel.getText() + "8");
            }
        }else if(e.getSource() == nineButton){
            if(isOperatorClicked){
                displayLabel.setText("9");
                isOperatorClicked = false;
            }else{
                displayLabel.setText(displayLabel.getText() + "9");
            }
        }else if(e.getSource() == zeroButton){
            if(isOperatorClicked){
                displayLabel.setText("0");
                isOperatorClicked = false;
            }else{
                displayLabel.setText(displayLabel.getText() + "0");
            }
        }else if(e.getSource() == clearButton){
            displayLabel.setText("");
        }else if(e.getSource() == dotButton){
            if(!isOperatorClicked && !isDotClicked) {
                displayLabel.setText(displayLabel.getText() + ".");
                isDotClicked = true;
            }else if(isOperatorClicked && !isDotClicked){
                displayLabel.setText(displayLabel.getText() + ".");
                isDotClicked = true;
            }
        }else if(e.getSource() == plusButton){
            oldValue = displayLabel.getText();
            float newF = Float.parseFloat(newValue);
            float oldF = Float.parseFloat(oldValue);
            if(newF > 0) displayLabel.setText(newF + oldF + "");
            newValue = displayLabel.getText();
            isOperatorClicked = true;
            isPlusClicked = true;
            isDotClicked = false;
        } else if(e.getSource() == minusButton){
            oldValue = displayLabel.getText();
            float newF = Float.parseFloat(newValue);
            float oldF = Float.parseFloat(oldValue);
            if(newF > 0) displayLabel.setText((oldF - newF) + "");
            newValue = displayLabel.getText();
            isOperatorClicked = true;
            isMinusClicked = true;
            isDotClicked = false;
        }else if(e.getSource() == multiButton){
            oldValue = displayLabel.getText();
            float newF = Float.parseFloat(newValue);
            float oldF = Float.parseFloat(oldValue);
            if(newF > 0) displayLabel.setText((oldF * newF) + "");
            newValue = displayLabel.getText();
            isOperatorClicked = true;
            isMultiClicked = true;
            isDotClicked = false;
        }else if (e.getSource() == divButton) {
            oldValue = displayLabel.getText();
            float newF = Float.parseFloat(newValue);
            float oldF = Float.parseFloat(oldValue);
            if(newF > 0) displayLabel.setText((oldF / newF) + "");
            newValue = displayLabel.getText();
            isOperatorClicked = true;
            isDivClicked = true;
            isDotClicked = false;
        }else if(e.getSource() == equalButton){
            String newValue = displayLabel.getText();
            float oldF = Float.parseFloat(oldValue);
            float newF = Float.parseFloat(newValue);
            float answer;
            if(isPlusClicked){
                answer = oldF + newF;
                isPlusClicked = false;
                displayLabel.setText(answer + "");
                oldValue = answer + "";
            }else if(isMinusClicked){
                answer = oldF - newF;
                isMinusClicked = false;
                displayLabel.setText(answer + "");
                oldValue = answer + "";
            }else if(isDivClicked){
                answer = oldF / newF;
                isDivClicked = false;
                displayLabel.setText(answer + "");
                oldValue = answer + "";
            }else if(isMultiClicked){
                answer = oldF * newF;
                isMultiClicked = false;
                displayLabel.setText(answer + "");
                oldValue =answer + "";
            }

        }

    }

}
