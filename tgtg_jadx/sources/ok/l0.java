package ok;

import com.adyen.checkout.components.core.Address;
import com.app.tgtg.model.remote.VoucherId;
import com.app.tgtg.model.remote.item.response.BasicItem;
import nk.v0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicItem f32608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f32609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f32610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f32611d;

    public l0(BasicItem basicItem, v0 v0Var, String str, boolean z11) {
        this.f32608a = basicItem;
        this.f32609b = v0Var;
        this.f32610c = str;
        this.f32611d = z11;
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
            goto L3f
        L4:
            boolean r1 = r5 instanceof ok.l0
            r2 = 0
            if (r1 != 0) goto La
            goto L3e
        La:
            ok.l0 r5 = (ok.l0) r5
            com.app.tgtg.model.remote.item.response.BasicItem r1 = r4.f32608a
            com.app.tgtg.model.remote.item.response.BasicItem r3 = r5.f32608a
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            goto L3e
        L17:
            nk.v0 r1 = r4.f32609b
            nk.v0 r3 = r5.f32609b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L22
            goto L3e
        L22:
            java.lang.String r1 = r5.f32610c
            java.lang.String r3 = r4.f32610c
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
            goto L3e
        L38:
            boolean r1 = r4.f32611d
            boolean r5 = r5.f32611d
            if (r1 == r5) goto L3f
        L3e:
            return r2
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ok.l0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = (this.f32609b.hashCode() + (this.f32608a.hashCode() * 31)) * 31;
        String str = this.f32610c;
        return Boolean.hashCode(this.f32611d) + ((iHashCode + (str == null ? 0 : VoucherId.m303hashCodeimpl(str))) * 31);
    }

    public final String toString() {
        String str = this.f32610c;
        return "ReserveClicked(item=" + this.f32608a + ", trackingParams=" + this.f32609b + ", preselectedVoucherId=" + (str == null ? Address.ADDRESS_NULL_PLACEHOLDER : VoucherId.m304toStringimpl(str)) + ", preselectedCurrencyVoucher=" + this.f32611d + ")";
    }
}
