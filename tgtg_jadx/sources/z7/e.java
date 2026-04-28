package z7;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import com.braze.h2;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final ta.b f47323x = new ta.b(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47325b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f47327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f47328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f47329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f47330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f47331h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f47332i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f47333j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f47334k;
    public VelocityTracker l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f47335m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f47336n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f47337o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f47338p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f47339q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final OverScroller f47340r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f47341s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f47342t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f47343u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ViewGroup f47344v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47326c = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f47345w = new c(this, 0);

    public e(Context context, ViewGroup viewGroup, d dVar) {
        if (dVar == null) {
            i4.a.f("Callback may not be null");
            throw null;
        }
        this.f47344v = viewGroup;
        this.f47341s = dVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i11 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f47338p = i11;
        this.f47337o = i11;
        this.f47325b = viewConfiguration.getScaledTouchSlop();
        this.f47335m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f47336n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f47340r = new OverScroller(context, f47323x);
    }

    public final void a() {
        this.f47326c = -1;
        float[] fArr = this.f47327d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f47328e, 0.0f);
            Arrays.fill(this.f47329f, 0.0f);
            Arrays.fill(this.f47330g, 0.0f);
            Arrays.fill(this.f47331h, 0);
            Arrays.fill(this.f47332i, 0);
            Arrays.fill(this.f47333j, 0);
            this.f47334k = 0;
        }
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public final void b(int i11, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f47344v;
        if (parent != viewGroup) {
            j4.d.m("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (", viewGroup, ")");
            return;
        }
        this.f47342t = view;
        this.f47326c = i11;
        this.f47341s.onViewCaptured(view, i11);
        p(1);
    }

    public final boolean c(float f11, float f12, int i11, int i12) {
        float fAbs = Math.abs(f11);
        float fAbs2 = Math.abs(f12);
        if ((this.f47331h[i11] & i12) == i12 && (this.f47339q & i12) != 0 && (this.f47333j[i11] & i12) != i12 && (this.f47332i[i11] & i12) != i12) {
            float f13 = this.f47325b;
            if (fAbs > f13 || fAbs2 > f13) {
                if (fAbs < fAbs2 * 0.5f && this.f47341s.onEdgeLock(i12)) {
                    int[] iArr = this.f47333j;
                    iArr[i11] = iArr[i11] | i12;
                    return false;
                }
                if ((this.f47332i[i11] & i12) == 0 && fAbs > this.f47325b) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.view.View r5, float r6, float r7) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            goto L45
        L4:
            z7.d r1 = r4.f47341s
            int r2 = r1.getViewHorizontalDragRange(r5)
            r3 = 1
            if (r2 <= 0) goto Lf
            r2 = r3
            goto L10
        Lf:
            r2 = r0
        L10:
            int r5 = r1.getViewVerticalDragRange(r5)
            if (r5 <= 0) goto L18
            r5 = r3
            goto L19
        L18:
            r5 = r0
        L19:
            if (r2 == 0) goto L29
            if (r5 == 0) goto L29
            float r6 = r6 * r6
            float r7 = r7 * r7
            float r7 = r7 + r6
            int r5 = r4.f47325b
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 <= 0) goto L45
            goto L44
        L29:
            if (r2 == 0) goto L37
            float r5 = java.lang.Math.abs(r6)
            int r6 = r4.f47325b
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L45
            goto L44
        L37:
            if (r5 == 0) goto L45
            float r5 = java.lang.Math.abs(r7)
            int r6 = r4.f47325b
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L45
        L44:
            return r3
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.e.d(android.view.View, float, float):boolean");
    }

    public final void e(int i11) {
        float[] fArr = this.f47327d;
        if (fArr != null) {
            int i12 = this.f47334k;
            int i13 = 1 << i11;
            if ((i12 & i13) != 0) {
                fArr[i11] = 0.0f;
                this.f47328e[i11] = 0.0f;
                this.f47329f[i11] = 0.0f;
                this.f47330g[i11] = 0.0f;
                this.f47331h[i11] = 0;
                this.f47332i[i11] = 0;
                this.f47333j[i11] = 0;
                this.f47334k = (~i13) & i12;
            }
        }
    }

    public final int f(int i11, int i12, int i13) {
        if (i11 == 0) {
            return 0;
        }
        float width = this.f47344v.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i11) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i12);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i11) / i13) + 1.0f) * 256.0f), 600);
    }

    public final boolean g() {
        if (this.f47324a == 2) {
            OverScroller overScroller = this.f47340r;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f47342t.getLeft();
            int top = currY - this.f47342t.getTop();
            if (left != 0) {
                ViewCompat.M(this.f47342t, left);
            }
            if (top != 0) {
                ViewCompat.N(this.f47342t, top);
            }
            if (left != 0 || top != 0) {
                this.f47341s.onViewPositionChanged(this.f47342t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f47344v.post(this.f47345w);
            }
        }
        return this.f47324a == 2;
    }

    public final View h(int i11, int i12) {
        ViewGroup viewGroup = this.f47344v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(this.f47341s.getOrderedChildIndex(childCount));
            if (i11 >= childAt.getLeft() && i11 < childAt.getRight() && i12 >= childAt.getTop() && i12 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean i(int i11, int i12, int i13, int i14) {
        float f11;
        float f12;
        float f13;
        float f14;
        int left = this.f47342t.getLeft();
        int top = this.f47342t.getTop();
        int i15 = i11 - left;
        int i16 = i12 - top;
        OverScroller overScroller = this.f47340r;
        if (i15 == 0 && i16 == 0) {
            overScroller.abortAnimation();
            p(0);
            return false;
        }
        View view = this.f47342t;
        int i17 = (int) this.f47336n;
        int i18 = (int) this.f47335m;
        int iAbs = Math.abs(i13);
        if (iAbs < i17) {
            i13 = 0;
        } else if (iAbs > i18) {
            i13 = i13 > 0 ? i18 : -i18;
        }
        int i19 = (int) this.f47336n;
        int iAbs2 = Math.abs(i14);
        if (iAbs2 < i19) {
            i14 = 0;
        } else if (iAbs2 > i18) {
            i14 = i14 > 0 ? i18 : -i18;
        }
        int iAbs3 = Math.abs(i15);
        int iAbs4 = Math.abs(i16);
        int iAbs5 = Math.abs(i13);
        int iAbs6 = Math.abs(i14);
        int i21 = iAbs5 + iAbs6;
        int i22 = iAbs3 + iAbs4;
        if (i13 != 0) {
            f11 = iAbs5;
            f12 = i21;
        } else {
            f11 = iAbs3;
            f12 = i22;
        }
        float f15 = f11 / f12;
        if (i14 != 0) {
            f13 = iAbs6;
            f14 = i21;
        } else {
            f13 = iAbs4;
            f14 = i22;
        }
        float f16 = f13 / f14;
        d dVar = this.f47341s;
        overScroller.startScroll(left, top, i15, i16, (int) ((f(i16, i14, dVar.getViewVerticalDragRange(view)) * f16) + (f(i15, i13, dVar.getViewHorizontalDragRange(view)) * f15)));
        p(2);
        return true;
    }

    public final boolean j(int i11) {
        if ((this.f47334k & (1 << i11)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i11 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void k(MotionEvent motionEvent) {
        int i11;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        d dVar = this.f47341s;
        int i12 = 0;
        if (actionMasked == 0) {
            float x11 = motionEvent.getX();
            float y5 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewH = h((int) x11, (int) y5);
            n(x11, y5, pointerId);
            t(pointerId, viewH);
            int i13 = this.f47331h[pointerId] & this.f47339q;
            if (i13 != 0) {
                dVar.onEdgeTouched(i13, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f47324a == 1) {
                l();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f47324a != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (i12 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i12);
                    if (j(pointerId2)) {
                        float x12 = motionEvent.getX(i12);
                        float y6 = motionEvent.getY(i12);
                        float f11 = x12 - this.f47327d[pointerId2];
                        float f12 = y6 - this.f47328e[pointerId2];
                        m(f11, f12, pointerId2);
                        if (this.f47324a != 1) {
                            View viewH2 = h((int) x12, (int) y6);
                            if (d(viewH2, f11, f12) && t(pointerId2, viewH2)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i12++;
                }
                o(motionEvent);
                return;
            }
            if (j(this.f47326c)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f47326c);
                float x13 = motionEvent.getX(iFindPointerIndex);
                float y11 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f47329f;
                int i14 = this.f47326c;
                int i15 = (int) (x13 - fArr[i14]);
                int i16 = (int) (y11 - this.f47330g[i14]);
                int left = this.f47342t.getLeft() + i15;
                int top = this.f47342t.getTop() + i16;
                int left2 = this.f47342t.getLeft();
                int top2 = this.f47342t.getTop();
                if (i15 != 0) {
                    left = dVar.clampViewPositionHorizontal(this.f47342t, left, i15);
                    ViewCompat.M(this.f47342t, left - left2);
                }
                int i17 = left;
                if (i16 != 0) {
                    top = dVar.clampViewPositionVertical(this.f47342t, top, i16);
                    ViewCompat.N(this.f47342t, top - top2);
                }
                int i18 = top;
                if (i15 != 0 || i16 != 0) {
                    this.f47341s.onViewPositionChanged(this.f47342t, i17, i18, i17 - left2, i18 - top2);
                }
                o(motionEvent);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            if (this.f47324a == 1) {
                this.f47343u = true;
                dVar.onViewReleased(this.f47342t, 0.0f, 0.0f);
                this.f47343u = false;
                if (this.f47324a == 1) {
                    p(0);
                }
            }
            a();
            return;
        }
        if (actionMasked != 5) {
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f47324a == 1 && pointerId3 == this.f47326c) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (true) {
                    if (i12 >= pointerCount2) {
                        i11 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i12);
                    if (pointerId4 != this.f47326c) {
                        View viewH3 = h((int) motionEvent.getX(i12), (int) motionEvent.getY(i12));
                        View view = this.f47342t;
                        if (viewH3 == view && t(pointerId4, view)) {
                            i11 = this.f47326c;
                            break;
                        }
                    }
                    i12++;
                }
                if (i11 == -1) {
                    l();
                }
            }
            e(pointerId3);
            return;
        }
        int pointerId5 = motionEvent.getPointerId(actionIndex);
        float x14 = motionEvent.getX(actionIndex);
        float y12 = motionEvent.getY(actionIndex);
        n(x14, y12, pointerId5);
        if (this.f47324a == 0) {
            t(pointerId5, h((int) x14, (int) y12));
            int i19 = this.f47331h[pointerId5] & this.f47339q;
            if (i19 != 0) {
                dVar.onEdgeTouched(i19, pointerId5);
                return;
            }
            return;
        }
        int i21 = (int) x14;
        int i22 = (int) y12;
        View view2 = this.f47342t;
        if (view2 != null && i21 >= view2.getLeft() && i21 < view2.getRight() && i22 >= view2.getTop() && i22 < view2.getBottom()) {
            i12 = 1;
        }
        if (i12 != 0) {
            t(pointerId5, this.f47342t);
        }
    }

    public final void l() {
        VelocityTracker velocityTracker = this.l;
        float f11 = this.f47335m;
        velocityTracker.computeCurrentVelocity(1000, f11);
        float xVelocity = this.l.getXVelocity(this.f47326c);
        float f12 = this.f47336n;
        float fAbs = Math.abs(xVelocity);
        if (fAbs < f12) {
            xVelocity = 0.0f;
        } else if (fAbs > f11) {
            xVelocity = xVelocity > 0.0f ? f11 : -f11;
        }
        float yVelocity = this.l.getYVelocity(this.f47326c);
        float f13 = this.f47336n;
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f13) {
            f11 = 0.0f;
        } else if (fAbs2 <= f11) {
            f11 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f11 = -f11;
        }
        this.f47343u = true;
        this.f47341s.onViewReleased(this.f47342t, xVelocity, f11);
        this.f47343u = false;
        if (this.f47324a == 1) {
            p(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [z7.d] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m(float f11, float f12, int i11) {
        boolean zC = c(f11, f12, i11, 1);
        ?? r02 = zC;
        if (c(f12, f11, i11, 4)) {
            r02 = (zC ? 1 : 0) | 4;
        }
        ?? r03 = r02;
        if (c(f11, f12, i11, 2)) {
            r03 = (r02 == true ? 1 : 0) | 2;
        }
        ?? r04 = r03;
        if (c(f12, f11, i11, 8)) {
            r04 = (r03 == true ? 1 : 0) | 8;
        }
        if (r04 != 0) {
            int[] iArr = this.f47332i;
            iArr[i11] = iArr[i11] | r04;
            this.f47341s.onEdgeDragStarted(r04, i11);
        }
    }

    public final void n(float f11, float f12, int i11) {
        float[] fArr = this.f47327d;
        if (fArr == null || fArr.length <= i11) {
            int i12 = i11 + 1;
            float[] fArr2 = new float[i12];
            float[] fArr3 = new float[i12];
            float[] fArr4 = new float[i12];
            float[] fArr5 = new float[i12];
            int[] iArr = new int[i12];
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f47328e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f47329f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f47330g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f47331h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f47332i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f47333j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f47327d = fArr2;
            this.f47328e = fArr3;
            this.f47329f = fArr4;
            this.f47330g = fArr5;
            this.f47331h = iArr;
            this.f47332i = iArr2;
            this.f47333j = iArr3;
        }
        float[] fArr9 = this.f47327d;
        this.f47329f[i11] = f11;
        fArr9[i11] = f11;
        float[] fArr10 = this.f47328e;
        this.f47330g[i11] = f12;
        fArr10[i11] = f12;
        int[] iArr7 = this.f47331h;
        int i13 = (int) f11;
        int i14 = (int) f12;
        ViewGroup viewGroup = this.f47344v;
        int i15 = i13 < viewGroup.getLeft() + this.f47337o ? 1 : 0;
        if (i14 < viewGroup.getTop() + this.f47337o) {
            i15 |= 4;
        }
        if (i13 > viewGroup.getRight() - this.f47337o) {
            i15 |= 2;
        }
        if (i14 > viewGroup.getBottom() - this.f47337o) {
            i15 |= 8;
        }
        iArr7[i11] = i15;
        this.f47334k |= 1 << i11;
    }

    public final void o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount; i11++) {
            int pointerId = motionEvent.getPointerId(i11);
            if (j(pointerId)) {
                float x11 = motionEvent.getX(i11);
                float y5 = motionEvent.getY(i11);
                this.f47329f[pointerId] = x11;
                this.f47330g[pointerId] = y5;
            }
        }
    }

    public final void p(int i11) {
        this.f47344v.removeCallbacks(this.f47345w);
        if (this.f47324a != i11) {
            this.f47324a = i11;
            this.f47341s.onViewDragStateChanged(i11);
            if (this.f47324a == 0) {
                this.f47342t = null;
            }
        }
    }

    public final boolean q(int i11, int i12) {
        if (this.f47343u) {
            return i(i11, i12, (int) this.l.getXVelocity(this.f47326c), (int) this.l.getYVelocity(this.f47326c));
        }
        h2.b("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.e.r(android.view.MotionEvent):boolean");
    }

    public final boolean s(View view, int i11, int i12) {
        this.f47342t = view;
        this.f47326c = -1;
        boolean zI = i(i11, i12, 0, 0);
        if (!zI && this.f47324a == 0 && this.f47342t != null) {
            this.f47342t = null;
        }
        return zI;
    }

    public final boolean t(int i11, View view) {
        if (view == this.f47342t && this.f47326c == i11) {
            return true;
        }
        if (view == null || !this.f47341s.tryCaptureView(view, i11)) {
            return false;
        }
        this.f47326c = i11;
        b(i11, view);
        return true;
    }
}
