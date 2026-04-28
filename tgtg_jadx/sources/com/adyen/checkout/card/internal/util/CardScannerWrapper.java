package com.adyen.checkout.card.internal.util;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.adyen.checkout.card.scanning.AdyenCardScanner;
import com.adyen.checkout.card.scanning.AdyenCardScannerResult;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z70.c;
import z70.e;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0003R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/adyen/checkout/card/internal/util/CardScannerWrapper;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/adyen/checkout/core/Environment;", "environment", "", "initialize", "(Landroid/content/Context;Lcom/adyen/checkout/core/Environment;Lx70/c;)Ljava/lang/Object;", "Landroidx/fragment/app/Fragment;", "fragment", "", "requestCode", "startScanner", "(Landroidx/fragment/app/Fragment;I)Z", "Landroid/content/Intent;", Bayeux.KEY_DATA, "Lcom/adyen/checkout/card/scanning/AdyenCardScannerResult;", "getResult", "(Landroid/content/Intent;)Lcom/adyen/checkout/card/scanning/AdyenCardScannerResult;", "", "terminate", "Lcom/adyen/checkout/card/scanning/AdyenCardScanner;", "cardScanner", "Lcom/adyen/checkout/card/scanning/AdyenCardScanner;", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCardScannerWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardScannerWrapper.kt\ncom/adyen/checkout/card/internal/util/CardScannerWrapper\n+ 2 RunCompileOnly.kt\ncom/adyen/checkout/core/internal/util/RunCompileOnlyKt\n+ 3 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,39:1\n16#2,4:40\n20#2,5:48\n44#3,4:44\n*S KotlinDebug\n*F\n+ 1 CardScannerWrapper.kt\ncom/adyen/checkout/card/internal/util/CardScannerWrapper\n*L\n21#1:40,4\n21#1:48,5\n21#1:44,4\n*E\n"})
public final class CardScannerWrapper {

    @Nullable
    private final AdyenCardScanner cardScanner;

    /* JADX INFO: renamed from: com.adyen.checkout.card.internal.util.CardScannerWrapper$initialize$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.card.internal.util.CardScannerWrapper", f = "CardScannerWrapper.kt", l = {24}, m = "initialize")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(x70.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CardScannerWrapper.this.initialize(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[PHI: r2 r3 r4
      0x001f: PHI (r2v1 'e' java.lang.Throwable) = (r2v0 'e' java.lang.Throwable), (r2v3 'e' java.lang.Throwable) binds: [B:10:0x001d, B:13:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x001f: PHI (r3v1 com.adyen.checkout.core.AdyenLogLevel) = (r3v0 com.adyen.checkout.core.AdyenLogLevel), (r3v2 com.adyen.checkout.core.AdyenLogLevel) binds: [B:10:0x001d, B:13:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x001f: PHI (r4v1 com.adyen.checkout.core.AdyenLogger$Companion) = (r4v0 com.adyen.checkout.core.AdyenLogger$Companion), (r4v3 com.adyen.checkout.core.AdyenLogger$Companion) binds: [B:10:0x001d, B:13:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CardScannerWrapper() {
        /*
            r6 = this;
            java.lang.String r0 = "Class not found. Are you missing a dependency?"
            java.lang.String r1 = "CO.runCompileOnly"
            r6.<init>()
            com.adyen.checkout.card.scanning.AdyenCardScanner r2 = new com.adyen.checkout.card.scanning.AdyenCardScanner     // Catch: java.lang.NoClassDefFoundError -> Ld java.lang.ClassNotFoundException -> Lf
            r2.<init>()     // Catch: java.lang.NoClassDefFoundError -> Ld java.lang.ClassNotFoundException -> Lf
            goto L37
        Ld:
            r2 = move-exception
            goto L11
        Lf:
            r2 = move-exception
            goto L27
        L11:
            com.adyen.checkout.core.AdyenLogLevel r3 = com.adyen.checkout.core.AdyenLogLevel.WARN
            com.adyen.checkout.core.AdyenLogger$Companion r4 = com.adyen.checkout.core.AdyenLogger.INSTANCE
            com.adyen.checkout.core.AdyenLogger r5 = r4.getLogger()
            boolean r5 = r5.shouldLog(r3)
            if (r5 == 0) goto L36
        L1f:
            com.adyen.checkout.core.AdyenLogger r4 = r4.getLogger()
            r4.log(r3, r1, r0, r2)
            goto L36
        L27:
            com.adyen.checkout.core.AdyenLogLevel r3 = com.adyen.checkout.core.AdyenLogLevel.WARN
            com.adyen.checkout.core.AdyenLogger$Companion r4 = com.adyen.checkout.core.AdyenLogger.INSTANCE
            com.adyen.checkout.core.AdyenLogger r5 = r4.getLogger()
            boolean r5 = r5.shouldLog(r3)
            if (r5 == 0) goto L36
            goto L1f
        L36:
            r2 = 0
        L37:
            r6.cardScanner = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.card.internal.util.CardScannerWrapper.<init>():void");
    }

    @Nullable
    public final AdyenCardScannerResult getResult(@Nullable Intent data) {
        AdyenCardScanner adyenCardScanner = this.cardScanner;
        if (adyenCardScanner != null) {
            return adyenCardScanner.getResult(data);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object initialize(@org.jetbrains.annotations.NotNull android.content.Context r6, @org.jetbrains.annotations.NotNull com.adyen.checkout.core.Environment r7, @org.jetbrains.annotations.NotNull x70.c<? super java.lang.Boolean> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.adyen.checkout.card.internal.util.CardScannerWrapper.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            com.adyen.checkout.card.internal.util.CardScannerWrapper$initialize$1 r0 = (com.adyen.checkout.card.internal.util.CardScannerWrapper.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.adyen.checkout.card.internal.util.CardScannerWrapper$initialize$1 r0 = new com.adyen.checkout.card.internal.util.CardScannerWrapper$initialize$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2f
            if (r2 != r4) goto L28
            ba0.g.M(r8)
            goto L3f
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L2f:
            ba0.g.M(r8)
            com.adyen.checkout.card.scanning.AdyenCardScanner r8 = r5.cardScanner
            if (r8 == 0) goto L48
            r0.label = r4
            java.lang.Object r8 = r8.initialize(r6, r7, r0)
            if (r8 != r1) goto L3f
            return r1
        L3f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r6 = r8.booleanValue()
            if (r6 == 0) goto L48
            r3 = r4
        L48:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.card.internal.util.CardScannerWrapper.initialize(android.content.Context, com.adyen.checkout.core.Environment, x70.c):java.lang.Object");
    }

    public final boolean startScanner(@NotNull Fragment fragment, int requestCode) {
        fragment.getClass();
        AdyenCardScanner adyenCardScanner = this.cardScanner;
        if (adyenCardScanner != null) {
            return adyenCardScanner.startScanner(fragment, requestCode);
        }
        return false;
    }

    public final void terminate() {
        AdyenCardScanner adyenCardScanner = this.cardScanner;
        if (adyenCardScanner != null) {
            adyenCardScanner.terminate();
        }
    }
}
