package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.ApiException;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class eb implements o30.b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ eb f11381b = new eb(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ eb f11382c = new eb(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11383a;

    public /* synthetic */ eb(int i11) {
        this.f11383a = i11;
    }

    @Override // o30.b0
    public final ListenableFuture apply(Object obj) {
        switch (this.f11383a) {
            case 0:
                ApiException apiException = (ApiException) obj;
                throw new zzmk(apiException.f11049a.f11059a, apiException.getMessage(), apiException);
            case 1:
                throw null;
            default:
                return o30.o0.d("");
        }
    }
}
