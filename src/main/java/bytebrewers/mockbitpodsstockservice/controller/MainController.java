package bytebrewers.mockbitpodsstockservice.controller;

import bytebrewers.mockbitpodsstockservice.model.Company;
import bytebrewers.mockbitpodsstockservice.model.Stock;
import bytebrewers.mockbitpodsstockservice.utils.ApiResponse;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/api/stocks")
public class MainController {
    @GetMapping
    public ResponseEntity<?> getTrendingStocks() {
        List<Stock> stocks = generateRandomStockData();
        ApiResponse<List<Stock>> apiResponse = new ApiResponse<>("success", "Trending stocks retrieved successfully", stocks);
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

    private List<Stock> generateRandomStockData() {
        List<Stock> stocks = new ArrayList<>();
        stocks.add(generateRandomStock("GOTO", "GoTo Gojek Tokopedia Tbk.", "https://s3.goapi.id/logo/GOTO.jpg"));
        stocks.add(generateRandomStock("BBCA", "BCA .", "https://s3.goapi.id/logo/TLKM.jpg"));
        stocks.add(generateRandomStock("TLKM", "Telekomunikasi Indonesia Tbk.", "https://s3.goapi.id/logo/TLKM.jpg"));
        stocks.add(generateRandomStock("UNVR", "Unilever Indonesia Tbk.", "https://s3.goapi.id/logo/UNVR.jpg"));
        stocks.add(generateRandomStock("BBRI", "Bank Rakyat Indonesia Tbk.", "https://s3.goapi.id/logo/BBRI.jpg"));
        stocks.add(generateRandomStock("BMRI", "Bank Mandiri Tbk.", "https://s3.goapi.id/logo/BMRI.jpg"));
        stocks.add(generateRandomStock("INDF", "Indofood Sukses Makmur Tbk.", "https://s3.goapi.id/logo/INDF.jpg"));
        stocks.add(generateRandomStock("EXCL", "XL Axiata Tbk.", "https://s3.goapi.id/logo/EXCL.jpg"));
        stocks.add(generateRandomStock("ACES", "Astra International Tbk.", "https://s3.goapi.id/logo/ACES.jpg"));
        stocks.add(generateRandomStock("ADRO", "Adaro Energy Tbk.", "https://s3.goapi.id/logo/ADRO.jpg"));
        stocks.add(generateRandomStock("PGAS", "Perusahaan Gas Negara Tbk.", "https://s3.goapi.id/logo/PGAS.jpg"));
        stocks.add(generateRandomStock("INDY", "Indika Energy Tbk.", "https://s3.goapi.id/logo/INDY.jpg"));
        stocks.add(generateRandomStock("ANTM", "Aneka Tambang Tbk.", "https://s3.goapi.id/logo/ANTM.jpg"));
        stocks.add(generateRandomStock("SCMA", "MNC Sky Vision Tbk.", "https://s3.goapi.id/logo/SCMA.jpg"));
        stocks.add(generateRandomStock("EXCL", "Excelsior Capital Ltd.", "https://s3.goapi.id/logo/EXCL.jpg"));
        stocks.add(generateRandomStock("WSKT", "Waskita Karya Tbk.", "https://s3.goapi.id/logo/WSKT.jpg"));
        stocks.add(generateRandomStock("WIKA", "Wijaya Karya Tbk.", "https://s3.goapi.id/logo/WIKA.jpg"));



        // Add more stocks as needed

        return stocks;
    }

    private Stock generateRandomStock(String symbol, String companyName, String companyLogo) {
        Random random = new Random();

        // Generate random integers for close, change, and percent
        int close = random.nextInt(51) + 50; // Random close value between 50 and 100
        int change = random.nextInt(6); // Random change value between 0 and 5
        int percent = random.nextInt(6); // Random percent value between 0 and 5
        // randomize volume
        int volume = random.nextInt(1000000) + 1000000;

        Company company = new Company();
        company.setName(companyName);
        company.setLogo(companyLogo);

        Stock stock = new Stock();
        stock.setSymbol(symbol);
        stock.setCompany(company);
        stock.setClose(close);
        stock.setChange(change);
        stock.setPercent(percent);
        stock.setVolume(volume);

        return stock;
    }

}
