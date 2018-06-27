package hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PagamentoController {

    
    @PostMapping(value= "/publico/v1/pagamento", consumes="application/json", produces="application/json")
    public ResponseEntity efetuarPagamento(@RequestBody Pagamento pagamento) {
    	
    	RestTemplate restTemplate = new RestTemplate();
		TokenValidationResponse tokenValidationResponse = restTemplate.getForObject("http://localhost:8444/publico/v1/login/1234567890123123123", TokenValidationResponse.class);
		if (tokenValidationResponse != null && tokenValidationResponse.getValido()) {
			System.out.println(tokenValidationResponse);
			return ResponseEntity.ok("{\"result\" : \"Pagamento efetuado com sucesso!\"}");			
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    	
    }
    
}
