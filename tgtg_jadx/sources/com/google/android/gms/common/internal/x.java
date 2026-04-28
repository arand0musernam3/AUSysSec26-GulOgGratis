package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f11211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f11212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11213c;

    public x(Activity activity, Intent intent, int i11) {
        this.f11211a = intent;
        this.f11212b = activity;
        this.f11213c = i11;
    }

    @Override // com.google.android.gms.common.internal.z
    public final void a() {
        Intent intent = this.f11211a;
        if (intent != null) {
            this.f11212b.startActivityForResult(intent, this.f11213c);
        }
    }
}
