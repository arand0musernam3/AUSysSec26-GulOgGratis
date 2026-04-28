package com.google.android.gms.internal.measurement;

import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y6 extends w6 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Activity f12056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z6 f12057g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(z6 z6Var, Activity activity, int i11) {
        super(z6Var.f12082a, true);
        this.f12055e = i11;
        switch (i11) {
            case 1:
                this.f12056f = activity;
                this.f12057g = z6Var;
                super(z6Var.f12082a, true);
                break;
            case 2:
                this.f12056f = activity;
                this.f12057g = z6Var;
                super(z6Var.f12082a, true);
                break;
            case 3:
                this.f12056f = activity;
                this.f12057g = z6Var;
                super(z6Var.f12082a, true);
                break;
            case 4:
                this.f12056f = activity;
                this.f12057g = z6Var;
                super(z6Var.f12082a, true);
                break;
            default:
                this.f12056f = activity;
                this.f12057g = z6Var;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.w6
    public final void a() {
        switch (this.f12055e) {
            case 0:
                a6 a6Var = this.f12057g.f12082a.f11250f;
                com.google.android.gms.common.internal.i0.h(a6Var);
                a6Var.onActivityStartedByScionActivityInfo(l6.d(this.f12056f), this.f11999b);
                break;
            case 1:
                a6 a6Var2 = this.f12057g.f12082a.f11250f;
                com.google.android.gms.common.internal.i0.h(a6Var2);
                a6Var2.onActivityResumedByScionActivityInfo(l6.d(this.f12056f), this.f11999b);
                break;
            case 2:
                a6 a6Var3 = this.f12057g.f12082a.f11250f;
                com.google.android.gms.common.internal.i0.h(a6Var3);
                a6Var3.onActivityPausedByScionActivityInfo(l6.d(this.f12056f), this.f11999b);
                break;
            case 3:
                a6 a6Var4 = this.f12057g.f12082a.f11250f;
                com.google.android.gms.common.internal.i0.h(a6Var4);
                a6Var4.onActivityStoppedByScionActivityInfo(l6.d(this.f12056f), this.f11999b);
                break;
            default:
                a6 a6Var5 = this.f12057g.f12082a.f11250f;
                com.google.android.gms.common.internal.i0.h(a6Var5);
                a6Var5.onActivityDestroyedByScionActivityInfo(l6.d(this.f12056f), this.f11999b);
                break;
        }
    }
}
