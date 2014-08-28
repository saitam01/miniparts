package vo;

import java.io.Serializable;

/**
 * Created by maguirre on 20-08-14.
 */
public class SubMenuVO implements Serializable {

    public SubMenuVO() {
    }

    public SubMenuVO(String submenu) {
        this.submenu = submenu;
    }

    private String submenu;

    public String getSubmenu() {
        return submenu;
    }

    public void setSubmenu(String submenu) {
        this.submenu = submenu;
    }
}
