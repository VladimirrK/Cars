package transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    Queue<Transport<?>> queueOfTransport;


    public ServiceStation(Queue<Transport<?>> queueOfTransport) {
        this.queueOfTransport = queueOfTransport;
    }

    public ServiceStation() {
        queueOfTransport = new LinkedList<>();
    }

    public void addTransportToQueue(Transport<?> auto) {
        if (auto == null) {
            System.out.println("Введите автомобиль");
        }
        queueOfTransport.add(auto);
    }
    public void carryOutAVehicleInspection(Transport<?> auto) throws TransportTypeException {
        while (queueOfTransport.isEmpty()) {
            if (auto.passDiagnostics()) {
                System.out.println("Проходим ТО");
                queueOfTransport.poll();
            }
        }
        System.out.println("Автобусы не проходят ТО");
    }
}
