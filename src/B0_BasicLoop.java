public class B0_BasicLoop extends World {

    public void go() {

        plane.pausetime = 0;
        plane.isTrail = true;
        plane.trailWidth = 30;


        for(int y = 0; y<700; y=y+1){
            for (int x=0; x<800; x=x+1) {
                plane.teleport(x * 2, y);
                plane.setColor(150,y/5,x/5);

                System.out.println("x: " + x);
                plane.square(1);
            }



        }



    }

    public void rowOfSquares(int y){

}
}