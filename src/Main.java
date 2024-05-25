public class Main {

    public static void main(String[] args) {


        Departamento departamento = new Departamento("DTO PRINCIPAL");

        Component e1 = new DtoPrincipal(1, "Rafael Gutierrez");
        Component e2 = new DtoPrincipal(2, "Javier Caceres");
        Component e3 = new DtoPrincipal(3, "Luis Merino");

        Component eA = new DtoSecundario(1, "Andres Miranda");
        Component eB = new DtoSecundario(2, "Carlos Chavez");
        Component eC = new DtoSecundario(3, "Gerardo Lopez");

        System.out.println("-------------------------------------------------");
        e1.addComponent(e1);
        e2.addComponent(e2);
        e3.addComponent(e3);
        e1.showList();
        e2.showList();
        e3.showList();
        System.out.println("-------------------------------------------------");
        eA.addComponent(eA);
        eB.addComponent(eB);
        eC.addComponent(eC);
        eA.showList();
        eB.showList();
        eC.showList();
        System.out.println("-------------------------------------------------");

    }

}
