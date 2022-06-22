package pl.projects.third;

public class ClientIn implements Runnable {

    private Clients clients;

    public ClientIn(Clients clients) {
        this.clients = clients;
    }

    @Override
    public void run() {
        clients.getMuseum().setClientsInMuseum(clients.getMuseum().getClientsInMuseum() + 1);
        System.out.println("In. Clients in museum now: " + clients.getMuseum().getClientsInMuseum());
    }
}
