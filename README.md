# Atividade Prática: Generics em Java (Ada Tech)

Este repositório contém a resolução da segunda atividade proposta pela *Ada Tech, com foco total no recurso de **Generics* da linguagem Java. O projeto explora, através de 5 cases práticos, como os Generics aumentam a segurança de tipos (type safety) e a reutilização de código.

## 🎯 Objetivo

O objetivo desta atividade é aplicar os conceitos de Generics na criação de classes, interfaces e métodos flexíveis e reutilizáveis, capazes de operar com diferentes tipos de dados de forma segura, evitando a necessidade de casts e detectando erros em tempo de compilação.

## 📦 Cases de Estudo

A atividade é composta por 5 desafios que abordam diferentes aspectos e funcionalidades dos Generics.

### 1. Classe Caixa Genérica
- *Desafio:* Criar uma classe genérica Caixa<T> capaz de guardar um objeto de qualquer tipo e recuperá-lo posteriormente. O programa principal demonstra seu uso armazenando e imprimindo uma String e um Integer em instâncias separadas da caixa.
- *Conceito-chave:* Criação de uma classe genérica básica com um único parâmetro de tipo (<T>).

### 2. Classe Par Genérico
- *Desafio:* Implementar uma classe genérica Par<K, V> para armazenar um par de chave e valor de tipos distintos. A classe deve incluir construtor, getters e setters para seus atributos. Os testes criam um par de <String, Integer> e outro de <Integer, String> para demonstrar a flexibilidade.
- *Conceito-chave:* Classe genérica com múltiplos parâmetros de tipo (<K, V>).

### 3. Método Genérico para Troca
- *Desafio:* Desenvolver um método genérico estático trocar que recebe um array de qualquer tipo (T[]) e dois índices, trocando os elementos de lugar nessas posições. A funcionalidade é testada com arrays de Integer e de String.
- *Conceito-chave:* Criação e uso de Métodos Genéricos, que possuem seus próprios parâmetros de tipo.

### 4. Método Genérico com Comparação
- *Desafio:* Criar um método genérico maior que aceita dois elementos e retorna o maior entre eles. Para garantir que os objetos possam ser comparados, o método utiliza um limite superior (bounded type), restringindo o tipo T para qualquer classe que implemente a interface Comparable<T>. O método é testado com Integer e String, que naturalmente implementam Comparable.
- *Conceito-chave:* Bounded Type Parameters (<T extends Comparable<T>>).

### 5. Interface Genérica e Implementações
- *Desafio:* Definir uma interface genérica Repositorio<T> com um método salvar(T obj). Em seguida, criar duas implementações concretas: RepositorioDeAlunos para salvar nomes (String) e RepositorioDeProdutos para salvar objetos de uma classe Produto customizada. O programa final utiliza ambos os repositórios para salvar seus respectivos tipos de dados.
- *Conceito-chave:* Definição e implementação de Interfaces Genéricas.

## 🛠️ Tecnologias Utilizadas
* *Linguagem:* Java
* *JDK:* 21
* *IDE:* IntelliJ IDEA

## 🚀 Como Executar o Projeto
1.  Clone o repositório: git clone https://github.com/IgorAgiani/atividade-ada-2.git
2.  Navegue até o diretório do projeto.
3.  Compile os arquivos Java (.java) usando o compilador javac ou sua IDE de preferência.
4.  Execute a classe principal que contém o método main para ver os resultados de cada case.
