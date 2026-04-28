package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t {
    private static final /* synthetic */ t[] $VALUES;
    public static final t CLOSED;
    public static final t CLOSING;
    public static final t OPEN;
    public static final t OPENING;
    public static final t PENDING_OPEN;

    static {
        t tVar = new t("PENDING_OPEN", 0);
        PENDING_OPEN = tVar;
        t tVar2 = new t("OPENING", 1);
        OPENING = tVar2;
        t tVar3 = new t("OPEN", 2);
        OPEN = tVar3;
        t tVar4 = new t("CLOSING", 3);
        CLOSING = tVar4;
        t tVar5 = new t("CLOSED", 4);
        CLOSED = tVar5;
        $VALUES = new t[]{tVar, tVar2, tVar3, tVar4, tVar5};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}
