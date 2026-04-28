package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.vectordrawable.graphics.drawable.q;
import c5.b;
import com.app.tgtg.R;
import com.braze.h2;
import i20.d;
import i20.e;
import i20.f;
import i20.h;
import i20.j;
import i20.k;
import i20.l;
import i20.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class CircularProgressIndicator extends d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f12527p = 0;

    public CircularProgressIndicator(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        k kVar = (k) this.f22939a;
        f fVar = new f(kVar);
        Context context2 = getContext();
        r rVar = new r(context2, kVar, fVar, kVar.f23005o == 1 ? new j(context2, kVar) : new h(kVar));
        Resources resources = context2.getResources();
        androidx.vectordrawable.graphics.drawable.r rVar2 = new androidx.vectordrawable.graphics.drawable.r();
        ThreadLocal threadLocal = w6.j.f43256a;
        rVar2.f4052a = resources.getDrawable(R.drawable.ic_mtrl_arrow_circle, null);
        new q(rVar2.f4052a.getConstantState());
        rVar.f23054p = rVar2;
        setIndeterminateDrawable(rVar);
        setProgressDrawable(new l(getContext(), kVar, fVar));
        this.f22949k = true;
    }

    @Override // i20.d
    public final e a(Context context, AttributeSet attributeSet) {
        return new k(context, attributeSet);
    }

    public int getIndeterminateAnimationType() {
        return ((k) this.f22939a).f23005o;
    }

    public int getIndicatorDirection() {
        return ((k) this.f22939a).f23008r;
    }

    public int getIndicatorInset() {
        return ((k) this.f22939a).f23007q;
    }

    public int getIndicatorSize() {
        return ((k) this.f22939a).f23006p;
    }

    public void setIndeterminateAnimationType(int i11) {
        e eVar = this.f22939a;
        if (((k) eVar).f23005o == i11) {
            return;
        }
        if (c() && isIndeterminate()) {
            h2.b("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
            return;
        }
        ((k) eVar).f23005o = i11;
        ((k) eVar).d();
        b jVar = i11 == 1 ? new j(getContext(), (k) eVar) : new h((k) eVar);
        r indeterminateDrawable = getIndeterminateDrawable();
        indeterminateDrawable.f23053o = jVar;
        jVar.f7113a = indeterminateDrawable;
        b();
        invalidate();
    }

    public void setIndicatorDirection(int i11) {
        ((k) this.f22939a).f23008r = i11;
        invalidate();
    }

    public void setIndicatorInset(int i11) {
        e eVar = this.f22939a;
        if (((k) eVar).f23007q != i11) {
            ((k) eVar).f23007q = i11;
            invalidate();
        }
    }

    public void setIndicatorSize(int i11) {
        int iMax = Math.max(i11, getTrackThickness() * 2);
        e eVar = this.f22939a;
        if (((k) eVar).f23006p != iMax) {
            ((k) eVar).f23006p = iMax;
            ((k) eVar).d();
            requestLayout();
            invalidate();
        }
    }

    @Override // i20.d
    public void setTrackThickness(int i11) {
        super.setTrackThickness(i11);
        ((k) this.f22939a).d();
    }

    public CircularProgressIndicator(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(@NonNull Context context) {
        this(context, null);
    }
}
