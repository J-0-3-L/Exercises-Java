package ProyectClass;

class Projec {
    private String nombre;
    private String descripcion;
    private double initialCost;

    public Projec() { 
    }
    public Projec(String nombre) { 
        this.nombre=nombre;
    }

    public Projec(String nombre, String descripcion) { 
        this.nombre=nombre;
        this.descripcion=descripcion;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public double getCost(){
        return initialCost;
    }
    public void setCost(double initialCost){
        this.initialCost=initialCost;
    }

    
    public String elevatorPitch() {
        return "Pagina web: "+nombre +("\nCosto: "+ initialCost) + "\nDescripcion: "+descripcion;
    }
}

