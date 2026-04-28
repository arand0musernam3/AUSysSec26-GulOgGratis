package yk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j ADDRESS_PICKER;
    public static final j SELECTED_ADDRESS_PICKER;
    public static final j SELECT_AREA;
    public static final j STATIONS_PICKER;

    static {
        j jVar = new j("SELECT_AREA", 0);
        SELECT_AREA = jVar;
        j jVar2 = new j("ADDRESS_PICKER", 1);
        ADDRESS_PICKER = jVar2;
        j jVar3 = new j("SELECTED_ADDRESS_PICKER", 2);
        SELECTED_ADDRESS_PICKER = jVar3;
        j jVar4 = new j("STATIONS_PICKER", 3);
        STATIONS_PICKER = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
        $VALUES = jVarArr;
        $ENTRIES = new a80.b(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
