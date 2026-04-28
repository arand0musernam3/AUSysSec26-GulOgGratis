package com.google.android.material.button;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import bg.t;
import com.app.tgtg.R;
import i20.l;
import k8.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12373a;

    public /* synthetic */ a(int i11) {
        this.f12373a = i11;
    }

    @Override // k8.h
    public final float a(Object obj) {
        switch (this.f12373a) {
            case 0:
                return ((MaterialButton) obj).getDisplayedWidthIncrease();
            default:
                return ((l) obj).f23014q.f23037b * 10000.0f;
        }
    }

    @Override // k8.h
    public final void b(float f11, Object obj) {
        switch (this.f12373a) {
            case 0:
                ((MaterialButton) obj).setDisplayedWidthIncrease(f11);
                break;
            default:
                l lVar = (l) obj;
                lVar.f23014q.f23037b = f11 / 10000.0f;
                lVar.invalidateSelf();
                int i11 = (int) f11;
                if (lVar.f23026b.b(true)) {
                    Context context = lVar.f23025a;
                    if (lVar.f23018u == null) {
                        LinearInterpolator linearInterpolator = k10.a.f25730a;
                        lVar.f23020w = ox.h.Q(context, R.attr.motionEasingStandardInterpolator, linearInterpolator);
                        lVar.f23021x = ox.h.Q(context, R.attr.motionEasingEmphasizedAccelerateInterpolator, linearInterpolator);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        lVar.f23018u = valueAnimator;
                        valueAnimator.setDuration(500L);
                        lVar.f23018u.setFloatValues(0.0f, 1.0f);
                        lVar.f23018u.setInterpolator(null);
                        lVar.f23018u.addUpdateListener(new t(lVar, 7));
                    }
                    float f12 = i11;
                    float f13 = (f12 < 1000.0f || f12 > 9000.0f) ? 0.0f : 1.0f;
                    float f14 = lVar.f23015r;
                    ValueAnimator valueAnimator2 = lVar.f23018u;
                    if (f13 != f14) {
                        if (valueAnimator2.isRunning()) {
                            lVar.f23018u.cancel();
                        }
                        lVar.f23015r = f13;
                        if (f13 != 1.0f) {
                            lVar.f23019v = lVar.f23021x;
                            lVar.f23018u.reverse();
                        } else {
                            lVar.f23019v = lVar.f23020w;
                            lVar.f23018u.start();
                        }
                    } else if (!valueAnimator2.isRunning()) {
                        lVar.f23014q.f23040e = f13;
                        lVar.invalidateSelf();
                    }
                    break;
                }
                break;
        }
    }
}
