public class A1_HowToMove extends World {

    public void go() {

        System.out.println("N/A");
        plane.pausetime = 0;
        plane.startingAngle(0);
        plane.isTrail = true;
        plane.width = 100;
        plane.trailWidth = (int)(Math.random() *10) +1;
        row();
    }

    public void square(){

        int size = 100;
        plane.turn(180);
        plane.move(size);
        plane.turn(90);
        plane.move(size);
        plane.turn(90);
        plane.move(size);
        plane.turn(90);
        plane.move(size);


    }

    public void house(){
        plane.setColor((int)(Math.random() *256),(int)(Math.random() *256),(int)(Math.random() *256));

        square();

        //making roof
        int roofsize = 77;
        plane.turn(40);
        plane.move(roofsize);
            plane.turn(100);
        plane.move(roofsize);

    };

    public void row(){
            house();
            plane.trailWidth = plane.trailWidth + 1;
            plane.teleport(300,250);
            plane.startingAngle((int)(Math.random() *360));
            house();
            plane.trailWidth = plane.trailWidth + 1;
            plane.teleport(400,250);
            plane.startingAngle((int)(Math.random() *360));
            house();
            plane.trailWidth = plane.trailWidth + 1;
            plane.teleport(500,250);
            plane.startingAngle((int)(Math.random() *360));
            house();
            plane.trailWidth = plane.trailWidth + 1;
            plane.teleport(600,250);
            plane.startingAngle((int)(Math.random() *360));
            house();
            plane.trailWidth = plane.trailWidth + 1;
            plane.teleport(700,250);
            plane.startingAngle((int)(Math.random() *360));
            house();
            plane.trailWidth = plane.trailWidth + 1;
            plane.teleport(800,250);
            plane.startingAngle((int)(Math.random() *360));
            house();


    }

    }


//ints = integers
//