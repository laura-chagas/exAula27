## _-----AULA 27-----_

Os projetos desse repositório foram desenvolvidos para adquirir habilidades relacionadas a programação em Java, onde os conceitos aprendidos até então foram:

<li>Herança;</li>
<li>Override;</li>
<li>Overload;</li>
<li>Método;</li>
<li>Polimorfismo.</li>

## LISTA DE EXERCÍCIOS POO - CLASSES ABSTRATAS

<hr>

## Enunciados

1 - Crie uma hierarquia de classes para uma loja que venda livros, CDs e DVDs.
Sobrescreva o método mostrarDetalhesDoItem para que imprima:

- Para livros: nome, preço e autor;
- Para CDs: nome, preço e número de faixas;
- Para DVDs: nome, preço e duração.

Evite ao máximo repetição de código. Em seguida, crie uma classe Loja com o
método main() que adicione 5 produtos diferentes (a sua escolha) a um vetor e, por
fim, imprima o conteúdo.

Modifique o código do programa anterior, da seguinte forma:
a) Adicione um atributo que represente o código de barras do produto (é um
valor obrigatório e, portanto, deve ser pedido no construtor);
b) Sobrescreva o método equals() retornando true se dois produtos possuem
o mesmo código de barras;
c) Na classe Loja, implemente um simples procedimento de busca que, dado
um produto e um vetor de produtos, indique em que posição do vetor se encontra o
produto especificado ou imprima que o mesmo não foi encontrado;
d) No método Loja.main(), após a impressão do vetor (feita na questão
anterior, escolha um dos 5 produtos e crie duas novas instâncias idênticas a ele:
uma com o mesmo código de barras e outra com o código diferente.

<hr>

2 - Implemente uma classe abstracta de nome Forma onde são declarados dois
métodos abstractos:

- calcularArea(): Float
- calcularPerimetro(): Float

Crie, como subclasse de Forma, uma classe de nome Retangulo cujas instâncias
são caracterizadas pelos atributos lado e altura ambos do tipo Float. Implemente na
classe Retangulo os métodos herdados de Forma e outros que ache necessários.

Crie, como subclasse de Forma, uma classe de nome Círculo cujas instâncias são caracterizadas pelo atributo raio do tipo Float. Implemente na classe Circulo os
métodos herdados de Forma e outros que ache necessários.

Crie, como subclasse de Retangulo, uma classe de nome Quadrado cujas
instâncias são caracterizadas por terem os atributos lado e altura com o mesmo
valor.

Elabore um teste onde é declarado um array, de dimensão 5. Nesse array devem
ser guardadas instâncias de Retangulo, Círculo e Quadrado seguindo uma ordem
aleatória.
Depois implemente um ciclo que percorra o array invocando, relativamente a cada
um dos objetos guardados, os métodos calcularArea e calcularPerimetro
