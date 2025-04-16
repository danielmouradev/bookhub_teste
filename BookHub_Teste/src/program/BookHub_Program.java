package program;

import model.Usuario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BookHub_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter brFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter full name: ");
        String name = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        System.out.print("Enter data of birth: ");
        String dataString = sc.nextLine();
        LocalDate birth = LocalDate.parse(dataString, brFormatter);


        System.out.print("Enter telephone number: ");
        String telephone = sc.nextLine();

        System.out.println("\n=========== User informations ===========\n");
      Usuario usuario = new Usuario(name, email, password, birth, telephone);

        System.out.println(usuario.userInformations());


    }
}
