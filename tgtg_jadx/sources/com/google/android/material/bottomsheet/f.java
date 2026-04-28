package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import h7.w;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f12353a;

    public f(l lVar) {
        this.f12353a = lVar;
    }

    @Override // h7.w
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        l lVar = this.f12353a;
        if (lVar.edgeToEdgeCallback != null) {
            BottomSheetBehavior bottomSheetBehavior = lVar.behavior;
            bottomSheetBehavior.t0.remove(lVar.edgeToEdgeCallback);
        }
        if (windowInsetsCompat != null) {
            lVar.edgeToEdgeCallback = new k(lVar.bottomSheet, windowInsetsCompat);
            lVar.edgeToEdgeCallback.e(lVar.getWindow());
            BottomSheetBehavior bottomSheetBehavior2 = lVar.behavior;
            k kVar = lVar.edgeToEdgeCallback;
            ArrayList arrayList = bottomSheetBehavior2.t0;
            if (!arrayList.contains(kVar)) {
                arrayList.add(kVar);
            }
        }
        return windowInsetsCompat;
    }
}
