package pl.projects.third;

import java.util.Scanner;

public class Museum {

    private int clientsInMuseum = 0;
    private int places;
    private int wishing;

    public Museum(int places, int wishing) throws Exception {
        if(places > wishing)
            throw new Exception("'Places <= Wishing' dla poprawnego działania programu");

        this.places = places;
        this.wishing = wishing;
    }

    public void controller() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String command;
        int number;

        System.out.println(
                "TO let people go to the museum type: 'in' and number of people\n" +
                        "TO let people out of the museum type: 'out' and numer of people"
        );
        while (true){
            command = scanner.nextLine();

            String[] afterSeparate = command.split(" ");
            if(afterSeparate.length > 2 || afterSeparate.length == 0) {
                System.out.println("Something wrong. Try again :/");
                continue;
            }
            else if(afterSeparate[0].equals("in")){
                number = Integer.parseInt(afterSeparate[1]);
                clientsIn(number);
            }
            else if(afterSeparate[0].equals("out")){
                number = Integer.parseInt(afterSeparate[1]);
                clientsOut(number);
            }
            else {
                System.out.println("Something wrong. Try again :/");
                continue;
            }

            statistic();
        }
    }

    public void clientsIn(int number) throws InterruptedException {
        if(clientsInMuseum == places){
            System.out.println("There is no space left :(");
            return;
        }

        for (int c = 0; c < number; c++){
            Clients client = new Clients(this);
            ClientIn clientIn = new ClientIn(client);
            Thread thread = new Thread(clientIn);
            thread.start();
            thread.join();

            if(clientsInMuseum == places){
                System.out.println("There is no space left :(");
                break;
            }
        }
    }

    public void clientsOut(int number) throws InterruptedException {
        if(clientsInMuseum == 0){
            System.out.println("There are no people in the museum.");
            return;
        }

        for (int c = 0; c < number; c++){
            Clients client = new Clients(this);
            ClientOut clientOut = new ClientOut(client);
            Thread thread = new Thread(clientOut);
            thread.start();
            thread.join();

            if(clientsInMuseum == 0){
                System.out.println("There are no people in the museum.");
                break;
            }
        }
    }

    private void statistic(){
        System.out.println("--- STAN ---");

        System.out.println("Space: " + places);
        System.out.println("Clients in the museum: " + clientsInMuseum);
        System.out.println("Clients outside: " + (wishing - clientsInMuseum));

        System.out.println("--- STAN ---");
    }

    public int getClientsInMuseum() {
        return clientsInMuseum;
    }

    public int getPlaces() {
        return places;
    }

    public int getWishing() {
        return wishing;
    }

    public void setClientsInMuseum(int clientsInMuseum) {
        this.clientsInMuseum = clientsInMuseum;
    }
}