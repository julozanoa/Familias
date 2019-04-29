/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Familia {
    private String apellido;
    private Papá papá;
    private Mamá mamá;
    private Hijo[] hijos;

    public Familia(String apellido, Papá papá, Mamá mamá, Hijo[] hijo) {
        this.apellido = apellido;
        this.papá = new Papá();
        this.mamá = new Mamá();
        this.hijos = new Hijo[2];
    }

    
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Papá getPapá() {
        return papá;
    }

    public void setPapá(Papá papá) {
        this.papá = papá;
    }

    public Mamá getMamá() {
        return mamá;
    }

    public void setMamá(Mamá mamá) {
        this.mamá = mamá;
    }

    public Hijo[] getHijos() {
        return hijos;
    }

    public void setHijos(Hijo[] hijos) {
        this.hijos = hijos;
    }
    
    
    
    
}
