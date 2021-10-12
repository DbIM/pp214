package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Wood3 {

    @Autowired
    private final Rabbit4 rabbit;

    @Override
    public String toString() {
        return ", на дереве заяц " + rabbit.toString();
    }

    public Wood3(Rabbit4 rabbit) {
        this.rabbit = rabbit;
    }
}
