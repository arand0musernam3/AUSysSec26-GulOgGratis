package ts;

import com.adyen.checkout.components.core.Address;
import com.app.tgtg.model.remote.VoucherId;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40461b;

    public q(String str, String str2) {
        this.f40460a = str;
        this.f40461b = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof ts.q
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ts.q r5 = (ts.q) r5
            java.lang.String r1 = r4.f40460a
            java.lang.String r3 = r5.f40460a
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r5 = r5.f40461b
            java.lang.String r1 = r4.f40461b
            if (r1 != 0) goto L23
            if (r5 != 0) goto L21
            r5 = r0
            goto L2a
        L21:
            r5 = r2
            goto L2a
        L23:
            if (r5 != 0) goto L26
            goto L21
        L26:
            boolean r5 = com.app.tgtg.model.remote.VoucherId.m302equalsimpl0(r1, r5)
        L2a:
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ts.q.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f40460a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f40461b;
        return iHashCode + (str2 != null ? VoucherId.m303hashCodeimpl(str2) : 0);
    }

    public final String toString() {
        String str = this.f40461b;
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("InitialSetup(code=", this.f40460a, ", voucherId=", str == null ? Address.ADDRESS_NULL_PLACEHOLDER : VoucherId.m304toStringimpl(str), ")");
    }
}
