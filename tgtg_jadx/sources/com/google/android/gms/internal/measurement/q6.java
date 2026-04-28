package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q6 extends w6 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f11784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a7 f11785g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(a7 a7Var, String str, int i11) {
        super(a7Var, true);
        this.f11783e = i11;
        switch (i11) {
            case 1:
                this.f11784f = str;
                Objects.requireNonNull(a7Var);
                this.f11785g = a7Var;
                super(a7Var, true);
                break;
            default:
                this.f11784f = str;
                Objects.requireNonNull(a7Var);
                this.f11785g = a7Var;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.w6
    public final void a() {
        switch (this.f11783e) {
            case 0:
                a6 a6Var = this.f11785g.f11250f;
                com.google.android.gms.common.internal.i0.h(a6Var);
                a6Var.beginAdUnitExposure(this.f11784f, this.f11999b);
                break;
            default:
                a6 a6Var2 = this.f11785g.f11250f;
                com.google.android.gms.common.internal.i0.h(a6Var2);
                a6Var2.endAdUnitExposure(this.f11784f, this.f11999b);
                break;
        }
    }
}
