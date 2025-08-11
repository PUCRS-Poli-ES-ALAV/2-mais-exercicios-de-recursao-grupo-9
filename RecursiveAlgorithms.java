import java.util.ArrayList;

public class RecursiveAlgorithms {

    /*
    Modelagem do algoritmo recursivo para cálculo de fatorial:
    */
    public int fatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O número deve ser não negativo.");
        }
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    /*
    Modelagem do algoritmo recursivo para cálculo do somatório de um número n até 0:
    */
    public int somatorio(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O número deve ser não negativo.");
        }
        if (n == 0) {
            return 0;
        } else {
            return n + somatorio(n - 1);
        }
    }

    /*
    Modelagem do algoritmo recursivo para cálculo do n-ésimo número da sequência de Fibonacci:
    */
    public int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O número deve ser não negativo.");
        }
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /*
    Modelagem do algoritmo recursivo para cálculo do somatório dos números inteiros entre os números k e j:
    */
    public int somatorioKJ(int k, int j) {
        if (k > j) {
            return 0; // Ou lançar uma exceção, dependendo do requisito
        }
        if (k == j) {
            return k;
        } else {
            return k + somatorioKJ(k + 1, j);
        }
    }

    /*
    Modelagem do algoritmo recursivo para verificar se uma String é um palíndromo:
    */
    public boolean isPal(String s) {
        if (s == null) {
            return false;
        }
        if (s.length() <= 1) {
            return true;
        } else {
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                return isPal(s.substring(1, s.length() - 1));
            } else {
                return false;
            }
        }
    }

    /*
    Modelagem do algoritmo recursivo para converter um inteiro zero ou positivo para String com o número em binário:
    */
    public String convBase2(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O número deve ser não negativo.");
        }
        if (n == 0) {
            return "0";
        } else {
            String binary = "";
            if (n / 2 > 0) {
                binary = convBase2(n / 2);
            }
            return binary + (n % 2);
        }
    }

    /*
    Modelagem do algoritmo recursivo para calcular o somatório dos números contidos em um ArrayList de inteiros:
    */
    public int somatorioArrayList(ArrayList<Integer> list, int index) {
        if (list == null || index < 0) {
            throw new IllegalArgumentException("A lista não pode ser nula e o índice deve ser não negativo.");
        }
        if (index == list.size()) {
            return 0;
        } else {
            return list.get(index) + somatorioArrayList(list, index + 1);
        }
    }

    public int somatorioArrayList(ArrayList<Integer> list) {
        return somatorioArrayList(list, 0);
    }

    /*
    Modelagem do algoritmo recursivo para encontrar o maior elemento de um ArrayList:
    */
    public int findBiggest(ArrayList<Integer> ar, int index) {
        if (ar == null || ar.isEmpty()) {
            throw new IllegalArgumentException("O ArrayList não pode ser nulo ou vazio.");
        }
        if (index == ar.size() - 1) {
            return ar.get(index);
        } else {
            return Math.max(ar.get(index), findBiggest(ar, index + 1));
        }
    }

    public int findBiggest(ArrayList<Integer> ar) {
        return findBiggest(ar, 0);
    }

    /*
    Modelagem do algoritmo recursivo para determinar se um string ocorre dentro de outro:
    */
    public boolean findSubStr(String str, String match) {
        if (match == null || str == null) {
            return false;
        }
        if (match.isEmpty()) {
            return true;
        }
        if (str.length() < match.length()) {
            return false;
        }

        if (str.substring(0, match.length()).equals(match)) {
            return true;
        } else {
            return findSubStr(str.substring(1), match);
        }
    }

    /*
    Modelagem do algoritmo recursivo para determinar o número de dígitos de um inteiro:
*/
    public int nroDigit(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O número deve ser não negativo.");
        }
        if (n < 10) {
            return 1;
        } else {
            return 1 + nroDigit(n / 10);
        }
    }

    /*
    Modelagem do algoritmo recursivo para gerar todas as permutações de uma String:
    */
    public ArrayList<String> permutations(String s) {
        ArrayList<String> result = new ArrayList<>();
        if (s == null) {
            return result;
        } else if (s.length() == 0) {
            result.add("");
            return result;
        }

        char firstChar = s.charAt(0);
        String restOfString = s.substring(1);
        ArrayList<String> words = permutations(restOfString);

        for (String word : words) {
            for (int i = 0; i <= word.length(); i++) {
                String newWord = word.substring(0, i) + firstChar + word.substring(i);
                result.add(newWord);
            }
        }
        return result;
    }
}

