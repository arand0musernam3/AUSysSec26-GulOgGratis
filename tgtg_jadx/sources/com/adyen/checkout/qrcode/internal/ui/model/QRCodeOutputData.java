package com.adyen.checkout.qrcode.internal.ui.model;

import b3.i;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.internal.ui.model.OutputData;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\rJH\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\tHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/adyen/checkout/qrcode/internal/ui/model/QRCodeOutputData;", "Lcom/adyen/checkout/components/core/internal/ui/model/OutputData;", "isValid", "", Action.PAYMENT_METHOD_TYPE, "", "qrCodeData", "qrImageUrl", "messageTextResource", "", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "()Z", "getMessageTextResource", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPaymentMethodType", "()Ljava/lang/String;", "getQrCodeData", "getQrImageUrl", "component1", "component2", "component3", "component4", "component5", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/adyen/checkout/qrcode/internal/ui/model/QRCodeOutputData;", "equals", "other", "", "hashCode", "toString", "qr-code_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class QRCodeOutputData implements OutputData {
    private final boolean isValid;

    @Nullable
    private final Integer messageTextResource;

    @Nullable
    private final String paymentMethodType;

    @Nullable
    private final String qrCodeData;

    @Nullable
    private final String qrImageUrl;

    public /* synthetic */ QRCodeOutputData(boolean z11, String str, String str2, String str3, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, str, str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : num);
    }

    public static /* synthetic */ QRCodeOutputData copy$default(QRCodeOutputData qRCodeOutputData, boolean z11, String str, String str2, String str3, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = qRCodeOutputData.isValid;
        }
        if ((i11 & 2) != 0) {
            str = qRCodeOutputData.paymentMethodType;
        }
        if ((i11 & 4) != 0) {
            str2 = qRCodeOutputData.qrCodeData;
        }
        if ((i11 & 8) != 0) {
            str3 = qRCodeOutputData.qrImageUrl;
        }
        if ((i11 & 16) != 0) {
            num = qRCodeOutputData.messageTextResource;
        }
        Integer num2 = num;
        String str4 = str2;
        return qRCodeOutputData.copy(z11, str, str4, str3, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getQrCodeData() {
        return this.qrCodeData;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getQrImageUrl() {
        return this.qrImageUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getMessageTextResource() {
        return this.messageTextResource;
    }

    @NotNull
    public final QRCodeOutputData copy(boolean isValid, @Nullable String paymentMethodType, @Nullable String qrCodeData, @Nullable String qrImageUrl, @Nullable Integer messageTextResource) {
        return new QRCodeOutputData(isValid, paymentMethodType, qrCodeData, qrImageUrl, messageTextResource);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QRCodeOutputData)) {
            return false;
        }
        QRCodeOutputData qRCodeOutputData = (QRCodeOutputData) other;
        return this.isValid == qRCodeOutputData.isValid && Intrinsics.areEqual(this.paymentMethodType, qRCodeOutputData.paymentMethodType) && Intrinsics.areEqual(this.qrCodeData, qRCodeOutputData.qrCodeData) && Intrinsics.areEqual(this.qrImageUrl, qRCodeOutputData.qrImageUrl) && Intrinsics.areEqual(this.messageTextResource, qRCodeOutputData.messageTextResource);
    }

    @Nullable
    public final Integer getMessageTextResource() {
        return this.messageTextResource;
    }

    @Nullable
    public final String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    @Nullable
    public final String getQrCodeData() {
        return this.qrCodeData;
    }

    @Nullable
    public final String getQrImageUrl() {
        return this.qrImageUrl;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isValid) * 31;
        String str = this.paymentMethodType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.qrCodeData;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.qrImageUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.messageTextResource;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.OutputData
    /* JADX INFO: renamed from: isValid */
    public boolean getIsValid() {
        return this.isValid;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isValid;
        String str = this.paymentMethodType;
        String str2 = this.qrCodeData;
        String str3 = this.qrImageUrl;
        Integer num = this.messageTextResource;
        StringBuilder sb2 = new StringBuilder("QRCodeOutputData(isValid=");
        sb2.append(z11);
        sb2.append(", paymentMethodType=");
        sb2.append(str);
        sb2.append(", qrCodeData=");
        s.A(sb2, str2, ", qrImageUrl=", str3, ", messageTextResource=");
        return i.m(sb2, num, ")");
    }

    public QRCodeOutputData(boolean z11, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num) {
        this.isValid = z11;
        this.paymentMethodType = str;
        this.qrCodeData = str2;
        this.qrImageUrl = str3;
        this.messageTextResource = num;
    }
}
