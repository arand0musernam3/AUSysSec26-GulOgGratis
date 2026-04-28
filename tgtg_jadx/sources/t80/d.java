package t80;

import com.braze.h2;
import d40.t1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.m;
import kotlin.collections.x;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.markers.KMutableCollection;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends m implements Collection, KMutableCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f39847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l50.a f39848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f39849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f39850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f39851f;

    public d(a aVar, Object[] objArr, Object[] objArr2, int i11) {
        objArr2.getClass();
        this.f39846a = i11;
        this.f39847b = aVar;
        this.f39848c = new l50.a(21);
        this.f39849d = objArr;
        this.f39850e = objArr2;
        this.f39851f = aVar.size();
    }

    public static void g(Object[] objArr, int i11, Iterator it) {
        while (i11 < 32 && it.hasNext()) {
            objArr[i11] = it.next();
            i11++;
        }
    }

    public final int A(q3.b bVar, Object[] objArr, int i11, jd.f fVar) {
        Object[] objArrO = objArr;
        int i12 = i11;
        boolean z11 = false;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = objArr[i13];
            if (((Boolean) bVar.invoke(obj)).booleanValue()) {
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
        fVar.f24983b = objArrO;
        return i12;
    }

    public final int B(q3.b bVar, int i11, jd.f fVar) {
        int iA = A(bVar, this.f39850e, i11, fVar);
        Object obj = fVar.f24983b;
        if (iA == i11) {
            return i11;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iA, i11, (Object) null);
        H(objArr);
        this.f39851f -= i11 - iA;
        return iA;
    }

    public final Object[] C(Object[] objArr, int i11, int i12, jd.f fVar) {
        int iV = h0.g.v(i12, i11);
        if (i11 == 0) {
            Object obj = objArr[iV];
            Object[] objArrO = o(objArr);
            x.d(iV, iV + 1, 32, objArr, objArrO);
            objArrO[31] = fVar.f24983b;
            fVar.f24983b = obj;
            return objArrO;
        }
        int iV2 = objArr[31] == null ? h0.g.v(E() - 1, i11) : 31;
        Object[] objArrO2 = o(objArr);
        int i13 = i11 - 5;
        int i14 = iV + 1;
        if (i14 <= iV2) {
            while (true) {
                Object obj2 = objArrO2[iV2];
                obj2.getClass();
                objArrO2[iV2] = C((Object[]) obj2, i13, 0, fVar);
                if (iV2 == i14) {
                    break;
                }
                iV2--;
            }
        }
        Object obj3 = objArrO2[iV];
        obj3.getClass();
        objArrO2[iV] = C((Object[]) obj3, i13, i12, fVar);
        return objArrO2;
    }

    public final Object D(Object[] objArr, int i11, int i12, int i13) {
        int i14 = this.f39851f - i11;
        Object[] objArr2 = this.f39850e;
        if (i14 == 1) {
            Object obj = objArr2[0];
            u(objArr, i11, i12);
            return obj;
        }
        Object obj2 = objArr2[i13];
        Object[] objArrO = o(objArr2);
        x.d(i13, i13 + 1, i14, objArr2, objArrO);
        objArrO[i14 - 1] = null;
        G(objArr);
        H(objArrO);
        this.f39851f = (i11 + i14) - 1;
        this.f39846a = i12;
        return obj2;
    }

    public final int E() {
        int i11 = this.f39851f;
        if (i11 <= 32) {
            return 0;
        }
        return (i11 - 1) & (-32);
    }

    public final Object[] F(Object[] objArr, int i11, int i12, Object obj, jd.f fVar) {
        int iV = h0.g.v(i12, i11);
        Object[] objArrO = o(objArr);
        if (i11 != 0) {
            Object obj2 = objArrO[iV];
            obj2.getClass();
            objArrO[iV] = F((Object[]) obj2, i11 - 5, i12, obj, fVar);
            return objArrO;
        }
        if (objArrO != objArr) {
            ((AbstractList) this).modCount++;
        }
        fVar.f24983b = objArrO[iV];
        objArrO[iV] = obj;
        return objArrO;
    }

    public final void G(Object[] objArr) {
        if (objArr != this.f39849d) {
            this.f39847b = null;
            this.f39849d = objArr;
        }
    }

    public final void H(Object[] objArr) {
        if (objArr != this.f39850e) {
            this.f39847b = null;
            this.f39850e = objArr;
        }
    }

    public final void I(Collection collection, int i11, Object[] objArr, int i12, Object[][] objArr2, int i13, Object[] objArr3) {
        Object[] objArrQ;
        if (i13 < 1) {
            h2.b("Check failed.");
            return;
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

    public final int J() {
        int i11 = this.f39851f;
        return i11 <= 32 ? i11 : i11 - ((i11 - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        t1.u(i11, b());
        if (i11 == b()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iE = E();
        if (i11 >= iE) {
            l(i11 - iE, obj, this.f39849d);
            return;
        }
        jd.f fVar = new jd.f((Object) null, 28);
        Object[] objArr = this.f39849d;
        objArr.getClass();
        l(0, fVar.f24983b, i(objArr, this.f39846a, i11, obj, fVar));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i11, Collection collection) {
        Collection collection2;
        d dVar;
        Object[] objArrQ;
        collection.getClass();
        t1.u(i11, this.f39851f);
        if (i11 == this.f39851f) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i12 = (i11 >> 5) << 5;
        int size = ((collection.size() + (this.f39851f - i12)) - 1) / 32;
        if (size == 0) {
            int i13 = i11 & 31;
            int size2 = ((collection.size() + i11) - 1) & 31;
            Object[] objArr = this.f39850e;
            Object[] objArrO = o(objArr);
            x.d(size2 + 1, i13, J(), objArr, objArrO);
            g(objArrO, i13, collection.iterator());
            H(objArrO);
            this.f39851f = collection.size() + this.f39851f;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iJ = J();
        int size3 = collection.size() + this.f39851f;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i11 >= E()) {
            objArrQ = q();
            collection2 = collection;
            I(collection2, i11, this.f39850e, iJ, objArr2, size, objArrQ);
            dVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            dVar = this;
            Object[] objArr3 = dVar.f39850e;
            if (size3 > iJ) {
                int i14 = size3 - iJ;
                Object[] objArrP = p(i14, objArr3);
                dVar.j(collection2, i11, i14, objArr2, size, objArrP);
                objArr2 = objArr2;
                objArrQ = objArrP;
            } else {
                objArrQ = q();
                int i15 = iJ - size3;
                x.d(0, i15, iJ, objArr3, objArrQ);
                int i16 = 32 - i15;
                Object[] objArrP2 = p(i16, dVar.f39850e);
                int i17 = size - 1;
                objArr2[i17] = objArrP2;
                dVar.j(collection2, i11, i16, objArr2, i17, objArrP2);
                collection2 = collection2;
            }
        }
        G(w(dVar.f39849d, i12, objArr2));
        H(objArrQ);
        dVar.f39851f = collection2.size() + dVar.f39851f;
        return true;
    }

    @Override // kotlin.collections.m
    public final int b() {
        return this.f39851f;
    }

    @Override // kotlin.collections.m
    public final Object d(int i11) {
        t1.t(i11, b());
        ((AbstractList) this).modCount++;
        int iE = E();
        if (i11 >= iE) {
            return D(this.f39849d, iE, this.f39846a, i11 - iE);
        }
        jd.f fVar = new jd.f(this.f39850e[0], 28);
        Object[] objArr = this.f39849d;
        objArr.getClass();
        D(C(objArr, this.f39846a, i11, fVar), iE, this.f39846a, 0);
        return fVar.f24983b;
    }

    public final a e() {
        a gVar = this.f39847b;
        if (gVar == null) {
            Object[] objArr = this.f39849d;
            Object[] objArr2 = this.f39850e;
            this.f39848c = new l50.a(21);
            gVar = objArr == null ? objArr2.length == 0 ? g.f39858c : new g(Arrays.copyOf(objArr2, this.f39851f)) : new c(objArr, objArr2, this.f39851f, this.f39846a);
            this.f39847b = gVar;
        }
        return gVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        Object[] objArr;
        t1.t(i11, b());
        if (E() <= i11) {
            objArr = this.f39850e;
        } else {
            objArr = this.f39849d;
            objArr.getClass();
            for (int i12 = this.f39846a; i12 > 0; i12 -= 5) {
                Object obj = objArr[h0.g.v(i11, i12)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return objArr[i11 & 31];
    }

    public final int h() {
        return ((AbstractList) this).modCount;
    }

    public final Object[] i(Object[] objArr, int i11, int i12, Object obj, jd.f fVar) {
        Object obj2;
        int iV = h0.g.v(i12, i11);
        if (i11 == 0) {
            fVar.f24983b = objArr[31];
            Object[] objArrO = o(objArr);
            x.d(iV + 1, iV, 31, objArr, objArrO);
            objArrO[iV] = obj;
            return objArrO;
        }
        Object[] objArrO2 = o(objArr);
        int i13 = i11 - 5;
        Object obj3 = objArrO2[iV];
        obj3.getClass();
        objArrO2[iV] = i((Object[]) obj3, i13, i12, obj, fVar);
        while (true) {
            iV++;
            if (iV >= 32 || (obj2 = objArrO2[iV]) == null) {
                break;
            }
            objArrO2[iV] = i((Object[]) obj2, i13, 0, fVar.f24983b, fVar);
        }
        return objArrO2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(Collection collection, int i11, int i12, Object[][] objArr, int i13, Object[] objArr2) {
        if (this.f39849d == null) {
            h2.b("Required value was null.");
            return;
        }
        int i14 = i11 >> 5;
        q3.a aVarN = n(E() >> 5);
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
        int iE = i13 - (((E() >> 5) - 1) - i14);
        if (iE < i13) {
            objArr2 = objArr[iE];
            objArr2.getClass();
        }
        I(collection, i11, objArr4, 32, objArr, iE, objArr2);
    }

    public final void l(int i11, Object obj, Object[] objArr) {
        int iJ = J();
        Object[] objArrO = o(this.f39850e);
        Object[] objArr2 = this.f39850e;
        if (iJ >= 32) {
            Object obj2 = objArr2[31];
            x.d(i11 + 1, i11, 31, objArr2, objArrO);
            objArrO[i11] = obj;
            x(objArr, objArrO, r(obj2));
            return;
        }
        x.d(i11 + 1, i11, iJ, objArr2, objArrO);
        objArrO[i11] = obj;
        G(objArr);
        H(objArrO);
        this.f39851f++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i11) {
        t1.u(i11, this.f39851f);
        return new f(this, i11);
    }

    public final boolean m(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f39848c;
    }

    public final q3.a n(int i11) {
        if (this.f39849d == null) {
            h2.b("Required value was null.");
            return null;
        }
        int iE = E() >> 5;
        t1.u(i11, iE);
        int i12 = this.f39846a;
        Object[] objArr = this.f39849d;
        if (i12 == 0) {
            objArr.getClass();
            return new b(objArr, i11);
        }
        objArr.getClass();
        return new h(objArr, i11, iE, i12 / 5);
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
        objArr[32] = this.f39848c;
        return objArr;
    }

    public final Object[] r(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f39848c;
        return objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        r2 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r0 != r15) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (B(r3, r15, r7) != r15) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r2 = r14;
     */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean removeAll(java.util.Collection r15) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t80.d.removeAll(java.util.Collection):boolean");
    }

    public final Object[] s(Object[] objArr, int i11, int i12) {
        if (i12 < 0) {
            h2.b("Check failed.");
            return null;
        }
        if (i12 == 0) {
            return objArr;
        }
        int iV = h0.g.v(i11, i12);
        Object obj = objArr[iV];
        obj.getClass();
        Object objS = s((Object[]) obj, i11, i12 - 5);
        if (iV < 31) {
            int i13 = iV + 1;
            if (objArr[i13] != null) {
                if (m(objArr)) {
                    Arrays.fill(objArr, i13, 32, (Object) null);
                }
                Object[] objArrQ = q();
                x.d(0, 0, i13, objArr, objArrQ);
                objArr = objArrQ;
            }
        }
        if (objS == objArr[iV]) {
            return objArr;
        }
        Object[] objArrO = o(objArr);
        objArrO[iV] = objS;
        return objArrO;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        t1.t(i11, b());
        if (E() > i11) {
            jd.f fVar = new jd.f((Object) null, 28);
            Object[] objArr = this.f39849d;
            objArr.getClass();
            G(F(objArr, this.f39846a, i11, obj, fVar));
            return fVar.f24983b;
        }
        Object[] objArrO = o(this.f39850e);
        if (objArrO != this.f39850e) {
            ((AbstractList) this).modCount++;
        }
        int i12 = i11 & 31;
        Object obj2 = objArrO[i12];
        objArrO[i12] = obj;
        H(objArrO);
        return obj2;
    }

    public final Object[] t(Object[] objArr, int i11, int i12, jd.f fVar) {
        Object[] objArrT;
        int iV = h0.g.v(i12 - 1, i11);
        if (i11 == 5) {
            fVar.f24983b = objArr[iV];
            objArrT = null;
        } else {
            Object obj = objArr[iV];
            obj.getClass();
            objArrT = t((Object[]) obj, i11 - 5, i12, fVar);
        }
        if (objArrT == null && iV == 0) {
            return null;
        }
        Object[] objArrO = o(objArr);
        objArrO[iV] = objArrT;
        return objArrO;
    }

    public final void u(Object[] objArr, int i11, int i12) {
        if (i12 == 0) {
            G(null);
            if (objArr == null) {
                objArr = new Object[0];
            }
            H(objArr);
            this.f39851f = i11;
            this.f39846a = i12;
            return;
        }
        jd.f fVar = new jd.f((Object) null, 28);
        objArr.getClass();
        Object[] objArrT = t(objArr, i12, i11, fVar);
        objArrT.getClass();
        Object obj = fVar.f24983b;
        obj.getClass();
        H((Object[]) obj);
        this.f39851f = i11;
        if (objArrT[1] == null) {
            G((Object[]) objArrT[0]);
            this.f39846a = i12 - 5;
        } else {
            G(objArrT);
            this.f39846a = i12;
        }
    }

    public final Object[] v(Object[] objArr, int i11, int i12, Iterator it) {
        if (!it.hasNext()) {
            h2.b("Check failed.");
            return null;
        }
        if (i12 < 0) {
            h2.b("Check failed.");
            return null;
        }
        if (i12 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrO = o(objArr);
        int iV = h0.g.v(i11, i12);
        int i13 = i12 - 5;
        objArrO[iV] = v((Object[]) objArrO[iV], i11, i13, it);
        while (true) {
            iV++;
            if (iV >= 32 || !it.hasNext()) {
                break;
            }
            objArrO[iV] = v((Object[]) objArrO[iV], 0, i13, it);
        }
        return objArrO;
    }

    public final Object[] w(Object[] objArr, int i11, Object[][] objArr2) {
        Iterator it = ArrayIteratorKt.iterator(objArr2);
        int i12 = i11 >> 5;
        int i13 = this.f39846a;
        Object[] objArrV = i12 < (1 << i13) ? v(objArr, i11, i13, it) : o(objArr);
        while (it.hasNext()) {
            this.f39846a += 5;
            objArrV = r(objArrV);
            int i14 = this.f39846a;
            v(objArrV, 1 << i14, i14, it);
        }
        return objArrV;
    }

    public final void x(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i11 = this.f39851f >> 5;
        int i12 = this.f39846a;
        if (i11 > (1 << i12)) {
            G(y(this.f39846a + 5, r(objArr), objArr2));
            H(objArr3);
            this.f39846a += 5;
            this.f39851f++;
            return;
        }
        if (objArr == null) {
            G(objArr2);
            H(objArr3);
            this.f39851f++;
        } else {
            G(y(i12, objArr, objArr2));
            H(objArr3);
            this.f39851f++;
        }
    }

    public final Object[] y(int i11, Object[] objArr, Object[] objArr2) {
        int iV = h0.g.v(b() - 1, i11);
        Object[] objArrO = o(objArr);
        if (i11 == 5) {
            objArrO[iV] = objArr2;
            return objArrO;
        }
        objArrO[iV] = y(i11 - 5, (Object[]) objArrO[iV], objArr2);
        return objArrO;
    }

    public final int z(q3.b bVar, Object[] objArr, int i11, int i12, jd.f fVar, ArrayList arrayList, ArrayList arrayList2) {
        if (m(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = fVar.f24983b;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrQ = objArr2;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj2 = objArr[i13];
            if (!((Boolean) bVar.invoke(obj2)).booleanValue()) {
                if (i12 == 32) {
                    objArrQ = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : q();
                    i12 = 0;
                }
                objArrQ[i12] = obj2;
                i12++;
            }
        }
        fVar.f24983b = objArrQ;
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
        int iJ = J();
        if (iJ < 32) {
            Object[] objArrO = o(this.f39850e);
            objArrO[iJ] = obj;
            H(objArrO);
            this.f39851f = b() + 1;
        } else {
            x(this.f39849d, this.f39850e, r(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iJ = J();
        Iterator it = collection.iterator();
        if (32 - iJ >= collection.size()) {
            Object[] objArrO = o(this.f39850e);
            g(objArrO, iJ, it);
            H(objArrO);
            this.f39851f = collection.size() + this.f39851f;
            return true;
        }
        int size = ((collection.size() + iJ) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrO2 = o(this.f39850e);
        g(objArrO2, iJ, it);
        objArr[0] = objArrO2;
        for (int i11 = 1; i11 < size; i11++) {
            Object[] objArrQ = q();
            g(objArrQ, 0, it);
            objArr[i11] = objArrQ;
        }
        G(w(this.f39849d, E(), objArr));
        Object[] objArrQ2 = q();
        g(objArrQ2, 0, it);
        H(objArrQ2);
        this.f39851f = collection.size() + this.f39851f;
        return true;
    }
}
