package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k2 extends o0 implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object[] f11554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k2 f11555e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f11556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11557c;

    static {
        Object[] objArr = new Object[0];
        f11554d = objArr;
        f11555e = new k2(objArr, 0, false);
    }

    public k2(Object[] objArr, int i11, boolean z11) {
        super(z11);
        this.f11556b = objArr;
        this.f11557c = i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        b();
        if (i11 < 0 || i11 > (i12 = this.f11557c)) {
            org.bouncycastle.jce.provider.a.v(q0.c(this.f11557c, i11, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i13 = i11 + 1;
        Object[] objArr = this.f11556b;
        int length = objArr.length;
        if (i12 < length) {
            System.arraycopy(objArr, i11, objArr, i13, i12 - i11);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f11556b, 0, objArr2, 0, i11);
            System.arraycopy(this.f11556b, i11, objArr2, i13, this.f11557c - i11);
            this.f11556b = objArr2;
        }
        this.f11556b[i11] = obj;
        this.f11557c++;
        ((AbstractList) this).modCount++;
    }

    public final void c(int i11) {
        if (i11 < 0 || i11 >= this.f11557c) {
            org.bouncycastle.jce.provider.a.v(q0.c(this.f11557c, i11, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.o0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int i11 = this.f11557c;
        if (i11 != list.size()) {
            return false;
        }
        if (!(obj instanceof k2)) {
            for (int i12 = 0; i12 < i11; i12++) {
                if (!this.f11556b[i12].equals(list.get(i12))) {
                    return false;
                }
            }
            return true;
        }
        k2 k2Var = (k2) obj;
        for (int i13 = 0; i13 < i11; i13++) {
            if (!this.f11556b[i13].equals(k2Var.f11556b[i13])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        c(i11);
        return this.f11556b[i11];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = this.f11557c;
        int iHashCode = 1;
        for (int i12 = 0; i12 < i11; i12++) {
            iHashCode = (iHashCode * 31) + this.f11556b[i12].hashCode();
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.measurement.t1
    public final /* bridge */ /* synthetic */ t1 k(int i11) {
        if (i11 >= this.f11557c) {
            return new k2(i11 == 0 ? f11554d : Arrays.copyOf(this.f11556b, i11), this.f11557c, true);
        }
        i4.a.h();
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.o0, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        b();
        c(i11);
        Object[] objArr = this.f11556b;
        Object obj = objArr[i11];
        if (i11 < this.f11557c - 1) {
            System.arraycopy(objArr, i11 + 1, objArr, i11, (r2 - i11) - 1);
        }
        this.f11557c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        b();
        c(i11);
        Object[] objArr = this.f11556b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11557c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i11 = this.f11557c;
        int length = this.f11556b.length;
        if (i11 == length) {
            this.f11556b = Arrays.copyOf(this.f11556b, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.f11556b;
        int i12 = this.f11557c;
        this.f11557c = i12 + 1;
        objArr[i12] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
