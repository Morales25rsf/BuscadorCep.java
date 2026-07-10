📍 Buscador de CEP em Java - Consumo de API REST

Um projeto prático desenvolvido inteiramente em Java para aplicar conceitos de consumo de APIs externas, utilizando a API pública do ViaCEP.

🎯 O Desafio

O objetivo desta atividade acadêmica foi construir uma aplicação de console (terminal) capaz de:

Receber uma entrada do usuário via teclado (um CEP válido).

Fazer uma requisição HTTP (método GET) para um servidor externo.

Obter e exibir os dados processados em formato JSON no próprio terminal.

Lidar com possíveis falhas de rede usando tratamento de exceções.

🛠️ Tecnologias e Bibliotecas Utilizadas

Java (JDK 11+): Linguagem principal do projeto.

java.net.http.HttpClient: API moderna nativa do Java utilizada para realizar a comunicação com a web.

java.util.Scanner: Classe utilizada para capturar os dados digitados pelo usuário no terminal.

🧠 O que eu aprendi com este projeto

Durante o desenvolvimento, pude aprofundar meu entendimento prático sobre arquitetura de software e back-end:

O Ciclo de Comunicação Web: Aprendi a orquestrar os três pilares de uma requisição HTTP no Java: instanciar o cliente (HttpClient), construir o pedido (HttpRequest) e processar o retorno do servidor (HttpResponse).

Tratamento de Exceções (try/catch/finally): Como proteger a aplicação contra instabilidades (como a falta de internet) garantindo que o programa lide com o erro de forma elegante.

Gerenciamento de Recursos: A importância de fechar conexões e streams (como o encerramento do Scanner) para evitar vazamento de memória (Memory Leak).

🚀 Como testar o projeto

Para rodar este projeto, você precisa ter o JDK (Java Development Kit) instalado em sua máquina.

Clone este repositório:

git clone [https://github.com/SeuUsuario/seu-repositorio.git](https://github.com/SeuUsuario/seu-repositorio.git)


Abra o terminal na pasta onde o arquivo foi clonado.

Compile o código com o comando:

javac BuscadorCep.java


Execute o programa com o comando:

java BuscadorCep


Digite um CEP válido quando solicitado (ex: 01001000) e veja o endereço ser retornado no terminal!

Desenvolvido com dedicação por Fernandez durante os estudos de Análise e Desenvolvimento de Sistemas.
