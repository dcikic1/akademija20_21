package ba.codecta.disneychars;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadFileAsString {

    public static String readFileAsString(String fileName) throws IOException {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }
    public static   List<String> readByLines(String fileName) throws IOException {
        List<String> allLines = Files.readAllLines(Paths.get(fileName));
        return allLines;
    }

    public static Map<String, String> readTownDescriptions(String directoryPath, Map<String, String> mapOfFileTownNames) throws Exception {
        Map<String, String> townNameDescriptionMap = new HashMap<>();
        for (Map.Entry<String, String> pair : mapOfFileTownNames.entrySet()) {
            townNameDescriptionMap.put(pair.getKey(), readFileAsString(directoryPath + "\\" + pair.getValue()));
        }
        return townNameDescriptionMap;
    }
}

