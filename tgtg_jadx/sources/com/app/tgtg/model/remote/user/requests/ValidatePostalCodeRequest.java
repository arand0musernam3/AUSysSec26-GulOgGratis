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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J(\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u0017¨\u0006,"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/ValidatePostalCodeRequest;", "", "Lcom/app/tgtg/model/remote/ItemId;", "itemId", "", "postalCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/requests/ValidatePostalCodeRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-RWxzYZM", "()Ljava/lang/String;", "component1", "component2", "copy-GUBzgq8", "(Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/user/requests/ValidatePostalCodeRequest;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getItemId-RWxzYZM", "getItemId-RWxzYZM$annotations", "()V", "getPostalCode", "getPostalCode$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ValidatePostalCodeRequest {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String itemId;

    @Nullable
    private final String postalCode;

    private /* synthetic */ ValidatePostalCodeRequest(int i11, String str, String str2, m1 m1Var) {
        if (2 != (i11 & 2)) {
            c1.j(i11, 2, ValidatePostalCodeRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i11 & 1) == 0) {
            this.itemId = null;
        } else {
            this.itemId = str;
        }
        this.postalCode = str2;
    }

    /* JADX INFO: renamed from: copy-GUBzgq8$default, reason: not valid java name */
    public static /* synthetic */ ValidatePostalCodeRequest m524copyGUBzgq8$default(ValidatePostalCodeRequest validatePostalCodeRequest, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = validatePostalCodeRequest.itemId;
        }
        if ((i11 & 2) != 0) {
            str2 = validatePostalCodeRequest.postalCode;
        }
        return validatePostalCodeRequest.m527copyGUBzgq8(str, str2);
    }

    public static final /* synthetic */ void write$Self$app(ValidatePostalCodeRequest self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.itemId != null) {
            ItemId$$serializer itemId$$serializer = ItemId$$serializer.INSTANCE;
            String str = self.itemId;
            output.r(serialDesc, 0, itemId$$serializer, str != null ? ItemId.m197boximpl(str) : null);
        }
        output.r(serialDesc, 1, r1.f29848a, self.postalCode);
    }

    @Nullable
    /* JADX INFO: renamed from: component1-RWxzYZM, reason: not valid java name and from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-GUBzgq8, reason: not valid java name */
    public final ValidatePostalCodeRequest m527copyGUBzgq8(@Nullable String itemId, @Nullable String postalCode) {
        return new ValidatePostalCodeRequest(itemId, postalCode, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
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
            boolean r1 = r5 instanceof com.app.tgtg.model.remote.user.requests.ValidatePostalCodeRequest
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.app.tgtg.model.remote.user.requests.ValidatePostalCodeRequest r5 = (com.app.tgtg.model.remote.user.requests.ValidatePostalCodeRequest) r5
            java.lang.String r1 = r4.itemId
            java.lang.String r3 = r5.itemId
            if (r1 != 0) goto L18
            if (r3 != 0) goto L16
            r1 = r0
            goto L1f
        L16:
            r1 = r2
            goto L1f
        L18:
            if (r3 != 0) goto L1b
            goto L16
        L1b:
            boolean r1 = com.app.tgtg.model.remote.ItemId.m201equalsimpl0(r1, r3)
        L1f:
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.postalCode
            java.lang.String r5 = r5.postalCode
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.remote.user.requests.ValidatePostalCodeRequest.equals(java.lang.Object):boolean");
    }

    @Nullable
    /* JADX INFO: renamed from: getItemId-RWxzYZM, reason: not valid java name */
    public final String m528getItemIdRWxzYZM() {
        return this.itemId;
    }

    @Nullable
    public final String getPostalCode() {
        return this.postalCode;
    }

    public int hashCode() {
        String str = this.itemId;
        int iM202hashCodeimpl = (str == null ? 0 : ItemId.m202hashCodeimpl(str)) * 31;
        String str2 = this.postalCode;
        return iM202hashCodeimpl + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.itemId;
        return a.d("ValidatePostalCodeRequest(itemId=", str == null ? Address.ADDRESS_NULL_PLACEHOLDER : ItemId.m203toStringimpl(str), ", postalCode=", this.postalCode, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/ValidatePostalCodeRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/requests/ValidatePostalCodeRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ValidatePostalCodeRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("itemId")
    /* JADX INFO: renamed from: getItemId-RWxzYZM$annotations, reason: not valid java name */
    public static /* synthetic */ void m525getItemIdRWxzYZM$annotations() {
    }

    @g("postalCode")
    public static /* synthetic */ void getPostalCode$annotations() {
    }

    public /* synthetic */ ValidatePostalCodeRequest(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public /* synthetic */ ValidatePostalCodeRequest(int i11, String str, String str2, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, m1Var);
    }

    private ValidatePostalCodeRequest(String str, String str2) {
        this.itemId = str;
        this.postalCode = str2;
    }

    public /* synthetic */ ValidatePostalCodeRequest(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, str2, null);
    }
}
