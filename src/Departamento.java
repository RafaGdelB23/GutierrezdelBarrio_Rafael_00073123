public class Departamento {

    private String nombreDto;

    public Departamento(String nombreDto){
        this.nombreDto = nombreDto;
    }

    public String getNombreDto() {
        return nombreDto;
    }

    public void setNombreDto(String nombreDto) {
        this.nombreDto = nombreDto;
    }

    @Override
    public String toString() {
        return "Departamento {" +
                "n ombreDto =' " + nombreDto + '\'' +
                '}';
    }
}
