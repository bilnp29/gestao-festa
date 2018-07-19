package com.mirandanet.festas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mirandanet.festas.model.Convidado;
import com.mirandanet.festas.repository.Convidados;

@Controller
@RequestMapping("/convidados")
public class ConvidadosController {
	@Autowired
	private Convidados convidados;

	@RequestMapping
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("ListaConvidados");
		mv.addObject(new Convidado());
		mv.addObject("convidados", convidados.todos());	
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String salva(Convidado convidado) {
		this.convidados.adicionar(convidado);
		return "redirect:/convidados";
	}
}
