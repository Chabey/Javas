import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Lab6var7 {
    public static void main(String[] args) {
        String pathRead = "D:\\read.txt";
        String pathWrite = "D:\\result.txt";

        List<String> list = readFile(pathRead); //читаем все данные из файла в ArrayList
        list = searchWords(list); //ищем слова по заданию по ArrayList`у
        writeFile(pathWrite, list); //записываем получившийся лист в файл

    }

    public static void writeFile(String path, List<String> list) {
        try {
            Files.write(Paths.get(path), list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFile(String path) {
        List<String> list = new ArrayList<>();
        if (path != null) {
            try {
                list = Files.readAllLines(Paths.get(path));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public static List<String> searchWords(List<String> list) {
        List<String> searchList = new ArrayList<>();
        if (list != null && !list.isEmpty()) {
            for (String line : list) {
                if (line.length() > 0) {
                    line = line.replaceAll("\\p{Punct}", " ").trim();
                    String[] words = line.split("\\s+");
                    if (words.length > 1) {
                        for (int i = 0; i < words.length; ++i) {
                            if (words[i].charAt(0) == words[i].charAt(words[i].length() - 1)) {
                                System.out.println(words[i]);
                                searchList.add(words[i]);
                            }
                        }
                    }
                }
            }

        }
        return searchList;
    }
}