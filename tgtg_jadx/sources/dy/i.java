package dy;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i {
    private static final /* synthetic */ i[] $VALUES;
    public static final i BLACK;
    public static final i BLUE;

    static {
        i iVar = new i("BLUE", 0);
        BLUE = iVar;
        i iVar2 = new i("BLACK", 1);
        BLACK = iVar2;
        $VALUES = new i[]{iVar, iVar2};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
