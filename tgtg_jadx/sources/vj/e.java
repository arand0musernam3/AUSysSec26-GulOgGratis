package vj;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h(with = f.class)
public final class e {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @NotNull
    public static final d Companion;

    @i90.g("ONE_TIME")
    public static final e ONE_TIME;

    @i90.g("SCHEDULED")
    public static final e SCHEDULED;
    public static final e UNKNOWN;

    static {
        e eVar = new e("SCHEDULED", 0);
        SCHEDULED = eVar;
        e eVar2 = new e("ONE_TIME", 1);
        ONE_TIME = eVar2;
        e eVar3 = new e("UNKNOWN", 2);
        UNKNOWN = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        $VALUES = eVarArr;
        $ENTRIES = new a80.b(eVarArr);
        Companion = new d();
    }

    public static a80.a a() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
