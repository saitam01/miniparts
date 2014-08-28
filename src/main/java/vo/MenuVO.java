package vo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by maguirre on 20-08-14.
 */
public class MenuVO implements Serializable {

    public MenuVO() {
    }

    public MenuVO(List<SubMenuVO> subMenuVOList) {
        this.subMenuVOList = subMenuVOList;
    }

    private String nombreMenu;

    private List<SubMenuVO> subMenuVOList;

    public String getNombreMenu() {
        return nombreMenu;
    }

    public void setNombreMenu(String nombreMenu) {
        this.nombreMenu = nombreMenu;
    }

    public List<SubMenuVO> getSubMenuVOList() {
        return subMenuVOList;
    }

    public void setSubMenuVOList(List<SubMenuVO> subMenuVOList) {
        this.subMenuVOList = subMenuVOList;
    }
}
