package hello.controller.ui;

import hello.model.Battle;
import hello.repository.BattleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.List;

@Controller
public class DashboardController {

    private final BattleRepository battleRepository;

    @Autowired
    public DashboardController(BattleRepository battleRepository) {
        this.battleRepository = battleRepository;
    }

    @GetMapping("/Dashboard")
    public String dashboard(@RequestParam(value = "title", required = false, defaultValue = "BATTLE_TABLE") String title, Model model) {
        model.addAttribute("title", title);
        getAllBattles(model);
        return "index";
    }

    private void getAllBattles(Model model) {
        List<Battle> battles = battleRepository.getAllBattleWithRecord();
        Collections.reverse(battles);
        model.addAttribute("battles", battles);
    }
}
