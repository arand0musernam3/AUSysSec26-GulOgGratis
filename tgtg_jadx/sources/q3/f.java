package q3;

import com.braze.h2;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.m;
import kotlin.collections.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.markers.KMutableCollection;
import m3.s1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends m implements Collection, KMutableCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f35963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f35964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f35965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t3.b f35967e = new t3.b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object[] f35968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object[] f35969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f35970h;

    public f(c cVar, Object[] objArr, Object[] objArr2, int i11) {
        this.f35963a = cVar;
        this.f35964b = objArr;
        this.f35965c = objArr2;
        this.f35966d = i11;
        this.f35968f = objArr;
        this.f35969g = objArr2;
        this.f35970h = cVar.size();
    }

    public static void g(Object[] objArr, int i11, Iterator it) {
        while (i11 < 32 && it.hasNext()) {
            objArr[i11] = it.next();
            i11++;
        }
    }

    public final int A(Function1 function1, Object[] objArr, int i11, fd.j jVar) {
        Object[] objArrO = objArr;
        int i12 = i11;
        boolean z11 = false;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = objArr[i13];
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                if (!z11) {
                    objArrO = o(objArr);
                    z11 = true;
                    i12 = i13;
                }
            } else if (z11) {
                objArrO[i12] = obj;
                i12++;
            }
        }
        jVar.f17568b = objArrO;
        return i12;
    }

    public final int B(Function1 function1, int i11, fd.j jVar) {
        int iA = A(function1, this.f35969g, i11, jVar);
        Object obj = jVar.f17568b;
        if (iA == i11) {
            return i11;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iA, i11, (Object) null);
        this.f35969g = objArr;
        this.f35970h -= i11 - iA;
        return iA;
    }

    public final boolean C(Function1 function1) {
        int i11;
        Function1 function12 = function1;
        int I = I();
        Object[] objArrS = null;
        fd.j jVar = new fd.j(null, 2);
        boolean z11 = false;
        if (this.f35968f != null) {
            a aVarN = n(0);
            int iA = 32;
            while (iA == 32 && aVarN.hasNext()) {
                iA = A(function12, (Object[]) aVarN.next(), 32, jVar);
            }
            if (iA == 32) {
                int iB = B(function12, I, jVar);
                if (iB == 0) {
                    u(this.f35968f, this.f35970h, this.f35966d);
                }
                if (iB != I) {
                }
            } else {
                int i12 = (aVarN.f35953b - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iZ = iA;
                while (aVarN.hasNext()) {
                    iZ = z(function12, (Object[]) aVarN.next(), 32, iZ, jVar, arrayList2, arrayList);
                    function12 = function1;
                }
                int iZ2 = z(function1, this.f35969g, I, iZ, jVar, arrayList2, arrayList);
                Object obj = jVar.f17568b;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iZ2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrV = this.f35968f;
                if (zIsEmpty) {
                    objArrV.getClass();
                } else {
                    objArrV = v(objArrV, i12, this.f35966d, arrayList.iterator());
                }
                int size = i12 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    s1.a("invalid size");
                }
                if (size == 0) {
                    this.f35966d = 0;
                } else {
                    int i13 = size - 1;
                    while (true) {
                        i11 = this.f35966d;
                        if ((i13 >> i11) != 0) {
                            break;
                        }
                        this.f35966d = i11 - 5;
                        Object[] objArr2 = objArrV[0];
                        objArr2.getClass();
                        objArrV = objArr2;
                    }
                    objArrS = s(objArrV, i13, i11);
                }
                this.f35968f = objArrS;
                this.f35969g = objArr;
                this.f35970h = size + iZ2;
            }
            z11 = true;
        } else if (B(function12, I, jVar) != I) {
            z11 = true;
        }
        if (z11) {
            ((AbstractList) this).modCount++;
        }
        return z11;
    }

    public final Object[] D(Object[] objArr, int i11, int i12, fd.j jVar) {
        int iH = jf.e.H(i12, i11);
        if (i11 == 0) {
            Object obj = objArr[iH];
            Object[] objArrO = o(objArr);
            x.d(iH, iH + 1, 32, objArr, objArrO);
            objArrO[31] = jVar.f17568b;
            jVar.f17568b = obj;
            return objArrO;
        }
        int iH2 = objArr[31] == null ? jf.e.H(F() - 1, i11) : 31;
        Object[] objArrO2 = o(objArr);
        int i13 = i11 - 5;
        int i14 = iH + 1;
        if (i14 <= iH2) {
            while (true) {
                Object obj2 = objArrO2[iH2];
                obj2.getClass();
                objArrO2[iH2] = D((Object[]) obj2, i13, 0, jVar);
                if (iH2 == i14) {
                    break;
                }
                iH2--;
            }
        }
        Object obj3 = objArrO2[iH];
        obj3.getClass();
        objArrO2[iH] = D((Object[]) obj3, i13, i12, jVar);
        return objArrO2;
    }

    public final Object E(Object[] objArr, int i11, int i12, int i13) {
        int i14 = this.f35970h - i11;
        Object[] objArr2 = this.f35969g;
        if (i14 == 1) {
            Object obj = objArr2[0];
            u(objArr, i11, i12);
            return obj;
        }
        Object obj2 = objArr2[i13];
        Object[] objArrO = o(objArr2);
        x.d(i13, i13 + 1, i14, objArr2, objArrO);
        objArrO[i14 - 1] = null;
        this.f35968f = objArr;
        this.f35969g = objArrO;
        this.f35970h = (i11 + i14) - 1;
        this.f35966d = i12;
        return obj2;
    }

    public final int F() {
        int i11 = this.f35970h;
        if (i11 <= 32) {
            return 0;
        }
        return (i11 - 1) & (-32);
    }

    public final Object[] G(Object[] objArr, int i11, int i12, Object obj, fd.j jVar) {
        int iH = jf.e.H(i12, i11);
        Object[] objArrO = o(objArr);
        if (i11 != 0) {
            Object obj2 = objArrO[iH];
            obj2.getClass();
            objArrO[iH] = G((Object[]) obj2, i11 - 5, i12, obj, jVar);
            return objArrO;
        }
        if (objArrO != objArr) {
            ((AbstractList) this).modCount++;
        }
        jVar.f17568b = objArrO[iH];
        objArrO[iH] = obj;
        return objArrO;
    }

    public final void H(Collection collection, int i11, Object[] objArr, int i12, Object[][] objArr2, int i13, Object[] objArr3) {
        Object[] objArrQ;
        if (i13 < 1) {
            s1.a("requires at least one nullBuffer");
        }
        Object[] objArrO = o(objArr);
        objArr2[0] = objArrO;
        int i14 = i11 & 31;
        int size = ((collection.size() + i11) - 1) & 31;
        int i15 = (i12 - i14) + size;
        if (i15 < 32) {
            x.d(size + 1, i14, i12, objArrO, objArr3);
        } else {
            int i16 = i15 - 31;
            if (i13 == 1) {
                objArrQ = objArrO;
            } else {
                objArrQ = q();
                i13--;
                objArr2[i13] = objArrQ;
            }
            int i17 = i12 - i16;
            x.d(0, i17, i12, objArrO, objArr3);
            x.d(size + 1, i14, i17, objArrO, objArrQ);
            objArr3 = objArrQ;
        }
        Iterator it = collection.iterator();
        g(objArrO, i14, it);
        for (int i18 = 1; i18 < i13; i18++) {
            Object[] objArrQ2 = q();
            g(objArrQ2, 0, it);
            objArr2[i18] = objArrQ2;
        }
        g(objArr3, 0, it);
    }

    public final int I() {
        int i11 = this.f35970h;
        return i11 <= 32 ? i11 : i11 - ((i11 - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        dx.f.o(i11, b());
        if (i11 == b()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iF = F();
        if (i11 >= iF) {
            l(i11 - iF, obj, this.f35968f);
            return;
        }
        fd.j jVar = new fd.j(null, 2);
        Object[] objArr = this.f35968f;
        objArr.getClass();
        l(0, jVar.f17568b, j(objArr, this.f35966d, i11, obj, jVar));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i11, Collection collection) {
        Collection collection2;
        f fVar;
        Object[] objArrQ;
        dx.f.o(i11, this.f35970h);
        if (i11 == this.f35970h) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i12 = (i11 >> 5) << 5;
        int size = ((collection.size() + (this.f35970h - i12)) - 1) / 32;
        if (size == 0) {
            int i13 = i11 & 31;
            int size2 = ((collection.size() + i11) - 1) & 31;
            Object[] objArr = this.f35969g;
            Object[] objArrO = o(objArr);
            x.d(size2 + 1, i13, I(), objArr, objArrO);
            g(objArrO, i13, collection.iterator());
            this.f35969g = objArrO;
            this.f35970h = collection.size() + this.f35970h;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int I = I();
        int size3 = collection.size() + this.f35970h;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i11 >= F()) {
            objArrQ = q();
            collection2 = collection;
            H(collection2, i11, this.f35969g, I, objArr2, size, objArrQ);
            fVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            fVar = this;
            Object[] objArr3 = fVar.f35969g;
            if (size3 > I) {
                int i14 = size3 - I;
                Object[] objArrP = p(i14, objArr3);
                fVar.i(collection2, i11, i14, objArr2, size, objArrP);
                objArr2 = objArr2;
                objArrQ = objArrP;
            } else {
                objArrQ = q();
                int i15 = I - size3;
                x.d(0, i15, I, objArr3, objArrQ);
                int i16 = 32 - i15;
                Object[] objArrP2 = p(i16, fVar.f35969g);
                int i17 = size - 1;
                objArr2[i17] = objArrP2;
                fVar.i(collection2, i11, i16, objArr2, i17, objArrP2);
                collection2 = collection2;
            }
        }
        fVar.f35968f = w(fVar.f35968f, i12, objArr2);
        fVar.f35969g = objArrQ;
        fVar.f35970h = collection2.size() + fVar.f35970h;
        return true;
    }

    @Override // kotlin.collections.m
    public final int b() {
        return this.f35970h;
    }

    @Override // kotlin.collections.m
    public final Object d(int i11) {
        dx.f.n(i11, b());
        ((AbstractList) this).modCount++;
        int iF = F();
        if (i11 >= iF) {
            return E(this.f35968f, iF, this.f35966d, i11 - iF);
        }
        fd.j jVar = new fd.j(this.f35969g[0], 2);
        Object[] objArr = this.f35968f;
        objArr.getClass();
        E(D(objArr, this.f35966d, i11, jVar), iF, this.f35966d, 0);
        return jVar.f17568b;
    }

    public final c e() {
        c eVar;
        Object[] objArr = this.f35968f;
        if (objArr == this.f35964b && this.f35969g == this.f35965c) {
            eVar = this.f35963a;
        } else {
            this.f35967e = new t3.b();
            this.f35964b = objArr;
            Object[] objArr2 = this.f35969g;
            this.f35965c = objArr2;
            if (objArr == null) {
                eVar = objArr2.length == 0 ? i.f35977c : new i(Arrays.copyOf(this.f35969g, b()));
            } else {
                Object[] objArr3 = this.f35968f;
                objArr3.getClass();
                eVar = new e(objArr3, this.f35969g, b(), this.f35966d);
            }
        }
        this.f35963a = eVar;
        return eVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        Object[] objArr;
        dx.f.n(i11, b());
        if (F() <= i11) {
            objArr = this.f35969g;
        } else {
            objArr = this.f35968f;
            objArr.getClass();
            for (int i12 = this.f35966d; i12 > 0; i12 -= 5) {
                Object obj = objArr[jf.e.H(i11, i12)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return objArr[i11 & 31];
    }

    public final int h() {
        return ((AbstractList) this).modCount;
    }

    public final void i(Collection collection, int i11, int i12, Object[][] objArr, int i13, Object[] objArr2) {
        if (this.f35968f == null) {
            h2.b("root is null");
            return;
        }
        int i14 = i11 >> 5;
        a aVarN = n(F() >> 5);
        int i15 = i13;
        Object[] objArrP = objArr2;
        while (aVarN.f35953b - 1 != i14) {
            Object[] objArr3 = (Object[]) aVarN.previous();
            x.d(0, 32 - i12, 32, objArr3, objArrP);
            objArrP = p(i12, objArr3);
            i15--;
            objArr[i15] = objArrP;
        }
        Object[] objArr4 = (Object[]) aVarN.previous();
        int iF = i13 - (((F() >> 5) - 1) - i14);
        if (iF < i13) {
            objArr2 = objArr[iF];
            objArr2.getClass();
        }
        H(collection, i11, objArr4, 32, objArr, iF, objArr2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object[] j(Object[] objArr, int i11, int i12, Object obj, fd.j jVar) {
        Object obj2;
        int iH = jf.e.H(i12, i11);
        if (i11 == 0) {
            jVar.f17568b = objArr[31];
            Object[] objArrO = o(objArr);
            x.d(iH + 1, iH, 31, objArr, objArrO);
            objArrO[iH] = obj;
            return objArrO;
        }
        Object[] objArrO2 = o(objArr);
        int i13 = i11 - 5;
        Object obj3 = objArrO2[iH];
        obj3.getClass();
        objArrO2[iH] = j((Object[]) obj3, i13, i12, obj, jVar);
        while (true) {
            iH++;
            if (iH >= 32 || (obj2 = objArrO2[iH]) == null) {
                break;
            }
            objArrO2[iH] = j((Object[]) obj2, i13, 0, jVar.f17568b, jVar);
        }
        return objArrO2;
    }

    public final void l(int i11, Object obj, Object[] objArr) {
        int I = I();
        Object[] objArrO = o(this.f35969g);
        Object[] objArr2 = this.f35969g;
        if (I >= 32) {
            Object obj2 = objArr2[31];
            x.d(i11 + 1, i11, 31, objArr2, objArrO);
            objArrO[i11] = obj;
            x(objArr, objArrO, r(obj2));
            return;
        }
        x.d(i11 + 1, i11, I, objArr2, objArrO);
        objArrO[i11] = obj;
        this.f35968f = objArr;
        this.f35969g = objArrO;
        this.f35970h++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i11) {
        dx.f.o(i11, this.f35970h);
        return new h(this, i11);
    }

    public final boolean m(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f35967e;
    }

    public final a n(int i11) {
        Object[] objArr = this.f35968f;
        if (objArr == null) {
            h2.b("Invalid root");
            return null;
        }
        int iF = F() >> 5;
        dx.f.o(i11, iF);
        int i12 = this.f35966d;
        return i12 == 0 ? new d(objArr, i11) : new j(objArr, i11, iF, i12 / 5);
    }

    public final Object[] o(Object[] objArr) {
        if (objArr == null) {
            return q();
        }
        if (m(objArr)) {
            return objArr;
        }
        Object[] objArrQ = q();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        x.i(0, length, 6, objArr, objArrQ);
        return objArrQ;
    }

    public final Object[] p(int i11, Object[] objArr) {
        if (m(objArr)) {
            x.d(i11, 0, 32 - i11, objArr, objArr);
            return objArr;
        }
        Object[] objArrQ = q();
        x.d(i11, 0, 32 - i11, objArr, objArrQ);
        return objArrQ;
    }

    public final Object[] q() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f35967e;
        return objArr;
    }

    public final Object[] r(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f35967e;
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return C(new b(1, collection));
    }

    public final Object[] s(Object[] objArr, int i11, int i12) {
        if (i12 < 0) {
            s1.a("shift should be positive");
        }
        if (i12 == 0) {
            return objArr;
        }
        int iH = jf.e.H(i11, i12);
        Object obj = objArr[iH];
        obj.getClass();
        Object objS = s((Object[]) obj, i11, i12 - 5);
        if (iH < 31) {
            int i13 = iH + 1;
            if (objArr[i13] != null) {
                if (m(objArr)) {
                    Arrays.fill(objArr, i13, 32, (Object) null);
                }
                Object[] objArrQ = q();
                x.d(0, 0, i13, objArr, objArrQ);
                objArr = objArrQ;
            }
        }
        if (objS == objArr[iH]) {
            return objArr;
        }
        Object[] objArrO = o(objArr);
        objArrO[iH] = objS;
        return objArrO;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        dx.f.n(i11, b());
        if (F() > i11) {
            fd.j jVar = new fd.j(null, 2);
            Object[] objArr = this.f35968f;
            objArr.getClass();
            this.f35968f = G(objArr, this.f35966d, i11, obj, jVar);
            return jVar.f17568b;
        }
        Object[] objArrO = o(this.f35969g);
        if (objArrO != this.f35969g) {
            ((AbstractList) this).modCount++;
        }
        int i12 = i11 & 31;
        Object obj2 = objArrO[i12];
        objArrO[i12] = obj;
        this.f35969g = objArrO;
        return obj2;
    }

    public final Object[] t(Object[] objArr, int i11, int i12, fd.j jVar) {
        Object[] objArrT;
        int iH = jf.e.H(i12 - 1, i11);
        if (i11 == 5) {
            jVar.f17568b = objArr[iH];
            objArrT = null;
        } else {
            Object obj = objArr[iH];
            obj.getClass();
            objArrT = t((Object[]) obj, i11 - 5, i12, jVar);
        }
        if (objArrT == null && iH == 0) {
            return null;
        }
        Object[] objArrO = o(objArr);
        objArrO[iH] = objArrT;
        return objArrO;
    }

    public final void u(Object[] objArr, int i11, int i12) {
        if (i12 == 0) {
            this.f35968f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f35969g = objArr;
            this.f35970h = i11;
            this.f35966d = i12;
            return;
        }
        fd.j jVar = new fd.j(null, 2);
        objArr.getClass();
        Object[] objArrT = t(objArr, i12, i11, jVar);
        objArrT.getClass();
        Object obj = jVar.f17568b;
        obj.getClass();
        this.f35969g = (Object[]) obj;
        this.f35970h = i11;
        if (objArrT[1] == null) {
            this.f35968f = (Object[]) objArrT[0];
            this.f35966d = i12 - 5;
        } else {
            this.f35968f = objArrT;
            this.f35966d = i12;
        }
    }

    public final Object[] v(Object[] objArr, int i11, int i12, Iterator it) {
        if (!it.hasNext()) {
            s1.a("invalid buffersIterator");
        }
        if (!(i12 >= 0)) {
            s1.a("negative shift");
        }
        if (i12 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrO = o(objArr);
        int iH = jf.e.H(i11, i12);
        int i13 = i12 - 5;
        objArrO[iH] = v((Object[]) objArrO[iH], i11, i13, it);
        while (true) {
            iH++;
            if (iH >= 32 || !it.hasNext()) {
                break;
            }
            objArrO[iH] = v((Object[]) objArrO[iH], 0, i13, it);
        }
        return objArrO;
    }

    public final Object[] w(Object[] objArr, int i11, Object[][] objArr2) {
        Iterator it = ArrayIteratorKt.iterator(objArr2);
        int i12 = i11 >> 5;
        int i13 = this.f35966d;
        Object[] objArrV = i12 < (1 << i13) ? v(objArr, i11, i13, it) : o(objArr);
        while (it.hasNext()) {
            this.f35966d += 5;
            objArrV = r(objArrV);
            int i14 = this.f35966d;
            v(objArrV, 1 << i14, i14, it);
        }
        return objArrV;
    }

    public final void x(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i11 = this.f35970h;
        int i12 = i11 >> 5;
        int i13 = this.f35966d;
        if (i12 > (1 << i13)) {
            this.f35968f = y(this.f35966d + 5, r(objArr), objArr2);
            this.f35969g = objArr3;
            this.f35966d += 5;
            this.f35970h++;
            return;
        }
        if (objArr == null) {
            this.f35968f = objArr2;
            this.f35969g = objArr3;
            this.f35970h = i11 + 1;
        } else {
            this.f35968f = y(i13, objArr, objArr2);
            this.f35969g = objArr3;
            this.f35970h++;
        }
    }

    public final Object[] y(int i11, Object[] objArr, Object[] objArr2) {
        int iH = jf.e.H(b() - 1, i11);
        Object[] objArrO = o(objArr);
        if (i11 == 5) {
            objArrO[iH] = objArr2;
            return objArrO;
        }
        objArrO[iH] = y(i11 - 5, (Object[]) objArrO[iH], objArr2);
        return objArrO;
    }

    public final int z(Function1 function1, Object[] objArr, int i11, int i12, fd.j jVar, ArrayList arrayList, ArrayList arrayList2) {
        if (m(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = jVar.f17568b;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrQ = objArr2;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj2 = objArr[i13];
            if (!((Boolean) function1.invoke(obj2)).booleanValue()) {
                if (i12 == 32) {
                    objArrQ = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : q();
                    i12 = 0;
                }
                objArrQ[i12] = obj2;
                i12++;
            }
        }
        jVar.f17568b = objArrQ;
        if (objArr2 != objArrQ) {
            arrayList2.add(objArr2);
        }
        return i12;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int I = I();
        if (I < 32) {
            Object[] objArrO = o(this.f35969g);
            objArrO[I] = obj;
            this.f35969g = objArrO;
            this.f35970h = b() + 1;
        } else {
            x(this.f35968f, this.f35969g, r(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int I = I();
        Iterator it = collection.iterator();
        if (32 - I >= collection.size()) {
            Object[] objArrO = o(this.f35969g);
            g(objArrO, I, it);
            this.f35969g = objArrO;
            this.f35970h = collection.size() + this.f35970h;
            return true;
        }
        int size = ((collection.size() + I) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrO2 = o(this.f35969g);
        g(objArrO2, I, it);
        objArr[0] = objArrO2;
        for (int i11 = 1; i11 < size; i11++) {
            Object[] objArrQ = q();
            g(objArrQ, 0, it);
            objArr[i11] = objArrQ;
        }
        this.f35968f = w(this.f35968f, F(), objArr);
        Object[] objArrQ2 = q();
        g(objArrQ2, 0, it);
        this.f35969g = objArrQ2;
        this.f35970h = collection.size() + this.f35970h;
        return true;
    }
}
