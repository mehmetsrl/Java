import java.util.ArrayList;

public class HW3
{
    public static void main(String[] args) {
        try {
            ArrayList<Unit> la = new ArrayList<>();
            la.addAll(Reader.getAppliances("txt.txt"));
            la.addAll(Reader.getACUnit("txt.txt"));
            Double heat = 0.0;
            for (Unit u: la) {
                heat += u.getTotalHeatTransfer();
            }
            System.out.format("Total heat difference in the server room after unit time:%.3f%n", heat);
            System.out.println("Changing AC unit levels...");
            for (Unit u: la){
                if (u instanceof ACUnit)
                {
                    ACUnit n = (ACUnit) u;
                    n.setPowerUsage(0.85);
                }
            }
            for (Unit u: la) {
                heat += u.getTotalHeatTransfer();
            }
            System.out.format("Total heat difference in the server room after unit time:%.3f%n", heat);
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
}