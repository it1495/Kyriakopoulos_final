/**
 * Created by user on 27/1/2017.
 */

public class Merchant {

    private String id;
    private String legalName;
    private String category;
    private String address;
    private String review;


    public Merchant(){

    }

    public Merchant(String id,String legalName,String category,String address,String review){
        this.id = id;
        this.address = address;
        this.category=category;
        this.legalName = legalName;
        this.review = review;


    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getReview() {
        return review;
    }
}

