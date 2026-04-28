package com.google.android.gms.common.internal;

import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f11214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qz.j f11215b;

    public y(Intent intent, qz.j jVar) {
        this.f11214a = intent;
        this.f11215b = jVar;
    }

    @Override // com.google.android.gms.common.internal.z
    public final void a() {
        Intent intent = this.f11214a;
        if (intent != null) {
            this.f11215b.startActivityForResult(intent, 2);
        }
    }
}
