package e20;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class b0 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f15584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f15585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f15586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15590g;

    public b0(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f15586c = new Rect();
        this.f15587d = true;
        this.f15588e = true;
        this.f15589f = true;
        this.f15590g = true;
        TypedArray typedArrayM = i0.m(context, attributeSet, j10.a.P, i11, R.style.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f15584a = typedArrayM.getDrawable(0);
        typedArrayM.recycle();
        setWillNotDraw(true);
        ViewCompat.k0(this, new se.d(this, 14));
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f15585b == null || this.f15584a == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        boolean z11 = this.f15587d;
        Rect rect = this.f15586c;
        if (z11) {
            rect.set(0, 0, width, this.f15585b.top);
            this.f15584a.setBounds(rect);
            this.f15584a.draw(canvas);
        }
        if (this.f15588e) {
            rect.set(0, height - this.f15585b.bottom, width, height);
            this.f15584a.setBounds(rect);
            this.f15584a.draw(canvas);
        }
        if (this.f15589f) {
            Rect rect2 = this.f15585b;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f15584a.setBounds(rect);
            this.f15584a.draw(canvas);
        }
        if (this.f15590g) {
            Rect rect3 = this.f15585b;
            rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
            this.f15584a.setBounds(rect);
            this.f15584a.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f15584a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f15584a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z11) {
        this.f15588e = z11;
    }

    public void setDrawLeftInsetForeground(boolean z11) {
        this.f15589f = z11;
    }

    public void setDrawRightInsetForeground(boolean z11) {
        this.f15590g = z11;
    }

    public void setDrawTopInsetForeground(boolean z11) {
        this.f15587d = z11;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f15584a = drawable;
    }

    public void e(WindowInsetsCompat windowInsetsCompat) {
    }

    public b0(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b0(@NonNull Context context) {
        this(context, null);
    }
}
