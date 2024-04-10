import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        try {
            JOptionPane.showMessageDialog(null, "Bem vindo!!!");
            int modelo = Integer.parseInt(JOptionPane.showInputDialog("Escolha um modelo de violao\n" +
                    "\n1 -> Violão Clássico:" +
                    "\n2 -> Violão Folk" +
                    "\n3 -> Violão Flet" +
                    "\n4 -> Violão Jumbo" +
                    "\n5 -> Violão 7 Cordas" +
                    "\n6 -> Violão 12 Cordas" +
                    "\n7 -> Violõ Zero," +
                    "\n8 -> Violão Duplo Zero" +
                    "\n9 -> Violão Triplo Zero"));
            ViolaoPrototype violao = new ViolaoPrototype();

            Violao violaoEscolhido = (Violao) violao.clonar(modelo);
            JOptionPane.showMessageDialog(null,violaoEscolhido.toString());
            

        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
