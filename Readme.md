<strong>------ DESAFIO 1 --------</strong>

<h1>Desafio 1 - Trilha Back End</h1>

a) Um sistema de Controle de Versões (VCS), pode ser descrito como uma plataforma de hospedagem de códigos/projetos, em que qualquer desenvolvedor de qualquer parte do mundo pode associar seu repositório local (de sua máquina), com um repositório virtual (hospedado no VCS).

b) - Seus projetos ficam hospedados e seguros neste sistema, você pode optar por deixar um projeto público ou privado. Isso trás maior segurança, pois caso você perca seu projeto no seu repositório local, ele estará no seu repositório virtual também.
   - Mercado de Trabalho: Antes de uma empresa lhe contratar, ela irá adorar ver seus projetos no seu repositório virtual, dentro do sistema VCS. É indispensável não subir projetos no GIT.
   - Comodidade: Você pode acessar seus projetos de qualquer máquina, utilizando apenas sua conta criada no Git, por exemplo.
   - Fácil uso: Subir um projeto no Git é muito simples, nos dias de hoje existem muitos tutoriais e vídeos autoexplicativos ensinando você a como usar o git.
   - Compartilhamento: Diversos desenvolvedores postam diversos projetos todos os dias no GitHub, usando diferentes tecnologias de programação. Seus códigos serão vistos, compartilhados e testados. Você pode fazer o mesmo com os projetos de outros desenvolvedores. Podemos dizer que um sistema VCS além de muito útil para a carreira profissional de um Dev, é também uma excelente fonte de estudos.

   c) Git, Mercurial e CVS
   d) Feito!!! 

   <strong>------ DESAFIO 2 --------</strong>

   a) Ao meu entender, POO pode ser definida como um paradigma de programação, totalmente pensado e aplicado para que o desenvolvimento de projetos se torne mais fácil e melhor estruturado, prevenindo assim também bugs de código/problemas de manutenção.
   Ela é composta por 4 pilares: Abstração, encapsulamento, herança e polimorfismo.

   b) Abstração é quando nós "trazemos" a realidade do mundo real, para dentro do nosso código/sistema. Isso serve também para evitar repetições/replicações de código. Por exemplo: podemos criar uma classe abstrata com vários métodos e chama-los em outras classes.

   c) Encapsulamento é quando cuidamos do tratamento de dados, por exemplo: Se uma classe "Animal" tem seus dados definidos como "nome", "peso", "especie", é DEVER exclusivo da própria classe Animal tratar e proteger seus atributos/dados, etc. Seus atributos ficarão trancados dentro do objeto(classe), podendo serem definidas como private. Podem ser consultadas, mas não modificadas por outras classes.

   d) Em minhas palavras, Herança em Java é quando por exemplo: Nós temos a classe "Animal", mas também temos as classes "Cachorro" e "Gato". Todo Animal tem por padrão seu "nome" , "sexo" , "peso". Quando utilizamos a herança, um simples "public class Cachorro <strong>extends</strong> Animal", faz com que as características programadas dentro da classe Animal sejam compartilhadas com a classe Cachorro. Isso evita replicações de código, economiza tempo, linhas de código e também memória, este é um exemplo também de boa prática de programação.

   e) Polimorfismo em Java pode ser entendido quando criamos métodos. Por exemplo: Temos em nossa classe "Funcionario" um double salario, aumentoDoSalario;

   Podemos criar um método para definir um aumento salarial para este funcionário, da seguinte forma:
   
   public double calculaSalario(param. caso necessário) {
      double totalSalario = salario + (salario * aumentoDoSalario); 
      return totalSalario;
   }

   Feito isso, podemos instanciar um novo Funcionario e chamar o método, da seguinte forma:

   Funcionario funcionario = new Funcionario(construtor);
   System.out.println(funcionario.calculaSalario());

