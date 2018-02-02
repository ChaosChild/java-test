package fides;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by George on 01 Feb 2018.
 */
public class CSVOperations {
    private static String delimiter = ",";
    private static final String FILE_NAME = "chaoschild.csv";

    private static String determineFilePath(){
        StringBuffer sb = new StringBuffer();
        sb.append(System.getProperty("user.home"));
        sb.append(File.separatorChar);

        sb.append(FILE_NAME);
        return sb.toString();
    }

    public static void createFile(List<Department> departments){
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(determineFilePath());
            bw = new BufferedWriter(fw);
            fw.append("Name,Amount"+System.getProperty("line.separator"));
            for (Department department :
                    departments) {
                fw.append(department.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(bw != null)
                    bw.close();
                if(fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static List<Department> readFile(){
        BufferedReader br = null;
        List<Department> departments = new ArrayList<>();
        try{
            String line = "";
            br = new BufferedReader(new FileReader(determineFilePath()));
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] details = line.split(delimiter);
                String name = details[0];
                Double amount = Double.parseDouble(details[1]);
                Department department = new Department(name,amount);
                departments.add(department);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return departments;
    }
}
