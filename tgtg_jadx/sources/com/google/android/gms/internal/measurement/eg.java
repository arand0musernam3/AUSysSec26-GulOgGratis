package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class eg extends v2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11393b;

    public /* synthetic */ eg(int i11) {
        this.f11393b = i11;
    }

    @Override // com.google.android.gms.internal.measurement.v2
    public final /* synthetic */ Object a() {
        switch (this.f11393b) {
            case 0:
                return new fg();
            case 1:
                return new hg();
            case 2:
                return new wg();
            default:
                return new yg();
        }
    }
}
