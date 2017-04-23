package bean;

/**
 * Created by SKY on 2017-4-22.
 */

public class LevelThreeBean {

    private String title;
    private String desc;
    public Boolean isChecked = false;

    public LevelThreeBean(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
