package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import i80.a;
import i80.b;
import i80.c;
import i80.d;
import i80.e;
import i80.g;
import i80.h;
import i80.i;
import i80.j;
import i80.k;
import i80.l;
import i80.m;
import i80.n;
import i80.o;
import i80.p;
import i80.q;
import i80.r;
import i80.s;
import i80.t;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.collections.x0;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.f;
import w.a0;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nreflectClassUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 reflectClassUtil.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectClassUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,99:1\n1549#2:100\n1620#2,3:101\n1549#2:104\n1620#2,3:105\n1559#2:108\n1590#2,4:109\n*S KotlinDebug\n*F\n+ 1 reflectClassUtil.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectClassUtilKt\n*L\n34#1:100\n34#1:101,3\n35#1:104\n35#1:105,3\n50#1:108\n50#1:109,4\n*E\n"})
public final class ReflectClassUtilKt {

    @NotNull
    private static final Map<Class<? extends f>, Integer> FUNCTION_CLASSES;

    @NotNull
    private static final List<KClass<? extends Object>> PRIMITIVE_CLASSES;

    @NotNull
    private static final Map<Class<? extends Object>, Class<? extends Object>> PRIMITIVE_TO_WRAPPER;

    @NotNull
    private static final Map<Class<? extends Object>, Class<? extends Object>> WRAPPER_TO_PRIMITIVE;

    static {
        int i11 = 0;
        List<KClass<? extends Object>> listH = d0.h(Reflection.getOrCreateKotlinClass(Boolean.TYPE), Reflection.getOrCreateKotlinClass(Byte.TYPE), Reflection.getOrCreateKotlinClass(Character.TYPE), Reflection.getOrCreateKotlinClass(Double.TYPE), Reflection.getOrCreateKotlinClass(Float.TYPE), Reflection.getOrCreateKotlinClass(Integer.TYPE), Reflection.getOrCreateKotlinClass(Long.TYPE), Reflection.getOrCreateKotlinClass(Short.TYPE));
        PRIMITIVE_CLASSES = listH;
        ArrayList arrayList = new ArrayList(e0.o(listH, 10));
        Iterator<T> it = listH.iterator();
        while (it.hasNext()) {
            KClass kClass = (KClass) it.next();
            arrayList.add(new Pair(w.w(kClass), w.x(kClass)));
        }
        WRAPPER_TO_PRIMITIVE = x0.j(arrayList);
        List<KClass<? extends Object>> list = PRIMITIVE_CLASSES;
        ArrayList arrayList2 = new ArrayList(e0.o(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            KClass kClass2 = (KClass) it2.next();
            arrayList2.add(new Pair(w.x(kClass2), w.w(kClass2)));
        }
        PRIMITIVE_TO_WRAPPER = x0.j(arrayList2);
        List listH2 = d0.h(Function0.class, Function1.class, Function2.class, n.class, o.class, p.class, q.class, r.class, s.class, t.class, a.class, b.class, c.class, d.class, e.class, i80.f.class, g.class, h.class, i.class, j.class, k.class, l.class, m.class);
        ArrayList arrayList3 = new ArrayList(e0.o(listH2, 10));
        for (Object obj : listH2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                d0.n();
                throw null;
            }
            arrayList3.add(new Pair((Class) obj, Integer.valueOf(i11)));
            i11 = i12;
        }
        FUNCTION_CLASSES = x0.j(arrayList3);
    }

    @NotNull
    public static final ClassId getClassId(@NotNull Class<?> cls) {
        ClassId classIdCreateNestedClassId;
        ClassId classId;
        cls.getClass();
        if (cls.isPrimitive()) {
            i4.a.f(a0.k(cls, "Can't compute ClassId for primitive type: "));
            return null;
        }
        if (cls.isArray()) {
            i4.a.f(a0.k(cls, "Can't compute ClassId for array type: "));
            return null;
        }
        if (cls.getEnclosingMethod() != null || cls.getEnclosingConstructor() != null || cls.getSimpleName().length() == 0) {
            FqName fqName = new FqName(cls.getName());
            return new ClassId(fqName.parent(), FqName.topLevel(fqName.shortName()), true);
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null || (classId = getClassId(declaringClass)) == null || (classIdCreateNestedClassId = classId.createNestedClassId(Name.identifier(cls.getSimpleName()))) == null) {
            classIdCreateNestedClassId = ClassId.topLevel(new FqName(cls.getName()));
        }
        classIdCreateNestedClassId.getClass();
        return classIdCreateNestedClassId;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public static final String getDesc(@NotNull Class<?> cls) {
        cls.getClass();
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String strReplace = cls.getName().replace('.', '/');
                strReplace.getClass();
                return strReplace;
            }
            StringBuilder sb2 = new StringBuilder("L");
            String strReplace2 = cls.getName().replace('.', '/');
            strReplace2.getClass();
            sb2.append(strReplace2);
            sb2.append(';');
            return sb2.toString();
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
        }
        i4.a.f(a0.k(cls, "Unsupported primitive type: "));
        return null;
    }

    @Nullable
    public static final Integer getFunctionClassArity(@NotNull Class<?> cls) {
        cls.getClass();
        return FUNCTION_CLASSES.get(cls);
    }

    @NotNull
    public static final List<Type> getParameterizedTypeArguments(@NotNull Type type) {
        type.getClass();
        if (!(type instanceof ParameterizedType)) {
            return n0.f26529a;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() == null) {
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            actualTypeArguments.getClass();
            return y.T(actualTypeArguments);
        }
        Sequence sequenceD = o80.o.d(type, new Function1<ParameterizedType, ParameterizedType>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt$parameterizedTypeArguments$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final ParameterizedType invoke(@NotNull ParameterizedType parameterizedType2) {
                parameterizedType2.getClass();
                Type ownerType = parameterizedType2.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            }
        });
        ReflectClassUtilKt$parameterizedTypeArguments$2 reflectClassUtilKt$parameterizedTypeArguments$2 = new Function1<ParameterizedType, Sequence<? extends Type>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt$parameterizedTypeArguments$2
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Sequence<Type> invoke(@NotNull ParameterizedType parameterizedType2) {
                parameterizedType2.getClass();
                Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
                actualTypeArguments2.getClass();
                return y.r(actualTypeArguments2);
            }
        };
        sequenceD.getClass();
        reflectClassUtilKt$parameterizedTypeArguments$2.getClass();
        return o80.r.o(new o80.g(sequenceD, reflectClassUtilKt$parameterizedTypeArguments$2, o80.q.f32131a));
    }

    @Nullable
    public static final Class<?> getPrimitiveByWrapper(@NotNull Class<?> cls) {
        cls.getClass();
        return WRAPPER_TO_PRIMITIVE.get(cls);
    }

    @NotNull
    public static final ClassLoader getSafeClassLoader(@NotNull Class<?> cls) {
        cls.getClass();
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        systemClassLoader.getClass();
        return systemClassLoader;
    }

    @Nullable
    public static final Class<?> getWrapperByPrimitive(@NotNull Class<?> cls) {
        cls.getClass();
        return PRIMITIVE_TO_WRAPPER.get(cls);
    }

    public static final boolean isEnumClassOrSpecializedEnumEntryClass(@NotNull Class<?> cls) {
        cls.getClass();
        return Enum.class.isAssignableFrom(cls);
    }
}
