package students.tatjana_topcilina.lesson_14.level_1_2;

public class AppleRedColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {

        return "red".equals(apple.getColor());
    }
}
