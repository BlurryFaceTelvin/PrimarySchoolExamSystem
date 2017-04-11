import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by BlurryFace on 3/29/2017.
 */
public class ScienceForm3 {
    public JPanel panel1;
    private JRadioButton aOxygenRadioButton;
    private JRadioButton bNitrogenRadioButton;
    private JRadioButton CRadioButton;
    private JRadioButton DRadioButton;
    private JButton nextButton;
    int sum,idNumber;
    public ScienceForm3(int b,int id) {

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum = b;
                idNumber =id;
                if(DRadioButton.isSelected())
                {
                    sum = sum+1;
                    JFrame sc4 = new JFrame("Question 4");
                    sc4.setContentPane(new ScienceForm4(sum,idNumber).panel1);
                    sc4.pack();
                    sc4.setVisible(true);
                }
                else
                {
                    JFrame sc4 = new JFrame("Question 4");
                    sc4.setContentPane(new ScienceForm4(sum,idNumber).panel1);
                    sc4.pack();
                    sc4.setVisible(true);

                }

            }
        });
    }
}
