package students.tatjana_topcilina.lesson_14.level_1_2;

public class AppleLightWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {

        return apple.getWeight() < 150;
    }
}
