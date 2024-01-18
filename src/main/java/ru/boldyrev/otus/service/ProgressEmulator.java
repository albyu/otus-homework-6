package ru.boldyrev.otus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.scheduling.annotation.Scheduled;
import ru.boldyrev.otus.model.ProgressEmulatorElement;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Iterator;

@Service
public class ProgressEmulator {
    private final LinkedList<ProgressEmulatorElement> orderQueue = new LinkedList<>();

    private final OrderService orderService;

    @Autowired
    @Lazy
    public ProgressEmulator(OrderService orderService){
        this.orderService = orderService;
    }

    public void addToList(ProgressEmulatorElement element){
        orderQueue.add(element);
    }

    @Scheduled(fixedRate = 2000)
    public void processQueue() {
        Iterator<ProgressEmulatorElement> iterator = orderQueue.iterator();
        while (iterator.hasNext()) {

            ProgressEmulatorElement element = iterator.next();

            if (element.getInsertTime().isBefore(LocalDateTime.now().minusSeconds(10))) {  /*Ждем 10с*/

                /*Переводим в статус COMPLETED*/
                orderService.finishProcessing(element.getOrderId());
                orderQueue.remove(element);
            }

            // Делаем что-то с элементом
            System.out.println(element);
        }



    }
}
