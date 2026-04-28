package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    private static final /* synthetic */ y[] $VALUES;
    public static final y BUILD_MESSAGE_INFO;
    public static final y GET_DEFAULT_INSTANCE;
    public static final y GET_MEMOIZED_IS_INITIALIZED;
    public static final y GET_PARSER;
    public static final y NEW_BUILDER;
    public static final y NEW_MUTABLE_INSTANCE;
    public static final y SET_MEMOIZED_IS_INITIALIZED;

    static {
        y yVar = new y("GET_MEMOIZED_IS_INITIALIZED", 0);
        GET_MEMOIZED_IS_INITIALIZED = yVar;
        y yVar2 = new y("SET_MEMOIZED_IS_INITIALIZED", 1);
        SET_MEMOIZED_IS_INITIALIZED = yVar2;
        y yVar3 = new y("BUILD_MESSAGE_INFO", 2);
        BUILD_MESSAGE_INFO = yVar3;
        y yVar4 = new y("NEW_MUTABLE_INSTANCE", 3);
        NEW_MUTABLE_INSTANCE = yVar4;
        y yVar5 = new y("NEW_BUILDER", 4);
        NEW_BUILDER = yVar5;
        y yVar6 = new y("GET_DEFAULT_INSTANCE", 5);
        GET_DEFAULT_INSTANCE = yVar6;
        y yVar7 = new y("GET_PARSER", 6);
        GET_PARSER = yVar7;
        $VALUES = new y[]{yVar, yVar2, yVar3, yVar4, yVar5, yVar6, yVar7};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) $VALUES.clone();
    }
}
