package bp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final v COLLECTION;
    public static final v OVERALL;
    public static final v QUALITY;
    public static final v QUANTITY;
    public static final v VARIETY;

    static {
        v vVar = new v("OVERALL", 0);
        OVERALL = vVar;
        v vVar2 = new v("COLLECTION", 1);
        COLLECTION = vVar2;
        v vVar3 = new v("QUALITY", 2);
        QUALITY = vVar3;
        v vVar4 = new v("VARIETY", 3);
        VARIETY = vVar4;
        v vVar5 = new v("QUANTITY", 4);
        QUANTITY = vVar5;
        v[] vVarArr = {vVar, vVar2, vVar3, vVar4, vVar5};
        $VALUES = vVarArr;
        $ENTRIES = new a80.b(vVarArr);
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }
}
