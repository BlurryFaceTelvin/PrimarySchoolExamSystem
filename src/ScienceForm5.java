import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

/**
 * Created by BlurryFace on 3/29/2017.
 */
public class ScienceForm5 {
    public JPanel panel1;
    private JRadioButton trueRadioButton;
    private JRadioButton falseRadioButton;
    private JButton finishButton;
    int sum,idNumber;
    public ScienceForm5(int g,int id) {
        finishButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum =g;
                idNumber =id;
                if(trueRadioButton.isSelected())
                {
                    sum = sum+1;
                }
                else
                {
                    sum = sum + 0;

                }
                try {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam_system","s","s");
                    //create a statement
                    Statement st = con.createStatement();
                    //Execute sql query
                    ResultSet rs = st.executeQuery("select * from science_result");
                    switch (sum)
                    {

                        case 5:
                            st.execute("insert into science_result(ID_Number,Science_Grade) values('"+idNumber+"','A')");
                            JOptionPane.showMessageDialog(null,"You have an A in Science");
                            break;
                        case 4:
                            st.execute("insert into science_result(ID_Number,Science_Grade) values('"+idNumber+"','B')");
                            JOptionPane.showMessageDialog(null,"You have a B in Science");
                            break;
                        case 3:
                            st.execute("insert into science_result(ID_Number,Science_Grade) values('"+idNumber+"','C')");
                            JOptionPane.showMessageDialog(null,"You have a C in Science");
                            break;
                        case 2:
                            st.execute("insert into science_result(ID_Number,Science_Grade) values('"+idNumber+"','D')");
                            JOptionPane.showMessageDialog(null,"You have a D in Science");
                            break;
                        case 1:
                            st.execute("insert into science_result(ID_Number,Science_Grade) values('"+idNumber+"','E')");
                            JOptionPane.showMessageDialog(null,"You have an E in Science");
                            break;
                        case 0:
                            st.execute("insert into science_result(ID_Number,Science_Grade) values('"+idNumber+"','F')");
                            JOptionPane.showMessageDialog(null,"You have an F in Science");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null,"Something wrong happened with the exam");
                    }
                    JFrame examFrame = new JFrame("Subjects");
                    examFrame.setContentPane(new SubjectForm(idNumber).MainSubjectPanel);
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
