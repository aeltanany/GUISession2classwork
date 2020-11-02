import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Distances extends JFrame{

    private JPanel mainPanel;
    private JSpinner milesSpinner;
    private JLabel kmLbl;


    public Distances(String title){
        super(title);


        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500,500));
        pack();
        milesSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int miles = (int)milesSpinner.getValue();
                float kilometers = (float) miles * 1.609f;
                kmLbl.setText(Float.toString(kilometers));
                /* yes they do match */
            }
        });
    }




}
