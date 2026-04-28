package v70;

import c50.w;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;
import m0.i1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements Map, Serializable, KMutableMap {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final f f42041n = new f(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final i f42042o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f42043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f42044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f42045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f42046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f42048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f42049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f42050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f42051i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r3.f f42052j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public r3.i f42053k;
    public j l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f42054m;

    static {
        i iVar = new i(0);
        iVar.f42054m = true;
        f42042o = iVar;
    }

    public i(int i11) {
        if (i11 < 0) {
            i4.a.f("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i11];
        int[] iArr = new int[i11];
        f42041n.getClass();
        int iHighestOneBit = Integer.highestOneBit((i11 < 1 ? 1 : i11) * 3);
        this.f42043a = objArr;
        this.f42044b = null;
        this.f42045c = iArr;
        this.f42046d = new int[iHighestOneBit];
        this.f42047e = 2;
        this.f42048f = 0;
        this.f42049g = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (!this.f42054m) {
            throw new NotSerializableException("The map cannot be serialized while it is being built.");
        }
        n nVar = new n();
        nVar.f42060a = this;
        return nVar;
    }

    public final int a(Object obj) {
        d();
        while (true) {
            int iJ = j(obj);
            int i11 = this.f42047e * 2;
            int length = this.f42046d.length / 2;
            if (i11 > length) {
                i11 = length;
            }
            int i12 = 0;
            while (true) {
                int[] iArr = this.f42046d;
                int i13 = iArr[iJ];
                if (i13 == 0) {
                    int i14 = this.f42048f;
                    Object[] objArr = this.f42043a;
                    if (i14 < objArr.length) {
                        int i15 = i14 + 1;
                        this.f42048f = i15;
                        objArr[i14] = obj;
                        this.f42045c[i14] = iJ;
                        iArr[iJ] = i15;
                        this.f42051i++;
                        this.f42050h++;
                        if (i12 > this.f42047e) {
                            this.f42047e = i12;
                        }
                        return i14;
                    }
                    g(1);
                } else {
                    if (Intrinsics.areEqual(this.f42043a[i13 - 1], obj)) {
                        return -i13;
                    }
                    i12++;
                    if (i12 > i11) {
                        k(this.f42046d.length * 2);
                        break;
                    }
                    iJ = iJ == 0 ? this.f42046d.length - 1 : iJ - 1;
                }
            }
        }
    }

    public final i b() {
        d();
        this.f42054m = true;
        if (this.f42051i > 0) {
            return this;
        }
        i iVar = f42042o;
        iVar.getClass();
        return iVar;
    }

    @Override // java.util.Map
    public final void clear() {
        d();
        int i11 = this.f42048f - 1;
        if (i11 >= 0) {
            int i12 = 0;
            while (true) {
                int[] iArr = this.f42045c;
                int i13 = iArr[i12];
                if (i13 >= 0) {
                    this.f42046d[i13] = 0;
                    iArr[i12] = -1;
                }
                if (i12 == i11) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        bx.o.N(this.f42043a, 0, this.f42048f);
        Object[] objArr = this.f42044b;
        if (objArr != null) {
            bx.o.N(objArr, 0, this.f42048f);
        }
        this.f42051i = 0;
        this.f42048f = 0;
        this.f42050h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final void d() {
        if (this.f42054m) {
            w.d();
        }
    }

    public final void e(boolean z11) {
        int i11;
        Object[] objArr = this.f42044b;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i11 = this.f42048f;
            if (i12 >= i11) {
                break;
            }
            int[] iArr = this.f42045c;
            int i14 = iArr[i12];
            if (i14 >= 0) {
                Object[] objArr2 = this.f42043a;
                objArr2[i13] = objArr2[i12];
                if (objArr != null) {
                    objArr[i13] = objArr[i12];
                }
                if (z11) {
                    iArr[i13] = i14;
                    this.f42046d[i14] = i13 + 1;
                }
                i13++;
            }
            i12++;
        }
        bx.o.N(this.f42043a, i13, i11);
        if (objArr != null) {
            bx.o.N(objArr, i13, this.f42048f);
        }
        this.f42048f = i13;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        j jVar = this.l;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this);
        this.l = jVar2;
        return jVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f42051i == map.size() && f(map.entrySet());
    }

    public final boolean f(Collection collection) {
        boolean zAreEqual;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int iH = h(entry.getKey());
                    if (iH < 0) {
                        zAreEqual = false;
                    } else {
                        Object[] objArr = this.f42044b;
                        objArr.getClass();
                        zAreEqual = Intrinsics.areEqual(objArr[iH], entry.getValue());
                    }
                    if (!zAreEqual) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final void g(int i11) {
        Object[] objArr = this.f42043a;
        int length = objArr.length;
        int i12 = this.f42048f;
        int i13 = length - i12;
        int i14 = i12 - this.f42051i;
        if (i13 < i11 && i13 + i14 >= i11 && i14 >= objArr.length / 4) {
            e(true);
            return;
        }
        int i15 = i12 + i11;
        if (i15 < 0) {
            throw new OutOfMemoryError();
        }
        if (i15 > objArr.length) {
            kotlin.collections.c cVar = kotlin.collections.f.f26505a;
            int length2 = objArr.length;
            cVar.getClass();
            int iE = kotlin.collections.c.e(length2, i15);
            Object[] objArr2 = this.f42043a;
            objArr2.getClass();
            this.f42043a = Arrays.copyOf(objArr2, iE);
            Object[] objArr3 = this.f42044b;
            this.f42044b = objArr3 != null ? Arrays.copyOf(objArr3, iE) : null;
            this.f42045c = Arrays.copyOf(this.f42045c, iE);
            f42041n.getClass();
            int iHighestOneBit = Integer.highestOneBit((iE >= 1 ? iE : 1) * 3);
            if (iHighestOneBit > this.f42046d.length) {
                k(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.f42044b;
        objArr.getClass();
        return objArr[iH];
    }

    public final int h(Object obj) {
        int iJ = j(obj);
        int i11 = this.f42047e;
        while (true) {
            int i12 = this.f42046d[iJ];
            if (i12 == 0) {
                return -1;
            }
            int i13 = i12 - 1;
            if (Intrinsics.areEqual(this.f42043a[i13], obj)) {
                return i13;
            }
            i11--;
            if (i11 < 0) {
                return -1;
            }
            iJ = iJ == 0 ? this.f42046d.length - 1 : iJ - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        g gVar = new g(this, 0);
        int i11 = 0;
        while (gVar.hasNext()) {
            int i12 = gVar.f21598a;
            i iVar = (i) gVar.f21601d;
            if (i12 >= iVar.f42048f) {
                i1.c();
                return 0;
            }
            gVar.f21598a = i12 + 1;
            gVar.f21599b = i12;
            Object obj = iVar.f42043a[i12];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = iVar.f42044b;
            objArr.getClass();
            Object obj2 = objArr[gVar.f21599b];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            gVar.f();
            i11 += iHashCode ^ iHashCode2;
        }
        return i11;
    }

    public final int i(Object obj) {
        int i11 = this.f42048f;
        while (true) {
            i11--;
            if (i11 < 0) {
                return -1;
            }
            if (this.f42045c[i11] >= 0) {
                Object[] objArr = this.f42044b;
                objArr.getClass();
                if (Intrinsics.areEqual(objArr[i11], obj)) {
                    return i11;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f42051i == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f42049g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        r3[r0] = r6;
        r5.f42045c[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(int r6) {
        /*
            r5 = this;
            int r0 = r5.f42050h
            int r0 = r0 + 1
            r5.f42050h = r0
            int r0 = r5.f42048f
            int r1 = r5.f42051i
            r2 = 0
            if (r0 <= r1) goto L10
            r5.e(r2)
        L10:
            int[] r0 = new int[r6]
            r5.f42046d = r0
            v70.f r0 = v70.i.f42041n
            r0.getClass()
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.f42049g = r6
        L21:
            int r6 = r5.f42048f
            if (r2 >= r6) goto L52
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f42043a
            r0 = r0[r2]
            int r0 = r5.j(r0)
            int r1 = r5.f42047e
        L31:
            int[] r3 = r5.f42046d
            r4 = r3[r0]
            if (r4 != 0) goto L3f
            r3[r0] = r6
            int[] r1 = r5.f42045c
            r1[r2] = r0
            r2 = r6
            goto L21
        L3f:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L4d
            int r4 = r0 + (-1)
            if (r0 != 0) goto L4b
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L31
        L4b:
            r0 = r4
            goto L31
        L4d:
            java.lang.String r6 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            com.braze.h2.b(r6)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v70.i.k(int):void");
    }

    @Override // java.util.Map
    public final Set keySet() {
        r3.f fVar = this.f42052j;
        if (fVar != null) {
            return fVar;
        }
        r3.f fVar2 = new r3.f(this, 2);
        this.f42052j = fVar2;
        return fVar2;
    }

    public final void l(int i11) {
        int i12;
        int i13;
        int iJ;
        int[] iArr;
        Object[] objArr = this.f42043a;
        objArr.getClass();
        objArr[i11] = null;
        Object[] objArr2 = this.f42044b;
        if (objArr2 != null) {
            objArr2[i11] = null;
        }
        int length = this.f42045c[i11];
        loop0: while (true) {
            int i14 = length;
            int i15 = 0;
            do {
                length = length == 0 ? this.f42046d.length - 1 : length - 1;
                int[] iArr2 = this.f42046d;
                i12 = iArr2[length];
                i15++;
                if (i15 > this.f42047e) {
                    iArr2[i14] = 0;
                    break loop0;
                } else if (i12 == 0) {
                    iArr2[i14] = 0;
                    break loop0;
                } else {
                    i13 = i12 - 1;
                    iJ = j(this.f42043a[i13]) - length;
                    iArr = this.f42046d;
                }
            } while ((iJ & (iArr.length - 1)) < i15);
            iArr[i14] = i12;
            this.f42045c[i13] = i14;
        }
        this.f42045c[i11] = -1;
        this.f42051i--;
        this.f42050h++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        d();
        int iA = a(obj);
        Object[] objArr = this.f42044b;
        if (objArr == null) {
            int length = this.f42043a.length;
            if (length < 0) {
                i4.a.f("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.f42044b = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i11 = (-iA) - 1;
        Object obj3 = objArr[i11];
        objArr[i11] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        d();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        g(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.f42044b;
            if (objArr == null) {
                int length = this.f42043a.length;
                if (length < 0) {
                    i4.a.f("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.f42044b = objArr;
                }
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i11 = (-iA) - 1;
                if (!Intrinsics.areEqual(entry.getValue(), objArr[i11])) {
                    objArr[i11] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        d();
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.f42044b;
        objArr.getClass();
        Object obj2 = objArr[iH];
        l(iH);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f42051i;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f42051i * 3) + 2);
        sb2.append("{");
        int i11 = 0;
        g gVar = new g(this, 0);
        while (gVar.hasNext()) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            int i12 = gVar.f21598a;
            i iVar = (i) gVar.f21601d;
            if (i12 >= iVar.f42048f) {
                i1.c();
                return null;
            }
            gVar.f21598a = i12 + 1;
            gVar.f21599b = i12;
            Object obj = iVar.f42043a[i12];
            if (obj == iVar) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = iVar.f42044b;
            objArr.getClass();
            Object obj2 = objArr[gVar.f21599b];
            if (obj2 == iVar) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            gVar.f();
            i11++;
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        r3.i iVar = this.f42053k;
        if (iVar != null) {
            return iVar;
        }
        r3.i iVar2 = new r3.i(this, 1);
        this.f42053k = iVar2;
        return iVar2;
    }

    public i() {
        this(8);
    }
}
