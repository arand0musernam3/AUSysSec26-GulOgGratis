package q1;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableSet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Collection, Set, KMutableCollection, KMutableSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f35749a = r1.a.f37527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f35750b = r1.a.f37529c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35751c;

    public f(int i11) {
        if (i11 > 0) {
            a0.b(this, i11);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i11;
        int iC;
        int i12 = this.f35751c;
        if (obj == null) {
            iC = a0.c(this, null, 0);
            i11 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i11 = iHashCode;
            iC = a0.c(this, obj, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i13 = ~iC;
        int[] iArr = this.f35749a;
        if (i12 >= iArr.length) {
            int i14 = 8;
            if (i12 >= 8) {
                i14 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i14 = 4;
            }
            Object[] objArr = this.f35750b;
            int[] iArr2 = new int[i14];
            this.f35749a = iArr2;
            this.f35750b = new Object[i14];
            if (i12 != this.f35751c) {
                org.bouncycastle.jce.provider.a.o();
                return false;
            }
            if (iArr2.length != 0) {
                kotlin.collections.x.j(0, iArr, iArr.length, 6, iArr2);
                kotlin.collections.x.i(0, objArr.length, 6, objArr, this.f35750b);
            }
        }
        if (i13 < i12) {
            int[] iArr3 = this.f35749a;
            int i15 = i13 + 1;
            kotlin.collections.x.f(i15, iArr3, i13, i12, iArr3);
            Object[] objArr2 = this.f35750b;
            kotlin.collections.x.d(i15, i13, i12, objArr2, objArr2);
        }
        int i16 = this.f35751c;
        if (i12 == i16) {
            int[] iArr4 = this.f35749a;
            if (i13 < iArr4.length) {
                iArr4[i13] = i11;
                this.f35750b[i13] = obj;
                this.f35751c = i16 + 1;
                return true;
            }
        }
        org.bouncycastle.jce.provider.a.o();
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.f35751c;
        int i11 = this.f35751c;
        int[] iArr = this.f35749a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f35750b;
            int[] iArr2 = new int[size];
            this.f35749a = iArr2;
            this.f35750b = new Object[size];
            if (i11 > 0) {
                kotlin.collections.x.j(0, iArr, i11, 6, iArr2);
                kotlin.collections.x.i(0, this.f35751c, 6, objArr, this.f35750b);
            }
        }
        if (this.f35751c != i11) {
            org.bouncycastle.jce.provider.a.o();
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final Object b(int i11) {
        int i12 = this.f35751c;
        Object[] objArr = this.f35750b;
        Object obj = objArr[i11];
        if (i12 <= 1) {
            clear();
            return obj;
        }
        int i13 = i12 - 1;
        int[] iArr = this.f35749a;
        if (iArr.length <= 8 || i12 >= iArr.length / 3) {
            if (i11 < i13) {
                int i14 = i11 + 1;
                kotlin.collections.x.f(i11, iArr, i14, i12, iArr);
                Object[] objArr2 = this.f35750b;
                kotlin.collections.x.d(i11, i14, i12, objArr2, objArr2);
            }
            this.f35750b[i13] = null;
        } else {
            int i15 = i12 > 8 ? i12 + (i12 >> 1) : 8;
            int[] iArr2 = new int[i15];
            this.f35749a = iArr2;
            this.f35750b = new Object[i15];
            if (i11 > 0) {
                kotlin.collections.x.j(0, iArr, i11, 6, iArr2);
                kotlin.collections.x.i(0, i11, 6, objArr, this.f35750b);
            }
            if (i11 < i13) {
                int i16 = i11 + 1;
                kotlin.collections.x.f(i11, iArr, i16, i12, this.f35749a);
                kotlin.collections.x.d(i11, i16, i12, objArr, this.f35750b);
            }
        }
        if (i12 == this.f35751c) {
            this.f35751c = i13;
            return obj;
        }
        org.bouncycastle.jce.provider.a.o();
        return null;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f35751c != 0) {
            this.f35749a = r1.a.f37527a;
            this.f35750b = r1.a.f37529c;
            this.f35751c = 0;
        }
        if (this.f35751c == 0) {
            return;
        }
        org.bouncycastle.jce.provider.a.o();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? a0.c(this, null, 0) : a0.c(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f35751c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i11 = this.f35751c;
            for (int i12 = 0; i12 < i11; i12++) {
                if (!((Set) obj).contains(this.f35750b[i12])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f35749a;
        int i11 = this.f35751c;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 += iArr[i13];
        }
        return i12;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f35751c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iC = obj == null ? a0.c(this, null, 0) : a0.c(this, obj, obj.hashCode());
        if (iC < 0) {
            return false;
        }
        b(iC);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z11 = false;
        for (int i11 = this.f35751c - 1; -1 < i11; i11--) {
            if (!CollectionsKt.I(collection, this.f35750b[i11])) {
                b(i11);
                z11 = true;
            }
        }
        return z11;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f35751c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i11 = this.f35751c;
        if (objArr.length < i11) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i11);
        } else if (objArr.length > i11) {
            objArr[i11] = null;
        }
        kotlin.collections.x.d(0, 0, this.f35751c, this.f35750b, objArr);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f35751c * 14);
        sb2.append('{');
        int i11 = this.f35751c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f35750b[i12];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return kotlin.collections.x.l(this.f35750b, 0, this.f35751c);
    }
}
