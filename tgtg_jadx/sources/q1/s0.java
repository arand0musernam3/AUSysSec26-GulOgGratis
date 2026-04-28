package q1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableSet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements KMutableSet, Set, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f35827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f35828b;

    public s0(p0 p0Var) {
        p0Var.getClass();
        this.f35827a = p0Var;
        this.f35828b = p0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f35828b.b(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        p0 p0Var = this.f35828b;
        p0Var.getClass();
        collection2.getClass();
        int i11 = p0Var.f35743g;
        for (Object obj : collection2) {
            int iD = p0Var.d(obj);
            p0Var.f35738b[iD] = obj;
            long[] jArr = p0Var.f35739c;
            int i12 = p0Var.f35740d;
            jArr[iD] = (((long) i12) & 2147483647L) | 4611686016279904256L;
            if (i12 != Integer.MAX_VALUE) {
                jArr[i12] = ((((long) iD) & 2147483647L) << 31) | (jArr[i12] & (-4611686016279904257L));
            }
            p0Var.f35740d = iD;
            if (p0Var.f35741e == Integer.MAX_VALUE) {
                p0Var.f35741e = iD;
            }
        }
        return i11 != p0Var.f35743g;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f35828b.c();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f35827a.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f35827a.a(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s0.class != obj.getClass()) {
            return false;
        }
        return Intrinsics.areEqual(this.f35827a, ((s0) obj).f35827a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f35827a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f35827a.f35743g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new r0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f35828b.g(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0094, code lost:
    
        if (((r5 & ((~r5) << 6)) & r12) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0096, code lost:
    
        r14 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean removeAll(java.util.Collection r21) {
        /*
            r20 = this;
            r21.getClass()
            r0 = r21
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = r20
            q1.p0 r2 = r1.f35828b
            r2.getClass()
            r0.getClass()
            int r3 = r2.f35743g
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r4 = r0.hasNext()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto La5
            java.lang.Object r4 = r0.next()
            if (r4 == 0) goto L2a
            int r7 = r4.hashCode()
            goto L2b
        L2a:
            r7 = r6
        L2b:
            r8 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r7 = r7 * r8
            int r8 = r7 << 16
            r7 = r7 ^ r8
            r8 = r7 & 127(0x7f, float:1.78E-43)
            int r9 = r2.f35742f
            int r7 = r7 >>> 7
            r7 = r7 & r9
        L39:
            long[] r10 = r2.f35737a
            int r11 = r7 >> 3
            r12 = r7 & 7
            int r12 = r12 << 3
            r13 = r10[r11]
            long r13 = r13 >>> r12
            int r11 = r11 + r5
            r15 = r10[r11]
            int r10 = 64 - r12
            long r10 = r15 << r10
            r21 = r5
            r15 = r6
            long r5 = (long) r12
            long r5 = -r5
            r12 = 63
            long r5 = r5 >> r12
            long r5 = r5 & r10
            long r5 = r5 | r13
            long r10 = (long) r8
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r12
            long r10 = r10 ^ r5
            long r12 = r10 - r12
            long r10 = ~r10
            long r10 = r10 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
        L67:
            r16 = 0
            int r14 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r14 == 0) goto L8a
            int r14 = java.lang.Long.numberOfTrailingZeros(r10)
            int r14 = r14 >> 3
            int r14 = r14 + r7
            r14 = r14 & r9
            r18 = r12
            java.lang.Object[] r12 = r2.f35738b
            r12 = r12[r14]
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual(r12, r4)
            if (r12 == 0) goto L82
            goto L97
        L82:
            r12 = 1
            long r12 = r10 - r12
            long r10 = r10 & r12
            r12 = r18
            goto L67
        L8a:
            r18 = r12
            long r10 = ~r5
            r12 = 6
            long r10 = r10 << r12
            long r5 = r5 & r10
            long r5 = r5 & r18
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 == 0) goto L9e
            r14 = -1
        L97:
            if (r14 < 0) goto L17
            r2.h(r14)
            goto L17
        L9e:
            int r6 = r15 + 8
            int r7 = r7 + r6
            r7 = r7 & r9
            r5 = r21
            goto L39
        La5:
            r21 = r5
            int r0 = r2.f35743g
            if (r3 == r0) goto Lac
            return r21
        Lac:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.s0.removeAll(java.util.Collection):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.f35828b.i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f35827a.f35743g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return CollectionToArray.toArray(this, objArr);
    }

    public final String toString() {
        return this.f35827a.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }
}
