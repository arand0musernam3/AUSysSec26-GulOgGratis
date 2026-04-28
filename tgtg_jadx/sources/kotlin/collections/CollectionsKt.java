package kotlin.collections;

import c5.l3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"kotlin/collections/c0", "kotlin/collections/d0", "kotlin/collections/e0", "kotlin/collections/f0", "kotlin/collections/g0", "kotlin/collections/h0", "kotlin/collections/i0", "kotlin/collections/j0", "kotlin/collections/k0", "kotlin/collections/CollectionsKt___CollectionsKt"}, d2 = {}, k = 4, mv = {2, 3, 0}, xi = 49)
public final class CollectionsKt extends CollectionsKt___CollectionsKt {
    public static l3 F(Iterable iterable) {
        iterable.getClass();
        return new l3(iterable, 3);
    }

    public static double G(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        double dFloatValue = 0.0d;
        int i11 = 0;
        while (it.hasNext()) {
            dFloatValue += (double) ((Number) it.next()).floatValue();
            i11++;
            if (i11 < 0) {
                d0.m();
                throw null;
            }
        }
        if (i11 == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i11);
    }

    public static ArrayList H(Iterable iterable, int i11) {
        iterable.getClass();
        y9.w.k(i11, i11);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            it.getClass();
            Iterator itA = !it.hasNext() ? m0.f26528a : o80.l.a(new k1(i11, i11, it, false, true, null));
            while (itA.hasNext()) {
                arrayList.add((List) itA.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i11) + (size % i11 == 0 ? 0 : 1));
        int i12 = 0;
        while (i12 >= 0 && i12 < size) {
            int i13 = size - i12;
            if (i11 <= i13) {
                i13 = i11;
            }
            ArrayList arrayList3 = new ArrayList(i13);
            for (int i14 = 0; i14 < i13; i14++) {
                arrayList3.add(list.get(i14 + i12));
            }
            arrayList2.add(arrayList3);
            i12 += i11;
        }
        return arrayList2;
    }

