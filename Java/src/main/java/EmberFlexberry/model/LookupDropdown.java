package EmberFlexberry.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import EmberFlexberry.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;

/**
 * Entity implementation class for Entity: LookupDropdown
 */
@Entity(name = "EmberFlexberryLookupDropdown")
@Table(schema = "public", name = "LookupDropdown")
public class LookupDropdown {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "Name")
    private String name;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "MasterLookupDropdown")
    @Convert("MasterLookupDropdown")
    @Column(name = "MasterLookupDropdown", length = 16, unique = true, nullable = false)
    private UUID _masterlookupdropdownid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "MasterLookupDropdown", insertable = false, updatable = false)
    private MasterLookupDropdown masterlookupdropdown;


    public LookupDropdown() {
        super();
    }

    public void setPrimarykey(UUID primarykey) {
        this.primarykey = primarykey;
    }

    public UUID getPrimarykey() {
        return primarykey;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }


}