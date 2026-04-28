package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.n0;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nConstantValueFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstantValueFactory.kt\norg/jetbrains/kotlin/resolve/constants/ConstantValueFactory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1603#2,9:104\n1855#2:113\n1856#2:115\n1612#2:116\n1#3:114\n*S KotlinDebug\n*F\n+ 1 ConstantValueFactory.kt\norg/jetbrains/kotlin/resolve/constants/ConstantValueFactory\n*L\n64#1:104,9\n64#1:113\n64#1:115\n64#1:116\n64#1:114\n*E\n"})
public final class ConstantValueFactory {

    @NotNull
    public static final ConstantValueFactory INSTANCE = new ConstantValueFactory();

    private ConstantValueFactory() {
    }

    private final ArrayValue createArrayValue(List<?> list, ModuleDescriptor moduleDescriptor, final PrimitiveType primitiveType) {
        List listR0 = CollectionsKt.r0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listR0.iterator();
        while (it.hasNext()) {
            ConstantValue constantValueCreateConstantValue$default = createConstantValue$default(this, it.next(), null, 2, null);
            if (constantValueCreateConstantValue$default != null) {
                arrayList.add(constantValueCreateConstantValue$default);
            }
        }
        if (moduleDescriptor == null) {
            return new ArrayValue(arrayList, new Function1<ModuleDescriptor, KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory.createArrayValue.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final KotlinType invoke(@NotNull ModuleDescriptor moduleDescriptor2) {
                    moduleDescriptor2.getClass();
                    SimpleType primitiveArrayKotlinType = moduleDescriptor2.getBuiltIns().getPrimitiveArrayKotlinType(primitiveType);
                    primitiveArrayKotlinType.getClass();
                    return primitiveArrayKotlinType;
                }
            });
        }
        SimpleType primitiveArrayKotlinType = moduleDescriptor.getBuiltIns().getPrimitiveArrayKotlinType(primitiveType);
        primitiveArrayKotlinType.getClass();
        return new TypedArrayValue(arrayList, primitiveArrayKotlinType);
    }

    public static /* synthetic */ ConstantValue createConstantValue$default(ConstantValueFactory constantValueFactory, Object obj, ModuleDescriptor moduleDescriptor, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            moduleDescriptor = null;
        }
        return constantValueFactory.createConstantValue(obj, moduleDescriptor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v28, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v33, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory] */
    @Nullable
    public final ConstantValue<?> createConstantValue(@Nullable Object obj, @Nullable ModuleDescriptor moduleDescriptor) {
        ?? C;
        ?? C2;
        ?? C3;
        if (obj instanceof Byte) {
            return new ByteValue(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new ShortValue(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new IntValue(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new LongValue(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new CharValue(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new FloatValue(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new DoubleValue(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new BooleanValue(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new StringValue((String) obj);
        }
        int i11 = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            if (length == 0) {
                C3 = n0.f26529a;
            } else if (length != 1) {
                C3 = new ArrayList(bArr.length);
                int length2 = bArr.length;
                while (i11 < length2) {
                    C3.add(Byte.valueOf(bArr[i11]));
                    i11++;
                }
            } else {
                C3 = c0.c(Byte.valueOf(bArr[0]));
            }
            return createArrayValue(C3, moduleDescriptor, PrimitiveType.BYTE);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length3 = sArr.length;
            if (length3 == 0) {
                C2 = n0.f26529a;
            } else if (length3 != 1) {
                C2 = new ArrayList(sArr.length);
                int length4 = sArr.length;
                while (i11 < length4) {
                    C2.add(Short.valueOf(sArr[i11]));
                    i11++;
                }
            } else {
                C2 = c0.c(Short.valueOf(sArr[0]));
            }
            return createArrayValue(C2, moduleDescriptor, PrimitiveType.SHORT);
        }
        if (obj instanceof int[]) {
            return createArrayValue(y.R((int[]) obj), moduleDescriptor, PrimitiveType.INT);
        }
        if (obj instanceof long[]) {
            return createArrayValue(y.S((long[]) obj), moduleDescriptor, PrimitiveType.LONG);
        }
        if (!(obj instanceof char[])) {
            if (obj instanceof float[]) {
                return createArrayValue(y.Q((float[]) obj), moduleDescriptor, PrimitiveType.FLOAT);
            }
            if (obj instanceof double[]) {
                return createArrayValue(y.P((double[]) obj), moduleDescriptor, PrimitiveType.DOUBLE);
            }
            if (obj instanceof boolean[]) {
                return createArrayValue(y.U((boolean[]) obj), moduleDescriptor, PrimitiveType.BOOLEAN);
            }
            if (obj == null) {
                return new NullValue();
            }
            return null;
        }
        char[] cArr = (char[]) obj;
        int length5 = cArr.length;
        if (length5 == 0) {
            C = n0.f26529a;
        } else if (length5 != 1) {
            C = new ArrayList(cArr.length);
            int length6 = cArr.length;
            while (i11 < length6) {
                C.add(Character.valueOf(cArr[i11]));
                i11++;
            }
        } else {
            C = c0.c(Character.valueOf(cArr[0]));
        }
        return createArrayValue(C, moduleDescriptor, PrimitiveType.CHAR);
    }

    @NotNull
    public final ArrayValue createArrayValue(@NotNull List<? extends ConstantValue<?>> list, @NotNull KotlinType kotlinType) {
        list.getClass();
        kotlinType.getClass();
        return new TypedArrayValue(list, kotlinType);
    }
}
