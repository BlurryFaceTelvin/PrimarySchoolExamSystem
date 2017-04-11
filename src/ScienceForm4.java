import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by BlurryFace on 3/29/2017.
 */
public class ScienceForm4 {
    public JPanel panel1;
    private JRadioButton ARadioButton;
    private JRadioButton BRadioButton;
    private JRadioButton CRadioButton;
    private JRadioButton DRadioButton;
    private JButton nextButton;
    int sum,idNumber;
    public ScienceForm4(int n,int id) {

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum = n;
                idNumber =id;
                if(ARadioButton.isSelected())
                {
                    sum = sum+1;
                    JFrame sc5 = new JFrame("Question 5");
                    sc5.setContentPane(new ScienceForm5(sum,idNumber).panel1);
                    sc5.pack();
                    sc5.setVisible(true);
                }
                else
                {
                    JFrame sc5 = new JFrame("Question 5");
                    sc5.setContentPane(new ScienceForm5(sum,idNumber).panel1);
                    sc5.pack();
                    sc5.setVisible(true);

                }

            }
        });
    }
}
