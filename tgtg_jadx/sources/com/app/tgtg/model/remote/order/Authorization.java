package com.app.tgtg.model.remote.order;

import com.app.tgtg.model.remote.order.response.PaymentProvider;
import com.app.tgtg.model.remote.order.response.PaymentProviderSerializer;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.Price$$serializer;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J<\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010/\u0012\u0004\b1\u0010.\u001a\u0004\b0\u0010\u001dR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00102\u0012\u0004\b4\u0010.\u001a\u0004\b3\u0010\u001fR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00105\u0012\u0004\b7\u0010.\u001a\u0004\b6\u0010!¨\u0006:"}, d2 = {"Lcom/app/tgtg/model/remote/order/Authorization;", "", "Lcom/app/tgtg/model/remote/order/AuthorizationPayload;", "authorizationPayload", "Lcom/app/tgtg/model/remote/order/response/PaymentProvider;", "paymentProvider", "", "returnUrl", "Lcom/app/tgtg/model/remote/payment/Price;", "price", "<init>", "(Lcom/app/tgtg/model/remote/order/AuthorizationPayload;Lcom/app/tgtg/model/remote/order/response/PaymentProvider;Ljava/lang/String;Lcom/app/tgtg/model/remote/payment/Price;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/order/AuthorizationPayload;Lcom/app/tgtg/model/remote/order/response/PaymentProvider;Ljava/lang/String;Lcom/app/tgtg/model/remote/payment/Price;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/order/Authorization;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/app/tgtg/model/remote/order/AuthorizationPayload;", "component2", "()Lcom/app/tgtg/model/remote/order/response/PaymentProvider;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/app/tgtg/model/remote/payment/Price;", "copy", "(Lcom/app/tgtg/model/remote/order/AuthorizationPayload;Lcom/app/tgtg/model/remote/order/response/PaymentProvider;Ljava/lang/String;Lcom/app/tgtg/model/remote/payment/Price;)Lcom/app/tgtg/model/remote/order/Authorization;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/order/AuthorizationPayload;", "getAuthorizationPayload", "getAuthorizationPayload$annotations", "()V", "Lcom/app/tgtg/model/remote/order/response/PaymentProvider;", "getPaymentProvider", "getPaymentProvider$annotations", "Ljava/lang/String;", "getReturnUrl", "getReturnUrl$annotations", "Lcom/app/tgtg/model/remote/payment/Price;", "getPrice", "getPrice$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class Authorization {

    @NotNull
    private final AuthorizationPayload authorizationPayload;

    @NotNull
    private final PaymentProvider paymentProvider;

    @Nullable
    private final Price price;

    @Nullable
    private final String returnUrl;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ Authorization(int i11, AuthorizationPayload authorizationPayload, PaymentProvider paymentProvider, String str, Price price, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, Authorization$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.authorizationPayload = authorizationPayload;
        this.paymentProvider = paymentProvider;
        if ((i11 & 4) == 0) {
            this.returnUrl = null;
        } else {
            this.returnUrl = str;
        }
        if ((i11 & 8) == 0) {
            this.price = null;
        } else {
            this.price = price;
        }
    }

    public static /* synthetic */ Authorization copy$default(Authorization authorization, AuthorizationPayload authorizationPayload, PaymentProvider paymentProvider, String str, Price price, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            authorizationPayload = authorization.authorizationPayload;
        }
        if ((i11 & 2) != 0) {
            paymentProvider = authorization.paymentProvider;
        }
        if ((i11 & 4) != 0) {
            str = authorization.returnUrl;
        }
        if ((i11 & 8) != 0) {
            price = authorization.price;
        }
        return authorization.copy(authorizationPayload, paymentProvider, str, price);
    }

    public static final /* synthetic */ void write$Self$app(Authorization self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, AuthorizationPayload$$serializer.INSTANCE, self.authorizationPayload);
        output.i(serialDesc, 1, PaymentProviderSerializer.INSTANCE, self.paymentProvider);
        if (output.C(serialDesc) || self.returnUrl != null) {
            output.r(serialDesc, 2, r1.f29848a, self.returnUrl);
        }
        if (!output.C(serialDesc) && self.price == null) {
            return;
        }
        output.r(serialDesc, 3, Price$$serializer.INSTANCE, self.price);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AuthorizationPayload getAuthorizationPayload() {
        return this.authorizationPayload;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PaymentProvider getPaymentProvider() {
        return this.paymentProvider;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Price getPrice() {
        return this.price;
    }

    @NotNull
    public final Authorization copy(@NotNull AuthorizationPayload authorizationPayload, @NotNull PaymentProvider paymentProvider, @Nullable String returnUrl, @Nullable Price price) {
        authorizationPayload.getClass();
        paymentProvider.getClass();
        return new Authorization(authorizationPayload, paymentProvider, returnUrl, price);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Authorization)) {
            return false;
        }
        Authorization authorization = (Authorization) other;
        return Intrinsics.areEqual(this.authorizationPayload, authorization.authorizationPayload) && this.paymentProvider == authorization.paymentProvider && Intrinsics.areEqual(this.returnUrl, authorization.returnUrl) && Intrinsics.areEqual(this.price, authorization.price);
    }

    @NotNull
    public final AuthorizationPayload getAuthorizationPayload() {
        return this.authorizationPayload;
    }

    @NotNull
    public final PaymentProvider getPaymentProvider() {
        return this.paymentProvider;
    }

    @Nullable
    public final Price getPrice() {
        return this.price;
    }

    @Nullable
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    public int hashCode() {
        int iHashCode = (this.paymentProvider.hashCode() + (this.authorizationPayload.hashCode() * 31)) * 31;
        String str = this.returnUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Price price = this.price;
        return iHashCode2 + (price != null ? price.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Authorization(authorizationPayload=" + this.authorizationPayload + ", paymentProvider=" + this.paymentProvider + ", returnUrl=" + this.returnUrl + ", price=" + this.price + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/order/Authorization$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/Authorization;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Authorization$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("authorization_payload")
    public static /* synthetic */ void getAuthorizationPayload$annotations() {
    }

    @g("payment_provider")
    public static /* synthetic */ void getPaymentProvider$annotations() {
    }

    @g("amount")
    public static /* synthetic */ void getPrice$annotations() {
    }

    @g("return_url")
    public static /* synthetic */ void getReturnUrl$annotations() {
    }

    public Authorization(@NotNull AuthorizationPayload authorizationPayload, @NotNull PaymentProvider paymentProvider, @Nullable String str, @Nullable Price price) {
        authorizationPayload.getClass();
        paymentProvider.getClass();
        this.authorizationPayload = authorizationPayload;
        this.paymentProvider = paymentProvider;
        this.returnUrl = str;
        this.price = price;
    }

    public /* synthetic */ Authorization(AuthorizationPayload authorizationPayload, PaymentProvider paymentProvider, String str, Price price, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(authorizationPayload, paymentProvider, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : price);
    }
}
