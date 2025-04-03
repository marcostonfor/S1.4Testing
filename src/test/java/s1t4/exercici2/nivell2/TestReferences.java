package s1t4.exercici2.nivell2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TestReferences {

    @Test
    public void sameReferenceTest() {
       String object = "hola, soy marcos.";
       String otherObject = object;
        assertThat(object).isSameAs(otherObject);
    }

    @Test
    public void notSameReferenceTest() {
        String object = new String("Hola, soy marcos!");
        String otherObject = new String("Hola, soy marcos!");
        assertThat(object).isNotSameAs(otherObject);
    }
}
