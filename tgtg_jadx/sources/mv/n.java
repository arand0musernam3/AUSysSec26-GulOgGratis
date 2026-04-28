package mv;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n BASELINE;
    public static final n TREATMENT;

    @NotNull
    private final String variant;

    static {
        n nVar = new n("BASELINE", 0, "baseline");
        BASELINE = nVar;
        n nVar2 = new n("TREATMENT", 1, "treatment");
        TREATMENT = nVar2;
        n[] nVarArr = {nVar, nVar2};
        $VALUES = nVarArr;
        $ENTRIES = new a80.b(nVarArr);
    }

    public n(String str, int i11, String str2) {
        this.variant = str2;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    public final String a() {
        return this.variant;
    }
}
