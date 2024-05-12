import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        DirectorSanduiche director = new DirectorSanduiche();
        SanduicheBuilder builder;
        SanduichePersonalizadoBuilder personalizadoBuilder;

        String tipoSanduiche = JOptionPane.showInputDialog("Escolha seu tipo de sanduiche:\n\n" +
                "1 : Vegetariano\n" +
                "2 : Mexicano\n" +
                "3 : Italiano\n" +
                "4 : Personalizado");

        switch (tipoSanduiche) {
            case "1":
                builder = new VegetarianoBuilder();
                director.construirSanduiche(builder);
                Sanduiche sanduicheVegetariano = builder.getSanduiche();
                System.out.println(sanduicheVegetariano);
                break;
            case "2":
                builder = new MexicanoBuilder();
                director.construirSanduiche(builder);
                Sanduiche sanduicheMexicano = builder.getSanduiche();
                System.out.println(sanduicheMexicano);
                break;
            case "3":
                builder = new ItalianoBuilder();
                director.construirSanduiche(builder);
                Sanduiche sanduicheItaliano = builder.getSanduiche();
                System.out.println(sanduicheItaliano);
                break;
            case "4":
                String pao = JOptionPane.showInputDialog("Escolha o tipo de pão");
                personalizadoBuilder = new PersonalizadoBuilder();
                personalizadoBuilder.abrirPao(pao);

                String carnesStr = JOptionPane.showInputDialog("Escolha as carnes separando por ponto e virgula");

                if (!carnesStr.equals("")) {
                    String[] carnesArr = carnesStr.split(",");
                    ArrayList<String> carnes = new ArrayList<>(Arrays.asList(carnesArr));
                    personalizadoBuilder.adicionarCarnes(carnes);

                }
                String queijosStr = JOptionPane.showInputDialog("Escolha os queijos separando por ponto e virgula");

                if (!queijosStr.equals("")) {
                    String[] queijosArr = queijosStr.split(",");
                    ArrayList<String> queijos = new ArrayList<>(Arrays.asList(queijosArr));
                    personalizadoBuilder.adicionarCarnes(queijos);
                }

                String vegetaisStr = JOptionPane.showInputDialog("Escolha os vegetais separando por ponto e virgula");

                if (!vegetaisStr.equals("")) {
                    String[] vegetaisArr = vegetaisStr.split(",");
                    ArrayList<String> vegetais = new ArrayList<>(Arrays.asList(vegetaisArr));
                    personalizadoBuilder.adicionarCarnes(vegetais);

                }

                String condimentosStr = JOptionPane
                        .showInputDialog("Escolha os condimentos separando por ponto e virgula");
                if (!condimentosStr.equals("")) {
                    String[] condimentosArr = condimentosStr.split(",");
                    ArrayList<String> condimentos = new ArrayList<>(Arrays.asList(condimentosArr));
                    personalizadoBuilder.adicionarCarnes(condimentos);

                }

                Sanduiche sanduichePersonalizado = personalizadoBuilder.getSanduiche();
                System.out.println(sanduichePersonalizado);
            default:
        }

    }
}
