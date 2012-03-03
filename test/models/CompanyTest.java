package models;

import org.fest.assertions.Assertions;
import org.junit.Test;

/**
 * Company model testing
 */
public class CompanyTest extends BaseModelTest {

    @Test
    public void createTest() {
        Company company = new Company("My Company");
        Company.create(company);

        Assertions.assertThat(company.id).isNotNull();
    }

    @Test
    public void countTest() {
        Assertions.assertThat(Company.count()).isEqualTo(0);
        
        Company company = new Company("My Company");
        Company.create(company);

        Assertions.assertThat(Company.count()).isEqualTo(1);
    }

}
