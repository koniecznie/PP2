package pl.projects.third;

public class ClientOut implements Runnable {

    private Clients clients;

    public ClientOut(Clients clients) {
        this.clients = clients;
    }

    @Override
    public void run() {
        clients.getMuseum().setClientsInMuseum(clients.getMuseum().getClientsInMuseum() - 1);
        System.out.println("Out. Clients in museum now: " + clients.getMuseum().getClientsInMuseum());
    }
}
