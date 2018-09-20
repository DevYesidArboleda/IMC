fun main(arg: Array<String>){

    val operaciones= Operaciones(75, 1.75F, 0F)
    println(operaciones.calcular())
    println(operaciones.Imprirmir())

}

class Operaciones(val peso :Int, val altura :Float, var imc : Float){

    fun calcular()
    : Float {
        imc=this.peso/(this.altura* this.altura)
        return this.imc
    }
    fun Imprirmir():String{
        if (imc<=16){
            return "Usted posee degaldez severa"
        }
        if (imc>=16.1 && imc<=16.99){
            return "Usted posee delgadez moderada"
        }
        if (imc>=17 && imc<=18.00){
            return "Usted posee delgadez aceptable"
        }
        if (imc>=18.5 && imc<=24.99){
            return "Usted posee un peso normal"
        }
        if (imc>=25 && imc<=29.99){
            return "Usted posee sobrepeso"
        }
        if (imc>=30 && imc<=34.99){
            return "Usted posee sobrepeso Tipo 1"
        }
        if (imc>=35 && imc<=39.99){
            return "Usted posee sobrepeso Tipo 2"
        }
        if (imc>=40){
            return "Usted posee sobrepeso Tipo 3"
        }

        return ""
    }
}