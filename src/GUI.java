import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    public static final String TITLE = "Cégvezető";

    public GUI() throws HeadlessException {

        setTitle(TITLE);

        JPanel jpanel = new JPanel();

        this.setSize(1027, 768);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        int a = 154;
        SpinnerModel model =
                new SpinnerNumberModel(a, //initial value
                        a - 100, //min
                        a + 100, //max
                        1);                //step

    }

}
