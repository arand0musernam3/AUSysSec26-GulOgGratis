package o30;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h0 {
    private static final /* synthetic */ h0[] $VALUES;
    public static final h0 CANCELLED;
    public static final h0 NOT_RUN;
    public static final h0 STARTED;

    static {
        h0 h0Var = new h0("NOT_RUN", 0);
        NOT_RUN = h0Var;
        h0 h0Var2 = new h0("CANCELLED", 1);
        CANCELLED = h0Var2;
        h0 h0Var3 = new h0("STARTED", 2);
        STARTED = h0Var3;
        $VALUES = new h0[]{h0Var, h0Var2, h0Var3};
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) $VALUES.clone();
    }
}
