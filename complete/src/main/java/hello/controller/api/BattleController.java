package hello.controller.api;

import hello.controller.request.BattleRequest;
import hello.dto.response.Response;
import hello.model.Battle;
import hello.repository.BattleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Collection;

@RestController
@RequestMapping("/api/battle")
public class BattleController {

    @Autowired
    private BattleRepository battleRepository;

    @RequestMapping("/")
    public Response response(@RequestBody @Valid BattleRequest battleRequest) {
        return Response.ok().setPayload(getBattleByName(battleRequest));
    }

    private Collection<Battle> getBattleByName(BattleRequest battleRequest) {
//        return battleRepository.findAllByName(battleRequest.getName());
        return battleRepository.findAllByNameWithRecord(battleRequest.getName());
//        return battleRepository.getAllBattleWithRecord();
    }

    @RequestMapping("/add")
    public Response addBattle(@RequestBody @Valid BattleRequest battleRequest) {
        return Response.ok().setPayload(setBattle(battleRequest));
    }

    private Battle setBattle(BattleRequest battleRequest) {
        Battle battle = new Battle()
                .setId(battleRequest.getId())
                .setName(battleRequest.getName())
                .setDate(battleRequest.getDate())
                .setExp(battleRequest.getExp());
        return battleRepository.save(battle);
    }
}
