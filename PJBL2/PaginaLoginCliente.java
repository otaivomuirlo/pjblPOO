
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PaginaLoginCliente extends PaginaInicial{
    JFrame frame = new JFrame();
    JLabel label = new JLabel("pagina cliente");
    JButton voltarButton = new JButton();

    PaginaLoginCliente(){
        label.setBounds(0,0,100,50);

        voltarButton.setBounds(100,100,200,40);
        voltarButton.setFocusable(false);
        frame.add(voltarButton);
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==voltarButton){
                    PaginaInicial paginaInicial = new PaginaInicial();
                }
            }
        });


        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
