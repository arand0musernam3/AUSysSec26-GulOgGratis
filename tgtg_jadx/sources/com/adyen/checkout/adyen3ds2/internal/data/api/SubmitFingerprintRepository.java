package com.adyen.checkout.adyen3ds2.internal.data.api;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/adyen3ds2/internal/data/api/SubmitFingerprintRepository;", "", "Lcom/adyen/checkout/adyen3ds2/internal/data/api/SubmitFingerprintService;", "submitFingerprintService", "<init>", "(Lcom/adyen/checkout/adyen3ds2/internal/data/api/SubmitFingerprintService;)V", "", "encodedFingerprint", "clientKey", "paymentData", "Lu70/q;", "Lcom/adyen/checkout/adyen3ds2/internal/data/model/SubmitFingerprintResult;", "submitFingerprint-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "submitFingerprint", "Lcom/adyen/checkout/adyen3ds2/internal/data/api/SubmitFingerprintService;", "Companion", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSubmitFingerprintRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubmitFingerprintRepository.kt\ncom/adyen/checkout/adyen3ds2/internal/data/api/SubmitFingerprintRepository\n+ 2 ResultExt.kt\ncom/adyen/checkout/core/internal/util/ResultExtKt\n+ 3 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,66:1\n17#2,2:67\n19#2,4:154\n16#3,17:69\n16#3,17:86\n16#3,17:103\n16#3,17:120\n16#3,17:137\n*S KotlinDebug\n*F\n+ 1 SubmitFingerprintRepository.kt\ncom/adyen/checkout/adyen3ds2/internal/data/api/SubmitFingerprintRepository\n*L\n28#1:67,2\n28#1:154,4\n29#1:69,17\n40#1:86,17\n45#1:103,17\n50#1:120,17\n55#1:137,17\n*E\n"})
public final class SubmitFingerprintRepository {

    @NotNull
    private static final String RESPONSE_TYPE_ACTION = "action";

    @NotNull
    private static final String RESPONSE_TYPE_COMPLETED = "completed";

    @NotNull
    private final SubmitFingerprintService submitFingerprintService;

    public SubmitFingerprintRepository(@NotNull SubmitFingerprintService submitFingerprintService) {
        submitFingerprintService.getClass();
        this.submitFingerprintService = submitFingerprintService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: submitFingerprint-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m73submitFingerprintBWLJW6A(@org.jetbrains.annotations.NotNull java.lang.String r17, @org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.Nullable java.lang.String r19, @org.jetbrains.annotations.NotNull x70.c<? super u70.q<? extends com.adyen.checkout.adyen3ds2.internal.data.model.SubmitFingerprintResult>> r20) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.adyen3ds2.internal.data.api.SubmitFingerprintRepository.m73submitFingerprintBWLJW6A(java.lang.String, java.lang.String, java.lang.String, x70.c):java.lang.Object");
    }
}
