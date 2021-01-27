package ge.edu.btu;

import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;

public class Payment {

    final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        Water water = new Water("WT-128712", 3.20);
        pay(water);

        Electricity electricity = new Electricity("IT-1289", 12.50);
        pay(electricity);

    }

    public static <T> void pay(T t) {
        logger.info("კომუნალური გადახდილია: " + t.toString());
    }

}
