package rk;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ e0[] $VALUES;
    public static final e0 ORIGINAL;
    public static final e0 TRANSLATED;

    @NotNull
    private final String value;

    static {
        e0 e0Var = new e0("ORIGINAL", 0, "Translate");
        ORIGINAL = e0Var;
        e0 e0Var2 = new e0("TRANSLATED", 1, "Show original");
        TRANSLATED = e0Var2;
        e0[] e0VarArr = {e0Var, e0Var2};
        $VALUES = e0VarArr;
        $ENTRIES = new a80.b(e0VarArr);
    }

    public e0(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a80.a a() {
        return $ENTRIES;
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) $VALUES.clone();
    }

    public final String c() {
        return this.value;
    }
}
