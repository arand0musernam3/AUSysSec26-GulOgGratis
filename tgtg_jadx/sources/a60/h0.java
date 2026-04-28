package a60;

import com.adyen.checkout.components.core.Address;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import java.io.EOFException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;
import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f874a = new a(5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f875b = new d0(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f876c = new d0(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d0 f877d = new d0(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d0 f878e = new d0(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d0 f879f = new d0(5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d0 f880g = new d0(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d0 f881h = new d0(7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d0 f882i = new d0(8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d0 f883j = new d0(0);

    public static final k a(b0 b0Var, KType kType) {
        boolean z11;
        b0Var.getClass();
        kType.getClass();
        k kVarA = b0Var.a(TypesJVMKt.getJavaType(kType), b60.f.f6049a, null);
        return ((kVarA instanceof b60.b) || ((z11 = kVarA instanceof b60.a))) ? kVarA : kType.isMarkedNullable() ? kVarA.c() : z11 ? kVarA : new b60.a(kVarA);
    }

    public static Type b(Type type) {
        if (!Collection.class.isAssignableFrom(Collection.class)) {
            i4.a.h();
            return null;
        }
        Type typeF = b60.f.f(type, Collection.class, b60.f.c(type, Collection.class, Collection.class), new LinkedHashSet());
        if (typeF instanceof WildcardType) {
            typeF = ((WildcardType) typeF).getUpperBounds()[0];
        }
        return typeF instanceof ParameterizedType ? ((ParameterizedType) typeF).getActualTypeArguments()[0] : Object.class;
    }

    public static boolean c(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type2 instanceof GenericArrayType ? c(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType()) : type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return c(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof b60.d ? ((b60.d) parameterizedType).f6046c : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof b60.d ? ((b60.d) parameterizedType2).f6046c : parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return c(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (type2 instanceof GenericArrayType) {
                return c(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    public static String d(int i11, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb2 = new StringBuilder("$");
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = iArr[i12];
            if (i13 == 1 || i13 == 2) {
                sb2.append('[');
                sb2.append(iArr2[i12]);
                sb2.append(']');
            } else if (i13 == 3 || i13 == 4 || i13 == 5) {
                sb2.append('.');
                String str = strArr[i12];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    public static Class e(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return e(((WildcardType) type).getUpperBounds()[0]);
        }
        i1.k("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? Address.ADDRESS_NULL_PLACEHOLDER : type.getClass().getName());
        return null;
    }

    public static b60.d g(Type... typeArr) {
        if (typeArr.length != 0) {
            return new b60.d(null, List.class, typeArr);
        }
        i4.a.f(w.a0.k(List.class, "Missing type arguments for "));
        return null;
    }

    public static int h(p pVar, String str, int i11, int i12) throws EOFException, JsonEncodingException {
        int iJ = pVar.J();
        if (iJ >= i11 && iJ <= i12) {
            return iJ;
        }
        throw new JsonDataException("Expected " + str + " but was " + iJ + " at path " + pVar.B());
    }

    public abstract Object f();
}
