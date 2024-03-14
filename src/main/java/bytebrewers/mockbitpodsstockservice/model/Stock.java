package bytebrewers.mockbitpodsstockservice.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Stock {
    private String symbol;
    private Company company;
    private double close;
    private double change;
    private double percent;
    private int volume;
}
