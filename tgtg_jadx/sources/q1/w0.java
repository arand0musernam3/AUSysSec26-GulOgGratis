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
public final class w0 implements KMutableSet, Set, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f35851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f35852b;

    public w0(u0 u0Var) {
        this.f35851a = u0Var;
        this.f35852b = u0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f35852b.d(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        u0 u0Var = this.f35852b;
        int i11 = u0Var.f35771d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            u0Var.j(it.next());
        }
        return i11 != u0Var.f35771d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f35852b.e();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f35851a.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f35851a.a(it.next())) {
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
        if (obj == null || w0.class != obj.getClass()) {
            return false;
        }
        return Intrinsics.areEqual(this.f35851a, ((w0) obj).f35851a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f35851a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f35851a.b();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new r0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f35852b.l(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        u0 u0Var = this.f35852b;
        int i11 = u0Var.f35771d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            u0Var.i(it.next());
        }
        return i11 != u0Var.f35771d;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean retainAll(java.util.Collection r18) {
        /*
            r17 = this;
            r18.getClass()
            r0 = r17
            q1.u0 r1 = r0.f35852b
            java.lang.Object[] r2 = r1.f35769b
            int r3 = r1.f35771d
            long[] r4 = r1.f35768a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L56
            r7 = r6
        L14:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L51
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2e:
            if (r12 >= r10) goto L4f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4b
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r18
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            r15 = r2[r13]
            boolean r14 = kotlin.collections.CollectionsKt.I(r14, r15)
            if (r14 != 0) goto L4b
            r1.m(r13)
        L4b:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2e
        L4f:
            if (r10 != r11) goto L56
        L51:
            if (r7 == r5) goto L56
            int r7 = r7 + 1
            goto L14
        L56:
            int r1 = r1.f35771d
            if (r3 == r1) goto L5c
            r1 = 1
            return r1
        L5c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.w0.retainAll(java.util.Collection):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f35851a.f35771d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return CollectionToArray.toArray(this, objArr);
    }

    public final String toString() {
        return this.f35851a.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }
}
