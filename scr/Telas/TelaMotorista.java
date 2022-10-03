package Telas;

import Classes.Cliente;
import Classes.Motorista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TelaMotorista extends JFrame {
    private JPanel telaMotorista;
    private JTextField idMotorista;
    private JTextField nomeMotorista;
    private JTextField telefoneMotorista;
    private JTextField cnhMotorista;
    private JLabel lblID;
    private JLabel lblNome;
    private JLabel lblTelefone;
    private JLabel lblCNH;
    private JLabel lblDados;
    private JButton cancelarButton;
    private JButton confirmarButton;
    private JButton novoButton;
    private JButton sairButton;
    static ArrayList<Motorista> listaMotoristas;

    public TelaMotorista (String title){
        super (title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(telaMotorista);
        this.pack();
        this.setLocationRelativeTo(null);
        listaMotoristas = new ArrayList();

        novoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                novoButton.setEnabled(false);
                cancelarButton.setEnabled(true);
                confirmarButton.setEnabled(true);

                nomeMotorista.setEnabled(true);
                idMotorista.setEnabled(true);
                telefoneMotorista.setEnabled(true);
                cnhMotorista.setEnabled(true);


                nomeMotorista.requestFocus();


            }
        });
        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (nomeMotorista.getText().equals("") || idMotorista.getText().equals("") || telefoneMotorista.getText().equals("")
                        || cnhMotorista.getText().equals("") ) {

                    JOptionPane.showMessageDialog(null, "TODOS OS CAMPOS  DEVEM SER PREENCHIDOS!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                    nomeMotorista.requestFocus();
                }
                else {

                    String nome = nomeMotorista.getText();
                    int id = Integer.parseInt(idMotorista.getText());
                    String telefone = telefoneMotorista.getText();
                    String cnh = cnhMotorista.getText();


                    Motorista motorista = new Motorista(id, nome, telefone, cnh);
                    listaMotoristas.add(motorista);
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso", "Mensagem", JOptionPane.INFORMATION_MESSAGE);


                    nomeMotorista.setText("");
                    idMotorista.setText("");
                    telefoneMotorista.setText("");
                    cnhMotorista.setText("");



                    novoButton.setEnabled(true);
                    cancelarButton.setEnabled(false);
                    confirmarButton.setEnabled(false);

                    nomeMotorista.setEnabled(false);
                    idMotorista.setEnabled(false);
                    telefoneMotorista.setEnabled(false);
                    cnhMotorista.setEnabled(false);
                    //System.out.println(motorista.getId()+" "+ motorista.getNome()+" "+motorista.getTelefone()+" "+ motorista.getCNH());
                }
            }
        });
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nomeMotorista.setText("");
                idMotorista.setText("");
                telefoneMotorista.setText("");
                cnhMotorista.setText("");


                novoButton.setEnabled(true);
                cancelarButton.setEnabled(false);
                confirmarButton.setEnabled(false);


                nomeMotorista.setEnabled(false);
                idMotorista.setEnabled(false);
                telefoneMotorista.setEnabled(false);
                cnhMotorista.setEnabled(false);


            }
        });
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }
}
