package mv;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m BASELINE;
    public static final m TREATMENT;

    @NotNull
    private final String variant;

    static {
        m mVar = new m("BASELINE", 0, "baseline");
        BASELINE = mVar;
        m mVar2 = new m("TREATMENT", 1, "treatment");
        TREATMENT = mVar2;
        m[] mVarArr = {mVar, mVar2};
        $VALUES = mVarArr;
        $ENTRIES = new a80.b(mVarArr);
    }

    public m(String str, int i11, String str2) {
        this.variant = str2;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }

    public final String a() {
        return this.variant;
    }
}
