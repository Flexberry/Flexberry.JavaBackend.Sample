package EmberFlexberryDummy.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import EmberFlexberryDummy.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;

/**
 * Entity implementation class for Entity: listLocalization
 */
@Entity(name = "EmberFlexberryDummylistLocalization")
@Table(schema = "public", name = "listLocalization")
public class listLocalization {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "name")
    private String name;

    @Column(name = "localeValue")
    private String localevalue;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "Catalog")
    @Convert("Catalog")
    @Column(name = "Catalog", length = 16, unique = true, nullable = false)
    private UUID _catalogid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "Catalog", insertable = false, updatable = false)
    private Catalog catalog;


    public listLocalization() {
        super();
    }

    public void setPrimarykey(UUID primarykey) {
        this.primarykey = primarykey;
    }

    public UUID getPrimarykey() {
        return primarykey;
    }

    public String getname() {
      return name;
    }

    public void setname(String name) {
      this.name = name;
    }

    public String getlocaleValue() {
      return localevalue;
    }

    public void setlocaleValue(String localevalue) {
      this.localevalue = localevalue;
    }


}