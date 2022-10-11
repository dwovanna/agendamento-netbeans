package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalTime;


import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class AgendaApp {

	public static void main(String[] args) {

		Especialidade especialidade1 = new Especialidade();
		especialidade1.setNome("Cardiologia");
		especialidade1.setDescricao("O Cardiologista cuida da saúde do coração.");

		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Otorrinolaringologia");
		especialidade2.setDescricao("O otorrinolaringologista é o médico especializado no diagnóstico e tratamento, clínico e cirúrgico, das doenças dos ouvidos, nariz, garganta, laringe e pescoço.");

		Especialidade especialidade3 = new Especialidade();
		especialidade3.setNome("Gastroenterologia");
		especialidade3.setDescricao("O gastroenterologista é o médico habilitado para fazer diagnósticos e tratar doenças que atingem o aparelho digestivo.");

		Especialidade especialidade4 = new Especialidade();
		especialidade4.setNome("Fisioterapia");
		especialidade4.setDescricao("O Fisioterapeuta atua no tratamento e prevenção de doenças e lesões, decorrentes de fraturas ou má-formação ou vícios de postura.");

		Especialidade especialidade5 = new Especialidade();
		especialidade5.setNome("Clínico Geral");
		especialidade5.setDescricao("O Clínico geral é o profissional responsável por diagnosticar doenças, desde as mais simples até as mais complexas. ");

		//Criar dois médicos
		
		Medico medico1 = new Medico();
		medico1.setNome("Ana Santos");
		Especialidade[] especialidadeMedico1 = {especialidade1, especialidade5};
		medico1.setEspecialidade(especialidadeMedico1);
		medico1.setEmail("ana.santos@gmail.com");
		medico1.setCrm("1234-8");
		medico1.setTelefone("(11) 4321-4569");
		
		Medico medico2 = new Medico();
		medico2.setNome("Lucas Silva");
		Especialidade[] especialidadeMedico2 = {especialidade4,especialidade1,especialidade5};
		medico2.setEspecialidade(especialidadeMedico2);
		medico2.setEmail("lucas.silva@gamil.com");
		medico2.setCrm("7856-8");
		medico2.setTelefone("(11) 4569-8852");
		
		//exibir dados dos médicos
		
		System.out.println("------------LISTA DE MÉDICOS------------");
		System.out.println("Nome do médico: " + medico1.getNome());
		System.out.println("CRM do médico: " + medico1.getCrm());
		System.out.print("Especialidades: ");
		
		int i = 0;
		while(i < medico1.getEspecialidade().length ) {
			System.out.print(medico1.getEspecialidade()[i].getNome() + " ");
			i++;
		}
		
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Nome do médico: " + medico2.getNome());
		System.out.println("CRM do médico: " + medico2.getCrm());
		System.out.print("Especialidades ");
		 i = 0;
		while(i < medico2.getEspecialidade().length) {
			System.out.print(medico2.getEspecialidade()[i].getNome() + " ");
			i++;
		}
		
		
		//endereços
		
		Endereco endereco1 = new Endereco();
		endereco1.setCep("86529-789");
		endereco1.setEstado("SP");
		endereco1.setcidade("Barueri");
		endereco1.setBairro("Jardim Vila");
		endereco1.setNumero("745");
		endereco1.setComplemento("Casa 2");
		endereco1.setlogradouro("Avenida Guerra");
		
		Endereco endereco2 = new Endereco();
		endereco2.setCep("56325-756");
		endereco2.setEstado("SP");
		endereco2.setcidade("Alphaville");
		endereco2.setBairro("Jardim Silveira");
		endereco2.setNumero("785");
		endereco2.setComplemento("Casa 2");
		endereco2.setlogradouro("Avenida Moura");
		
		//Planos de saúde
//		
		PlanoDeSaude plano1 = new PlanoDeSaude();
		plano1.setCategoria("Basic");
		plano1.setNumero("0667-57");
		plano1.setOperadora("Notredame");
		plano1.setValidade(LocalDate.of(2030, 12, 15));
	
		PlanoDeSaude plano2 = new PlanoDeSaude();
		plano2.setCategoria("Exclusivo");
		plano2.setNumero("9717-62");
		plano2.setOperadora("Unimed");
		plano2.setValidade(LocalDate.of(2022, 12, 15));
//		
//		//Paciente
//		
		Paciente paciente1 = new Paciente();
		paciente1.setNome("Dwovanna Santos");
		paciente1.setRg("4589623-2");
		paciente1.setCpf("45236984-45");
		paciente1.setDataNascimento(LocalDate.of(2003, 4, 24));
		paciente1.setGenero("Femenino");
		paciente1.setEndereco(endereco1);
		paciente1.setTelefone("(11) 431654-4658");
		paciente1.setPlanoDeSaude(plano1);
		
		Paciente paciente2 = new Paciente();
		paciente2.setNome("Yuri Moura");
		paciente2.setRg("458963-4");
		paciente2.setCpf("45289635-88");
		paciente2.setDataNascimento(LocalDate.of(2005, 6, 22));
		paciente2.setGenero("Masculino");
		paciente2.setEndereco(endereco2);
		paciente2.setTelefone("(11) 458953-4582");
		paciente2.setPlanoDeSaude(plano2);
		
		//Exibir
		System.out.println();
		System.out.println("-----------------LISTA DE PACIENTES--------------");
		System.out.println("Nome do paciente: " + paciente1.getNome());
		System.out.println("Data de nascimento: " + paciente1.getDataNascimento());
		System.out.println("Telefone: " + paciente1.getTelefone());
		System.out.println("Cidade: " + paciente1.getEndereco().getcidade());
		System.out.println("Estado: " + paciente1.getEndereco().getEstado());
		System.out.println("Plano de saúde: " + paciente1.getPlanoDeSaude().getOperadora());
		
		System.out.println("--------------------------------------------------");
		System.out.println("Nome do paciente: " + paciente2.getNome());
		System.out.println("Data de nascimento: " + paciente2.getDataNascimento());
		System.out.println("Telefone: " + paciente2.getTelefone());
		System.out.println("Cidade: " + paciente2.getEndereco().getcidade());
		System.out.println("Estado: " + paciente2.getEndereco().getEstado());
		System.out.println("Plano de saúde: " + paciente2.getPlanoDeSaude().getOperadora());
//		
//		//Agendar para o paciente 1 uma consulta
		
		Agenda agendamento1 = new Agenda();
		agendamento1.setPaciente(paciente1);
		agendamento1.setMedico(medico2);
		agendamento1.setEspecialidade(especialidade4);
		agendamento1.setDataDaConsulta(LocalDate.of(2023, 9, 27));
		agendamento1.setHoraDaConsulta(LocalTime.of(15, 45));
		
		//Exibir consulta paciente 1
		
		System.out.println();
		System.out.println("--------------AGENDAMENTO-------------");
		System.out.println("Paciente: " + agendamento1.getPaciente().getNome());
		System.out.println("Data da consulta: " + agendamento1.getDataDaConsulta());
		System.out.println("Hora da consulta: " + agendamento1.getHoraDaConsulta());
		System.out.println("Nome do Médico: " + agendamento1.getMedico().getNome());		
		System.out.println("Nome da especialidade: " + agendamento1.getEspecialidade().getNome());		
		System.out.println("Plano de saúde: " + agendamento1.getPaciente().getPlanoDeSaude().getOperadora());		
		System.out.println("Telefone do paciente: " + agendamento1.getPaciente().getTelefone());		
		
	}

}