import javax.swing.JFrame;
import javax.swing.JLabel;

public class PaginaLoginFuncionario {
        JFrame frame = new JFrame();
    JLabel label = new JLabel("pagina funcionario");
    
    PaginaLoginFuncionario(){
        label.setBounds(0,0,100,50);

        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
