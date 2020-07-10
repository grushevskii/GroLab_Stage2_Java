package JavaIO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class PrintTreeDirectory {
    static  List<String> list=new ArrayList<>();
    public static void main(String[] args) {
        File baseDirectory = new File(args[0]);
        File baseFile = new File(args[0] + args[1]);
        readFiles(baseDirectory, baseFile);
        getWordCount(baseFile);
    }

    public static void readFiles(File baseDirectory, File baseFile) {

            if (baseDirectory.isDirectory()) {
                int i = 0;
                for (File file : baseDirectory.listFiles()) {
                    if (file.isFile()) {
                        i++;
                        list.add("|    " + i + " - " + file.getName()); }
                    else {
                        list.add("|--- " + file.getName());
                        readFiles(file, baseFile);
                    }
                }
            }
        try (final FileWriter writer = new FileWriter(baseFile, false))
        {
            for (int i = 0; i < list.size(); ++i)
            {
                writer.write(list.get(i));
                writer.write(System.lineSeparator());
            }
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void getWordCount(File filename) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(
                    new FileInputStream(filename)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int size=0;
        int dir=0;
        int file=0;
        String line = null;
        while (true) {
            try {
                if (!((line = br.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            int start=line.lastIndexOf("-");
            int end=line.indexOf(".");
            if(start!=-1 && end!=-1)
            size+=line.substring(start,end).length();
            StringTokenizer st = new StringTokenizer(line);
            while (st.hasMoreTokens()) {
                switch (st.nextToken()){
                    case "|---":  dir++;break;
                    case "|": file++; break;
                }
            }
        }
        System.out.println("Количество папок : " + dir);
        System.out.println("Количество файлов: " + file);
        System.out.println("Среднее количество файлов в папке : " + file/dir);
        System.out.println("Среднее длина названия файла : " + size/file);
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

