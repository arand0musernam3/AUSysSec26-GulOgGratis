package com.app.tgtg.model.remote.payment.request;

import i90.g;
import i90.h;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import m60.a;
import m90.c1;
import m90.d;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u0018\u001a\u00020\u00002\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R0\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017¨\u0006)"}, d2 = {"Lcom/app/tgtg/model/remote/payment/request/PaymentMethodsRequest;", "", "Ljava/util/ArrayList;", "Lcom/app/tgtg/model/remote/payment/request/PaymentMethodsRequestItem;", "Lkotlin/collections/ArrayList;", "supportedTypes", "<init>", "(Ljava/util/ArrayList;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/ArrayList;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/payment/request/PaymentMethodsRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/ArrayList;", "copy", "(Ljava/util/ArrayList;)Lcom/app/tgtg/model/remote/payment/request/PaymentMethodsRequest;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/ArrayList;", "getSupportedTypes", "getSupportedTypes$annotations", "()V", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class PaymentMethodsRequest {

    @NotNull
    private final ArrayList<PaymentMethodsRequestItem> supportedTypes;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final j[] $childSerializers = {l.a(m.PUBLICATION, new a(1))};

    public /* synthetic */ PaymentMethodsRequest(int i11, ArrayList arrayList, m1 m1Var) {
        if (1 == (i11 & 1)) {
            this.supportedTypes = arrayList;
        } else {
            c1.j(i11, 1, PaymentMethodsRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(PaymentMethodsRequestItem$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentMethodsRequest copy$default(PaymentMethodsRequest paymentMethodsRequest, ArrayList arrayList, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            arrayList = paymentMethodsRequest.supportedTypes;
        }
        return paymentMethodsRequest.copy(arrayList);
    }

    @NotNull
    public final ArrayList<PaymentMethodsRequestItem> component1() {
        return this.supportedTypes;
    }

    @NotNull
    public final PaymentMethodsRequest copy(@NotNull ArrayList<PaymentMethodsRequestItem> supportedTypes) {
        supportedTypes.getClass();
        return new PaymentMethodsRequest(supportedTypes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PaymentMethodsRequest) && Intrinsics.areEqual(this.supportedTypes, ((PaymentMethodsRequest) other).supportedTypes);
    }

    @NotNull
    public final ArrayList<PaymentMethodsRequestItem> getSupportedTypes() {
        return this.supportedTypes;
    }

    public int hashCode() {
        return this.supportedTypes.hashCode();
    }

    @NotNull
    public String toString() {
        return "PaymentMethodsRequest(supportedTypes=" + this.supportedTypes + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/payment/request/PaymentMethodsRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/payment/request/PaymentMethodsRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PaymentMethodsRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("supported_types")
    public static /* synthetic */ void getSupportedTypes$annotations() {
    }

    public PaymentMethodsRequest(@NotNull ArrayList<PaymentMethodsRequestItem> arrayList) {
        arrayList.getClass();
        this.supportedTypes = arrayList;
    }
}
