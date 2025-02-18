import br.ufpb.dcx.davi22nato.roupasProva.SistemaLojaRoupasPOO;
import br.ufpb.dcx.davi22nato.roupasProva.Tamanho;

import static org.junit.jupiter.api.Assertions.*;

public class SistemaLojaRoupasPOOTest {
    @Test
    public void TestaCadastroDeRoupa(){
        SistemaLojaRoupasPOO sistema = new SistemaLojaRoupasPOO();
        sistema.cadastraRoupa("333","Calça Jeans", Tamanho.M, 10);
        assertEquals("333", r.getCodigo());
        assertEquals(Tamanho.M, r.getTamanho());
    }
}
