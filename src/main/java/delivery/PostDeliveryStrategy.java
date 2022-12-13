package delivery;

import item.Item;
import lombok.Getter;
import lombok.Setter;
import java.util.LinkedList;
@Getter@Setter
public class PostDeliveryStrategy implements Delivery {
    private String name;
    private String description;
    public PostDeliveryStrategy() {
        name = "Post";
        description = "Post";
    }

    @Override
    public void deliver(LinkedList<Item> items) {
        LinkedList<Item> toDelete;
        toDelete = items;
        items.removeAll(toDelete);
        System.out.println("delivered by Post");
    }
}