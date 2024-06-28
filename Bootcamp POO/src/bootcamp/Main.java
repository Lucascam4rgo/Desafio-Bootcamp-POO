package bootcamp;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Cursos curso1 = new Cursos();

		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição Curso Java");
		curso1.setCargaHoraria(8);

		Cursos curso2 = new Cursos();

		curso2.setTitulo("Curso Python");
		curso2.setDescricao("Descrição Curso Python");
		curso2.setCargaHoraria(6);

		//System.out.println(curso1);
		//System.out.println(curso2);
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição Mentoria Java");
		mentoria.setDataMentoria(LocalDate.now());
		
		//System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Devs devLucas = new Devs();
		devLucas.setNome("Lucas");
		devLucas.inscricaoBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos " + devLucas.getNome() + "" + devLucas.getConteudosInscritos());
		devLucas.progredir();
		System.out.println("-----------------");
		System.out.println("Conteúdos Concluídos " + devLucas.getNome() + "" + devLucas.getConteudosConcluidos());
		System.out.println("Conteúdos Inscritos " + devLucas.getNome() + "" + devLucas.getConteudosInscritos());
		System.out.println("XP: " + devLucas.calcularTotalXp());
		System.out.println("-----------------");
		
		Devs devBeatriz = new Devs();
		devBeatriz.setNome("Beatriz");
		devBeatriz.inscricaoBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos " + devBeatriz.getNome() + ""  + devBeatriz.getConteudosInscritos());
		devBeatriz.progredir();
		System.out.println("-----------------");
		System.out.println("Conteúdos Concluídos " + devBeatriz.getNome() + ""  + devBeatriz.getConteudosConcluidos());
		System.out.println("Conteúdos Inscritos " + devBeatriz.getNome() + "" + devBeatriz.getConteudosInscritos());
		System.out.println("XP: " + devBeatriz.calcularTotalXp());
		System.out.println("-----------------");
		
		
		
	}

}
