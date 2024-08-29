import java.util.HashMap;
import java.util.Map;

class PassagemAerea {
    private Map<String, Boolean> assentos;

    public PassagemAerea() {
        this.assentos = new HashMap<>();
        // Inicializa todos os assentos como disponíveis (32 fileiras, 6 assentos por fileira)
        for (int i = 1; i <= 32; i++) {
            for (char c = 'A'; c <= 'F'; c++) {
                assentos.put(i + String.valueOf(c), true);
            }
        }
    }

    public double reservarAssento(String classe, String assento) {
        if (!assentos.containsKey(assento) || !assentos.get(assento)) {
            throw new IllegalArgumentException("Assento não disponível ou inexistente.");
        }

        int fileira = Integer.parseInt(assento.substring(0, assento.length() - 1));
        char posicao = assento.charAt(assento.length() - 1);
        double precoBase = 500;

        if (classe.equals("1a Classe") && fileira >= 1 && fileira <= 3) {
            precoBase *= 2.5 * 1.5; // 1a classe
        } else if (classe.equals("Executiva") && fileira >= 4 && fileira <= 8) {
            precoBase *= 2.5; // Classe Executiva
        } else if (classe.equals("Econômica") && fileira >= 9 && fileira <= 32) {
            precoBase *= 1; // Classe Econômica
        } else {
            throw new IllegalArgumentException("Classe ou assento inválido para a classe selecionada.");
        }

        assentos.put(assento, false); // Marca o assento como reservado
        return precoBase;
    }
}