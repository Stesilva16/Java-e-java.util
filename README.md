# Java-e-java.util

Um array é uma estrutura de dados que serve para armazenar elementos, sejam eles valores primitivos ou referências. Eles usam colchetes sintaticamente e têm um tamanho fixo. São objetos zero-based e são inicializados com valores padrão. Ao acessar uma posição inválida, uma exceção ArrayIndexOutOfBoundException é lançada. Arrays possuem um atributo length para determinar seu tamanho e podem ser criados usando chaves {}.<br>

Uma array do tipo Object pode armazenar qualquer tipo de referência. Quando convertemos uma referência genérica para uma referência mais específica, precisamos usar um type cast, que só compila se for possível, mas ainda assim pode falhar durante a execução e resultar em uma ClassCastException. Para passar valores ao executar o programa Java a partir da linha de comando, podemos usar o array String[] no método main. <br>

Aprendemos sobre a classe ArrayList da biblioteca java.util, que é uma classe que encapsula o uso de arrays e oferece métodos de mais alto nível para manipular dados. A ArrayList guarda referências a objetos e tem métodos como size, get e remove para acessar e manipular os dados. O foreach pode ser usado para iterar a ArrayList. Além disso, a ArrayList pode ser parametrizada com generics para definir o tipo de elementos que a lista guarda. <br>

A classe java.util é uma das bibliotecas mais importantes do Java que contém várias classes úteis para a manipulação de dados, como ArrayList, HashMap, Set, entre outros. Alguns dos principais métodos dessas classes incluem:<br>

* ArrayList: add, remove, get, size<br>
* HashMap: put, get, containsKey, containsValue, keySet<br>
* Set: add, remove, contains, size<br>

Em relação às expressões lambda, são um recurso do Java que permite escrever códigos de forma mais concisa e funcional. Alguns dos principais comandos incluem:<br>

* () -> {}<br>
* (parametros) -> expressão<br>
* (parametros) -> {instruções;}<br>

obs: As expressões lambda são usadas com muita frequência quando se trata de programação funcional, especialmente para processar coleções de dados. <br>

A classe java.util.Vector, que é uma implementação da ArrayList que é thread safe. Também aprendemos sobre a interface java.util.Collection, que é a interface de todas as coleções em Java. Entendemos que as listas (como ArrayList e Vector) são sequências que aceitam elementos duplicados, enquanto que os conjuntos (java.util.Set) são coleções que não aceitam elementos duplicados e não são listas. <br>

