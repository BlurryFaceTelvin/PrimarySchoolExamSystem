import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by BlurryFace on 3/29/2017.
 */
public class EnglishForm3 {
    public JPanel panel1;
    private JRadioButton ARadioButton;
    private JRadioButton BRadioButton;
    private JRadioButton CRadioButton;
    private JRadioButton DRadioButton;
    private JButton nextButton;
    int sum,idNumber;

    public EnglishForm3(int y,int id) {
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum =y;
                idNumber =id;
                if(DRadioButton.isSelected())
                {
                    sum = sum+1;
                    JFrame eng4 = new JFrame("Question 4");
                    eng4.setContentPane(new EnglishForm4(sum,idNumber).panel1);
                    eng4.pack();
                    eng4.setVisible(true);
                }
                else
                {
                    JFrame eng4 = new JFrame("Question 4");
                    eng4.setContentPane(new EnglishForm4(sum,idNumber).panel1);
                    eng4.pack();
                    eng4.setVisible(true);

                }

            }
        });
    }
}
