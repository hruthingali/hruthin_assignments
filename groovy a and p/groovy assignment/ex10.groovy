class GroovyOperatorsExample10 {  
      
    static void main(args) {  
        int a = 0b00101111  
        println "a = 0b00101111 ----> "+a   
        int b = 0b000010101  
        println "b = 0b000010101 ----> "+b   
        println "(a & a) ----> "+(a & a)   
        println "(a & b) ----> "+(a & b)   
        println "(a | a) ----> "+(a | a)   
        println "(a | a) ----> "+(a | b)   
          
        int c = 0b11111111  
        println "c = 0b11111111"  
        println "((a ^ a) & c) ----> "+((a ^ a) & c)   
        println "((a ^ b) & c) ----> "+((a ^ b) & c)   
        println "((~a) & c) ----> "+((~a) & c)      
    }  
}  