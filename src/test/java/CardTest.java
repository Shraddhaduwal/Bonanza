import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class CardTest {
    @Test
    public void testCard() {
        Beanometer beanometer = new Beanometer(Map.of(4, 1, 6, 2, 8, 3, 10, 4));
        BeanType beanType = new BeanType("Blue Bean", beanometer);
        Card card = new Card(beanType);

        assertEquals(beanType, card.getBeanType());
        assertFalse(card.isCoin());

        card.setCoin(true);
        assertTrue(card.isCoin());
    }
}
