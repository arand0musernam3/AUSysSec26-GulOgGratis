package q1;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object[] f35730a = new Object[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o0 f35731b = new o0(0);

    public static final void a(int i11, List list) {
        int size = list.size();
        if (i11 < 0 || i11 >= size) {
            org.bouncycastle.jce.provider.a.v(r8.k.g(i11, size, "Index ", " is out of bounds. The list has ", " elements."));
        }
    }

    public static final void b(List list, int i11, int i12) {
        int size = list.size();
        if (i11 > i12) {
            i4.a.f(r8.k.g(i11, i12, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
            return;
        }
        if (i11 < 0) {
            org.bouncycastle.jce.provider.a.v(r8.k.h(i11, "fromIndex (", ") is less than 0."));
            return;
        }
        if (i12 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is more than than the list size (" + size + ')');
    }
}
