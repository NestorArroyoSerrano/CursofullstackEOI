package entidades;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Empleado> empleados = new ArrayList<>();

    public void contratarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void eliminarEmpleadoPorPosicion(int posicion) {
        if (posicion >= 0 && posicion < empleados.size()) {
            empleados.remove(posicion);
        }
    }

    public void eliminarEmpleadoPorNombre(String nombre) {
        empleados.removeIf(empleado -> empleado.getNombre().equals(nombre));
    }

    public List<Empleado> obtenerEmpleados() {
        return empleados;
    }
}