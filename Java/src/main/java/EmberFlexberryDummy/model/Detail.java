package EmberFlexberryDummy.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import EmberFlexberryDummy.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;

/**
 * Entity implementation class for Entity: Detail
 */
@Entity(name = "EmberFlexberryDummyDetail")
@Table(schema = "public", name = "Detail")
public class Detail {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "Name")
    private String name;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "ParentDetail")
    @Convert("ParentDetail")
    @Column(name = "ParentDetail", length = 16, unique = true, nullable = false)
    private UUID _parentdetailid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ParentDetail", insertable = false, updatable = false)
    private Detail parentdetail;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "Master")
    @Convert("Master")
    @Column(name = "Master", length = 16, unique = true, nullable = false)
    private UUID _masterid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "Master", insertable = false, updatable = false)
    private Master master;


    public Detail() {
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