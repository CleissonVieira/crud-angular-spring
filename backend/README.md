## Extensões utilizadas no VsCode para Spring:

- `Java + Spring Extension Pack` (Loiane)'

## [Java 18](https://www.oracle.com/java/technologies/javase/jdk18-archive-downloads.html) utilizado no projeto (indicação sempre atualizar a versão realizando os ajustes necessários)

- Necessário configurar nova variável de ambiente do sistema (nome `JAVA_HOME` com caminho `C:\Program Files\Java\jdk-18.0.2.1`) e novo path (`%JAVA_HOME%\bin`)
- Validar no cmd: `java -version`

## Spring 3.0.2 utilizado no projeto (indicação sempre atualizar a versão realizando os ajustes necessários)

## [Apache Maven 3.8.7](https://maven.apache.org/download.cgi) utilizada no projeto

- Necessário configurar nova variável de ambiente do sistema (nome `M2_HOME` com caminho `C:\apache-maven-3.8.7`) e novo path (`%M2_HOME%\bin`)
- Validar no cmd: `mvn -version`

## Foi adicionado a biblioteca Bean Validation

- Entrar no arquivo pom.xml, clicar com o direito e Add Starters, pesquisar por Validation (Bean Validation with Hibernate validator)

## Anotações/Dicas

1. No controller se usa acima da classe :
   1.1. @Validated para utilizar as validações nos endPoints
   1.2. @RequestMapping("/api/courses") // informa a rota principal das requisições
   1.3. @AllArgsConstructor // automatiza e cria os construtores por baixo dos panos

2. No controller, em um Get por ID, utilizamos @GetMapping("/{id}") e no parametro da função @PathVariable long id para indicar que vem da URL o ID e que se chama id (faz de para se o nome for o mesmo do GetMapping)
   Classe de retorno ResponseEntity<Course> para manipular o status de retorno caso não exista dados
   
3. No model se usa acima da classe :
   3.1. @SQLDelete(sql = "UPDATE Course SET status = 'Inativo' WHERE id = ?") para o método deleteById, invocado no controller utilizando este modelo, utilizar da query informada
   3.2. @Where(clause = "status = 'Ativo'") para quando qualquer método no controller executar alguma query utilizando deste modelo aplicar a clausula informada
   3.3. Notações como @NotBlank, @NotNull, @Length(min = 5, max = 100), servem, respectivamente, para não permitir valores em branco, nullos e limitar os caracteres aceitos. Assim como @Column(length = 100, nullable = false) oferece um lengh max e não permite variáveis nullas para o banco também.
