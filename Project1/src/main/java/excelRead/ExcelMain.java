package excelRead;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelMain {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        // Read String data
        String name = ExcelCode.readStringData(2, 0);
        System.out.println("Name: " + name);

        // Read Integer data
        String value = ExcelCode.readIntegerData(2, 1);
        System.out.println("Value: " + value);
    }
}
