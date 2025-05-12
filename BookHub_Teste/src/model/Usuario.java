package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario {
    DateTimeFormatter brFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private String name;
    private String cpf;
    private String email;
    private String password;
    private LocalDate birth;
    private String road;
    private String neighborhood;
    private Integer number;
    private String city;
    private String state;
    private String country;
    private String telephone;
    private List<Usuario> listUser = new ArrayList<>();


    //Construtor do usuário
    public Usuario(String name, String cpf, String email, String password, LocalDate birth,
                   String neighborhood, String road, Integer number,
                   String city, String state, String country, String telephone) {

        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
        this.birth = birth;
        this.neighborhood = neighborhood;
        this.road = road;
        this.number = number;
        this.city = city;
        this.state = state;
        this.country = country;
        this.telephone = telephone;
    }

    //Construtor do usuário
    public Usuario(String name, String cpf,  String email, String password, LocalDate birth, String telephone) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
        this.birth = birth;
        this.telephone = telephone;
    }

    //Método para adição de usuário
    public void addUser(Usuario usuario){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full name: ");
        String name = sc.nextLine();
        System.out.print("Enter to cpf: ");
        String cpf = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        System.out.print("Enter data of birth: ");
        String dataString = sc.nextLine();
        LocalDate birth = LocalDate.parse(dataString, brFormatter); //Saída no formato BR (dd/mm/aaaa)

        System.out.print("Enter telephone number: ");
        String telephone = sc.nextLine();

        System.out.println("\n-------------- User added succesfully! ---------------");
    }


    //Login de usuário com cadastro vigente
    public void userLogin(){
        Scanner sc = new Scanner(System.in);
        int tentativas = 0;
        int limite = 3;

        while (tentativas < limite){
            System.out.print("Enter email: ");
            String inputEmail = sc.nextLine();

            System.out.print("Enter password: ");
            String inputPassword = sc.nextLine();

            if (inputEmail.equals(this.email) && inputPassword.equals(this.password)){
                System.out.println("Login succesful!");
                return;
            }else {
                tentativas++;
                System.out.println("Incorrect email or password. Attempts left: " + (limite - tentativas));
            }
        }
        System.out.println("Too many failed attempts. Access denied!");
    }

    public Usuario() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


    public String userInformations(){
        return "Name: " + getName() +
                "\nemail: " + getEmail() +
                "\ndate of birth: " + getBirth().format(brFormatter) +
                "\nnumber of telephone: " + getTelephone();
    }
}
