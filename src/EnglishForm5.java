import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

/**
 * Created by BlurryFace on 3/29/2017.
 */
public class EnglishForm5 {
    public JPanel panel1;
    private JButton finishButton;
    private JRadioButton ARadioButton;
    private JRadioButton BRadioButton;
    private JRadioButton CRadioButton;
    private JRadioButton DRadioButton;
    int sum,idNumber;
    public EnglishForm5(int a,int id) {

        finishButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum = a;
                idNumber =id;
                if(ARadioButton.isSelected())
                {
                    sum = sum+1;

                }
                else
                {
                    sum = sum+0;
                }
                try {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam_system","s","s");
                    //create a statement
                    Statement st = con.createStatement();
                    //Execute sql query
                    ResultSet rs = st.executeQuery("select * from eng_result");
                    switch (sum)
                    {
                        case 5:
                            st.execute("insert into eng_result(ID_Number,English_Grade) values('"+idNumber+"','A')");
                            JOptionPane.showMessageDialog(null,"You have an A in English");
                            break;
                        case 4:
                            st.execute("insert into eng_result(ID_Number,English_Grade) values('"+idNumber+"','B')");
                            JOptionPane.showMessageDialog(null,"You have a B in English");
                            break;
                        case 3:
                            st.execute("insert into eng_result(ID_Number,English_Grade) values('"+idNumber+"','C')");
                            JOptionPane.showMessageDialog(null,"You have a C in English");
                            break;
                        case 2:
                            st.execute("insert into eng_result(ID_Number,English_Grade) values('"+idNumber+"','D')");
                            JOptionPane.showMessageDialog(null,"You have a D in English");
                            break;
                        case 1:
                            st.execute("insert into eng_result(ID_Number,English_Grade) values('"+idNumber+"','E')");
                            JOptionPane.showMessageDialog(null,"You have an E in English");
                            break;
                        case 0:
                            st.execute("insert into eng_result(ID_Number,English_Grade) values('"+idNumber+"','F')");
                            JOptionPane.showMessageDialog(null,"You have an F in English");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null,"Something wrong happened with the exam");
                    }


                    JFrame examFrame = new JFrame("Subjects");
                    // examFrame.setContentPane(new SubjectForm(idNumber).MainSubjectPanel);
                    examFrame.pack();
                    examFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    examFrame.setVisible(true);
                }
                catch (SQLException ex)
                {
                    ex.printStackTrace();
                }


            }
        });
    }
}
