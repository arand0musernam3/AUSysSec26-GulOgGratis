package mv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final v ADDRESS_AUTO_COMPLETE;
    public static final v DEFAULT;
    public static final v FAVORITE_NOTIFICATION;
    public static final v LOYALTY_CARD_BANNER;
    public static final v TOKYO_STATIONS;

    static {
        v vVar = new v("FAVORITE_NOTIFICATION", 0);
        FAVORITE_NOTIFICATION = vVar;
        v vVar2 = new v("LOYALTY_CARD_BANNER", 1);
        LOYALTY_CARD_BANNER = vVar2;
        v vVar3 = new v("TOKYO_STATIONS", 2);
        TOKYO_STATIONS = vVar3;
        v vVar4 = new v("ADDRESS_AUTO_COMPLETE", 3);
        ADDRESS_AUTO_COMPLETE = vVar4;
        v vVar5 = new v("DEFAULT", 4);
        DEFAULT = vVar5;
        v[] vVarArr = {vVar, vVar2, vVar3, vVar4, vVar5};
        $VALUES = vVarArr;
        $ENTRIES = new a80.b(vVarArr);
    }

    public static a80.a a() {
        return $ENTRIES;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }
}
