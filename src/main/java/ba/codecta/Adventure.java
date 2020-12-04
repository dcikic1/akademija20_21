package ba.codecta;

import ba.codecta.NetflixContent.Movies;
import ba.codecta.theme.AdventureLand;
import ba.codecta.theme.DisneyLand;
import ba.codecta.theme.FantasyLand;
import ba.codecta.theme.MickeysTown;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Adventure {

    static Logger logger = Logger.getLogger(Adventure.class);

    public static void main(String[] args) {

     PropertyConfigurator.configure("src\\main\\resources\\log\\log4j.properties");

    /* System.out.println("args:");
        for (String arg : args) {
            System.out.println(arg);

        }
       if (args[0].equals("disneyland")) {

            presentDinseyLands();
            logger.info("App started");
        }
        else presentNetflix();*/
       // presentDinseyLands();
       presentNetflix();


    }
    public static void presentNetflix(){
        Movies movies= new Movies();
        movies.proceedUser();
    }


    public static void presentDinseyLands() {
        welcomeMessage();
        boolean introState = true;
        List<DisneyLand> themeParks = new ArrayList<>();
        themeParks.add(new MickeysTown());
        themeParks.add(new AdventureLand());
        themeParks.add(new FantasyLand());
        do {


            for (int i = 0; i < themeParks.size(); i++) {
                System.out.println(i + 1 + " " + themeParks.get(i).getName() + "(press " + (i + 1) + ")");
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            int selection = scanner.nextInt();
            logger.info("User entered: " + selection);

            switch (selection) {
                case 1:
                    System.out.println(themeParks.get(selection - 1).getDescription());
                    themeParks.get(selection - 1).proceedVisitor();
                    break;
                case 2:
                    System.out.println(themeParks.get(selection - 1).getDescription());
                    break;
                case 3:
                default:
                    System.out.println("Not yet implemented!");
                    System.out.println("You have finished this journey! Visit us again!");
                    introState = false;
                    break;
            }
        }
        while (introState);
    }


    public static void welcomeMessage() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, visitor. Please enter your name: ");
        String visitorName = scanner.next();
        System.out.printf("Welcome, %s, Which land would you like to visit?\n", visitorName);


    }


}
