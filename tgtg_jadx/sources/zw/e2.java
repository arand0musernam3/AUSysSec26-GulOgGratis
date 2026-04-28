package zw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e2 {
    private static final /* synthetic */ e2[] $VALUES;

    /* JADX INFO: renamed from: cm, reason: collision with root package name */
    public static final e2 f48185cm;

    /* JADX INFO: renamed from: em, reason: collision with root package name */
    public static final e2 f48186em;

    /* JADX INFO: renamed from: ex, reason: collision with root package name */
    public static final e2 f48187ex;
    public static final e2 in;

    /* JADX INFO: renamed from: mm, reason: collision with root package name */
    public static final e2 f48188mm;

    /* JADX INFO: renamed from: pc, reason: collision with root package name */
    public static final e2 f48189pc;
    public static final e2 percent;

    /* JADX INFO: renamed from: pt, reason: collision with root package name */
    public static final e2 f48190pt;

    /* JADX INFO: renamed from: px, reason: collision with root package name */
    public static final e2 f48191px;

    static {
        e2 e2Var = new e2("px", 0);
        f48191px = e2Var;
        e2 e2Var2 = new e2("em", 1);
        f48186em = e2Var2;
        e2 e2Var3 = new e2("ex", 2);
        f48187ex = e2Var3;
        e2 e2Var4 = new e2("in", 3);
        in = e2Var4;
        e2 e2Var5 = new e2("cm", 4);
        f48185cm = e2Var5;
        e2 e2Var6 = new e2("mm", 5);
        f48188mm = e2Var6;
        e2 e2Var7 = new e2("pt", 6);
        f48190pt = e2Var7;
        e2 e2Var8 = new e2("pc", 7);
        f48189pc = e2Var8;
        e2 e2Var9 = new e2("percent", 8);
        percent = e2Var9;
        $VALUES = new e2[]{e2Var, e2Var2, e2Var3, e2Var4, e2Var5, e2Var6, e2Var7, e2Var8, e2Var9};
    }

    public static e2 valueOf(String str) {
        return (e2) Enum.valueOf(e2.class, str);
    }

    public static e2[] values() {
        return (e2[]) $VALUES.clone();
    }
}
