# 📚 Sistema Acadêmico - Biblioteca Universitária

## 📖 Sobre o Projeto

Este projeto foi desenvolvido com o objetivo de praticar os conceitos da **Programação Orientada a Objetos (POO)** utilizando a linguagem **Java**.

O sistema simula o funcionamento de uma biblioteca acadêmica, permitindo o gerenciamento de usuários, livros, empréstimos e devoluções através de uma estrutura organizada e orientada a objetos.

---

## 🎯 Objetivo

Desenvolver uma aplicação capaz de:

* Cadastrar usuários da biblioteca;
* Diferenciar alunos e professores;
* Gerenciar o acervo de livros;
* Realizar empréstimos;
* Registrar devoluções;
* Consultar informações dos usuários e dos livros.

---

## 🏛️ Conceitos de POO Aplicados

### Encapsulamento

Os atributos das classes são privados e acessados através de métodos getters e setters.

### Herança

As classes específicas herdam características de uma classe mais genérica.

Exemplo:

```java
public class Aluno extends Usuarios
```

### Polimorfismo

Métodos podem ser sobrescritos pelas classes filhas.

Exemplo:

```java
@Override
public String apresentar()
```

### Abstração

As classes representam entidades reais do sistema, como usuários, alunos, professores e livros.

---

## 📂 Estrutura do Projeto

```text
projetolibre/
│
├── Usuarios.java
├── Aluno.java
├── Professor.java
├── Livro.java
├── Biblioteca.java
├── Emprestimo.java
└── Main.java
```

---

## 👨‍🎓 Exemplo de Usuário

```java
Aluno aluno = new Aluno(
    "João Silva",
    "2025001",
    "123.456.789-00",
    "joao@email.com"
);
```

---

## 📚 Funcionalidades

### Usuários

* Cadastro de alunos
* Cadastro de professores
* Consulta de usuários

### Livros

* Cadastro de livros
* Consulta do acervo
* Verificação de disponibilidade

### Empréstimos

* Realizar empréstimo
* Registrar devolução
* Consultar situação dos livros

---

## 🛠️ Tecnologias Utilizadas

* Java
* Eclipse IDE
* Programação Orientada a Objetos
* Collections (ArrayList / HashMap)

---

## ▶️ Como Executar

1. Clone o projeto:

```bash
git clone https://github.com/seuusuario/sistema-academico.git
```

2. Importe no Eclipse ou IntelliJ IDEA.

3. Execute a classe:

```java
Main.java
```

---

## 📌 Exemplo de Saída

```text
===== SISTEMA DA BIBLIOTECA =====

1 - Cadastrar Usuário
2 - Cadastrar Livro
3 - Realizar Empréstimo
4 - Realizar Devolução
5 - Consultar Acervo
0 - Sair
```

---

## 👨‍💻 Autor

Projeto desenvolvido para fins acadêmicos com foco no aprendizado dos pilares da Programação Orientada a Objetos (POO) em Java.

Disciplina: Programação Orientada a Objetos

Instituição: Faculdade / Universidade

Ano: 2026
