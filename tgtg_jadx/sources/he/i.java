package he;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    private static final /* synthetic */ i[] $VALUES;
    public static final i PLAY_OPTION;
    public static final i SET_ANIMATION;
    public static final i SET_IMAGE_ASSETS;
    public static final i SET_PROGRESS;
    public static final i SET_REPEAT_COUNT;
    public static final i SET_REPEAT_MODE;

    static {
        i iVar = new i("SET_ANIMATION", 0);
        SET_ANIMATION = iVar;
        i iVar2 = new i("SET_PROGRESS", 1);
        SET_PROGRESS = iVar2;
        i iVar3 = new i("SET_REPEAT_MODE", 2);
        SET_REPEAT_MODE = iVar3;
        i iVar4 = new i("SET_REPEAT_COUNT", 3);
        SET_REPEAT_COUNT = iVar4;
        i iVar5 = new i("SET_IMAGE_ASSETS", 4);
        SET_IMAGE_ASSETS = iVar5;
        i iVar6 = new i("PLAY_OPTION", 5);
        PLAY_OPTION = iVar6;
        $VALUES = new i[]{iVar, iVar2, iVar3, iVar4, iVar5, iVar6};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
