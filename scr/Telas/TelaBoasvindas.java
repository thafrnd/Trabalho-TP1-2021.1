package Telas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//menu
//cadastro motorista
//cadastro cliente
//chamado


//menu
public class TelaBoasvindas extends JFrame {
    private JPanel pnlBoasvindas;
    private JLabel labelBoasvindas;
    private JButton buttonmotorista;
    private JButton buttoncliente;
    private JButton criarChamadoButton;
    private JButton sairButton;

    public TelaBoasvindas(String title){
        super (title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(pnlBoasvindas);
        this.pack();
        this.setLocationRelativeTo(null);
        buttonmotorista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //tela do motorista
                JFrame frameMotorista = new TelaMotorista("Cadastre-se");
                frameMotorista.setVisible(true);
            }
        });
        buttoncliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frameCliente = new TelaCliente2("Cadastre-se");
                frameCliente.setVisible(true);
            }
        });
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        criarChamadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    JFrame frameChamado = new TelaChamado("Preencha");
                    frameChamado.setVisible(true);
                } catch (Exception exception) {
                        JOptionPane.showMessageDialog(null, "Cadastre pelo menos um Motorista e um Cliente !", "Atenção !", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frameBoasvindas= new TelaBoasvindas("Boas vindas !");
        frameBoasvindas.setVisible(true);
    }
}
