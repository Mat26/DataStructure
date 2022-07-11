
package Set;

import entity.Persona;
import java.util.Set;
import java.util.HashSet;

public class HashSetPersona {
    public static void main(String[] args) {
        Set<Persona> personas = new HashSet<>();
        personas.add(new Persona(1,"Felipe",22));
        personas.add(new Persona(1,"Laura",29));
        personas.add(new Persona(1,"Julian",24));
        personas.add(new Persona(1,"Melisa",21));
        personas.add(new Persona(1,"Sebastian",22));
        personas.add(new Persona(1,"Melisa",22));
        
        for(Persona per : personas){
            System.out.println(per.getNombre() + " " + per.getEdad());
        }
        
    }
}
