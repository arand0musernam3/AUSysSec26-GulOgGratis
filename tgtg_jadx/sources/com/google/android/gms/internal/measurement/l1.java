package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l1 extends o0 implements RandomAccess, o1, i2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f11580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l1 f11581e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f11582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11583c;

    static {
        int[] iArr = new int[0];
        f11580d = iArr;
        f11581e = new l1(iArr, 0, false);
    }

    public l1(int[] iArr, int i11, boolean z11) {
        super(z11);
        this.f11582b = iArr;
        this.f11583c = i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        int iIntValue = ((Integer) obj).intValue();
        b();
        if (i11 < 0 || i11 > (i12 = this.f11583c)) {
            org.bouncycastle.jce.provider.a.v(q0.c(this.f11583c, i11, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i13 = i11 + 1;
        int[] iArr = this.f11582b;
        int length = iArr.length;
        if (i12 < length) {
            System.arraycopy(iArr, i11, iArr, i13, i12 - i11);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f11582b, 0, iArr2, 0, i11);
            System.arraycopy(this.f11582b, i11, iArr2, i13, this.f11583c - i11);
            this.f11582b = iArr2;
        }
        this.f11582b[i11] = iIntValue;
        this.f11583c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.o0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        collection.getClass();
        if (!(collection instanceof l1)) {
            return super.addAll(collection);
        }
        l1 l1Var = (l1) collection;
        int i11 = l1Var.f11583c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f11583c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        int[] iArr = this.f11582b;
        if (i13 > iArr.length) {
            this.f11582b = Arrays.copyOf(iArr, i13);
        }
        System.arraycopy(l1Var.f11582b, 0, this.f11582b, this.f11583c, l1Var.f11583c);
        this.f11583c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.t1
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final l1 k(int i11) {
        if (i11 >= this.f11583c) {
            return new l1(i11 == 0 ? f11580d : Arrays.copyOf(this.f11582b, i11), this.f11583c, true);
        }
        i4.a.h();
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i11) {
        g(i11);
        return this.f11582b[i11];
    }

    public final void e(int i11) {
        b();
        int i12 = this.f11583c;
        int length = this.f11582b.length;
        if (i12 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f11582b, 0, iArr, 0, this.f11583c);
            this.f11582b = iArr;
        }
        int[] iArr2 = this.f11582b;
        int i13 = this.f11583c;
        this.f11583c = i13 + 1;
        iArr2[i13] = i11;
    }

    @Override // com.google.android.gms.internal.measurement.o0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return super.equals(obj);
        }
        l1 l1Var = (l1) obj;
        if (this.f11583c != l1Var.f11583c) {
            return false;
        }
        int[] iArr = l1Var.f11582b;
        for (int i11 = 0; i11 < this.f11583c; i11++) {
            if (this.f11582b[i11] != iArr[i11]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i11) {
        if (i11 < 0 || i11 >= this.f11583c) {
            org.bouncycastle.jce.provider.a.v(q0.c(this.f11583c, i11, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        g(i11);
        return Integer.valueOf(this.f11582b[i11]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f11583c; i12++) {
            i11 = (i11 * 31) + this.f11582b[i12];
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i11 = this.f11583c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f11582b[i12] == iIntValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.o0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        b();
        g(i11);
        int[] iArr = this.f11582b;
        int i12 = iArr[i11];
        if (i11 < this.f11583c - 1) {
            System.arraycopy(iArr, i11 + 1, iArr, i11, (r2 - i11) - 1);
        }
        this.f11583c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i11, int i12) {
        b();
        if (i12 < i11) {
            org.bouncycastle.jce.provider.a.v("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.f11582b;
        System.arraycopy(iArr, i12, iArr, i11, this.f11583c - i12);
        this.f11583c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        b();
        g(i11);
        int[] iArr = this.f11582b;
        int i12 = iArr[i11];
        iArr[i11] = iIntValue;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11583c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Integer) obj).intValue());
        return true;
    }
}
