import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by BlurryFace on 3/28/2017.
 */
public class RegisterForm {
    public JPanel MainRegisterPanel;
    private JPanel LabelPanel;
    private JPanel FieldPanel;
    private JPanel ButtonPanel;
    private JLabel firstNameLabel;
    private JLabel lastNameLabel;
    private JLabel IDNumberLabel;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField idField;
    private JTextField usernameField;
    private JButton registerButton;
    private JButton cancelButton;
    Statement st;


    public void myDatabaseConnection()
    {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam_system","s","s");
            st = con.createStatement();
            st.executeQuery("Select * from students");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
    public RegisterForm() {



        myDatabaseConnection();





        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    st.execute("insert into students(First_Name,Last_Name,ID_Number,username,password) values('"+firstNameField.getText()+"','"+lastNameField.getText()+"','"+Integer.parseInt(idField.getText())+"','"+ usernameField.getText()+"','"+ passwordField.getText()+"')");
                    JOptionPane.showMessageDialog(null,"Registered Successfully");



                }
                catch   (Exception e1)
                {
                    e1.printStackTrace();

                }

            }
        });
    }


}
