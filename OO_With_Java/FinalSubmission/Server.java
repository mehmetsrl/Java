public class Server extends Appliance
{
    protected int cpuTDP;
    protected int constantW;
    
    Server(String name,int constantwatt,int cpu,double load)
    {
        super(name,(int)(constantwatt+(cpu*load)),0.01);
        constantW=constantwatt;
        cpuTDP=cpu;
    }
    
    public String getStats()
    {
        return ("Name: "+name+"\n"+"Watt(Constant): "+fullWattage+"\n"+"Efficiency: "+efficiency+"\n"+"Watt(CPU): "+cpuTDP);
    }
    
    public void updateLoad(double load)
    {
        
        fullWattage=(int)(constantW+(cpuTDP*load));
        
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
