

public class FrogSimulation {
    private int goalDistance; //declare ints
    private int maxHops;

    public FrogSimulation(int dist, int numHops) { // utilize a constructor
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance() {
        int e = (int) (Math.random() * 40) - 10;  // range is -10 to 30
        //System.out.println(e);
        return e;
    }

    public boolean simulate() {
        int sum = 0; //start with an index of 0

        for (int i = 1; i <= maxHops; i++) { // go until max hops are reached and add whatever math.rand prints
            int hopDistance = hopDistance();
            sum += hopDistance; // add the values up
        }
        //System.out.println(sum);
        if (sum >= goalDistance) return true; //return true if total higher than a value goaldistance
        else return false; //otherwise return false


    }

    public double runSimulations(int num) {
        int attempt=0; // set up a counter as an int
      for (int i=1; i<=num;i++) { //add 1 until num is reached
          if (simulate()==true)// if true add 1
              attempt++;
          else return attempt; //otherwise dont add
      }
         return (attempt/num);//return total

    }


    public static void main(String[] args) {
        FrogSimulation instance = new FrogSimulation(24, 5);//make new instance to be able to call a method
        int sim = instance.hopDistance();// call methods
        boolean s = instance.simulate();
       // System.out.println(s);
        double times= instance.runSimulations(400);
        System.out.println(times);
    }



}


