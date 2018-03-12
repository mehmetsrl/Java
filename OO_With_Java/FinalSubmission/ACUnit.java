public class ACUnit implements Unit
{
    protected int fullWattage;
    protected String name;
    protected double eer;
    protected double powerUsage;
    protected double heat;
    
    ACUnit(String name,int fullWattage,double eer)
    {
        this.name=name;
        this.fullWattage=fullWattage;
        this.eer=eer;
    }
    ACUnit(int fullWattage,double eer)
    {
        this.fullWattage=fullWattage;
        this.eer=eer;
    }
    public double getExchangedHeat(int watt)
    {
        return watt*eer;
    }
    public double getWattageNeeded(double heat)
    {
        return heat/eer;
    }
    
    public String getStats()
    {
        
        return ("Name: "+name+"\n"+"Watt: "+fullWattage+"\n"+"EER: "+eer);
    }
    
    public void setPowerUsage(double percentage)
    {
        eer*=percentage;
        powerUsage=percentage;
    }
    
    public double getTotalHeatTransfer()
    {
        return -getExchangedHeat(fullWattage);
    }
}
