import javax.swing.*;

/**
 * Version Lockwood 2024
 */
public class RunMyProgram {
    public static void main(String[] args) {
        World run;

        run = (new GradedPicture());
        run.planeIcon = "plane.png";
        run.pictureFileName="curious.george.jpg";
        run.HEIGHT=800;
        run.WIDTH=1000;
        run.Refresh();

    }
}
