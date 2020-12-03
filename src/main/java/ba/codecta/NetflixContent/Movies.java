package ba.codecta.NetflixContent;

import ba.codecta.disneychars.ReadFileAsString;
import ba.codecta.theme.Netflix;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Movies implements Netflix {
    @Override
    public String getGenres() {
        try {
            return  ReadFileAsString.readFileAsString("src\\main\\resources\\netflix-content\\genres.txt");
        } catch (IOException e) {
            return  "Wrong path of file!";
        }
    }

    @Override
    public List<String> getDescription(String genre) {
        List<String>descriptions = new ArrayList<>();
        try {
            descriptions=  ReadFileAsString.readByLines("src\\main\\resources\\netflix-content\\"+genre+"descriptions.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return descriptions;
    }

    @Override
    public List<String> getAllByGenre(String genre) {

        genre.toLowerCase();
        List<String>genres = new ArrayList<>();
        try {
            genres= ReadFileAsString.readByLines("src\\main\\resources\\netflix-content\\" +genre+".txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return genres;
    }

    @Override
    public void proceedUser() {
        Scanner scanner = new Scanner(System.in);
        List<String>movies = new ArrayList<>();
        List<String>descriptions= new ArrayList<>();
        System.out.println("Welcome! Enter your name:");

        String user = scanner.next();
        System.out.printf("Hello, %s, To see genres we offer press 1\n", user);
        int enter =scanner.nextInt();
        if(enter ==1) System.out.println(getGenres());
        else System.out.println("Wrong enter");


        do {
            System.out.println("Enter name of genre to see movies. To exit press e");
            String genre = scanner.next();
            if(genre.equals("e")) break;
            movies=getAllByGenre(genre);
            for (int i=0;i<movies.size();i++) System.out.println((i+1)+"." +movies.get(i));
            System.out.println("For description of movie enter number of movie");
            descriptions=getDescription(genre);
            enter=scanner.nextInt();
            System.out.println(descriptions.get(enter-1));




        }
        while (true);




    }
}
