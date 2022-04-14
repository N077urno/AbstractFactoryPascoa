/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PP_Abstract_Factory_Pascoa;

/**
 *
 * @author IFGoiano
 */
public class Nestle extends AbstractFactoryPascoa {
    
    @Override    
    public OvoDePascoa CriarOvoDePascoa(char ovo){
        
       if(ovo == '1'){
           return new Alpino();
        }
       
       if(ovo == '2'){
           return new Classic();
       }
       
       
           return new KitKat();
       
    }
    
}
