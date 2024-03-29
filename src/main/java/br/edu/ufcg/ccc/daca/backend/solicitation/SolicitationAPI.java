package br.edu.ufcg.ccc.daca.backend.solicitation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/solicitation")
public class SolicitationAPI {

    private SolicitationService solicitationService;

    @Autowired
    public SolicitationAPI(SolicitationService solicitationService) {
        this.solicitationService = solicitationService;
    }


}
