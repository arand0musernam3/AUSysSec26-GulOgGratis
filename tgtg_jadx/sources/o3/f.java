package o3;

import java.util.List;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final void a(int i11, List list) {
        int size = list.size();
        if (i11 < 0 || i11 >= size) {
            c(i11, size);
        }
    }

    public static final void b(List list, int i11, int i12) {
        if (i11 > i12) {
            f(i11, i12);
        }
        if (i11 < 0) {
            d(i11);
        }
        if (i12 > list.size()) {
            e(i12, list.size());
        }
    }

    private static final void c(int i11, int i12) {
        throw new IndexOutOfBoundsException(k.g(i11, i12, "Index ", " is out of bounds. The list has ", " elements."));
    }

    private static final void d(int i11) {
        throw new IndexOutOfBoundsException(k.h(i11, "fromIndex (", ") is less than 0."));
    }

    private static final void e(int i11, int i12) {
        throw new IndexOutOfBoundsException("toIndex (" + i11 + ") is more than than the list size (" + i12 + ')');
    }

    private static final void f(int i11, int i12) {
        throw new IllegalArgumentException(k.g(i11, i12, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
    }
}
