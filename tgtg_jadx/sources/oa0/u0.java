package oa0;

import com.adyen.checkout.components.core.Address;
import java.lang.annotation.Annotation;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Type[] f32385a = new Type[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f32386b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Constructor f32387c;

    public static final Object b(d dVar, x70.c cVar) {
        v80.l lVar = new v80.l(1, y70.f.b(cVar));
        lVar.t();
        lVar.v(new r(dVar, 0));
        dVar.g(new n7.k(lVar));
        Object objS = lVar.s();
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        return objS;
    }

    public static final Object c(d dVar, x70.c cVar) {
        v80.l lVar = new v80.l(1, y70.f.b(cVar));
        lVar.t();
        lVar.v(new r(dVar, 1));
        dVar.g(new m1.a(lVar));
        Object objS = lVar.s();
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        return objS;
    }

    public static void d(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            i4.a.h();
        }
    }

    public static boolean e(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return e(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static Type f(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i11 = 0; i11 < length; i11++) {
                Class<?> cls3 = interfaces[i11];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i11];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return f(cls.getGenericInterfaces()[i11], interfaces[i11], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return f(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type g(int i11, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i11 >= 0 && i11 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i11];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbK = org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "Index ", " not in range [0,");
        sbK.append(actualTypeArguments.length);
        sbK.append(") for ");
        sbK.append(parameterizedType);
        throw new IllegalArgumentException(sbK.toString());
    }

    public static Class h(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            i4.a.h();
            return null;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return h(((WildcardType) type).getUpperBounds()[0]);
        }
        StringBuilder sb2 = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        sb2.append(type);
        i1.m(sb2, "> is of type ", type.getClass().getName());
        return null;
    }

    public static Type i(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return p(type, cls, f(type, cls, Map.class));
        }
        i4.a.h();
        return null;
    }

    public static boolean j(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof GenericArrayType) {
                return j(((GenericArrayType) type).getGenericComponentType());
            }
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            i1.k("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? Address.ADDRESS_NULL_PLACEHOLDER : type.getClass().getName());
            return false;
        }
        for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
            if (j(type2)) {
                return true;
            }
        }
        return false;
    }

    public static Object k(Class cls, Object obj, Method method, Object[] objArr) throws NoSuchMethodException {
        Constructor declaredConstructor = f32387c;
        if (declaredConstructor == null) {
            declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            f32387c = declaredConstructor;
        }
        return ((MethodHandles.Lookup) declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    public static boolean l(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static IllegalArgumentException m(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder sbR = e0.f.r(String.format(str, objArr), "\n    for method ");
        sbR.append(method.getDeclaringClass().getSimpleName());
        sbR.append(".");
        sbR.append(method.getName());
        return new IllegalArgumentException(sbR.toString(), exc);
    }

    public static IllegalArgumentException n(Method method, int i11, String str, Object... objArr) {
        return m(method, null, str + " (" + h0.f32292b.c(method, i11) + ")", objArr);
    }

    public static IllegalArgumentException o(Method method, Exception exc, int i11, String str, Object... objArr) {
        return m(method, exc, str + " (" + h0.f32292b.c(method, i11) + ")", objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Type p(java.lang.reflect.Type r8, java.lang.Class r9, java.lang.reflect.Type r10) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oa0.u0.p(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final y70.a q(java.lang.Throwable r5, x70.c r6) {
        /*
            boolean r0 = r6 instanceof oa0.s
            if (r0 == 0) goto L13
            r0 = r6
            oa0.s r0 = (oa0.s) r0
            int r1 = r0.f32374k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32374k = r1
            goto L18
        L13:
            oa0.s r0 = new oa0.s
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f32373j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f32374k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2a
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
        L28:
            r5 = 0
            return r5
        L2a:
            ba0.g.M(r6)
            qc.y.m()
            goto L28
        L31:
            ba0.g.M(r6)
            r0.f32374k = r3
            c90.f r6 = v80.p0.f42144a
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            o30.m0 r3 = new o30.m0
            r4 = 11
            r3.<init>(r4, r0, r5)
            r6.u0(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: oa0.u0.q(java.lang.Throwable, x70.c):y70.a");
    }

    public static void r(Throwable th2) {
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }

    public static String s(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public abstract void a(k0 k0Var, Object obj);
}
