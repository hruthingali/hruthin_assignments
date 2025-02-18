class GroovyOperatorsExample1 {  
    static void main(String[] args) {  
        String Answer  
        String s = 'javatpoint'  

        Answer = s ? 'Found' : 'Not Found'  
        println Answer  // ? Corrected

        Answer = s ?: 'Found'  
        println Answer  // ? Corrected
    }  
}
