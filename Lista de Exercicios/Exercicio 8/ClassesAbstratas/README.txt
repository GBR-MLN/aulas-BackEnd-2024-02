Neste projeto são criadas 3 classes, Animal é uma classe abstrata, ou seja, esta classe oferece um pedaço de código que pode ser
usado por todas as classes que derivam dela (Cachorro e Gato), a classe Animal cria somento um método "fazerSom()" e essa é a sua
única função, a classe Cachorro herda da classe Animal e utiliza a notação "@Override" para sobrescrever o método "fazerSom()",
a classe Gato faz o mesmo que a classe Cachorro, cada classe sobrescreve o método para que uma String seja printada com o som do
seu respectivo animal, na classe principal são criados 2 objetos, um Cachorro e um Gato, e cada e então são chamados os métodos
de cada objeto.