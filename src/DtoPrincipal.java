import java.util.ArrayList;
import java.util.List;

public class DtoPrincipal implements Component{

    private int id;
    private String nombre;
    private List<Component> principal = new ArrayList<>();


    public DtoPrincipal(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Component> getPrincipal() {
        return principal;
    }

    public void setPrincipal(List<Component> principal) {
        this.principal = principal;
    }

    @Override
    public void addComponent(Component component) {
        principal.add(component);
    }

    @Override
    public void showList() {
        System.out.println("DTO PRINCIPAL");

        for (Component component : principal){
            System.out.println("Name: " + getNombre());
            System.out.println("ID: " + getId());
        }
    }

}
