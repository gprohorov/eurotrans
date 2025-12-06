package edu.eurotrans.openfeign.client;

import edu.eurotrans.openfeign.model.ExchangeRateDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name ="exchangeApi", url = "https://api.exchangerate.host")
public interface ExchangeRateClient {

    @GetMapping("/convert")
    ExchangeRateDTO fetchExchangeRates(@RequestParam(value = "from") String from,
                                       @RequestParam(value = "to") String to);
}
