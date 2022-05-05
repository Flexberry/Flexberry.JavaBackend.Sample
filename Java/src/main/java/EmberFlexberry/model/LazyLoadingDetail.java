package EmberFlexberry.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import EmberFlexberry.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;

/**
 * Entity implementation class for Entity: LazyLoadingDetail
 */
@Entity(name = "EmberFlexberryLazyLoadingDetail")
@Table(schema = "public", name = "LazyLoadingDetail")
public class LazyLoadingDetail {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "DetailText")
    private String detailtext;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "LazyLoadingMaster")
    @Convert("LazyLoadingMaster")
    @Column(name = "LazyLoadingMaster", length = 16, unique = true, nullable = false)
    private UUID _lazyloadingmasterid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "LazyLoadingMaster", insertable = false, updatable = false)
    private LazyLoadingMaster lazyloadingmaster;


    public LazyLoadingDetail() {
        super();
    }

    public void setPrimarykey(UUID primarykey) {
        this.primarykey = primarykey;
    }

    public UUID getPrimarykey() {
        return primarykey;
    }

    public String getDetailText() {
      return detailtext;
    }

    public void setDetailText(String detailtext) {
      this.detailtext = detailtext;
    }


}