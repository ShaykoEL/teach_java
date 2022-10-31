package by.step.teach_java.classwork.classwork_271022.task1;

import java.util.ArrayList;
import java.util.List;

public class Avtopark <E> {
    List<E> avtotransport;
    public Avtopark () {
        this.avtotransport = new ArrayList<>();
    }

    public void addTransport(E transport) {
       avtotransport.add(transport);
    }

    public List<E> getAvtotransport() {
        return avtotransport;
    }
}
