package controllers;

import java.util.*;

public class Sets{
   
    public Sets(){

    }
    
    public Set<String> contruirHashSet() {
        Set<String> palabras = new HashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Pera");
        palabras.add("Laptop");

        return palabras;
    }
    public Set<String> construirLinkedHashSet(){
        Set<String> palabrasLinkeadas = new HashSet<>();
        palabrasLinkeadas.add("Laptop");
        palabrasLinkeadas.add("Manzana");
        palabrasLinkeadas.add("Pera");
        palabrasLinkeadas.add("Celular");
        palabrasLinkeadas.add("Laptop");
        palabrasLinkeadas.add("Pera");
        palabrasLinkeadas.add("Laptop");

        return palabrasLinkeadas;
      

    }
    public Set<String> construirTreeHashSet(){
        Set<String> palabrasTree = new TreeSet<>();
        palabrasTree.add("Laptop");
        palabrasTree.add("Manzana");
        palabrasTree.add("Pera");
        palabrasTree.add("Celular");
        palabrasTree.add("Laptop");
        palabrasTree.add("Pera");
        palabrasTree.add("Laptop");

        

        return palabrasTree;

    }
    public Set<String> construrirTreeSetConComparador(){
        //CREAR UN COMPARADOR 
        Comparator<String> comparadorLongitud = new Comparator<String>() {// EN OTRO ARCHIVO DE COMPARADOR SE PONE AQUI POR LA LLAVES
            @Override
            public int compare(String s1, String s2) { // SE VA A SOBREESCRIBIR EL METODO COMPARAR
                //Primero Comparamos la Longitud 
                int resul= Integer.compare(s1.length(), s2.length());
                //Si tiene la misma Longitud Comparamos Alfabeticamente
                if (resul == 0) {
                    return s1.compareTo(s2);
                }
                return resul;
                    //return s1.compareTo(s2);
                   //return s1.length() - s2.length();

            }
            
        };
        Set<String> palabrasTreeSetConComparador = new TreeSet<>(comparadorLongitud );
        palabrasTreeSetConComparador.add("Laptop");
        palabrasTreeSetConComparador.add("Manzana");
        palabrasTreeSetConComparador.add("Pera");
        palabrasTreeSetConComparador.add("Celular");
        palabrasTreeSetConComparador.add("Laptop");
        palabrasTreeSetConComparador.add("Pera");
        palabrasTreeSetConComparador.add("Laptop");
        palabrasTreeSetConComparador.add("Celulas");

        return palabrasTreeSetConComparador;





    }
    public Set<String> construrirTreeSetConComparadorInverso(){
        //CREAR UN COMPARADOR 
        Comparator<String> comparadorInverso = new Comparator<String>() {// EN OTRO ARCHIVO DE COMPARADOR SE PONE AQUI POR LA LLAVES
            @Override
            public int compare(String s1, String s2) { // SE VA A SOBREESCRIBIR EL METODO COMPARAR
                //Primero Comparamos la Longitud 
                int resul= Integer.compare(s2.length(), s1.length());
                //Si tiene la misma Longitud Comparamos Alfabeticamente
                if (resul == 0) {
                    return s2.compareTo(s1);
                }
                return resul;
                    //return s1.compareTo(s2);
                   //return s1.length() - s2.length();

            }
            
        };
        Set<String> palabrasTreeSetConComparadorInverso = new TreeSet<>(comparadorInverso );
        palabrasTreeSetConComparadorInverso.add("Laptop");
        palabrasTreeSetConComparadorInverso.add("Manzana");
        palabrasTreeSetConComparadorInverso.add("Pera");
        palabrasTreeSetConComparadorInverso.add("Celular");
        palabrasTreeSetConComparadorInverso.add("Laptop");
        palabrasTreeSetConComparadorInverso.add("Pera");
        palabrasTreeSetConComparadorInverso.add("Laptop");
        palabrasTreeSetConComparadorInverso.add("Celulas");

        return palabrasTreeSetConComparadorInverso;





    }

}
    


