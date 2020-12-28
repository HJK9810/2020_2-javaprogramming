package dankook.hijk;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class StockMarketMgt {
    private HashMap<String, Integer> companys;
    private int count;
    public StockMarketMgt() {
        count = 0;
        companys = new HashMap<>();
    }

    public boolean getDataFromFile(String fileName) {
        try (FileReader fReader = new FileReader(fileName);
             Scanner sc = new Scanner(fReader)){
            while (sc.hasNextLine()) {
                String[] line = sc.nextLine().split(",");
                companys.put(line[0], Integer.parseInt(line[1]));
                count++;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return false;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    public Integer search(String cName) { return companys.get(cName);}
}
