package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends f implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f26506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26509e;

    public f1(Object[] objArr, int i11) {
        this.f26506b = objArr;
        if (i11 < 0) {
            i4.a.i(j4.s.f(i11, "ring buffer filled size should not be negative but it is "));
            throw null;
        }
        if (i11 <= objArr.length) {
            this.f26507c = objArr.length;
            this.f26509e = i11;
        } else {
            i4.a.c(objArr.length, org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "ring buffer filled size: ", " cannot be larger than the buffer size: "));
            throw null;
        }
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.f26509e;
    }

    public final void d(int i11) {
        if (i11 < 0) {
            i4.a.i(j4.s.f(i11, "n shouldn't be negative but it is "));
            return;
        }
        if (i11 > this.f26509e) {
            i4.a.c(this.f26509e, org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "n shouldn't be greater than the buffer size: n = ", ", size = "));
            return;
        }
        if (i11 > 0) {
            int i12 = this.f26508d;
            int i13 = this.f26507c;
            int i14 = (i12 + i11) % i13;
            Object[] objArr = this.f26506b;
            if (i12 > i14) {
                Arrays.fill(objArr, i12, i13, (Object) null);
                Arrays.fill(objArr, 0, i14, (Object) null);
            } else {
                Arrays.fill(objArr, i12, i14, (Object) null);
            }
            this.f26508d = i14;
            this.f26509e -= i11;
        }
    }

    @Override // kotlin.collections.f, java.util.List
    public final Object get(int i11) {
        c cVar = f.f26505a;
        int i12 = this.f26509e;
        cVar.getClass();
        c.b(i11, i12);
        return this.f26506b[(this.f26508d + i11) % this.f26507c];
    }

    @Override // kotlin.collections.f, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new e1(this);
    }

    @Override // kotlin.collections.a, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int length = objArr.length;
        int i11 = this.f26509e;
        if (length < i11) {
            objArr = Arrays.copyOf(objArr, i11);
        }
        int i12 = this.f26509e;
        int i13 = this.f26508d;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            objArr2 = this.f26506b;
            if (i15 >= i12 || i13 >= this.f26507c) {
                break;
            }
            objArr[i15] = objArr2[i13];
            i15++;
            i13++;
        }
        while (i15 < i12) {
            objArr[i15] = objArr2[i14];
            i15++;
            i14++;
        }
        if (i12 < objArr.length) {
            objArr[i12] = null;
        }
        return objArr;
    }

    @Override // kotlin.collections.a, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }
}
