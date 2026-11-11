# ♟️ Chess Java - Jogo de Xadrez em Console

## 📌 Sobre o Projeto

Este projeto foi desenvolvido como parte do meu portfólio acadêmico durante a graduação em Análise e Desenvolvimento de Sistemas.

O objetivo foi construir um jogo de xadrez executado no console, aplicando conceitos de **Programação Orientada a Objetos** e modelando as principais regras de uma partida real.

Durante o desenvolvimento, foram praticados:

- Organização de um projeto Java em pacotes
- Herança e polimorfismo
- Encapsulamento
- Abstração de peças e tabuleiro
- Validação de movimentos
- Controle de turnos
- Tratamento de exceções
- Modelagem de regras de xadrez

---

## 🚀 Tecnologias Utilizadas

- Java 21
- Eclipse IDE
- Java Collections
- ANSI Escape Codes para cores no console

---

## 🎯 Funcionalidades

- Tabuleiro de xadrez 8x8
- Dois jogadores no mesmo terminal
- Movimentação por coordenadas, como `e2` e `e4`
- Exibição das jogadas possíveis da peça selecionada
- Peças implementadas:
  - Rei
  - Rainha
  - Torre
  - Bispo
  - Cavalo
  - Peão
- Captura de peças
- Lista de peças capturadas separada por cor
- Controle de turno e jogador atual
- Validação para impedir:
  - Jogadas fora do tabuleiro
  - Movimentação de uma peça adversária
  - Movimentos inválidos
  - Jogadas que deixam o próprio rei em xeque
- Identificação de xeque
- Identificação de xeque-mate
- Movimentos especiais **hook**
- Contagem de movimentos das peças
- Interface colorida no terminal

---

## ♜ Regras e Movimentos Implementados

Cada peça possui sua própria implementação de movimentos possíveis:

- **Rei:** movimenta-se uma casa em qualquer direção.
- **Rainha:** movimenta-se em linhas, colunas e diagonais.
- **Torre:** movimenta-se em linhas e colunas.
- **Bispo:** movimenta-se nas diagonais.
- **Cavalo:** movimenta-se em formato de “L” e pode saltar sobre outras peças.
- **Peão:** movimenta-se para frente, captura na diagonal, pode avançar duas casas em seu primeiro movimento e possui suporte a en passant.

---

## 🏗️ Estrutura do Projeto

```text
.
├── src
│   ├── application
│   │   ├── Program.java
│   │   └── UI.java
│   ├── boardgame
│   │   ├── Board.java
│   │   ├── BoardException.java
│   │   ├── Piece.java
│   │   └── Position.java
│   └── chess
│       ├── ChessException.java
│       ├── ChessMatch.java
│       ├── ChessPiece.java
│       ├── ChessPosition.java
│       ├── Color.java
│       └── pieces
│           ├── Bishop.java
│           ├── King.java
│           ├── Knight.java
│           ├── Pawn.java
│           ├── Queen.java
│           └── Rook.java
├── .classpath
├── .project
└── README.md
```

### Organização dos pacotes

- `application`: inicialização da aplicação e apresentação da partida.
- `boardgame`: estruturas genéricas de tabuleiro, posição e peça.
- `chess`: regras específicas do xadrez, partida, cores e exceções.
- `chess.pieces`: implementação do comportamento de cada peça.

---

## ▶️ Como Executar

### Executando pelo Eclipse

1. Abra o Eclipse.
2. Importe o projeto como **Existing Projects into Workspace**.
3. Execute `src/application/Program.java` como uma aplicação Java.
4. Informe as posições no formato de duas casas, por exemplo:

```text
Source: e2
Target: e4
```

### Executando pelo terminal

Na raiz do projeto, compile os arquivos:

```bash
javac -d bin $(find src -name "*.java")
```

No Windows PowerShell, utilize:

```powershell
javac -d bin (Get-ChildItem src -Recurse -Filter *.java | ForEach-Object { $_.FullName })
```

Depois, execute a aplicação:

```bash
java -cp bin application.Program
```

---

## 💡 Aprendizados

Este projeto contribuiu para a prática de conceitos importantes de desenvolvimento de software:

- Criação de modelos orientados a objetos
- Uso de classes abstratas e especialização por herança
- Reutilização de comportamento entre peças
- Separação entre regras de negócio e interface
- Uso de matrizes para representar o tabuleiro
- Manipulação de listas com Java Collections
- Tratamento de erros com exceções personalizadas
- Implementação incremental de regras de um domínio real

---

## 👩‍💻 Desenvolvido por

**Milene Menezes**

Estudante de Análise e Desenvolvimento de Sistemas, utilizando projetos práticos para aprofundar conhecimentos em Java, Programação Orientada a Objetos e desenvolvimento de software.
