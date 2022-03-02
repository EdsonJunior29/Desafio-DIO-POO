import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de indrodução da linguagem Java.");
        curso1.setCargaHoraria(10);

        Conteudo curso2 = new Curso();
        curso2.setTitulo("Curso Angular");
        curso2.setDescricao("Curso de indrodução ao Angular");
        ((Curso) curso2).setCargaHoraria(8);
        System.out.println("XP atualizado: " + curso2.calcularXp());

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Aprendendo Java");
        mentoria.setData(LocalDate.now());

        Conteudo mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria Angular");
        mentoria2.setDescricao("Aprendendo Angular");
        ((Mentoria) mentoria2).setData(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Java Developer");
        bootcamp1.setDescricao("Aprendendo Java");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(mentoria);

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Angular Developer");
        bootcamp1.setDescricao("Aprendendo Angular");
        bootcamp2.getConteudos().add(curso2);
        bootcamp2.getConteudos().add(mentoria2);

        System.out.println("===========================================================================");
        Dev dev = new Dev();
        dev.setNome("Edson");
        dev.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos de " + dev.getNome() + dev.getConteudoInscritos());
        dev.progredir();
        dev.progredir();
        System.out.println("Conteudos inscritos de " + dev.getNome() + dev.getConteudoInscritos());
        System.out.println("Conteudos concluído de " + dev.getNome() + dev.getConteudoConcluidos());
        System.out.println("XP: " + dev.calcularTotalXp());


        System.out.println("===========================================================================");
        Dev dev2 = new Dev();
        dev2.setNome("Joao");
        dev2.inscreverBootcamp(bootcamp2);
        System.out.println("Conteudos inscritos " + dev2.getNome() + dev2.getConteudoInscritos());
        dev2.progredir();
        System.out.println("Conteudos inscritos " + dev2.getNome() + dev2.getConteudoInscritos());
        System.out.println("Conteudos concluído " + dev2.getNome() + dev2.getConteudoConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());
    }
}
