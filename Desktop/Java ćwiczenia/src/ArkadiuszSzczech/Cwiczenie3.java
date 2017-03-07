package ArkadiuszSzczech;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int tab[] = new int[10];
        Scanner scanIn = new Scanner(System.in);

        System.out.print("Podaj 10 liczb: ");
        for(int i=0; i<10; i++)
            tab[i] = scanIn.nextInt();

        System.out.print("Twoja tablica: ");
        for (int i=0; i<10; i++)

        System.out.print(tab[i]+", ");
        System.out.println(" ");

        int x;
        System.out.println(" ");
        System.out.println("                            "+"MENU");
        System.out.println(" ");
        System.out.println("Aby wyświetlić elementy tablicy od pierwszego do ostatniego indeksu naciśnij 1");
        System.out.println("Aby wyświetlić elementy tablicy od ostatniego do pierwszego indeksu naciśnij 2");
        System.out.println("Aby wyświetlić elementy tablicy o nieparzystych indeksach naciśnij 3");
        System.out.println("Aby wyświetlić elementy tablicy o parzystych indeksach naciśnij 4");

        x = scanIn.nextInt();
        System.out.println(" ");

        if (x==1) {
            int i=0;
            System.out.print("Wynik: ");
            while(i<10){
                System.out.print(tab[i] + " ,");
                i++;
            }

        }
        else if (x==2) {
            int i = 9;
            System.out.print("Wynik: ");
            while (i >= 0) {
                System.out.print(tab[i] + " ,");
                i--;
            }
        }
        else if(x==3) {
                int i=0;
                System.out.print("Wynik: ");
                while(i<10){
                    System.out.print(tab[i]+" ,");
                    i+=2;
                }
            }
        else if (x==4) {
            int i=1;
            System.out.print("Wynik: ");
            while(i<10) {
                System.out.print(tab[i] + " ,");
                i+=2;
            }
        }
        }


    }

