public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        plane.loadBackGround("curious.george.jpg");
        plane.showBackGround();

        for (int y = 80; y < 830; y = y + 1) {
            for (int x = 90; x < 700; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (250 > red && red > 190 && 255 > green && green > 150 && 120 > blue && blue > 30) {
                    plane.setPixelColor(red / 150, green / 5, blue);

                }

            }
        }
                }


            }


