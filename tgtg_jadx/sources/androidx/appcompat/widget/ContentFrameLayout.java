package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.view.ViewPropertyAnimatorCompat;
import o.l;
import p.a1;
import p.z0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TypedValue f2027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TypedValue f2028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f2029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TypedValue f2030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f2031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TypedValue f2032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f2033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z0 f2034h;

    public ContentFrameLayout(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f2033g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f2031e == null) {
            this.f2031e = new TypedValue();
        }
        return this.f2031e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f2032f == null) {
            this.f2032f = new TypedValue();
        }
        return this.f2032f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f2029c == null) {
            this.f2029c = new TypedValue();
        }
        return this.f2029c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f2030d == null) {
            this.f2030d = new TypedValue();
        }
        return this.f2030d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f2027a == null) {
            this.f2027a = new TypedValue();
        }
        return this.f2027a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f2028b == null) {
            this.f2028b = new TypedValue();
        }
        return this.f2028b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z0 z0Var = this.f2034h;
        if (z0Var != null) {
            z0Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        a aVar;
        super.onDetachedFromWindow();
        z0 z0Var = this.f2034h;
        if (z0Var != null) {
            androidx.appcompat.app.a aVar2 = (androidx.appcompat.app.a) ((se.d) z0Var).f39013b;
            a1 a1Var = aVar2.f1796r;
            if (a1Var != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) a1Var;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((h) actionBarOverlayLayout.f1965e).f2157a.f2098a;
                if (actionMenuView != null && (aVar = actionMenuView.f1990t) != null) {
                    aVar.g();
                    p.d dVar = aVar.f2138u;
                    if (dVar != null && dVar.b()) {
                        dVar.f31614i.dismiss();
                    }
                }
            }
            if (aVar2.f1801w != null) {
                aVar2.l.getDecorView().removeCallbacks(aVar2.f1802x);
                if (aVar2.f1801w.isShowing()) {
                    try {
                        aVar2.f1801w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                aVar2.f1801w = null;
            }
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = aVar2.f1803y;
            if (viewPropertyAnimatorCompat != null) {
                viewPropertyAnimatorCompat.b();
            }
            l lVar = aVar2.X(0).f25597h;
            if (lVar != null) {
                lVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(z0 z0Var) {
        this.f2034h = z0Var;
    }

    public void setDecorPadding(int i11, int i12, int i13, int i14) {
        this.f2033g.set(i11, i12, i13, i14);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    public ContentFrameLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(@NonNull Context context) {
        this(context, null);
    }
}
