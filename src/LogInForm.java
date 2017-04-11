import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
/**
 * Created by BlurryFace on 3/27/2017.
 */
public class LogInForm {
    public JPanel MainPanel;
    private JPanel LabelPanel;
    private JPanel TextFieldPanel;
    private JPanel ButtonPanel;
    private JLabel userNameLabel;
    private JLabel passwordLabel;
    private JTextField nameField;
    public JPasswordField passwordField1;
    private JButton logInButton;
    private JButton signUpButton;
    private JButton cancelButton;
    public static JFrame frame;
    public JFrame examFrame = new JFrame("Subjects");

    public int getID()
    {
        return Integer.parseInt(passwordField1.getText());
    }




    public LogInForm() {


        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setContentPane(new LogInForm().MainPanel);
                frame.setVisible(false);


                JFrame signUpFrame = new JFrame("SignUpForm");
                signUpFrame.setContentPane(new RegisterForm().MainRegisterPanel);
                signUpFrame.pack();
                signUpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                signUpFrame.setVisible(true);

            }
        });
        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam_system","s","s");
                    //create a statement
                    Statement st = con.createStatement();
                    //Execute sql query
                    ResultSet rs = st.executeQuery("select * from students where username='"+nameField.getText()+"' and password ='"+passwordField1.getText()+"'  ");

                    if(rs.next())
                    {
                        JOptionPane.showMessageDialog(null,"You have successfully logged in");
                        frame.setContentPane(new LogInForm().MainPanel);
                        frame.setVisible(false);

                        JFrame subjectFrame = new JFrame("Subjects");
                        subjectFrame.setContentPane(new SubjectForm(getID()).MainSubjectPanel);
                        subjectFrame.pack();
                        subjectFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                        subjectFrame.setVisible(true);






                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"You have to sign up first");

                    }

                }
                catch (SQLException sqe)
                {
                    sqe.printStackTrace();
                }

            }
        });
    }

    public static void main(String[] args) {
        frame = new JFrame("LogInForm");
        frame.setContentPane(new LogInForm().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
