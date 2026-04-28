package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
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
public final class u {
    private static final /* synthetic */ u[] $VALUES;
    public static final u BOOL;
    public static final u BOOL_LIST;
    public static final u BOOL_LIST_PACKED;
    public static final u BYTES;
    public static final u BYTES_LIST;
    public static final u DOUBLE;
    public static final u DOUBLE_LIST;
    public static final u DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final u ENUM;
    public static final u ENUM_LIST;
    public static final u ENUM_LIST_PACKED;
    public static final u FIXED32;
    public static final u FIXED32_LIST;
    public static final u FIXED32_LIST_PACKED;
    public static final u FIXED64;
    public static final u FIXED64_LIST;
    public static final u FIXED64_LIST_PACKED;
    public static final u FLOAT;
    public static final u FLOAT_LIST;
    public static final u FLOAT_LIST_PACKED;
    public static final u GROUP;
    public static final u GROUP_LIST;
    public static final u INT32;
    public static final u INT32_LIST;
    public static final u INT32_LIST_PACKED;
    public static final u INT64;
    public static final u INT64_LIST;
    public static final u INT64_LIST_PACKED;
    public static final u MAP;
    public static final u MESSAGE;
    public static final u MESSAGE_LIST;
    public static final u SFIXED32;
    public static final u SFIXED32_LIST;
    public static final u SFIXED32_LIST_PACKED;
    public static final u SFIXED64;
    public static final u SFIXED64_LIST;
    public static final u SFIXED64_LIST_PACKED;
    public static final u SINT32;
    public static final u SINT32_LIST;
    public static final u SINT32_LIST_PACKED;
    public static final u SINT64;
    public static final u SINT64_LIST;
    public static final u SINT64_LIST_PACKED;
    public static final u STRING;
    public static final u STRING_LIST;
    public static final u UINT32;
    public static final u UINT32_LIST;
    public static final u UINT32_LIST_PACKED;
    public static final u UINT64;
    public static final u UINT64_LIST;
    public static final u UINT64_LIST_PACKED;
    private static final u[] VALUES;
    private final t collection;
    private final Class<?> elementType;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f3054id;
    private final c0 javaType;
    private final boolean primitiveScalar;

