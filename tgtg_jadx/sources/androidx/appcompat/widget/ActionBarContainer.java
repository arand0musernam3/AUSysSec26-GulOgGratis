package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.app.tgtg.R;
import fd.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f1933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f1934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f1935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f1936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f1937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f1938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f1939h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1940i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f1941j;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z11 = true;
        setBackground(new m(this, 1));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f24253a);
        this.f1936e = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f1937f = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f1941j = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f1939h = true;
            this.f1938g = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f1939h ? this.f1936e != null || this.f1937f != null : this.f1938g != null) {
            z11 = false;
        }
        setWillNotDraw(z11);
    }

    public static int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1936e;
        if (drawable != null && drawable.isStateful()) {
            this.f1936e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1937f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1937f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1938g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1938g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f1933b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1936e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1937f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1938g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1934c = findViewById(R.id.action_bar);
        this.f1935d = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1932a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[PHI: r1
      0x0049: PHI (r1v8 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v0 boolean) binds: [B:31:0x00a6, B:33:0x00aa, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
        /*
            r5 = this;
            super.onLayout(r6, r7, r8, r9, r10)
            r6 = r5
            androidx.appcompat.widget.b r8 = r6.f1933b
            r10 = 8
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L14
            int r2 = r8.getVisibility()
            if (r2 == r10) goto L14
            r2 = r0
            goto L15
        L14:
            r2 = r1
        L15:
            if (r8 == 0) goto L34
            int r3 = r8.getVisibility()
            if (r3 == r10) goto L34
            int r10 = r5.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r4 = r8.getMeasuredHeight()
            int r4 = r10 - r4
            int r3 = r3.bottomMargin
            int r4 = r4 - r3
            int r10 = r10 - r3
            r8.layout(r7, r4, r9, r10)
        L34:
            boolean r7 = r6.f1939h
            if (r7 == 0) goto L4c
            android.graphics.drawable.Drawable r7 = r6.f1938g
            if (r7 == 0) goto L49
            int r8 = r5.getMeasuredWidth()
            int r9 = r5.getMeasuredHeight()
            r7.setBounds(r1, r1, r8, r9)
            goto Lbf
        L49:
            r0 = r1
            goto Lbf
        L4c:
            android.graphics.drawable.Drawable r7 = r6.f1936e
            if (r7 == 0) goto La4
            android.view.View r7 = r6.f1934c
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L76
            android.graphics.drawable.Drawable r7 = r6.f1936e
            android.view.View r9 = r6.f1934c
            int r9 = r9.getLeft()
            android.view.View r10 = r6.f1934c
            int r10 = r10.getTop()
            android.view.View r1 = r6.f1934c
            int r1 = r1.getRight()
            android.view.View r3 = r6.f1934c
            int r3 = r3.getBottom()
            r7.setBounds(r9, r10, r1, r3)
            goto La3
        L76:
            android.view.View r7 = r6.f1935d
            if (r7 == 0) goto L9e
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L9e
            android.graphics.drawable.Drawable r7 = r6.f1936e
            android.view.View r9 = r6.f1935d
            int r9 = r9.getLeft()
            android.view.View r10 = r6.f1935d
            int r10 = r10.getTop()
            android.view.View r1 = r6.f1935d
            int r1 = r1.getRight()
            android.view.View r3 = r6.f1935d
            int r3 = r3.getBottom()
            r7.setBounds(r9, r10, r1, r3)
            goto La3
        L9e:
            android.graphics.drawable.Drawable r7 = r6.f1936e
            r7.setBounds(r1, r1, r1, r1)
        La3:
            r1 = r0
        La4:
            r6.f1940i = r2
            if (r2 == 0) goto L49
            android.graphics.drawable.Drawable r7 = r6.f1937f
            if (r7 == 0) goto L49
            int r9 = r8.getLeft()
            int r10 = r8.getTop()
            int r1 = r8.getRight()
            int r8 = r8.getBottom()
            r7.setBounds(r9, r10, r1, r8)
        Lbf:
            if (r0 == 0) goto Lc4
            r5.invalidate()
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        int iA;
        int i13;
        if (this.f1934c == null && View.MeasureSpec.getMode(i12) == Integer.MIN_VALUE && (i13 = this.f1941j) >= 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(Math.min(i13, View.MeasureSpec.getSize(i12)), Integer.MIN_VALUE);
        }
        super.onMeasure(i11, i12);
        if (this.f1934c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i12);
        b bVar = this.f1933b;
        if (bVar == null || bVar.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        View view = this.f1934c;
        if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0) {
            View view2 = this.f1935d;
            iA = (view2 == null || view2.getVisibility() == 8 || view2.getMeasuredHeight() == 0) ? 0 : a(this.f1935d);
        } else {
            iA = a(this.f1934c);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f1933b) + iA, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i12) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1936e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1936e);
        }
        this.f1936e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1934c;
            if (view != null) {
                this.f1936e.setBounds(view.getLeft(), this.f1934c.getTop(), this.f1934c.getRight(), this.f1934c.getBottom());
            }
        }
        boolean z11 = false;
        if (!this.f1939h ? !(this.f1936e != null || this.f1937f != null) : this.f1938g == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1938g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1938g);
        }
        this.f1938g = drawable;
        boolean z11 = this.f1939h;
        boolean z12 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z11 && (drawable2 = this.f1938g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z11 ? !(this.f1936e != null || this.f1937f != null) : this.f1938g == null) {
            z12 = true;
        }
        setWillNotDraw(z12);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1937f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1937f);
        }
        this.f1937f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1940i && (drawable2 = this.f1937f) != null) {
                drawable2.setBounds(this.f1933b.getLeft(), this.f1933b.getTop(), this.f1933b.getRight(), this.f1933b.getBottom());
            }
        }
        boolean z11 = false;
        if (!this.f1939h ? !(this.f1936e != null || this.f1937f != null) : this.f1938g == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(b bVar) {
        b bVar2 = this.f1933b;
        if (bVar2 != null) {
            removeView(bVar2);
        }
        this.f1933b = bVar;
        if (bVar != null) {
            addView(bVar);
            ViewGroup.LayoutParams layoutParams = bVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            bVar.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z11) {
        this.f1932a = z11;
        setDescendantFocusability(z11 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        boolean z11 = i11 == 0;
        Drawable drawable = this.f1936e;
        if (drawable != null) {
            drawable.setVisible(z11, false);
        }
        Drawable drawable2 = this.f1937f;
        if (drawable2 != null) {
            drawable2.setVisible(z11, false);
        }
        Drawable drawable3 = this.f1938g;
        if (drawable3 != null) {
            drawable3.setVisible(z11, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i11) {
        if (i11 != 0) {
            return super.startActionModeForChild(view, callback, i11);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1936e;
        boolean z11 = this.f1939h;
        if (drawable == drawable2 && !z11) {
            return true;
        }
        if (drawable == this.f1937f && this.f1940i) {
            return true;
        }
        return (drawable == this.f1938g && z11) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }
}
