package mv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ f0[] $VALUES;
    public static final f0 DELIVERY_BASKET_INTRO;
    public static final f0 DELIVERY_CATEGORY_ITEM;
    public static final f0 DELIVERY_NPS_VIEW;
    public static final f0 DELIVERY_PARCEL_STORY;

    static {
        f0 f0Var = new f0("DELIVERY_PARCEL_STORY", 0);
        DELIVERY_PARCEL_STORY = f0Var;
        f0 f0Var2 = new f0("DELIVERY_NPS_VIEW", 1);
        DELIVERY_NPS_VIEW = f0Var2;
        f0 f0Var3 = new f0("DELIVERY_CATEGORY_ITEM", 2);
        DELIVERY_CATEGORY_ITEM = f0Var3;
        f0 f0Var4 = new f0("DELIVERY_BASKET_INTRO", 3);
        DELIVERY_BASKET_INTRO = f0Var4;
        f0[] f0VarArr = {f0Var, f0Var2, f0Var3, f0Var4};
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
