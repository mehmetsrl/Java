abstract public class Appliance implements Unit
{
    protected int fullWattage;
    protected double efficiency;
    protected String name;
    
    Appliance(String name,int fullWattage,double efficiency)
    {
        this.name=name;
        this.fullWattage=fullWattage;
        this.efficiency=efficiency;
    }
    Appliance(int fullWattage,double efficiency)
    {
        this.fullWattage=fullWattage;
        this.efficiency=efficiency;
    }
    abstract public double getGeneratedHeat();
    
    abstract public String getStats();
    
    abstract public double getTotalHeatTransfer();
    
}
