package hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivroController {

    @RequestMapping(value= "/livro/{id}", method = RequestMethod.GET)
    public Livro buscaPorId(@PathVariable(value="id") Long id) {
        Livro livro = new Livro();

        livro.setId(id);
        livro.setAutor("José Autor de teste");
        livro.setTitulo("Um Livro de exemplo");
        livro.setPrefacio("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam lobortis eros nec mi tincidunt dignissim. In hac habitasse platea dictumst. Ut condimentum ornare ante quis lobortis. Vivamus blandit gravida tincidunt. Praesent maximus nisl dolor, et cursus neque euismod ut. Ut in sapien et massa tincidunt lacinia. Phasellus tincidunt semper ligula ut porta. Duis laoreet feugiat ipsum nec euismod. In facilisis ante vel massa lobortis congue. Maecenas egestas magna a eros feugiat, quis laoreet tortor viverra. Aenean at lobortis leo. Sed ultrices odio sed orci interdum eleifend. Nullam iaculis suscipit eros quis ullamcorper. Ut nec pulvinar tellus. Sed imperdiet sapien at semper vehicula.");
        
		return livro;
    }
}
