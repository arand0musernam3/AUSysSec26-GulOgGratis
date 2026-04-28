package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class vg extends xg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xg f11971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg f11972d;

    public vg(xg xgVar, xg xgVar2) {
        this.f11971c = xgVar;
        this.f11972d = xgVar2;
    }

    @Override // com.google.android.gms.internal.measurement.xg
    public final void a() {
        xg xgVar = this.f11972d;
        try {
            this.f11971c.a();
        } finally {
            xgVar.a();
        }
    }
}
