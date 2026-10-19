package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1 a");
        System.out.println("==============");
        System.out.println();


        DailyPower.printPowerUsage(powerusage_day);


        System.out.println();
        System.out.println();

        System.out.println("==============");
        System.out.println("OPPGAVE 1 b");
        System.out.println("==============");
        System.out.println();


        DailyPower.printPowerPrices(powerprices_day);

        System.out.println();
        System.out.println("==============");
        System.out.println("OPPGAVE 1 c");
        System.out.println("==============");

        System.out.println();

        System.out.printf("Strømforbruk dag: %.2f kWh ", DailyPower.computePowerUsage(powerusage_day));

        System.out.println();

        System.out.println();
        System.out.println("==============");
        System.out.println("OPPGAVE 1 d");
        System.out.println("==============");
        System.out.println();

        System.out.printf("Pris for en time med spotpris: %.2f NOK ", DailyPower.computeSpotPrice(powerusage_day, powerprices_day));

        System.out.println();

        System.out.println();
        System.out.println("==============");
        System.out.println("OPPGAVE 1 e");
        System.out.println("==============");
        System.out.println();

        double bruk = 1;
        double pris = 2;

        double støtte = DailyPower.getSupport(bruk, pris);

        System.out.printf("Størmpris med strømstøtte(time): %.2f NOK ", støtte);

        System.out.println();
        
        System.out.println();
        System.out.println("==============");
        System.out.println("OPPGAVE 1 f");
        System.out.println("==============");
        System.out.println();

        System.out.printf("Strømpris med strømstøtte(dag): %.2f NOK ", DailyPower.computePowerSupport(powerusage_day, powerprices_day));

        System.out.println();

        System.out.println();
        System.out.println("==============");
        System.out.println("OPPGAVE 1 g");
        System.out.println("==============");
        System.out.println();

        System.out.printf("Norgespris: %.2f NOK ", DailyPower.computeNorgesPrice(powerusage_day));

        System.out.println();

        System.out.println();
        System.out.println("==============");
        System.out.println("OPPGAVE 1 h");
        System.out.println("==============");
        System.out.println();

        System.out.printf("Maksbruk: %.2f kWh ", DailyPower.findPeakUsage(powerusage_day));

        System.out.println();

        System.out.println();
        System.out.println("==============");
        System.out.println("OPPGAVE 1 i");
        System.out.println("==============");
        System.out.println();

        System.out.println("Gjennomsnittlig strømforbruk: " + DailyPower.findAvgPower(powerusage_day) + "kWh");
    }
}