    public static boolean I(Iterable iterable, Object obj) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : R(iterable, obj) >= 0;
    }

    public static List J(int i11, List list) {
        list.getClass();
        if (i11 < 0) {
            i4.a.i(r8.k.h(i11, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i11 == 0) {
            return r0(list);
        }
        int size = list.size() - i11;
        if (size <= 0) {
            return n0.f26529a;
        }
        if (size == 1) {
            return c0.c(V(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            while (i11 < size2) {
                arrayList.add(list.get(i11));
                i11++;
            }
        } else {
            ListIterator listIterator = list.listIterator(i11);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static List K(List list) {
        list.getClass();
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return m0(list, size);
    }

    public static ArrayList L(Iterable iterable, Function1 function1) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList M(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object N(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return O((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        qc.y.h("Collection is empty.");
        return null;
    }

    public static Object O(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        qc.y.h("List is empty.");
        return null;
    }

    public static Object P(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object Q(int i11, List list) {
        list.getClass();
        if (i11 < 0 || i11 >= list.size()) {
            return null;
        }
        return list.get(i11);
    }

    public static int R(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i11 = 0;
        for (Object obj2 : iterable) {
            if (i11 < 0) {
                d0.n();
                throw null;
            }
            if (Intrinsics.areEqual(obj, obj2)) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static LinkedHashSet S(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection collectionR0 = iterable2 instanceof Collection ? (Collection) iterable2 : r0(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (collectionR0.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static /* synthetic */ void T(Iterable iterable, StringBuilder sb2, String str, String str2, String str3, Function1 function1, int i11) {
        String str4 = (i11 & 4) != 0 ? "" : str2;
        String str5 = (i11 & 8) != 0 ? "" : str3;
        if ((i11 & 64) != 0) {
            function1 = null;
        }
        CollectionsKt___CollectionsKt.C(iterable, sb2, str, str4, str5, -1, "...", function1);
    }

    public static String U(Iterable iterable, CharSequence charSequence, String str, String str2, Function1 function1, int i11) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence2 = charSequence;
        String str3 = (i11 & 2) != 0 ? "" : str;
        String str4 = (i11 & 4) != 0 ? "" : str2;
        int i12 = (i11 & 8) != 0 ? -1 : 5;
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        iterable.getClass();
        charSequence2.getClass();
        str3.getClass();
        StringBuilder sb2 = new StringBuilder();
        CollectionsKt___CollectionsKt.C(iterable, sb2, charSequence2, str3, str4, i12, "...", function1);
        return sb2.toString();
    }

    public static Object V(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return W((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            qc.y.h("Collection is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object W(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        qc.y.h("List is empty.");
        return null;
    }

    public static Object X(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable Y(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList Z(Iterable iterable, Object obj) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList(e0.o(iterable, 10));
        boolean z11 = false;
        for (Object obj2 : iterable) {
            boolean z12 = true;
            if (!z11 && Intrinsics.areEqual(obj2, obj)) {
                z11 = true;
                z12 = false;
            }
            if (z12) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static List a0(Iterable iterable, List list) {
        list.getClass();
        iterable.getClass();
        Collection collectionR0 = iterable instanceof Collection ? (Collection) iterable : r0(iterable);
        if (collectionR0.isEmpty()) {
            return r0(list);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!collectionR0.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList b0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        if (iterable instanceof Collection) {
            return d0(iterable2, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        i0.s(iterable, arrayList);
        i0.s(iterable2, arrayList);
        return arrayList;
    }

    public static ArrayList c0(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return e0((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        i0.s(iterable, arrayList);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList d0(Iterable iterable, Collection collection) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            i0.s(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList e0(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List f0(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return r0(iterable);
        }
        List listE = CollectionsKt___CollectionsKt.E(iterable);
        Collections.reverse(listE);
        return listE;
    }

    public static Object g0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return h0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            qc.y.h("Collection is empty.");
            return null;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        i4.a.f("Collection has more than one element.");
        return null;
    }

    public static Object h0(List list) {
        list.getClass();
        int size = list.size();
        if (size == 0) {
            qc.y.h("List is empty.");
            return null;
        }
        if (size == 1) {
            return list.get(0);
        }
        i4.a.f("List has more than one element.");
        return null;
    }

    public static Object i0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object j0(List list) {
        list.getClass();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List k0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listE = CollectionsKt___CollectionsKt.E(iterable);
            h0.q(listE);
            return listE;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return r0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return x.c(array);
    }

    public static List l0(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        comparator.getClass();
        if (!(iterable instanceof Collection)) {
            List listE = CollectionsKt___CollectionsKt.E(iterable);
            h0.r(listE, comparator);
            return listE;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return r0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        x.p(comparator, array);
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static List m0(Iterable iterable, int i11) {
        iterable.getClass();
        if (i11 < 0) {
            i4.a.i(r8.k.h(i11, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i11 == 0) {
            return n0.f26529a;
        }
        if (iterable instanceof Collection) {
            if (i11 >= ((Collection) iterable).size()) {
                return r0(iterable);
            }
            if (i11 == 1) {
                return c0.c(N(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i11);
        Iterator it = iterable.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i12++;
            if (i12 == i11) {
                break;
            }
        }
        return d0.k(arrayList);
    }

    public static List n0(int i11, List list) {
        list.getClass();
        if (i11 < 0) {
            i4.a.i(r8.k.h(i11, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i11 == 0) {
            return n0.f26529a;
        }
        int size = list.size();
        if (i11 >= size) {
            return r0(list);
        }
        if (i11 == 1) {
            return c0.c(W(list));
        }
        ArrayList arrayList = new ArrayList(i11);
        if (list instanceof RandomAccess) {
            for (int i12 = size - i11; i12 < size; i12++) {
                arrayList.add(list.get(i12));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i11);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static boolean[] o0(List list) {
        list.getClass();
        boolean[] zArr = new boolean[list.size()];
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            zArr[i11] = ((Boolean) it.next()).booleanValue();
            i11++;
        }
        return zArr;
    }

    public static HashSet p0(ArrayList arrayList) {
        arrayList.getClass();
        HashSet hashSet = new HashSet(w0.a(e0.o(arrayList, 12)));
        CollectionsKt___CollectionsKt.D(arrayList, hashSet);
        return hashSet;
    }

    public static int[] q0(List list) {
        list.getClass();
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = ((Number) it.next()).intValue();
            i11++;
        }
        return iArr;
    }

    public static List r0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return d0.k(CollectionsKt___CollectionsKt.E(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return n0.f26529a;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return c0.c(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static long[] s0(List list) {
        list.getClass();
        long[] jArr = new long[list.size()];
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = ((Number) it.next()).longValue();
            i11++;
        }
        return jArr;
    }

    public static ArrayList t0(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static LinkedHashSet u0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        CollectionsKt___CollectionsKt.D(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set v0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            CollectionsKt___CollectionsKt.D(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            return size != 0 ? size != 1 ? linkedHashSet : g1.b(linkedHashSet.iterator().next()) : p0.f26531a;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return p0.f26531a;
        }
        if (size2 == 1) {
            return g1.b(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(w0.a(collection.size()));
        CollectionsKt___CollectionsKt.D(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static ArrayList w0(ArrayList arrayList, Function1 function1) {
        function1.getClass();
        y9.w.k(2, 1);
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList((size % 1 == 0 ? 0 : 1) + size);
        e eVar = new e(arrayList);
        for (int i11 = 0; i11 >= 0 && i11 < size; i11++) {
            int i12 = size - i11;
            if (2 <= i12) {
                i12 = 2;
            }
            if (i12 < 2) {
                break;
            }
            int i13 = i12 + i11;
            c cVar = f.f26505a;
            int size2 = ((ArrayList) eVar.f26501e).size();
            cVar.getClass();
            c.d(i11, i13, size2);
            eVar.f26499c = i11;
            eVar.f26500d = i13 - i11;
            arrayList2.add(function1.invoke(eVar));
        }
        return arrayList2;
    }

    public static k90.g x0(List list) {
        list.getClass();
        return new k90.g(new jt.g(list, 10), 2);
    }

    public static ArrayList y0(Iterable iterable, Collection collection) {
        iterable.getClass();
        collection.getClass();
        Iterator it = iterable.iterator();
        Iterator it2 = collection.iterator();
        ArrayList arrayList = new ArrayList(Math.min(e0.o(iterable, 10), e0.o(collection, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair(it.next(), it2.next()));
        }
        return arrayList;
    }
}
