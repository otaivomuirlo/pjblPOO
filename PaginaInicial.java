import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PaginaInicial{
    JFrame frame = new JFrame();

    JButton gerenteButton = new JButton("Gerente");
    JButton clienteButton = new JButton("Cliente");
    JButton funcionarioButton = new JButton("Funcionário");

    PaginaInicial(){
        clienteButton.setBounds(100,100,200,40);
        clienteButton.setFocusable(false);
        frame.add(clienteButton);
        clienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==clienteButton){
                    PaginaLoginCliente paginaLoginCliente = new PaginaLoginCliente();
                }
            }
        });

        gerenteButton.setBounds(100,160,200,40);
        gerenteButton.setFocusable(false);
        frame.add(gerenteButton);
        gerenteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==gerenteButton){
                    PaginaLoginGerente paginaLoginGerente = new PaginaLoginGerente();
                }
            }
        });

        funcionarioButton.setBounds(100,220,200,40);
        funcionarioButton.setFocusable(false);
        frame.add(funcionarioButton);
        funcionarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==funcionarioButton){
                    PaginaLoginFuncionario paginaLoginFuncionario = new PaginaLoginFuncionario();
                }
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }

}
