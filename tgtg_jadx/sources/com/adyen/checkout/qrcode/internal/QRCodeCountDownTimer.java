package com.adyen.checkout.qrcode.internal;

import android.os.CountDownTimer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u0003J\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u0003R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/qrcode/internal/QRCodeCountDownTimer;", "", "<init>", "()V", "", "millisInFuture", "countDownInterval", "Lkotlin/Function1;", "", "onTick", "attach", "(JJLkotlin/jvm/functions/Function1;)V", "start", "cancel", "Landroid/os/CountDownTimer;", "countDownTimer", "Landroid/os/CountDownTimer;", "qr-code_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class QRCodeCountDownTimer {

    @Nullable
    private CountDownTimer countDownTimer;

    public final void attach(long millisInFuture, long countDownInterval, @NotNull final Function1<? super Long, Unit> onTick) {
        onTick.getClass();
        this.countDownTimer = new CountDownTimer(millisInFuture, countDownInterval) { // from class: com.adyen.checkout.qrcode.internal.QRCodeCountDownTimer.attach.1
            @Override // android.os.CountDownTimer
            public void onTick(long millisUntilFinished) {
                onTick.invoke(Long.valueOf(millisUntilFinished));
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
            }
        };
    }

    public final void cancel() {
        CountDownTimer countDownTimer = this.countDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public final void start() {
        CountDownTimer countDownTimer = this.countDownTimer;
        if (countDownTimer != null) {
            countDownTimer.start();
        }
    }
}
