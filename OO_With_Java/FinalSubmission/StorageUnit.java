public class StorageUnit extends Appliance
{
    protected int size;
    
    
    public StorageUnit(String name,int watt,int size)
    {
        super(name,watt,0.5);
        this.size=size;
    }
    
    public String getStats()
    {
        return ("Name: "+name+"\n"+"Watt: "+fullWattage+"\n"+"Efficiency: "+efficiency+"\n"+"Size: "+size);
    }
    
    public double getGeneratedHeat()
    {
        
        return fullWattage*(1-efficiency)*3.41;
    }
    
    public double getTotalHeatTransfer()
    {
        return fullWattage*(1-efficiency)*3.41;
    }    
    
    
}
