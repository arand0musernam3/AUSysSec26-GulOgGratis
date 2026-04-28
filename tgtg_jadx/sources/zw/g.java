package zw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {
    private static final /* synthetic */ g[] $VALUES;
    public static final g all;
    public static final g aural;
    public static final g braille;
    public static final g embossed;
    public static final g handheld;
    public static final g print;
    public static final g projection;
    public static final g screen;
    public static final g speech;
    public static final g tty;

    /* JADX INFO: renamed from: tv, reason: collision with root package name */
    public static final g f48197tv;

    static {
        g gVar = new g("all", 0);
        all = gVar;
        g gVar2 = new g("aural", 1);
        aural = gVar2;
        g gVar3 = new g("braille", 2);
        braille = gVar3;
        g gVar4 = new g("embossed", 3);
        embossed = gVar4;
        g gVar5 = new g("handheld", 4);
        handheld = gVar5;
        g gVar6 = new g("print", 5);
        print = gVar6;
        g gVar7 = new g("projection", 6);
        projection = gVar7;
        g gVar8 = new g("screen", 7);
        screen = gVar8;
        g gVar9 = new g("speech", 8);
        speech = gVar9;
        g gVar10 = new g("tty", 9);
        tty = gVar10;
        g gVar11 = new g("tv", 10);
        f48197tv = gVar11;
        $VALUES = new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
