import java.time.LocalDate;

import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

public class App {
  public static void main(String[] args) throws Exception {
    Curso curso1 = new Curso();
    curso1.setTitulo("Curso Java");
    curso1.setDescricao("Descricao curso Java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso JavaScript");
    curso2.setDescricao("Descricao curso JavaScript");
    curso2.setCargaHoraria(5);

    Mentoria mentoria1 = new Mentoria();
    mentoria1.setTitulo("Mentoria de Python");
    mentoria1.setDescricao("Descricao mentoria de Python");
    mentoria1.setData(LocalDate.now());

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descricao Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria1);

    Dev developer1 = new Dev();
    developer1.setNome("Carlos");
    developer1.inscreverBootcamp(bootcamp);

    System.out.println("Conteudos inscritos: (Dev1) " + developer1.getConteudosInscritos());
    developer1.progredir();
    System.out.println("Conteudos inscritos: (Dev1) " + developer1.getConteudosInscritos());
    System.out.println("Conteudos concluidos: (Dev1) " + developer1.getConteudosConcluidos());

    System.out.println("------------------------");

    Dev developer2 = new Dev();
    developer2.setNome("Joao");
    developer2.inscreverBootcamp(bootcamp);

    System.out.println("Conteudos inscritos: (Dev2) " + developer2.getConteudosInscritos());
    developer2.progredir();
    developer2.progredir();
    developer2.progredir();
    System.out.println("Conteudos inscritos: (Dev2) " + developer2.getConteudosInscritos());
    System.out.println("Conteudos concluidos: (Dev2) " + developer2.getConteudosConcluidos());
    System.out.println("XP: " + developer2.calcularTotalXp());
  }
}
