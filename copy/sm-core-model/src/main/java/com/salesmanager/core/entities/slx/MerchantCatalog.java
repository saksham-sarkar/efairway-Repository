/*
package com.salesmanager.core.entities.slx;

import com.salesmanager.core.model.generic.SalesManagerEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="MERCHANT_CATALOG")
@Cacheable(true)
public class MerchantCatalog extends SalesManagerEntity<Long, MerchantCatalog> {
    private static final long serialVersionUID = -6775679291833684524L;

    @Id
    @Column(name="S_NO",unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long sno;

    @Column(name = "MERCHANT_ID")
    @Getter
    @Setter
    private Long merchantId;

    @Getter
    @Setter
    @Column(name = "SKU", length = 32)
    private String sku;

    @Column(name = "CATEGORY_ID")
    @Getter
    @Setter
    private Long categoryId;

    @Column(name = "CREATED_BY", length = 32)
    @Getter
    @Setter
    private String createdBy;

    @Column(name = "CREATED_DATE", length = 32)
    @Getter
    @Setter
    private Date created_Date;

    @Column(name = "UPDATED_BY", length = 32)
    @Getter
    @Setter
    private Long updatedBy;

    @Column(name = "UPDATED_DATE", length = 32)
    @Getter
    @Setter
    private Date updatedDate;

    @Override
    public Long getId() {
        return null;
    }

    @Override
    public void setId(Long id) {

    }

    public static enum STATUS {
        ACTIVE(1),
        INACTIVE(2);

        private int statusId;
        STATUS(int _statusId){
            statusId = _statusId;
        }
        public int getStatusId() {
            return statusId;
        }
    }


}

*/