f) 5 Vantages da POO:
   - Reutilização(heranca);
   - Herança e Polimorfismo permitem que o sistema se torne mais extensível;
   - Conseguimos aproximar mais nossos sistemas do mundo real;
   - Facilidade maior para desenvolver projetos de alto nível;
   - Segurança maior no código;
   Atualmente, mais de 90% das empresas utilizam a POO.

   <strong>------ DESAFIO 3 --------</strong>

   a) (I) O protocolo HTTP (Protocolo de Transferência de Hipertexto), é o protocolo responsável por transmitir páginas web de um servidor para o navegador(browser). Mas ele não se restringe apenas a isso, também é usado em aplicativos, etc. Podemos notar que quando um site utiliza o protocolo HTTPS, seu navegador, por exemplo o Google Chrome, identifica-o como um cadeado. Isso significa que o site é seguro e os dados são criptografados (Certificado SSL). <img src = "funcionamento-protocolo-http-1-768x768.jpg" class ="img-http"> Em minhas palavras, o HTTP funciona da seguinte forma: ele quem faz a intermediação entre o cliente e o servidor. Ele faz a requisição para o servidor, o servidor retorna a resposta e ele a retorna para os clientes.

   a) (II) Rest (Representational State Transfer), está ligada a construção de Aplicações WEB, como sistemas, sites etc. Tem ligação também com uma hierarquia bem organizada do código. Rest pode ser entendido de forma simples e clara como um Conjunto de Príncipios de Arquitetura de Software.

   Que princípios são esses?
   - Ai vem a sua ligação com o protocolo HTTP, que é o caminho mais conhecido nas transferências de dados, permitindo assim:
   - Criar dados no Servidor;
   - Atualizar esses dados;
   - Pesquisa-los;
   - Execução;
   - Remoção.

   Visto isso, a maioria das Rest API's usam como protocolo de comunicação o HTTP, se não o HTTPS, mas é muito menos utilizado.

   a) (III) As API's <strong>(Application Programming Interfaces)</strong> totalmente em minhas palavras e ao meu ver, diante da experiência com o uso que tenho delas, posso descrever uma API como: Aplicações em uma linguagem de programação que ajudam/auxiliam o programador a criar funcionalidades em seu site, por exemplo, que com a ajuda de uma API se tornam mais simples, mais fáceis. Por exemplo: <strong>Em um e-commerce de artigos de pet, um Pet Shop.</strong> Eu gostaria de que na página de meu produto ficassem os <strong>comentários dos clientes que compram e acompanham minhas postagens dentro do Facebook ou do Instagram,</strong> por exemplo. Para que eu não precise criar isso do zero(que seria muito complexo) eu faço o uso de uma <strong>API</strong> para isso, que fará a função de <strong>"ponte"</strong> entre o meu e-commerce e os comentários do pessoal, tornando esse processo muito mais rápido, simples e prático. Existem muitos outros tipos de API e estão presentes na maioria das aplicações WEB nos dias de hoje.

   b) O método HTTP é quem determinará qual operação será realizada em qual determinado recurso.
   Utiliza-se para isso os métodos:
   - GET, para recuperar/acessar;
   - POST, para criar;
   - PUT, para alterar;
   - DELETE, para deletar/apagar.

   Além destes famosos, o procotolo HTTP também define os métodos:
    
    - CONNECT;
    - HEAD;
    - TRACE;
    - OPTIONS;

    c) Prática.

    i) <strong>O Swagger</strong> é uma aplicação open source(código aberto) que ajuda/auxilia os devs a definir, criar, documentar e consumir API's REST. É uma ferramenta muito utilizada e também possui um editor online, o "Swagger Editor". Nesta ferramenta você pode criar e documentar manualmente a API.

    Qual sua função, de forma resumida?
    - O que ele faz é simplesmente simplificar o desenvolvimento de API's.

    k) <strong>O Postman</strong> bem parecido com o Swagger, é também um aplicativo que serve para testar API's. Serve de suporte à documentação de requisições de uma API. Facilita também aos Devs criar, documentar, compartilhar e testar as API's.
