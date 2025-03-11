package com.example;

public class Main {
    public static void main(String[] args) {
     
        Cuentabancaria cuenta1 = new Cuentabancaria();
        cuenta1.setTitular("Francisco");
        cuenta1.depositar(100.0);

       Cuentabancaria cuenta2 = new Cuentabancaria("12345", 500.0, "MariaLopez");
       cuenta2.depositar(200.0);
       


       System.out.println("Cuenta1: " + cuenta1.getNumeroCuenta() + ", " + cuenta1.getTitular() + ",  Saldo: " + cuenta1.getSaldo() );

       System.out.println("Cuenta1: " + cuenta2.getNumeroCuenta() + ", " + cuenta2.getTitular() + ",  Saldo: " + cuenta2.getSaldo() );
    }
}