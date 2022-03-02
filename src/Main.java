import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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
        mentoria.setTitulo("Mentoria Angular");
        mentoria.setDescricao("Aprendendo Angular");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);

        System.out.println(mentoria);
    }
}
