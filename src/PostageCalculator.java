public class PostageCalculator {
    final double BASECOST = 3.75;
    public static double calculatePostage(String z1 , String z2, double weight, double l , double w , double h){
        double cost = 0;
        int tenthPound =(int)weight/10;
        cost+=tenthPound*0.05;
        z1= z1.substring(0,3);
        z2=z2.substring(0,3);
        double zipCost = Math.abs(Integer.parseInt(z1)-Integer.parseInt(z2))/100.0;
        cost+=zipCost;
        double dimension = l+w+h;
        if(dimension>36){
            cost+= (dimension-36)*0.1;
        }
        if(weight>40){
            cost+= tenthPound-4*0.1;
        }
        return cost;
    }
    public static double calculatePostage(Address a , Address b, double weight, double l , double w , double h){
        double cost = 0;
        int tenthPound =(int)weight/10;
        cost+=tenthPound*0.05;
        String z1 = a.getZipCode();
        String z2 = b.getZipCode();
        z1= z1.substring(0,3);
        z2=z2.substring(0,3);
        double zipCost = Math.abs(Integer.parseInt(z1)-Integer.parseInt(z2))/100.0;
        cost+=zipCost;
        double dimension = l+w+h;
        if(dimension>36){
            cost+= (dimension-36)*0.1;
        }
        if(weight>40){
            cost+= tenthPound-4*0.1;
        }
        return cost;
    }
    public static double calculatePostage(Package p){
        double cost = 0;
        int tenthPound = (int)p.getWeight()/10;
        cost+=tenthPound*0.05;
        String z1 = p.getDestination().getZipCode();
        String z2 = p.getOrigin().getZipCode();
        z1= z1.substring(0,3);
        z2=z2.substring(0,3);
        double zipCost = Math.abs(Integer.parseInt(z1)-Integer.parseInt(z2))/100.0;
        cost+=zipCost;
        double dimension = p.getLength() + p.getHeight() + p.getWidth();
        if(dimension>36){
            cost+= (dimension-36)*0.1;
        }
        if(p.getWeight()>40){
            cost+= tenthPound-4*0.1;
        }
        return cost;
    }

}
