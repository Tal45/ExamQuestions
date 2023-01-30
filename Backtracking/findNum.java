public class Range
{
    private int _center, _radius;
    public Range (int c, int r)
    {
        _center = c;
        _radius = r;
    }

    public int getCenter() {
        return _center;
    }

    public int getRadius() {
        return _radius;
    }
    public static int findNum(Range rangeA[], int num) {
        int low = 0;
        int high = rangeA.length - 1;
        int mid = 0;
        int center = 0, radius = 0;
        while (low <= high) {
            mid = (high + low) / 2;
            center = rangeA[mid].getCenter();
            radius = rangeA[mid].getRadius();
            if (num >= center-radius && num <= center+radius)
                return mid;
            if (num > center+radius)
                low = mid+1;
            if (num < center-radius)
                high = mid-1;
        }
        return -1;
    }
    public static void main (String [] args) {
        Range r1 = new Range(4, 1);
        Range r2 = new Range(12,0);
        Range r3 = new Range(20,1);
        Range r4 = new Range(102,2);
        Range[] rng = {r1,r2,r3,r4};
        System.out.println("For num = 5: "+findNum(rng, 5));
        System.out.println("For num = 101: "+findNum(rng, 101));
        System.out.println("For num = 15: "+findNum(rng, 15));
        System.out.println("For num = 105: "+findNum(rng, 105));
    }
}
