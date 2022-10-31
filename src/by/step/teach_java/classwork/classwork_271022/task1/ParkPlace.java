package by.step.teach_java.classwork.classwork_271022.task1;

import java.security.PublicKey;

public class ParkPlace <E> {
    private E transport;

    public void setTransport(E transport) {
        this.transport = transport;
    }
    @Override
    public String toString() {
        return "Transport{" +
                "transport=" + transport.toString() +
                '}';
    }
}
