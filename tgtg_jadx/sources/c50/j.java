package c50;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements o40.f {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j COLLECTION_DISABLED;
    public static final j COLLECTION_DISABLED_REMOTE;
    public static final j COLLECTION_ENABLED;
    public static final j COLLECTION_SAMPLED;
    public static final j COLLECTION_SDK_NOT_INSTALLED;
    public static final j COLLECTION_UNKNOWN;
    private final int number;

    static {
        j jVar = new j("COLLECTION_UNKNOWN", 0, 0);
        COLLECTION_UNKNOWN = jVar;
        j jVar2 = new j("COLLECTION_SDK_NOT_INSTALLED", 1, 1);
        COLLECTION_SDK_NOT_INSTALLED = jVar2;
        j jVar3 = new j("COLLECTION_ENABLED", 2, 2);
        COLLECTION_ENABLED = jVar3;
        j jVar4 = new j("COLLECTION_DISABLED", 3, 3);
        COLLECTION_DISABLED = jVar4;
        j jVar5 = new j("COLLECTION_DISABLED_REMOTE", 4, 4);
        COLLECTION_DISABLED_REMOTE = jVar5;
        j jVar6 = new j("COLLECTION_SAMPLED", 5, 5);
        COLLECTION_SAMPLED = jVar6;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6};
        $VALUES = jVarArr;
        $ENTRIES = new a80.b(jVarArr);
    }

    public j(String str, int i11, int i12) {
        this.number = i12;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    @Override // o40.f
    public final int getNumber() {
        return this.number;
    }
}
