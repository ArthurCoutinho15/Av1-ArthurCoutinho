import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc;
        List<String> lista = new LinkedList<>();
        sc = new Scanner(new File("C:\\Users\\12116681\\IdeaProjects\\Av1-Arthur-Coutinho\\Lista_URL.txt"));

        while(sc.hasNextLine()){
            lista.add(sc.nextLine());
        }

        for (Iterator itr = ((LinkedList<String>) lista).descendingIterator(); itr.hasNext();) {
            System.out.print(itr.next() + " \n");
        }
        System.out.println("****************");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com um link para exclusão: ");
        String link = scanner.nextLine();

        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(link)) {
                iterator.remove();
            }
        }
        System.out.println("**********************");
        System.out.println("Size: " + lista.size());
        System.out.println("***********************");


        for (Iterator itr = ((LinkedList<String>) lista).descendingIterator(); itr.hasNext();) {
            System.out.print(itr.next() + " \n");
        }

        System.out.println("*********************");
        System.out.println("Faça sua consulta: ");
        String consulta = scanner.nextLine();

        Iterator<String> it = lista.iterator();
        boolean encontrado = false;
        while (it.hasNext()) {
            if (it.next().equals(consulta)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Link encontrado");
        }
        else{
            System.out.println("Link não encontrado");
        }





    }
}