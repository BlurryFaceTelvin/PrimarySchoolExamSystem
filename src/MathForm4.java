import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by BlurryFace on 3/29/2017.
 */
public class MathForm4 {
    public JPanel panel1;
    private JRadioButton ARadioButton;
    private JRadioButton BRadioButton;
    private JRadioButton CRadioButton;
    private JRadioButton DRadioButton;
    private JButton Next;
    int sum,idNumber;

    public MathForm4(int z,int id) {
        Next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum =z;
                idNumber = id;
                if(DRadioButton.isSelected())
                {
                    sum =sum +1;
                    JFrame math5 = new JFrame("Question 5");
                    math5.setContentPane(new MathForm5(sum,idNumber).panel1);
                    math5.pack();
                    math5.setVisible(true);
                }
                else
                {
                    JFrame math5 = new JFrame("Question 5");
                    math5.setContentPane(new MathForm5(sum,idNumber).panel1);
                    math5.pack();
                    math5.setVisible(true);
                }


            }
        });
    }


}
