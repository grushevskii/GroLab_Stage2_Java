package JavaIO;

import java.io.*;
import java.util.*;

public class ReadInfoWriteFile {

    public static final String PUBLIC = "public";
    public static final String PRIVATE = "private";

    public static void main(String[] args) {
        String directory="./src/main/resources/";
        File dir =new File(directory+"work");
        if(dir.mkdir())
            System.out.println("Folder has been created");
        File file = new File(directory+"work/file.txt");
        try {
            if(file.createNewFile())
                System.out.println("File has been created");

            writeRandomNumber(file.getAbsolutePath());
            sortAscendingNumber(file.getAbsolutePath());
            replacePublicToPrivateAndLowerToUpperCaseAndReverseLine(directory);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void writeRandomNumber(String file) {
        List<Integer> list = new ArrayList<Integer>();
        final Random random = new Random();
        for (int i = 0; i < 10; ++i)
            list.add(random.nextInt(100)-50);
        printNumberToFile(file,list);
    }

    public static void sortAscendingNumber(String file) throws IOException{
        List<Integer> list = new ArrayList<>();
        Scanner src = new Scanner(new File(file));
            while (src.hasNextInt()){
                list.add(src.nextInt());
            }

        Collections.sort(list);
       printNumberToFile(file,list);
    }

    public static void printNumberToFile(String file,List<Integer> list) {
        try (final FileWriter writer = new FileWriter(file, false))
        {
            for (int i = 0; i < list.size(); ++i)
            {
                final String s = Integer.toString(list.get(i));
                writer.write(s);
                writer.write(System.lineSeparator());
            }
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void replacePublicToPrivateAndLowerToUpperCaseAndReverseLine(String directory) throws IOException {
        File file = new File(directory+"work/JavaProgram.txt");
        File resultFile = new File(directory+"work/ProgramReplacePublicToPrivate.txt");
        File resFile = new File(directory+"work/ProgramReplaceLowerToUpperCase.txt");
        File fileReverse = new File(directory+"work/ProgramReverseLine.txt");

        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(resultFile));
                 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(resFile));
                 BufferedWriter buffered = new BufferedWriter(new FileWriter(fileReverse));) {
                String line;
                while ((line=reader.readLine())!=null) {
                    writer.append(line.replace(PUBLIC, PRIVATE)).append(System.lineSeparator());
                    bufferedWriter.append(toLowerCase(line)).append(System.lineSeparator());
                    buffered.append(new StringBuffer(line).reverse()).append(System.lineSeparator());
                }
            }
        }
    }

    public static String toLowerCase(String line){
        StringTokenizer tokenizer=new StringTokenizer(line,",:;");
        StringBuffer buffer= new StringBuffer();
        while(tokenizer.hasMoreTokens()){
            String str=tokenizer.nextToken();
            if(str.length()>2){buffer.append(str.toLowerCase()+" ");
            } else{buffer.append(str+" ");}
        }
        return buffer.toString();
    }
        }

