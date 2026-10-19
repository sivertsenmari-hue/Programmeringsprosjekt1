package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2 a");
        System.out.println("==============");
        System.out.println();

        MonthlyPower.print_PowerUsage(power_usage_month);

        System.out.println();

        System.out.println("==============");
        System.out.println("OPPGAVE 2 b");
        System.out.println("==============");
        System.out.println();

        MonthlyPower.print_PowerPrices(power_prices_month);

        System.out.println();

        System.out.println("==============");
        System.out.println("OPPGAVE 2 c");
        System.out.println("==============");
        System.out.println();

        System.out.printf("Månedlig forbruk: %.2f kWh ", MonthlyPower.computePowerUsage(power_usage_month));

        System.out.println();

        System.out.println("==============");
        System.out.println("OPPGAVE 2 d");
        System.out.println("==============");
        System.out.println();

        boolean exceeded = MonthlyPower.exceedThreshold(power_usage_month, 1000);
        System.out.println(exceeded);

        System.out.println();

        System.out.println("==============");
        System.out.println("OPPGAVE 2 e");
        System.out.println("==============");
        System.out.println();

        System.out.printf("Pris i måneden: %.2f NOK ", MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month));

        System.out.println();

        System.out.println("==============");
        System.out.println("OPPGAVE 2 f");
        System.out.println("==============");
        System.out.println();

        System.out.printf("Strømstøtte: %.2f NOK", MonthlyPower.computePowerSupport(power_usage_month, power_prices_month));


        System.out.println();

        System.out.println("==============");
        System.out.println("OPPGAVE 2 g");
        System.out.println("==============");
        System.out.println();

        System.out.printf("Norgespris: %.2f NOK", MonthlyPower.computeNorgesPrice(power_usage_month));



    }
}