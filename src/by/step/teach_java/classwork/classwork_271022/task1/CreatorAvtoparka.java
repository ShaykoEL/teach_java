
package by.step.teach_java.classwork.classwork_271022.task1;

public class CreatorAvtoparka {
    public static void main(String[] args) {
        Avtopark<ParkPlace> avtopark = new Avtopark<>();

        ParkPlace<Bike> bikePlace = new ParkPlace<>();
        Bike b1 = new Bike();
        bikePlace.setTransport(b1);

        ParkPlace<Avtomobil> avtomobilPlace = new ParkPlace<>();
        Avtomobil a1 = new Avtomobil();
        avtomobilPlace.setTransport(a1);

        avtopark.addTransport(bikePlace);
        avtopark.addTransport(avtomobilPlace);

        for (ParkPlace t: avtopark.getAvtotransport()
             ) {
            System.out.println(t.toString());
        }
    }
}
