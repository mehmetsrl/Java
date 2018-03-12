import java.io.*;
import java.util.*;
public class Reader
{
    
    public static ArrayList<ACUnit> getACUnit(String path)
    {
        ACUnit ACUlist;
        
        ArrayList<ACUnit> list=new ArrayList<ACUnit>();
        
        File inputFile=new File(path);
        Scanner inFile;
        try{
            inFile=new Scanner(inputFile);
            
            while(inFile.hasNext())
            {
                if(inFile.next().equalsIgnoreCase("ACUnit"))
                {
                    
                    String name=inFile.next();
                    int watt=inFile.nextInt();
                    double eer=inFile.nextDouble();
                    
                    ACUlist=new ACUnit(name,watt,eer);
                    list.add(ACUlist);
                }
            }
            inFile.close();
        }
        
        catch(InputMismatchException misEx)
        {
            System.out.println("There is a mismatch, check source document.");
        }
        catch(FileNotFoundException fileEx)
        {
            System.out.println("File does not exist.");
        }
        finally
        {
            return list;
        }
    }
    
    public static ArrayList<Appliance> getAppliances(String path)
    {
        Server serverList;
        StorageUnit storageList;
        
        ArrayList<Appliance> list=new ArrayList<Appliance>();
        File inputFile=new File(path);
        Scanner inFile;
        try{
            inFile=new Scanner(inputFile);
            while(inFile.hasNext())
            {
               
                if(inFile.next().equalsIgnoreCase("Server"))
                {
                    
                    String name=inFile.next();
                    int watt=inFile.nextInt();
                    int cpu=inFile.nextInt();
                    double load=inFile.nextDouble();
                    
                    serverList=new Server(name,watt,cpu,load);
                    list.add(serverList);
                }
                
                if(inFile.next().equalsIgnoreCase("StorageUnit"))
                {
                    String name=inFile.next();
                    int watt=inFile.nextInt();
                    int size=inFile.nextInt();
                    
                    storageList=new StorageUnit(name,watt,size);
                    list.add(storageList);
                }
            }
            inFile.close();
        }
        
        catch(InputMismatchException misEx)
        {
            System.out.println("There is a mismatch, check source document.");
        }
        catch(FileNotFoundException fileEx)
        {
            System.out.println("File does not exist.");
        }
        finally
        {
            return list;
        }
    }
    
}
