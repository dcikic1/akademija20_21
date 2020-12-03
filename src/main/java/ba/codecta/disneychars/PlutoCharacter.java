package ba.codecta.disneychars;

public class PlutoCharacter extends DisneyCharacter {

    public PlutoCharacter (){

        imageFilename = "Images\\pluto.png";
    }

    @Override
    public String getName() {
        return "Pluto";
    }

    @Override
    public String welcomeMessage() {
        return "Hello I'm Mickey's pet";

    }


}
