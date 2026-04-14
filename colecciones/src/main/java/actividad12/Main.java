package actividad12;

public class Main {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        Contacto c1 = new ContactoPersonal("Juan", "111", "Juani");
        Contacto c2 = new ContactoProfesional("Ana", "222", "Google");
        Contacto c3 = new ContactoPersonal("Luis", "333", "Lui");

        agenda.addContacto(c1);
        agenda.addContacto(c2);
        agenda.addContacto(c3);

        System.out.println("LISTA DE CONTACTOS");
        agenda.mostrar();

        System.out.println("BUSCAR CONTACTO");
        Contacto buscado = agenda.buscar("Ana");

        if (buscado != null) {
            System.out.println(buscado.imprimir());
        } else {
            System.out.println("No encontrado");
        }

        System.out.println("ELIMINAR CONTACTO");
        agenda.eliminarContacto("Juan");

        agenda.mostrar();
        
    }
}