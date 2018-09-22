package SpriteAnimation;

import javafx.animation.Transition;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import javafx.util.Duration;


public class SpriteAnimation extends Transition {
    private ImageView imageView;
    private int numberOfFrames;
    private int numberOfColumns;
    private double offsetX;
    private double offsetY;
    private double width;
    private double height;


   public SpriteAnimation(ImageView imageView, Duration duration, int numberOfFrames, int numberOfColumns, double offsetX, double offsetY,  double width, double height){
       this.imageView = imageView;
       this.numberOfFrames = numberOfFrames;
       this.numberOfColumns = numberOfColumns;
       this.offsetX = offsetX;
       this.offsetY = offsetY;
       this.width = width;
       this.height = height;
       setCycleDuration(duration);
   }

    @Override
    protected void interpolate(double frac) {
       int indexOfColumn = (int)Math.min(Math.floor(frac * numberOfColumns), numberOfColumns - 1);
       double x = (indexOfColumn % numberOfColumns) * width + offsetX;
       double y = (indexOfColumn / numberOfFrames) * width + offsetY;
       imageView.setViewport(new Rectangle2D(x, y, width, height));
    }

    public ImageView getImageView() {
        return imageView;
    }
}