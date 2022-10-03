package Telas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static Telas.TelaChamado.indicemotorista;



public class BuscandoCorrida extends JFrame{
    private JPanel plnBuscandoCorrida;
    private JButton cancelarButton;
    private JLabel llblIdChamado;
    private JLabel lblNomeMotorista;
    private JLabel lblHorarioRetorno;

    public BuscandoCorrida(String title){
        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(plnBuscandoCorrida);
        this.pack();
        this.setLocationRelativeTo(null);

        llblIdChamado.setText(String.valueOf(TelaChamado.chamado.getId()));
        lblHorarioRetorno.setText(String.valueOf(TelaChamado.chamado.getRetorno()));
        lblNomeMotorista.setText(TelaMotorista.listaMotoristas.get(indicemotorista-1).getNome());

        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
