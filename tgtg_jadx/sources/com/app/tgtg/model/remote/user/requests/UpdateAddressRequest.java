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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000212B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ4\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010,\u0012\u0004\b.\u0010+\u001a\u0004\b-\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b0\u0010+\u001a\u0004\b/\u0010\u001b¨\u00063"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/UpdateAddressRequest;", "", "Lcom/app/tgtg/model/remote/user/requests/UserAddress;", "mobileUserAddress", "", "ignorableViolationSeverity", "Lcom/app/tgtg/model/remote/ItemId;", "itemId", "<init>", "(Lcom/app/tgtg/model/remote/user/requests/UserAddress;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/user/requests/UserAddress;Ljava/lang/String;Ljava/lang/String;Lm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/requests/UpdateAddressRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/app/tgtg/model/remote/user/requests/UserAddress;", "component2", "()Ljava/lang/String;", "component3-RWxzYZM", "component3", "copy-k0luVHc", "(Lcom/app/tgtg/model/remote/user/requests/UserAddress;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/user/requests/UpdateAddressRequest;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/user/requests/UserAddress;", "getMobileUserAddress", "getMobileUserAddress$annotations", "()V", "Ljava/lang/String;", "getIgnorableViolationSeverity", "getIgnorableViolationSeverity$annotations", "getItemId-RWxzYZM", "getItemId-RWxzYZM$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class UpdateAddressRequest {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String ignorableViolationSeverity;

    @Nullable
    private final String itemId;

    @Nullable
    private final UserAddress mobileUserAddress;

    private /* synthetic */ UpdateAddressRequest(int i11, UserAddress userAddress, String str, String str2, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, UpdateAddressRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.mobileUserAddress = userAddress;
        this.ignorableViolationSeverity = str;
        if ((i11 & 4) == 0) {
            this.itemId = null;
        } else {
            this.itemId = str2;
        }
    }

    /* JADX INFO: renamed from: copy-k0luVHc$default, reason: not valid java name */
    public static /* synthetic */ UpdateAddressRequest m519copyk0luVHc$default(UpdateAddressRequest updateAddressRequest, UserAddress userAddress, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            userAddress = updateAddressRequest.mobileUserAddress;
        }
        if ((i11 & 2) != 0) {
            str = updateAddressRequest.ignorableViolationSeverity;
        }
        if ((i11 & 4) != 0) {
            str2 = updateAddressRequest.itemId;
        }
        return updateAddressRequest.m522copyk0luVHc(userAddress, str, str2);
    }

    public static final /* synthetic */ void write$Self$app(UpdateAddressRequest self, b output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, UserAddress$$serializer.INSTANCE, self.mobileUserAddress);
        output.r(serialDesc, 1, r1.f29848a, self.ignorableViolationSeverity);
        if (!output.C(serialDesc) && self.itemId == null) {
            return;
        }
        ItemId$$serializer itemId$$serializer = ItemId$$serializer.INSTANCE;
        String str = self.itemId;
        output.r(serialDesc, 2, itemId$$serializer, str != null ? ItemId.m197boximpl(str) : null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UserAddress getMobileUserAddress() {
        return this.mobileUserAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIgnorableViolationSeverity() {
        return this.ignorableViolationSeverity;
    }

    @Nullable
    /* JADX INFO: renamed from: component3-RWxzYZM, reason: not valid java name and from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-k0luVHc, reason: not valid java name */
    public final UpdateAddressRequest m522copyk0luVHc(@Nullable UserAddress mobileUserAddress, @Nullable String ignorableViolationSeverity, @Nullable String itemId) {
        return new UpdateAddressRequest(mobileUserAddress, ignorableViolationSeverity, itemId, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
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
            boolean r1 = r5 instanceof com.app.tgtg.model.remote.user.requests.UpdateAddressRequest
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.app.tgtg.model.remote.user.requests.UpdateAddressRequest r5 = (com.app.tgtg.model.remote.user.requests.UpdateAddressRequest) r5
            com.app.tgtg.model.remote.user.requests.UserAddress r1 = r4.mobileUserAddress
            com.app.tgtg.model.remote.user.requests.UserAddress r3 = r5.mobileUserAddress
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.ignorableViolationSeverity
            java.lang.String r3 = r5.ignorableViolationSeverity
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.itemId
            java.lang.String r5 = r5.itemId
            if (r1 != 0) goto L2e
            if (r5 != 0) goto L2c
            r5 = r0
            goto L35
        L2c:
            r5 = r2
            goto L35
        L2e:
            if (r5 != 0) goto L31
            goto L2c
        L31:
            boolean r5 = com.app.tgtg.model.remote.ItemId.m201equalsimpl0(r1, r5)
        L35:
            if (r5 != 0) goto L38
            return r2
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.remote.user.requests.UpdateAddressRequest.equals(java.lang.Object):boolean");
    }

    @Nullable
    public final String getIgnorableViolationSeverity() {
        return this.ignorableViolationSeverity;
    }

    @Nullable
    /* JADX INFO: renamed from: getItemId-RWxzYZM, reason: not valid java name */
    public final String m523getItemIdRWxzYZM() {
        return this.itemId;
    }

    @Nullable
    public final UserAddress getMobileUserAddress() {
        return this.mobileUserAddress;
    }

    public int hashCode() {
        UserAddress userAddress = this.mobileUserAddress;
        int iHashCode = (userAddress == null ? 0 : userAddress.hashCode()) * 31;
        String str = this.ignorableViolationSeverity;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.itemId;
        return iHashCode2 + (str2 != null ? ItemId.m202hashCodeimpl(str2) : 0);
    }

    @NotNull
    public String toString() {
        UserAddress userAddress = this.mobileUserAddress;
        String str = this.ignorableViolationSeverity;
        String str2 = this.itemId;
        String strM203toStringimpl = str2 == null ? Address.ADDRESS_NULL_PLACEHOLDER : ItemId.m203toStringimpl(str2);
        StringBuilder sb2 = new StringBuilder("UpdateAddressRequest(mobileUserAddress=");
        sb2.append(userAddress);
        sb2.append(", ignorableViolationSeverity=");
        sb2.append(str);
        sb2.append(", itemId=");
        return k.p(sb2, strM203toStringimpl, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¨\u0006\u000b"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/UpdateAddressRequest$Companion;", "", "<init>", "()V", "getIgnorableViolationSeverity", "", "hasDoubtfulFields", "", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/requests/UpdateAddressRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final String getIgnorableViolationSeverity(boolean hasDoubtfulFields) {
            if (hasDoubtfulFields) {
                return "DOUBTFUL";
            }
            return null;
        }

        @NotNull
        public final KSerializer serializer() {
            return UpdateAddressRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("ignorable_violation_severity")
    public static /* synthetic */ void getIgnorableViolationSeverity$annotations() {
    }

    @g("item_id")
    /* JADX INFO: renamed from: getItemId-RWxzYZM$annotations, reason: not valid java name */
    public static /* synthetic */ void m520getItemIdRWxzYZM$annotations() {
    }

    @g("mobile_user_address")
    public static /* synthetic */ void getMobileUserAddress$annotations() {
    }

    public /* synthetic */ UpdateAddressRequest(UserAddress userAddress, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(userAddress, str, str2);
    }

    public /* synthetic */ UpdateAddressRequest(int i11, UserAddress userAddress, String str, String str2, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, userAddress, str, str2, m1Var);
    }

    private UpdateAddressRequest(UserAddress userAddress, String str, String str2) {
        this.mobileUserAddress = userAddress;
        this.ignorableViolationSeverity = str;
        this.itemId = str2;
    }

    public /* synthetic */ UpdateAddressRequest(UserAddress userAddress, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(userAddress, str, (i11 & 4) != 0 ? null : str2, null);
    }
}
