package ib;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f23726b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f23727a;

    static {
        h hVar = new h(new LinkedHashMap());
        ex.i.L(hVar);
        f23726b = hVar;
    }

    public h(h hVar) {
        hVar.getClass();
        this.f23727a = new HashMap(hVar.f23727a);
    }

    public final String a(String str) {
        Object obj = this.f23727a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean b(String str) {
        Object obj = this.f23727a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L5
            goto L66
        L5:
            r1 = 0
            if (r9 == 0) goto L67
            java.lang.Class<ib.h> r2 = ib.h.class
            java.lang.Class r3 = r9.getClass()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L15
            goto L67
        L15:
            ib.h r9 = (ib.h) r9
            java.util.HashMap r9 = r9.f23727a
            java.util.HashMap r2 = r8.f23727a
            java.util.Set r3 = r2.keySet()
            java.util.Set r4 = r9.keySet()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r4 != 0) goto L2a
            goto L67
        L2a:
            java.util.Iterator r3 = r3.iterator()
        L2e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L66
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.get(r4)
            java.lang.Object r4 = r9.get(r4)
            if (r5 == 0) goto L5e
            if (r4 != 0) goto L47
            goto L5e
        L47:
            boolean r6 = r5 instanceof java.lang.Object[]
            if (r6 == 0) goto L59
            r6 = r5
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            boolean r7 = r4 instanceof java.lang.Object[]
            if (r7 == 0) goto L59
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            boolean r4 = kotlin.collections.v.b(r6, r4)
            goto L63
        L59:
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r4)
            goto L63
        L5e:
            if (r5 != r4) goto L62
            r4 = r0
            goto L63
        L62:
            r4 = r1
        L63:
            if (r4 != 0) goto L2e
            goto L67
        L66:
            return r0
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ib.h.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f23727a.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        return r8.k.p(new StringBuilder("Data {"), CollectionsKt.U(this.f23727a.entrySet(), null, null, null, new hb0.q(22), 31), "}");
    }

    public h(LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        this.f23727a = new HashMap(linkedHashMap);
    }
}
