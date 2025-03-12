public class Carro {

    private double kmLitro;
    private String cor;
    private String nome;
    private int kmRodado;

    public Carro(double kmLitro, String cor, String nome, int kmRodado){
        this.kmLitro = kmLitro;
        this.cor = cor;
        this.nome = nome;
        this.kmRodado = kmRodado;
    }

    public int getkmLitro(){
        return kmLitro;
    }

    public setkmLitro(double kmLitro){
        this.kmLitro = kmLitro;
    }
}