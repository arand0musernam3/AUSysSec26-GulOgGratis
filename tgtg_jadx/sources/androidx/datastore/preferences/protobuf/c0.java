package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    private static final /* synthetic */ c0[] $VALUES;
    public static final c0 BOOLEAN;
    public static final c0 BYTE_STRING;
    public static final c0 DOUBLE;
    public static final c0 ENUM;
    public static final c0 FLOAT;
    public static final c0 INT;
    public static final c0 LONG;
    public static final c0 MESSAGE;
    public static final c0 STRING;
    public static final c0 VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        c0 c0Var = new c0("VOID", 0, Void.class, Void.class, null);
        VOID = c0Var;
        Class cls = Integer.TYPE;
        c0 c0Var2 = new c0("INT", 1, cls, Integer.class, 0);
        INT = c0Var2;
        c0 c0Var3 = new c0("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = c0Var3;
        c0 c0Var4 = new c0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = c0Var4;
        c0 c0Var5 = new c0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = c0Var5;
        c0 c0Var6 = new c0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = c0Var6;
        c0 c0Var7 = new c0("STRING", 6, String.class, String.class, "");
        STRING = c0Var7;
        c0 c0Var8 = new c0("BYTE_STRING", 7, f.class, f.class, f.f2956c);
        BYTE_STRING = c0Var8;
        c0 c0Var9 = new c0("ENUM", 8, cls, Integer.class, null);
        ENUM = c0Var9;
        c0 c0Var10 = new c0("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = c0Var10;
        $VALUES = new c0[]{c0Var, c0Var2, c0Var3, c0Var4, c0Var5, c0Var6, c0Var7, c0Var8, c0Var9, c0Var10};
    }

    public c0(String str, int i11, Class cls, Class cls2, Serializable serializable) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = serializable;
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) $VALUES.clone();
    }

    public final Class a() {
        return this.boxedType;
    }
}
