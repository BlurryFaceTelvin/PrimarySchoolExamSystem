import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

/**
 * Created by BlurryFace on 3/29/2017.
 */
public class SubjectForm extends JFrame{
    public JPanel MainSubjectPanel;
    private JRadioButton mathRadioButton;
    private JRadioButton englishRadioButton;
    private JRadioButton scienceRadioButton;
    private JRadioButton creRadioButton;
    private JButton beginExamButton;
    private JPanel RadioButtonPanel1;
    private JPanel RadioButtonPanel2;
    private JPanel ButtonPanel;
    private JLabel examSystemLabel;
    private JPanel titlePanel;
    int idNumber;


    public SubjectForm (int id) {


        //subjectFrame.setContentPane(new SubjectForm().MainSubjectPanel);
        beginExamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                idNumber = id;
                LogInForm in = new LogInForm();
                //hidding the current frame

                SubjectForm.this.setVisible(false);





                if(mathRadioButton.isSelected())
                {


                    JFrame mathFrame = new JFrame("Maths");
                    mathFrame.setContentPane(new MathForm(idNumber).MainPanel);
                    mathFrame.pack();
                    mathFrame.setVisible(true);
                }
                else if(englishRadioButton.isSelected())
                {


                    JFrame engFrame = new JFrame("English");
                    engFrame.setContentPane(new EnglishForm(idNumber).panel1);
                    engFrame.pack();
                    engFrame.setVisible(true);
                }
                else if(scienceRadioButton.isSelected())
                {
                    JFrame scienceFrame = new JFrame("Science");
                    scienceFrame.setContentPane(new ScienceForm(idNumber).panel1);
                    scienceFrame.pack();
                    scienceFrame.setVisible(true);

                }
                else if(creRadioButton.isSelected())
                {
                    JFrame socialFrame = new JFrame("Social Studies");
                    socialFrame.setContentPane(new CREForm(idNumber).panel1);
                    socialFrame.pack();
                    socialFrame.setVisible(true);

                }
                else
                {
                    JOptionPane.showMessageDialog(null,"You have to pick a subject ");


                }
            }
        });
    }
}
