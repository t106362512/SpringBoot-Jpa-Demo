package model;

import hello.config.DaoConfig;
import hello.model.Battle;
import hello.repository.BattleRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.assertEquals;

//@RunWith(SpringJUnit4ClassRunner.class)
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = DaoConfig.class)
//@SpringBootTest
//@AutoConfigureDataJpa
//@AutoConfigureTestDatabase
//@AutoConfigureTestEntityManager
//@Transactional
@DataJpaTest
//@ExtendWith(SpringExtension.class)
public class BattleTest {

    @Autowired(required = false)
    private Battle battle;

    @Autowired(required = false)
    private BattleRepository battleRepository;


    private final String id = "B333";
    private final String name = "TEST_BATTLE";
    private final Date date = new Date();
    private final Integer exp = (int) (Math.random() * (9999 - 20 + 1));

    @Before
    public void init() throws Exception {

        battle = new Battle()
                .setId(id)
                .setName(name)
                .setDate(date)
                .setExp(exp);
        battleRepository.save(battle);
    }

    @Test
    public void whenFindById_thenReturnBattle() {
        Battle battle = battleRepository.findAllById(id);
        assertEquals(id, battle);
    }

    @Test
    public void whenFindByName_thenReturnBattle() {
        Battle battle = battleRepository.findByName(name);
        assertEquals(name, battle.getName());
    }

    @Test
    public void whenFindByDate_thenReturnBattle() {
        Battle battle = battleRepository.findByDate(date);
        assertEquals(date, battle.getDate());
    }

    @Test
    public void whenFindByExp_thenReturnBattle() {
        Battle battle = battleRepository.findByExp(exp);
        assertEquals(exp, battle.getExp());
    }

}