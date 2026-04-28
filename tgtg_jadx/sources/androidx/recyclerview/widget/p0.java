package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import com.braze.ui.contentcards.recycler.SimpleItemTouchHelperCallback;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends t1 implements z1 {
    public Rect A;
    public long B;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f3853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f3854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f3855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f3856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f3857h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f3858i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f3859j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f3860k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SimpleItemTouchHelperCallback f3861m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3863o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3865q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RecyclerView f3866r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public VelocityTracker f3868t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f3869u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f3870v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public GestureDetector f3872x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public n0 f3873y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3850a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f3851b = new float[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r2 f3852c = null;
    public int l = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3862n = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f3864p = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a0 f3867s = new a0(this, 1);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f3871w = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final i0 f3874z = new i0(this);

    public p0(SimpleItemTouchHelperCallback simpleItemTouchHelperCallback) {
        this.f3861m = simpleItemTouchHelperCallback;
    }

    public static boolean l(View view, float f11, float f12, float f13, float f14) {
        return f11 >= f13 && f11 <= f13 + ((float) view.getWidth()) && f12 >= f14 && f12 <= f14 + ((float) view.getHeight());
    }

    @Override // androidx.recyclerview.widget.z1
    public final void b(View view) {
        if (view == this.f3871w) {
            this.f3871w = null;
        }
        r2 r2VarN = this.f3866r.N(view);
        if (r2VarN == null) {
            return;
        }
        r2 r2Var = this.f3852c;
        if (r2Var != null && r2VarN == r2Var) {
            n(null, 0);
            return;
        }
        i(r2VarN, false);
        if (this.f3850a.remove(r2VarN.itemView)) {
            this.f3861m.clearView(this.f3866r, r2VarN);
        }
    }

    public final int f(r2 r2Var, int i11) {
        if ((i11 & 12) == 0) {
            return 0;
        }
        int i12 = this.f3857h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f3868t;
        SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = this.f3861m;
        if (velocityTracker != null && this.l > -1) {
            velocityTracker.computeCurrentVelocity(1000, simpleItemTouchHelperCallback.getSwipeVelocityThreshold(this.f3856g));
            float xVelocity = this.f3868t.getXVelocity(this.l);
            float yVelocity = this.f3868t.getYVelocity(this.l);
            int i13 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i13 & i11) != 0 && i12 == i13 && fAbs >= simpleItemTouchHelperCallback.getSwipeEscapeVelocity(this.f3855f) && fAbs > Math.abs(yVelocity)) {
                return i13;
            }
        }
        float swipeThreshold = simpleItemTouchHelperCallback.getSwipeThreshold(r2Var) * this.f3866r.getWidth();
        if ((i11 & i12) == 0 || Math.abs(this.f3857h) <= swipeThreshold) {
            return 0;
        }
        return i12;
    }

    public final void g(int i11, int i12, MotionEvent motionEvent) {
        int absoluteMovementFlags;
        View viewJ;
        if (this.f3852c == null && i11 == 2 && this.f3862n != 2) {
            SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = this.f3861m;
            if (simpleItemTouchHelperCallback.isItemViewSwipeEnabled() && this.f3866r.getScrollState() != 1) {
                y1 layoutManager = this.f3866r.getLayoutManager();
                int i13 = this.l;
                r2 r2VarN = null;
                if (i13 != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i13);
                    float x11 = motionEvent.getX(iFindPointerIndex) - this.f3853d;
                    float y5 = motionEvent.getY(iFindPointerIndex) - this.f3854e;
                    float fAbs = Math.abs(x11);
                    float fAbs2 = Math.abs(y5);
                    float f11 = this.f3865q;
                    if ((fAbs >= f11 || fAbs2 >= f11) && ((fAbs <= fAbs2 || !layoutManager.getIsScrollEnabled()) && ((fAbs2 <= fAbs || !layoutManager.canScrollVertically()) && (viewJ = j(motionEvent)) != null))) {
                        r2VarN = this.f3866r.N(viewJ);
                    }
                }
                if (r2VarN == null || (absoluteMovementFlags = (simpleItemTouchHelperCallback.getAbsoluteMovementFlags(this.f3866r, r2VarN) & 65280) >> 8) == 0) {
                    return;
                }
                float x12 = motionEvent.getX(i12);
                float y6 = motionEvent.getY(i12);
                float f12 = x12 - this.f3853d;
                float f13 = y6 - this.f3854e;
                float fAbs3 = Math.abs(f12);
                float fAbs4 = Math.abs(f13);
                float f14 = this.f3865q;
                if (fAbs3 >= f14 || fAbs4 >= f14) {
                    if (fAbs3 > fAbs4) {
                        if (f12 < 0.0f && (absoluteMovementFlags & 4) == 0) {
                            return;
                        }
                        if (f12 > 0.0f && (absoluteMovementFlags & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f13 < 0.0f && (absoluteMovementFlags & 1) == 0) {
                            return;
                        }
                        if (f13 > 0.0f && (absoluteMovementFlags & 2) == 0) {
                            return;
                        }
                    }
                    this.f3858i = 0.0f;
                    this.f3857h = 0.0f;
                    this.l = motionEvent.getPointerId(0);
                    n(r2VarN, 1);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.t1
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, n2 n2Var) {
        rect.setEmpty();
    }

    public final int h(r2 r2Var, int i11) {
        if ((i11 & 3) == 0) {
            return 0;
        }
        int i12 = this.f3858i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f3868t;
        SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = this.f3861m;
        if (velocityTracker != null && this.l > -1) {
            velocityTracker.computeCurrentVelocity(1000, simpleItemTouchHelperCallback.getSwipeVelocityThreshold(this.f3856g));
            float xVelocity = this.f3868t.getXVelocity(this.l);
            float yVelocity = this.f3868t.getYVelocity(this.l);
            int i13 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i13 & i11) != 0 && i13 == i12 && fAbs >= simpleItemTouchHelperCallback.getSwipeEscapeVelocity(this.f3855f) && fAbs > Math.abs(xVelocity)) {
                return i13;
            }
        }
        float swipeThreshold = simpleItemTouchHelperCallback.getSwipeThreshold(r2Var) * this.f3866r.getHeight();
        if ((i11 & i12) == 0 || Math.abs(this.f3858i) <= swipeThreshold) {
            return 0;
        }
        return i12;
    }

    public final void i(r2 r2Var, boolean z11) {
        ArrayList arrayList = this.f3864p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            j0 j0Var = (j0) arrayList.get(size);
            if (j0Var.f3780e == r2Var) {
                j0Var.f3786k |= z11;
                if (!j0Var.l) {
                    j0Var.f3782g.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View j(MotionEvent motionEvent) {
        float x11 = motionEvent.getX();
        float y5 = motionEvent.getY();
        r2 r2Var = this.f3852c;
        if (r2Var != null) {
            View view = r2Var.itemView;
            if (l(view, x11, y5, this.f3859j + this.f3857h, this.f3860k + this.f3858i)) {
                return view;
            }
        }
        ArrayList arrayList = this.f3864p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            j0 j0Var = (j0) arrayList.get(size);
            View view2 = j0Var.f3780e.itemView;
            if (l(view2, x11, y5, j0Var.f3784i, j0Var.f3785j)) {
                return view2;
            }
        }
        RecyclerView recyclerView = this.f3866r;
        for (int iE = recyclerView.f3582f.e() - 1; iE >= 0; iE--) {
            View viewD = recyclerView.f3582f.d(iE);
            float translationX = viewD.getTranslationX();
            float translationY = viewD.getTranslationY();
            if (x11 >= viewD.getLeft() + translationX && x11 <= viewD.getRight() + translationX && y5 >= viewD.getTop() + translationY && y5 <= viewD.getBottom() + translationY) {
                return viewD;
            }
        }
        return null;
    }

    public final void k(float[] fArr) {
        if ((this.f3863o & 12) != 0) {
            fArr[0] = (this.f3859j + this.f3857h) - this.f3852c.itemView.getLeft();
        } else {
            fArr[0] = this.f3852c.itemView.getTranslationX();
        }
        if ((this.f3863o & 3) != 0) {
            fArr[1] = (this.f3860k + this.f3858i) - this.f3852c.itemView.getTop();
        } else {
            fArr[1] = this.f3852c.itemView.getTranslationY();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m(r2 r2Var) {
        int i11;
        int i12;
        int i13;
        if (this.f3866r.isLayoutRequested()) {
            return;
        }
        char c3 = 2;
        if (this.f3862n != 2) {
            return;
        }
        SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = this.f3861m;
        float moveThreshold = simpleItemTouchHelperCallback.getMoveThreshold(r2Var);
        int i14 = (int) (this.f3859j + this.f3857h);
        int i15 = (int) (this.f3860k + this.f3858i);
        if (Math.abs(i15 - r2Var.itemView.getTop()) >= r2Var.itemView.getHeight() * moveThreshold || Math.abs(i14 - r2Var.itemView.getLeft()) >= r2Var.itemView.getWidth() * moveThreshold) {
            ArrayList arrayList = this.f3869u;
            if (arrayList == null) {
                this.f3869u = new ArrayList();
                this.f3870v = new ArrayList();
            } else {
                arrayList.clear();
                this.f3870v.clear();
            }
            int boundingBoxMargin = simpleItemTouchHelperCallback.getBoundingBoxMargin();
            int iRound = Math.round(this.f3859j + this.f3857h) - boundingBoxMargin;
            int iRound2 = Math.round(this.f3860k + this.f3858i) - boundingBoxMargin;
            int i16 = boundingBoxMargin * 2;
            int width = r2Var.itemView.getWidth() + iRound + i16;
            int height = r2Var.itemView.getHeight() + iRound2 + i16;
            int i17 = (iRound + width) / 2;
            int i18 = (iRound2 + height) / 2;
            y1 layoutManager = this.f3866r.getLayoutManager();
            int childCount = layoutManager.getChildCount();
            int i19 = 0;
            while (i19 < childCount) {
                char c7 = c3;
                View childAt = layoutManager.getChildAt(i19);
                if (childAt != r2Var.itemView && childAt.getBottom() >= iRound2 && childAt.getTop() <= height && childAt.getRight() >= iRound && childAt.getLeft() <= width) {
                    r2 r2VarN = this.f3866r.N(childAt);
                    i11 = i17;
                    if (simpleItemTouchHelperCallback.canDropOver(this.f3866r, this.f3852c, r2VarN)) {
                        int iAbs = Math.abs(i11 - ((childAt.getRight() + childAt.getLeft()) / 2));
                        int iAbs2 = Math.abs(i18 - ((childAt.getBottom() + childAt.getTop()) / 2));
                        int i21 = (iAbs2 * iAbs2) + (iAbs * iAbs);
                        int size = this.f3869u.size();
                        i12 = iRound;
                        i13 = iRound2;
                        int i22 = 0;
                        int i23 = 0;
                        while (i22 < size) {
                            int i24 = size;
                            if (i21 <= ((Integer) this.f3870v.get(i22)).intValue()) {
                                break;
                            }
                            i23++;
                            i22++;
                            size = i24;
                        }
                        this.f3869u.add(i23, r2VarN);
                        this.f3870v.add(i23, Integer.valueOf(i21));
                    }
                    i19++;
                    c3 = c7;
                    iRound = i12;
                    i17 = i11;
                    iRound2 = i13;
                } else {
                    i11 = i17;
                }
                i12 = iRound;
                i13 = iRound2;
                i19++;
                c3 = c7;
                iRound = i12;
                i17 = i11;
                iRound2 = i13;
            }
            ArrayList arrayList2 = this.f3869u;
            if (arrayList2.size() == 0) {
                return;
            }
            r2 r2VarChooseDropTarget = simpleItemTouchHelperCallback.chooseDropTarget(r2Var, arrayList2, i14, i15);
            if (r2VarChooseDropTarget == null) {
                this.f3869u.clear();
                this.f3870v.clear();
                return;
            }
            int absoluteAdapterPosition = r2VarChooseDropTarget.getAbsoluteAdapterPosition();
            int absoluteAdapterPosition2 = r2Var.getAbsoluteAdapterPosition();
            if (simpleItemTouchHelperCallback.onMove(this.f3866r, r2Var, r2VarChooseDropTarget)) {
                simpleItemTouchHelperCallback.onMoved(this.f3866r, r2Var, absoluteAdapterPosition2, r2VarChooseDropTarget, absoluteAdapterPosition, i14, i15);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.recyclerview.widget.m0, com.braze.ui.contentcards.recycler.SimpleItemTouchHelperCallback] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [androidx.recyclerview.widget.m0] */
    /* JADX WARN: Type inference failed for: r13v3, types: [androidx.recyclerview.widget.m0] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [androidx.recyclerview.widget.m0] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r20v0, types: [androidx.recyclerview.widget.p0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.recyclerview.widget.r2] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(androidx.recyclerview.widget.r2 r21, int r22) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.p0.n(androidx.recyclerview.widget.r2, int):void");
    }

    public final void o(int i11, int i12, MotionEvent motionEvent) {
        float x11 = motionEvent.getX(i12);
        float y5 = motionEvent.getY(i12);
        float f11 = x11 - this.f3853d;
        this.f3857h = f11;
        this.f3858i = y5 - this.f3854e;
        if ((i11 & 4) == 0) {
            this.f3857h = Math.max(0.0f, f11);
        }
        if ((i11 & 8) == 0) {
            this.f3857h = Math.min(0.0f, this.f3857h);
        }
        if ((i11 & 1) == 0) {
            this.f3858i = Math.max(0.0f, this.f3858i);
        }
        if ((i11 & 2) == 0) {
            this.f3858i = Math.min(0.0f, this.f3858i);
        }
    }

    @Override // androidx.recyclerview.widget.t1
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, n2 n2Var) {
        float f11;
        float f12;
        if (this.f3852c != null) {
            float[] fArr = this.f3851b;
            k(fArr);
            float f13 = fArr[0];
            f12 = fArr[1];
            f11 = f13;
        } else {
            f11 = 0.0f;
            f12 = 0.0f;
        }
        this.f3861m.onDraw(canvas, recyclerView, this.f3852c, this.f3864p, this.f3862n, f11, f12);
    }

    @Override // androidx.recyclerview.widget.t1
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, n2 n2Var) {
        float f11;
        float f12;
        if (this.f3852c != null) {
            float[] fArr = this.f3851b;
            k(fArr);
            float f13 = fArr[0];
            f12 = fArr[1];
            f11 = f13;
        } else {
            f11 = 0.0f;
            f12 = 0.0f;
        }
        this.f3861m.onDrawOver(canvas, recyclerView, this.f3852c, this.f3864p, this.f3862n, f11, f12);
    }

    @Override // androidx.recyclerview.widget.z1
    public final void c(View view) {
    }
}
