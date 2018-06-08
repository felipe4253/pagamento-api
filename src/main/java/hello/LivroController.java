package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivroController {

    @GetMapping(value= "/publico/v1/livro/{id}")
    public Livro buscaPorId(@PathVariable(value="id") Long id) {
        Livro livro = new Livro();

        livro.setId(id);
        livro.setAutor("José Autor de teste " + id);
        livro.setTitulo("Um Livro de exemplo com o id " + id);
        livro.setPrefacio("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam lobortis eros nec mi tincidunt dignissim.");
        
		return livro;
    }
    
    @PostMapping(value= "/publico/v1/livro/{isbn}/comentario")
    public String postarComentario(@PathVariable(value="isbn") String isbn, @RequestBody Comentario comentario) {
    	
    	return "Comentário registrado.";
    }
}
