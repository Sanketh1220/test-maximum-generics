public class MaximumNumber {
    public String getMaxString (String x, String y, String z){
        if (x.compareTo(y) > 0) {
            if (x.compareTo(z) > 0) {
                return x;
            }
        }
        if (y.compareTo(z) > 0) {
            return y;
        }
        return z;
    }
}
