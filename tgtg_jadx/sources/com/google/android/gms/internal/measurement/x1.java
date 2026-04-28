package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x1 extends o0 implements RandomAccess, s1, i2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f12024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x1 f12025e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f12026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12027c;

    static {
        long[] jArr = new long[0];
        f12024d = jArr;
        f12025e = new x1(jArr, 0, false);
    }

    public x1(long[] jArr, int i11, boolean z11) {
        super(z11);
        this.f12026b = jArr;
        this.f12027c = i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        long jLongValue = ((Long) obj).longValue();
        b();
        if (i11 < 0 || i11 > (i12 = this.f12027c)) {
            org.bouncycastle.jce.provider.a.v(q0.c(this.f12027c, i11, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i13 = i11 + 1;
        long[] jArr = this.f12026b;
        int length = jArr.length;
        if (i12 < length) {
            System.arraycopy(jArr, i11, jArr, i13, i12 - i11);
        } else {
            long[] jArr2 = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f12026b, 0, jArr2, 0, i11);
            System.arraycopy(this.f12026b, i11, jArr2, i13, this.f12027c - i11);
            this.f12026b = jArr2;
        }
        this.f12026b[i11] = jLongValue;
        this.f12027c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.o0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        collection.getClass();
        if (!(collection instanceof x1)) {
            return super.addAll(collection);
        }
        x1 x1Var = (x1) collection;
        int i11 = x1Var.f12027c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f12027c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        long[] jArr = this.f12026b;
        if (i13 > jArr.length) {
            this.f12026b = Arrays.copyOf(jArr, i13);
        }
        System.arraycopy(x1Var.f12026b, 0, this.f12026b, this.f12027c, x1Var.f12027c);
        this.f12027c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final long c(int i11) {
        g(i11);
        return this.f12026b[i11];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.t1
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final x1 k(int i11) {
        if (i11 >= this.f12027c) {
            return new x1(i11 == 0 ? f12024d : Arrays.copyOf(this.f12026b, i11), this.f12027c, true);
        }
        i4.a.h();
        return null;
    }

    public final void e(long j9) {
        b();
        int i11 = this.f12027c;
        int length = this.f12026b.length;
        if (i11 == length) {
            long[] jArr = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f12026b, 0, jArr, 0, this.f12027c);
            this.f12026b = jArr;
        }
        long[] jArr2 = this.f12026b;
        int i12 = this.f12027c;
        this.f12027c = i12 + 1;
        jArr2[i12] = j9;
    }

    @Override // com.google.android.gms.internal.measurement.o0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return super.equals(obj);
        }
        x1 x1Var = (x1) obj;
        if (this.f12027c != x1Var.f12027c) {
            return false;
        }
        long[] jArr = x1Var.f12026b;
        for (int i11 = 0; i11 < this.f12027c; i11++) {
            if (this.f12026b[i11] != jArr[i11]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i11) {
        if (i11 < 0 || i11 >= this.f12027c) {
            org.bouncycastle.jce.provider.a.v(q0.c(this.f12027c, i11, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        g(i11);
        return Long.valueOf(this.f12026b[i11]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f12027c; i12++) {
            long j9 = this.f12026b[i12];
            byte[] bArr = r1.f11808a;
            i11 = (i11 * 31) + ((int) (j9 ^ (j9 >>> 32)));
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i11 = this.f12027c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f12026b[i12] == jLongValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.o0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        b();
        g(i11);
        long[] jArr = this.f12026b;
        long j9 = jArr[i11];
        if (i11 < this.f12027c - 1) {
            System.arraycopy(jArr, i11 + 1, jArr, i11, (r3 - i11) - 1);
        }
        this.f12027c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j9);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i11, int i12) {
        b();
        if (i12 < i11) {
            org.bouncycastle.jce.provider.a.v("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.f12026b;
        System.arraycopy(jArr, i12, jArr, i11, this.f12027c - i12);
        this.f12027c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        b();
        g(i11);
        long[] jArr = this.f12026b;
        long j9 = jArr[i11];
        jArr[i11] = jLongValue;
        return Long.valueOf(j9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12027c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Long) obj).longValue());
        return true;
    }
}
