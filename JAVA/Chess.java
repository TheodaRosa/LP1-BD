public class Chess {
    private int horInicio;
    private int horFim;

    public Chess(int horInicio, int horFim) {
        this.horInicio = horInicio;
        this.horFim = horFim;
    }

    public int getTempo() {
        if (horFim > horInicio)return horFim - horInicio; else return horInicio - horFim;
    }

    public static void main(String[] args) {
        Chess chess = new Chess(12, 5);
        System.out.println("A duração do jogo de xadrez foi de "+chess.getTempo()+" horas");
    }
}
