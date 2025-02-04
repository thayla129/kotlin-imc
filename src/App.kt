import java.time.LocalDate
import java.util.Scanner

fun main(){

    val leitor = Scanner(System.`in`)

    var paciente1 = Paciente()
    var paciente2 = Paciente()
    var paciente3 = Paciente()


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

}