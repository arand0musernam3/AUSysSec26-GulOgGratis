package jg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c AT;
    public static final c BE;
    public static final c DE;
    public static final c DEFAULT;
    public static final c DK;
    public static final c ES;
    public static final c FR;
    public static final c GB;
    public static final c IT;
    public static final c NL;
    public static final c PL;
    public static final c PT;
    public static final c US;

    static {
        c cVar = new c("AT", 0);
        AT = cVar;
        c cVar2 = new c("BE", 1);
        BE = cVar2;
        c cVar3 = new c("DE", 2);
        DE = cVar3;
        c cVar4 = new c("DK", 3);
        DK = cVar4;
        c cVar5 = new c("ES", 4);
        ES = cVar5;
        c cVar6 = new c("FR", 5);
        FR = cVar6;
        c cVar7 = new c("GB", 6);
        GB = cVar7;
        c cVar8 = new c("IT", 7);
        IT = cVar8;
        c cVar9 = new c("NL", 8);
        NL = cVar9;
        c cVar10 = new c("PL", 9);
        PL = cVar10;
        c cVar11 = new c("PT", 10);
        PT = cVar11;
        c cVar12 = new c("US", 11);
        US = cVar12;
        c cVar13 = new c("DEFAULT", 12);
        DEFAULT = cVar13;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13};
        $VALUES = cVarArr;
        $ENTRIES = new a80.b(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
