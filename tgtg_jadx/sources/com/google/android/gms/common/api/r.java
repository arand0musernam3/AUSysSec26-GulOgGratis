package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends BasePendingResult {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Status f11089k;

    public r(Status status) {
        super(null);
        this.f11089k = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final p b(Status status) {
        return this.f11089k;
    }
}
