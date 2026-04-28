package com.adyen.checkout.adyen3ds2.internal.ui;

import com.adyen.checkout.components.core.internal.analytics.ErrorEvent;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.core.exception.CheckoutException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import v80.y;
import v80.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/adyen3ds2/internal/ui/DefaultAdyen3DS2Delegate$identifyShopper$$inlined$CoroutineExceptionHandler$1", "Lkotlin/coroutines/a;", "Lv80/z;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 DefaultAdyen3DS2Delegate.kt\ncom/adyen/checkout/adyen3ds2/internal/ui/DefaultAdyen3DS2Delegate\n+ 3 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,48:1\n272#2:49\n273#2,6:62\n21#3,12:50\n*S KotlinDebug\n*F\n+ 1 DefaultAdyen3DS2Delegate.kt\ncom/adyen/checkout/adyen3ds2/internal/ui/DefaultAdyen3DS2Delegate\n*L\n272#1:50,12\n*E\n"})
public final class DefaultAdyen3DS2Delegate$identifyShopper$$inlined$CoroutineExceptionHandler$1 extends a implements z {
    final /* synthetic */ DefaultAdyen3DS2Delegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultAdyen3DS2Delegate$identifyShopper$$inlined$CoroutineExceptionHandler$1(y yVar, DefaultAdyen3DS2Delegate defaultAdyen3DS2Delegate) {
        super(yVar);
        this.this$0 = defaultAdyen3DS2Delegate;
    }

    @Override // v80.z
    public void handleException(CoroutineContext context, Throwable exception) {
        DefaultAdyen3DS2Delegate defaultAdyen3DS2Delegate = this.this$0;
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.ERROR;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = defaultAdyen3DS2Delegate.getClass().getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Unexpected uncaught 3DS2 Exception", exception);
        }
        this.this$0.trackFingerprintErrorEvent(ErrorEvent.THREEDS2_FINGERPRINT_HANDLING, "Fingerprint handling failed because of uncaught exception");
        this.this$0.emitError(new CheckoutException("Unexpected 3DS2 exception.", exception));
    }
}
