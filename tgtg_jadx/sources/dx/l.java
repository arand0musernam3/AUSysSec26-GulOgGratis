package dx;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l {
    private static final /* synthetic */ l[] $VALUES;
    public static final l ARRAY;
    public static final l BOOL;

    @NotNull
    public static final k Companion;
    public static final l INT;

    static {
        l lVar = new l("ARRAY", 0);
        ARRAY = lVar;
        l lVar2 = new l("BOOL", 1);
        BOOL = lVar2;
        l lVar3 = new l("INT", 2);
        INT = lVar3;
        $VALUES = new l[]{lVar, lVar2, lVar3};
        Companion = new k();
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
