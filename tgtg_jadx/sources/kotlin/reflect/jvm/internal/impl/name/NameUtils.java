package kotlin.reflect.jvm.internal.impl.name;

import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class NameUtils {

    @NotNull
    public static final NameUtils INSTANCE = new NameUtils();

    @NotNull
    private static final Regex SANITIZE_AS_JAVA_INVALID_CHARACTERS = new Regex("[^\\p{L}\\p{Digit}]");

    private NameUtils() {
    }

    @NotNull
    public static final Name contextReceiverName(int i11) {
        Name nameIdentifier = Name.identifier("_context_receiver_" + i11);
        nameIdentifier.getClass();
        return nameIdentifier;
    }

    @NotNull
    public static final String sanitizeAsJavaIdentifier(@NotNull String str) {
        str.getClass();
        return SANITIZE_AS_JAVA_INVALID_CHARACTERS.replace(str, "_");
    }
}
