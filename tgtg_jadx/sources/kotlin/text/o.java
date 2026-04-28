package kotlin.text;

import java.io.Serializable;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final n f26618c = new n(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26620b;

    public o(String str, int i11) {
        str.getClass();
        this.f26619a = str;
        this.f26620b = i11;
    }

    private final Object readResolve() {
        Pattern patternCompile = Pattern.compile(this.f26619a, this.f26620b);
        patternCompile.getClass();
        return new Regex(patternCompile);
    }
}
