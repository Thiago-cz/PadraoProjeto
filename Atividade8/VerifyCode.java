import java.util.Random;

import javax.swing.JOptionPane;

public class VerifyCode {
    
    static private String generateCode(){
        String chars = "abcdefghijklmopqrstuvwxyz0123456789!@#$%*";
        String strVerify = "";
        Random random = new Random();
        
        for (int i = 0; i < 5; i++) {
            strVerify = strVerify + chars.charAt(random.nextInt(0,32)) ;
        }
        
        return strVerify;
    }
    
    static String verifyCode(){
        String code = generateCode();
        String inputUser = JOptionPane.showInputDialog("Digite o seguinte codigo: \n"+code);

        if(inputUser.toLowerCase().equals(code)){
            JOptionPane.showMessageDialog(null, "Beleza, codigo verificado!!!");
            return code;
        }
        JOptionPane.showMessageDialog(null, "CODIGO INVALIDO.\nVAZA ROBOZÃO");
        return null;
    }
    
}
