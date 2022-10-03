package Classes;

import java.util.ArrayList;

public class Cliente extends Pessoa{
    //atributos
    private String RG;
    private String CPF;

    private ArrayList<Chamado> chamados;

    //métodos
    public Cliente(int id, String nome, String telefone, String RG, String CPF){
        setId(id);
        setNome(nome);
        setTelefone(telefone);
        this.RG = RG;
        this.CPF = CPF;
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

    public String getRG() {
        return RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }
}