package ba.codecta.theme;

import java.util.List;

public interface Netflix {

    public String getGenres ();
    public List<String> getDescription(String genre);
    public List<String> getAllByGenre(String genre);
    public void proceedUser();
}
