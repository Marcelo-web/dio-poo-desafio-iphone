<p align="center">
<img alt="GitHub Top Language" src="https://img.shields.io/github/languages/top/Marcelo-web/dio-poo-desafio-iphone" />
</p>

## Desafio sobre POO e UML.


###  🔵Modelagem e diagramação da representação UML e código no que se refere ao componente iPhone.

Com base no [vídeo de lançamento](https://www.youtube.com/watch?v=9ou608QQRq8) do iPhone, elabore em uma ferramenta de UML de sua preferência, a diagramação das classes e interfaces com a proposta de representar os papéis do iPhone de: 

- Reprodutor Musical,
- Aparelho telefônico
- Navegador na Internet.

Em seguida, crie classes e interfaces no formato de arquivos *.java*

####  ✔️Comportamentos esperados:
- Reprodutor Musical:  *tocar, pausar, selecionarMusica.*
- Aparelho Telefônico:  *ligar, atender, iniciarCorreioVoz.*
- Navegador na internet:  *exibirPagina, adicionarNovaAba, atualizarPagina.*

### 🟠Representação do UML
Aqui foi utilizada a ferramenta chamada Astah para construção de gráficos UML. Para representação do gráfico UML, foi feita uma associação do tipo agregação entre iPhone e suas dependências, que são os comportamentos ou funcionalidades esperadas que um iPhone deve ter: reprodução musical, aparelho telefônico e navegação na internet, conforme divulgado durante o lançamento.  Estas funcionalidades aqui foram estabelecidas como *interfaces*, pois  os aplicativos concretos que forem implementá-las terão que constituir um contrato, de modo a serem obrigados a executar os métodos esperados de acordo com a sua natureza. 
Portanto, :
- um **IPodApp** deve implementar os comportamentos de um *reprodutor musical*.
- um **PhoneApp** deve implementar os comportamentos de um *aparelho telefônico*.
- um **SafariApp** deve implementar os comportamentos de um *navegador na internet*.  

A vantagem no uso de interfaces é que as mesmas permitem **flexibilidade**, de forma que caso surja no futuro algum aplicativo que use mais de um comportamento, estes podem ser adquiridos ao se implementar mais de uma interface. Se fossem classes abstratas, isso não poderia ser feito, tendo em vista que em Java não é permitido a herança múltipla e, portanto, uma classe não pode herdar de mais de uma classe. 
Outra vantagem é o **desacoplamento de código**,  já que a classe *IPhone* não precisa saber como um ReprodutorMusical é criado, por exemplo.  Ela apenas recebe a dependência. 

![meu_uml](https://github.com/Marcelo-web/dio-poo-desafio-iphone/assets/64988565/2054b060-41f7-4858-9db6-5ea76a3c2259)

### 🟢Estrutura de código
Através da IDE Eclipse, foram criadas classes e interfaces (arquivos *.java)*, seguindo a nomenclatura e os padrões propostos no diagrama UML. 
Ao fim, foi criada uma classe executável **Usuario** , sendo o ponto de entrada aplicação. Dentro dela, para que um *IPhone* seja instanciado, devem ser passadas suas funcionalidades disponíveis para os parâmetros do construtor, aqui representados por : ReprodutorMusica, AparelhoTelefonico e NavegadorNaInternet. Nesse caso, foram passados como argumentos os objetos que implementam suas respectivas interfaces, tais como : IPodApp, PhoneApp e SafariApp.
Esse processo em que a classe *IPhone* recebe em seu construtor os objetos de fora sem criá-los internamente, chama-se *injeção de dependência.*

```
IPhone iphone = new IPhone(new IPodApp(), new PhoneApp(), new SafariApp());
iphone.selecionarMusica();
...
```

 Desta forma, é possível fazer  com que dentro da classe *IPhone*, uma interface passe a apontar para um objeto que a implementa, permitindo com que seja chamado o método daquele objeto, caracterizando o *polimorfismo*.
Todo o código em Java, pode ser acessado dentro deste repositório, no diretório uml_iphone.