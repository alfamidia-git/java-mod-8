## DESAFIO FINAL DO MÓDULO
Após explorar as aulas anteriores, você está pronto para enfrentar um desafio real...

## Sistema de Gerenciamento de Biblioteca Interativo com JDBC
Este desafio é uma extensão do anterior, incluindo agora uma interface de usuário interativa para realizar operações CRUD em uma biblioteca utilizando Java e JDBC.

### Vamos ao desafio:
1. Crie uma classe **Livro** com os seguintes atributos:
* id.
* título.
* autor.
* ano de publicação.
* status (enum disponível, alugado)
* métodos: toString(), getters e setters.
* Construtor que aceita todos os parâmetros.

2. Crie uma classe **LivroRepository**:
* **addLivro**: Adiciona um novo livro ao banco de dados.
* **alugarLivro**: Marca um livro como alugado.
* **devolverLivro**: Marca um livro como disponível.
* **verLivrosAlugados**: Lista todos os livros alugados.
* **verLivrosDisponiveis**: Lista todos os livros disponíveis.


3. Crie uma Classe Principal com Interface de Usuário:
* Utilize a classe Scanner para entrada de dados do usuário.
* Apresente um menu com as seguintes opções:
    1. Adicionar um Livro.
    2. Alugar um Livro.
    3. Devolver um Livro
    4. Ver Livros Alugados
    5. Ver Livros Disponíveis
    6. Sair
    ```unix
    Bem-vindo ao Sistema de Gerenciamento de Biblioteca
    Escolha uma opção:
    1 - Adicionar um Livro.
    2 - Alugar um Livro.
    3 - Devolver um Livro
    4 - Ver Livros Alugados
    5 - Ver Livros Disponíveis
    6 - Sair
    ```