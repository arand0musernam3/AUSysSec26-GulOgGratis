package zw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 {
    private static final /* synthetic */ f0[] $VALUES;
    public static final f0 pad;
    public static final f0 reflect;
    public static final f0 repeat;

    static {
        f0 f0Var = new f0("pad", 0);
        pad = f0Var;
        f0 f0Var2 = new f0("reflect", 1);
        reflect = f0Var2;
        f0 f0Var3 = new f0("repeat", 2);
        repeat = f0Var3;
        $VALUES = new f0[]{f0Var, f0Var2, f0Var3};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) $VALUES.clone();
    }
}
