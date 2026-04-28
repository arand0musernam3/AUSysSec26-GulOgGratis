package androidx.recyclerview.widget;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends t1 implements b2 {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final a0 B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StateListDrawable f3694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f3695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StateListDrawable f3698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Drawable f3699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f3700i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f3701j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3702k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f3703m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3704n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3705o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f3706p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RecyclerView f3709s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ValueAnimator f3716z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3707q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3708r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3710t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f3711u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3712v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3713w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f3714x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f3715y = new int[2];

    public e0(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i11, int i12, int i13) {
        int i14 = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3716z = valueAnimatorOfFloat;
        this.A = 0;
        a0 a0Var = new a0(this, i14);
        this.B = a0Var;
        b0 b0Var = new b0(this, i14);
        this.f3694c = stateListDrawable;
        this.f3695d = drawable;
        this.f3698g = stateListDrawable2;
        this.f3699h = drawable2;
        this.f3696e = Math.max(i11, stateListDrawable.getIntrinsicWidth());
        this.f3697f = Math.max(i11, drawable.getIntrinsicWidth());
        this.f3700i = Math.max(i11, stateListDrawable2.getIntrinsicWidth());
        this.f3701j = Math.max(i11, drawable2.getIntrinsicWidth());
        this.f3692a = i12;
        this.f3693b = i13;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c0(this, i14));
        valueAnimatorOfFloat.addUpdateListener(new d0(this, i14));
        RecyclerView recyclerView2 = this.f3709s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.f0(this);
            RecyclerView recyclerView3 = this.f3709s;
            recyclerView3.f3604q.remove(this);
            if (recyclerView3.f3606r == this) {
                recyclerView3.f3606r = null;
            }
            ArrayList arrayList = this.f3709s.f3603p1;
            if (arrayList != null) {
                arrayList.remove(b0Var);
            }
            this.f3709s.removeCallbacks(a0Var);
        }
        this.f3709s = recyclerView;
        recyclerView.i(this);
        this.f3709s.f3604q.add(this);
        this.f3709s.k(b0Var);
    }

    public static int h(float f11, float f12, int[] iArr, int i11, int i12, int i13) {
        int i14 = iArr[1] - iArr[0];
        if (i14 != 0) {
            int i15 = i11 - i13;
            int i16 = (int) (((f12 - f11) / i14) * i15);
            int i17 = i12 + i16;
            if (i17 < i15 && i17 >= 0) {
                return i16;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.b2
    public final void a(MotionEvent motionEvent) {
        if (this.f3712v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zG = g(motionEvent.getX(), motionEvent.getY());
            boolean zF = f(motionEvent.getX(), motionEvent.getY());
            if (zG || zF) {
                if (zF) {
                    this.f3713w = 1;
                    this.f3706p = (int) motionEvent.getX();
                } else if (zG) {
                    this.f3713w = 2;
                    this.f3703m = (int) motionEvent.getY();
                }
                i(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f3712v == 2) {
            this.f3703m = 0.0f;
            this.f3706p = 0.0f;
            i(1);
            this.f3713w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f3712v == 2) {
            j();
            int i11 = this.f3713w;
            int i12 = this.f3693b;
            if (i11 == 1) {
                float x11 = motionEvent.getX();
                int[] iArr = this.f3715y;
                iArr[0] = i12;
                int i13 = this.f3707q - i12;
                iArr[1] = i13;
                float fMax = Math.max(i12, Math.min(i13, x11));
                if (Math.abs(this.f3705o - fMax) >= 2.0f) {
                    int iH = h(this.f3706p, fMax, iArr, this.f3709s.computeHorizontalScrollRange(), this.f3709s.computeHorizontalScrollOffset(), this.f3707q);
                    if (iH != 0) {
                        this.f3709s.scrollBy(iH, 0);
                    }
                    this.f3706p = fMax;
                }
            }
            if (this.f3713w == 2) {
                float y5 = motionEvent.getY();
                int[] iArr2 = this.f3714x;
                iArr2[0] = i12;
                int i14 = this.f3708r - i12;
                iArr2[1] = i14;
                float fMax2 = Math.max(i12, Math.min(i14, y5));
                if (Math.abs(this.l - fMax2) < 2.0f) {
                    return;
                }
                int iH2 = h(this.f3703m, fMax2, iArr2, this.f3709s.computeVerticalScrollRange(), this.f3709s.computeVerticalScrollOffset(), this.f3708r);
                if (iH2 != 0) {
                    this.f3709s.scrollBy(0, iH2);
                }
                this.f3703m = fMax2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final boolean d(MotionEvent motionEvent) {
        int i11 = this.f3712v;
        if (i11 != 1) {
            return i11 == 2;
        }
        boolean zG = g(motionEvent.getX(), motionEvent.getY());
        boolean zF = f(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zG && !zF) {
            return false;
        }
        if (zF) {
            this.f3713w = 1;
            this.f3706p = (int) motionEvent.getX();
        } else if (zG) {
            this.f3713w = 2;
            this.f3703m = (int) motionEvent.getY();
        }
        i(2);
        return true;
    }

    public final boolean f(float f11, float f12) {
        if (f12 < this.f3708r - this.f3700i) {
            return false;
        }
        int i11 = this.f3705o;
        int i12 = this.f3704n;
        return f11 >= ((float) (i11 - (i12 / 2))) && f11 <= ((float) ((i12 / 2) + i11));
    }

    public final boolean g(float f11, float f12) {
        int layoutDirection = this.f3709s.getLayoutDirection();
        int i11 = this.f3696e;
        if (layoutDirection == 1) {
            if (f11 > i11) {
                return false;
            }
        } else if (f11 < this.f3707q - i11) {
            return false;
        }
        int i12 = this.l;
        int i13 = this.f3702k / 2;
        return f12 >= ((float) (i12 - i13)) && f12 <= ((float) (i13 + i12));
    }

    public final void i(int i11) {
        a0 a0Var = this.B;
        StateListDrawable stateListDrawable = this.f3694c;
        if (i11 == 2 && this.f3712v != 2) {
            stateListDrawable.setState(C);
            this.f3709s.removeCallbacks(a0Var);
        }
        if (i11 == 0) {
            this.f3709s.invalidate();
        } else {
            j();
        }
        if (this.f3712v == 2 && i11 != 2) {
            stateListDrawable.setState(D);
            this.f3709s.removeCallbacks(a0Var);
            this.f3709s.postDelayed(a0Var, 1200);
        } else if (i11 == 1) {
            this.f3709s.removeCallbacks(a0Var);
            this.f3709s.postDelayed(a0Var, 1500);
        }
        this.f3712v = i11;
    }

    public final void j() {
        int i11 = this.A;
        ValueAnimator valueAnimator = this.f3716z;
        if (i11 != 0) {
            if (i11 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // androidx.recyclerview.widget.t1
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, n2 n2Var) {
        if (this.f3707q != this.f3709s.getWidth() || this.f3708r != this.f3709s.getHeight()) {
            this.f3707q = this.f3709s.getWidth();
            this.f3708r = this.f3709s.getHeight();
            i(0);
            return;
        }
        if (this.A != 0) {
            if (this.f3710t) {
                int i11 = this.f3707q;
                int i12 = this.f3696e;
                int i13 = i11 - i12;
                int i14 = this.l;
                int i15 = this.f3702k;
                int i16 = i14 - (i15 / 2);
                StateListDrawable stateListDrawable = this.f3694c;
                stateListDrawable.setBounds(0, 0, i12, i15);
                int i17 = this.f3697f;
                int i18 = this.f3708r;
                Drawable drawable = this.f3695d;
                drawable.setBounds(0, 0, i17, i18);
                if (this.f3709s.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i12, i16);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i12, -i16);
                } else {
                    canvas.translate(i13, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i16);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i13, -i16);
                }
            }
            if (this.f3711u) {
                int i19 = this.f3708r;
                int i21 = this.f3700i;
                int i22 = i19 - i21;
                int i23 = this.f3705o;
                int i24 = this.f3704n;
                int i25 = i23 - (i24 / 2);
                StateListDrawable stateListDrawable2 = this.f3698g;
                stateListDrawable2.setBounds(0, 0, i24, i21);
                int i26 = this.f3707q;
                int i27 = this.f3701j;
                Drawable drawable2 = this.f3699h;
                drawable2.setBounds(0, 0, i26, i27);
                canvas.translate(0.0f, i22);
                drawable2.draw(canvas);
                canvas.translate(i25, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i25, -i22);
            }
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final void e(boolean z11) {
    }
}
