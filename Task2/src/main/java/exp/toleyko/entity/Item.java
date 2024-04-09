package exp.toleyko.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Item {
    private String name;
    private double cost;
}
