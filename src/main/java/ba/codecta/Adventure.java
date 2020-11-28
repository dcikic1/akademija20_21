package ba.codecta;

import ba.codecta.thema.AdventureLand;
import ba.codecta.thema.DisneyLand;
import ba.codecta.thema.FantasyLand;
import ba.codecta.thema.MickeysTown;

import java.util.ArrayList;
import java.util.List;

public class Adventure {
    public static void main(String []args){

    }
    private static void displayLands() {
        List<DisneyLand> themaParks= new ArrayList<DisneyLand>();
        themaParks.add(new MickeysTown());
        themaParks.add(new AdventureLand());
        themaParks.add(new FantasyLand());

        for(DisneyLand land: themaParks){
            System.out.println(land.getName());
        }
    }
}
