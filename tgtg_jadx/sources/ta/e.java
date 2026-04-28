package ta;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.braze.h2;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Collections;
import oz.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class e extends ViewGroup {
    public static final int[] K = {R.attr.layout_gravity};
    public static final b L = new b(0);
    public static final i M = new i();
    public boolean A;
    public boolean B;
    public int C;
    public ArrayList D;
    public f E;
    public ArrayList F;
    public int G;
    public ArrayList H;
    public final a8.f I;
    public int J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f39890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f39891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f39892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f39893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Scroller f39894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f39895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f39896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f39897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f39898i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f39899j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f39900k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f39901m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f39902n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f39903o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f39904p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f39905q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f39906r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f39907s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f39908t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f39909u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f39910v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public VelocityTracker f39911w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f39912x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public EdgeEffect f39913y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public EdgeEffect f39914z;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class a extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f39915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f39916b;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.K);
            this.f39916b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public e(@NonNull Context context) {
        super(context);
        this.f39890a = new ArrayList();
        this.f39891b = new d();
        this.f39892c = new Rect();
        this.f39893d = null;
        this.f39897h = -3.4028235E38f;
        this.f39898i = Float.MAX_VALUE;
        this.f39901m = 1;
        this.f39910v = -1;
        this.A = true;
        this.I = new a8.f(this, 15);
        this.J = 0;
        f();
    }

    public static boolean b(int i11, int i12, int i13, View view, boolean z11) {
        int i14;
        if (!(view instanceof ViewGroup)) {
            return z11 ? false : false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int scrollX = view.getScrollX();
        int scrollY = view.getScrollY();
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            int i15 = i12 + scrollX;
            if (i15 >= childAt.getLeft() && i15 < childAt.getRight() && (i14 = i13 + scrollY) >= childAt.getTop() && i14 < childAt.getBottom() && b(i11, i15 - childAt.getLeft(), i14 - childAt.getTop(), childAt, true)) {
                break;
            }
        }
        if (z11 || !view.canScrollHorizontally(-i11)) {
        }
        return true;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z11) {
        if (this.l != z11) {
            this.l = z11;
        }
    }

    public final boolean a(int i11) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            for (ViewParent parent = viewFindFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                if (parent == this) {
                    break;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(viewFindFocus.getClass().getSimpleName());
            for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                sb2.append(" => ");
                sb2.append(parent2.getClass().getSimpleName());
            }
            Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view ".concat(sb2.toString()));
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i11);
        boolean zRequestFocus = false;
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            Rect rect = this.f39892c;
            if (i11 == 17) {
                int i12 = d(viewFindNextFocus, rect).left;
                int i13 = d(viewFindFocus, rect).left;
                if (viewFindFocus == null || i12 < i13) {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                }
            } else if (i11 == 66) {
                int i14 = d(viewFindNextFocus, rect).left;
                int i15 = d(viewFindFocus, rect).left;
                if (viewFindFocus == null || i14 > i15) {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                }
            }
        } else if (i11 != 17) {
        }
        if (zRequestFocus) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i11));
        }
        return zRequestFocus;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i11, int i12) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                if (getChildAt(i13).getVisibility() == 0) {
                    e();
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i12 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11).getVisibility() == 0) {
                e();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        a aVar = (a) layoutParams;
        boolean z11 = aVar.f39915a | (view.getClass().getAnnotation(c.class) != null);
        aVar.f39915a = z11;
        if (!this.f39900k) {
            super.addView(view, i11, layoutParams);
        } else if (z11) {
            h2.b("Cannot add pager decor view during layout");
        } else {
            addViewInLayout(view, i11, layoutParams);
        }
    }

    public final void c(boolean z11) {
        int i11 = 0;
        boolean z12 = this.J == 2;
        if (z12) {
            setScrollingCacheEnabled(false);
            if (!this.f39894e.isFinished()) {
                this.f39894e.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f39894e.getCurrX();
                int currY = this.f39894e.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        h(currX);
                    }
                }
            }
        }
        while (true) {
            ArrayList arrayList = this.f39890a;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((d) arrayList.get(i11)).getClass();
            i11++;
        }
        if (z12) {
            a8.f fVar = this.I;
            if (z11) {
                ViewCompat.U(this, fVar);
            } else {
                fVar.run();
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i11) {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof a) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.f39894e.isFinished() || !this.f39894e.computeScrollOffset()) {
            c(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f39894e.getCurrX();
        int currY = this.f39894e.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!h(currX)) {
                this.f39894e.abortAnimation();
                scrollTo(0, currY);
            }
        }
        ViewCompat.T(this);
    }

    public final Rect d(View view, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L56
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L3c
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L45
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L3c
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.a(r4)
            goto L52
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L3c
            boolean r6 = r5.a(r1)
            goto L52
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L3e
        L3c:
            r6 = r2
            goto L52
        L3e:
            r6 = 66
            boolean r6 = r5.a(r6)
            goto L52
        L45:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L4c
            goto L3c
        L4c:
            r6 = 17
            boolean r6 = r5.a(r6)
        L52:
            if (r6 == 0) goto L55
            goto L56
        L55:
            return r2
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ta.e.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            if (getChildAt(i11).getVisibility() == 0) {
                e();
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        EdgeEffect edgeEffect = this.f39913y;
        boolean zDraw = false;
        if (overScrollMode != 0) {
            edgeEffect.finish();
            this.f39914z.finish();
        } else {
            if (!edgeEffect.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f39897h * width);
                this.f39913y.setSize(height, width);
                zDraw = this.f39913y.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.f39914z.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f39898i + 1.0f)) * width2);
                this.f39914z.setSize(height2, width2);
                zDraw |= this.f39914z.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        }
        if (zDraw) {
            ViewCompat.T(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f39896g;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e() {
        ArrayList arrayList = this.f39890a;
        if (arrayList.size() <= 0) {
            return;
        }
        ((d) arrayList.get(0)).getClass();
        throw null;
    }

    public final void f() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f39894e = new Scroller(context, L);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f11 = context.getResources().getDisplayMetrics().density;
        this.f39906r = viewConfiguration.getScaledPagingTouchSlop();
        viewConfiguration.getScaledMaximumFlingVelocity();
        this.f39913y = new EdgeEffect(context);
        this.f39914z = new EdgeEffect(context);
        this.f39912x = (int) (2.0f * f11);
        this.f39904p = (int) (f11 * 16.0f);
        ViewCompat.b0(this, new j8.c(this));
        if (ViewCompat.q(this) == 0) {
            ViewCompat.i0(this, 1);
        }
        ViewCompat.k0(this, new m(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r14 = r11.C
            r0 = 0
            r1 = 1
            if (r14 <= 0) goto L6c
            int r14 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = r0
        L1b:
            if (r6 >= r5) goto L6c
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            ta.e$a r8 = (ta.e.a) r8
            boolean r9 = r8.f39915a
            if (r9 != 0) goto L2c
            goto L69
        L2c:
            int r8 = r8.f39916b
            r8 = r8 & 7
            if (r8 == r1) goto L50
            r9 = 3
            if (r8 == r9) goto L4a
            r9 = 5
            if (r8 == r9) goto L3a
            r8 = r2
            goto L5d
        L3a:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
        L46:
            r10 = r8
            r8 = r2
            r2 = r10
            goto L5d
        L4a:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L5d
        L50:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
            goto L46
        L5d:
            int r2 = r2 + r14
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L68
            r7.offsetLeftAndRight(r2)
        L68:
            r2 = r8
        L69:
            int r6 = r6 + 1
            goto L1b
        L6c:
            ta.f r14 = r11.E
            if (r14 == 0) goto L75
            s20.h r14 = (s20.h) r14
            r14.a(r13, r12)
        L75:
            java.util.ArrayList r14 = r11.D
            if (r14 == 0) goto L91
            int r14 = r14.size()
        L7d:
            if (r0 >= r14) goto L91
            java.util.ArrayList r2 = r11.D
            java.lang.Object r2 = r2.get(r0)
            ta.f r2 = (ta.f) r2
            if (r2 == 0) goto L8e
            s20.h r2 = (s20.h) r2
            r2.a(r13, r12)
        L8e:
            int r0 = r0 + 1
            goto L7d
        L91:
            r11.B = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ta.e.g(int, float, int):void");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public ta.a getAdapter() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i11, int i12) {
        if (this.G == 2) {
            i12 = (i11 - 1) - i12;
        }
        ((a) ((View) this.H.get(i12)).getLayoutParams()).getClass();
        return 0;
    }

    public int getCurrentItem() {
        return 0;
    }

    public int getOffscreenPageLimit() {
        return this.f39901m;
    }

    public int getPageMargin() {
        return this.f39895f;
    }

    public final boolean h(int i11) {
        int i12;
        ArrayList arrayList = this.f39890a;
        if (arrayList.size() == 0) {
            if (!this.A) {
                this.B = false;
                g(0, 0.0f, 0);
                if (!this.B) {
                    h2.b("onPageScrolled did not call superclass implementation");
                    return false;
                }
            }
            return false;
        }
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.f39895f / clientWidth : 0.0f;
        int i13 = -1;
        boolean z11 = true;
        float f12 = 0.0f;
        int i14 = 0;
        d dVar = null;
        while (i14 < arrayList.size()) {
            d dVar2 = (d) arrayList.get(i14);
            if (!z11 && dVar2.f39888a != (i12 = i13 + 1)) {
                d dVar3 = this.f39891b;
                dVar3.f39889b = f12 + 0.0f + f11;
                dVar3.f39888a = i12;
                throw null;
            }
            f12 = dVar2.f39889b;
            float f13 = f12 + 0.0f + f11;
            if (!z11 && scrollX < f12) {
                break;
            }
            if (scrollX < f13 || i14 == arrayList.size() - 1) {
                dVar = dVar2;
                break;
            }
            i13 = dVar2.f39888a;
            i14++;
            z11 = false;
            dVar = dVar2;
        }
        int clientWidth2 = getClientWidth();
        int i15 = this.f39895f;
        int i16 = clientWidth2 + i15;
        float f14 = clientWidth2;
        int i17 = dVar.f39888a;
        float f15 = ((i11 / f14) - dVar.f39889b) / (0.0f + (i15 / f14));
        this.B = false;
        g(i17, f15, (int) (i16 * f15));
        if (this.B) {
            return true;
        }
        h2.b("onPageScrolled did not call superclass implementation");
        return false;
    }

    public final void i() {
        if (this.G != 0) {
            ArrayList arrayList = this.H;
            if (arrayList == null) {
                this.H = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                this.H.add(getChildAt(i11));
            }
            Collections.sort(this.H, M);
        }
    }

    public final void j(int i11, int i12, int i13, int i14) {
        d dVar;
        ArrayList arrayList = this.f39890a;
        if (i12 > 0 && !arrayList.isEmpty()) {
            if (!this.f39894e.isFinished()) {
                this.f39894e.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i12 - getPaddingLeft()) - getPaddingRight()) + i14)) * (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)), getScrollY());
                return;
            }
        }
        int i15 = 0;
        while (true) {
            if (i15 >= arrayList.size()) {
                dVar = null;
                break;
            }
            dVar = (d) arrayList.get(i15);
            if (dVar.f39888a == 0) {
                break;
            } else {
                i15++;
            }
        }
        int iMin = (int) ((dVar != null ? Math.min(dVar.f39889b, this.f39898i) : 0.0f) * ((i11 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            c(false);
            scrollTo(iMin, getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.I);
        Scroller scroller = this.f39894e;
        if (scroller != null && !scroller.isFinished()) {
            this.f39894e.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f39895f <= 0 || this.f39896g == null) {
            return;
        }
        this.f39890a.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
    
        if (r13.f39903o != false) goto L84;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ta.e.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ta.e.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        a aVar;
        a aVar2;
        int i13;
        setMeasuredDimension(View.getDefaultSize(0, i11), View.getDefaultSize(0, i12));
        int measuredWidth = getMeasuredWidth();
        this.f39905q = Math.min(measuredWidth / 10, this.f39904p);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i14 = 0;
        while (true) {
            boolean z11 = true;
            int i15 = 1073741824;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8 && (aVar2 = (a) childAt.getLayoutParams()) != null && aVar2.f39915a) {
                int i16 = aVar2.f39916b;
                int i17 = i16 & 7;
                int i18 = i16 & 112;
                boolean z12 = i18 == 48 || i18 == 80;
                if (i17 != 3 && i17 != 5) {
                    z11 = false;
                }
                int i19 = Integer.MIN_VALUE;
                if (z12) {
                    i13 = Integer.MIN_VALUE;
                    i19 = 1073741824;
                } else {
                    i13 = z11 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i21 = ((ViewGroup.LayoutParams) aVar2).width;
                if (i21 != -2) {
                    if (i21 == -1) {
                        i21 = paddingLeft;
                    }
                    i19 = 1073741824;
                } else {
                    i21 = paddingLeft;
                }
                int i22 = ((ViewGroup.LayoutParams) aVar2).height;
                if (i22 == -2) {
                    i22 = measuredHeight;
                    i15 = i13;
                } else if (i22 == -1) {
                    i22 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i21, i19), View.MeasureSpec.makeMeasureSpec(i22, i15));
                if (z12) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z11) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i14++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f39899j = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f39900k = true;
        i();
        this.f39900k = false;
        int childCount2 = getChildCount();
        for (int i23 = 0; i23 < childCount2; i23++) {
            View childAt2 = getChildAt(i23);
            if (childAt2.getVisibility() != 8 && ((aVar = (a) childAt2.getLayoutParams()) == null || !aVar.f39915a)) {
                aVar.getClass();
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * 0.0f), 1073741824), this.f39899j);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i11, Rect rect) {
        int i12;
        int i13;
        int i14;
        int childCount = getChildCount();
        if ((i11 & 2) != 0) {
            i13 = 1;
            i14 = childCount;
            i12 = 0;
        } else {
            i12 = childCount - 1;
            i13 = -1;
            i14 = -1;
        }
        while (i12 != i14) {
            if (getChildAt(i12).getVisibility() == 0) {
                e();
            }
            i12 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f45418a);
        this.f39893d = hVar.f39918d;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        hVar.f39917c = 0;
        return hVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (i11 != i13) {
            int i15 = this.f39895f;
            j(i11, i13, i15, i15);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            motionEvent.getEdgeFlags();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f39900k) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(ta.a aVar) {
        ArrayList arrayList = this.F;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.F.size();
        for (int i11 = 0; i11 < size; i11++) {
            TabLayout tabLayout = ((s20.c) this.F.get(i11)).f38784a;
            if (tabLayout.P == this) {
                tabLayout.j();
            }
        }
    }

    public void setCurrentItem(int i11) {
        setScrollingCacheEnabled(false);
    }

    public void setOffscreenPageLimit(int i11) {
        if (i11 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i11 + " too small; defaulting to 1");
            i11 = 1;
        }
        if (i11 != this.f39901m) {
            this.f39901m = i11;
            i();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(f fVar) {
        this.E = fVar;
    }

    public void setPageMargin(int i11) {
        int i12 = this.f39895f;
        this.f39895f = i11;
        int width = getWidth();
        j(width, width, i11, i12);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f39896g = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z11, g gVar, int i11) {
        boolean z12 = gVar != null;
        setChildrenDrawingOrderEnabled(z12);
        if (z12) {
            this.G = z11 ? 2 : 1;
        } else {
            this.G = 0;
        }
        if (z12) {
            i();
        }
    }

    public void setScrollState(int i11) {
        if (this.J == i11) {
            return;
        }
        this.J = i11;
        f fVar = this.E;
        if (fVar != null) {
            s20.h hVar = (s20.h) fVar;
            hVar.f38796b = hVar.f38797c;
            hVar.f38797c = i11;
            TabLayout tabLayout = (TabLayout) hVar.f38795a.get();
            if (tabLayout != null) {
                tabLayout.W = hVar.f38797c;
            }
        }
        ArrayList arrayList = this.D;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                f fVar2 = (f) this.D.get(i12);
                if (fVar2 != null) {
                    s20.h hVar2 = (s20.h) fVar2;
                    hVar2.f38796b = hVar2.f38797c;
                    hVar2.f38797c = i11;
                    TabLayout tabLayout2 = (TabLayout) hVar2.f38795a.get();
                    if (tabLayout2 != null) {
                        tabLayout2.W = hVar2.f38797c;
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f39896g;
    }

    public void setCurrentItem(int i11, boolean z11) {
        setScrollingCacheEnabled(false);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void setPageMarginDrawable(int i11) {
        setPageMarginDrawable(getContext().getDrawable(i11));
    }

    public void setPageTransformer(boolean z11, g gVar) {
        setPageTransformer(z11, gVar, 2);
    }

    public e(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39890a = new ArrayList();
        this.f39891b = new d();
        this.f39892c = new Rect();
        this.f39893d = null;
        this.f39897h = -3.4028235E38f;
        this.f39898i = Float.MAX_VALUE;
        this.f39901m = 1;
        this.f39910v = -1;
        this.A = true;
        this.I = new a8.f(this, 15);
        this.J = 0;
        f();
    }
}
