import java.util.Scanner;
public class ProcessAName5026201006{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Type your name: ");
    String name = sc.nextLine();
    int idx1 = name.indexOf(' ');
    String namaDepan = name.substring(0, idx1);
    String namaBelakang = name.substring(idx1+1, name.length());
    System.out.println (idx1);
    System.out.println ("Your name is: " + namaBelakang + ", " + namaDepan.charAt(0) + ".");
    }
}