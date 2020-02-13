package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

//import java.util.Arrays;
//import java.util.List;

public class DiscountApplierTest {
    @Test
    void Home() {
        Product home = new Product("h", 100.0, "HOME");
        Product business = new Product("b", 100.0, "BUSINESS");
        ProductDao dao = Mockito.mock(ProductDao.class);

        List<Product> results = Arrays.asList(home, business);
        Mockito.when(dao.all()).thenReturn(results);

        DiscountApplier discount = new DiscountApplier(dao);
        discount.setNewPrices();
        List<Product> result = dao.all();

        Assertions.assertEquals("h", result.get(0).getName());
        Assertions.assertEquals("HOME", result.get(0).getCategory());
        Assertions.assertEquals(90.0, result.get(0).getPrice(),0.0000000000001);
    }

    @Test
    void Business() {
        Product home = new Product("h", 100.0, "HOME");
        Product business = new Product("b", 100.0, "BUSINESS");
        ProductDao dao = Mockito.mock(ProductDao.class);

        List<Product> results = Arrays.asList(home, business);
        Mockito.when(dao.all()).thenReturn(results);

        DiscountApplier discount = new DiscountApplier(dao);
        discount.setNewPrices();
        List<Product> result = dao.all();

        Assertions.assertEquals("b", result.get(1).getName());
        Assertions.assertEquals("BUSINESS", result.get(1).getCategory());
        Assertions.assertEquals(110.0, result.get(1).getPrice(),0.0000000000001);
    }
}
