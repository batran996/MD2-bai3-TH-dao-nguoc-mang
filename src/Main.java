import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("đảo ngược phần tử mảng");
        int size;
        int [] array;
        do {
            System.out.println("enter a size:");
            size = scanner.nextInt();
            if (size>20){
                System.out.println("size does not exceed 20");
            }
        }while (size>20);
            array = new int[size];
            int i = 0;
            while (i< array.length){
                System.out.print("enter elemen " + (i+1) + ":");
                array[i] = scanner.nextInt();
                i++;
            }
            System.out.printf("%-20s%s","elements in array:","");
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[j] + "\t");
            }
            System.out.printf("\n%-20s%s","reverse array: ", "");
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[j] + "\t");
            }
        }




    }