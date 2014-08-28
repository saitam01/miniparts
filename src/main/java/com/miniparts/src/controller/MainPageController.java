package com.miniparts.src.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import vo.MenuTiendaVO;
import vo.MenuVO;
import vo.SubMenuVO;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class MainPageController {

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
        return "index";
	}

    @RequestMapping(value = "get-menu", method = RequestMethod.POST)
    public @ResponseBody
    MenuTiendaVO getMenu() {

        List<SubMenuVO> otrosIngleses = new ArrayList<SubMenuVO>();
        otrosIngleses.add(new SubMenuVO("AUSTIN 1100"));
        otrosIngleses.add(new SubMenuVO("AUSTIN A40 / A55 / A60"));
        otrosIngleses.add(new SubMenuVO("AUSTIN ALLEGRO"));
        otrosIngleses.add(new SubMenuVO("AUSTIN MG"));
        otrosIngleses.add(new SubMenuVO("MGA - MGB"));
        otrosIngleses.add(new SubMenuVO("MORRIS MARINA"));
        otrosIngleses.add(new SubMenuVO("OTROS MORRIS"));

        MenuVO menuVO = new MenuVO(otrosIngleses);
        menuVO.setNombreMenu("OTROS INGLESES");

        List<SubMenuVO> accesorios = new ArrayList<SubMenuVO>();
        accesorios.add(new SubMenuVO("ADHESIVOS"));
        accesorios.add(new SubMenuVO("ARCOS DE RUEDA"));
        accesorios.add(new SubMenuVO("BUTACAS Y TAPICES"));
        accesorios.add(new SubMenuVO("ESPEJOS"));
        accesorios.add(new SubMenuVO("INSIGNIAS"));
        accesorios.add(new SubMenuVO("LLANTAS Y NEUMATICOS"));

        MenuVO menu2 = new MenuVO(accesorios);
        menu2.setNombreMenu("ACCESORIOS");

        List<MenuVO> menuVOList = new ArrayList<MenuVO>();
        menuVOList.add(menuVO);
        menuVOList.add(menu2);

        MenuTiendaVO menuTiendaVO = new MenuTiendaVO(menuVOList);

        return menuTiendaVO;
    }
}