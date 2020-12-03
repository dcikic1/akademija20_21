package ba.codecta.disneychars;

public class MickeyCharacter extends DisneyCharacter {

    public MickeyCharacter()
    {
        imageFilename = "Images\\mickey.jpg";
    }

    public String getName() {
        return "Mickey";
    }


    public String welcomeMessage(){
        return "Hello Welcome to " + this.getName() + "'s world! Happy you choose me to play! Let's start...! ";


    }



}
