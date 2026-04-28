package ve;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    private static final /* synthetic */ i[] $VALUES;
    public static final i BITMAP;
    public static final i DIRECT;
    public static final i RENDER_NODE;
    public static final i SAVE_LAYER;

    static {
        i iVar = new i("DIRECT", 0);
        DIRECT = iVar;
        i iVar2 = new i("SAVE_LAYER", 1);
        SAVE_LAYER = iVar2;
        i iVar3 = new i("BITMAP", 2);
        BITMAP = iVar3;
        i iVar4 = new i("RENDER_NODE", 3);
        RENDER_NODE = iVar4;
        $VALUES = new i[]{iVar, iVar2, iVar3, iVar4};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
