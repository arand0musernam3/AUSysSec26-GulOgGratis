package o00;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 implements Map, Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e0 f31645g = new e0(0, null, new Object[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient b0 f31646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient c0 f31647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient d0 f31648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object f31649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f31650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f31651f;

    public e0(int i11, Object obj, Object[] objArr) {
        this.f31649d = obj;
        this.f31650e = objArr;
        this.f31651f = i11;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        d0 d0Var = this.f31648c;
        if (d0Var == null) {
            d0Var = new d0(this.f31650e, 1, this.f31651f);
            this.f31648c = d0Var;
        }
        return d0Var.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        b0 b0Var = this.f31646a;
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = new b0(this, this.f31650e, this.f31651f);
        this.f31646a = b0Var2;
        return b0Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0038->B:22:0x004e], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0063->B:32:0x007a], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0089->B:43:0x00a0]] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9c
        L6:
            r1 = 1
            int r2 = r9.f31651f
            java.lang.Object[] r3 = r9.f31650e
            if (r2 != r1) goto L20
            r2 = 0
            r2 = r3[r2]
            java.util.Objects.requireNonNull(r2)
            boolean r10 = r2.equals(r10)
            if (r10 == 0) goto L3
            r10 = r3[r1]
            java.util.Objects.requireNonNull(r10)
            goto L9c
        L20:
            java.lang.Object r2 = r9.f31649d
            if (r2 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r2 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L51
            r4 = r2
            byte[] r4 = (byte[]) r4
            int r2 = r4.length
            int r6 = r2 + (-1)
            int r2 = r10.hashCode()
            int r2 = o30.e0.I(r2)
        L38:
            r2 = r2 & r6
            r5 = r4[r2]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L3
        L41:
            r7 = r3[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r3[r10]
            goto L9c
        L4e:
            int r2 = r2 + 1
            goto L38
        L51:
            boolean r4 = r2 instanceof short[]
            if (r4 == 0) goto L7d
            r4 = r2
            short[] r4 = (short[]) r4
            int r2 = r4.length
            int r6 = r2 + (-1)
            int r2 = r10.hashCode()
            int r2 = o30.e0.I(r2)
        L63:
            r2 = r2 & r6
            short r5 = r4[r2]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L3
        L6d:
            r7 = r3[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r3[r10]
            goto L9c
        L7a:
            int r2 = r2 + 1
            goto L63
        L7d:
            int[] r2 = (int[]) r2
            int r4 = r2.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = o30.e0.I(r6)
        L89:
            r6 = r6 & r4
            r7 = r2[r6]
            if (r7 != r5) goto L90
            goto L3
        L90:
            r8 = r3[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r3[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: o00.e0.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        b0 b0Var = this.f31646a;
        if (b0Var == null) {
            b0Var = new b0(this, this.f31650e, this.f31651f);
            this.f31646a = b0Var;
        }
        Iterator it = b0Var.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        c0 c0Var = this.f31647b;
        if (c0Var != null) {
            return c0Var;
        }
        c0 c0Var2 = new c0(this, new d0(this.f31650e, 0, this.f31651f));
        this.f31647b = c0Var2;
        return c0Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f31651f;
    }

    public final String toString() {
        int i11 = this.f31651f;
        if (i11 < 0) {
            i4.a.f(e0.f.h(i11, "size cannot be negative but was: ", new StringBuilder(String.valueOf(i11).length() + 33)));
            return null;
        }
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) i11) * 8, 1073741824L));
        sb2.append('{');
        boolean z11 = true;
        for (Map.Entry entry : (b0) entrySet()) {
            if (!z11) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z11 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        d0 d0Var = this.f31648c;
        if (d0Var != null) {
            return d0Var;
        }
        d0 d0Var2 = new d0(this.f31650e, 1, this.f31651f);
        this.f31648c = d0Var2;
        return d0Var2;
    }
}
