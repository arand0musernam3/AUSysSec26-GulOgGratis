package androidx.recyclerview.widget;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OverScroller f3882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Interpolator f3883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3886g;

    public q2(RecyclerView recyclerView) {
        this.f3886g = recyclerView;
        l0 l0Var = RecyclerView.P1;
        this.f3883d = l0Var;
        this.f3884e = false;
        this.f3885f = false;
        this.f3882c = new OverScroller(recyclerView.getContext(), l0Var);
    }

    public final void a(int i11, int i12) {
        RecyclerView recyclerView = this.f3886g;
        recyclerView.setScrollState(2);
        this.f3881b = 0;
        this.f3880a = 0;
        Interpolator interpolator = this.f3883d;
        l0 l0Var = RecyclerView.P1;
        if (interpolator != l0Var) {
            this.f3883d = l0Var;
            this.f3882c = new OverScroller(recyclerView.getContext(), l0Var);
        }
        this.f3882c.fling(0, 0, i11, i12, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.f3884e) {
            this.f3885f = true;
            return;
        }
        RecyclerView recyclerView = this.f3886g;
        recyclerView.removeCallbacks(this);
        ViewCompat.U(recyclerView, this);
    }

    public final void c(int i11, int i12, int i13, Interpolator interpolator) {
        RecyclerView recyclerView = this.f3886g;
        if (i13 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i11);
            int iAbs2 = Math.abs(i12);
            boolean z11 = iAbs > iAbs2;
            int width = z11 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z11) {
                iAbs = iAbs2;
            }
            i13 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i14 = i13;
        if (interpolator == null) {
            interpolator = RecyclerView.P1;
        }
        if (this.f3883d != interpolator) {
            this.f3883d = interpolator;
            this.f3882c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f3881b = 0;
        this.f3880a = 0;
        recyclerView.setScrollState(2);
        this.f3882c.startScroll(0, 0, i11, i12, i14);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11;
        int i12;
        int i13;
        int i14;
        RecyclerView recyclerView = this.f3886g;
        int[] iArr = recyclerView.f3623z1;
        if (recyclerView.f3598n == null) {
            recyclerView.removeCallbacks(this);
            this.f3882c.abortAnimation();
            return;
        }
        this.f3885f = false;
        this.f3884e = true;
        recyclerView.q();
        OverScroller overScroller = this.f3882c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i15 = currX - this.f3880a;
            int i16 = currY - this.f3881b;
            this.f3880a = currX;
            this.f3881b = currY;
            int iP = RecyclerView.p(i15, recyclerView.I, recyclerView.K, recyclerView.getWidth());
            int iP2 = RecyclerView.p(i16, recyclerView.J, recyclerView.L, recyclerView.getHeight());
            int[] iArr2 = recyclerView.f3623z1;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.w(iP, iArr2, iP2, 1, null)) {
                iP -= iArr[0];
                iP2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.o(iP, iP2);
            }
            if (recyclerView.f3596m != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.i0(iP, iP2, iArr);
                int i17 = iArr[0];
                int i18 = iArr[1];
                int i19 = iP - i17;
                int i21 = iP2 - i18;
                m2 m2Var = recyclerView.f3598n.mSmoothScroller;
                if (m2Var != null && !m2Var.isPendingInitialRun() && m2Var.isRunning()) {
                    int iB = recyclerView.f3599n1.b();
                    if (iB == 0) {
                        m2Var.stop();
                    } else if (m2Var.getTargetPosition() >= iB) {
                        m2Var.setTargetPosition(iB - 1);
                        m2Var.onAnimation(i17, i18);
                    } else {
                        m2Var.onAnimation(i17, i18);
                    }
                }
                i12 = i21;
                i14 = i18;
                i11 = i19;
                i13 = i17;
            } else {
                i11 = iP;
                i12 = iP2;
                i13 = 0;
                i14 = 0;
            }
            if (!recyclerView.f3602p.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f3623z1;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.x(i13, null, i14, i11, i12, iArr3, 1);
            int i22 = i11 - iArr[0];
            int i23 = i12 - iArr[1];
            if (i13 != 0 || i14 != 0) {
                recyclerView.y(i13, i14);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z11 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i22 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i23 != 0));
            m2 m2Var2 = recyclerView.f3598n.mSmoothScroller;
            if ((m2Var2 == null || !m2Var2.isPendingInitialRun()) && z11) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i24 = i22 < 0 ? -currVelocity : i22 > 0 ? currVelocity : 0;
                    if (i23 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i23 <= 0) {
                        currVelocity = 0;
                    }
                    if (i24 < 0) {
                        recyclerView.A();
                        if (recyclerView.I.isFinished()) {
                            recyclerView.I.onAbsorb(-i24);
                        }
                    } else if (i24 > 0) {
                        recyclerView.B();
                        if (recyclerView.K.isFinished()) {
                            recyclerView.K.onAbsorb(i24);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.C();
                        if (recyclerView.J.isFinished()) {
                            recyclerView.J.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.z();
                        if (recyclerView.L.isFinished()) {
                            recyclerView.L.onAbsorb(currVelocity);
                        }
                    }
                    if (i24 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.N1) {
                    f0 f0Var = recyclerView.f3597m1;
                    int[] iArr4 = f0Var.f3726c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    f0Var.f3727d = 0;
                }
            } else {
                b();
                h0 h0Var = recyclerView.f3595l1;
                if (h0Var != null) {
                    h0Var.a(recyclerView, i13, i14);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                o1.a(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        m2 m2Var3 = recyclerView.f3598n.mSmoothScroller;
        if (m2Var3 != null && m2Var3.isPendingInitialRun()) {
            m2Var3.onAnimation(0, 0);
        }
        this.f3884e = false;
        if (this.f3885f) {
            recyclerView.removeCallbacks(this);
            ViewCompat.U(recyclerView, this);
        } else {
            recyclerView.setScrollState(0);
            recyclerView.q0(1);
        }
    }
}
