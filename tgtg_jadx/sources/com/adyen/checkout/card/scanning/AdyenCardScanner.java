package com.adyen.checkout.card.scanning;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.core.Environment;
import com.braze.h2;
import com.google.android.gms.common.api.k;
import com.google.android.gms.tasks.Task;
import d10.e;
import d10.h;
import e10.i;
import e10.j;
import e10.p;
import e10.t;
import e10.u;
import e10.v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pz.d;
import u70.o;
import u70.q;
import v80.l;
import x70.c;
import y70.a;
import y70.f;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0015\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0013\u0010\u001bJ\u001d\u0010\u0013\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0013\u0010\u001eJ\u0019\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0011¢\u0006\u0004\b$\u0010\u0003R\u0018\u0010%\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/adyen/checkout/card/scanning/AdyenCardScanner;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/adyen/checkout/core/Environment;", "environment", "Le10/p;", "createPaymentsClient", "(Landroid/content/Context;Lcom/adyen/checkout/core/Environment;)Le10/p;", "paymentsClient", "", "initializeCardRecognition", "(Le10/p;Lx70/c;)Ljava/lang/Object;", "Lkotlin/Function1;", "Landroid/app/PendingIntent;", "", "startIntentSender", "startScanner", "(Lkotlin/jvm/functions/Function1;)Z", "initialize", "(Landroid/content/Context;Lcom/adyen/checkout/core/Environment;Lx70/c;)Ljava/lang/Object;", "Landroid/app/Activity;", "activity", "", "requestCode", "(Landroid/app/Activity;I)Z", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;I)Z", "Landroid/content/Intent;", Bayeux.KEY_DATA, "Lcom/adyen/checkout/card/scanning/AdyenCardScannerResult;", "getResult", "(Landroid/content/Intent;)Lcom/adyen/checkout/card/scanning/AdyenCardScannerResult;", "terminate", "paymentCardRecognitionPendingIntent", "Landroid/app/PendingIntent;", "card-scanning_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAdyenCardScanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdyenCardScanner.kt\ncom/adyen/checkout/card/scanning/AdyenCardScanner\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,135:1\n351#2,11:136\n21#3,12:147\n*S KotlinDebug\n*F\n+ 1 AdyenCardScanner.kt\ncom/adyen/checkout/card/scanning/AdyenCardScanner\n*L\n53#1:136,11\n114#1:147,12\n*E\n"})
public final class AdyenCardScanner {

    @Nullable
    private PendingIntent paymentCardRecognitionPendingIntent;

