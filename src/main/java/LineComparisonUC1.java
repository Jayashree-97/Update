public class LineComparisonUC1 {
    public static void main(String[] args){
        double  x1 = 2;
        double x2 = 4;
        double y1 = 3;
        double y2 = 5;
        double xy = distance(x1, x2, y1, y2);
        System.out.println(xy);
    }
    public static double distance( double x1, double y1, double x2, double y2){
        double x = Math.pow(x2 - x1, 2);
        double y = Math.pow(y2 - y1, 2);
        double dist = Math.sqrt( x+y);

        return dist;
    }
}
