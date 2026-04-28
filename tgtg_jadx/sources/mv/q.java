package mv;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q BASELINE;
    public static final q TREATMENT;

    @NotNull
    private final String variant;

    static {
        q qVar = new q("BASELINE", 0, "baseline");
        BASELINE = qVar;
        q qVar2 = new q("TREATMENT", 1, "treatment");
        TREATMENT = qVar2;
        q[] qVarArr = {qVar, qVar2};
        $VALUES = qVarArr;
        $ENTRIES = new a80.b(qVarArr);
    }

    public q(String str, int i11, String str2) {
        this.variant = str2;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }

    public final String a() {
        return this.variant;
    }
}
