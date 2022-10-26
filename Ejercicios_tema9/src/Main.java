public class Main {
    public static void main(String[] args) {
        Cliente cliente1=new Cliente();
        cliente1.setEdad(28);
        cliente1.setNombre("Miguel");
        cliente1.setTelefono("34-456452385");
        cliente1.setCredito(2350);
        System.out.println("El cliente 1 se llama "+cliente1.getNombre()+". Tiene "+cliente1.getEdad()+" años. Su número de teléfono es "+cliente1.getTelefono()+" y tiene un crédito en nuestro banco de "+cliente1.getCredito()+" euros");
        Trabajador trabajador1=new Trabajador();
        trabajador1.setEdad(34);
        trabajador1.setNombre("Manuel");
        trabajador1.setTelefono("34-658311278");
        trabajador1.setSalario(1760);
        System.out.println("El trabajador 1 se llama "+trabajador1.getNombre()+". Tiene "+trabajador1.getEdad()+" años. Su número de teléfono es "+trabajador1.getTelefono()+" y tiene un salario de "+trabajador1.getSalario()+" euros");
    }
}
class Persona{
    int edad;
    String nombre;
    String telefono;

    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
}
class Cliente extends Persona{
    int credito;

    public int getCredito(){
        return this.credito;
    }
    public void setCredito(int credito){
        this.credito=credito;
    }
}
class Trabajador extends Persona{
    int salario;

    public int getSalario(){
        return this.salario;
    }
    public void setSalario(int salario){
        this.salario=salario;
    }
}