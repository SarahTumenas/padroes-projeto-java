# Padrões de Projeto Java - Design Patterns

Neste repositório será compartilhado o projeto desenvolvido através da exploração do conceito de Padrões de Projeto com Java.

Inicialmente,  é importante entender os conceitos dos padrões para a melhor escolha para o projeto.

A princípio foram escolhidos  um padrão de cada tipo Singleton, Strategy, Facade, para implementação em Java puro, para melhor compreensão de suas definições.

Assim, posteriormente, utilizando o framework Spring, baseando-se nos mesmos três padrões escolhidos em Java puro,  foi construída uma API REST, com documentação JavaDoc, OpenAPI (Swagger) para consumir a API.

A estrutura de endereços Java foi gerada  pelo site:  https://www.jsonschema2pojo.org

URL base: https://viacep.com.br/ws

### Introdução: 
 Padrões de Projeto são soluções consolidadas para problemas recorrentes no desenvolvimento e manutenção de software orientado a objetos.
 Comumente classificados nas seguintes categorias:

- Padrões Criacionais:  Abstract Factory, Builder, Factory Method, Prototype, Singleton 
- Padrões Comportamentais: Chain of Responsibility, Iterator, Observer, Strategy, Template Method 
- Padrões Estruturais:  Adapter, Bridge, Composite, Decorator, Facade, Flywelght, Proxy 

### Singleton:
- Definição: Permitir a criação de uma única instância de uma classe e fornecer um modo para recuperá-la.

Ou seja, provê uma instância única de uma determinada Classe/Abstração.

Com Spring Framework: @Bean e @Autowired

### Strategy
- Definição: Simplificar a variação de algoritmos para a resolução de um problema.

Ou seja, interface que definirá o contrato que deverá ser seguido por múltiplas implementações, variações de um mesmo algoritmo que respeitam uma mesma interface.

Exemplo clássico é a interface de List no Java, que tem uma série de implementações de algoritmos diferentes.

Com Spring Framework: @Service e @Repository

### Facade
- Definição: prover uma Interface que reduza a complexidade nas integrações com subsistemas.

Ou seja, Interface que abstrai a complexidade de integrações com múltiplos subsistemas, bem como sistemas internos que requerem uma integração mais complexa.

Com Spring Framework: construção de uma API REST com o Objetivo desse padrão, abstraindo a complexidade das seguintes integrações: Spring Data JPA * e ViaCep (Feign)

*Em memória (usando o “h2”)

