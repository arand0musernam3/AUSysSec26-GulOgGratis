package d30;

import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends IntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f14024b;

    public g(String str, Long l) {
        this.f14023a = str;
        this.f14024b = l;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long a() {
        return this.f14024b;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String b() {
        return this.f14023a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            goto L37
        L4:
            boolean r1 = r6 instanceof com.google.android.play.core.integrity.IntegrityTokenRequest
            r2 = 0
            if (r1 == 0) goto L24
            r1 = r6
            com.google.android.play.core.integrity.IntegrityTokenRequest r1 = (com.google.android.play.core.integrity.IntegrityTokenRequest) r1
            java.lang.String r3 = r5.f14023a
            java.lang.String r4 = r1.b()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L24
            java.lang.Long r3 = r5.f14024b
            if (r3 != 0) goto L26
            java.lang.Long r1 = r1.a()
            if (r1 != 0) goto L24
        L22:
            r1 = r0
            goto L31
        L24:
            r1 = r2
            goto L31
        L26:
            java.lang.Long r1 = r1.a()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L24
            goto L22
        L31:
            boolean r6 = r6 instanceof d30.g
            if (r6 == 0) goto L39
            if (r1 == 0) goto L38
        L37:
            return r0
        L38:
            return r2
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d30.g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = this.f14023a.hashCode() ^ 1000003;
        Long l = this.f14024b;
        return ((iHashCode * 1000003) ^ (l == null ? 0 : l.hashCode())) * 1000003;
    }

    public final String toString() {
        return ("IntegrityTokenRequest{nonce=" + this.f14023a + ", cloudProjectNumber=" + this.f14024b).concat(", network=null").concat("}");
    }
}
