package ba.codecta.theme;

import ba.codecta.disneychars.DisneyCharacter;

import java.util.List;

public class FantasyLand implements DisneyLand {
    private List<DisneyCharacter> characters;

    public void setCharacters(List<DisneyCharacter> characters) {
        this.characters = characters;
    }

    public String getName() {
        return "Fantasy Land! ";
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public void proceedVisitor() {

    }

    @Override
    public void welcomeMessage() {

    }


}
