fun main(arg: Array<String>){

    val operaciones= Operaciones(45, 1.75F, 0F)
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

        //se puede realizar por el metodo when de la siguiente manera

        when(imc){
            in 1..16 ->{
                return "Usted posee degaldez severa"
            }
            in 16.1..16.99 ->{
                return "Usted posee degaldez moderada"
            }
            in 17.0..18.0 ->{
                return "Usted posee degaldez aceptable"
            }
            in 18.1..24.99 ->{
                return "Usted posee un peso normal"
            }
            in 25.0 .. 29.99 -> {
                return  "Usted posee sobrepeso "
            }
            in 30.0 .. 34.99-> {
                return "Usted posee sobrepeso tipo 1"
            }
            in 35.0 .. 39.99 ->{
                return "Usted posee sobrepeso tipo 2"
            }
            in 40 .. 100->{
                return "Usted posee sobrepesotipo 3 "
            }
        }

        //En su defecto tambien se puede seralizar por el metodo if de una forma sencilla (para utilizar este metodo quitar los comentarios)


        /*
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
        */

        return ""
    }
}