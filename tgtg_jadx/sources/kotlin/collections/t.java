package kotlin.collections;

import com.braze.h2;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final s f26538d = new s(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object[] f26539e = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f26541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26542c;

    public t(int i11) {
        Object[] objArr;
        if (i11 == 0) {
            objArr = f26539e;
        } else {
            if (i11 <= 0) {
                i4.a.f(j4.s.f(i11, "Illegal Capacity: "));
                throw null;
            }
            objArr = new Object[i11];
        }
        this.f26541b = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        c cVar = f.f26505a;
        int i12 = this.f26542c;
        cVar.getClass();
        c.c(i11, i12);
        if (i11 == this.f26542c) {
            addLast(obj);
            return;
        }
        if (i11 == 0) {
            addFirst(obj);
            return;
        }
        o();
        g(this.f26542c + 1);
        int iN = n(this.f26540a + i11);
        int i13 = this.f26542c;
        if (i11 < ((i13 + 1) >> 1)) {
            int iB = iN == 0 ? y.B(this.f26541b) : iN - 1;
            int i14 = this.f26540a;
            int iB2 = i14 == 0 ? y.B(this.f26541b) : i14 - 1;
            int i15 = this.f26540a;
            Object[] objArr = this.f26541b;
            if (iB >= i15) {
                objArr[iB2] = objArr[i15];
                x.d(i15, i15 + 1, iB + 1, objArr, objArr);
            } else {
                x.d(i15 - 1, i15, objArr.length, objArr, objArr);
                Object[] objArr2 = this.f26541b;
                objArr2[objArr2.length - 1] = objArr2[0];
                x.d(0, 1, iB + 1, objArr2, objArr2);
            }
            this.f26541b[iB] = obj;
            this.f26540a = iB2;
        } else {
            int iN2 = n(i13 + this.f26540a);
            Object[] objArr3 = this.f26541b;
            if (iN < iN2) {
                x.d(iN + 1, iN, iN2, objArr3, objArr3);
            } else {
                x.d(1, 0, iN2, objArr3, objArr3);
                Object[] objArr4 = this.f26541b;
                objArr4[0] = objArr4[objArr4.length - 1];
                x.d(iN + 1, iN, objArr4.length - 1, objArr4, objArr4);
            }
            this.f26541b[iN] = obj;
        }
        this.f26542c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i11, Collection collection) {
        collection.getClass();
        c cVar = f.f26505a;
        int i12 = this.f26542c;
        cVar.getClass();
        c.c(i11, i12);
        if (collection.isEmpty()) {
            return false;
        }
        if (i11 == this.f26542c) {
            return addAll(collection);
        }
        o();
        g(collection.size() + this.f26542c);
        int iN = n(this.f26542c + this.f26540a);
        int iN2 = n(this.f26540a + i11);
        int size = collection.size();
        if (i11 >= ((this.f26542c + 1) >> 1)) {
            int i13 = iN2 + size;
            Object[] objArr = this.f26541b;
            if (iN2 < iN) {
                int i14 = size + iN;
                if (i14 <= objArr.length) {
                    x.d(i13, iN2, iN, objArr, objArr);
                } else if (i13 >= objArr.length) {
                    x.d(i13 - objArr.length, iN2, iN, objArr, objArr);
                } else {
                    int length = iN - (i14 - objArr.length);
                    x.d(0, length, iN, objArr, objArr);
                    Object[] objArr2 = this.f26541b;
                    x.d(i13, iN2, length, objArr2, objArr2);
                }
            } else {
                x.d(size, 0, iN, objArr, objArr);
                Object[] objArr3 = this.f26541b;
                if (i13 >= objArr3.length) {
                    x.d(i13 - objArr3.length, iN2, objArr3.length, objArr3, objArr3);
                } else {
                    x.d(0, objArr3.length - size, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.f26541b;
                    x.d(i13, iN2, objArr4.length - size, objArr4, objArr4);
                }
            }
            e(iN2, collection);
            return true;
        }
        int i15 = this.f26540a;
        int length2 = i15 - size;
        Object[] objArr5 = this.f26541b;
        if (iN2 < i15) {
            x.d(length2, i15, objArr5.length, objArr5, objArr5);
            Object[] objArr6 = this.f26541b;
            if (size >= iN2) {
                x.d(objArr6.length - size, 0, iN2, objArr6, objArr6);
            } else {
                x.d(objArr6.length - size, 0, size, objArr6, objArr6);
                Object[] objArr7 = this.f26541b;
                x.d(0, size, iN2, objArr7, objArr7);
            }
        } else if (length2 >= 0) {
            x.d(length2, i15, iN2, objArr5, objArr5);
        } else {
            length2 += objArr5.length;
            int i16 = iN2 - i15;
            int length3 = objArr5.length - length2;
            if (length3 >= i16) {
                x.d(length2, i15, iN2, objArr5, objArr5);
            } else {
                x.d(length2, i15, i15 + length3, objArr5, objArr5);
                Object[] objArr8 = this.f26541b;
                x.d(0, this.f26540a + length3, iN2, objArr8, objArr8);
            }
        }
        this.f26540a = length2;
        e(l(iN2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        o();
        g(this.f26542c + 1);
        int i11 = this.f26540a;
        int iB = i11 == 0 ? y.B(this.f26541b) : i11 - 1;
        this.f26540a = iB;
        this.f26541b[iB] = obj;
        this.f26542c++;
    }

    public final void addLast(Object obj) {
        o();
        g(b() + 1);
        this.f26541b[n(b() + this.f26540a)] = obj;
        this.f26542c = b() + 1;
    }

    @Override // kotlin.collections.m
    public final int b() {
        return this.f26542c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            o();
            m(this.f26540a, n(b() + this.f26540a));
        }
        this.f26540a = 0;
        this.f26542c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kotlin.collections.m
    public final Object d(int i11) {
        c cVar = f.f26505a;
        int i12 = this.f26542c;
        cVar.getClass();
        c.b(i11, i12);
        if (i11 == b() - 1) {
            return removeLast();
        }
        if (i11 == 0) {
            return removeFirst();
        }
        o();
        int iN = n(this.f26540a + i11);
        Object[] objArr = this.f26541b;
        Object obj = objArr[iN];
        int i13 = this.f26542c >> 1;
        int i14 = this.f26540a;
        if (i11 < i13) {
            if (iN >= i14) {
                x.d(i14 + 1, i14, iN, objArr, objArr);
            } else {
                x.d(1, 0, iN, objArr, objArr);
                Object[] objArr2 = this.f26541b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i15 = this.f26540a;
                x.d(i15 + 1, i15, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f26541b;
            int i16 = this.f26540a;
            objArr3[i16] = null;
            this.f26540a = i(i16);
        } else {
            int iN2 = n((b() - 1) + i14);
            Object[] objArr4 = this.f26541b;
            if (iN <= iN2) {
                x.d(iN, iN + 1, iN2 + 1, objArr4, objArr4);
            } else {
                x.d(iN, iN + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f26541b;
                objArr5[objArr5.length - 1] = objArr5[0];
                x.d(0, 1, iN2 + 1, objArr5, objArr5);
            }
            this.f26541b[iN2] = null;
        }
        this.f26542c--;
        return obj;
    }

    public final void e(int i11, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f26541b.length;
        while (i11 < length && it.hasNext()) {
            this.f26541b[i11] = it.next();
            i11++;
        }
        int i12 = this.f26540a;
        for (int i13 = 0; i13 < i12 && it.hasNext(); i13++) {
            this.f26541b[i13] = it.next();
        }
        this.f26542c = collection.size() + this.f26542c;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.f26541b[this.f26540a];
        }
        qc.y.h("ArrayDeque is empty.");
        return null;
    }

    public final void g(int i11) {
        if (i11 < 0) {
            h2.b("Deque is too big.");
            return;
        }
        Object[] objArr = this.f26541b;
        if (i11 <= objArr.length) {
            return;
        }
        if (objArr == f26539e) {
            if (i11 < 10) {
                i11 = 10;
            }
            this.f26541b = new Object[i11];
            return;
        }
        c cVar = f.f26505a;
        int length = objArr.length;
        cVar.getClass();
        Object[] objArr2 = new Object[c.e(length, i11)];
        Object[] objArr3 = this.f26541b;
        x.d(0, this.f26540a, objArr3.length, objArr3, objArr2);
        Object[] objArr4 = this.f26541b;
        int length2 = objArr4.length;
        int i12 = this.f26540a;
        x.d(length2 - i12, 0, i12, objArr4, objArr2);
        this.f26540a = 0;
        this.f26541b = objArr2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        c cVar = f.f26505a;
        int i12 = this.f26542c;
        cVar.getClass();
        c.b(i11, i12);
        return this.f26541b[n(this.f26540a + i11)];
    }

    public final Object h() {
        if (isEmpty()) {
            return null;
        }
        return this.f26541b[this.f26540a];
    }

    public final int i(int i11) {
        if (i11 == y.B(this.f26541b)) {
            return 0;
        }
        return i11 + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i11;
        int iN = n(b() + this.f26540a);
        int length = this.f26540a;
        if (length < iN) {
            while (length < iN) {
                if (Intrinsics.areEqual(obj, this.f26541b[length])) {
                    i11 = this.f26540a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.f26540a) < iN) {
            return -1;
        }
        int length2 = this.f26541b.length;
        while (true) {
            if (length >= length2) {
                for (int i12 = 0; i12 < iN; i12++) {
                    if (Intrinsics.areEqual(obj, this.f26541b[i12])) {
                        length = i12 + this.f26541b.length;
                        i11 = this.f26540a;
                    }
                }
                return -1;
            }
            if (Intrinsics.areEqual(obj, this.f26541b[length])) {
                i11 = this.f26540a;
                break;
            }
            length++;
        }
        return length - i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return b() == 0;
    }

    public final Object j() {
        if (isEmpty()) {
            return null;
        }
        return this.f26541b[n((size() - 1) + this.f26540a)];
    }

    public final int l(int i11) {
        return i11 < 0 ? i11 + this.f26541b.length : i11;
    }

    public final Object last() {
        if (isEmpty()) {
            qc.y.h("ArrayDeque is empty.");
            return null;
        }
        return this.f26541b[n((size() - 1) + this.f26540a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int iB;
        int i11;
        int iN = n(b() + this.f26540a);
        int i12 = this.f26540a;
        if (i12 < iN) {
            iB = iN - 1;
            if (i12 <= iB) {
                while (!Intrinsics.areEqual(obj, this.f26541b[iB])) {
                    if (iB != i12) {
                        iB--;
                    }
                }
                i11 = this.f26540a;
                return iB - i11;
            }
            return -1;
        }
        if (!isEmpty() && this.f26540a >= iN) {
            while (true) {
                iN--;
                Object[] objArr = this.f26541b;
                if (-1 >= iN) {
                    iB = y.B(objArr);
                    int i13 = this.f26540a;
                    if (i13 <= iB) {
                        while (!Intrinsics.areEqual(obj, this.f26541b[iB])) {
                            if (iB != i13) {
                                iB--;
                            }
                        }
                        i11 = this.f26540a;
                    }
                } else if (Intrinsics.areEqual(obj, objArr[iN])) {
                    iB = iN + this.f26541b.length;
                    i11 = this.f26540a;
                    break;
                }
            }
            return iB - i11;
        }
        return -1;
    }

    public final void m(int i11, int i12) {
        Object[] objArr = this.f26541b;
        if (i11 < i12) {
            x.m(objArr, i11, i12, null);
        } else {
            x.m(objArr, i11, objArr.length, null);
            x.m(this.f26541b, 0, i12, null);
        }
    }

    public final int n(int i11) {
        Object[] objArr = this.f26541b;
        return i11 >= objArr.length ? i11 - objArr.length : i11;
    }

    public final void o() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        d(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iN;
        Object[] objArr;
        collection.getClass();
        boolean z11 = false;
        z11 = false;
        z11 = false;
        if (!isEmpty() && this.f26541b.length != 0) {
            int iN2 = n(b() + this.f26540a);
            int i11 = this.f26540a;
            if (i11 < iN2) {
                iN = i11;
                while (true) {
                    objArr = this.f26541b;
                    if (i11 >= iN2) {
                        break;
                    }
                    Object obj = objArr[i11];
                    if (collection.contains(obj)) {
                        z11 = true;
                    } else {
                        this.f26541b[iN] = obj;
                        iN++;
                    }
                    i11++;
                }
                x.m(objArr, iN, iN2, null);
            } else {
                int length = this.f26541b.length;
                boolean z12 = false;
                int i12 = i11;
                while (i11 < length) {
                    Object[] objArr2 = this.f26541b;
                    Object obj2 = objArr2[i11];
                    objArr2[i11] = null;
                    if (collection.contains(obj2)) {
                        z12 = true;
                    } else {
                        this.f26541b[i12] = obj2;
                        i12++;
                    }
                    i11++;
                }
                iN = n(i12);
                for (int i13 = 0; i13 < iN2; i13++) {
                    Object[] objArr3 = this.f26541b;
                    Object obj3 = objArr3[i13];
                    objArr3[i13] = null;
                    if (collection.contains(obj3)) {
                        z12 = true;
                    } else {
                        this.f26541b[iN] = obj3;
                        iN = i(iN);
                    }
                }
                z11 = z12;
            }
            if (z11) {
                o();
                this.f26542c = l(iN - this.f26540a);
            }
        }
        return z11;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            qc.y.h("ArrayDeque is empty.");
            return null;
        }
        o();
        Object[] objArr = this.f26541b;
        int i11 = this.f26540a;
        Object obj = objArr[i11];
        objArr[i11] = null;
        this.f26540a = i(i11);
        this.f26542c = b() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            qc.y.h("ArrayDeque is empty.");
            return null;
        }
        o();
        int iN = n((size() - 1) + this.f26540a);
        Object[] objArr = this.f26541b;
        Object obj = objArr[iN];
        objArr[iN] = null;
        this.f26542c = b() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i11, int i12) {
        c cVar = f.f26505a;
        int i13 = this.f26542c;
        cVar.getClass();
        c.d(i11, i12, i13);
        int i14 = i12 - i11;
        if (i14 == 0) {
            return;
        }
        if (i14 == this.f26542c) {
            clear();
            return;
        }
        if (i14 == 1) {
            d(i11);
            return;
        }
        o();
        int i15 = this.f26542c - i12;
        int i16 = this.f26540a;
        if (i11 < i15) {
            int iN = n((i11 - 1) + i16);
            int iN2 = n(this.f26540a + (i12 - 1));
            while (i11 > 0) {
                int i17 = iN + 1;
                int iMin = Math.min(i11, Math.min(i17, iN2 + 1));
                Object[] objArr = this.f26541b;
                int i18 = iN2 - iMin;
                int i19 = iN - iMin;
                x.d(i18 + 1, i19 + 1, i17, objArr, objArr);
                iN = l(i19);
                iN2 = l(i18);
                i11 -= iMin;
            }
            int iN3 = n(this.f26540a + i14);
            m(this.f26540a, iN3);
            this.f26540a = iN3;
        } else {
            int iN4 = n(i16 + i12);
            int iN5 = n(this.f26540a + i11);
            int i21 = this.f26542c;
            while (true) {
                i21 -= i12;
                if (i21 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f26541b;
                i12 = Math.min(i21, Math.min(objArr2.length - iN4, objArr2.length - iN5));
                Object[] objArr3 = this.f26541b;
                int i22 = iN4 + i12;
                x.d(iN5, iN4, i22, objArr3, objArr3);
                iN4 = n(i22);
                iN5 = n(iN5 + i12);
            }
            int iN6 = n(this.f26542c + this.f26540a);
            m(l(iN6 - i14), iN6);
        }
        this.f26542c -= i14;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iN;
        Object[] objArr;
        collection.getClass();
        boolean z11 = false;
        z11 = false;
        z11 = false;
        if (!isEmpty() && this.f26541b.length != 0) {
            int iN2 = n(b() + this.f26540a);
            int i11 = this.f26540a;
            if (i11 < iN2) {
                iN = i11;
                while (true) {
                    objArr = this.f26541b;
                    if (i11 >= iN2) {
                        break;
                    }
                    Object obj = objArr[i11];
                    if (collection.contains(obj)) {
                        this.f26541b[iN] = obj;
                        iN++;
                    } else {
                        z11 = true;
                    }
                    i11++;
                }
                x.m(objArr, iN, iN2, null);
            } else {
                int length = this.f26541b.length;
                boolean z12 = false;
                int i12 = i11;
                while (i11 < length) {
                    Object[] objArr2 = this.f26541b;
                    Object obj2 = objArr2[i11];
                    objArr2[i11] = null;
                    if (collection.contains(obj2)) {
                        this.f26541b[i12] = obj2;
                        i12++;
                    } else {
                        z12 = true;
                    }
                    i11++;
                }
                iN = n(i12);
                for (int i13 = 0; i13 < iN2; i13++) {
                    Object[] objArr3 = this.f26541b;
                    Object obj3 = objArr3[i13];
                    objArr3[i13] = null;
                    if (collection.contains(obj3)) {
                        this.f26541b[iN] = obj3;
                        iN = i(iN);
                    } else {
                        z12 = true;
                    }
                }
                z11 = z12;
            }
            if (z11) {
                o();
                this.f26542c = l(iN - this.f26540a);
            }
        }
        return z11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        c cVar = f.f26505a;
        int i12 = this.f26542c;
        cVar.getClass();
        c.b(i11, i12);
        int iN = n(this.f26540a + i11);
        Object[] objArr = this.f26541b;
        Object obj2 = objArr[iN];
        objArr[iN] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i11 = this.f26542c;
        if (length < i11) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i11);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int iN = n(this.f26542c + this.f26540a);
        int i12 = this.f26540a;
        if (i12 < iN) {
            x.i(i12, iN, 2, this.f26541b, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f26541b;
            x.d(0, this.f26540a, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f26541b;
            x.d(objArr3.length - this.f26540a, 0, iN, objArr3, objArr);
        }
        int i13 = this.f26542c;
        if (i13 < objArr.length) {
            objArr[i13] = null;
        }
        return objArr;
    }

    public t() {
        this.f26541b = f26539e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        o();
        g(collection.size() + b());
        e(n(b() + this.f26540a), collection);
        return true;
    }
}
