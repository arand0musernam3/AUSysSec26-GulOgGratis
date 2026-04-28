package kotlin.reflect;

import i4.a;
import j4.d;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KTypeBase;
import kotlin.jvm.internal.KTypeParameterBase;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import o80.o;
import o80.r;
import org.jetbrains.annotations.NotNull;
import qc.y;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0018\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\u0083\u0080\u0004\u001a$\u0010\n\u001a\u00020\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0083\u0080\u0004\u001a\u0012\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0001H\u0082\u0080\u0004\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0084\b¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u000f8BX\u0083\u0084\b¢\u0006\f\u0012\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011¨\u0006\u0015"}, d2 = {"javaType", "Ljava/lang/reflect/Type;", "Lkotlin/reflect/KType;", "getJavaType$annotations", "(Lkotlin/reflect/KType;)V", "getJavaType", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "computeJavaType", "forceWrapper", "", "createPossiblyInnerType", "jClass", "Ljava/lang/Class;", "arguments", "", "Lkotlin/reflect/KTypeProjection;", "(Lkotlin/reflect/KTypeProjection;)V", "(Lkotlin/reflect/KTypeProjection;)Ljava/lang/reflect/Type;", "typeToString", "", "type", "kotlin-stdlib"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,244:1\n1#2:245\n3054#3,12:246\n1586#4:258\n1661#4,3:259\n1586#4:262\n1661#4,3:263\n1586#4:266\n1661#4,3:267\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n*L\n42#1:246,12\n73#1:258\n73#1:259,3\n75#1:262\n75#1:263,3\n81#1:266\n81#1:267,3\n*E\n"})
public final class TypesJVMKt {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type computeJavaType(KType kType, boolean z11) {
        KClassifier classifier = kType.getClassifier();
        TypeVariable<?> typeVariable = null;
        if (classifier instanceof KTypeParameter) {
            if (!(classifier instanceof KTypeParameterBase)) {
                return new ObsoleteFallbackTypeVariableImpl((KTypeParameter) classifier);
            }
            KTypeParameterBase kTypeParameterBase = (KTypeParameterBase) classifier;
            GenericDeclaration javaContainingDeclaration$kotlin_stdlib = kTypeParameterBase.getJavaContainingDeclaration$kotlin_stdlib();
            if (javaContainingDeclaration$kotlin_stdlib == null) {
                d.l(kType, "javaType is not supported for this type: ");
                return null;
            }
            TypeVariable<?>[] typeParameters = javaContainingDeclaration$kotlin_stdlib.getTypeParameters();
            typeParameters.getClass();
            boolean z12 = false;
            for (TypeVariable<?> typeVariable2 : typeParameters) {
                if (Intrinsics.areEqual(typeVariable2.getName(), kTypeParameterBase.getName())) {
                    if (z12) {
                        a.f("Array contains more than one matching element.");
                        return null;
                    }
                    z12 = true;
                    typeVariable = typeVariable2;
                }
            }
            if (z12) {
                typeVariable.getClass();
                return typeVariable;
            }
            y.h("Array contains no element matching the predicate.");
            return null;
        }
        if (!(classifier instanceof KClass)) {
            d.l(kType, "Unsupported type classifier: ");
            return null;
        }
        KClass kClass = (KClass) classifier;
        Class clsW = z11 ? w.w(kClass) : w.v(kClass);
        List<KTypeProjection> arguments = kType.getArguments();
        if (arguments.isEmpty()) {
            return clsW;
        }
        if (!clsW.isArray()) {
            return createPossiblyInnerType(clsW, arguments);
        }
        if (clsW.getComponentType().isPrimitive()) {
            return clsW;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) CollectionsKt.j0(arguments);
        if (kTypeProjection == null) {
            d.o(kType, "kotlin.Array must have exactly one type argument: ");
            return null;
        }
        KVariance variance = kTypeProjection.getVariance();
        KType type = kTypeProjection.getType();
        int i11 = variance == null ? -1 : WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
        if (i11 == -1 || i11 == 1) {
            return clsW;
        }
        if (i11 != 2 && i11 != 3) {
            e40.a.f();
            return null;
        }
        type.getClass();
        Type typeComputeJavaType$default = computeJavaType$default(type, false, 1, null);
        return typeComputeJavaType$default instanceof Class ? clsW : new GenericArrayTypeImpl(typeComputeJavaType$default);
    }

    public static /* synthetic */ Type computeJavaType$default(KType kType, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return computeJavaType(kType, z11);
    }

    private static final Type createPossiblyInnerType(Class<?> cls, List<KTypeProjection> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(e0.o(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(getJavaType((KTypeProjection) it.next()));
            }
            return new ParameterizedTypeImpl(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(e0.o(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(getJavaType((KTypeProjection) it2.next()));
            }
            return new ParameterizedTypeImpl(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type typeCreatePossiblyInnerType = createPossiblyInnerType(declaringClass, list.subList(length, list.size()));
        List<KTypeProjection> listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(e0.o(listSubList, 10));
        Iterator<T> it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(getJavaType((KTypeProjection) it3.next()));
        }
        return new ParameterizedTypeImpl(cls, typeCreatePossiblyInnerType, arrayList3);
    }

    private static final Type getJavaType(KTypeProjection kTypeProjection) {
        KVariance variance = kTypeProjection.getVariance();
        if (variance == null) {
            return WildcardTypeImpl.Companion.getSTAR();
        }
        KType type = kTypeProjection.getType();
        type.getClass();
        int i11 = WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
        if (i11 == 1) {
            return new WildcardTypeImpl(null, computeJavaType(type, true));
        }
        if (i11 == 2) {
            return computeJavaType(type, true);
        }
        if (i11 == 3) {
            return new WildcardTypeImpl(computeJavaType(type, true), null);
        }
        e40.a.f();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String typeToString(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        Sequence sequenceD = o.d(type, TypesJVMKt$typeToString$unwrap$1.INSTANCE);
        return ((Class) r.l(sequenceD)).getName() + kotlin.text.y.m(r.f(sequenceD), "[]");
    }

    private static /* synthetic */ void getJavaType$annotations(KTypeProjection kTypeProjection) {
    }

    public static /* synthetic */ void getJavaType$annotations(KType kType) {
    }

    @NotNull
    public static final Type getJavaType(@NotNull KType kType) {
        Type javaType;
        kType.getClass();
        return (!(kType instanceof KTypeBase) || (javaType = ((KTypeBase) kType).getJavaType()) == null) ? computeJavaType$default(kType, false, 1, null) : javaType;
    }
}
