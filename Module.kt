package com.example.kotliny.TP5

class Module(val intitule: String,val siRegional: Boolean, val termine: Boolean, val nbHeures: Int) {
    
}

fun main(){
    val modules= mutableListOf<Module>()
    val module1=Module("bases de dev mobile",true,false,120)
    modules.add(module1)
    val module2=Module("programmer en kotlin",true,false,120)
    modules.add(module2)
    val module3=Module("composant android",false,false,90)
    modules.add(module3)
    val module4=Module("dev interfaces utilisateurs",false,false,90)
    modules.add(module4)
    val menu =modules.map { it.intitule }
    println(menu)


    modules.forEach { println("Module: $it") }
    modules.forEach { println("Module: ${it.intitule}") }

//    val numbers = listOf<Int>(8,6,7,5,3,0,9)
//    val nombrepaire=numbers.filter { it % 2 ==0 }
//    println(nombrepaire)

    val modulesRegionaux = modules.filter { it.siRegional == true }
    println(modulesRegionaux)
    val modulesRegionaux1 = modules.filter { it.siRegional == true }.map { it.intitule }
    println(modulesRegionaux1)

    val m =modules.groupBy { it.siRegional }
    println(m[true])
    println(m[false])

    val nbHeuresTotales = modules.fold(0) {nbTotal, module -> nbTotal + module.nbHeures}
    println(nbHeuresTotales)
    val listeTriee1 = modules.sortedBy { it.nbHeures }
    println(listeTriee1)
    val listeTriee2 = modules.sortedBy { it.intitule }
    println(listeTriee2)



}