    private final p createPaymentsClient(Context context, Environment environment) {
        int i11 = Intrinsics.areEqual(environment, Environment.TEST) ? 3 : 1;
        t tVar = new t();
        tVar.g(i11);
        return new p(context, null, v.f15550a, new u(tVar), k.f11084c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object initializeCardRecognition(p pVar, c<? super Boolean> cVar) {
        final l lVar = new l(1, f.b(cVar));
        lVar.t();
        i iVar = new i();
        iVar.f15516a = 1;
        pVar.getClass();
        qz.t tVarBuilder = qz.u.builder();
        tVarBuilder.f37388a = new a50.c(iVar, 16);
        tVarBuilder.f37390c = new d[]{v.f15552c};
        tVarBuilder.f37389b = true;
        tVarBuilder.f37391d = 23716;
        Task taskDoRead = pVar.doRead(tVarBuilder.a());
        final Function1<j, Unit> function1 = new Function1<j, Unit>() { // from class: com.adyen.checkout.card.scanning.AdyenCardScanner$initializeCardRecognition$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(j jVar) {
                if (lVar.g()) {
                    this.paymentCardRecognitionPendingIntent = jVar.f15517a;
                    v80.k kVar = lVar;
                    o oVar = q.f40850b;
                    kVar.resumeWith(Boolean.TRUE);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((j) obj);
                return Unit.f26487a;
            }
        };
        d10.o oVarG = taskDoRead.g(new e(function1) { // from class: com.adyen.checkout.card.scanning.AdyenCardScanner$sam$com_google_android_gms_tasks_OnSuccessListener$0
            private final /* synthetic */ Function1 function;

            {
                function1.getClass();
                this.function = function1;
            }

            @Override // d10.e
            public final /* synthetic */ void onSuccess(Object obj) {
                this.function.invoke(obj);
            }
        });
        oVarG.f(h.f13698a, new d10.d() { // from class: com.adyen.checkout.card.scanning.AdyenCardScanner$initializeCardRecognition$2$2
            @Override // d10.d
            public final void onFailure(@NotNull Exception exc) {
                exc.getClass();
                AdyenCardScanner adyenCardScanner = this.this$0;
                AdyenLogLevel adyenLogLevel = AdyenLogLevel.WARN;
                AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
                if (companion.getLogger().shouldLog(adyenLogLevel)) {
                    String name = adyenCardScanner.getClass().getName();
                    String strY = StringsKt.Y(name, '$');
                    String strW = StringsKt.W('.', strY, strY);
                    if (strW.length() != 0) {
                        name = StringsKt.O(strW, "Kt");
                    }
                    companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Card scanning not available", exc);
                }
                if (lVar.g()) {
                    v80.k kVar = lVar;
                    o oVar = q.f40850b;
                    kVar.resumeWith(Boolean.FALSE);
                }
            }
        });
        oVarG.a(new d10.c() { // from class: com.adyen.checkout.card.scanning.AdyenCardScanner$initializeCardRecognition$2$3
            @Override // d10.c
            public final void onCanceled() {
                if (lVar.g()) {
                    lVar.j(null);
                }
            }
        });
        Object objS = lVar.s();
        a aVar = a.COROUTINE_SUSPENDED;
        return objS;
    }

    private final boolean startScanner(Function1<? super PendingIntent, Unit> startIntentSender) {
        PendingIntent pendingIntent = this.paymentCardRecognitionPendingIntent;
        if (pendingIntent == null) {
            h2.b("The scanner must be initialized before it can be started");
            return false;
        }
        try {
            startIntentSender.invoke(pendingIntent);
            return true;
        } catch (IntentSender.SendIntentException e5) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.ERROR;
            if (!AdyenLogger.INSTANCE.getLogger().shouldLog(adyenLogLevel)) {
                return false;
            }
            String name = AdyenCardScanner.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            AdyenLogger.INSTANCE.getLogger().log(adyenLogLevel, "CO.".concat(name), "Failed to start payment card recognition", e5);
            return false;
        }
    }

    @Nullable
    public final AdyenCardScannerResult getResult(@Nullable Intent data) {
        if (data != null) {
            Parcelable.Creator<e10.k> creator = e10.k.CREATOR;
            byte[] byteArrayExtra = data.getByteArrayExtra("com.google.android.gms.wallet.PaymentCardRecognitionResult");
            e10.k kVar = (e10.k) (byteArrayExtra == null ? null : m0.c.a0(byteArrayExtra, creator));
            if (kVar != null) {
                e10.d dVar = kVar.f15519b;
                return new AdyenCardScannerResult(kVar.f15518a, dVar != null ? Integer.valueOf(dVar.f15481a) : null, dVar != null ? Integer.valueOf(dVar.f15482b) : null);
            }
        }
        return null;
    }

    @Nullable
    public final Object initialize(@NotNull Context context, @NotNull Environment environment, @NotNull c<? super Boolean> cVar) {
        return initializeCardRecognition(createPaymentsClient(context, environment), cVar);
    }

    public final void terminate() {
        this.paymentCardRecognitionPendingIntent = null;
    }

    public final boolean startScanner(@NotNull final Fragment fragment, final int requestCode) {
        fragment.getClass();
        return startScanner(new Function1<PendingIntent, Unit>() { // from class: com.adyen.checkout.card.scanning.AdyenCardScanner.startScanner.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull PendingIntent pendingIntent) throws IntentSender.SendIntentException {
                pendingIntent.getClass();
                fragment.startIntentSenderForResult(pendingIntent.getIntentSender(), requestCode, null, 0, 0, 0, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws IntentSender.SendIntentException {
                invoke((PendingIntent) obj);
                return Unit.f26487a;
            }
        });
    }

    public final boolean startScanner(@NotNull final Activity activity, final int requestCode) {
        activity.getClass();
        return startScanner(new Function1<PendingIntent, Unit>() { // from class: com.adyen.checkout.card.scanning.AdyenCardScanner.startScanner.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull PendingIntent pendingIntent) throws IntentSender.SendIntentException {
                pendingIntent.getClass();
                activity.startIntentSenderForResult(pendingIntent.getIntentSender(), requestCode, null, 0, 0, 0, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws IntentSender.SendIntentException {
                invoke((PendingIntent) obj);
                return Unit.f26487a;
            }
        });
    }
}