    static {
        t tVar = t.SCALAR;
        c0 c0Var = c0.DOUBLE;
        u uVar = new u("DOUBLE", 0, 0, tVar, c0Var);
        DOUBLE = uVar;
        c0 c0Var2 = c0.FLOAT;
        u uVar2 = new u("FLOAT", 1, 1, tVar, c0Var2);
        FLOAT = uVar2;
        c0 c0Var3 = c0.LONG;
        u uVar3 = new u("INT64", 2, 2, tVar, c0Var3);
        INT64 = uVar3;
        u uVar4 = new u("UINT64", 3, 3, tVar, c0Var3);
        UINT64 = uVar4;
        c0 c0Var4 = c0.INT;
        u uVar5 = new u("INT32", 4, 4, tVar, c0Var4);
        INT32 = uVar5;
        u uVar6 = new u("FIXED64", 5, 5, tVar, c0Var3);
        FIXED64 = uVar6;
        u uVar7 = new u("FIXED32", 6, 6, tVar, c0Var4);
        FIXED32 = uVar7;
        c0 c0Var5 = c0.BOOLEAN;
        u uVar8 = new u("BOOL", 7, 7, tVar, c0Var5);
        BOOL = uVar8;
        c0 c0Var6 = c0.STRING;
        u uVar9 = new u("STRING", 8, 8, tVar, c0Var6);
        STRING = uVar9;
        c0 c0Var7 = c0.MESSAGE;
        u uVar10 = new u("MESSAGE", 9, 9, tVar, c0Var7);
        MESSAGE = uVar10;
        c0 c0Var8 = c0.BYTE_STRING;
        u uVar11 = new u("BYTES", 10, 10, tVar, c0Var8);
        BYTES = uVar11;
        u uVar12 = new u("UINT32", 11, 11, tVar, c0Var4);
        UINT32 = uVar12;
        c0 c0Var9 = c0.ENUM;
        u uVar13 = new u("ENUM", 12, 12, tVar, c0Var9);
        ENUM = uVar13;
        u uVar14 = new u("SFIXED32", 13, 13, tVar, c0Var4);
        SFIXED32 = uVar14;
        u uVar15 = new u("SFIXED64", 14, 14, tVar, c0Var3);
        SFIXED64 = uVar15;
        u uVar16 = new u("SINT32", 15, 15, tVar, c0Var4);
        SINT32 = uVar16;
        u uVar17 = new u("SINT64", 16, 16, tVar, c0Var3);
        SINT64 = uVar17;
        u uVar18 = new u("GROUP", 17, 17, tVar, c0Var7);
        GROUP = uVar18;
        t tVar2 = t.VECTOR;
        u uVar19 = new u("DOUBLE_LIST", 18, 18, tVar2, c0Var);
        DOUBLE_LIST = uVar19;
        u uVar20 = new u("FLOAT_LIST", 19, 19, tVar2, c0Var2);
        FLOAT_LIST = uVar20;
        u uVar21 = new u("INT64_LIST", 20, 20, tVar2, c0Var3);
        INT64_LIST = uVar21;
        u uVar22 = new u("UINT64_LIST", 21, 21, tVar2, c0Var3);
        UINT64_LIST = uVar22;
        u uVar23 = new u("INT32_LIST", 22, 22, tVar2, c0Var4);
        INT32_LIST = uVar23;
        u uVar24 = new u("FIXED64_LIST", 23, 23, tVar2, c0Var3);
        FIXED64_LIST = uVar24;
        u uVar25 = new u("FIXED32_LIST", 24, 24, tVar2, c0Var4);
        FIXED32_LIST = uVar25;
        u uVar26 = new u("BOOL_LIST", 25, 25, tVar2, c0Var5);
        BOOL_LIST = uVar26;
        u uVar27 = new u("STRING_LIST", 26, 26, tVar2, c0Var6);
        STRING_LIST = uVar27;
        u uVar28 = new u("MESSAGE_LIST", 27, 27, tVar2, c0Var7);
        MESSAGE_LIST = uVar28;
        u uVar29 = new u("BYTES_LIST", 28, 28, tVar2, c0Var8);
        BYTES_LIST = uVar29;
        u uVar30 = new u("UINT32_LIST", 29, 29, tVar2, c0Var4);
        UINT32_LIST = uVar30;
        u uVar31 = new u("ENUM_LIST", 30, 30, tVar2, c0Var9);
        ENUM_LIST = uVar31;
        u uVar32 = new u("SFIXED32_LIST", 31, 31, tVar2, c0Var4);
        SFIXED32_LIST = uVar32;
        u uVar33 = new u("SFIXED64_LIST", 32, 32, tVar2, c0Var3);
        SFIXED64_LIST = uVar33;
        u uVar34 = new u("SINT32_LIST", 33, 33, tVar2, c0Var4);
        SINT32_LIST = uVar34;
        u uVar35 = new u("SINT64_LIST", 34, 34, tVar2, c0Var3);
        SINT64_LIST = uVar35;
        t tVar3 = t.PACKED_VECTOR;
        u uVar36 = new u("DOUBLE_LIST_PACKED", 35, 35, tVar3, c0Var);
        DOUBLE_LIST_PACKED = uVar36;
        u uVar37 = new u("FLOAT_LIST_PACKED", 36, 36, tVar3, c0Var2);
        FLOAT_LIST_PACKED = uVar37;
        u uVar38 = new u("INT64_LIST_PACKED", 37, 37, tVar3, c0Var3);
        INT64_LIST_PACKED = uVar38;
        u uVar39 = new u("UINT64_LIST_PACKED", 38, 38, tVar3, c0Var3);
        UINT64_LIST_PACKED = uVar39;
        u uVar40 = new u("INT32_LIST_PACKED", 39, 39, tVar3, c0Var4);
        INT32_LIST_PACKED = uVar40;
        u uVar41 = new u("FIXED64_LIST_PACKED", 40, 40, tVar3, c0Var3);
        FIXED64_LIST_PACKED = uVar41;
        u uVar42 = new u("FIXED32_LIST_PACKED", 41, 41, tVar3, c0Var4);
        FIXED32_LIST_PACKED = uVar42;
        u uVar43 = new u("BOOL_LIST_PACKED", 42, 42, tVar3, c0Var5);
        BOOL_LIST_PACKED = uVar43;
        u uVar44 = new u("UINT32_LIST_PACKED", 43, 43, tVar3, c0Var4);
        UINT32_LIST_PACKED = uVar44;
        u uVar45 = new u("ENUM_LIST_PACKED", 44, 44, tVar3, c0Var9);
        ENUM_LIST_PACKED = uVar45;
        u uVar46 = new u("SFIXED32_LIST_PACKED", 45, 45, tVar3, c0Var4);
        SFIXED32_LIST_PACKED = uVar46;
        u uVar47 = new u("SFIXED64_LIST_PACKED", 46, 46, tVar3, c0Var3);
        SFIXED64_LIST_PACKED = uVar47;
        u uVar48 = new u("SINT32_LIST_PACKED", 47, 47, tVar3, c0Var4);
        SINT32_LIST_PACKED = uVar48;
        u uVar49 = new u("SINT64_LIST_PACKED", 48, 48, tVar3, c0Var3);
        SINT64_LIST_PACKED = uVar49;
        u uVar50 = new u("GROUP_LIST", 49, 49, tVar2, c0Var7);
        GROUP_LIST = uVar50;
        u uVar51 = new u("MAP", 50, 50, t.MAP, c0.VOID);
        MAP = uVar51;
        $VALUES = new u[]{uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, uVar12, uVar13, uVar14, uVar15, uVar16, uVar17, uVar18, uVar19, uVar20, uVar21, uVar22, uVar23, uVar24, uVar25, uVar26, uVar27, uVar28, uVar29, uVar30, uVar31, uVar32, uVar33, uVar34, uVar35, uVar36, uVar37, uVar38, uVar39, uVar40, uVar41, uVar42, uVar43, uVar44, uVar45, uVar46, uVar47, uVar48, uVar49, uVar50, uVar51};
        EMPTY_TYPES = new Type[0];
        u[] uVarArrValues = values();
        VALUES = new u[uVarArrValues.length];
        for (u uVar52 : uVarArrValues) {
            VALUES[uVar52.f3054id] = uVar52;
        }
    }

    public u(String str, int i11, int i12, t tVar, c0 c0Var) {
        int i13;
        this.f3054id = i12;
        this.collection = tVar;
        this.javaType = c0Var;
        int i14 = s.f3050a[tVar.ordinal()];
        if (i14 == 1 || i14 == 2) {
            this.elementType = c0Var.a();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (tVar != t.SCALAR || (i13 = s.f3051b[c0Var.ordinal()]) == 1 || i13 == 2 || i13 == 3) ? false : true;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }

    public final int a() {
        return this.f3054id;
    }
}
