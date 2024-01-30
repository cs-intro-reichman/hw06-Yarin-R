import java.awt.Color;
public class Editor4 {
    // main(string[]) - the entry point of a Java program.
    // args - args contains the supplied command-line
    // arguments as an array of String objects.
    public static void main (String[] args) {
		String source = args[0]; // get a file name as input
		int n = Integer.parseInt(args[1]); // get a number of steps as input
        // declare an image and the grayscaled version of the image
		Color[][] sourceImage = Runigram.read(source);
		Color[][] greyScaled = Runigram.grayScaled(sourceImage);
        // set canvas height and width according to the values of the image declared
		Runigram.setCanvas(sourceImage);
        // morph between the image and the grayscaled version of itself with n steps
		Runigram.morph(sourceImage, greyScaled, n);
	}
}
