package i20;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import com.app.tgtg.R;
import e20.i0;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d extends ProgressBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f22939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f22942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f22945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f22946h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f22947i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22948j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f22949k;
    public final b l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f22950m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f22951n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f22952o;

    public d(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(v20.a.a(context, attributeSet, i11, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i11);
        this.f22945g = -1L;
        this.f22947i = false;
        this.f22948j = 4;
        this.l = new b(this, 0);
        this.f22950m = new b(this, 1);
        this.f22951n = new c(0, this);
        this.f22952o = new c(1, this);
        Context context2 = getContext();
        this.f22939a = a(context2, attributeSet);
        TypedArray typedArrayM = i0.m(context2, attributeSet, j10.a.f24409d, i11, i12, new int[0]);
        this.f22943e = typedArrayM.getInt(7, -1);
        this.f22944f = Math.min(typedArrayM.getInt(5, -1), 1000);
        typedArrayM.recycle();
        this.f22946h = new a();
        this.f22942d = true;
    }

    private q getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().f23052n;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().f23011n;
    }

    public abstract e a(Context context, AttributeSet attributeSet);

    public final void b() {
        if (getProgressDrawable() == null || getIndeterminateDrawable() == null) {
            return;
        }
        getIndeterminateDrawable().f23053o.u(this.f22951n);
    }

    public final boolean c() {
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f22939a.f22960h;
    }

    @Override // android.widget.ProgressBar
    public r getIndeterminateDrawable() {
        return (r) super.getIndeterminateDrawable();
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.f22939a.f22957e;
    }

    public int getIndicatorTrackGapSize() {
        return this.f22939a.f22961i;
    }

    @Override // android.widget.ProgressBar
    public l getProgressDrawable() {
        return (l) super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.f22939a.f22959g;
    }

    public int getTrackColor() {
        return this.f22939a.f22958f;
    }

    public int getTrackCornerRadius() {
        return this.f22939a.f22954b;
    }

    public float getTrackCornerRadiusFraction() {
        return this.f22939a.f22955c;
    }

    public int getTrackThickness() {
        return this.f22939a.f22953a;
    }

    public int getWaveAmplitude() {
        return this.f22939a.l;
    }

    public int getWaveSpeed() {
        return this.f22939a.f22964m;
    }

    public int getWavelengthDeterminate() {
        return this.f22939a.f22962j;
    }

    public int getWavelengthIndeterminate() {
        return this.f22939a.f22963k;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        l progressDrawable = getProgressDrawable();
        c cVar = this.f22952o;
        if (progressDrawable != null) {
            l progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.f23031g == null) {
                progressDrawable2.f23031g = new ArrayList();
            }
            if (!progressDrawable2.f23031g.contains(cVar)) {
                progressDrawable2.f23031g.add(cVar);
            }
        }
        if (getIndeterminateDrawable() != null) {
            r indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.f23031g == null) {
                indeterminateDrawable.f23031g = new ArrayList();
            }
            if (!indeterminateDrawable.f23031g.contains(cVar)) {
                indeterminateDrawable.f23031g.add(cVar);
            }
        }
        if (c()) {
            if (this.f22944f > 0) {
                this.f22945g = SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f22950m);
        removeCallbacks(this.l);
        ((n) getCurrentDrawable()).d(false, false, false);
        r indeterminateDrawable = getIndeterminateDrawable();
        c cVar = this.f22952o;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().f(cVar);
            getIndeterminateDrawable().f23053o.y();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().f(cVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        getCurrentDrawingDelegate().g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i11, int i12) {
        try {
            q currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i11) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i12) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i11) {
        super.onVisibilityChanged(view, i11);
        boolean z11 = i11 == 0;
        if (this.f22942d) {
            ((n) getCurrentDrawable()).d(c(), false, z11);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i11) {
        super.onWindowVisibilityChanged(i11);
        if (this.f22942d) {
            ((n) getCurrentDrawable()).d(c(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(@NonNull a aVar) {
        this.f22946h = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f23027c = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f23027c = aVar;
        }
    }

    public void setHideAnimationBehavior(int i11) {
        this.f22939a.f22960h = i11;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z11) {
        try {
            if (z11 == isIndeterminate()) {
                return;
            }
            n nVar = (n) getCurrentDrawable();
            if (nVar != null) {
                nVar.d(false, false, false);
            }
            super.setIndeterminate(z11);
            n nVar2 = (n) getCurrentDrawable();
            if (nVar2 != null) {
                nVar2.d(c(), false, false);
            }
            if ((nVar2 instanceof r) && c()) {
                ((r) nVar2).f23053o.x();
            }
            this.f22947i = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void setIndeterminateAnimatorDurationScale(float f11) {
        e eVar = this.f22939a;
        if (eVar.f22965n != f11) {
            eVar.f22965n = f11;
            getIndeterminateDrawable().f23053o.m();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof r) {
            ((n) drawable).d(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else if (this.f22949k) {
            i4.a.f("Cannot set framework drawable as indeterminate drawable.");
        } else {
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{w0.e.z(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f22939a.f22957e = iArr;
        getIndeterminateDrawable().f23053o.m();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i11) {
        e eVar = this.f22939a;
        if (eVar.f22961i != i11) {
            eVar.f22961i = i11;
            eVar.d();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i11) {
        if (isIndeterminate()) {
            return;
        }
        setProgressCompat(i11, false);
    }

    public void setProgressCompat(int i11, boolean z11) {
        if (!isIndeterminate()) {
            super.setProgress(i11);
            if (getProgressDrawable() == null || z11) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f22940b = i11;
            this.f22941c = z11;
            this.f22947i = true;
            if (getIndeterminateDrawable().isVisible()) {
                a aVar = this.f22946h;
                ContentResolver contentResolver = getContext().getContentResolver();
                aVar.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().f23053o.v();
                    return;
                }
            }
            this.f22951n.onAnimationEnd(getIndeterminateDrawable());
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable instanceof l) {
            l lVar = (l) drawable;
            lVar.d(false, false, false);
            super.setProgressDrawable(lVar);
            lVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
            return;
        }
        if (this.f22949k) {
            i4.a.f("Cannot set framework drawable as progress drawable.");
        } else {
            super.setProgressDrawable(drawable);
        }
    }

    public void setShowAnimationBehavior(int i11) {
        this.f22939a.f22959g = i11;
        invalidate();
    }

    public void setTrackColor(int i11) {
        e eVar = this.f22939a;
        if (eVar.f22958f != i11) {
            eVar.f22958f = i11;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i11) {
        e eVar = this.f22939a;
        if (eVar.f22954b != i11) {
            eVar.f22954b = Math.min(i11, eVar.f22953a / 2);
            eVar.f22956d = false;
            invalidate();
        }
    }

    public void setTrackCornerRadiusFraction(float f11) {
        e eVar = this.f22939a;
        if (eVar.f22955c != f11) {
            eVar.f22955c = Math.min(f11, 0.5f);
            eVar.f22956d = true;
            invalidate();
        }
    }

    public void setTrackThickness(int i11) {
        e eVar = this.f22939a;
        if (eVar.f22953a != i11) {
            eVar.f22953a = i11;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i11) {
        if (i11 == 0 || i11 == 4 || i11 == 8) {
            this.f22948j = i11;
        } else {
            i4.a.f("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
    }

    public void setWaveAmplitude(int i11) {
        e eVar = this.f22939a;
        if (eVar.l != i11) {
            eVar.l = Math.abs(i11);
            requestLayout();
        }
    }

    public void setWaveSpeed(int i11) {
        e eVar = this.f22939a;
        eVar.f22964m = i11;
        l progressDrawable = getProgressDrawable();
        boolean z11 = eVar.f22964m != 0;
        ValueAnimator valueAnimator = progressDrawable.f23017t;
        if (z11 && !valueAnimator.isRunning()) {
            valueAnimator.start();
        } else {
            if (z11 || !valueAnimator.isRunning()) {
                return;
            }
            valueAnimator.cancel();
        }
    }

    public void setWavelength(int i11) {
        setWavelengthDeterminate(i11);
        setWavelengthIndeterminate(i11);
    }

    public void setWavelengthDeterminate(int i11) {
        e eVar = this.f22939a;
        if (eVar.f22962j != i11) {
            eVar.f22962j = Math.abs(i11);
            if (isIndeterminate()) {
                return;
            }
            requestLayout();
        }
    }

    public void setWavelengthIndeterminate(int i11) {
        e eVar = this.f22939a;
        if (eVar.f22963k != i11) {
            eVar.f22963k = Math.abs(i11);
            if (isIndeterminate()) {
                requestLayout();
            }
        }
    }
}
