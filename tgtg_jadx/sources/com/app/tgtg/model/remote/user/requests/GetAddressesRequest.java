package com.app.tgtg.model.remote.user.requests;

import com.adyen.checkout.components.core.Address;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.ItemId$$serializer;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import m90.r1;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J(\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u0017¨\u0006,"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/GetAddressesRequest;", "", "", "countryId", "Lcom/app/tgtg/model/remote/ItemId;", "itemId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/requests/GetAddressesRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2-RWxzYZM", "component2", "copy-PZgz330", "(Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/user/requests/GetAddressesRequest;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCountryId", "getCountryId$annotations", "()V", "getItemId-RWxzYZM", "getItemId-RWxzYZM$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class GetAddressesRequest {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String countryId;

    @Nullable
    private final String itemId;

    private /* synthetic */ GetAddressesRequest(int i11, String str, String str2, m1 m1Var) {
        if (1 != (i11 & 1)) {
            c1.j(i11, 1, GetAddressesRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.countryId = str;
        if ((i11 & 2) == 0) {
            this.itemId = null;
        } else {
            this.itemId = str2;
        }
    }

    /* JADX INFO: renamed from: copy-PZgz330$default, reason: not valid java name */
    public static /* synthetic */ GetAddressesRequest m514copyPZgz330$default(GetAddressesRequest getAddressesRequest, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = getAddressesRequest.countryId;
        }
        if ((i11 & 2) != 0) {
            str2 = getAddressesRequest.itemId;
        }
        return getAddressesRequest.m517copyPZgz330(str, str2);
    }

    public static final /* synthetic */ void write$Self$app(GetAddressesRequest self, b output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, r1.f29848a, self.countryId);
        if (!output.C(serialDesc) && self.itemId == null) {
            return;
        }
        ItemId$$serializer itemId$$serializer = ItemId$$serializer.INSTANCE;
        String str = self.itemId;
        output.r(serialDesc, 1, itemId$$serializer, str != null ? ItemId.m197boximpl(str) : null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCountryId() {
        return this.countryId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2-RWxzYZM, reason: not valid java name and from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-PZgz330, reason: not valid java name */
    public final GetAddressesRequest m517copyPZgz330(@Nullable String countryId, @Nullable String itemId) {
        return new GetAddressesRequest(countryId, itemId, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.app.tgtg.model.remote.user.requests.GetAddressesRequest
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.app.tgtg.model.remote.user.requests.GetAddressesRequest r5 = (com.app.tgtg.model.remote.user.requests.GetAddressesRequest) r5
            java.lang.String r1 = r4.countryId
            java.lang.String r3 = r5.countryId
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.itemId
            java.lang.String r5 = r5.itemId
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
            boolean r5 = com.app.tgtg.model.remote.ItemId.m201equalsimpl0(r1, r5)
        L2a:
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.remote.user.requests.GetAddressesRequest.equals(java.lang.Object):boolean");
    }

    @Nullable
    public final String getCountryId() {
        return this.countryId;
    }

    @Nullable
    /* JADX INFO: renamed from: getItemId-RWxzYZM, reason: not valid java name */
    public final String m518getItemIdRWxzYZM() {
        return this.itemId;
    }

    public int hashCode() {
        String str = this.countryId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.itemId;
        return iHashCode + (str2 != null ? ItemId.m202hashCodeimpl(str2) : 0);
    }

    @NotNull
    public String toString() {
        String str = this.countryId;
        String str2 = this.itemId;
        return a.d("GetAddressesRequest(countryId=", str, ", itemId=", str2 == null ? Address.ADDRESS_NULL_PLACEHOLDER : ItemId.m203toStringimpl(str2), ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/GetAddressesRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/requests/GetAddressesRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return GetAddressesRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("country_id")
    public static /* synthetic */ void getCountryId$annotations() {
    }

    @g("item_id")
    /* JADX INFO: renamed from: getItemId-RWxzYZM$annotations, reason: not valid java name */
    public static /* synthetic */ void m515getItemIdRWxzYZM$annotations() {
    }

    public /* synthetic */ GetAddressesRequest(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public /* synthetic */ GetAddressesRequest(int i11, String str, String str2, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, m1Var);
    }

    private GetAddressesRequest(String str, String str2) {
        this.countryId = str;
        this.itemId = str2;
    }

    public /* synthetic */ GetAddressesRequest(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, null);
    }
}
