import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Autor projektu: Ondřej Malůš");
        }
        List<Vec> seznamVeci = new ArrayList<>();                       //vytvoření seznamu
        Vec vec1 = new Vec("Talíř", 0.1, Boolean.FALSE);
        Vec vec2 = new Vec("Bota", 0.3, Boolean.FALSE); //vytvoření objektů s parametrama
        Vec vec3 = new Vec("Rygi", 90, Boolean.TRUE);

        seznamVeci.add(vec1);
        seznamVeci.add(vec2);               //přidání objektů do seznamu
        seznamVeci.add(vec3);

        System.out.println(seznamVeci);

        for (int i = 0; i < 5; i++) {
            Random random = new Random();                       //5x vygeneruj náhodné číslo a pak ho zařaď:
            int nahodneCislo = random.nextInt(101);
            if (nahodneCislo >= 50) {
                System.out.println("Číslo, které bylo vygenerováno je: " + nahodneCislo + " a proto je větší než 50");
            }
            if (nahodneCislo < 50) {
                System.out.println("Číslo, které bylo vygenerováno je: " + nahodneCislo + " a proto je menší než 5O");
            }
        }
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("Soubor.txt")))) {
            writer.println("ahoj");
            writer.println("zdarec");
            for (int i = 0; i < 3; i++) {           //zápis do souboru
                writer.println("bumbum");
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("Soubor.txt")))) {
            while(scanner.hasNextLine()) {
                String data = scanner.nextLine();       //naskenování a následné vypsání souboru
                System.out.println(data);
            }
        }
        catch(FileNotFoundException e) {
            throw new RuntimeException();
        }
    }
}