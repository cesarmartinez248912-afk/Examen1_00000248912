package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioAlumnos {
    private final List<Alumno> alumnos;

    public RepositorioAlumnos() {
        alumnos = new ArrayList<>();
        alumnos.add(new Alumno("0001", "Ana López", 3, 5));
        alumnos.add(new Alumno("0002", "Carlos Ruiz", 4, 6));
        alumnos.add(new Alumno("0003", "María Torres", 1, 4));
        alumnos.add(new Alumno("0004", "Luis Pérez", 5, 6));
        alumnos.add(new Alumno("0005", "Sofía Ramírez", 2, 5));
    }

    public List<Alumno> buscarPorId(String fragmento) {
        return alumnos.stream()
                .filter(a -> a.getId().startsWith(fragmento))
                .collect(Collectors.toList());
    }
}
