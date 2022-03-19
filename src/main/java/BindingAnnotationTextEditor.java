import javax.inject.Inject;

public class BindingAnnotationTextEditor {
    private SpellChecker spellCheckerOne;
    private SpellChecker spellCheckerTwo;

    @Inject
    public BindingAnnotationTextEditor(@WinWord SpellChecker spellCheckerOne, SpellChecker spellCheckerTwo) {
        this.spellCheckerOne = spellCheckerOne;
        this.spellCheckerTwo = spellCheckerTwo;
    }

    public void callSpellChecker() {
        System.out.print("Spell Checker One: ");
        spellCheckerOne.checkSpelling();

        System.out.print("Spell Checker Two: ");
        spellCheckerTwo.checkSpelling();
    }
}
