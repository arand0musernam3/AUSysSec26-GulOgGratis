package jl;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g AFTERNOON;
    public static final g EARLY_MORNING;
    public static final g EVENING;
    public static final g LATE_MORNING;
    public static final g LATE_NIGHT;
    public static final g MIDDAY;

    @NotNull
    private final String value;

    static {
        g gVar = new g("EARLY_MORNING", 0, "early_morning");
        EARLY_MORNING = gVar;
        g gVar2 = new g("LATE_MORNING", 1, "late_morning");
        LATE_MORNING = gVar2;
        g gVar3 = new g("MIDDAY", 2, "midday");
        MIDDAY = gVar3;
        g gVar4 = new g("AFTERNOON", 3, "afternoon");
        AFTERNOON = gVar4;
        g gVar5 = new g("EVENING", 4, "evening");
        EVENING = gVar5;
        g gVar6 = new g("LATE_NIGHT", 5, "late_night");
        LATE_NIGHT = gVar6;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6};
        $VALUES = gVarArr;
        $ENTRIES = new a80.b(gVarArr);
    }

    public g(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a80.a a() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public final String c() {
        return this.value;
    }
}
