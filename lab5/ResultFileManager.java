package KI304FirchukLab5;

import java.io.*;

public class ResultFileManager {


    public void writeText(String fileName, double x, double y) throws IOException { //кинути виняток при помилці
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("x = " + x + "\n");
            writer.write("y = " + y + "\n");
        }
    }

    public void readText(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Змiст текстового файлу:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    public void writeBinary(String fileName, double x, double y) throws IOException {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(fileName))) {
            out.writeDouble(x);
            out.writeDouble(y);
        }
    }

    public void readBinary(String fileName) throws IOException {
        try (DataInputStream in = new DataInputStream(new FileInputStream(fileName))) {
            double x = in.readDouble();
            double y = in.readDouble();
            System.out.println("Зчитано з двiйкового файлу:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}
