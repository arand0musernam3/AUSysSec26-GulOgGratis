package com.adyen.checkout.adyen3ds2.internal.ui;

import android.app.Activity;
import ba0.g;
import com.adyen.checkout.adyen3ds2.internal.data.model.FingerprintToken;
import com.adyen.checkout.components.core.internal.analytics.ErrorEvent;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.core.exception.ComponentException;
import com.adyen.threeds2.AuthenticationRequestParameters;
import com.adyen.threeds2.InitializeResult;
import com.adyen.threeds2.Transaction;
import com.adyen.threeds2.parameters.ConfigParameters;
import com.braze.h2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import x70.c;
import y70.a;
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.adyen.checkout.adyen3ds2.internal.ui.DefaultAdyen3DS2Delegate$identifyShopper$2", f = "DefaultAdyen3DS2Delegate.kt", l = {317}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDefaultAdyen3DS2Delegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultAdyen3DS2Delegate.kt\ncom/adyen/checkout/adyen3ds2/internal/ui/DefaultAdyen3DS2Delegate$identifyShopper$2\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,753:1\n16#2,17:754\n*S KotlinDebug\n*F\n+ 1 DefaultAdyen3DS2Delegate.kt\ncom/adyen/checkout/adyen3ds2/internal/ui/DefaultAdyen3DS2Delegate$identifyShopper$2\n*L\n284#1:754,17\n*E\n"})
public final class DefaultAdyen3DS2Delegate$identifyShopper$2 extends i implements Function2<b0, c<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ ConfigParameters $configParameters;
    final /* synthetic */ FingerprintToken $fingerprintToken;
    final /* synthetic */ boolean $submitFingerprintAutomatically;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DefaultAdyen3DS2Delegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultAdyen3DS2Delegate$identifyShopper$2(DefaultAdyen3DS2Delegate defaultAdyen3DS2Delegate, Activity activity, ConfigParameters configParameters, FingerprintToken fingerprintToken, boolean z11, c<? super DefaultAdyen3DS2Delegate$identifyShopper$2> cVar) {
        super(2, cVar);
        this.this$0 = defaultAdyen3DS2Delegate;
        this.$activity = activity;
        this.$configParameters = configParameters;
        this.$fingerprintToken = fingerprintToken;
        this.$submitFingerprintAutomatically = z11;
    }

    @Override // z70.a
    @NotNull
    public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
        DefaultAdyen3DS2Delegate$identifyShopper$2 defaultAdyen3DS2Delegate$identifyShopper$2 = new DefaultAdyen3DS2Delegate$identifyShopper$2(this.this$0, this.$activity, this.$configParameters, this.$fingerprintToken, this.$submitFingerprintAutomatically, cVar);
        defaultAdyen3DS2Delegate$identifyShopper$2.L$0 = obj;
        return defaultAdyen3DS2Delegate$identifyShopper$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super Unit> cVar) {
        return ((DefaultAdyen3DS2Delegate$identifyShopper$2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            g.M(obj);
            b0 b0Var = (b0) this.L$0;
            this.this$0.closeTransaction();
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = b0Var.getClass().getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "initialize 3DS2 SDK", null);
            }
            InitializeResult initializeResultInitialize = this.this$0.threeDS2Service.initialize(this.$activity, this.$configParameters, null, this.this$0.getComponentParams().getUiCustomization());
            boolean z11 = initializeResultInitialize instanceof InitializeResult.Failure;
            DefaultAdyen3DS2Delegate defaultAdyen3DS2Delegate = this.this$0;
            if (z11) {
                InitializeResult.Failure failure = (InitializeResult.Failure) initializeResultInitialize;
                DefaultAdyen3DS2Delegate.emitDetails$default(this.this$0, defaultAdyen3DS2Delegate.makeDetails(failure.getTransactionStatus(), failure.getAdditionalDetails()), false, 2, null);
                return Unit.f26487a;
            }
            Transaction transactionCreateTransaction = defaultAdyen3DS2Delegate.createTransaction(this.$fingerprintToken);
            if (transactionCreateTransaction == null) {
                return Unit.f26487a;
            }
            defaultAdyen3DS2Delegate.currentTransaction = transactionCreateTransaction;
            Transaction transaction = this.this$0.currentTransaction;
            AuthenticationRequestParameters authenticationRequestParameters = transaction != null ? transaction.getAuthenticationRequestParameters() : null;
            DefaultAdyen3DS2Delegate defaultAdyen3DS2Delegate2 = this.this$0;
            if (authenticationRequestParameters == null) {
                defaultAdyen3DS2Delegate2.trackFingerprintErrorEvent(ErrorEvent.THREEDS2_FINGERPRINT_CREATION, "Fingerprint creation failed because authentication parameters do not exist");
                this.this$0.emitError(new ComponentException("Failed to retrieve 3DS2 authentication parameters", null, 2, null));
                return Unit.f26487a;
            }
            String strCreateEncodedFingerprint = defaultAdyen3DS2Delegate2.createEncodedFingerprint(authenticationRequestParameters);
            boolean z12 = this.$submitFingerprintAutomatically;
            DefaultAdyen3DS2Delegate defaultAdyen3DS2Delegate3 = this.this$0;
            if (z12) {
                Activity activity = this.$activity;
                this.label = 1;
                if (defaultAdyen3DS2Delegate3.submitFingerprintAutomatically(activity, strCreateEncodedFingerprint, this) == aVar) {
                    return aVar;
                }
            } else {
                defaultAdyen3DS2Delegate3.emitDetails(defaultAdyen3DS2Delegate3.adyen3DS2Serializer.createFingerprintDetails(strCreateEncodedFingerprint), false);
            }
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
        }
        return Unit.f26487a;
    }
}
