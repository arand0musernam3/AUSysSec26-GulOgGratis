package ok;

import com.adyen.checkout.components.core.Address;
import com.app.tgtg.model.remote.VoucherId;
import com.app.tgtg.model.remote.item.response.BasicItem;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w implements f70.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicItem f32632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f32633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f32634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f32635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f32636e;

    public w(BasicItem basicItem, String str, String str2, boolean z11) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f32632a = basicItem;
        this.f32633b = str;
        this.f32634c = str2;
        this.f32635d = z11;
        this.f32636e = jCurrentTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
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
            boolean r1 = r8 instanceof ok.w
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ok.w r8 = (ok.w) r8
            com.app.tgtg.model.remote.item.response.BasicItem r1 = r7.f32632a
            com.app.tgtg.model.remote.item.response.BasicItem r3 = r8.f32632a
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r7.f32633b
            java.lang.String r3 = r8.f32633b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r8.f32634c
            java.lang.String r3 = r7.f32634c
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
            boolean r1 = r7.f32635d
            boolean r3 = r8.f32635d
            if (r1 == r3) goto L3f
            return r2
        L3f:
            long r3 = r7.f32636e
            long r5 = r8.f32636e
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L48
            return r2
        L48:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ok.w.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = this.f32632a.hashCode() * 31;
        String str = this.f32633b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f32634c;
        return Long.hashCode(this.f32636e) + r8.k.e((iHashCode2 + (str2 != null ? VoucherId.m303hashCodeimpl(str2) : 0)) * 31, 31, this.f32635d);
    }

    public final String toString() {
        String str = this.f32634c;
        String strM304toStringimpl = str == null ? Address.ADDRESS_NULL_PLACEHOLDER : VoucherId.m304toStringimpl(str);
        StringBuilder sb2 = new StringBuilder("OpenAllergensBottomSheet(item=");
        sb2.append(this.f32632a);
        sb2.append(", fillerType=");
        sb2.append(this.f32633b);
        sb2.append(", preselectedVoucherId=");
        r8.k.z(sb2, strM304toStringimpl, ", preselectedCurrencyVoucher=", this.f32635d, ", timestamp=");
        return w.a0.j(this.f32636e, ")", sb2);
    }
}
