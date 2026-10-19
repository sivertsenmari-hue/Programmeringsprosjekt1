package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {


        System.out.println("==============");
        System.out.println("OPPGAVE 4 a");
        System.out.println("==============");
        System.out.println();

        Customers kunder = new Customers(3);

        System.out.println();
        System.out.println("==============");
        System.out.println("OPPGAVE 4 b");
        System.out.println("==============");
        System.out.println();

        System.out.println(kunder.countNonNull());

        Customer alice = new Customer(
                "Alice Smith", "alice@example.com",
                1001, PowerAgreementType.SPOTPRICE);

        Customer bob = new Customer(
                "Bob Johnson", "bob@example.com",
                1002, PowerAgreementType.NORGESPRICE);

        Customer charlie = new Customer(
                "Charlie Rose", "charlie@example.com",
                1003, PowerAgreementType.POWERSUPPORT);


        System.out.println();
        System.out.println("==============");
        System.out.println("OPPGAVE 4 c");
        System.out.println("==============");
        System.out.println();

        System.out.println("Henter kunde 1002:");
        System.out.println(kunder.getCustomer(1002));
        //Tester en kunde som ikke finnes
        System.out.println(kunder.getCustomer(9999));


        System.out.println();
        System.out.println("==============");
        System.out.println("OPPGAVE 4 d");
        System.out.println("==============");
        System.out.println();

        System.out.println("Legger til Alice: " + kunder.addCustomer(alice));
        System.out.println("Legger til Bob: " + kunder.addCustomer(bob));
        System.out.println("Legger til Charlie: " + kunder.addCustomer(charlie));



        System.out.println();
        System.out.println("==============");
        System.out.println("OPPGAVE 4 e");
        System.out.println("==============");
        System.out.println();

        System.out.println("Fjerner kunde 1002:");
        System.out.println(kunder.removeCustomer(1002));

        System.out.println("Antall etter sletting: " + kunder.countNonNull());


        System.out.println();
        System.out.println("==============");
        System.out.println("OPPGAVE 4 f");
        System.out.println("==============");
        System.out.println();

        Customer[] tabell = kunder.getCustomers();

        System.out.println("Kundene som er igjen:");

        for (int i = 0; i < tabell.length; i++){
            System.out.println(tabell[i]);
        }


    }
}
