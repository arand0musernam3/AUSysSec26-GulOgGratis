package com.adyen.checkout.adyen3ds2.internal.data.api;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.q;
import y70.a;
import z70.c;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.adyen.checkout.adyen3ds2.internal.data.api.SubmitFingerprintRepository", f = "SubmitFingerprintRepository.kt", l = {36}, m = "submitFingerprint-BWLJW6A")
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class SubmitFingerprintRepository$submitFingerprint$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubmitFingerprintRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitFingerprintRepository$submitFingerprint$1(SubmitFingerprintRepository submitFingerprintRepository, x70.c<? super SubmitFingerprintRepository$submitFingerprint$1> cVar) {
        super(cVar);
        this.this$0 = submitFingerprintRepository;
    }

    @Override // z70.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM73submitFingerprintBWLJW6A = this.this$0.m73submitFingerprintBWLJW6A(null, null, null, this);
        return objM73submitFingerprintBWLJW6A == a.COROUTINE_SUSPENDED ? objM73submitFingerprintBWLJW6A : new q(objM73submitFingerprintBWLJW6A);
    }
}
