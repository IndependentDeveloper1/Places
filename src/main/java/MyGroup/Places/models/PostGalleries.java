package MyGroup.Places.models;

import javax.persistence.*;

@Entity
@Table(name = "galleries")
public class PostGalleries {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String title;
    @Column
    private String full_text;
    @Column
    private String mapCode;
    @Column
    private String contacts;
    @Column
    private String img1;
    @Column
    private String img2;

    public PostGalleries() {
    }

    public PostGalleries(Long id, String title, String full_text, String mapCode,
                         String contacts, String img1, String img2) {
        this.id = id;
        this.title = title;
        this.full_text = full_text;
        this.mapCode = mapCode;
        this.contacts = contacts;
        this.img1 = img1;
        this.img2 = img2;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFull_text() {
        return full_text;
    }

    public void setFull_text(String full_text) {
        this.full_text = full_text;
    }

    public String getMapCode() {
        return mapCode;
    }

    public void setMapCode(String mapCode) {
        this.mapCode = mapCode;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }
}
