import java.util.ArrayList;
import java.util.List;

public class DtoSecundario implements Component{

    private int ID;
    private String name;
    private List<Component> secundario = new ArrayList<>();


    public DtoSecundario(int ID, String name){
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Component> getComponent() {
        return secundario;
    }

    public void setComponent(List<Component> component) {
        this.secundario = component;
    }

    @Override
    public void addComponent(Component component) {
        secundario.add(component);

    }

    @Override
    public void showList() {

        System.out.println("DTO SECUNDARIO");

        for (Component component : secundario){
            System.out.println("Name: " + name);
            System.out.println("ID: " + ID);
        }

    }

}
