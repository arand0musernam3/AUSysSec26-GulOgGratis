package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s6 extends w6 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x5 f11846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a7 f11847g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(a7 a7Var, x5 x5Var, int i11) {
        super(a7Var, true);
        this.f11845e = i11;
        switch (i11) {
            case 1:
                this.f11846f = x5Var;
                Objects.requireNonNull(a7Var);
                this.f11847g = a7Var;
                super(a7Var, true);
                break;
            case 2:
                this.f11846f = x5Var;
                Objects.requireNonNull(a7Var);
                this.f11847g = a7Var;
                super(a7Var, true);
                break;
            default:
                this.f11846f = x5Var;
                Objects.requireNonNull(a7Var);
                this.f11847g = a7Var;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.w6
    public final void a() {
        switch (this.f11845e) {
            case 0:
                a6 a6Var = this.f11847g.f11250f;
                com.google.android.gms.common.internal.i0.h(a6Var);
                a6Var.getGmpAppId(this.f11846f);
                break;
            case 1:
                a6 a6Var2 = this.f11847g.f11250f;
                com.google.android.gms.common.internal.i0.h(a6Var2);
                a6Var2.getCachedAppInstanceId(this.f11846f);
                break;
            case 2:
                a6 a6Var3 = this.f11847g.f11250f;
                com.google.android.gms.common.internal.i0.h(a6Var3);
                a6Var3.generateEventId(this.f11846f);
                break;
            case 3:
                a6 a6Var4 = this.f11847g.f11250f;
                com.google.android.gms.common.internal.i0.h(a6Var4);
                a6Var4.getCurrentScreenName(this.f11846f);
                break;
            default:
                a6 a6Var5 = this.f11847g.f11250f;
                com.google.android.gms.common.internal.i0.h(a6Var5);
                a6Var5.getCurrentScreenClass(this.f11846f);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.w6
    public final void b() {
        switch (this.f11845e) {
            case 0:
                this.f11846f.A(null);
                break;
            case 1:
                this.f11846f.A(null);
                break;
            case 2:
                this.f11846f.A(null);
                break;
            case 3:
                this.f11846f.A(null);
                break;
            default:
                this.f11846f.A(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s6(a7 a7Var, x5 x5Var, int i11, boolean z11) {
        super(a7Var, true);
        this.f11845e = i11;
        this.f11846f = x5Var;
        this.f11847g = a7Var;
    }
}
