package jf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b Created;
    public static final b Destroyed;
    public static final b Paused;
    public static final b Resumed;
    public static final b Started;
    public static final b Stopped;

    static {
        b bVar = new b("Created", 0);
        Created = bVar;
        b bVar2 = new b("Started", 1);
        Started = bVar2;
        b bVar3 = new b("Resumed", 2);
        Resumed = bVar3;
        b bVar4 = new b("Paused", 3);
        Paused = bVar4;
        b bVar5 = new b("Stopped", 4);
        Stopped = bVar5;
        b bVar6 = new b("Destroyed", 5);
        Destroyed = bVar6;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        $VALUES = bVarArr;
        $ENTRIES = new a80.b(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
