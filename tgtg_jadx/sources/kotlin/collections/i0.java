package kotlin.collections;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class i0 extends h0 {
    public static void s(Iterable iterable, AbstractCollection abstractCollection) {
        abstractCollection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            abstractCollection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static void t(Collection collection, Object[] objArr) {
        collection.getClass();
        objArr.getClass();
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        collection.addAll(listAsList);
    }

    public static final boolean u(Iterable iterable, Function1 function1, boolean z11) {
        Iterator it = iterable.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            if (((Boolean) function1.invoke(it.next())).booleanValue() == z11) {
                it.remove();
                z12 = true;
            }
        }
        return z12;
    }

    public static void v(List list, Function1 function1) {
        int size;
        list.getClass();
        function1.getClass();
        if (!(list instanceof RandomAccess)) {
            u(TypeIntrinsics.asMutableIterable(list), function1, true);
            return;
        }
        int size2 = list.size() - 1;
        int i11 = 0;
        if (size2 >= 0) {
            int i12 = 0;
            while (true) {
                Object obj = list.get(i11);
                if (!((Boolean) function1.invoke(obj)).booleanValue()) {
                    if (i12 != i11) {
                        list.set(i12, obj);
                    }
                    i12++;
                }
                if (i11 == size2) {
                    break;
                } else {
                    i11++;
                }
            }
            i11 = i12;
        }
        if (i11 >= list.size() || i11 > (size = list.size() - 1)) {
            return;
        }
        while (true) {
            list.remove(size);
            if (size == i11) {
                return;
            } else {
                size--;
            }
        }
    }

    public static Object w(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        qc.y.h("List is empty.");
        return null;
    }

    public static Object x(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        }
        qc.y.h("List is empty.");
        return null;
    }

    public static Object y(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(list.size() - 1);
    }
}
