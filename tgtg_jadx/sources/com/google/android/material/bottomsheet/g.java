package com.google.android.material.bottomsheet;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f12354a;

    public g(l lVar) {
        this.f12354a = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l lVar = this.f12354a;
        if (lVar.cancelable && lVar.isShowing() && lVar.shouldWindowCloseOnTouchOutside()) {
            lVar.cancel();
        }
    }
}
