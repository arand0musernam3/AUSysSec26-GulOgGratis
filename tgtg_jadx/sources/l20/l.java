package l20;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l {
    private static final /* synthetic */ l[] $VALUES;
    public static final l HIDDEN;
    public static final l HIDING;
    public static final l SHOWING;
    public static final l SHOWN;

    static {
        l lVar = new l("HIDING", 0);
        HIDING = lVar;
        l lVar2 = new l("HIDDEN", 1);
        HIDDEN = lVar2;
        l lVar3 = new l("SHOWING", 2);
        SHOWING = lVar3;
        l lVar4 = new l("SHOWN", 3);
        SHOWN = lVar4;
        $VALUES = new l[]{lVar, lVar2, lVar3, lVar4};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
