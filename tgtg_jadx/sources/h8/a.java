package h8;

import com.braze.h2;
import g9.r0;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.w0;
import lz.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f21658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f21659b;

    public a(LinkedHashMap linkedHashMap, boolean z11) {
        this.f21658a = linkedHashMap;
        this.f21659b = new i(z11);
    }

    @Override // h8.g
    public final Map a() {
        Pair pair;
        Set<Map.Entry> setEntrySet = this.f21658a.entrySet();
        int iA = w0.a(e0.o(setEntrySet, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                pair = new Pair(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.f26485a, pair.f26486b);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    @Override // h8.g
    public final Object b(e eVar) {
        eVar.getClass();
        Object obj = this.f21658a.get(eVar);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final void d() {
        if (((AtomicBoolean) this.f21659b.f28446b).get()) {
            h2.b("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void e(e eVar) {
        eVar.getClass();
        d();
        this.f21658a.remove(eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof h8.a
            r1 = 0
            if (r0 != 0) goto L6
            goto L60
        L6:
            h8.a r7 = (h8.a) r7
            java.util.LinkedHashMap r7 = r7.f21658a
            java.util.LinkedHashMap r0 = r6.f21658a
            r2 = 1
            if (r7 != r0) goto L10
            goto L61
        L10:
            int r3 = r7.size()
            int r4 = r0.size()
            if (r3 == r4) goto L1b
            goto L60
        L1b:
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L22
            goto L61
        L22:
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L2a:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L61
            java.lang.Object r3 = r7.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r4 = r0.get(r4)
            if (r4 == 0) goto L5d
            java.lang.Object r3 = r3.getValue()
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L58
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L5d
            byte[] r3 = (byte[]) r3
            byte[] r4 = (byte[]) r4
            boolean r3 = java.util.Arrays.equals(r3, r4)
            if (r3 == 0) goto L5d
            r3 = r2
            goto L5e
        L58:
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            goto L5e
        L5d:
            r3 = r1
        L5e:
            if (r3 != 0) goto L2a
        L60:
            return r1
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.a.equals(java.lang.Object):boolean");
    }

    public final void f(e eVar, Object obj) {
        eVar.getClass();
        g(eVar, obj);
    }

    public final void g(e eVar, Object obj) {
        eVar.getClass();
        d();
        if (obj == null) {
            e(eVar);
            return;
        }
        boolean z11 = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.f21658a;
        if (z11) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(CollectionsKt.v0((Set) obj));
            setUnmodifiableSet.getClass();
            linkedHashMap.put(eVar, setUnmodifiableSet);
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(eVar, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(eVar, Arrays.copyOf(bArr, bArr.length));
        }
    }

    public final int hashCode() {
        Iterator it = this.f21658a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return CollectionsKt.U(this.f21658a.entrySet(), ",\n", "{\n", "\n}", new r0(23), 24);
    }

    public /* synthetic */ a(boolean z11) {
        this(new LinkedHashMap(), z11);
    }
}
