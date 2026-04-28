package ok;

import com.adyen.checkout.components.core.Address;
import com.app.tgtg.model.remote.VoucherId;
import com.app.tgtg.model.remote.item.response.BasicItem;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicItem f32595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f32596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f32597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f32598d;

    public h0(BasicItem basicItem, String str, String str2, boolean z11) {
        basicItem.getClass();
        this.f32595a = basicItem;
        this.f32596b = str;
        this.f32597c = str2;
        this.f32598d = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
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
            boolean r1 = r5 instanceof ok.h0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ok.h0 r5 = (ok.h0) r5
            com.app.tgtg.model.remote.item.response.BasicItem r1 = r4.f32595a
            com.app.tgtg.model.remote.item.response.BasicItem r3 = r5.f32595a
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f32596b
            java.lang.String r3 = r5.f32596b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r5.f32597c
            java.lang.String r3 = r4.f32597c
            if (r3 != 0) goto L2e
            if (r1 != 0) goto L2c
            r1 = r0
            goto L35
        L2c:
            r1 = r2
            goto L35
        L2e:
            if (r1 != 0) goto L31
            goto L2c
        L31:
            boolean r1 = com.app.tgtg.model.remote.VoucherId.m302equalsimpl0(r3, r1)
        L35:
            if (r1 != 0) goto L38
            return r2
        L38:
            boolean r1 = r4.f32598d
            boolean r5 = r5.f32598d
            if (r1 == r5) goto L3f
            return r2
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ok.h0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = this.f32595a.hashCode() * 31;
        String str = this.f32596b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f32597c;
        return Boolean.hashCode(this.f32598d) + ((iHashCode2 + (str2 != null ? VoucherId.m303hashCodeimpl(str2) : 0)) * 31);
    }

    public final String toString() {
        String str = this.f32597c;
        return "AllergensAccepted(item=" + this.f32595a + ", fillerType=" + this.f32596b + ", preselectedVoucherId=" + (str == null ? Address.ADDRESS_NULL_PLACEHOLDER : VoucherId.m304toStringimpl(str)) + ", preselectedCurrencyVoucher=" + this.f32598d + ")";
    }
}
