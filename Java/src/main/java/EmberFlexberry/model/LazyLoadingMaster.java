package EmberFlexberry.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import EmberFlexberry.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;

import java.util.List;

/**
 * Entity implementation class for Entity: LazyLoadingMaster
 */
@Entity(name = "EmberFlexberryLazyLoadingMaster")
@Table(schema = "public", name = "LazyLoadingMaster")
public class LazyLoadingMaster {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "MasterText")
    private String mastertext;

    @OneToMany(mappedBy = "lazyloadingmaster", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<LazyLoadingDetail> lazyloadingdetails;


    public LazyLoadingMaster() {
        super();
    }

    public void setPrimarykey(UUID primarykey) {
        this.primarykey = primarykey;
    }

    public UUID getPrimarykey() {
        return primarykey;
    }

    public String getMasterText() {
      return mastertext;
    }

    public void setMasterText(String mastertext) {
      this.mastertext = mastertext;
    }


}