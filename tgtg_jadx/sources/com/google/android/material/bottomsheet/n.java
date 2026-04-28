package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.WindowInsetsAnimationCompat$Callback;
import androidx.core.view.WindowInsetsCompat;
import h7.f1;
import h7.h2;
import h7.o1;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends WindowInsetsAnimationCompat$Callback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f12363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f12366f;

    public n(View view) {
        super(0);
        this.f12366f = new int[2];
        this.f12363c = view;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final void b(o1 o1Var) {
        this.f12363c.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final void c(o1 o1Var) {
        View view = this.f12363c;
        int[] iArr = this.f12366f;
        view.getLocationOnScreen(iArr);
        this.f12364d = iArr[1];
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final WindowInsetsCompat d(WindowInsetsCompat windowInsetsCompat, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((o1) it.next()).f21602a.d() & h2.c()) != 0) {
                this.f12363c.setTranslationY(k10.a.c(this.f12365e, r0.f21602a.c(), 0));
                break;
            }
        }
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final f1 e(o1 o1Var, f1 f1Var) {
        View view = this.f12363c;
        int[] iArr = this.f12366f;
        view.getLocationOnScreen(iArr);
        int i11 = this.f12364d - iArr[1];
        this.f12365e = i11;
        view.setTranslationY(i11);
        return f1Var;
    }
}
