package utils;

import java.util.Comparator;
import models.Contacto;

public class ContactoComparadorConNumero implements Comparator<Contacto>{

    @Override
    public int compare(Contacto o1, Contacto o2) {
        // 1. Comparar apellidos ascendente
        int compApellido = o1.getApellido().compareToIgnoreCase(o2.getApellido());
        if (compApellido != 0) {
            return compApellido;
        }

        // 2. Comparar nombres ascendente
        int compNombre = o1.getNombre().compareToIgnoreCase(o2.getNombre());
        if (compNombre != 0) {
            return compNombre;
        }

        // 3. Comparar teléfonos descendente
        return o2.getTelefono().compareTo(o1.getTelefono());

        
    }
    
}
