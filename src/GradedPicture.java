public class GradedPicture extends World {
    public void go() {

        plane.pausetime = 0;
        plane.isTrail = true;


        for (int y = 0; y < 700; y = y + 50) {
            for (int x = 0; x < 800; x = x + 50) {
                plane.trailWidth = 250;
                plane.teleport(x * 5, y);
                plane.setColor(0, 50, 100);

                System.out.println("x: " + x);
                plane.square(100);

            }
        }


        for (int y = 0; y < 25; y = y + 1) {
            plane.trailWidth = 10;
            plane.teleport(plane.random(1, 1000), plane.random(1, 800));
            star(plane.random(5, 50));
        }


        for (int y = 0; y <7; y = y + 1){
            moon(plane.random(1,50));
        }





    }

    public void star(int a) {
        if(a<20){
            plane.setColor(255,205,0);
        }
        if(a>25){
            plane.setColor(255,255,255);
        }
        for (int y = 0; y < 6; y = y + 1) {
            plane.move(a);
            plane.turn(135);
            plane.move(a);
            plane.turn(-75);



        }
    }


    public void moon(int a) {
        plane.trailWidth = plane.random(1,15);
        plane.teleport(plane.random(1,1000), plane.random(1,800));
        plane.setColor(255, 167, 11);
        plane.fillCircle(a);

    }
}
