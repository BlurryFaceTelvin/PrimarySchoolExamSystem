import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by BlurryFace on 3/29/2017.
 */
public class EnglishForm4 {
    public JPanel panel1;
    private JRadioButton ARadioButton;
    private JRadioButton BRadioButton;
    private JRadioButton CRadioButton;
    private JRadioButton DRadioButton;
    private JButton nextButton;
    int sum,idNumber;
    public EnglishForm4(int z,int id) {

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum = z;
                idNumber =id;
                if(ARadioButton.isSelected())
                {
                    sum = sum+1;
                    JFrame eng5 = new JFrame("Question 5");
                    eng5.setContentPane(new EnglishForm5(sum,idNumber).panel1);
                    eng5.pack();
                    eng5.setVisible(true);
                }
                else
                {
                    JFrame eng5 = new JFrame("Question 5");
                    eng5.setContentPane(new EnglishForm5(sum,idNumber).panel1);
                    eng5.pack();
                    eng5.setVisible(true);

                }

            }
        });
    }
}
