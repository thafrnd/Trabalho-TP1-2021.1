package Classes;

    import java.util.ArrayList;

    public class Chamado  {
        //atributos
        private int id;
        private String data;
        private String tipo;
        private String origem;
        private String destino;
        private float partida;
        private float retorno;
        private double kmInicial;
        private double kmFinal;
        private double valorTotal;
        public Cliente cliente;
        public Motorista motorista;


        //métodos
        public Chamado(int id, String data, String tipo, String origem, String destino, float partida, float retorno, double kmInicial,
                       double kmFinal, double valorTotal) {

            this.id = id;
            this.data = data;
            this.tipo = tipo;
            this.origem = origem;
            this.destino = destino;
            this.partida = partida;
            this.retorno = retorno;
            this.kmInicial = kmInicial;
            this.kmFinal = kmFinal;
            this.valorTotal = valorTotal;

        }

        public int getId() {
            return id;
        }

        public String getData() {
            return data;
        }

        public String getTipo() {
            return tipo;
        }

        public String getOrigem() {
            return origem;
        }

        public String getDestino() {
            return destino;
        }

        public float getPartida() {
            return partida;
        }

        public float getRetorno() {
            return retorno;
        }

        public double getKmInicial() {
            return kmInicial;
        }

        public double getKmFinal() {
            return kmFinal;
        }

        public double getValorTotal() {
            return valorTotal;
        }

        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }

        public void setMotorista(Motorista motorista) {
            this.motorista = motorista;
        }

    }

