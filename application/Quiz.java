
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {

    String QNA[][] = new String[10][5];
    String ans[][] = new String[10][2];
    String userans[][] = new String[10][1];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit, lifeline;

    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;

    String name;

    Quiz(String name) {
        this.name = name;
        setBounds(70, 50, 1200, 600);
        getContentPane().setBackground(new Color(255, 255, 255));
        setLayout(null);
        setVisible(true);

        ImageIcon imageIcon = new ImageIcon("E:\\JAVA ASSIGNMENT\\OOP PROJECT\\Quiz managment game\\src\\icons/quiz.jpg");
        Image image = imageIcon.getImage().getScaledInstance(1200, 300, Image.SCALE_DEFAULT);
        ImageIcon scaledImageIcon = new ImageIcon(image);
        JLabel imageLabel = new JLabel(scaledImageIcon);
        imageLabel.setBounds(0, 0, 1200, 300);
        add(imageLabel);

        qno = new JLabel();
        qno.setBounds(100,300,50,30);
        qno.setFont(new Font("ARIAL", Font.PLAIN,18));
        add(qno);

        question = new JLabel();
        question.setBounds(120,300,1000,30);
        question.setFont(new Font("ARIAL", Font.PLAIN,18));
        add(question);

        QNA[0][0] = "Which pillar of Java is primarily focused on code reusability and building relationships between classes?";
        QNA[0][1] = "a) Inheritance";
        QNA[0][2] = "b) Encapsulation";
        QNA[0][3] = "c) Polymorphism";
        QNA[0][4] = "d) Abstraction";

        QNA[1][0] = "Which pillar of Java ensures that objects only reveal necessary information and hide their internal details?";
        QNA[1][1] = "a) Inheritance";
        QNA[1][2] = "b) Encapsulation";
        QNA[1][3] = "c) Polymorphism";
        QNA[1][4] = "d) Abstraction";

        QNA[2][0] = "Which pillar of Java allows objects to have multiple forms and behave differently based on their types?";
        QNA[2][1] = "a) Inheritance";
        QNA[2][2] = "b) Encapsulation";
        QNA[2][3] = "c) Polymorphism";
        QNA[2][4] = "d) Abstraction";

        QNA[3][0] = "Which pillar of Java simplifies complex systems by breaking them down into smaller, more manageable components?";
        QNA[3][1] = "a) Inheritance";
        QNA[3][2] = "b) Encapsulation";
        QNA[3][3] = "c) Polymorphism";
        QNA[3][4] = "d) Abstraction";

        QNA[4][0] = "Which pillar of Java allows objects to inherit properties and behaviors from other objects?";
        QNA[4][1] = "a) Inheritance";
        QNA[4][2] = "b) Encapsulation";
        QNA[4][3] = "c) Polymorphism";
        QNA[4][4] = "d) Abstraction";

        QNA[5][0] = "Which pillar of Java focuses on bundling data and methods into a single unit, thus providing data protection and control?";
        QNA[5][1] = "a) Inheritance";
        QNA[5][2] = "b) Encapsulation";
        QNA[5][3] = "c) Polymorphism";
        QNA[5][4] = "d) Abstraction";

        QNA[6][0] = "Which pillar of Java allows objects to be treated as instances of their own class or their parent class interchangeably?";
        QNA[6][1] = "a) Inheritance";
        QNA[6][2] = "b) Encapsulation";
        QNA[6][3] = "c) Polymorphism";
        QNA[6][4] = "d) Abstraction";

        QNA[7][0] = "Which pillar of Java deals with creating abstract classes and interfaces to represent general behaviors and characteristics?";
        QNA[7][1] = "a) Inheritance";
        QNA[7][2] = "b) Encapsulation";
        QNA[7][3] = "c) Polymorphism";
        QNA[7][4] = "d) Abstraction";

        QNA[8][0] = "Which pillar of Java enables objects to be categorized into hierarchical structures, promoting code organization and reusability?";
        QNA[8][1] = "a) Inheritance";
        QNA[8][2] = "b) Encapsulation";
        QNA[8][3] = "c) Polymorphism";
        QNA[8][4] = "d) Abstraction";

        QNA[9][0] = "Which pillar of Java focuses on grouping related data and behaviors into a single entity to promote code organization and maintainability?";
        QNA[9][1] = "a) Inheritance";
        QNA[9][2] = "b) Encapsulation";
        QNA[9][3] = "c) Polymorphism";
        QNA[9][4] = "d) Abstraction";

        ans[0][0] = "a) Inheritance";
        ans[1][0] = "b) Encapsulation";
        ans[2][0] = "c) Polymorphism";
        ans[3][0] = "d) Abstraction";
        ans[4][0] = "a) Inheritance";
        ans[5][0] = "b) Encapsulation";
        ans[6][0] = "c) Polymorphism";
        ans[7][0] = "d) Abstraction";
        ans[8][0] = "a) Inheritance";
        ans[9][0] = "b) Encapsulation";

        opt1 = new JRadioButton();
        opt1.setBounds(100, 350, 600, 50);
        opt1.setBackground(new Color(255, 255, 255));
        add(opt1);


        opt2 = new JRadioButton();
        opt2.setBounds(100, 380, 600, 50);
        opt2.setBackground(new Color(255, 255, 255));
        add(opt2);

        opt3 = new JRadioButton();
        opt3.setText(QNA[0][3]);
        opt3.setBounds(100, 410, 600, 50);
        opt3.setBackground(new Color(255, 255, 255));
        add(opt3);

        opt4 = new JRadioButton();
        opt4.setText(QNA[0][4]);
        opt4.setBounds(100, 440, 600, 50);
        opt4.setBackground(new Color(255, 255, 255));
        add(opt4)

        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);

        next = new JButton("NEXT");
        next.setBounds(100,500,150,40);
        next.setFont(new Font("ARIAL", Font.PLAIN,24));
        next.setBackground(new Color(30,144,255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        lifeline = new JButton("50-50 Lifeline");
        lifeline.setBounds(1100, 630, 200, 40);
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lifeline.setBackground(new Color(30, 144, 255));
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        add(lifeline);

        submit = new JButton("SUBMIT");
        submit.setBounds(350,500,150,40);
        submit.setFont(new Font("ARIAL", Font.PLAIN,24));
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.setEnabled(false);
        submit.addActionListener(this);
        add(submit);

        start(count);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                userans[count][0] = "";
            } else {
                userans[count][0] = groupoptions.getSelection().getActionCommand();
            }

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            count++;
            start(count);
        } else if (ae.getSource() == lifeline) {
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                userans[count][0] = "";
            } else {
                userans[count][0] = groupoptions.getSelection().getActionCommand();
            }

            for (int i = 0; i < userans.length; i++) {
                if (userans[i][0].equals(ans[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            setVisible(false);
            new Score(name, score);
        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        String time = "Time left - " + timer + " seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));

        if (timer > 0) {
            g.drawString(time, 1100, 500);
        } else {
            g.drawString("Times up!!", 1100, 500);
        }

        timer--; // 14

        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) { // submit button
                if (groupoptions.getSelection() == null) {
                    userans[count][0] = "";
                } else {
                    userans[count][0] = groupoptions.getSelection().getActionCommand();
                }

                for (int i = 0; i < userans.length; i++) {
                    if (userans[i][0].equals(ans[i][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                setVisible(false);
                new Score(name, score);
            } else { // next button
                if (groupoptions.getSelection() == null) {
                    userans[count][0] = "";
                } else {
                    userans[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++; // 0 // 1
                start(count);
            }
        }

    }

    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(QNA[count][0]);
        opt1.setText(QNA[count][1]);
        opt1.setActionCommand(QNA[count][1]);

        opt2.setText(QNA[count][2]);
        opt2.setActionCommand(QNA[count][2]);

        opt3.setText(QNA[count][3]);
        opt3.setActionCommand(QNA[count][3]);

        opt4.setText(QNA[count][4]);
        opt4.setActionCommand(QNA[count][4]);

        groupoptions.clearSelection();
    }

    public static void main(String[] args) {
        new Quiz("User");
    }
}
