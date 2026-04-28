package h50;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    private static final /* synthetic */ i[] $VALUES;
    public static final i FROM_DEFAULT_COUNTRY;
    public static final i FROM_NUMBER_WITHOUT_PLUS_SIGN;
    public static final i FROM_NUMBER_WITH_IDD;
    public static final i FROM_NUMBER_WITH_PLUS_SIGN;
    public static final i UNSPECIFIED;

    static {
        i iVar = new i("FROM_NUMBER_WITH_PLUS_SIGN", 0);
        FROM_NUMBER_WITH_PLUS_SIGN = iVar;
        i iVar2 = new i("FROM_NUMBER_WITH_IDD", 1);
        FROM_NUMBER_WITH_IDD = iVar2;
        i iVar3 = new i("FROM_NUMBER_WITHOUT_PLUS_SIGN", 2);
        FROM_NUMBER_WITHOUT_PLUS_SIGN = iVar3;
        i iVar4 = new i("FROM_DEFAULT_COUNTRY", 3);
        FROM_DEFAULT_COUNTRY = iVar4;
        i iVar5 = new i("UNSPECIFIED", 4);
        UNSPECIFIED = iVar5;
        $VALUES = new i[]{iVar, iVar2, iVar3, iVar4, iVar5};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
