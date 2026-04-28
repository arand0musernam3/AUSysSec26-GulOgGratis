package zw;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f48234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f48235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f48236e;

    public i(String str, int i11, int i12, boolean z11, boolean z12) {
        this.f48232a = i11;
        this.f48233b = i12;
        this.f48234c = z11;
        this.f48235d = z12;
        this.f48236e = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065 A[RETURN] */
    @Override // zw.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(zw.n1 r8) {
        /*
            r7 = this;
            boolean r0 = r7.f48235d
            java.lang.String r1 = r7.f48236e
            if (r0 == 0) goto Lc
            if (r1 != 0) goto Lc
            java.lang.String r1 = r8.n()
        Lc:
            zw.l1 r0 = r8.f48324b
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L3c
            java.util.List r0 = r0.getChildren()
            java.util.Iterator r0 = r0.iterator()
            r4 = r2
            r5 = r4
        L1c:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L3e
            java.lang.Object r6 = r0.next()
            zw.p1 r6 = (zw.p1) r6
            zw.n1 r6 = (zw.n1) r6
            if (r6 != r8) goto L2d
            r4 = r5
        L2d:
            if (r1 == 0) goto L39
            java.lang.String r6 = r6.n()
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L1c
        L39:
            int r5 = r5 + 1
            goto L1c
        L3c:
            r4 = r2
            r5 = r3
        L3e:
            boolean r8 = r7.f48234c
            if (r8 == 0) goto L44
            int r4 = r4 + r3
            goto L46
        L44:
            int r4 = r5 - r4
        L46:
            int r8 = r7.f48233b
            int r0 = r7.f48232a
            if (r0 != 0) goto L4f
            if (r4 != r8) goto L65
            goto L64
        L4f:
            int r4 = r4 - r8
            int r8 = r4 % r0
            if (r8 != 0) goto L65
            int r8 = java.lang.Integer.signum(r4)
            if (r8 == 0) goto L64
            int r8 = java.lang.Integer.signum(r4)
            int r0 = java.lang.Integer.signum(r0)
            if (r8 != r0) goto L65
        L64:
            return r3
        L65:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: zw.i.a(zw.n1):boolean");
    }

    public final String toString() {
        String str = this.f48234c ? "" : "last-";
        int i11 = this.f48233b;
        boolean z11 = this.f48235d;
        int i12 = this.f48232a;
        return z11 ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(i12), Integer.valueOf(i11), this.f48236e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(i12), Integer.valueOf(i11));
    }
}
