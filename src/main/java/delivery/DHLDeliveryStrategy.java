package delivery;

import item.Item;
import lombok.Getter;
import lombok.Setter;
import java.util.LinkedList;
@Getter
@Setter
public class DHLDeliveryStrategy implements Delivery {
    private String name;
    private String description;

    public DHLDeliveryStrategy() {
        name = "DHL";
        description = "DHL";
    }
    @Override
    public void deliver(LinkedList<Item> items) {
        LinkedList<Item> toDelete;
        toDelete = items;
        items.removeAll(toDelete);
        System.out.println("delivered by DHL");
    }
}