package com.google.android.gms.oss.licenses;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzg extends a {
    @Override // com.google.android.gms.common.api.a
    public final /* synthetic */ f buildClient(Context context, Looper looper, i iVar, Object obj, m mVar, n nVar) {
        return new zzl(context, looper, iVar, mVar, nVar);
    }
}
