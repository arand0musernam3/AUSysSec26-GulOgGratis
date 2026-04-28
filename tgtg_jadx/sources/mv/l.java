package mv;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l BASELINE;
    public static final l USING_NEW_PAGE;
    public static final l USING_OLD_PAGE;

    @NotNull
    private final String variant;

    static {
        l lVar = new l("BASELINE", 0, "baseline");
        BASELINE = lVar;
        l lVar2 = new l("USING_NEW_PAGE", 1, "Using_New_Page");
        USING_NEW_PAGE = lVar2;
        l lVar3 = new l("USING_OLD_PAGE", 2, "Using_Old_Page");
        USING_OLD_PAGE = lVar3;
        l[] lVarArr = {lVar, lVar2, lVar3};
        $VALUES = lVarArr;
        $ENTRIES = new a80.b(lVarArr);
    }

    public l(String str, int i11, String str2) {
        this.variant = str2;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }

    public final String a() {
        return this.variant;
    }
}
