package fr.maxencepersello.trainstation.presentation.wagon;

import fr.maxencepersello.trainstation.application.wagon.WagonService;
import fr.maxencepersello.trainstation.domain.wagon.Wagon;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/wagons")
public class WagonController {
    private final WagonService wagonService;

    public WagonController(WagonService wagonService) {
        this.wagonService = wagonService;
    }

    @GetMapping
    public List<Wagon> getAllWagons() {
        return wagonService.getAllWagons();
    }
}
