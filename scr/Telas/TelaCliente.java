package Telas;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Classes.Cliente;
import java.util.ArrayList;

public class TelaCliente extends JFrame {
    private JPanel pnlCliente;
    private JPanel telaTela;
    private JTextField idCliente;
    private JTextField nomeCliente;
    private JTextField telefoneCliente;
    private JTextField rgCliente;
    private JLabel lblNome;
    private JLabel lblTelefone;
    private JLabel lblRG;
    private JButton cancelarButton;
    private JButton novoButton;
    private JButton confirmarButton;
    private JButton sairButton;
    private JLabel lblCPF;
    private JTextField cpfCliente;
    static ArrayList<Cliente> listaClientes;

    public TelaCliente(String title) {
        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(telaTela);
        this.pack();
        this.setLocationRelativeTo(null);
        listaClientes = new ArrayList();
        novoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                novoButton.setEnabled(false);
                cancelarButton.setEnabled(true);
                confirmarButton.setEnabled(true);

                nomeCliente.setEnabled(true);
                idCliente.setEnabled(true);
                telefoneCliente.setEnabled(true);
                rgCliente.setEnabled(true);
                cpfCliente.setEnabled(true);

                nomeCliente.requestFocus();
            }
        });
        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (nomeCliente.getText().equals("") || idCliente.getText().equals("") || telefoneCliente.getText().equals("")
                        || rgCliente.getText().equals("") || cpfCliente.getText().equals("")) {

                    JOptionPane.showMessageDialog(null, "TODOS OS CAMPOS  DEVEM SER PREENCHIDOS!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                    nomeCliente.requestFocus();
                }
                else {

                    String nome = nomeCliente.getText();
                    int id = Integer.parseInt(idCliente.getText());
                    String telefone = telefoneCliente.getText();
                    String rg = rgCliente.getText();
                    String cpf = cpfCliente.getText();


                    Cliente cliente = new Cliente(id, nome, telefone, rg, cpf);
                    listaClientes.add(cliente);
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso", "Mensagem", JOptionPane.INFORMATION_MESSAGE);


                    nomeCliente.setText("");
                    idCliente.setText("");
                    telefoneCliente.setText("");
                    rgCliente.setText("");
                    cpfCliente.setText("");


                    novoButton.setEnabled(true);
                    cancelarButton.setEnabled(false);
                    confirmarButton.setEnabled(false);

                    nomeCliente.setEnabled(false);
                    idCliente.setEnabled(false);
                    telefoneCliente.setEnabled(false);
                    rgCliente.setEnabled(false);
                    cpfCliente.setEnabled(false);
                    System.out.println(cliente.getId()+" "+cliente.getCPF()+" "+ cliente.getNome()+" "+cliente.getTelefone()+" "+ cliente.getRG());
                }
            }
        });
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                nomeCliente.setText("");
                idCliente.setText("");
                telefoneCliente.setText("");
                rgCliente.setText("");
                cpfCliente.setText("");


                novoButton.setEnabled(true);
                cancelarButton.setEnabled(false);
                confirmarButton.setEnabled(false);


                nomeCliente.setEnabled(false);
                idCliente.setEnabled(false);
                telefoneCliente.setEnabled(false);
                rgCliente.setEnabled(false);
                cpfCliente.setEnabled(false);
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