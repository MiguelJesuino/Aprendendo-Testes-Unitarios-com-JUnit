import com.testesunitarios.junit.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PessoaTest {
    @Test
    void DeveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000,1,1,15,0,0,0));
        Assertions.assertEquals(25, jessica.getIdade());
    }

}
