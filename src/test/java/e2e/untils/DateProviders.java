package e2e.untils;

import com.github.javafaker.Faker;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DateProviders {
    Faker faker = new Faker();

    @DataProvider
    public Iterator<Object[]> invalidEmail() {
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{faker.internet().uuid(), faker.internet().password()});
        return list.iterator();
    }
}