import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by BlurryFace on 3/29/2017.
 */
public class MathForm {
    public JPanel MainPanel;
    private JRadioButton ARadioButton;
    private JRadioButton BRadioButton;
    private JRadioButton CRadioButton;
    private JRadioButton DRadioButton;
    private JButton nextButton;
    int idNumber;

    public int getSum()
    {
        int sum = 0;
        if(BRadioButton.isSelected()) {
            sum++;
            return sum;
        }
        else
            return sum;
    }

    public MathForm(int id) {

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                idNumber = id;



                //show the next question
                JFrame math2 = new JFrame("Question 2");
                math2.setContentPane(new MathForm2(getSum(),idNumber).panel1);
                math2.pack();
                math2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                math2.setVisible(true);

            }
        });

    }


}
