package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import com.braze.h2;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import k10.e;
import k10.f;
import k10.g;
import ub.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f12731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f12732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f12733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f12734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f12735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f12736h;

    public FabTransformationBehavior() {
        this.f12731c = new Rect();
        this.f12732d = new RectF();
        this.f12733e = new RectF();
        this.f12734f = new int[2];
    }

    public static float B(a aVar, f fVar, float f11) {
        long j9 = fVar.f25740a;
        long j11 = fVar.f25741b;
        f fVarF = ((e) aVar.f40981b).f("expansion");
        return k10.a.a(f11, 0.0f, fVar.b().getInterpolation((((fVarF.f25740a + fVarF.f25741b) + 17) - j9) / j11));
    }

    public static Pair y(float f11, float f12, boolean z11, a aVar) {
        f fVarF;
        f fVarF2;
        if (f11 == 0.0f || f12 == 0.0f) {
            fVarF = ((e) aVar.f40981b).f("translationXLinear");
            fVarF2 = ((e) aVar.f40981b).f("translationYLinear");
        } else if ((!z11 || f12 >= 0.0f) && (z11 || f12 <= 0.0f)) {
            fVarF = ((e) aVar.f40981b).f("translationXCurveDownwards");
            fVarF2 = ((e) aVar.f40981b).f("translationYCurveDownwards");
        } else {
            fVarF = ((e) aVar.f40981b).f("translationXCurveUpwards");
            fVarF2 = ((e) aVar.f40981b).f("translationYCurveUpwards");
        }
        return new Pair(fVarF, fVarF2);
    }

    public final float A(View view, View view2, g gVar) {
        RectF rectF = this.f12732d;
        C(view, rectF);
        rectF.offset(this.f12735g, this.f12736h);
        RectF rectF2 = this.f12733e;
        C(view2, rectF2);
        gVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void C(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f12734f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract a D(Context context, boolean z11);

    @Override // com.google.android.material.transformation.ExpandableBehavior, s6.b
    public final boolean f(View view, View view2) {
        if (view.getVisibility() == 8) {
            h2.b("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
            return false;
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // s6.b
    public final void g(s6.e eVar) {
        if (eVar.f38846h == 0) {
            eVar.f38846h = 80;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x034b  */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.AnimatorSet x(android.view.View r28, android.view.View r29, boolean r30, boolean r31) {
        /*
            Method dump skipped, instruction units count: 949
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.x(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public final float z(View view, View view2, g gVar) {
        RectF rectF = this.f12732d;
        C(view, rectF);
        rectF.offset(this.f12735g, this.f12736h);
        RectF rectF2 = this.f12733e;
        C(view2, rectF2);
        gVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12731c = new Rect();
        this.f12732d = new RectF();
        this.f12733e = new RectF();
        this.f12734f = new int[2];
    }
}
