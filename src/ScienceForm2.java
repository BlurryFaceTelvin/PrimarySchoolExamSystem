import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by BlurryFace on 3/29/2017.
 */
public class ScienceForm2 {
    public JPanel panel1;
    private JRadioButton ARadioButton;
    private JRadioButton BRadioButton;
    private JRadioButton CRadioButton;
    private JRadioButton DRadioButton;
    private JButton nextButton;
    int sum,idNumber;
    public ScienceForm2(int x,int id) {

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum = x;
                idNumber = id;
                if(ARadioButton.isSelected())
                {
                    sum = sum+1;

                    JFrame sc3 = new JFrame("Question 3");
                    sc3.setContentPane(new ScienceForm3(sum,idNumber).panel1);
                    sc3.pack();
                    sc3.setVisible(true);
                }
                else
                {

                    JFrame sc3 = new JFrame("Question 3");
                    sc3.setContentPane(new ScienceForm3(sum,idNumber).panel1);
                    sc3.pack();
                    sc3.setVisible(true);
                }

            }
        });
    }
}
