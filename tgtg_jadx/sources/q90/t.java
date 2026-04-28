package q90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements Iterable, KMappedMarker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f36613b = new t(new String[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f36614a;

    public t(String[] strArr) {
        strArr.getClass();
        this.f36614a = strArr;
    }

    public final String b(String str) {
        str.getClass();
        String[] strArr = this.f36614a;
        strArr.getClass();
        str.getClass();
        int length = strArr.length - 2;
        int iA = b80.c.a(length, 0, -2);
        if (iA > length) {
            return null;
        }
        while (!kotlin.text.y.k(str, strArr[length], true)) {
            if (length == iA) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String d(int i11) {
        String str = (String) kotlin.collections.y.D(i11 * 2, this.f36614a);
        if (str != null) {
            return str;
        }
        org.bouncycastle.jce.provider.a.v(w.a0.l("name[", i11, ']'));
        return null;
    }

    public final ax.g0 e() {
        ax.g0 g0Var = new ax.g0(3);
        kotlin.collections.i0.t(g0Var.f4909a, this.f36614a);
        return g0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return Arrays.equals(this.f36614a, ((t) obj).f36614a);
        }
        return false;
    }

    public final String g(int i11) {
        String str = (String) kotlin.collections.y.D((i11 * 2) + 1, this.f36614a);
        if (str != null) {
            return str;
        }
        org.bouncycastle.jce.provider.a.v(w.a0.l("value[", i11, ']'));
        return null;
    }

    public final List h(String str) {
        str.getClass();
        str.getClass();
        int size = size();
        List listUnmodifiableList = null;
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < size; i11++) {
            if (kotlin.text.y.k(str, d(i11), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(g(i11));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
        }
        return listUnmodifiableList == null ? kotlin.collections.n0.f26529a : listUnmodifiableList;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f36614a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i11 = 0; i11 < size; i11++) {
            pairArr[i11] = new Pair(d(i11), g(i11));
        }
        return ArrayIteratorKt.iterator(pairArr);
    }

    public final int size() {
        return this.f36614a.length / 2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            String strD = d(i11);
            String strG = g(i11);
            sb2.append(strD);
            sb2.append(": ");
            if (r90.e.m(strD)) {
                strG = "██";
            }
            sb2.append(strG);
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
