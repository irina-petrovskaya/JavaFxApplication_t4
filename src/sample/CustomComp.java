package sample;

import javafx.scene.text.Text;

/**
 * Created with IntelliJ IDEA.
 * User: Irina.Petrovskaya
 * Date: 2/4/13
 * Time: 3:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomComp extends Text
{
    public CustomComp(String s) {
    }
    public static CustomComp valueOf(String s){
        return new CustomComp(s);
    }
}
