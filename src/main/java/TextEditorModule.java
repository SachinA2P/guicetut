import com.google.inject.AbstractModule;

public class TextEditorModule extends AbstractModule {
    @Override
    public void configure() {
        bind(SpellChecker.class).to(SpellCheckerImpl.class);
        bind(SpellCheckerImpl.class).to(WinWordSpellCheckerImpl.class);
        bind(SpellChecker.class).annotatedWith(WinWord.class).to(WinWordBindingAnnotationSpellCheckerImpl.class);
    }
}
