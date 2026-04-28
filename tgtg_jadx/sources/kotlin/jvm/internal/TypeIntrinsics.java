package kotlin.jvm.internal;

import com.adyen.checkout.components.core.Address;
import i80.a;
import i80.b;
import i80.c;
import i80.d;
import i80.e;
import i80.f;
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
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableIterable;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.jvm.internal.markers.KMutableSet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class TypeIntrinsics {
    public static Collection asMutableCollection(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableCollection)) {
            throwCce(obj, "kotlin.collections.MutableCollection");
        }
        return castToCollection(obj);
    }

    public static Iterable asMutableIterable(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableIterable)) {
            throwCce(obj, "kotlin.collections.MutableIterable");
        }
        return castToIterable(obj);
    }

    public static Iterator asMutableIterator(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableIterator)) {
            throwCce(obj, "kotlin.collections.MutableIterator");
        }
        return castToIterator(obj);
    }

    public static List asMutableList(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableList)) {
            throwCce(obj, "kotlin.collections.MutableList");
        }
        return castToList(obj);
    }

    public static ListIterator asMutableListIterator(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableListIterator)) {
            throwCce(obj, "kotlin.collections.MutableListIterator");
        }
        return castToListIterator(obj);
    }

    public static Map asMutableMap(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableMap)) {
            throwCce(obj, "kotlin.collections.MutableMap");
        }
        return castToMap(obj);
    }

    public static Map.Entry asMutableMapEntry(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableMap.Entry)) {
            throwCce(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return castToMapEntry(obj);
    }

    public static Set asMutableSet(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableSet)) {
            throwCce(obj, "kotlin.collections.MutableSet");
        }
        return castToSet(obj);
    }

    public static Object beforeCheckcastToFunctionOfArity(Object obj, int i11) {
        if (obj != null && !isFunctionOfArity(obj, i11)) {
            throwCce(obj, "kotlin.jvm.functions.Function" + i11);
        }
        return obj;
    }

    public static Collection castToCollection(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e5) {
            throw throwCce(e5);
        }
    }

    public static Iterable castToIterable(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e5) {
            throw throwCce(e5);
        }
    }

    public static Iterator castToIterator(Object obj) {
        try {
            return (Iterator) obj;
        } catch (ClassCastException e5) {
            throw throwCce(e5);
        }
    }

    public static List castToList(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e5) {
            throw throwCce(e5);
        }
    }

    public static ListIterator castToListIterator(Object obj) {
        try {
            return (ListIterator) obj;
        } catch (ClassCastException e5) {
            throw throwCce(e5);
        }
    }

    public static Map castToMap(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e5) {
            throw throwCce(e5);
        }
    }

    public static Map.Entry castToMapEntry(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e5) {
            throw throwCce(e5);
        }
    }

    public static Set castToSet(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e5) {
            throw throwCce(e5);
        }
    }

    public static int getFunctionArity(Object obj) {
        if (obj instanceof FunctionBase) {
            return ((FunctionBase) obj).getArity();
        }
        if (obj instanceof Function0) {
            return 0;
        }
        if (obj instanceof Function1) {
            return 1;
        }
        if (obj instanceof Function2) {
            return 2;
        }
        if (obj instanceof n) {
            return 3;
        }
        if (obj instanceof o) {
            return 4;
        }
        if (obj instanceof p) {
            return 5;
        }
        if (obj instanceof q) {
            return 6;
        }
        if (obj instanceof r) {
            return 7;
        }
        if (obj instanceof s) {
            return 8;
        }
        if (obj instanceof t) {
            return 9;
        }
        if (obj instanceof a) {
            return 10;
        }
        if (obj instanceof b) {
            return 11;
        }
        if (obj instanceof c) {
            return 12;
        }
        if (obj instanceof d) {
            return 13;
        }
        if (obj instanceof e) {
            return 14;
        }
        if (obj instanceof f) {
            return 15;
        }
        if (obj instanceof g) {
            return 16;
        }
        if (obj instanceof h) {
            return 17;
        }
        if (obj instanceof i) {
            return 18;
        }
        if (obj instanceof j) {
            return 19;
        }
        if (obj instanceof k) {
            return 20;
        }
        if (obj instanceof l) {
            return 21;
        }
        return obj instanceof m ? 22 : -1;
    }

    public static boolean isFunctionOfArity(Object obj, int i11) {
        return (obj instanceof u70.f) && getFunctionArity(obj) == i11;
    }

    public static boolean isMutableCollection(Object obj) {
        if (obj instanceof Collection) {
            return !(obj instanceof KMappedMarker) || (obj instanceof KMutableCollection);
        }
        return false;
    }

    public static boolean isMutableIterable(Object obj) {
        if (obj instanceof Iterable) {
            return !(obj instanceof KMappedMarker) || (obj instanceof KMutableIterable);
        }
        return false;
    }

    public static boolean isMutableIterator(Object obj) {
        if (obj instanceof Iterator) {
            return !(obj instanceof KMappedMarker) || (obj instanceof KMutableIterator);
        }
        return false;
    }

    public static boolean isMutableList(Object obj) {
        if (obj instanceof List) {
            return !(obj instanceof KMappedMarker) || (obj instanceof KMutableList);
        }
        return false;
    }

    public static boolean isMutableListIterator(Object obj) {
        if (obj instanceof ListIterator) {
            return !(obj instanceof KMappedMarker) || (obj instanceof KMutableListIterator);
        }
        return false;
    }

    public static boolean isMutableMap(Object obj) {
        if (obj instanceof Map) {
            return !(obj instanceof KMappedMarker) || (obj instanceof KMutableMap);
        }
        return false;
    }

    public static boolean isMutableMapEntry(Object obj) {
        if (obj instanceof Map.Entry) {
            return !(obj instanceof KMappedMarker) || (obj instanceof KMutableMap.Entry);
        }
        return false;
    }

    public static boolean isMutableSet(Object obj) {
        if (obj instanceof Set) {
            return !(obj instanceof KMappedMarker) || (obj instanceof KMutableSet);
        }
        return false;
    }

    private static <T extends Throwable> T sanitizeStackTrace(T t9) {
        return (T) Intrinsics.sanitizeStackTrace(t9, TypeIntrinsics.class.getName());
    }

    public static void throwCce(Object obj, String str) {
        throwCce((obj == null ? Address.ADDRESS_NULL_PLACEHOLDER : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static Collection asMutableCollection(Object obj, String str) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableCollection)) {
            throwCce(str);
        }
        return castToCollection(obj);
    }

    public static Iterable asMutableIterable(Object obj, String str) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableIterable)) {
            throwCce(str);
        }
        return castToIterable(obj);
    }

    public static Iterator asMutableIterator(Object obj, String str) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableIterator)) {
            throwCce(str);
        }
        return castToIterator(obj);
    }

    public static List asMutableList(Object obj, String str) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableList)) {
            throwCce(str);
        }
        return castToList(obj);
    }

    public static ListIterator asMutableListIterator(Object obj, String str) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableListIterator)) {
            throwCce(str);
        }
        return castToListIterator(obj);
    }

    public static Map asMutableMap(Object obj, String str) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableMap)) {
            throwCce(str);
        }
        return castToMap(obj);
    }

    public static Map.Entry asMutableMapEntry(Object obj, String str) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableMap.Entry)) {
            throwCce(str);
        }
        return castToMapEntry(obj);
    }

    public static Set asMutableSet(Object obj, String str) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableSet)) {
            throwCce(str);
        }
        return castToSet(obj);
    }

    public static Object beforeCheckcastToFunctionOfArity(Object obj, int i11, String str) {
        if (obj != null && !isFunctionOfArity(obj, i11)) {
            throwCce(str);
        }
        return obj;
    }

    public static void throwCce(String str) {
        throw throwCce(new ClassCastException(str));
    }

    public static ClassCastException throwCce(ClassCastException classCastException) {
        throw ((ClassCastException) sanitizeStackTrace(classCastException));
    }
}
