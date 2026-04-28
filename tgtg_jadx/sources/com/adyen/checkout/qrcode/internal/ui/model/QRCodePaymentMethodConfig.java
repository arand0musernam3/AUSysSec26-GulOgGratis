package com.adyen.checkout.qrcode.internal.ui.model;

import a80.a;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.qrcode.R;
import com.adyen.checkout.qrcode.internal.ui.QrCodeComponentViewType;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p80.c;
import p80.d;
import p80.g;
import p80.h;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0080\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B+\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0018"}, d2 = {"Lcom/adyen/checkout/qrcode/internal/ui/model/QRCodePaymentMethodConfig;", "", Action.PAYMENT_METHOD_TYPE, "", "maxPollingDurationMillis", "", "viewType", "Lcom/adyen/checkout/qrcode/internal/ui/QrCodeComponentViewType;", "messageTextResource", "", "(Ljava/lang/String;ILjava/lang/String;JLcom/adyen/checkout/qrcode/internal/ui/QrCodeComponentViewType;Ljava/lang/Integer;)V", "getMaxPollingDurationMillis", "()J", "getMessageTextResource", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getViewType", "()Lcom/adyen/checkout/qrcode/internal/ui/QrCodeComponentViewType;", "DEFAULT", "DUIT_NOW", "PAY_NOW", "PROMPT_PAY", "UPI_QR", "Companion", "qr-code_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class QRCodePaymentMethodConfig {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ QRCodePaymentMethodConfig[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final QRCodePaymentMethodConfig DEFAULT;
    public static final QRCodePaymentMethodConfig DUIT_NOW;
    public static final QRCodePaymentMethodConfig PAY_NOW;
    public static final QRCodePaymentMethodConfig PROMPT_PAY;
    public static final QRCodePaymentMethodConfig UPI_QR;
    private final long maxPollingDurationMillis;

    @Nullable
    private final Integer messageTextResource;

    @NotNull
    private final String paymentMethodType;

    @NotNull
    private final QrCodeComponentViewType viewType;

    private static final /* synthetic */ QRCodePaymentMethodConfig[] $values() {
        return new QRCodePaymentMethodConfig[]{DEFAULT, DUIT_NOW, PAY_NOW, PROMPT_PAY, UPI_QR};
    }

    static {
        c cVar = d.f34559b;
        h hVar = h.MINUTES;
        DEFAULT = new QRCodePaymentMethodConfig("DEFAULT", 0, "", d.f(g.g(15, hVar)), QrCodeComponentViewType.SIMPLE_QR_CODE, null);
        h hVar2 = h.SECONDS;
        long jF = d.f(g.g(90, hVar2));
        QrCodeComponentViewType qrCodeComponentViewType = QrCodeComponentViewType.FULL_QR_CODE;
        DUIT_NOW = new QRCodePaymentMethodConfig("DUIT_NOW", 1, PaymentMethodTypes.DUIT_NOW, jF, qrCodeComponentViewType, Integer.valueOf(R.string.checkout_qr_code_duit_now));
        PAY_NOW = new QRCodePaymentMethodConfig("PAY_NOW", 2, PaymentMethodTypes.PAY_NOW, d.f(g.g(3, hVar)), qrCodeComponentViewType, Integer.valueOf(R.string.checkout_qr_code_pay_now));
        PROMPT_PAY = new QRCodePaymentMethodConfig("PROMPT_PAY", 3, PaymentMethodTypes.PROMPT_PAY, d.f(g.g(90, hVar2)), qrCodeComponentViewType, Integer.valueOf(R.string.checkout_qr_code_prompt_pay));
        UPI_QR = new QRCodePaymentMethodConfig("UPI_QR", 4, PaymentMethodTypes.UPI_QR, d.f(g.g(5, hVar)), qrCodeComponentViewType, Integer.valueOf(R.string.checkout_qr_code_upi));
        QRCodePaymentMethodConfig[] qRCodePaymentMethodConfigArr$values = $values();
        $VALUES = qRCodePaymentMethodConfigArr$values;
        $ENTRIES = n.w(qRCodePaymentMethodConfigArr$values);
        INSTANCE = new Companion(null);
    }

    private QRCodePaymentMethodConfig(String str, int i11, String str2, long j9, QrCodeComponentViewType qrCodeComponentViewType, Integer num) {
        this.paymentMethodType = str2;
        this.maxPollingDurationMillis = j9;
        this.viewType = qrCodeComponentViewType;
        this.messageTextResource = num;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static QRCodePaymentMethodConfig valueOf(String str) {
        return (QRCodePaymentMethodConfig) Enum.valueOf(QRCodePaymentMethodConfig.class, str);
    }

    public static QRCodePaymentMethodConfig[] values() {
        return (QRCodePaymentMethodConfig[]) $VALUES.clone();
    }

    public final long getMaxPollingDurationMillis() {
        return this.maxPollingDurationMillis;
    }

    @Nullable
    public final Integer getMessageTextResource() {
        return this.messageTextResource;
    }

    @NotNull
    public final QrCodeComponentViewType getViewType() {
        return this.viewType;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/qrcode/internal/ui/model/QRCodePaymentMethodConfig$Companion;", "", "()V", "getByPaymentMethodType", "Lcom/adyen/checkout/qrcode/internal/ui/model/QRCodePaymentMethodConfig;", Action.PAYMENT_METHOD_TYPE, "", "qr-code_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nQRCodePaymentMethodConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QRCodePaymentMethodConfig.kt\ncom/adyen/checkout/qrcode/internal/ui/model/QRCodePaymentMethodConfig$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n295#2,2:62\n*S KotlinDebug\n*F\n+ 1 QRCodePaymentMethodConfig.kt\ncom/adyen/checkout/qrcode/internal/ui/model/QRCodePaymentMethodConfig$Companion\n*L\n57#1:62,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final QRCodePaymentMethodConfig getByPaymentMethodType(@NotNull String paymentMethodType) {
            Object next;
            paymentMethodType.getClass();
            Iterator<E> it = QRCodePaymentMethodConfig.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((QRCodePaymentMethodConfig) next).paymentMethodType, paymentMethodType)) {
                    break;
                }
            }
            QRCodePaymentMethodConfig qRCodePaymentMethodConfig = (QRCodePaymentMethodConfig) next;
            return qRCodePaymentMethodConfig == null ? QRCodePaymentMethodConfig.DEFAULT : qRCodePaymentMethodConfig;
        }

        private Companion() {
        }
    }
}
