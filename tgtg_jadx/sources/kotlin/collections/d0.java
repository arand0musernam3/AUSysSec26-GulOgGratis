package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class d0 extends c0 {
    public static ArrayList d(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new r(objArr, true));
    }

    public static int e(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        l(arrayList.size(), size);
        int i11 = size - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int iA = w70.a.a((Comparable) arrayList.get(i13), comparable);
            if (iA < 0) {
                i12 = i13 + 1;
            } else {
                if (iA <= 0) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    public static IntRange f(Collection collection) {
        collection.getClass();
        return new IntRange(0, collection.size() - 1, 1);
    }

    public static int g(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static List h(Object... objArr) {
        objArr.getClass();
        if (objArr.length <= 0) {
            return n0.f26529a;
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static List i(Object obj) {
        return obj != null ? c0.c(obj) : n0.f26529a;
    }

    public static ArrayList j(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new r(objArr, true));
    }

    public static final List k(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : c0.c(list.get(0)) : n0.f26529a;
    }

    public static final void l(int i11, int i12) {
        if (i12 < 0) {
            i4.a.f(r8.k.h(i12, "fromIndex (0) is greater than toIndex (", ")."));
        } else {
            if (i12 <= i11) {
                return;
            }
            org.bouncycastle.jce.provider.a.v(r8.k.g(i12, i11, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static void m() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void n() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
