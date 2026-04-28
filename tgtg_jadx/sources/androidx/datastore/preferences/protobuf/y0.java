package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends AbstractList implements RandomAccess, a0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y0 f3062d = new y0(new Object[0], 0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f3064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3065c;

    public y0(Object[] objArr, int i11, boolean z11) {
        this.f3063a = z11;
        this.f3064b = objArr;
        this.f3065c = i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        c();
        if (i11 < 0 || i11 > (i12 = this.f3065c)) {
            org.bouncycastle.jce.provider.a.e(this.f3065c, org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "Index:", ", Size:"));
            return;
        }
        Object[] objArr = this.f3064b;
        if (i12 < objArr.length) {
            System.arraycopy(objArr, i11, objArr, i11 + 1, i12 - i11);
        } else {
            Object[] objArr2 = new Object[((i12 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i11);
            System.arraycopy(this.f3064b, i11, objArr2, i11 + 1, this.f3065c - i11);
            this.f3064b = objArr2;
        }
        this.f3064b[i11] = obj;
        this.f3065c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        return super.addAll(collection);
    }

    public final void b(int i11) {
        if (i11 < 0 || i11 >= this.f3065c) {
            org.bouncycastle.jce.provider.a.e(this.f3065c, org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "Index:", ", Size:"));
        }
    }

    public final void c() {
        if (this.f3063a) {
            return;
        }
        c50.w.d();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        c();
        super.clear();
    }

    public final y0 d(int i11) {
        if (i11 >= this.f3065c) {
            return new y0(Arrays.copyOf(this.f3064b, i11), this.f3065c, true);
        }
        i4.a.h();
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
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
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i11 = 0; i11 < size; i11++) {
            if (!get(i11).equals(list.get(i11))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        b(i11);
        return this.f3064b[i11];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i11 = 0; i11 < size; i11++) {
            iHashCode = (iHashCode * 31) + get(i11).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        c();
        b(i11);
        Object[] objArr = this.f3064b;
        Object obj = objArr[i11];
        if (i11 < this.f3065c - 1) {
            System.arraycopy(objArr, i11 + 1, objArr, i11, (r2 - i11) - 1);
        }
        this.f3065c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        c();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        c();
        b(i11);
        Object[] objArr = this.f3064b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3065c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i11, Collection collection) {
        c();
        return super.addAll(i11, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i11 = this.f3065c;
        Object[] objArr = this.f3064b;
        if (i11 == objArr.length) {
            this.f3064b = Arrays.copyOf(objArr, ((i11 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f3064b;
        int i12 = this.f3065c;
        this.f3065c = i12 + 1;
        objArr2[i12] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
