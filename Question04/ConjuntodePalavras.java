package Question04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConjuntodePalavras {
    private Set<String> conjunto;

    public void ConjuntoDePalavras(String palavras) {
        conjunto = new HashSet<>(Arrays.asList(palavras.split(",")));
    }

    public boolean contemTodas(String palavras) {
        String[] palavrasArray = palavras.split(",");
        for (String palavra : palavrasArray) {
            if (!conjunto.contains(palavra.trim())) {
                return false;
            }
        }
        return true;
    }
}
