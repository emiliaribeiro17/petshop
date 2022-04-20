package petshop.Controller;

	import java.util.ArrayList;

	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PostMapping;

import petshop.model.Veterinario;

	@Controller
	public class VeterinarioController {
		
		@GetMapping("/cadastroVeterinario")
		public String formCadastroVeterinario(Model model) {
			Veterinario veterinario = new Veterinario();
			model.addAttribute("veterinario", veterinario);
			return "veterinario";
		}
		
		@PostMapping("/cadastroVeterinario")
		public String recebeVeterinario(@ModelAttribute("veterinario") Veterinario veterinario, Model model) {
			
			ArrayList<Veterinario> lista = new ArrayList<>();
			
			lista.add(veterinario);
			
			model.addAttribute("lista", lista);
			return "relatorio";
		}	
		
		

	}

