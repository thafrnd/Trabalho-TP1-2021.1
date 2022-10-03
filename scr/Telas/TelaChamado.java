package Telas;

import javax.swing.*;
import Classes.Chamado;
import Classes.Cliente;
import Classes.Motorista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaChamado extends JFrame{
    private JPanel telaChamado;
    private JTextField idChamado;
    private JTextField dataChamado;
    private JTextField origemChamado;
    private JTextField destinoChamado;
    private JTextField partidaChamado;
    private JTextField retornoChamado;
    private JComboBox cbTipo;
    private JComboBox cbMotorista;
    private JComboBox cbPerfil;
    private JTextField valorTotal;
    private JButton iniciarButton;
    private JTextField kmInicial;
    private JTextField kmFinal;
    public  static Chamado chamado;
    public static int indicecliente;
    public static int indicemotorista;

    public TelaChamado (String title) {
        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(telaChamado);
        this.pack();
        this.setLocationRelativeTo(null);

        carregaClientes();
        carregaMotoristas();

        cbTipo.removeAllItems();
        cbTipo.addItem("Selecione um tipo de corrida");
        cbTipo.addItem("VIAGEM");
        cbTipo.addItem("CORRIDA");

        iniciarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int indicetipo = cbTipo.getSelectedIndex();
                indicecliente = cbPerfil.getSelectedIndex();
                indicemotorista = cbMotorista.getSelectedIndex();

                if (dataChamado.getText().equals("") || idChamado.getText().equals("") || origemChamado.getText().equals("") || destinoChamado.getText().equals("") ||
                        partidaChamado.getText().equals("") || retornoChamado.getText().equals("") || kmInicial.getText().equals("") || kmFinal.getText().equals("") ||
                        valorTotal.getText().equals("")) {


                    JOptionPane.showMessageDialog(null, "TODOS OS CAMPOS  DEVEM SER PREENCHIDOS!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                    idChamado.requestFocus();
                } else if (indicetipo == 0 || indicecliente == 0 || indicemotorista == 0) {
                    JOptionPane.showMessageDialog(null, "TODOS OS CAMPOS  DEVEM SER SELECIONADOS!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                } else {

                    String data = dataChamado.getText();
                    int id = Integer.parseInt(idChamado.getText());
                    String origem = origemChamado.getText();
                    String destino = destinoChamado.getText();
                    float partida = Float.parseFloat(partidaChamado.getText());
                    float retorno = Float.parseFloat(retornoChamado.getText());
                    double kminicial = Double.parseDouble(kmInicial.getText());
                    double kmfinal = Double.parseDouble(kmFinal.getText());
                    double valor = Double.parseDouble(valorTotal.getText());
                    String tipo;


                    if (indicetipo==1){
                        tipo= "viagem";
                    }
                    else {
                        tipo = "corrida";
                    }


                    chamado = new Chamado(id, data, tipo, origem, destino, partida, retorno,
                            kminicial, kmfinal, valor);

                    chamado.setCliente(TelaCliente2.listaClientes.get(indicecliente-1));
                    chamado.setMotorista(TelaMotorista.listaMotoristas.get(indicemotorista-1));

                    JFrame frameBuscando = new BuscandoCorrida("Buscando..");
                    frameBuscando.setVisible(true);



                }
            }
        });
    }
    public void carregaClientes() {
        cbPerfil.removeAllItems();
        cbPerfil.addItem("Selecione um perfil");

        for (int i = 0; i < TelaCliente2.listaClientes.size(); i++) {
            cbPerfil.addItem(TelaCliente2.listaClientes.get(i).getNome());
        }

    }

    public void carregaMotoristas() {
        cbMotorista.removeAllItems();
        cbMotorista.addItem("Selecione um motorista");

        for (int i = 0; i < TelaMotorista.listaMotoristas.size(); i++) {
            cbMotorista.addItem(TelaMotorista.listaMotoristas.get(i).getNome());
        }

    }

    }
