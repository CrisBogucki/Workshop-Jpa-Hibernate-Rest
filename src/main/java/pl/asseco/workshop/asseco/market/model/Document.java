package pl.asseco.workshop.asseco.market.model;

import javax.persistence.*;

/**
 * Created by krzysztof.bogucki on 11 wrz 2017.
 */
@Entity
public class Document {

    private static final long serialVersionUID = 1L;

    public Document() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    private Integer CustomerId;

    @Column(name = "Title", nullable = false, precision = 50)
    private String Title;

    @Column(name = "Description", nullable = true, precision = 255)
    private String Description;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Integer customerId) {
        CustomerId = customerId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Document)) return false;

        Document document = (Document) o;

        if (Id != null ? !Id.equals(document.Id) : document.Id != null) return false;
        if (CustomerId != null ? !CustomerId.equals(document.CustomerId) : document.CustomerId != null) return false;
        if (Title != null ? !Title.equals(document.Title) : document.Title != null) return false;
        return Description != null ? Description.equals(document.Description) : document.Description == null;
    }

    @Override
    public int hashCode() {
        int result = Id != null ? Id.hashCode() : 0;
        result = 31 * result + (CustomerId != null ? CustomerId.hashCode() : 0);
        result = 31 * result + (Title != null ? Title.hashCode() : 0);
        result = 31 * result + (Description != null ? Description.hashCode() : 0);
        return result;
    }
}
