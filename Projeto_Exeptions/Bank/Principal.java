package Bank;

/**
 * Principal
 */
public class Principal {

    public static void main(String[] args) {

     
                String s1 = new String("Ola"); 
                String s2 = new String("Ola");
                String s3 = s1;

                System.out.println(s1 == s2); //PRIMEIRA COMPARAÇÃO
                System.out.println(s1.equals(s2)); //SEGUNDA COMPARAÇÃO       
        
                System.out.println(s1 == s3); //TERCEIRA COMPARAÇÃO
            


   /* ContaCorrente cReinaldo = new ContaCorrente("Reinaldo", 2000);
    ContaCorrente cBruno = new ContaCorrente("Bruno", 3000); 
    ContaCorrente cMae = new ContaCorrente("Lurdes", 10000);  
      
    try {
        cReinaldo.Depositar(1000);
        cBruno.Depositar(1200);
        cReinaldo.Sacar(200);
        cBruno.Sacar(500);
        cMae.info();
        cReinaldo.info();
        cBruno.info();
        
        
    } catch (Exception e) {
        
        System.out.println("Ocorreu um erro.");
        System.out.println(e.getMessage());   
       
    }*/
   
    }
}