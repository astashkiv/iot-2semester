import java.io.*;
import java.util.List;

public class GoodsWriter {
    public void writeToFile(final List<Good> getGoodsList) throws IOException {

        File file = new File("goods.csv");
        if (!file.exists()) {
            file.createNewFile();
        }

        try (OutputStream stream = new FileOutputStream(file);
             PrintWriter writer = new PrintWriter(stream)) {
            writer.println(getGoodsList.get(0).getHeaders());
            for (Good goodlist : getGoodsList) {

                writer.println(goodlist.toCSV());

            }
        } catch (IOException e) {
            throw e;
        }
    }
}


