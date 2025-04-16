package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Usuario {
    DateTimeFormatter brFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private String name;
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


    public Usuario(String name, String email, String password, LocalDate birth,
                   String neighborhood, String road, Integer number,
                   String city, String state, String country, String telephone) {

        this.name = name;
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

    public Usuario(String name, String email, String password, LocalDate birth, String telephone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.birth = birth;
        this.telephone = telephone;
    }

    public Usuario() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
