package com.app.tgtg.model.remote.order;

import com.adyen.checkout.components.core.Address;
import com.app.tgtg.model.remote.VoucherId;
import com.app.tgtg.model.remote.VoucherId$$serializer;
import e0.f;
import i90.g;
import i90.h;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b \b\u0087\b\u0018\u0000 O2\u00020\u0001:\u0002POBq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010Bs\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0017J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0017J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0017Jz\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0017J\u0010\u0010'\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00105\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00105\u0012\u0004\b:\u00108\u001a\u0004\b9\u0010\u0017R(\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010;\u0012\u0004\b?\u00108\u001a\u0004\b<\u0010\u001b\"\u0004\b=\u0010>R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00105\u0012\u0004\bA\u00108\u001a\u0004\b@\u0010\u0017R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010B\u0012\u0004\bD\u00108\u001a\u0004\bC\u0010\u001eR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00105\u0012\u0004\bF\u00108\u001a\u0004\bE\u0010\u0017R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00105\u0012\u0004\bH\u00108\u001a\u0004\bG\u0010\u0017R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00105\u0012\u0004\bJ\u00108\u001a\u0004\bI\u0010\u0017R*\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000e\u00105\u0012\u0004\bN\u00108\u001a\u0004\bK\u0010\u0017\"\u0004\bL\u0010M¨\u0006Q"}, d2 = {"Lcom/app/tgtg/model/remote/order/AuthorizationPayload;", "", "", "biometricsProtectedSecret", "Lcom/app/tgtg/model/remote/VoucherId;", "voucherId", "", "storePaymentCard", "paymentType", "Lcom/app/tgtg/model/remote/order/AuthPayloadType;", "payloadType", "payload", "detailsPayload", "savedPaymentMethodToken", "zipcode", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/app/tgtg/model/remote/order/AuthPayloadType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/app/tgtg/model/remote/order/AuthPayloadType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2-sIL_j68", "component2", "component3", "()Z", "component4", "component5", "()Lcom/app/tgtg/model/remote/order/AuthPayloadType;", "component6", "component7", "component8", "component9", "copy-PA5N4WA", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/app/tgtg/model/remote/order/AuthPayloadType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/order/AuthorizationPayload;", "copy", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/order/AuthorizationPayload;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getBiometricsProtectedSecret", "getBiometricsProtectedSecret$annotations", "()V", "getVoucherId-sIL_j68", "getVoucherId-sIL_j68$annotations", "Z", "getStorePaymentCard", "setStorePaymentCard", "(Z)V", "getStorePaymentCard$annotations", "getPaymentType", "getPaymentType$annotations", "Lcom/app/tgtg/model/remote/order/AuthPayloadType;", "getPayloadType", "getPayloadType$annotations", "getPayload", "getPayload$annotations", "getDetailsPayload", "getDetailsPayload$annotations", "getSavedPaymentMethodToken", "getSavedPaymentMethodToken$annotations", "getZipcode", "setZipcode", "(Ljava/lang/String;)V", "getZipcode$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class AuthorizationPayload {

    @Nullable
    private final String biometricsProtectedSecret;

    @Nullable
    private final String detailsPayload;

    @Nullable
    private final String payload;

    @Nullable
    private final AuthPayloadType payloadType;

    @Nullable
    private final String paymentType;

    @Nullable
    private final String savedPaymentMethodToken;
    private boolean storePaymentCard;

    @Nullable
    private final String voucherId;

    @Nullable
    private String zipcode;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    private /* synthetic */ AuthorizationPayload(int i11, String str, String str2, boolean z11, String str3, AuthPayloadType authPayloadType, String str4, String str5, String str6, String str7, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.biometricsProtectedSecret = null;
        } else {
            this.biometricsProtectedSecret = str;
        }
        if ((i11 & 2) == 0) {
            this.voucherId = null;
        } else {
            this.voucherId = str2;
        }
        if ((i11 & 4) == 0) {
            this.storePaymentCard = false;
        } else {
            this.storePaymentCard = z11;
        }
        if ((i11 & 8) == 0) {
            this.paymentType = null;
        } else {
            this.paymentType = str3;
        }
        if ((i11 & 16) == 0) {
            this.payloadType = null;
        } else {
            this.payloadType = authPayloadType;
        }
        if ((i11 & 32) == 0) {
            this.payload = null;
        } else {
            this.payload = str4;
        }
        if ((i11 & 64) == 0) {
            this.detailsPayload = null;
        } else {
            this.detailsPayload = str5;
        }
        if ((i11 & 128) == 0) {
            this.savedPaymentMethodToken = null;
        } else {
            this.savedPaymentMethodToken = str6;
        }
        if ((i11 & 256) == 0) {
            this.zipcode = null;
        } else {
            this.zipcode = str7;
        }
    }

    /* JADX INFO: renamed from: copy-PA5N4WA$default, reason: not valid java name */
    public static /* synthetic */ AuthorizationPayload m408copyPA5N4WA$default(AuthorizationPayload authorizationPayload, String str, String str2, boolean z11, String str3, AuthPayloadType authPayloadType, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = authorizationPayload.biometricsProtectedSecret;
        }
        if ((i11 & 2) != 0) {
            str2 = authorizationPayload.voucherId;
        }
        if ((i11 & 4) != 0) {
            z11 = authorizationPayload.storePaymentCard;
        }
        if ((i11 & 8) != 0) {
            str3 = authorizationPayload.paymentType;
        }
        if ((i11 & 16) != 0) {
            authPayloadType = authorizationPayload.payloadType;
        }
        if ((i11 & 32) != 0) {
            str4 = authorizationPayload.payload;
        }
        if ((i11 & 64) != 0) {
            str5 = authorizationPayload.detailsPayload;
        }
        if ((i11 & 128) != 0) {
            str6 = authorizationPayload.savedPaymentMethodToken;
        }
        if ((i11 & 256) != 0) {
            str7 = authorizationPayload.zipcode;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        AuthPayloadType authPayloadType2 = authPayloadType;
        boolean z12 = z11;
        return authorizationPayload.m411copyPA5N4WA(str, str2, z12, str3, authPayloadType2, str10, str11, str8, str9);
    }

    public static final /* synthetic */ void write$Self$app(AuthorizationPayload self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.biometricsProtectedSecret != null) {
            output.r(serialDesc, 0, r1.f29848a, self.biometricsProtectedSecret);
        }
        if (output.C(serialDesc) || self.voucherId != null) {
            VoucherId$$serializer voucherId$$serializer = VoucherId$$serializer.INSTANCE;
            String str = self.voucherId;
            output.r(serialDesc, 1, voucherId$$serializer, str != null ? VoucherId.m298boximpl(str) : null);
        }
        output.p(serialDesc, 2, self.storePaymentCard);
        if (output.C(serialDesc) || self.paymentType != null) {
            output.r(serialDesc, 3, r1.f29848a, self.paymentType);
        }
        if (output.C(serialDesc) || self.payloadType != null) {
            output.r(serialDesc, 4, AuthPayloadSerializer.INSTANCE, self.payloadType);
        }
        if (output.C(serialDesc) || self.payload != null) {
            output.r(serialDesc, 5, r1.f29848a, self.payload);
        }
        if (output.C(serialDesc) || self.detailsPayload != null) {
            output.r(serialDesc, 6, r1.f29848a, self.detailsPayload);
        }
        if (output.C(serialDesc) || self.savedPaymentMethodToken != null) {
            output.r(serialDesc, 7, r1.f29848a, self.savedPaymentMethodToken);
        }
        if (!output.C(serialDesc) && self.zipcode == null) {
            return;
        }
        output.r(serialDesc, 8, r1.f29848a, self.zipcode);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBiometricsProtectedSecret() {
        return this.biometricsProtectedSecret;
    }

    @Nullable
    /* JADX INFO: renamed from: component2-sIL_j68, reason: not valid java name and from getter */
    public final String getVoucherId() {
        return this.voucherId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getStorePaymentCard() {
        return this.storePaymentCard;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPaymentType() {
        return this.paymentType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final AuthPayloadType getPayloadType() {
        return this.payloadType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPayload() {
        return this.payload;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDetailsPayload() {
        return this.detailsPayload;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSavedPaymentMethodToken() {
        return this.savedPaymentMethodToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getZipcode() {
        return this.zipcode;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-PA5N4WA, reason: not valid java name */
    public final AuthorizationPayload m411copyPA5N4WA(@Nullable String biometricsProtectedSecret, @Nullable String voucherId, boolean storePaymentCard, @Nullable String paymentType, @Nullable AuthPayloadType payloadType, @Nullable String payload, @Nullable String detailsPayload, @Nullable String savedPaymentMethodToken, @Nullable String zipcode) {
        return new AuthorizationPayload(biometricsProtectedSecret, voucherId, storePaymentCard, paymentType, payloadType, payload, detailsPayload, savedPaymentMethodToken, zipcode, null);
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
            boolean r1 = r5 instanceof com.app.tgtg.model.remote.order.AuthorizationPayload
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.app.tgtg.model.remote.order.AuthorizationPayload r5 = (com.app.tgtg.model.remote.order.AuthorizationPayload) r5
            java.lang.String r1 = r4.biometricsProtectedSecret
            java.lang.String r3 = r5.biometricsProtectedSecret
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.voucherId
            java.lang.String r3 = r5.voucherId
            if (r1 != 0) goto L23
            if (r3 != 0) goto L21
            r1 = r0
            goto L2a
        L21:
            r1 = r2
            goto L2a
        L23:
            if (r3 != 0) goto L26
            goto L21
        L26:
            boolean r1 = com.app.tgtg.model.remote.VoucherId.m302equalsimpl0(r1, r3)
        L2a:
            if (r1 != 0) goto L2d
            return r2
        L2d:
            boolean r1 = r4.storePaymentCard
            boolean r3 = r5.storePaymentCard
            if (r1 == r3) goto L34
            return r2
        L34:
            java.lang.String r1 = r4.paymentType
            java.lang.String r3 = r5.paymentType
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L3f
            return r2
        L3f:
            com.app.tgtg.model.remote.order.AuthPayloadType r1 = r4.payloadType
            com.app.tgtg.model.remote.order.AuthPayloadType r3 = r5.payloadType
            if (r1 == r3) goto L46
            return r2
        L46:
            java.lang.String r1 = r4.payload
            java.lang.String r3 = r5.payload
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L51
            return r2
        L51:
            java.lang.String r1 = r4.detailsPayload
            java.lang.String r3 = r5.detailsPayload
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L5c
            return r2
        L5c:
            java.lang.String r1 = r4.savedPaymentMethodToken
            java.lang.String r3 = r5.savedPaymentMethodToken
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L67
            return r2
        L67:
            java.lang.String r1 = r4.zipcode
            java.lang.String r5 = r5.zipcode
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 != 0) goto L72
            return r2
        L72:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.remote.order.AuthorizationPayload.equals(java.lang.Object):boolean");
    }

    @Nullable
    public final String getBiometricsProtectedSecret() {
        return this.biometricsProtectedSecret;
    }

    @Nullable
    public final String getDetailsPayload() {
        return this.detailsPayload;
    }

    @Nullable
    public final String getPayload() {
        return this.payload;
    }

    @Nullable
    public final AuthPayloadType getPayloadType() {
        return this.payloadType;
    }

    @Nullable
    public final String getPaymentType() {
        return this.paymentType;
    }

    @Nullable
    public final String getSavedPaymentMethodToken() {
        return this.savedPaymentMethodToken;
    }

    public final boolean getStorePaymentCard() {
        return this.storePaymentCard;
    }

    @Nullable
    /* JADX INFO: renamed from: getVoucherId-sIL_j68, reason: not valid java name */
    public final String m412getVoucherIdsIL_j68() {
        return this.voucherId;
    }

    @Nullable
    public final String getZipcode() {
        return this.zipcode;
    }

    public int hashCode() {
        String str = this.biometricsProtectedSecret;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.voucherId;
        int iE = k.e((iHashCode + (str2 == null ? 0 : VoucherId.m303hashCodeimpl(str2))) * 31, 31, this.storePaymentCard);
        String str3 = this.paymentType;
        int iHashCode2 = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        AuthPayloadType authPayloadType = this.payloadType;
        int iHashCode3 = (iHashCode2 + (authPayloadType == null ? 0 : authPayloadType.hashCode())) * 31;
        String str4 = this.payload;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.detailsPayload;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.savedPaymentMethodToken;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.zipcode;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final void setStorePaymentCard(boolean z11) {
        this.storePaymentCard = z11;
    }

    public final void setZipcode(@Nullable String str) {
        this.zipcode = str;
    }

    @NotNull
    public String toString() {
        String str = this.biometricsProtectedSecret;
        String str2 = this.voucherId;
        String strM304toStringimpl = str2 == null ? Address.ADDRESS_NULL_PLACEHOLDER : VoucherId.m304toStringimpl(str2);
        boolean z11 = this.storePaymentCard;
        String str3 = this.paymentType;
        AuthPayloadType authPayloadType = this.payloadType;
        String str4 = this.payload;
        String str5 = this.detailsPayload;
        String str6 = this.savedPaymentMethodToken;
        String str7 = this.zipcode;
        StringBuilder sbT = f.t("AuthorizationPayload(biometricsProtectedSecret=", str, ", voucherId=", strM304toStringimpl, ", storePaymentCard=");
        sbT.append(z11);
        sbT.append(", paymentType=");
        sbT.append(str3);
        sbT.append(", payloadType=");
        sbT.append(authPayloadType);
        sbT.append(", payload=");
        sbT.append(str4);
        sbT.append(", detailsPayload=");
        s.A(sbT, str5, ", savedPaymentMethodToken=", str6, ", zipcode=");
        return k.p(sbT, str7, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/order/AuthorizationPayload$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/AuthorizationPayload;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AuthorizationPayload$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("biometrics_protected_secret")
    public static /* synthetic */ void getBiometricsProtectedSecret$annotations() {
    }

    @g("details_payload")
    public static /* synthetic */ void getDetailsPayload$annotations() {
    }

    @g("payload")
    public static /* synthetic */ void getPayload$annotations() {
    }

    @g("type")
    public static /* synthetic */ void getPayloadType$annotations() {
    }

    @g("payment_type")
    public static /* synthetic */ void getPaymentType$annotations() {
    }

    @g("payment_method_token")
    public static /* synthetic */ void getSavedPaymentMethodToken$annotations() {
    }

    @g("save_payment_method")
    public static /* synthetic */ void getStorePaymentCard$annotations() {
    }

    @g("voucher_id")
    /* JADX INFO: renamed from: getVoucherId-sIL_j68$annotations, reason: not valid java name */
    public static /* synthetic */ void m409getVoucherIdsIL_j68$annotations() {
    }

    @g("zip_code")
    public static /* synthetic */ void getZipcode$annotations() {
    }

    public /* synthetic */ AuthorizationPayload(String str, String str2, boolean z11, String str3, AuthPayloadType authPayloadType, String str4, String str5, String str6, String str7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z11, str3, authPayloadType, str4, str5, str6, str7);
    }

    public /* synthetic */ AuthorizationPayload(int i11, String str, String str2, boolean z11, String str3, AuthPayloadType authPayloadType, String str4, String str5, String str6, String str7, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, z11, str3, authPayloadType, str4, str5, str6, str7, m1Var);
    }

    private AuthorizationPayload(String str, String str2, boolean z11, String str3, AuthPayloadType authPayloadType, String str4, String str5, String str6, String str7) {
        this.biometricsProtectedSecret = str;
        this.voucherId = str2;
        this.storePaymentCard = z11;
        this.paymentType = str3;
        this.payloadType = authPayloadType;
        this.payload = str4;
        this.detailsPayload = str5;
        this.savedPaymentMethodToken = str6;
        this.zipcode = str7;
    }

    public /* synthetic */ AuthorizationPayload(String str, String str2, boolean z11, String str3, AuthPayloadType authPayloadType, String str4, String str5, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : authPayloadType, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? null : str6, (i11 & 256) == 0 ? str7 : null, null);
    }
}
