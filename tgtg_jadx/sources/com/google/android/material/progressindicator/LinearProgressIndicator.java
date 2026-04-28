package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.app.tgtg.R;
import com.braze.h2;
import i20.d;
import i20.e;
import i20.l;
import i20.p;
import i20.r;
import i20.s;
import i20.t;
import i20.v;
import i20.w;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class LinearProgressIndicator extends d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f12528p = 0;

    public LinearProgressIndicator(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        w wVar = (w) this.f22939a;
        s sVar = new s(wVar);
        sVar.f23055f = 300.0f;
        sVar.f23063o = new Pair(new p(), new p());
        Context context2 = getContext();
        setIndeterminateDrawable(new r(context2, wVar, sVar, wVar.f23083o == 0 ? new t(wVar) : new v(context2, wVar)));
        setProgressDrawable(new l(getContext(), wVar, sVar));
        this.f22949k = true;
    }

    @Override // i20.d
    public final e a(Context context, AttributeSet attributeSet) {
        return new w(context, attributeSet);
    }

    public int getIndeterminateAnimationType() {
        return ((w) this.f22939a).f23083o;
    }

    public int getIndicatorDirection() {
        return ((w) this.f22939a).f23084p;
    }

    public int getTrackInnerCornerRadius() {
        return ((w) this.f22939a).f23088t;
    }

    public Integer getTrackStopIndicatorPadding() {
        return ((w) this.f22939a).f23087s;
    }

    public int getTrackStopIndicatorSize() {
        return ((w) this.f22939a).f23086r;
    }

    @Override // i20.d, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        e eVar = this.f22939a;
        w wVar = (w) eVar;
        boolean z12 = true;
        if (((w) eVar).f23084p != 1 && ((getLayoutDirection() != 1 || ((w) eVar).f23084p != 2) && (getLayoutDirection() != 0 || ((w) eVar).f23084p != 3))) {
            z12 = false;
        }
        wVar.f23085q = z12;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i11, int i12, int i13, int i14) {
        int paddingRight = i11 - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i12 - (getPaddingBottom() + getPaddingTop());
        r indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        l progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i11) {
        e eVar = this.f22939a;
        if (((w) eVar).f23083o == i11) {
            return;
        }
        if (c() && isIndeterminate()) {
            h2.b("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
            return;
        }
        ((w) eVar).f23083o = i11;
        ((w) eVar).d();
        if (i11 == 0) {
            r indeterminateDrawable = getIndeterminateDrawable();
            t tVar = new t((w) eVar);
            indeterminateDrawable.f23053o = tVar;
            tVar.f7113a = indeterminateDrawable;
        } else {
            r indeterminateDrawable2 = getIndeterminateDrawable();
            v vVar = new v(getContext(), (w) eVar);
            indeterminateDrawable2.f23053o = vVar;
            vVar.f7113a = indeterminateDrawable2;
        }
        b();
        invalidate();
    }

    @Override // i20.d
    public void setIndicatorColor(@NonNull int... iArr) {
        super.setIndicatorColor(iArr);
        ((w) this.f22939a).d();
    }

    public void setIndicatorDirection(int i11) {
        e eVar = this.f22939a;
        ((w) eVar).f23084p = i11;
        w wVar = (w) eVar;
        boolean z11 = true;
        if (i11 != 1 && ((getLayoutDirection() != 1 || ((w) eVar).f23084p != 2) && (getLayoutDirection() != 0 || i11 != 3))) {
            z11 = false;
        }
        wVar.f23085q = z11;
        invalidate();
    }

    @Override // i20.d
    public void setProgressCompat(int i11, boolean z11) {
        e eVar = this.f22939a;
        if (eVar != null && ((w) eVar).f23083o == 0 && isIndeterminate()) {
            return;
        }
        super.setProgressCompat(i11, z11);
    }

    @Override // i20.d
    public void setTrackCornerRadius(int i11) {
        super.setTrackCornerRadius(i11);
        ((w) this.f22939a).d();
        invalidate();
    }

    public void setTrackInnerCornerRadius(int i11) {
        e eVar = this.f22939a;
        if (((w) eVar).f23088t != i11) {
            ((w) eVar).f23088t = Math.round(Math.min(i11, ((w) eVar).f22953a / 2.0f));
            ((w) eVar).f23090v = false;
            ((w) eVar).f23091w = true;
            ((w) eVar).d();
            invalidate();
        }
    }

    public void setTrackInnerCornerRadiusFraction(float f11) {
        e eVar = this.f22939a;
        if (((w) eVar).f23089u != f11) {
            ((w) eVar).f23089u = Math.min(f11, 0.5f);
            ((w) eVar).f23090v = true;
            ((w) eVar).f23091w = true;
            ((w) eVar).d();
            invalidate();
        }
    }

    public void setTrackStopIndicatorPadding(Integer num) {
        e eVar = this.f22939a;
        if (Objects.equals(((w) eVar).f23087s, num)) {
            return;
        }
        ((w) eVar).f23087s = num;
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i11) {
        e eVar = this.f22939a;
        if (((w) eVar).f23086r != i11) {
            ((w) eVar).f23086r = Math.min(i11, ((w) eVar).f22953a);
            ((w) eVar).d();
            invalidate();
        }
    }

    public LinearProgressIndicator(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(@NonNull Context context) {
        this(context, null);
    }
}
