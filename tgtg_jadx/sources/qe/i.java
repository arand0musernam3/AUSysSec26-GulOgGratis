package qe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    private static final /* synthetic */ i[] $VALUES;
    public static final i MASK_MODE_ADD;
    public static final i MASK_MODE_INTERSECT;
    public static final i MASK_MODE_NONE;
    public static final i MASK_MODE_SUBTRACT;

    static {
        i iVar = new i("MASK_MODE_ADD", 0);
        MASK_MODE_ADD = iVar;
        i iVar2 = new i("MASK_MODE_SUBTRACT", 1);
        MASK_MODE_SUBTRACT = iVar2;
        i iVar3 = new i("MASK_MODE_INTERSECT", 2);
        MASK_MODE_INTERSECT = iVar3;
        i iVar4 = new i("MASK_MODE_NONE", 3);
        MASK_MODE_NONE = iVar4;
        $VALUES = new i[]{iVar, iVar2, iVar3, iVar4};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
