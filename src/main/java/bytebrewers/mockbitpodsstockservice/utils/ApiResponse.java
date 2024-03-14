package bytebrewers.mockbitpodsstockservice.utils;

import bytebrewers.mockbitpodsstockservice.model.Stock;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse<T> {
    private String status;
    private String message;
    private List<Stock> data;
}


