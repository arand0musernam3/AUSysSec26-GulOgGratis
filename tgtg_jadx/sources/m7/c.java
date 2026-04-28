package m7;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import p.k1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements View.OnTouchListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f29704r = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f29705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f29706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f29707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a8.f f29708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f29709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f29710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f29711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f29712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f29713i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f29714j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float[] f29715k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f29716m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f29717n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f29718o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f29719p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k1 f29720q;

    public c(k1 k1Var) {
        a aVar = new a();
        aVar.f29699e = Long.MIN_VALUE;
        aVar.f29701g = -1L;
        aVar.f29700f = 0L;
        this.f29705a = aVar;
        this.f29706b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f29709e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f29710f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f29713i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f29714j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f29715k = fArr5;
        this.f29707c = k1Var;
        float f11 = Resources.getSystem().getDisplayMetrics().density;
        float f12 = ((int) ((1575.0f * f11) + 0.5f)) / 1000.0f;
        fArr5[0] = f12;
        fArr5[1] = f12;
        float f13 = ((int) ((f11 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f13;
        fArr4[1] = f13;
        this.f29711g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f29712h = f29704r;
        aVar.f29695a = 500;
        aVar.f29696b = 500;
        this.f29720q = k1Var;
    }

    public static float b(float f11, float f12, float f13) {
        return f11 > f13 ? f13 : f11 < f12 ? f12 : f11;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f29709e
            r0 = r0[r4]
            float[] r1 = r3.f29710f
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f29706b
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f29713i
            r0 = r0[r4]
            float[] r1 = r3.f29714j
            r1 = r1[r4]
            float[] r2 = r3.f29715k
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L51:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.c.a(int, float, float, float):float");
    }

    public final float c(float f11, float f12) {
        if (f12 != 0.0f) {
            int i11 = this.f29711g;
            if (i11 == 0 || i11 == 1) {
                if (f11 < f12) {
                    if (f11 >= 0.0f) {
                        return 1.0f - (f11 / f12);
                    }
                    if (this.f29718o && i11 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i11 == 2 && f11 < 0.0f) {
                return f11 / (-f12);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i11 = 0;
        if (this.f29716m) {
            this.f29718o = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f29705a;
        int i12 = (int) (jCurrentAnimationTimeMillis - aVar.f29699e);
        int i13 = aVar.f29696b;
        if (i12 > i13) {
            i11 = i13;
        } else if (i12 >= 0) {
            i11 = i12;
        }
        aVar.f29703i = i11;
        aVar.f29702h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f29701g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        k1 k1Var;
        int count;
        a aVar = this.f29705a;
        float f11 = aVar.f29698d;
        int iAbs = (int) (f11 / Math.abs(f11));
        Math.abs(aVar.f29697c);
        if (iAbs != 0 && (count = (k1Var = this.f29720q).getCount()) != 0) {
            int childCount = k1Var.getChildCount();
            int firstVisiblePosition = k1Var.getFirstVisiblePosition();
            int i11 = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && k1Var.getChildAt(0).getTop() >= 0)) : !(i11 >= count && k1Var.getChildAt(childCount - 1).getBottom() <= k1Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f29719p
            r1 = 0
            if (r0 != 0) goto L7
            goto L7c
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7c
        L17:
            r7.d()
            return r1
        L1b:
            r7.f29717n = r2
            r7.l = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            p.k1 r4 = r7.f29707c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r2, r9, r8, r3)
            m7.a r9 = r7.f29705a
            r9.f29697c = r0
            r9.f29698d = r8
            boolean r8 = r7.f29718o
            if (r8 != 0) goto L7c
            boolean r8 = r7.e()
            if (r8 == 0) goto L7c
            a8.f r8 = r7.f29708d
            if (r8 != 0) goto L62
            a8.f r8 = new a8.f
            r9 = 8
            r8.<init>(r7, r9)
            r7.f29708d = r8
        L62:
            r7.f29718o = r2
            r7.f29716m = r2
            boolean r8 = r7.l
            if (r8 != 0) goto L75
            int r8 = r7.f29712h
            if (r8 <= 0) goto L75
            a8.f r9 = r7.f29708d
            long r5 = (long) r8
            androidx.core.view.ViewCompat.V(r4, r9, r5)
            goto L7a
        L75:
            a8.f r8 = r7.f29708d
            r8.run()
        L7a:
            r7.l = r2
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.c.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
