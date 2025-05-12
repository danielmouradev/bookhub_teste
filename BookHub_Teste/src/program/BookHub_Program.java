package program;

import model.Usuario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BookHub_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter brFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Welcome to BOOK HUB");

        System.out.println("1 - LOGIN");
        System.out.println("2 - NEW USER");
        System.out.println("3 - SEARCH BOOK");
        System.out.println("4 - BORROW BOOKS");
        System.out.println("5 - EXIT");

        boolean cont = true;

        while (cont) {
            System.out.print("\nEnter to option: ");
            int option = sc.nextInt();
            sc.nextLine();

            Usuario usuario = new Usuario();

            switch (option) {
                case 1:
                    usuario.userLogin();
                    break;

                case 2:
                    usuario.addUser(usuario);
                    break;


                case 5:
                    cont = false;
                    break;
            }

        }
    }
}
