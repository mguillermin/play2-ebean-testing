package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

/**
 * Company model
 */
@Entity
public class Company extends Model {
    @Id
    public Long id;
    
    public String name;

    public Company(String name) {
        this.name = name;
    }

    public static Finder<Long, Company> find = new Finder<Long, Company>(Long.class, Company.class);

    public static Company findById(Long id) {
        return find.byId(id);
    }

    public static int count() {
        return find.findRowCount();
    }

    public static List<Company> all() {
        return find.all();
    }

    public static void create(Company company) {
        company.save();
    }

    public static void delete(Long id) {
        find.ref(id).delete();
    }

}
