package com.app.tgtg.model.remote.payment;

import android.os.Parcelable;
import com.app.tgtg.model.remote.order.response.PaymentProvider;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h(with = BasicSavedPaymentMethodSerializer.class)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0004\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/app/tgtg/model/remote/payment/BasicSavedPaymentMethod;", "Landroid/os/Parcelable;", "<init>", "()V", "paymentProvider", "Lcom/app/tgtg/model/remote/order/response/PaymentProvider;", "getPaymentProvider", "()Lcom/app/tgtg/model/remote/order/response/PaymentProvider;", "type", "Lcom/app/tgtg/model/remote/payment/PaymentType;", "getType", "()Lcom/app/tgtg/model/remote/payment/PaymentType;", "cardStatus", "Lcom/app/tgtg/model/remote/payment/CardStatus;", "getCardStatus", "()Lcom/app/tgtg/model/remote/payment/CardStatus;", "displayValue", "", "getDisplayValue", "()Ljava/lang/String;", "Companion", "Lcom/app/tgtg/model/remote/payment/SavedBancontactCard;", "Lcom/app/tgtg/model/remote/payment/SavedCreditCard;", "Lcom/app/tgtg/model/remote/payment/SavedEdenred;", "Lcom/app/tgtg/model/remote/payment/UnknownSavedPaymentMethod;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class BasicSavedPaymentMethod implements Parcelable {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ BasicSavedPaymentMethod(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract CardStatus getCardStatus();

    @NotNull
    public abstract String getDisplayValue();

    @NotNull
    public abstract PaymentProvider getPaymentProvider();

    @NotNull
    public abstract PaymentType getType();

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/payment/BasicSavedPaymentMethod$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/payment/BasicSavedPaymentMethod;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BasicSavedPaymentMethodSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    private BasicSavedPaymentMethod() {
    }
}
