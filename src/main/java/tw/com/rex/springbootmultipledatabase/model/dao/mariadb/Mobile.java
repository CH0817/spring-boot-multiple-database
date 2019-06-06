package tw.com.rex.springbootmultipledatabase.model.dao.mariadb;

public class Mobile {
    private Integer id;

    private String mobile;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}