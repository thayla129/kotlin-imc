package br.senai.sp.jandira.imc.model

class Medico {

    var nome: String = ""
    var especialidades: ArrayList<String> = ArrayList()
    var crm: String = ""
    var telefone: String = ""

    fun mostrarFichaDoMedico(){
        println ("-------------------------------------")
        println ("--FICHA--DO--MEDICO------------------")
        println ("+-----------------------+------------")
        println ("NOME: $nome                          ")
        println("CRM: $crm                             ")
        println ("TELEFONE: $telefone                  ")
        println ("ESPECIALIDADES: $especialidades      ")
        for (especialidades in especialidades){
            println(" $especialidades")
        }
        println ("+-----------------------+------------")
    }

}