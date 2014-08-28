package vo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by maguirre on 20-08-14.
 */
public class MenuTiendaVO implements Serializable {

    public MenuTiendaVO() {
    }

    public MenuTiendaVO(List<MenuVO> menuVOList) {
        this.menuVOList = menuVOList;
    }

    private List<MenuVO> menuVOList;

    public List<MenuVO> getMenuVOList() {
        return menuVOList;
    }

    public void setMenuVOList(List<MenuVO> menuVOList) {
        this.menuVOList = menuVOList;
    }
}
