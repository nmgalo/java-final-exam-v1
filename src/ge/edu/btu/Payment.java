package ge.edu.btu;

import org.apache.log4j.Logger;

public class Payment {

    final static Logger logger = Logger.getLogger(Payment.class);

    public static void main(String[] args) {

        Water water = new Water("WT-128712", 2.20);
        pay(water);

        Electricity electricity = new Electricity("IT-1289", 9.50);
        pay(electricity);

    }

    public static <T> void pay(T t) {
        logger.info("კომუნალური გადახდილია: " + t.toString());
    }

}
