package mv;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o BASELINE;
    public static final o TREATMENT1;

    @NotNull
    private final String variant;

    static {
        o oVar = new o("BASELINE", 0, "baseline");
        BASELINE = oVar;
        o oVar2 = new o("TREATMENT1", 1, "treatment1");
        TREATMENT1 = oVar2;
        o[] oVarArr = {oVar, oVar2};
        $VALUES = oVarArr;
        $ENTRIES = new a80.b(oVarArr);
    }

    public o(String str, int i11, String str2) {
        this.variant = str2;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }

    public final String a() {
        return this.variant;
    }
}
