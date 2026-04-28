package ok;

import com.adyen.checkout.components.core.Address;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.remote.VoucherId;
import com.app.tgtg.model.remote.item.response.BasicItem;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v implements f70.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicItem f32626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f32627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f32628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f32629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f32630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f32631f;

    public v(BasicItem basicItem, String str, String str2, boolean z11) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        basicItem.getClass();
        this.f32626a = basicItem;
        this.f32627b = AppConstants.RETURN_URL_ITEMVIEW_ADYEN;
        this.f32628c = str;
        this.f32629d = str2;
        this.f32630e = z11;
        this.f32631f = jCurrentTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof ok.v
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ok.v r8 = (ok.v) r8
            com.app.tgtg.model.remote.item.response.BasicItem r1 = r7.f32626a
            com.app.tgtg.model.remote.item.response.BasicItem r3 = r8.f32626a
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r7.f32627b
            java.lang.String r3 = r8.f32627b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r7.f32628c
            java.lang.String r3 = r8.f32628c
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r8.f32629d
            java.lang.String r3 = r7.f32629d
            if (r3 != 0) goto L39
            if (r1 != 0) goto L37
            r1 = r0
            goto L40
        L37:
            r1 = r2
            goto L40
        L39:
            if (r1 != 0) goto L3c
            goto L37
        L3c:
            boolean r1 = com.app.tgtg.model.remote.VoucherId.m302equalsimpl0(r3, r1)
        L40:
            if (r1 != 0) goto L43
            return r2
        L43:
            boolean r1 = r7.f32630e
            boolean r3 = r8.f32630e
            if (r1 == r3) goto L4a
            return r2
        L4a:
            long r3 = r7.f32631f
            long r5 = r8.f32631f
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L53
            return r2
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ok.v.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iB = l1.b(this.f32626a.hashCode() * 31, 31, this.f32627b);
        String str = this.f32628c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f32629d;
        return Long.hashCode(this.f32631f) + r8.k.e((iHashCode + (str2 != null ? VoucherId.m303hashCodeimpl(str2) : 0)) * 31, 31, this.f32630e);
    }

    public final String toString() {
        String str = this.f32629d;
        String strM304toStringimpl = str == null ? Address.ADDRESS_NULL_PLACEHOLDER : VoucherId.m304toStringimpl(str);
        StringBuilder sb2 = new StringBuilder("GoToCheckout(item=");
        sb2.append(this.f32626a);
        sb2.append(", returnUrl=");
        sb2.append(this.f32627b);
        sb2.append(", fillerType=");
        j4.s.A(sb2, this.f32628c, ", preselectedVoucherId=", strM304toStringimpl, ", preselectedCurrencyVoucher=");
        sb2.append(this.f32630e);
        sb2.append(", timestamp=");
        sb2.append(this.f32631f);
        sb2.append(")");
        return sb2.toString();
    }
}
