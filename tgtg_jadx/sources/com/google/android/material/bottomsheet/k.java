package com.google.android.material.bottomsheet;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f12359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WindowInsetsCompat f12360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Window f12361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12362d;

    public k(FrameLayout frameLayout, WindowInsetsCompat windowInsetsCompat) {
        this.f12360b = windowInsetsCompat;
        n20.j jVar = BottomSheetBehavior.B(frameLayout).f12322i;
        ColorStateList backgroundTintList = jVar != null ? jVar.f30345b.f30321d : frameLayout.getBackgroundTintList();
        if (backgroundTintList != null) {
            this.f12359a = Boolean.valueOf(w0.e.C(backgroundTintList.getDefaultColor()));
            return;
        }
        ColorStateList colorStateListM = b6.a.m(frameLayout.getBackground());
        Integer numValueOf = colorStateListM != null ? Integer.valueOf(colorStateListM.getDefaultColor()) : null;
        if (numValueOf != null) {
            this.f12359a = Boolean.valueOf(w0.e.C(numValueOf.intValue()));
        } else {
            this.f12359a = null;
        }
    }

    @Override // com.google.android.material.bottomsheet.c
    public final void a(View view) {
        d(view);
    }

    @Override // com.google.android.material.bottomsheet.c
    public final void b(View view) {
        d(view);
    }

    @Override // com.google.android.material.bottomsheet.c
    public final void c(int i11, View view) {
        d(view);
    }

    public final void d(View view) {
        int top = view.getTop();
        WindowInsetsCompat windowInsetsCompat = this.f12360b;
        if (top < windowInsetsCompat.l()) {
            Window window = this.f12361c;
            if (window != null) {
                Boolean bool = this.f12359a;
                new WindowInsetsControllerCompat(window, window.getDecorView()).d(bool == null ? this.f12362d : bool.booleanValue());
            }
            view.setPadding(view.getPaddingLeft(), windowInsetsCompat.l() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.f12361c;
            if (window2 != null) {
                new WindowInsetsControllerCompat(window2, window2.getDecorView()).d(this.f12362d);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        if (this.f12361c == window) {
            return;
        }
        this.f12361c = window;
        if (window != null) {
            this.f12362d = new WindowInsetsControllerCompat(window, window.getDecorView()).b();
        }
    }
}
