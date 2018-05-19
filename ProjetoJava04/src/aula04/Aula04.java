
package aula04;


public class Aula04 {

   
    public static void main(String[] args) {
      Caneta c1 = new Caneta("NIC", "Amarela", 0.5f);
      c1.status();
      Caneta c2 = new Caneta ( "BIC", "Azul", 0.3f);
      c2.status();
      
      //Acessando Modelo Privado
      //c1.setModelo("BIC");
          //c1.modelo = "Bic";
      //c1.setPonta(0.5f);
          //c1.ponta = 0.5f;
      
        //System.out.println("Tenho uma caneta:" + c1.getModelo());
        //System.out.println("A ponta da canela e:" + c1.getPonta());
        
    }
    
}
