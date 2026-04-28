package com.google.android.material.bottomsheet;

import c5.i2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i2 f12352a;

    public e(i2 i2Var) {
        this.f12352a = i2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i2 i2Var = this.f12352a;
        i2Var.f7254c = false;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) i2Var.f7256e;
        z7.e eVar = bottomSheetBehavior.O;
        if (eVar != null && eVar.g()) {
            i2Var.b(i2Var.f7253b);
        } else if (bottomSheetBehavior.N == 2) {
            bottomSheetBehavior.K(i2Var.f7253b);
        }
    }
}
