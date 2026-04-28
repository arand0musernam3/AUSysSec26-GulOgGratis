package mv;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j BASELINE;
    public static final j TREATMENT;

    @NotNull
    private final String variant;

    static {
        j jVar = new j("BASELINE", 0, "baseline");
        BASELINE = jVar;
        j jVar2 = new j("TREATMENT", 1, "treatment");
        TREATMENT = jVar2;
        j[] jVarArr = {jVar, jVar2};
        $VALUES = jVarArr;
        $ENTRIES = new a80.b(jVarArr);
    }

    public j(String str, int i11, String str2) {
        this.variant = str2;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    public final String a() {
        return this.variant;
    }
}
