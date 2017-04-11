import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

/**
 * Created by BlurryFace on 3/29/2017.
 */
public class CREForm5 {
    public JPanel panel1;
    private JRadioButton ARadioButton;
    private JRadioButton BRadioButton;
    private JRadioButton CRadioButton;
    private JRadioButton DRadioButton;
    private JButton finishButton;
    int sum,idNumber;
    public CREForm5(int n,int id) {
        finishButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum =n;
                idNumber = id;
                if(ARadioButton.isSelected())
                {
                    sum = sum + 1;
                }
                else
                {
                    sum = sum +0;
                }
                try {


                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam_system","s","s");
                    //create a statement
                    Statement st = con.createStatement();
                    //Execute sql query
                    ResultSet rs = st.executeQuery("select * from cre_result");

                    switch (sum)
                    {
                        case 5:
                            st.execute("insert into cre_result(ID_Number,Cre_Grade) values('"+idNumber+"','A')");
                            JOptionPane.showMessageDialog(null,"You have an A in CRE");
                            break;
                        case 4:
                            st.execute("insert into cre_result(ID_Number,Cre_Grade) values('"+idNumber+"','B')");
                            JOptionPane.showMessageDialog(null,"You have a B in CRE");
                            break;
                        case 3:
                            st.execute("insert into cre_result(ID_Number,Cre_Grade) values('"+idNumber+"','C')");
                            JOptionPane.showMessageDialog(null,"You have a C in CRE");
                            break;
                        case 2:
                            st.execute("insert into cre_result(ID_Number,Cre_Grade) values('"+idNumber+"','D')");
                            JOptionPane.showMessageDialog(null,"You have a D in CRE");
                            break;
                        case 1:
                            st.execute("insert into cre_result(ID_Number,Cre_Grade) values('"+idNumber+"','E')");
                            JOptionPane.showMessageDialog(null,"You have an E in CRE");
                            break;
                        case 0:
                            st.execute("insert into cre_result(ID_Number,Cre_Grade) values('"+idNumber+"','F')");
                            JOptionPane.showMessageDialog(null,"You have an F in CRE");
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
