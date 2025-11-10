

public class FrogSimulation {
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance() {
        int e = (int) (Math.random() * 40) - 10;  // range is -20 to 20
        //System.out.println(e);
        return e;
    }

    public boolean simulate() {
        int sum = 0;

        for (int i = 1; i <= maxHops; i++) {
            int hopDistance = hopDistance();
            sum += hopDistance;
        }
        //System.out.println(sum);
        if (sum >= goalDistance) return true;
        else return false;


    }
    // run hop distance maxHops times and then add numbers
    //if the end position is greater than goalDistance return true
    //If Frog reaches negative position return false
    // if frog doesn't reach goalDistance return false

    public double runSimulations(int num) {
        double attempt=0;
      for (int i=0; i==num;i++) {
          if (simulate()==true)
              attempt++;
          else return attempt;
      }
         return (attempt/num);

    }


    public static void main(String[] args) {
        FrogSimulation instance = new FrogSimulation(24, 5);
        int sim = instance.hopDistance();
        boolean s = instance.simulate();
       // System.out.println(s);
        double times= instance.runSimulations(400);
        System.out.println(times);
    }



}


