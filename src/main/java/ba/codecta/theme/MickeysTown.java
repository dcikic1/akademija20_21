package ba.codecta.theme;

import ba.codecta.disneychars.*;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.Scanner;


public class MickeysTown implements DisneyLand {
    static Logger logger = Logger.getLogger(MickeysTown.class);
    private MickeyCharacter mickeyCharacter;
    private PlutoCharacter plutoCharacter;

    @Override
    public String getName() {
        return "Mickey's town ";
    }

    @Override
    public String getDescription() {
        logger.info("Started reading file...");
        try {
            String description = ReadFileAsString.readFileAsString("src\\main\\resources\\town-descriptions\\mickey.txt");
            logger.info("File read successfully");
            return description;
        } catch (IOException e) {
            logger.error("Problem occured while reading file!:" + e.getMessage());
            return "Wrong path of file!";
        }
    }

    @Override
    public void proceedVisitor() {
        mickeyCharacter = new MickeyCharacter();
        plutoCharacter = new PlutoCharacter();
        Browser browser= new Browser();
        boolean introState = true;
        do {
            weclomeMessage();
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            int selection = scanner.nextInt();


            switch (selection) {
                case 1:
                    presentMickeyTownCharcher(mickeyCharacter);

                    break;
                case 2:
                    presentMickeyTownCharcher(plutoCharacter);

                    break;
                default:
                    System.out.println("There is no more characters to see.");
                    introState = false;
                    break;
            }

        }
        while (introState);

    }

    @Override
    public void welcomeMessage() {
        System.out.println("To get introduced with Mickey press 1." +
                "\nTo get introduced with Pluto press 2");
    }

    public static void presentMickeyTownCharcher(DisneyCharacter character) {

        System.out.printf("My name is: %s\nAnd my greeting is: \n%s\nAnd my picture is: %s\n\n", character.getName(), character.welcomeMessage(), character.picture());



    }

    public void weclomeMessage() {
        System.out.println("To get introduced with Mickey press 1." +
                "\nTo get introduced with Pluto press 2\nTo exit press any other number.");
    }


}
