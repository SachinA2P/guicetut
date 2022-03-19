import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceTester {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TextEditorModule());
        TextEditor textEditor = injector.getInstance(TextEditor.class);
        textEditor.callSpellChecker();

        BindingAnnotationTextEditor textEditorBindingAnnotations =
                injector.getInstance(BindingAnnotationTextEditor.class);

        textEditorBindingAnnotations.callSpellChecker();
    }
}
