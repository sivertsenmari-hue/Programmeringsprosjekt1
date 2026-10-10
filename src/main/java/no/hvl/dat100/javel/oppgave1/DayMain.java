package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();


        DailyPower.printPowerUsage(powerusage_day);

        System.out.println();

        DailyPower.printPowerPrices(powerprices_day);

        System.out.println();

        System.out.println(DailyPower.computePowerUsage(powerusage_day));


        System.out.print(DailyPower.computeSpotPrice(powerusage_day, powerprices_day));




    }
}
