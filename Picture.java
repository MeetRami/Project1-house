/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square leftside;
    private Square rightside;
    private Square start;
    private Circle hole;
    private Person player;
    private Triangle flag;
    private Triangle cap;
    private Triangle stick;
    private Circle ball;
    private Square background;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        background = new Square();
        background.changeSize(1000);
        background.changeColor("white");
        background.makeVisible();
        background.moveHorizontal(-320);
        background.moveVertical(-150);
        
        leftside = new Square();
        leftside.changeSize(180);
        leftside.changeColor("green");
        leftside.makeVisible();
        leftside.moveHorizontal(-200);
        leftside.moveVertical(-50);
        
        rightside = new Square();
        rightside.changeSize(180);
        rightside.changeColor("green");
        rightside.makeVisible();
        rightside.moveHorizontal(-20);
        rightside.moveVertical(-50);
        
        start = new Square();
        start.changeSize(45);
        start.changeColor("white");
        start.makeVisible();
        start.moveHorizontal(-185);
        start.moveVertical(10);

        hole = new Circle();
        hole.changeSize(10);
        hole.changeColor("white");
        hole.makeVisible();
        hole.moveHorizontal(195);
        hole.moveVertical(73);
        
        player = new Person();
        player.changeSize(35, 25);
        player.changeColor("black");
        player.makeVisible();
        player.moveHorizontal(-130);
        player.moveVertical(-50);
        
        flag = new Triangle();
        flag.changeSize(40, 3);
        flag.changeColor("red");
        flag.makeVisible();
        flag.moveHorizontal(230);
        flag.moveVertical(-10);
        
        cap = new Triangle();
        cap.changeSize(6, 25);
        cap.changeColor("red");
        cap.makeVisible();
        cap.moveHorizontal(-60);
        cap.moveVertical(-13);
        
        
        stick = new Triangle();
        stick.changeSize(30, 3);
        stick.changeColor("yellow");
        stick.makeVisible();
        stick.moveHorizontal(-73);
        stick.moveVertical(0);
        
        ball = new Circle();
        ball.changeSize(5);
        ball.changeColor("black");
        ball.makeVisible();
        ball.moveHorizontal(-90);
        ball.moveVertical(75);
        ball.slowMoveHorizontal(287);
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (leftside != null)   // only if it's painted already...
        {
            background.changeColor("black");
            leftside.changeColor("white");
            rightside.changeColor("white");
            start.changeColor("black");
            hole.changeColor("black");
            flag.changeColor("black");
            player.changeColor("white");
            cap.changeColor("white");
            stick.changeColor("white");
            ball.changeColor("white");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (leftside != null)   // only if it's painted already...
        {
            background.changeColor("white");
            leftside.changeColor("green");
            rightside.changeColor("green");
            start.changeColor("white");
            hole.changeColor("white");
            flag.changeColor("red");
            player.changeColor("black");
            cap.changeColor("red");
            stick.changeColor("yellow");
            ball.changeColor("black");
        }
    }
}
