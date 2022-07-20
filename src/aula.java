/**
 * Toda classe deve iniciar com letra maiuscula, o que eu não fiz nessa aula como da para perceber HAHA  =)
 *
 * Formas de se escrever em JAVA:
 *
 * PascalCase: Toda primeira letra da palavra tem que ser maíscula.Utilizado em classes, contrutores e arquivos Ex. MeuCachorro 2 Palavras / Cachorro 1 palavra.
 * camelCase: È utilizado para criar objetos, dar nome a atributos, escrever métodos, criar variáveis e getter e setter Ex. minhaCasa.
 *
 * outras:
 *
 * kibab-case: meu-cachorro
 * snake_case: meu_cachorro
 *
 */

public class aula {


    public static void main(String[] args) {
        System.out.println("Aprendendo POO com java!!");

        //Construtor sem parâmetros//

        pessoa pessoa1 = new pessoa();
        pessoa1.setNome("Aline");
        pessoa1.setIdade(21);

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());

        //Construtor sem parâmetros//

        pessoa pessoa2 = new pessoa();
        pessoa2.setNome("Fernanda");
        pessoa2.setIdade(42);

        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getIdade());

        //Construtor sem parâmetros//

        car myCar = new car();
        myCar.setMarca("Volkswagem");
        myCar.setModelo("Onix");
        myCar.setCor("Prata");
        myCar.setAno(2022);

        System.out.println(myCar.getModelo());
        System.out.println(myCar.getMarca());
        System.out.println(myCar.getCor());
        System.out.println(myCar.getAno());

        //Construtor passando parâmetros//

        car myCar2 = new car("Fiat","Uno",2011,"Azul");

        System.out.println(myCar2.getModelo());
        System.out.println(myCar2.getMarca());
        System.out.println(myCar2.getCor());
        System.out.println(myCar2.getAno());


    }


}