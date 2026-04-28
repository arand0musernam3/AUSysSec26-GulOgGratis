package p;

import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n1 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f33951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f33952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f33954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m1 f33955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m1 f33956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f33957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f33958h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f33959i = new int[2];

    public n1(View view) {
        this.f33954d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f33951a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f33952b = tapTimeout;
        this.f33953c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        m1 m1Var = this.f33956f;
        View view = this.f33954d;
        if (m1Var != null) {
            view.removeCallbacks(m1Var);
        }
        m1 m1Var2 = this.f33955e;
        if (m1Var2 != null) {
            view.removeCallbacks(m1Var2);
        }
    }

    public abstract o.b0 b();

    public abstract boolean c();

    public boolean d() {
        o.b0 b0VarB = b();
        if (b0VarB == null || !b0VarB.a()) {
            return true;
        }
        b0VarB.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.n1.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f33957g = false;
        this.f33958h = -1;
        m1 m1Var = this.f33955e;
        if (m1Var != null) {
            this.f33954d.removeCallbacks(m1Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
