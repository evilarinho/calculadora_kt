fun main() {
	calculadora(10.1, 20.1, "+")
    calculadora(200.1, 100.1, "-")
    calculadora(144.2, 10.0, "*")
    calculadora(20.0, 2.0, "/")
    calculadora(null, 20.1, "/")
    calculadora(10.1, 20.1, "$")    
}

fun calculadora(num1:Double?, num2:Double?, oper:String) {
    if ((num1 == null) || (num2 == null)) {
    	println("[ERRO]: Os numeros $num1 e $num2 não podem ser null")
    }else {
        var result = 0.0
        var resultUmaDecimal = ""
        var msgResult = ""        
            	    
    	when {
        	oper == "+" -> {
                result = num1 + num2
                resultUmaDecimal = String.format("%.1f", result)
                msgResult = "Resultado da soma de $num1+$num2: $resultUmaDecimal"
            }
            oper == "-" -> {
                result = num1 - num2
                resultUmaDecimal = String.format("%.1f", result)
                msgResult = "Resultado da subtração de $num1-$num2: $resultUmaDecimal"
            }
            oper == "*" -> {
                result = num1 * num2
                resultUmaDecimal = String.format("%.1f", result)
                msgResult = "Resultado da multiplicação de $num1*$num2: $resultUmaDecimal"
            }
            oper == "/" -> {
                result = num1 / num2
                resultUmaDecimal = String.format("%.1f", result)
                msgResult = "Resultado da divisão de $num1/$num2: $resultUmaDecimal"
            }
            else -> {
                println("Operação: $oper [INDEFINIDA]")
                println("Operações válidas: +, -, /, *")
            }
    	}
        println(msgResult)
    }  
}