package com.app.tgtg.model.remote.payment.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.adyen.checkout.components.core.Address;
import com.app.tgtg.model.remote.PaymentId;
import com.app.tgtg.model.remote.PaymentId$$serializer;
import e0.f;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ4\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b'\u0010\u0018J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010\u001fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b4\u00100\u001a\u0004\b3\u0010\u001f¨\u00067"}, d2 = {"Lcom/app/tgtg/model/remote/payment/response/BiometricsResponse;", "Landroid/os/Parcelable;", "", "biometricsSecret", "Lcom/app/tgtg/model/remote/PaymentId;", "paymentId", "savedPaymentMethodIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/payment/response/BiometricsResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2-TaD0F3M", "component2", "component3", "copy-ocMTze0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/payment/response/BiometricsResponse;", "copy", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBiometricsSecret", "getBiometricsSecret$annotations", "()V", "getPaymentId-TaD0F3M", "getPaymentId-TaD0F3M$annotations", "getSavedPaymentMethodIdentifier", "getSavedPaymentMethodIdentifier$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class BiometricsResponse implements Parcelable {
    public static final int $stable = 0;

    @Nullable
    private final String biometricsSecret;

    @Nullable
    private final String paymentId;

    @Nullable
    private final String savedPaymentMethodIdentifier;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<BiometricsResponse> CREATOR = new Creator();

    private /* synthetic */ BiometricsResponse(int i11, String str, String str2, String str3, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, BiometricsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.biometricsSecret = str;
        this.paymentId = str2;
        this.savedPaymentMethodIdentifier = str3;
    }

    /* JADX INFO: renamed from: copy-ocMTze0$default, reason: not valid java name */
    public static /* synthetic */ BiometricsResponse m475copyocMTze0$default(BiometricsResponse biometricsResponse, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = biometricsResponse.biometricsSecret;
        }
        if ((i11 & 2) != 0) {
            str2 = biometricsResponse.paymentId;
        }
        if ((i11 & 4) != 0) {
            str3 = biometricsResponse.savedPaymentMethodIdentifier;
        }
        return biometricsResponse.m478copyocMTze0(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$app(BiometricsResponse self, b output, SerialDescriptor serialDesc) {
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 0, r1Var, self.biometricsSecret);
        PaymentId$$serializer paymentId$$serializer = PaymentId$$serializer.INSTANCE;
        String str = self.paymentId;
        output.r(serialDesc, 1, paymentId$$serializer, str != null ? PaymentId.m233boximpl(str) : null);
        output.r(serialDesc, 2, r1Var, self.savedPaymentMethodIdentifier);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBiometricsSecret() {
        return this.biometricsSecret;
    }

    @Nullable
    /* JADX INFO: renamed from: component2-TaD0F3M, reason: not valid java name and from getter */
    public final String getPaymentId() {
        return this.paymentId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSavedPaymentMethodIdentifier() {
        return this.savedPaymentMethodIdentifier;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-ocMTze0, reason: not valid java name */
    public final BiometricsResponse m478copyocMTze0(@Nullable String biometricsSecret, @Nullable String paymentId, @Nullable String savedPaymentMethodIdentifier) {
        return new BiometricsResponse(biometricsSecret, paymentId, savedPaymentMethodIdentifier, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
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
            boolean r1 = r5 instanceof com.app.tgtg.model.remote.payment.response.BiometricsResponse
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.app.tgtg.model.remote.payment.response.BiometricsResponse r5 = (com.app.tgtg.model.remote.payment.response.BiometricsResponse) r5
            java.lang.String r1 = r4.biometricsSecret
            java.lang.String r3 = r5.biometricsSecret
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.paymentId
            java.lang.String r3 = r5.paymentId
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
            boolean r1 = com.app.tgtg.model.remote.PaymentId.m237equalsimpl0(r1, r3)
        L2a:
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.savedPaymentMethodIdentifier
            java.lang.String r5 = r5.savedPaymentMethodIdentifier
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 != 0) goto L38
            return r2
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.remote.payment.response.BiometricsResponse.equals(java.lang.Object):boolean");
    }

    @Nullable
    public final String getBiometricsSecret() {
        return this.biometricsSecret;
    }

    @Nullable
    /* JADX INFO: renamed from: getPaymentId-TaD0F3M, reason: not valid java name */
    public final String m479getPaymentIdTaD0F3M() {
        return this.paymentId;
    }

    @Nullable
    public final String getSavedPaymentMethodIdentifier() {
        return this.savedPaymentMethodIdentifier;
    }

    public int hashCode() {
        String str = this.biometricsSecret;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paymentId;
        int iM238hashCodeimpl = (iHashCode + (str2 == null ? 0 : PaymentId.m238hashCodeimpl(str2))) * 31;
        String str3 = this.savedPaymentMethodIdentifier;
        return iM238hashCodeimpl + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.biometricsSecret;
        String str2 = this.paymentId;
        return k.p(f.t("BiometricsResponse(biometricsSecret=", str, ", paymentId=", str2 == null ? Address.ADDRESS_NULL_PLACEHOLDER : PaymentId.m239toStringimpl(str2), ", savedPaymentMethodIdentifier="), this.savedPaymentMethodIdentifier, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.biometricsSecret);
        String str = this.paymentId;
        if (str == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            PaymentId.m240writeToParcelimpl(str, dest, flags);
        }
        dest.writeString(this.savedPaymentMethodIdentifier);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/payment/response/BiometricsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/payment/response/BiometricsResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BiometricsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BiometricsResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BiometricsResponse createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            DefaultConstructorMarker defaultConstructorMarker = null;
            PaymentId paymentIdCreateFromParcel = parcel.readInt() == 0 ? null : PaymentId.CREATOR.createFromParcel(parcel);
            return new BiometricsResponse(string, paymentIdCreateFromParcel != null ? paymentIdCreateFromParcel.m241unboximpl() : null, parcel.readString(), defaultConstructorMarker);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BiometricsResponse[] newArray(int i11) {
            return new BiometricsResponse[i11];
        }
    }

    @g("biometrics_protected_secret")
    public static /* synthetic */ void getBiometricsSecret$annotations() {
    }

    @g("payment_id")
    /* JADX INFO: renamed from: getPaymentId-TaD0F3M$annotations, reason: not valid java name */
    public static /* synthetic */ void m476getPaymentIdTaD0F3M$annotations() {
    }

    @g("saved_payment_method_token")
    public static /* synthetic */ void getSavedPaymentMethodIdentifier$annotations() {
    }

    public /* synthetic */ BiometricsResponse(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3);
    }

    public /* synthetic */ BiometricsResponse(int i11, String str, String str2, String str3, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, str3, m1Var);
    }

    private BiometricsResponse(String str, String str2, String str3) {
        this.biometricsSecret = str;
        this.paymentId = str2;
        this.savedPaymentMethodIdentifier = str3;
    }
}
