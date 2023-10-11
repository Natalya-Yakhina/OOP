package Seminar.Seminar2.Zadanie1;

import java.util.List;

public interface MarketBehaviour { // помещает и удаляет человека из очереди
    void acceptToMarket(Human human);

    void releaseFromMarket(List<Human> humans);

    void update();
}
