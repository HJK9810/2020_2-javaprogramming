package dankook.hijk;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StockMarketMgt2 {
    private int count;
    private ArrayList<String> companyNames;
    private ArrayList<Integer> companyCodes;
    public StockMarketMgt2() {
        count = 0;
        companyNames = new ArrayList<>();
        companyCodes = new ArrayList<>();
    }
    public boolean getDataFromFile(String fileName) {
        try (FileReader fReader = new FileReader(fileName);
             Scanner sc = new Scanner(fReader)){
            while (sc.hasNextLine()) { //학생별 성적 정보 읽기.
                String[] line = sc.nextLine().split(",");
                companyNames.add(line[0]);
                companyCodes.add(Integer.parseInt(line[1]));
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
//    public void displayConsoleRecords() {
//        for (int i = 0; i < count; i++) {
//            System.out.printf("-20s", companyNames.get(i));
//            System.out.printf("-5d \n", companyCodes.get(i));
//        }
//    }

    public int search(String cName) {
        for (int i = 0 ; i < count; i++) {
            if (cName.equals(companyNames.get(i)))
                return companyCodes.get(i);
        }
        return -1;
    }
    public int search2(String cName) {
        int temp = companyNames.indexOf(cName);
        if (temp == -1)
            return -1;
        return companyCodes.get(temp);
    }
}
