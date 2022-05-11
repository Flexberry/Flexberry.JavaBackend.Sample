package EmberFlexberryDummy.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import EmberFlexberryDummy.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;

/**
 * Entity implementation class for Entity: TogglerExampleDetail
 */
@Entity(name = "EmberFlexberryDummyTogglerExampleDetail")
@Table(schema = "public", name = "TogglerExampleDetail")
public class TogglerExampleDetail {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "TogglerExampleDetailProperty")
    private String togglerexampledetailproperty;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "TogglerExampleMaster")
    @Convert("TogglerExampleMaster")
    @Column(name = "TogglerExampleMaster", length = 16, unique = true, nullable = false)
    private UUID _togglerexamplemasterid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "TogglerExampleMaster", insertable = false, updatable = false)
    private TogglerExampleMaster togglerexamplemaster;


    public TogglerExampleDetail() {
        super();
    }

    public void setPrimarykey(UUID primarykey) {
        this.primarykey = primarykey;
    }

    public UUID getPrimarykey() {
        return primarykey;
    }

    public String getTogglerExampleDetailProperty() {
      return togglerexampledetailproperty;
    }

    public void setTogglerExampleDetailProperty(String togglerexampledetailproperty) {
      this.togglerexampledetailproperty = togglerexampledetailproperty;
    }


}