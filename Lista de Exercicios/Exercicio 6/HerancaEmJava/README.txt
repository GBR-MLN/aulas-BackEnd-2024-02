Agora são criadas 2 classes (Pessoa e Estudante), a classe pessoa é criado de maneira identica a atividade anterior possuindo
o atributo privado nome, o constructor, métodos getter e setter e o método "dizerOla()", já a classe "Estudante" é criada e se
utiliza o "extends Pessoa" após o "public class Estudante" isso faz comque a classe Estudante herde os atributos dados a classe
Pessoa mesmo que privados, dentro da classe Estudante também é criado o atributo privado matricula, no constructor da classe
Estudante é utilizado o "super" que serve para acessar o constructor da "superclasse" (Pessoa), na classe Estudante também existem
os métodos getter e setter e também o método "mostrarMatricula()", na classe Principal é criado um objeto Estudante, que é atribuido
um nome e um número de matricula, após a definição dos atributos são chamados os métodos "dizerNome()" e "mostrarMatricula()", mesmo
que o método "dizerNome()" não seja criado dentro da classe Estudante, ele pode ser utilizado pois é herdado da classe Pessoa.