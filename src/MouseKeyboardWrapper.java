import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class MouseKeyboardWrapper
{


        public static Robot bot;

    static {
        try {
            bot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void moveleftClick(int x,int y)
    {
        bot.mouseMove(x,y);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
    public static void convertStringToTyped(String input,int delay)
    {
        int length = input.length();

        for(int i=0;i<length;i++)
        {
            bot.delay(delay);
            char current =input.charAt(i);
            bot.keyPress(KeyEvent.getExtendedKeyCodeForChar(current));
            bot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(current));
        }
        bot.delay(0);



    }

}
