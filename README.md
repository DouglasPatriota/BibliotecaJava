# 📚 Sistema de Biblioteca Universitária — Java

Sistema acadêmico de gerenciamento de biblioteca em Java aplicando Programação Orientada a Objetos (Herança, Polimorfismo, Abstração e Encapsulamento).

---

## 🏛️ Aplicando os 4 Pilares da POO

| Pilar da POO | Aplicação no Código |
| :--- | :--- |
| **Abstração** | Classe abstrata `Usuarios` definindo a estrutura base para os usuários do sistema. |
| **Herança** | Classes `Aluno` e `Professor` herdando atributos e métodos de `Usuarios`. |
| **Polimorfismo** | Sobrescrita dos métodos `apresentar()` e `toString()` nas subclasses `Aluno` e `Professor`. |
| **Encapsulamento e Associação** | Atributos privados com getters/setters e relacionamentos entre `Livros`, `Emprestimos` e `Usuarios`. |

---

## 📋 Funcionalidades do Menu Interativo (`Main.java`)
1. **Cadastrar Aluno / Professor**: Registro de novos usuários no sistema.
2. **Cadastrar Livro**: Inclusão de novos exemplares no acervo da biblioteca.
3. **Realizar Empréstimo**: Associação de um livro disponível a um usuário cadastrado.
4. **Realizar Devolução**: Atualização do status do livro e encerramento do empréstimo.
5. **Listar Livros / Empréstimos**: Visualização do acervo e histórico de empréstimos ativos.
6. **Sair**: Encerramento seguro da execução da aplicação.

---

## 📁 Estrutura de Diretórios
```
Sistema_Libre_Academico/
└── src/
    └── projetolibre/
        ├── Usuarios.java
        ├── Aluno.java
        ├── Professor.java
        ├── Livros.java
        ├── Emprestimos.java
        └── Main.java
```

---

## 🚀 Como Executar

### Opção 1: Via Eclipse IDE
1. Abra o Eclipse IDE.
2. Importe o projeto localizado na pasta `Sistema_Libre_Academico`.
3. Execute a classe `Main.java` como uma aplicação Java (Run as -> Java Application).

### Opção 2: Via Terminal (javac / java)
```bash
cd Sistema_Libre_Academico/src
javac projetolibre/*.java
java projetolibre.Main
```

---

## 🔮 Próximos Passos Planejados
- Persistência de dados com **MySQL**.
- Construção de uma **API REST** utilizando **Spring Boot**.
