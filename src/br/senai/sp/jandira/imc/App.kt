package br.senai.sp.jandira.imc

import br.senai.sp.jandira.imc.model.Consulta
import br.senai.sp.jandira.imc.model.Paciente
import br.senai.sp.jandira.imc.model.Medico
import java.time.LocalDate
import java.util.Scanner

fun main(){ // Criaçao de Médico

    var medico = Medico()
    var medico1 = Medico()
    var medico2 = Medico()

    //Preenchendo os Dados de cada médico

    medico.nome = "Ana Maria"
    medico.crm = "1111111"
    medico.telefone = "(11)23537865"
    medico.especialidades.add("Gastroenterologista")
    medico.especialidades.add("Piscologo")
    medico.especialidades.addAll(listOf("Gastroenterologista", "Médico Geral", "Ortopedista"))
    medico.mostrarFichaDoMedico()

    medico1.nome = "Thayla Amorim"
    medico1.crm = "98765456"
    medico1.telefone = "(11)23537865"
    medico1.especialidades.addAll(listOf("Gastroenterologista",  "Ortopedista", "Pediatra"))
    medico1.mostrarFichaDoMedico()


    val leitor = Scanner(System.`in`)

    var paciente1 = Paciente()
    var paciente2 = Paciente()



    print("Qual o nome do paciente: ")
    paciente1.nome = leitor.nextLine()

    print("Qual o peso do paciente: ")
    paciente1.peso = leitor.nextInt()

    print("Qual a altura do paciente: ")
    paciente1.altura = 1.59f


    paciente1.nome = "Ataan mais lindo do mundo"
    paciente1.peso = 62
    paciente1.altura = 1.80f
    paciente1.telefone = "(11)4898642345638"
    paciente1.dataNascimento = LocalDate.of(2007, 6, 23)
    paciente1.mostrarDados()

    paciente2.nome = "Thayla"
    paciente2.peso = 51
    paciente2.altura = 1.58f
    paciente2.telefone = "(11)4898642345638"
    paciente2.dataNascimento = LocalDate.of(2008, 6, 1)
    paciente2.mostrarDados()

    // Criar uma consulta pro clientes

    var c1 = Consulta()
    c1.marcarConsulta(valor = 100.0, LocalDate.of(2025,2,26))



}