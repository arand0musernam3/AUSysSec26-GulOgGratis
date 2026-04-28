package com.app.tgtg.model.remote.payment;

import i90.g;
import i90.h;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import lu.a;
import m90.c1;
import m90.k1;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J0\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b#\u0010$R.\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010%\u0012\u0004\b)\u0010*\u001a\u0004\b&\u0010\u001e\"\u0004\b'\u0010(R.\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010+\u0012\u0004\b/\u0010*\u001a\u0004\b,\u0010 \"\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/app/tgtg/model/remote/payment/SupportedPayments;", "", "", "", "supportedPaymentProviders", "Lcom/app/tgtg/model/remote/payment/PaymentType;", "paymentTypes", "<init>", "([Ljava/lang/String;[Lcom/app/tgtg/model/remote/payment/PaymentType;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(I[Ljava/lang/String;[Lcom/app/tgtg/model/remote/payment/PaymentType;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/payment/SupportedPayments;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "component1", "()[Ljava/lang/String;", "component2", "()[Lcom/app/tgtg/model/remote/payment/PaymentType;", "copy", "([Ljava/lang/String;[Lcom/app/tgtg/model/remote/payment/PaymentType;)Lcom/app/tgtg/model/remote/payment/SupportedPayments;", "toString", "()Ljava/lang/String;", "[Ljava/lang/String;", "getSupportedPaymentProviders", "setSupportedPaymentProviders", "([Ljava/lang/String;)V", "getSupportedPaymentProviders$annotations", "()V", "[Lcom/app/tgtg/model/remote/payment/PaymentType;", "getPaymentTypes", "setPaymentTypes", "([Lcom/app/tgtg/model/remote/payment/PaymentType;)V", "getPaymentTypes$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class SupportedPayments {

    @NotNull
    private static final j[] $childSerializers;

    @NotNull
    private PaymentType[] paymentTypes;

    @NotNull
    private String[] supportedPaymentProviders;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{l.a(mVar, new a(5)), l.a(mVar, new a(6))};
    }

    public /* synthetic */ SupportedPayments(int i11, String[] strArr, PaymentType[] paymentTypeArr, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, SupportedPayments$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.supportedPaymentProviders = strArr;
        this.paymentTypes = paymentTypeArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new k1(Reflection.getOrCreateKotlinClass(String.class), r1.f29848a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new k1(Reflection.getOrCreateKotlinClass(PaymentType.class), PaymentTypeSerializer.INSTANCE);
    }

    public static /* synthetic */ SupportedPayments copy$default(SupportedPayments supportedPayments, String[] strArr, PaymentType[] paymentTypeArr, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            strArr = supportedPayments.supportedPaymentProviders;
        }
        if ((i11 & 2) != 0) {
            paymentTypeArr = supportedPayments.paymentTypes;
        }
        return supportedPayments.copy(strArr, paymentTypeArr);
    }

    public static final /* synthetic */ void write$Self$app(SupportedPayments self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.i(serialDesc, 0, (KSerializer) jVarArr[0].getValue(), self.supportedPaymentProviders);
        output.i(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.paymentTypes);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String[] getSupportedPaymentProviders() {
        return this.supportedPaymentProviders;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PaymentType[] getPaymentTypes() {
        return this.paymentTypes;
    }

    @NotNull
    public final SupportedPayments copy(@NotNull String[] supportedPaymentProviders, @NotNull PaymentType[] paymentTypes) {
        supportedPaymentProviders.getClass();
        paymentTypes.getClass();
        return new SupportedPayments(supportedPaymentProviders, paymentTypes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(SupportedPayments.class, other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        SupportedPayments supportedPayments = (SupportedPayments) other;
        return Arrays.equals(this.supportedPaymentProviders, supportedPayments.supportedPaymentProviders) && Arrays.equals(this.paymentTypes, supportedPayments.paymentTypes);
    }

    @NotNull
    public final PaymentType[] getPaymentTypes() {
        return this.paymentTypes;
    }

    @NotNull
    public final String[] getSupportedPaymentProviders() {
        return this.supportedPaymentProviders;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.supportedPaymentProviders) * 31) + Arrays.hashCode(this.paymentTypes);
    }

    public final void setPaymentTypes(@NotNull PaymentType[] paymentTypeArr) {
        paymentTypeArr.getClass();
        this.paymentTypes = paymentTypeArr;
    }

    public final void setSupportedPaymentProviders(@NotNull String[] strArr) {
        strArr.getClass();
        this.supportedPaymentProviders = strArr;
    }

    @NotNull
    public String toString() {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("SupportedPayments(supportedPaymentProviders=", Arrays.toString(this.supportedPaymentProviders), ", paymentTypes=", Arrays.toString(this.paymentTypes), ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/payment/SupportedPayments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/payment/SupportedPayments;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SupportedPayments$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("payment_types")
    public static /* synthetic */ void getPaymentTypes$annotations() {
    }

    @g("payment_provider")
    public static /* synthetic */ void getSupportedPaymentProviders$annotations() {
    }

    public SupportedPayments(@NotNull String[] strArr, @NotNull PaymentType[] paymentTypeArr) {
        strArr.getClass();
        paymentTypeArr.getClass();
        this.supportedPaymentProviders = strArr;
        this.paymentTypes = paymentTypeArr;
    }
}
