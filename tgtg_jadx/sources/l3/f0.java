package l3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ f0[] $VALUES;
    public static final f0 DefaultEffects;
    public static final f0 DefaultSpatial;
    public static final f0 FastEffects;
    public static final f0 FastSpatial;
    public static final f0 SlowEffects;
    public static final f0 SlowSpatial;

    static {
        f0 f0Var = new f0("DefaultSpatial", 0);
        DefaultSpatial = f0Var;
        f0 f0Var2 = new f0("FastSpatial", 1);
        FastSpatial = f0Var2;
        f0 f0Var3 = new f0("SlowSpatial", 2);
        SlowSpatial = f0Var3;
        f0 f0Var4 = new f0("DefaultEffects", 3);
        DefaultEffects = f0Var4;
        f0 f0Var5 = new f0("FastEffects", 4);
        FastEffects = f0Var5;
        f0 f0Var6 = new f0("SlowEffects", 5);
        SlowEffects = f0Var6;
        f0[] f0VarArr = {f0Var, f0Var2, f0Var3, f0Var4, f0Var5, f0Var6};
        $VALUES = f0VarArr;
        $ENTRIES = new a80.b(f0VarArr);
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) $VALUES.clone();
    }
}
