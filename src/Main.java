import java.util.Scanner;
public class Main {

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        int slova = 0;
        int brojevi = 0;
        int ostalo = 0;

        System.out.print("unesi niz znakova: ");
        String nizZnakova = scanner.nextLine(); // Read a full line

        for (int i = 0; i < nizZnakova.length(); i++) {
            if (Character.isAlphabetic(nizZnakova.charAt(i))){
                slova++;
            }else if (Character.isDigit(nizZnakova.charAt(i))){
                brojevi++;
            }else{
                ostalo++;
            }
        }
        System.out.println("Slova: "+slova);
        System.out.println("Brojevi: "+brojevi);
        System.out.println("Ostalo: "+ostalo);
    }
}
