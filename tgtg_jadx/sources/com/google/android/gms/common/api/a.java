package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends e {
    @NonNull
    public f buildClient(@NonNull Context context, @NonNull Looper looper, @NonNull com.google.android.gms.common.internal.i iVar, @NonNull Object obj, @NonNull qz.f fVar, @NonNull qz.n nVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public f buildClient(Context context, Looper looper, com.google.android.gms.common.internal.i iVar, Object obj, m mVar, n nVar) {
        return buildClient(context, looper, iVar, obj, (qz.f) mVar, (qz.n) nVar);
    }
}
