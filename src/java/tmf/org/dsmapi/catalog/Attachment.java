package tmf.org.dsmapi.catalog;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 *
 * @author bahman.barzideh
 *
 * {
 *     "id": "22",
 *     "href": "http://serverlocation:port/documentManagment/attachment/22",
 *     "type": "Picture",
 *     "url": "http://xxxxx"
 * }
 *
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Embeddable
public class Attachment implements Serializable {
    public final static long serialVersionUID = 1L;

    @Column(name = "ID", nullable = true)
    private String id;

    @Column(name = "HREF", nullable = true)
    private String href;

    @Column(name = "TYPE", nullable = true)
    private String type;

    @Column(name = "URL", nullable = true)
    private String url;

    public Attachment() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public int hashCode() {
        int hash = 5;

        hash = 97 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 97 * hash + (this.href != null ? this.href.hashCode() : 0);
        hash = 97 * hash + (this.type != null ? this.type.hashCode() : 0);
        hash = 97 * hash + (this.url != null ? this.url.hashCode() : 0);

        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        final Attachment other = (Attachment) object;
        if (Utilities.areEqual(this.id, other.id) == false) {
            return false;
        }

        if (Utilities.areEqual(this.href, other.href) == false) {
            return false;
        }

        if (Utilities.areEqual(this.type, other.type) == false) {
            return false;
        }

        if (Utilities.areEqual(this.url, other.url) == false) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Attachment{" + "id=" + id + ", href=" + href + ", type=" + type + ", url=" + url + '}';
    }

    @JsonIgnore
    public boolean isValid() {
        return true;
    }

    public static Attachment createProto() {
        Attachment attachment = new Attachment();

        attachment.id = "id";
        attachment.href = "href";
        attachment.type = "type";
        attachment.url = "url";

        return attachment;
    }

}
