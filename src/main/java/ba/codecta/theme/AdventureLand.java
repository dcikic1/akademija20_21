package ba.codecta.theme;

import ba.codecta.disneychars.DisneyCharacter;
import ba.codecta.disneychars.ReadFileAsString;

import java.io.IOException;
import java.util.List;

public class AdventureLand implements DisneyLand {

    @Override
    public String getName() {
        return "Adventure land ";
    }

    @Override
    public String getDescription() {
        try {
            return  ReadFileAsString.readFileAsString("src\\main\\resources\\town-descriptions\\adventureland.txt");
        } catch (IOException e) {
            return  "Wrong path of file!";
        }
    }

    @Override
    public void proceedVisitor() {

    }

    @Override
    public void welcomeMessage() {

    }


}
