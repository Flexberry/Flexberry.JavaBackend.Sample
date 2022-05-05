package EmberFlexberry.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import EmberFlexberry.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;

import java.util.List;

/**
 * Entity implementation class for Entity: TogglerExampleMaster
 */
@Entity(name = "EmberFlexberryTogglerExampleMaster")
@Table(schema = "public", name = "TogglerExampleMaster")
public class TogglerExampleMaster {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "TogglerExampleMasterProperty")
    private String togglerexamplemasterproperty;

    @OneToMany(mappedBy = "togglerexamplemaster", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<TogglerExampleDetail> togglerexampledetails;


    public TogglerExampleMaster() {
        super();
    }

    public void setPrimarykey(UUID primarykey) {
        this.primarykey = primarykey;
    }

    public UUID getPrimarykey() {
        return primarykey;
    }

    public String getTogglerExampleMasterProperty() {
      return togglerexamplemasterproperty;
    }

    public void setTogglerExampleMasterProperty(String togglerexamplemasterproperty) {
      this.togglerexamplemasterproperty = togglerexamplemasterproperty;
    }


}