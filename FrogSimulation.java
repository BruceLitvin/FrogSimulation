public class FrogSimulation {
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance() {
        int e = (int) (Math.random() * -20) + 10;
        System.out.println(e);
        return e;
    }

         public boolean simulate () {
        int sum=0;
        System.out.println(simulate());
        for(int i=1; i<= maxHops ;i++ ){
            int f=0;
            int g=0;
            sum=hopDistance();

        }
        if (sum>=goalDistance) return true;
        else return false;



        }
            // run hop distance maxHops times and then add numbers
    //if the end position is greater than goalDistance return true
    //If Frog reaches negative position return false
    // if frog doesn't reach goalDistance return false
        /*
        public double runSimulations( int num){
            return 0;
        }

                */
    public static void main(String[]args){
        FrogSimulation instance= new FrogSimulation(24,5);
        int sim=instance.hopDistance();
        boolean s= instance.simulate();

    }



}


