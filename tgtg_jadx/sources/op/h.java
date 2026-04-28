package op;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h(with = i.class)
public final class h {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;

    @NotNull
    public static final g Companion;

    @i90.g("LINE")
    public static final h LINE;

    @i90.g("STATION")
    public static final h STATION;
    public static final h UNKNOWN;

    static {
        h hVar = new h("LINE", 0);
        LINE = hVar;
        h hVar2 = new h("STATION", 1);
        STATION = hVar2;
        h hVar3 = new h("UNKNOWN", 2);
        UNKNOWN = hVar3;
        h[] hVarArr = {hVar, hVar2, hVar3};
        $VALUES = hVarArr;
        $ENTRIES = new a80.b(hVarArr);
        Companion = new g();
    }

    public static a80.a a() {
        return $ENTRIES;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
