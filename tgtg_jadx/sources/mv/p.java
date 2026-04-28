package mv;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p CONTROL1;
    public static final p TREATMENT1;

    @NotNull
    private final String variant;

    static {
        p pVar = new p("CONTROL1", 0, "control1");
        CONTROL1 = pVar;
        p pVar2 = new p("TREATMENT1", 1, "treatment1");
        TREATMENT1 = pVar2;
        p[] pVarArr = {pVar, pVar2};
        $VALUES = pVarArr;
        $ENTRIES = new a80.b(pVarArr);
    }

    public p(String str, int i11, String str2) {
        this.variant = str2;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }

    public final String a() {
        return this.variant;
    }
}
