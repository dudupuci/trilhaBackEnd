<strong>------ DESAFIO 1 --------</strong>

<h1 style= "color:red;">Desafio 1 - Trilha Back End</h1>

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
