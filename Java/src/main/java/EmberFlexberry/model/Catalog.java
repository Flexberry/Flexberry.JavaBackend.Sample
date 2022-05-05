package EmberFlexberry.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import EmberFlexberry.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import java.util.List;

/**
 * Entity implementation class for Entity: Catalog
 */
@Entity(name = "EmberFlexberryCatalog")
@Table(schema = "public", name = "Catalog")
public class Catalog {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "name")
    private String name;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "CatalogMaster")
    @Convert("CatalogMaster")
    @Column(name = "CatalogMaster", length = 16, unique = true, nullable = false)
    private UUID _catalogmasterid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "CatalogMaster", insertable = false, updatable = false)
    private CatalogMaster catalogmaster;

    @OneToMany(mappedBy = "catalog", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<listLocalization> listlocalizations;


    public Catalog() {
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


}