import java.util.Scanner;

public class App {
    //Alteração feita na BRANCH MAIN
    //Alteração feita na branch ALTERACAO

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nome do professor? ");
        String nome = s.next();
        System.out.print("Quantos anos de experiencia ele tem? ");
        int experiencia = s.nextInt();
        Professor p = new Professor(nome, experiencia);
        System.out.println(p.toString());
        System.out.println("Categoria: " + p.classifica());
        s.close();
    }
}
