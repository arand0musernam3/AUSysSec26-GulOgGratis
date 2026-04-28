package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o6 extends w6 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f11694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f11695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a7 f11696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f11697i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(a7 a7Var, l6 l6Var, String str, String str2) {
        super(a7Var, true);
        this.f11693e = 2;
        this.f11697i = l6Var;
        this.f11694f = str;
        this.f11695g = str2;
        Objects.requireNonNull(a7Var);
        this.f11696h = a7Var;
    }

    @Override // com.google.android.gms.internal.measurement.w6
    public final void a() {
        switch (this.f11693e) {
            case 0:
                a6 a6Var = this.f11696h.f11250f;
                com.google.android.gms.common.internal.i0.h(a6Var);
                a6Var.clearConditionalUserProperty(this.f11694f, this.f11695g, (Bundle) this.f11697i);
                break;
            case 1:
                a6 a6Var2 = this.f11696h.f11250f;
                com.google.android.gms.common.internal.i0.h(a6Var2);
                a6Var2.getConditionalUserProperties(this.f11694f, this.f11695g, (x5) this.f11697i);
                break;
            default:
                a6 a6Var3 = this.f11696h.f11250f;
                com.google.android.gms.common.internal.i0.h(a6Var3);
                a6Var3.setCurrentScreenByScionActivityInfo((l6) this.f11697i, this.f11694f, this.f11695g, this.f11998a);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.w6
    public void b() {
        switch (this.f11693e) {
            case 1:
                ((x5) this.f11697i).A(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o6(a7 a7Var, String str, String str2, Object obj, int i11) {
        super(a7Var, true);
        this.f11693e = i11;
        this.f11694f = str;
        this.f11695g = str2;
        this.f11697i = obj;
        this.f11696h = a7Var;
    }
}
