package io;

import com.adyen.checkout.components.core.Address;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.order.OrderType;
import e0.f;
import f70.i;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OrderType f24071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f24072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f24073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f24074f;

    public a(String str, String str2, OrderType orderType, boolean z11, i iVar, int i11) {
        str = (i11 & 1) != 0 ? null : str;
        str2 = (i11 & 2) != 0 ? null : str2;
        z11 = (i11 & 8) != 0 ? false : z11;
        boolean z12 = (i11 & 16) == 0;
        iVar = (i11 & 32) != 0 ? i.UNKNOWN : iVar;
        orderType.getClass();
        iVar.getClass();
        this.f24069a = str;
        this.f24070b = str2;
        this.f24071c = orderType;
        this.f24072d = z11;
        this.f24073e = z12;
        this.f24074f = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            goto L51
        L4:
            boolean r1 = r5 instanceof io.a
            r2 = 0
            if (r1 != 0) goto La
            goto L50
        La:
            io.a r5 = (io.a) r5
            java.lang.String r1 = r5.f24069a
            java.lang.String r3 = r4.f24069a
            if (r3 != 0) goto L18
            if (r1 != 0) goto L16
            r1 = r0
            goto L1f
        L16:
            r1 = r2
            goto L1f
        L18:
            if (r1 != 0) goto L1b
            goto L16
        L1b:
            boolean r1 = com.app.tgtg.model.remote.OrderId.m213equalsimpl0(r3, r1)
        L1f:
            if (r1 != 0) goto L22
            goto L50
        L22:
            java.lang.String r1 = r4.f24070b
            java.lang.String r3 = r5.f24070b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L2d
            goto L50
        L2d:
            com.app.tgtg.model.remote.order.OrderType r1 = r4.f24071c
            com.app.tgtg.model.remote.order.OrderType r3 = r5.f24071c
            if (r1 == r3) goto L34
            goto L50
        L34:
            boolean r1 = r4.f24072d
            boolean r3 = r5.f24072d
            if (r1 == r3) goto L3b
            goto L50
        L3b:
            boolean r1 = r4.f24073e
            boolean r3 = r5.f24073e
            if (r1 == r3) goto L42
            goto L50
        L42:
            f70.i r1 = r4.f24074f
            f70.i r5 = r5.f24074f
            if (r1 == r5) goto L49
            goto L50
        L49:
            r5 = 0
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r5)
            if (r5 != 0) goto L51
        L50:
            return r2
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f24069a;
        int iM214hashCodeimpl = (str == null ? 0 : OrderId.m214hashCodeimpl(str)) * 31;
        String str2 = this.f24070b;
        return (this.f24074f.hashCode() + k.e(k.e((this.f24071c.hashCode() + ((iM214hashCodeimpl + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31, this.f24072d), 31, this.f24073e)) * 31;
    }

    public final String toString() {
        String str = this.f24069a;
        StringBuilder sbT = f.t("OrderDataMule(orderId=", str == null ? Address.ADDRESS_NULL_PLACEHOLDER : OrderId.m215toStringimpl(str), ", invitationId=", this.f24070b, ", orderType=");
        sbT.append(this.f24071c);
        sbT.append(", autoShowRedeemerView=");
        sbT.append(this.f24072d);
        sbT.append(", showRecommendation=");
        sbT.append(this.f24073e);
        sbT.append(", origin=");
        sbT.append(this.f24074f);
        sbT.append(", invitationExternalId=null)");
        return sbT.toString();
    }
}
