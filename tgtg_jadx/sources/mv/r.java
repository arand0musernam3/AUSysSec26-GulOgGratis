package mv;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r CONTROL;
    public static final r TREATMENT;

    @NotNull
    private final String variant;

    static {
        r rVar = new r("CONTROL", 0, "control");
        CONTROL = rVar;
        r rVar2 = new r("TREATMENT", 1, "treatment");
        TREATMENT = rVar2;
        r[] rVarArr = {rVar, rVar2};
        $VALUES = rVarArr;
        $ENTRIES = new a80.b(rVarArr);
    }

    public r(String str, int i11, String str2) {
        this.variant = str2;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }

    public final String a() {
        return this.variant;
    }
}
