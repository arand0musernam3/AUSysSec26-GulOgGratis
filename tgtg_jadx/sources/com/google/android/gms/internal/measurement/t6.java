package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t6 extends w6 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11869e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f11870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f11871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f11872h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a7 f11873i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f11874j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(a7 a7Var, String str, String str2, Bundle bundle, boolean z11) {
        super(a7Var, true);
        this.f11870f = str;
        this.f11871g = str2;
        this.f11874j = bundle;
        this.f11872h = z11;
        this.f11873i = a7Var;
    }

    @Override // com.google.android.gms.internal.measurement.w6
    public final void a() {
        switch (this.f11869e) {
            case 0:
                a6 a6Var = this.f11873i.f11250f;
                com.google.android.gms.common.internal.i0.h(a6Var);
                a6Var.getUserProperties(this.f11870f, this.f11871g, this.f11872h, (x5) this.f11874j);
                break;
            default:
                long j9 = this.f11998a;
                long j11 = this.f11999b;
                a6 a6Var2 = this.f11873i.f11250f;
                com.google.android.gms.common.internal.i0.h(a6Var2);
                a6Var2.logEventWithElapsedTime(this.f11870f, this.f11871g, (Bundle) this.f11874j, this.f11872h, true, j9, j11);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.w6
    public void b() {
        switch (this.f11869e) {
            case 0:
                ((x5) this.f11874j).A(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(a7 a7Var, String str, String str2, boolean z11, x5 x5Var) {
        super(a7Var, true);
        this.f11870f = str;
        this.f11871g = str2;
        this.f11872h = z11;
        this.f11874j = x5Var;
        this.f11873i = a7Var;
    }
}
