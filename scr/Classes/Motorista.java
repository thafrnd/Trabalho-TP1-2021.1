package Classes;

import java.util.ArrayList;

public class Motorista extends Pessoa{
    //atributos
    private String CNH;

    private ArrayList<Chamado> chamados;

    //métodos
    public Motorista(int id, String nome, String telefone, String CNH) {
        setId(id);
        setNome(nome);
        setTelefone(telefone);
        this.CNH = CNH;
        this.chamados = new ArrayList();
    }


    public int getId() {
        return super.getId();
    }

    public String getNome() {
        return super.getNome();
    }

    public String getTelefone() {
        return super.getTelefone();
    }

    public String getCNH() {
        return CNH;
    }

    public void setCNH(String CNH) {
        this.CNH = CNH;
    }
}
