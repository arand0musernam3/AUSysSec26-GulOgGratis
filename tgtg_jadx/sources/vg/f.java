package vg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f CHOSEN_LOCATION;
    public static final f CURRENT_LOCATION;
    public static final f INITIAL_LOCATION;
    public static final f NONE;
    public static final f SAVED_ADDRESS;
    public static final f SEARCH_RESULT;
    public static final f SELECT_AREA_SEARCH_BOX;

    static {
        f fVar = new f("CURRENT_LOCATION", 0);
        CURRENT_LOCATION = fVar;
        f fVar2 = new f("SEARCH_RESULT", 1);
        SEARCH_RESULT = fVar2;
        f fVar3 = new f("SAVED_ADDRESS", 2);
        SAVED_ADDRESS = fVar3;
        f fVar4 = new f("CHOSEN_LOCATION", 3);
        CHOSEN_LOCATION = fVar4;
        f fVar5 = new f("INITIAL_LOCATION", 4);
        INITIAL_LOCATION = fVar5;
        f fVar6 = new f("SELECT_AREA_SEARCH_BOX", 5);
        SELECT_AREA_SEARCH_BOX = fVar6;
        f fVar7 = new f("NONE", 6);
        NONE = fVar7;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7};
        $VALUES = fVarArr;
        $ENTRIES = new a80.b(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
