package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5 b, c");
        System.out.println("==============");
        System.out.println();

        //Lager en kunde
        Customer ethan = new Customer(
                "Ethan Hunt",
                "etan@example.com",
                1005,
                PowerAgreementType.SPOTPRICE
        );

        Invoice f1 = new Invoice(ethan, "January",
                CustomerPowerUsageData.usage_month_customer1,
                MonthPowerData.powerprices_month);


        System.out.println();
        System.out.println("==============");
        System.out.println("OPPGAVE 5 d");
        System.out.println("==============");
        System.out.println();

        Customer charlie = new Customer(
                "Charlie Rose",
                "charlie@example.com",
                1003, PowerAgreementType.POWERSUPPORT
        );

        Customer diana = new Customer(
                "Diana Prince", "diana@example.com",
                1004, PowerAgreementType.NORGESPRICE
        );

        Invoice f2 = new Invoice(charlie, "January", CustomerPowerUsageData.usage_month_customer2, MonthPowerData.powerprices_month);
        Invoice f3 = new Invoice(diana, "January", CustomerPowerUsageData.usage_month_customer3, MonthPowerData.powerprices_month);

        Invoice[] fakturaer = {f1, f2, f3};

        Invoices.processInvoices(fakturaer);

    }
}
