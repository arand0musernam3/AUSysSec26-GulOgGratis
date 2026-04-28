package vj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j FRIDAY;
    public static final j MONDAY;
    public static final j SATURDAY;
    public static final j SUNDAY;
    public static final j THURSDAY;
    public static final j TUESDAY;
    public static final j WEDNESDAY;

    static {
        j jVar = new j("MONDAY", 0);
        MONDAY = jVar;
        j jVar2 = new j("TUESDAY", 1);
        TUESDAY = jVar2;
        j jVar3 = new j("WEDNESDAY", 2);
        WEDNESDAY = jVar3;
        j jVar4 = new j("THURSDAY", 3);
        THURSDAY = jVar4;
        j jVar5 = new j("FRIDAY", 4);
        FRIDAY = jVar5;
        j jVar6 = new j("SATURDAY", 5);
        SATURDAY = jVar6;
        j jVar7 = new j("SUNDAY", 6);
        SUNDAY = jVar7;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7};
        $VALUES = jVarArr;
        $ENTRIES = new a80.b(jVarArr);
    }

    public static a80.a a() {
        return $ENTRIES;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
