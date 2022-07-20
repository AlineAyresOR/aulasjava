/**
 * Classe é um manual de como construir o objeto, é a receita do bolo e por boa prática seus atributos tem que ser privados.
 */

public class pessoa {
    /*
    Atributos da classe
     */
    private String nome;
    private Integer idade;

    /*
 Gettes e Setters
     */
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }


    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getIdade() {
        return idade;
    }

    public static class aula {

        public static void main(String[] args) {
            System.out.println("Aprendendo POO com java!!");

            /**
             * TIPOS DE DADOS PRIMITIVOS : Os dados que podemos inserir sem importar nenhuma biblioteca.
             */

            /*
            Byte tipoByte = 127; // Ele recebe o mínimo -128 e o máximo 127
            Short tipoShort = Short.MIN_VALUE; // Mínimo: -32768 / Máximo: 32767
            Integer tipoInteger = Integer.MIN_VALUE; // valores grandes
            Long tipoLong = Long.MIN_VALUE; // valores gigantescos todo número long colocar um L no final.
            Float tipoFloat = Float.MIN_NORMAL; // Número Flutuante colocar F no final para indicar.
            Double tipoDouble = Double.MIN_NORMAL; // Conseguimos trabalhar com casa decimal
            String tipoString = "Recebe textos";
            Boolean tipoBoolean = true; // ou false é do tipo lógico.
             */


            //Estou instanciando uma classe, criando o objeto sem isso ele ainda não existe.//


            pessoa pessoa1 = new pessoa();
            pessoa1.setNome("Aline");
            pessoa1.setIdade(21);

            System.out.println(pessoa1.getNome());
            System.out.println(pessoa1.getIdade());

            pessoa pessoa2 = new pessoa();
            pessoa2.setNome("Fernanda");
            pessoa2.setIdade(42);

            System.out.println(pessoa2.getNome());
            System.out.println(pessoa2.getIdade());


        }




    }
}

/*
E com os Getters e Setters quem está mudando a propriedade é a classe.
 */

/**
 * METODOS ACESSORES:
 * PUBLIC: Indica que qualquer um pode acessar o elemento.
 * PRIVATE: Indica que somente a classe pode acessar o elemento.
 * PROTECTED: Indica que somente a classe e seus filhos podem acessar o elemento.
 * DEFAULT: Indica que somente a classe, seus filhos e a classe no mesmo package pode acessar o elemento.
 **/

/**
 * Getters
 * Setters
 * São metódos que a classe disponibiliza para quem quizer acessar do lado de fora para modificar ou obter informações dos atributos.
 */

/**
 * void: quando o metódo não retorna nada.
 */
