package com.app.tgtg.model.remote.manufacturer.request;

import com.app.tgtg.model.remote.payment.request.PaymentMethodsRequestItem;
import com.app.tgtg.model.remote.payment.request.PaymentMethodsRequestItem$$serializer;
import db0.c;
import i90.g;
import i90.h;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.l0;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B3\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ@\u0010\u001f\u001a\u00020\u00002\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R0\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b.\u0010+\u001a\u0004\b-\u0010\u001cR \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010/\u0012\u0004\b1\u0010+\u001a\u0004\b0\u0010\u001e¨\u00064"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/request/BasketPaymentMethodsRequest;", "", "Ljava/util/ArrayList;", "Lcom/app/tgtg/model/remote/payment/request/PaymentMethodsRequestItem;", "Lkotlin/collections/ArrayList;", "supportedTypes", "", "braintreeClientSdkVersion", "", "countryId", "<init>", "(Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/manufacturer/request/BasketPaymentMethodsRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/ArrayList;", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/lang/String;", "copy", "(Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/String;)Lcom/app/tgtg/model/remote/manufacturer/request/BasketPaymentMethodsRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/ArrayList;", "getSupportedTypes", "getSupportedTypes$annotations", "()V", "Ljava/lang/Integer;", "getBraintreeClientSdkVersion", "getBraintreeClientSdkVersion$annotations", "Ljava/lang/String;", "getCountryId", "getCountryId$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class BasketPaymentMethodsRequest {

    @Nullable
    private final Integer braintreeClientSdkVersion;

    @NotNull
    private final String countryId;

    @NotNull
    private final ArrayList<PaymentMethodsRequestItem> supportedTypes;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final j[] $childSerializers = {l.a(m.PUBLICATION, new c(26)), null, null};

    public /* synthetic */ BasketPaymentMethodsRequest(int i11, ArrayList arrayList, Integer num, String str, m1 m1Var) {
        if (5 != (i11 & 5)) {
            c1.j(i11, 5, BasketPaymentMethodsRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.supportedTypes = arrayList;
        if ((i11 & 2) == 0) {
            this.braintreeClientSdkVersion = null;
        } else {
            this.braintreeClientSdkVersion = num;
        }
        this.countryId = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(PaymentMethodsRequestItem$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BasketPaymentMethodsRequest copy$default(BasketPaymentMethodsRequest basketPaymentMethodsRequest, ArrayList arrayList, Integer num, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            arrayList = basketPaymentMethodsRequest.supportedTypes;
        }
        if ((i11 & 2) != 0) {
            num = basketPaymentMethodsRequest.braintreeClientSdkVersion;
        }
        if ((i11 & 4) != 0) {
            str = basketPaymentMethodsRequest.countryId;
        }
        return basketPaymentMethodsRequest.copy(arrayList, num, str);
    }

    public static final /* synthetic */ void write$Self$app(BasketPaymentMethodsRequest self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.supportedTypes);
        if (output.C(serialDesc) || self.braintreeClientSdkVersion != null) {
            output.r(serialDesc, 1, l0.f29821a, self.braintreeClientSdkVersion);
        }
        output.q(serialDesc, 2, self.countryId);
    }

    @NotNull
    public final ArrayList<PaymentMethodsRequestItem> component1() {
        return this.supportedTypes;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getBraintreeClientSdkVersion() {
        return this.braintreeClientSdkVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCountryId() {
        return this.countryId;
    }

    @NotNull
    public final BasketPaymentMethodsRequest copy(@NotNull ArrayList<PaymentMethodsRequestItem> supportedTypes, @Nullable Integer braintreeClientSdkVersion, @NotNull String countryId) {
        supportedTypes.getClass();
        countryId.getClass();
        return new BasketPaymentMethodsRequest(supportedTypes, braintreeClientSdkVersion, countryId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasketPaymentMethodsRequest)) {
            return false;
        }
        BasketPaymentMethodsRequest basketPaymentMethodsRequest = (BasketPaymentMethodsRequest) other;
        return Intrinsics.areEqual(this.supportedTypes, basketPaymentMethodsRequest.supportedTypes) && Intrinsics.areEqual(this.braintreeClientSdkVersion, basketPaymentMethodsRequest.braintreeClientSdkVersion) && Intrinsics.areEqual(this.countryId, basketPaymentMethodsRequest.countryId);
    }

    @Nullable
    public final Integer getBraintreeClientSdkVersion() {
        return this.braintreeClientSdkVersion;
    }

    @NotNull
    public final String getCountryId() {
        return this.countryId;
    }

    @NotNull
    public final ArrayList<PaymentMethodsRequestItem> getSupportedTypes() {
        return this.supportedTypes;
    }

    public int hashCode() {
        int iHashCode = this.supportedTypes.hashCode() * 31;
        Integer num = this.braintreeClientSdkVersion;
        return this.countryId.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        ArrayList<PaymentMethodsRequestItem> arrayList = this.supportedTypes;
        Integer num = this.braintreeClientSdkVersion;
        String str = this.countryId;
        StringBuilder sb2 = new StringBuilder("BasketPaymentMethodsRequest(supportedTypes=");
        sb2.append(arrayList);
        sb2.append(", braintreeClientSdkVersion=");
        sb2.append(num);
        sb2.append(", countryId=");
        return k.p(sb2, str, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/request/BasketPaymentMethodsRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/manufacturer/request/BasketPaymentMethodsRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BasketPaymentMethodsRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("braintree_client_sdk_version")
    public static /* synthetic */ void getBraintreeClientSdkVersion$annotations() {
    }

    @g("country_id")
    public static /* synthetic */ void getCountryId$annotations() {
    }

    @g("supported_types")
    public static /* synthetic */ void getSupportedTypes$annotations() {
    }

    public BasketPaymentMethodsRequest(@NotNull ArrayList<PaymentMethodsRequestItem> arrayList, @Nullable Integer num, @NotNull String str) {
        arrayList.getClass();
        str.getClass();
        this.supportedTypes = arrayList;
        this.braintreeClientSdkVersion = num;
        this.countryId = str;
    }

    public /* synthetic */ BasketPaymentMethodsRequest(ArrayList arrayList, Integer num, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(arrayList, (i11 & 2) != 0 ? null : num, str);
    }
}
