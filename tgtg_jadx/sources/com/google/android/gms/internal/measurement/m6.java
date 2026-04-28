package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m6 extends w6 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a7 f11630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f11631g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(a7 a7Var, Boolean bool) {
        super(a7Var, true);
        this.f11629e = 1;
        this.f11631g = bool;
        Objects.requireNonNull(a7Var);
        this.f11630f = a7Var;
    }

    @Override // com.google.android.gms.internal.measurement.w6
    public final void a() {
        switch (this.f11629e) {
            case 0:
                a6 a6Var = this.f11630f.f11250f;
                com.google.android.gms.common.internal.i0.h(a6Var);
                a6Var.setUserProperty("fcm", "_ln", new yz.b(this.f11631g), true, this.f11998a);
                break;
            case 1:
                a6 a6Var2 = this.f11630f.f11250f;
                com.google.android.gms.common.internal.i0.h(a6Var2);
                a6Var2.setMeasurementEnabled(((Boolean) this.f11631g).booleanValue(), this.f11998a);
                break;
            case 2:
                a6 a6Var3 = this.f11630f.f11250f;
                com.google.android.gms.common.internal.i0.h(a6Var3);
                a6Var3.retrieveAndUploadBatches(new r6(this, (o30.m0) this.f11631g));
                break;
            case 3:
                a6 a6Var4 = this.f11630f.f11250f;
                com.google.android.gms.common.internal.i0.h(a6Var4);
                a6Var4.logHealthData(5, "Error with data collection. Data lost.", new yz.b((Exception) this.f11631g), new yz.b(null), new yz.b(null));
                break;
            default:
                a6 a6Var5 = this.f11630f.f11250f;
                com.google.android.gms.common.internal.i0.h(a6Var5);
                a6Var5.registerOnMeasurementEventListener((x6) this.f11631g);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m6(a7 a7Var, Object obj, int i11) {
        super(a7Var, true);
        this.f11629e = i11;
        this.f11631g = obj;
        this.f11630f = a7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(a7 a7Var, Exception exc) {
        super(a7Var, false);
        this.f11629e = 3;
        this.f11631g = exc;
        this.f11630f = a7Var;
    }
}
