package ArrayLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        
        List<Persona> listaArray = new ArrayList<Persona> ();
        listaArray.add(new Persona(1,"Luisina",30));
        listaArray.add(new Persona(2,"Gabriel",30));
        listaArray.add(new Persona(3,"Ibra",9));
        listaArray.add(new Persona(4,"TodoCode",2));
        
        LinkedList<Persona> listaLinked = new LinkedList<Persona> ();
        listaLinked.add(new Persona(1,"Luisina",30));
        listaLinked.add(new Persona(2,"Gabriel",30));
        listaLinked.add(new Persona(3,"Ibra",9));
        listaLinked.add(new Persona(4,"TodoCode",2));
        
        //Empezamos con el metodo remove
        String nombreBorrar = "Gabriel";
        for (Persona persona2 : listaLinked){
            if (persona2.getNombre().equals(nombreBorrar)){
                listaLinked.remove(persona2);
                break; //Corto que deje de correr 
            }
        }
        
        System.out.println("----- Luego De Eliminar -----");
        //Recorrido por for each
        System.out.println("----- ArrayList -----");
           for (Persona persona:listaArray){
               System.out.println("Prueba " + persona.getNombre());           
           }
        
        System.out.println("----- LinkedList -----");
            for (Persona persona:listaLinked){
                System.out.println("Prueba " + persona.getNombre());
            }
            
        //Tamaño de la lista 
        System.out.println("----- Que tamaño tienen las listas? -----");
        System.out.println("ArrayList:" + listaArray.size());
        System.out.println("Linkedist: " + listaLinked.size());
        
        //Obtener primer objeto 
        System.out.println(" Primer y ultimo Objeto (Solo para linked list)");
        System.out.println("Primero de Linkedist: " +listaLinked.getFirst().toString());
        System.out.println("Ultimo de Linkedist: " +listaLinked.getLast().toString());
        
        //Borrar toda la lista 
        System.out.println("----- Borrando Lista ...... -----");
        listaArray.clear();
        listaLinked.clear();
        
        //Comprobar si esta vacía
        System.out.println("------ Esta vacía alguna lista ? -------");
        System.out.println("Arralist : " + listaArray.isEmpty());
        System.out.println("Linkedist : " + listaLinked.isEmpty());
    }
}






































