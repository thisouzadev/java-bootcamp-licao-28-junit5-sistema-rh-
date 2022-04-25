### Termos e acordos

Ao iniciar este projeto, você concorda com as diretrizes do Código de Ética e Conduta e do Manual da Pessoa Estudante da Trybe.

---

# Boas vindas ao repositório do desafio da Aceleração Java!

Você já usa o GitHub diariamente para desenvolver os exercícios, certo? Agora, para desenvolver o desafio, você deverá seguir as instruções a seguir. Fique atento a cada passo, e se tiver qualquer dúvida, nos envie por _Slack_! #vqv 🚀

Aqui você vai encontrar os detalhes de como estruturar o desenvolvimento do seu desafio a partir deste repositório, utilizando uma branch específica e um _Pull Request_ para colocar seus códigos.

---
# Instruções para entregar seu projeto

## Não se esqueça de consultar as documentações!

⚠️ **Importante**:

Esse projeto tem como intuito te treinar para ter mais familiaridade com a documentação de aplicações, por tanto, poderão haver alguns comandos ou atributos que não estão no curso, mas que devem ser descritos no decorrer dos requisitos.

Nesses casos, é importante se atentar a aquilo que o requisito pede, e lembrar sempre de utilizar a [documentação oficial](https://docs.oracle.com/en/java/javase/11/) do Java para pesquisar detalhes sobre comandos.


## Antes de começar a desenvolver

Lembre-se que você pode consultar nosso conteúdo sobre [Git & GitHub](https://course.betrybe.com/intro/git/) sempre que precisar!

1. Clone o repositório
  * Por exemplo: `git clone git@github.com:tryber/desafio-aceleracao.git`
  * Entre no diretório do repositório que você acabou de clonar:
    * neste caso `cd desafio-aceleracao`

2. Instale as dependências:
    * `mvn install`

3. Crie uma branch a partir da branch `main`

  * Verifique que você está na branch `main`
    * Exemplo: `git branch`
  * Se não estiver, mude para a branch `main`
    * Exemplo: `git checkout main`
  * Agora, crie uma branch onde você vai guardar os commits do seu desafio
    * Você deve criar uma branch no seguinte formato: `nome-de-usuario-nome-do-desafio`
    * Exemplo:
      * `git checkout -b joaozinho-acc-java-sample`

4. Adicione a sua branch com o novo `commit` ao repositório remoto

  - Usando o exemplo anterior:
    - `git push -u origin joaozinho-acc-java-sample`

5. Crie um novo `Pull Request` _(PR)_
  * Vá até a aba de _Pull Requests_ deste repositório no GitHub
  * Clique no botão verde _"New pull request"_
  * Clique na caixa de seleção _"Compare"_ e escolha a sua branch **com atenção**
  * Clique no botão verde _"Create pull request"_
  * Adicione uma descrição para o _Pull Request_ e clique no botão verde _"Create pull request"_
  * **Não se preocupe em preencher mais nada por enquanto!**
  * Volte até a página de _Pull Requests_ do repositório e confira que o seu _Pull Request_ está criado
 
 ⚠️ **Lembre-se do CheckStyle! Deixe seu Eclipse configurado para arrumar o estilo automaticamente. Qualquer dúvida, volte no conteúdo.**

---

## Durante o desenvolvimento

* ⚠ **PULL REQUESTS COM ISSUES NO CHECKSTYLE NÃO SERÃO AVALIADAS, ATENTE-SE PARA RESOLVÊ-LAS ANTES DE FINALIZAR O DESENVOLVIMENTO!** ⚠

* Faça `commits` das alterações que você fizer no código regularmente

* Lembre-se de sempre após um (ou alguns) `commits` atualizar o repositório remoto

* Os comandos que você utilizará com mais frequência são:
  1. `git status` _(para verificar o que está em vermelho - fora do stage - e o que está em verde - no stage)_
  2. `git add` _(para adicionar arquivos ao stage do Git)_
  3. `git commit` _(para criar um commit com os arquivos que estão no stage do Git)_
  4. `git push -u origin nome-da-branch` _(para enviar o commit para o repositório remoto na primeira vez que fizer o `push` de uma nova branch)_
  5. `git push` _(para enviar o commit para o repositório remoto após o passo anterior)_

---

## Depois de terminar o desenvolvimento (opcional)

Para **"entregar"** seu projeto, siga os passos a seguir:

* Vá até a página **DO SEU** _Pull Request_, adicione a label de _"code-review"_ e marque seus colegas
  * No menu à direita, clique no _link_ **"Labels"** e escolha a _label_ **code-review**
  * No menu à direita, clique no _link_ **"Assignees"** e escolha **o seu usuário**
  * No menu à direita, clique no _link_ **"Reviewers"** e digite `students`, selecione o time `tryber/students-sd-0x`

Se ainda houver alguma dúvida sobre como entregar seu projeto, [aqui tem um video explicativo](https://vimeo.com/362189205).

---

# Requisitos do desafio

Crie um projeto chamado `SistemaRH` e adicione uma classe chamada `PessoaColaboradora`, que deve ter um atributo `salarioBruto` do tipo `double` (que representa o salário bruto da pessoa colaboradora) e também os seguintes métodos:

- `calcularSalarioLiquido`: realiza o cálculo do salário líquido, ou seja, o salário após o desconto do imposto de renda. Considere o valor do imposto de renda como 20% do salário bruto.

- `calcularValorBrutoRecebidoAnual`: esse método será responsável por calcular quanto dinheiro a pessoa colaboradora receberá após um número x de anos. Então esse método deve receber um número inteiro, que representa a quantidade de anos que será avaliada; e retorna um valor do tipo `double`, representando o valor em dinheiro que a pessoa colaboradora irá receber depois de x anos. Para esse método, use o valor bruto do salário.

- `calcularValorLiquidoRecebidoAnual`: esse método será responsável por calcular quanto dinheiro a pessoa colaboradora receberá após um número x de anos. Então esse método deve receber um número inteiro, que representa a quantidade de anos que será avaliada; e retorna um valor do tipo `double`, representando o valor em dinheiro que a pessoa colaboradora irá receber depois de x anos. Para esse método, use o valor liquido do salário.

- `calcularValorImpostoAnual`: esse método será responsável por calcular quanto dinheiro foi pago de imposto após um número x de anos. Então esse método deve receber um número inteiro, que representa a quantidade de anos que será avaliada, e retornar um valor do tipo `double`, representando o valor em dinheiro que a pessoa colaboradora pagou de imposto de renda. Em outras palavras, esse método retorna a soma do valor mensal pago ao imposto de renda durante um período de anos. Lembre-se também de adicionar os métodos get e set referentes ao atributo `salarioBruto`, usando a opçao `Source` > `Generate Getters and Setters...`. 

Para esse desafio, você terá também que desenvolver os testes unitários utilizando a extensão do JUnit no Eclipse. Crie a classe `TestePessoaColaboradora` utilizando a extensão do JUnit e escreva os métodos testes para cada método da classe `PessoaColaboradora`. Os testes unitários devem cobrir todos os métodos da classe `PessoaColaboradora`, ou seja, a classe teste deverá ter os seguintes métodos:

- `testeCalcularSalarioLiquido`: esse método é responsável por testar o método `calcularSalarioLiquido` da classe `PessoaColaboradora`.

- `testeCalcularValorBrutoRecebidoAnual`: esse método é responsável por conter o teste do método `calcularValorBrutoRecebidoAnual` da classe `PessoaColaboradora`.

- `testeCalcularValorLiquidoRecebidoAnual`: esse método aqui é o responsável por verificar o correto funcionamento do método `calcularValorLiquidoRecebidoAnual` da classe `PessoaColaboradora`.

- `testeCalcularValorImpostoAnual`: por fim, esse método é o responsável por testar o método `calcularValorImpostoAnual` da classe `PessoaColaboradora`.

**IMPORTANTE: use a anotação `@DisplayName` para dar nomes mais significativos para os métodos de teste.**

## Exemplo

Exemplos de funcionamento dos métodos da classe `PessoaColaboradora` com as entradas e as respectivas saídas:

- `calcularSalarioLiquido()`: esse método não recebe argumentos, ele usa o atributo `salarioBruto` para gerar sua saída. Suponha que o `salarioBruto` é igual a 3000, então esse método deve retornar 2400. Ou seja, se o salário bruto é 3000, o salário líquido deve ser 2400.

- `calcularValorBrutoRecebidoAnual(int anos)`: esse método recebe um inteiro, que representa o período em anos que será usado no cálculo. Suponha que o salário bruto mensal é 3000, e a entrada desse método é 5, então a saída desse método deve ser 180000.

- `calcularValorLiquidoRecebidoAnual(int anos)`: esse método recebe um inteiro, que representa o período em anos que será usado no cálculo. Suponha que o salário líquido mensal é 2400, e a entrada desse método é 5, então a saída desse método deve ser 144000.

- `calcularValorImpostoAnual(int anos)`: esse método recebe um inteiro, que representa o período em anos que será usado no cálculo. Suponha que o salário bruto mensal é 3000, e a entrada desse método é 5, então a saída desse método deve ser 36000.


---

# Avisos Finais

Ao finalizar e submeter o desafio, não se esqueça de avaliar sua experiência preenchendo o formulário. Leva menos de 3 minutos!

Link: [Formulário](https://be-trybe.typeform.com/to/PsefzL2e)

O avaliador automático não necessariamente avalia seu projeto na ordem em que os requisitos aparecem no readme. Isso acontece para deixar o processo de avaliação mais rápido. Então, não se assuste se isso acontecer, ok?

---
