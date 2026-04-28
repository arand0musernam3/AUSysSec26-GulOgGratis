package bx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l {
    private static final /* synthetic */ l[] $VALUES;
    public static final l AUTO;
    public static final l EXPLICIT_ONLY;

    static {
        l lVar = new l("AUTO", 0);
        AUTO = lVar;
        l lVar2 = new l("EXPLICIT_ONLY", 1);
        EXPLICIT_ONLY = lVar2;
        $VALUES = new l[]{lVar, lVar2};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
