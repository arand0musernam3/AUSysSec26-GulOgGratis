package h50;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c INVALID_COUNTRY_CODE;
    public static final c INVALID_LENGTH;
    public static final c IS_POSSIBLE;
    public static final c IS_POSSIBLE_LOCAL_ONLY;
    public static final c TOO_LONG;
    public static final c TOO_SHORT;

    static {
        c cVar = new c("IS_POSSIBLE", 0);
        IS_POSSIBLE = cVar;
        c cVar2 = new c("IS_POSSIBLE_LOCAL_ONLY", 1);
        IS_POSSIBLE_LOCAL_ONLY = cVar2;
        c cVar3 = new c("INVALID_COUNTRY_CODE", 2);
        INVALID_COUNTRY_CODE = cVar3;
        c cVar4 = new c("TOO_SHORT", 3);
        TOO_SHORT = cVar4;
        c cVar5 = new c("INVALID_LENGTH", 4);
        INVALID_LENGTH = cVar5;
        c cVar6 = new c("TOO_LONG", 5);
        TOO_LONG = cVar6;
        $VALUES = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
