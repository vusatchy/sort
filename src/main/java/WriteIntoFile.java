import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteIntoFile {

    private static String arrayListFile = "array.txt";
    private static String linkedListFile = "linked.txt";
    private static SortingService sortingService = new SortingService();
    private static String split = ",";

    public static void write(BufferedWriter writer, List<Long> x, List<Long> y) throws IOException {
        for (int i = 0; i < x.size(); i++) {
            String record = x.get(i) + split + y.get(i);
            System.out.println(record);
            writer.write(record);
            writer.newLine();
        }
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter arrayWriter = new BufferedWriter(new FileWriter(new File(arrayListFile)));
        BufferedWriter linkedWriter = new BufferedWriter(new FileWriter(new File(linkedListFile )));
        sortingService.process();
        write(arrayWriter, sortingService.getX(), sortingService.getArrayListY());
        write(linkedWriter, sortingService.getX(), sortingService.getLinkedListY());
    }
}
