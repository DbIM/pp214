package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {

    @Autowired
    private final Death8 death;

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + death.toString();
    }

    public Needle7(Death8 death) {
        this.death = death;
    }
}
