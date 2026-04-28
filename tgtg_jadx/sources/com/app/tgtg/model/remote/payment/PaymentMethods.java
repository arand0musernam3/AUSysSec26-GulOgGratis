package com.app.tgtg.model.remote.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.adyen.checkout.core.Environment;
import com.app.tgtg.model.remote.order.response.PaymentProvider;
import com.app.tgtg.model.remote.order.response.PaymentProviderSerializer;
import com.app.tgtg.model.remote.order.response.ProviderType;
import com.app.tgtg.model.remote.order.response.ProviderTypeSerializer;
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
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\b\u0087\b\u0018\u0000 {2\u00020\u0001:\u0002|{B\u00ad\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB©\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001b\u0010!J\r\u0010\"\u001a\u00020\u001d¢\u0006\u0004\b\"\u0010#J\u001d\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001d¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b6\u00105J\u0010\u00107\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b9\u00105J\u0010\u0010:\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b:\u00108J\u0010\u0010;\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b=\u00108J\u0010\u0010>\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b>\u00108J\u0010\u0010?\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bA\u0010BJ¸\u0001\u0010C\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\fHÖ\u0001¢\u0006\u0004\bE\u00105J\u0010\u0010F\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\bF\u0010#J\u001a\u0010I\u001a\u00020\u000f2\b\u0010H\u001a\u0004\u0018\u00010GHÖ\u0003¢\u0006\u0004\bI\u0010JJ'\u0010R\u001a\u00020'2\u0006\u0010K\u001a\u00020\u00002\u0006\u0010M\u001a\u00020L2\u0006\u0010O\u001a\u00020NH\u0001¢\u0006\u0004\bP\u0010QR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010S\u0012\u0004\bU\u0010V\u001a\u0004\bT\u0010+R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010W\u0012\u0004\bY\u0010V\u001a\u0004\bX\u0010-R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010Z\u0012\u0004\b\\\u0010V\u001a\u0004\b[\u0010/R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010]\u0012\u0004\b_\u0010V\u001a\u0004\b^\u00101R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010`\u0012\u0004\bb\u0010V\u001a\u0004\ba\u00103R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010c\u0012\u0004\be\u0010V\u001a\u0004\bd\u00105R\"\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010c\u0012\u0004\bg\u0010V\u001a\u0004\bf\u00105R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010h\u0012\u0004\bj\u0010V\u001a\u0004\bi\u00108R\"\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010c\u0012\u0004\bl\u0010V\u001a\u0004\bk\u00105R \u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010h\u0012\u0004\bn\u0010V\u001a\u0004\bm\u00108R \u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010o\u0012\u0004\bq\u0010V\u001a\u0004\bp\u0010<R \u0010\u0015\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010h\u0012\u0004\bs\u0010V\u001a\u0004\br\u00108R \u0010\u0016\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010h\u0012\u0004\bt\u0010V\u001a\u0004\b\u0016\u00108R \u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010u\u0012\u0004\bw\u0010V\u001a\u0004\bv\u0010@R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010x\u0012\u0004\bz\u0010V\u001a\u0004\by\u0010B¨\u0006}"}, d2 = {"Lcom/app/tgtg/model/remote/payment/PaymentMethods;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/order/response/ProviderType;", "providerType", "Lcom/app/tgtg/model/remote/order/response/PaymentProvider;", "paymentProvider", "Lcom/app/tgtg/model/remote/payment/PaymentType;", "paymentType", "Lcom/app/tgtg/model/remote/payment/RecurringPaymentInformation;", "recurringInfo", "Lcom/app/tgtg/model/remote/payment/PaymentIcons;", "icons", "", "cardIdentifier", "displayValue", "", "hasVouchersEnabled", "adyenPayload", "saveCard", "Lcom/app/tgtg/model/remote/payment/CardStatus;", "cardStatus", "showZipcode", "isPreferred", "Lcom/adyen/checkout/core/Environment;", "adyenEnvironment", "Lcom/app/tgtg/model/remote/payment/Price;", "availableAmount", "<init>", "(Lcom/app/tgtg/model/remote/order/response/ProviderType;Lcom/app/tgtg/model/remote/order/response/PaymentProvider;Lcom/app/tgtg/model/remote/payment/PaymentType;Lcom/app/tgtg/model/remote/payment/RecurringPaymentInformation;Lcom/app/tgtg/model/remote/payment/PaymentIcons;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLcom/app/tgtg/model/remote/payment/CardStatus;ZZLcom/adyen/checkout/core/Environment;Lcom/app/tgtg/model/remote/payment/Price;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/order/response/ProviderType;Lcom/app/tgtg/model/remote/order/response/PaymentProvider;Lcom/app/tgtg/model/remote/payment/PaymentType;Lcom/app/tgtg/model/remote/payment/RecurringPaymentInformation;Lcom/app/tgtg/model/remote/payment/PaymentIcons;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLcom/app/tgtg/model/remote/payment/CardStatus;ZZLcom/adyen/checkout/core/Environment;Lcom/app/tgtg/model/remote/payment/Price;Lm90/m1;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/app/tgtg/model/remote/order/response/ProviderType;", "component2", "()Lcom/app/tgtg/model/remote/order/response/PaymentProvider;", "component3", "()Lcom/app/tgtg/model/remote/payment/PaymentType;", "component4", "()Lcom/app/tgtg/model/remote/payment/RecurringPaymentInformation;", "component5", "()Lcom/app/tgtg/model/remote/payment/PaymentIcons;", "component6", "()Ljava/lang/String;", "component7", "component8", "()Z", "component9", "component10", "component11", "()Lcom/app/tgtg/model/remote/payment/CardStatus;", "component12", "component13", "component14", "()Lcom/adyen/checkout/core/Environment;", "component15", "()Lcom/app/tgtg/model/remote/payment/Price;", "copy", "(Lcom/app/tgtg/model/remote/order/response/ProviderType;Lcom/app/tgtg/model/remote/order/response/PaymentProvider;Lcom/app/tgtg/model/remote/payment/PaymentType;Lcom/app/tgtg/model/remote/payment/RecurringPaymentInformation;Lcom/app/tgtg/model/remote/payment/PaymentIcons;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLcom/app/tgtg/model/remote/payment/CardStatus;ZZLcom/adyen/checkout/core/Environment;Lcom/app/tgtg/model/remote/payment/Price;)Lcom/app/tgtg/model/remote/payment/PaymentMethods;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/payment/PaymentMethods;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/app/tgtg/model/remote/order/response/ProviderType;", "getProviderType", "getProviderType$annotations", "()V", "Lcom/app/tgtg/model/remote/order/response/PaymentProvider;", "getPaymentProvider", "getPaymentProvider$annotations", "Lcom/app/tgtg/model/remote/payment/PaymentType;", "getPaymentType", "getPaymentType$annotations", "Lcom/app/tgtg/model/remote/payment/RecurringPaymentInformation;", "getRecurringInfo", "getRecurringInfo$annotations", "Lcom/app/tgtg/model/remote/payment/PaymentIcons;", "getIcons", "getIcons$annotations", "Ljava/lang/String;", "getCardIdentifier", "getCardIdentifier$annotations", "getDisplayValue", "getDisplayValue$annotations", "Z", "getHasVouchersEnabled", "getHasVouchersEnabled$annotations", "getAdyenPayload", "getAdyenPayload$annotations", "getSaveCard", "getSaveCard$annotations", "Lcom/app/tgtg/model/remote/payment/CardStatus;", "getCardStatus", "getCardStatus$annotations", "getShowZipcode", "getShowZipcode$annotations", "isPreferred$annotations", "Lcom/adyen/checkout/core/Environment;", "getAdyenEnvironment", "getAdyenEnvironment$annotations", "Lcom/app/tgtg/model/remote/payment/Price;", "getAvailableAmount", "getAvailableAmount$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class PaymentMethods implements Parcelable {

    @NotNull
    private final Environment adyenEnvironment;

    @Nullable
    private final String adyenPayload;

    @Nullable
    private final Price availableAmount;

    @Nullable
    private final String cardIdentifier;

    @NotNull
    private final CardStatus cardStatus;

    @Nullable
    private final String displayValue;
    private final boolean hasVouchersEnabled;

    @Nullable
    private final PaymentIcons icons;
    private final boolean isPreferred;

    @Nullable
    private final PaymentProvider paymentProvider;

    @Nullable
    private final PaymentType paymentType;

    @Nullable
    private final ProviderType providerType;

    @Nullable
    private final RecurringPaymentInformation recurringInfo;
    private final boolean saveCard;
    private final boolean showZipcode;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<PaymentMethods> CREATOR = new Creator();

    public /* synthetic */ PaymentMethods(int i11, ProviderType providerType, PaymentProvider paymentProvider, PaymentType paymentType, RecurringPaymentInformation recurringPaymentInformation, PaymentIcons paymentIcons, String str, String str2, boolean z11, String str3, boolean z12, CardStatus cardStatus, boolean z13, boolean z14, Environment environment, Price price, m1 m1Var) {
        if (16384 != (i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE)) {
            c1.j(i11, BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE, PaymentMethods$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i11 & 1) == 0) {
            this.providerType = null;
        } else {
            this.providerType = providerType;
        }
        if ((i11 & 2) == 0) {
            this.paymentProvider = null;
        } else {
            this.paymentProvider = paymentProvider;
        }
        if ((i11 & 4) == 0) {
            this.paymentType = null;
        } else {
            this.paymentType = paymentType;
        }
        if ((i11 & 8) == 0) {
            this.recurringInfo = null;
        } else {
            this.recurringInfo = recurringPaymentInformation;
        }
        if ((i11 & 16) == 0) {
            this.icons = null;
        } else {
            this.icons = paymentIcons;
        }
        if ((i11 & 32) == 0) {
            this.cardIdentifier = null;
        } else {
            this.cardIdentifier = str;
        }
        if ((i11 & 64) == 0) {
            this.displayValue = null;
        } else {
            this.displayValue = str2;
        }
        if ((i11 & 128) == 0) {
            this.hasVouchersEnabled = false;
        } else {
            this.hasVouchersEnabled = z11;
        }
        if ((i11 & 256) == 0) {
            this.adyenPayload = null;
        } else {
            this.adyenPayload = str3;
        }
        if ((i11 & 512) == 0) {
            this.saveCard = false;
        } else {
            this.saveCard = z12;
        }
        if ((i11 & 1024) == 0) {
            this.cardStatus = CardStatus.ACTIVE;
        } else {
            this.cardStatus = cardStatus;
        }
        if ((i11 & NewHope.SENDB_BYTES) == 0) {
            this.showZipcode = false;
        } else {
            this.showZipcode = z13;
        }
        if ((i11 & 4096) == 0) {
            this.isPreferred = false;
        } else {
            this.isPreferred = z14;
        }
        this.adyenEnvironment = (i11 & 8192) == 0 ? Environment.EUROPE : environment;
        this.availableAmount = price;
    }

    public static final /* synthetic */ void write$Self$app(PaymentMethods self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.providerType != null) {
            output.r(serialDesc, 0, ProviderTypeSerializer.INSTANCE, self.providerType);
        }
        if (output.C(serialDesc) || self.paymentProvider != null) {
            output.r(serialDesc, 1, PaymentProviderSerializer.INSTANCE, self.paymentProvider);
        }
        if (output.C(serialDesc) || self.paymentType != null) {
            output.r(serialDesc, 2, PaymentTypeSerializer.INSTANCE, self.paymentType);
        }
        if (output.C(serialDesc) || self.recurringInfo != null) {
            output.r(serialDesc, 3, RecurringPaymentInformation$$serializer.INSTANCE, self.recurringInfo);
        }
        if (output.C(serialDesc) || self.icons != null) {
            output.r(serialDesc, 4, PaymentIcons$$serializer.INSTANCE, self.icons);
        }
        if (output.C(serialDesc) || self.cardIdentifier != null) {
            output.r(serialDesc, 5, r1.f29848a, self.cardIdentifier);
        }
        if (output.C(serialDesc) || self.displayValue != null) {
            output.r(serialDesc, 6, r1.f29848a, self.displayValue);
        }
        if (output.C(serialDesc) || self.hasVouchersEnabled) {
            output.p(serialDesc, 7, self.hasVouchersEnabled);
        }
        if (output.C(serialDesc) || self.adyenPayload != null) {
            output.r(serialDesc, 8, r1.f29848a, self.adyenPayload);
        }
        if (output.C(serialDesc) || self.saveCard) {
            output.p(serialDesc, 9, self.saveCard);
        }
        if (output.C(serialDesc) || self.cardStatus != CardStatus.ACTIVE) {
            output.i(serialDesc, 10, CardStatusSerializer.INSTANCE, self.cardStatus);
        }
        if (output.C(serialDesc) || self.showZipcode) {
            output.p(serialDesc, 11, self.showZipcode);
        }
        if (output.C(serialDesc) || self.isPreferred) {
            output.p(serialDesc, 12, self.isPreferred);
        }
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.adyenEnvironment, Environment.EUROPE)) {
            output.i(serialDesc, 13, AdyenEnvironmentStringSerializer.INSTANCE, self.adyenEnvironment);
        }
        output.r(serialDesc, 14, Price$$serializer.INSTANCE, self.availableAmount);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ProviderType getProviderType() {
        return this.providerType;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getSaveCard() {
        return this.saveCard;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final CardStatus getCardStatus() {
        return this.cardStatus;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getShowZipcode() {
        return this.showZipcode;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsPreferred() {
        return this.isPreferred;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Environment getAdyenEnvironment() {
        return this.adyenEnvironment;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Price getAvailableAmount() {
        return this.availableAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PaymentProvider getPaymentProvider() {
        return this.paymentProvider;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PaymentType getPaymentType() {
        return this.paymentType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RecurringPaymentInformation getRecurringInfo() {
        return this.recurringInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PaymentIcons getIcons() {
        return this.icons;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCardIdentifier() {
        return this.cardIdentifier;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDisplayValue() {
        return this.displayValue;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getHasVouchersEnabled() {
        return this.hasVouchersEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAdyenPayload() {
        return this.adyenPayload;
    }

    @NotNull
    public final PaymentMethods copy(@Nullable ProviderType providerType, @Nullable PaymentProvider paymentProvider, @Nullable PaymentType paymentType, @Nullable RecurringPaymentInformation recurringInfo, @Nullable PaymentIcons icons, @Nullable String cardIdentifier, @Nullable String displayValue, boolean hasVouchersEnabled, @Nullable String adyenPayload, boolean saveCard, @NotNull CardStatus cardStatus, boolean showZipcode, boolean isPreferred, @NotNull Environment adyenEnvironment, @Nullable Price availableAmount) {
        cardStatus.getClass();
        adyenEnvironment.getClass();
        return new PaymentMethods(providerType, paymentProvider, paymentType, recurringInfo, icons, cardIdentifier, displayValue, hasVouchersEnabled, adyenPayload, saveCard, cardStatus, showZipcode, isPreferred, adyenEnvironment, availableAmount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethods)) {
            return false;
        }
        PaymentMethods paymentMethods = (PaymentMethods) other;
        return this.providerType == paymentMethods.providerType && this.paymentProvider == paymentMethods.paymentProvider && this.paymentType == paymentMethods.paymentType && Intrinsics.areEqual(this.recurringInfo, paymentMethods.recurringInfo) && Intrinsics.areEqual(this.icons, paymentMethods.icons) && Intrinsics.areEqual(this.cardIdentifier, paymentMethods.cardIdentifier) && Intrinsics.areEqual(this.displayValue, paymentMethods.displayValue) && this.hasVouchersEnabled == paymentMethods.hasVouchersEnabled && Intrinsics.areEqual(this.adyenPayload, paymentMethods.adyenPayload) && this.saveCard == paymentMethods.saveCard && this.cardStatus == paymentMethods.cardStatus && this.showZipcode == paymentMethods.showZipcode && this.isPreferred == paymentMethods.isPreferred && Intrinsics.areEqual(this.adyenEnvironment, paymentMethods.adyenEnvironment) && Intrinsics.areEqual(this.availableAmount, paymentMethods.availableAmount);
    }

    @NotNull
    public final Environment getAdyenEnvironment() {
        return this.adyenEnvironment;
    }

    @Nullable
    public final String getAdyenPayload() {
        return this.adyenPayload;
    }

    @Nullable
    public final Price getAvailableAmount() {
        return this.availableAmount;
    }

    @Nullable
    public final String getCardIdentifier() {
        return this.cardIdentifier;
    }

    @NotNull
    public final CardStatus getCardStatus() {
        return this.cardStatus;
    }

    @Nullable
    public final String getDisplayValue() {
        return this.displayValue;
    }

    public final boolean getHasVouchersEnabled() {
        return this.hasVouchersEnabled;
    }

    @Nullable
    public final PaymentIcons getIcons() {
        return this.icons;
    }

    @Nullable
    public final PaymentProvider getPaymentProvider() {
        return this.paymentProvider;
    }

    @Nullable
    public final PaymentType getPaymentType() {
        return this.paymentType;
    }

    @Nullable
    public final ProviderType getProviderType() {
        return this.providerType;
    }

    @Nullable
    public final RecurringPaymentInformation getRecurringInfo() {
        return this.recurringInfo;
    }

    public final boolean getSaveCard() {
        return this.saveCard;
    }

    public final boolean getShowZipcode() {
        return this.showZipcode;
    }

    public int hashCode() {
        ProviderType providerType = this.providerType;
        int iHashCode = (providerType == null ? 0 : providerType.hashCode()) * 31;
        PaymentProvider paymentProvider = this.paymentProvider;
        int iHashCode2 = (iHashCode + (paymentProvider == null ? 0 : paymentProvider.hashCode())) * 31;
        PaymentType paymentType = this.paymentType;
        int iHashCode3 = (iHashCode2 + (paymentType == null ? 0 : paymentType.hashCode())) * 31;
        RecurringPaymentInformation recurringPaymentInformation = this.recurringInfo;
        int iHashCode4 = (iHashCode3 + (recurringPaymentInformation == null ? 0 : recurringPaymentInformation.hashCode())) * 31;
        PaymentIcons paymentIcons = this.icons;
        int iHashCode5 = (iHashCode4 + (paymentIcons == null ? 0 : paymentIcons.hashCode())) * 31;
        String str = this.cardIdentifier;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.displayValue;
        int iE = k.e((iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.hasVouchersEnabled);
        String str3 = this.adyenPayload;
        int iHashCode7 = (this.adyenEnvironment.hashCode() + k.e(k.e((this.cardStatus.hashCode() + k.e((iE + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.saveCard)) * 31, 31, this.showZipcode), 31, this.isPreferred)) * 31;
        Price price = this.availableAmount;
        return iHashCode7 + (price != null ? price.hashCode() : 0);
    }

    public final boolean isPreferred() {
        return this.isPreferred;
    }

    @NotNull
    public String toString() {
        ProviderType providerType = this.providerType;
        PaymentProvider paymentProvider = this.paymentProvider;
        PaymentType paymentType = this.paymentType;
        RecurringPaymentInformation recurringPaymentInformation = this.recurringInfo;
        PaymentIcons paymentIcons = this.icons;
        String str = this.cardIdentifier;
        String str2 = this.displayValue;
        boolean z11 = this.hasVouchersEnabled;
        String str3 = this.adyenPayload;
        boolean z12 = this.saveCard;
        CardStatus cardStatus = this.cardStatus;
        boolean z13 = this.showZipcode;
        boolean z14 = this.isPreferred;
        Environment environment = this.adyenEnvironment;
        Price price = this.availableAmount;
        StringBuilder sb2 = new StringBuilder("PaymentMethods(providerType=");
        sb2.append(providerType);
        sb2.append(", paymentProvider=");
        sb2.append(paymentProvider);
        sb2.append(", paymentType=");
        sb2.append(paymentType);
        sb2.append(", recurringInfo=");
        sb2.append(recurringPaymentInformation);
        sb2.append(", icons=");
        sb2.append(paymentIcons);
        sb2.append(", cardIdentifier=");
        sb2.append(str);
        sb2.append(", displayValue=");
        k.z(sb2, str2, ", hasVouchersEnabled=", z11, ", adyenPayload=");
        k.z(sb2, str3, ", saveCard=", z12, ", cardStatus=");
        sb2.append(cardStatus);
        sb2.append(", showZipcode=");
        sb2.append(z13);
        sb2.append(", isPreferred=");
        sb2.append(z14);
        sb2.append(", adyenEnvironment=");
        sb2.append(environment);
        sb2.append(", availableAmount=");
        sb2.append(price);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        ProviderType providerType = this.providerType;
        if (providerType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(providerType.name());
        }
        PaymentProvider paymentProvider = this.paymentProvider;
        if (paymentProvider == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(paymentProvider.name());
        }
        PaymentType paymentType = this.paymentType;
        if (paymentType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(paymentType.name());
        }
        RecurringPaymentInformation recurringPaymentInformation = this.recurringInfo;
        if (recurringPaymentInformation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            recurringPaymentInformation.writeToParcel(dest, flags);
        }
        PaymentIcons paymentIcons = this.icons;
        if (paymentIcons == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            paymentIcons.writeToParcel(dest, flags);
        }
        dest.writeString(this.cardIdentifier);
        dest.writeString(this.displayValue);
        dest.writeInt(this.hasVouchersEnabled ? 1 : 0);
        dest.writeString(this.adyenPayload);
        dest.writeInt(this.saveCard ? 1 : 0);
        dest.writeString(this.cardStatus.name());
        dest.writeInt(this.showZipcode ? 1 : 0);
        dest.writeInt(this.isPreferred ? 1 : 0);
        dest.writeParcelable(this.adyenEnvironment, flags);
        Price price = this.availableAmount;
        if (price == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/payment/PaymentMethods$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/payment/PaymentMethods;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PaymentMethods$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentMethods> {
        /* JADX WARN: Can't rename method to resolve collision */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 com.app.tgtg.model.remote.payment.PaymentMethods, still in use, count: 2, list:
              (r1v0 com.app.tgtg.model.remote.payment.PaymentMethods) from 0x0073: MOVE (r10v1 com.app.tgtg.model.remote.payment.PaymentMethods) = (r1v0 com.app.tgtg.model.remote.payment.PaymentMethods) (LINE:116)
              (r1v0 com.app.tgtg.model.remote.payment.PaymentMethods) from 0x006f: MOVE (r10v6 com.app.tgtg.model.remote.payment.PaymentMethods) = (r1v0 com.app.tgtg.model.remote.payment.PaymentMethods) (LINE:112)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
            	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
            */
        @Override // android.os.Parcelable.Creator
        public final com.app.tgtg.model.remote.payment.PaymentMethods createFromParcel(android.os.Parcel r19) {
            /*
                Method dump skipped, instruction units count: 206
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.remote.payment.PaymentMethods.Creator.createFromParcel(android.os.Parcel):com.app.tgtg.model.remote.payment.PaymentMethods");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethods[] newArray(int i11) {
            return new PaymentMethods[i11];
        }
    }

    @h(with = AdyenEnvironmentStringSerializer.class)
    @g("live_url_prefix")
    public static /* synthetic */ void getAdyenEnvironment$annotations() {
    }

    @g("adyen_api_payload")
    public static /* synthetic */ void getAdyenPayload$annotations() {
    }

    @g("available_amount")
    public static /* synthetic */ void getAvailableAmount$annotations() {
    }

    @g("identifier")
    public static /* synthetic */ void getCardIdentifier$annotations() {
    }

    @g("status")
    public static /* synthetic */ void getCardStatus$annotations() {
    }

    @g("display_value")
    public static /* synthetic */ void getDisplayValue$annotations() {
    }

    @g("has_vouchers_enabled")
    public static /* synthetic */ void getHasVouchersEnabled$annotations() {
    }

    @g("images")
    public static /* synthetic */ void getIcons$annotations() {
    }

    @g("payment_provider")
    public static /* synthetic */ void getPaymentProvider$annotations() {
    }

    @g("payment_type")
    public static /* synthetic */ void getPaymentType$annotations() {
    }

    @g("type")
    public static /* synthetic */ void getProviderType$annotations() {
    }

    @g("recurring_info")
    public static /* synthetic */ void getRecurringInfo$annotations() {
    }

    @g("save_payment_method")
    public static /* synthetic */ void getSaveCard$annotations() {
    }

    @g("show_zip_code")
    public static /* synthetic */ void getShowZipcode$annotations() {
    }

    @g("preferred")
    public static /* synthetic */ void isPreferred$annotations() {
    }

    public PaymentMethods(@Nullable ProviderType providerType, @Nullable PaymentProvider paymentProvider, @Nullable PaymentType paymentType, @Nullable RecurringPaymentInformation recurringPaymentInformation, @Nullable PaymentIcons paymentIcons, @Nullable String str, @Nullable String str2, boolean z11, @Nullable String str3, boolean z12, @NotNull CardStatus cardStatus, boolean z13, boolean z14, @NotNull Environment environment, @Nullable Price price) {
        cardStatus.getClass();
        environment.getClass();
        this.providerType = providerType;
        this.paymentProvider = paymentProvider;
        this.paymentType = paymentType;
        this.recurringInfo = recurringPaymentInformation;
        this.icons = paymentIcons;
        this.cardIdentifier = str;
        this.displayValue = str2;
        this.hasVouchersEnabled = z11;
        this.adyenPayload = str3;
        this.saveCard = z12;
        this.cardStatus = cardStatus;
        this.showZipcode = z13;
        this.isPreferred = z14;
        this.adyenEnvironment = environment;
        this.availableAmount = price;
    }

    public /* synthetic */ PaymentMethods(ProviderType providerType, PaymentProvider paymentProvider, PaymentType paymentType, RecurringPaymentInformation recurringPaymentInformation, PaymentIcons paymentIcons, String str, String str2, boolean z11, String str3, boolean z12, CardStatus cardStatus, boolean z13, boolean z14, Environment environment, Price price, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : providerType, (i11 & 2) != 0 ? null : paymentProvider, (i11 & 4) != 0 ? null : paymentType, (i11 & 8) != 0 ? null : recurringPaymentInformation, (i11 & 16) != 0 ? null : paymentIcons, (i11 & 32) != 0 ? null : str, (i11 & 64) != 0 ? null : str2, (i11 & 128) != 0 ? false : z11, (i11 & 256) != 0 ? null : str3, (i11 & 512) != 0 ? false : z12, (i11 & 1024) != 0 ? CardStatus.ACTIVE : cardStatus, (i11 & NewHope.SENDB_BYTES) != 0 ? false : z13, (i11 & 4096) != 0 ? false : z14, (i11 & 8192) != 0 ? Environment.EUROPE : environment, price);
    }
}
