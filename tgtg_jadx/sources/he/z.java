package he;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Choreographer;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.n1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends Drawable implements Drawable.Callback, Animatable {
    public static final List Q = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
    public static final ThreadPoolExecutor T = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ve.d());
    public Canvas A;
    public Rect B;
    public RectF C;
    public ie.a D;
    public Rect E;
    public Rect F;
    public RectF G;
    public RectF H;
    public Matrix I;
    public final float[] J;
    public Matrix K;
    public boolean L;
    public a M;
    public final Semaphore N;
    public final d1.e O;
    public float P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f21981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ve.e f21982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y f21986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f21987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ne.a f21988h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f21989i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n1 f21990j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Map f21991k;
    public String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final se.b f21992m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f21993n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f21994o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public re.d f21995p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f21996q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f21997r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f21998s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f21999t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f22000u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f22001v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public j0 f22002w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f22003x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Matrix f22004y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Bitmap f22005z;

    public z() {
        ve.e eVar = new ve.e();
        this.f21982b = eVar;
        this.f21983c = true;
        this.f21984d = false;
        this.f21985e = false;
        this.f21986f = y.NONE;
        this.f21987g = new ArrayList();
        this.f21992m = new se.b(23);
        this.f21993n = false;
        this.f21994o = true;
        this.f21996q = 255;
        this.f22001v = false;
        this.f22002w = j0.AUTOMATIC;
        this.f22003x = false;
        this.f22004y = new Matrix();
        this.J = new float[9];
        this.L = false;
        bg.t tVar = new bg.t(this, 6);
        this.N = new Semaphore(1);
        this.O = new d1.e(this, 20);
        this.P = -3.4028235E38f;
        eVar.addUpdateListener(tVar);
    }

    public static void f(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public static boolean k(float f11) {
        return (Float.isNaN(f11) || Float.isInfinite(f11)) ? false : true;
    }

    public final boolean A() {
        k kVar = this.f21981a;
        if (kVar == null) {
            return false;
        }
        float f11 = this.P;
        float fA = this.f21982b.a();
        this.P = fA;
        return Math.abs(fA - f11) * kVar.b() >= 50.0f;
    }

    public final void a(final oe.f fVar, final Object obj, final ub.a aVar) {
        re.d dVar = this.f21995p;
        if (dVar == null) {
            this.f21987g.add(new x() { // from class: he.t
                @Override // he.x
                public final void run() {
                    this.f21968a.a(fVar, obj, aVar);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (fVar == oe.f.f32473c) {
            dVar.h(obj, aVar);
        } else {
            oe.g gVar = fVar.f32475b;
            if (gVar != null) {
                gVar.h(obj, aVar);
            } else {
                ArrayList arrayList = new ArrayList();
                this.f21995p.d(fVar, 0, arrayList, new oe.f(new String[0]));
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((oe.f) arrayList.get(i11)).f32475b.h(obj, aVar);
                }
                zIsEmpty = true ^ arrayList.isEmpty();
            }
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (obj == d0.C) {
                z(this.f21982b.a());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.content.Context r3) {
        /*
            r2 = this;
            boolean r0 = r2.f21984d
            if (r0 == 0) goto L5
            goto L2d
        L5:
            boolean r0 = r2.f21983c
            if (r0 == 0) goto L2f
            l20.c r0 = he.e.f21901d
            r0.getClass()
            if (r3 == 0) goto L27
            android.graphics.Matrix r0 = ve.k.f42293a
            android.content.ContentResolver r3 = r3.getContentResolver()
            java.lang.String r0 = "animator_duration_scale"
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = android.provider.Settings.Global.getFloat(r3, r0, r1)
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 == 0) goto L24
            goto L27
        L24:
            me.a r3 = me.a.REDUCED_MOTION
            goto L29
        L27:
            me.a r3 = me.a.STANDARD_MOTION
        L29:
            me.a r0 = me.a.STANDARD_MOTION
            if (r3 != r0) goto L2f
        L2d:
            r3 = 1
            return r3
        L2f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: he.z.b(android.content.Context):boolean");
    }

    public final void c() {
        k kVar = this.f21981a;
        if (kVar == null) {
            return;
        }
        a60.n nVar = te.s.f40105a;
        Rect rect = kVar.f21936k;
        List list = Collections.EMPTY_LIST;
        re.d dVar = new re.d(this, new re.h(list, kVar, "__container", -1L, re.f.PRE_COMP, -1L, null, list, new pe.d(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, re.g.NONE, null, false, null, null, qe.h.NORMAL), kVar.f21935j, kVar);
        this.f21995p = dVar;
        if (this.f21998s) {
            dVar.q(true);
        }
        this.f21995p.L = this.f21994o;
    }

    public final void d() {
        ve.e eVar = this.f21982b;
        if (eVar.f42263m) {
            eVar.cancel();
            if (!isVisible()) {
                this.f21986f = y.NONE;
            }
        }
        this.f21981a = null;
        this.f21995p = null;
        this.f21988h = null;
        this.P = -3.4028235E38f;
        eVar.l = null;
        eVar.f42261j = -2.1474836E9f;
        eVar.f42262k = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        re.d dVar = this.f21995p;
        if (dVar == null) {
            return;
        }
        a aVar = this.M;
        if (aVar == null) {
            aVar = e.f21898a;
        }
        boolean z11 = aVar == a.ENABLED;
        d1.e eVar = this.O;
        ThreadPoolExecutor threadPoolExecutor = T;
        ve.e eVar2 = this.f21982b;
        Semaphore semaphore = this.N;
        if (z11) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                a aVar2 = e.f21898a;
                if (!z11) {
                    return;
                }
                semaphore.release();
                if (dVar.K == eVar2.a()) {
                    return;
                }
            } catch (Throwable th2) {
                a aVar3 = e.f21898a;
                if (z11) {
                    semaphore.release();
                    if (dVar.K != eVar2.a()) {
                        threadPoolExecutor.execute(eVar);
                    }
                }
                throw th2;
            }
        }
        a aVar4 = e.f21898a;
        if (z11 && A()) {
            z(eVar2.a());
        }
        boolean z12 = this.f21985e;
        boolean z13 = this.f22003x;
        if (z12) {
            try {
                if (z13) {
                    n(canvas, dVar);
                } else {
                    g(canvas);
                }
            } catch (Throwable unused2) {
                ve.c.f42247a.getClass();
                a aVar5 = e.f21898a;
            }
        } else if (z13) {
            n(canvas, dVar);
        } else {
            g(canvas);
        }
        this.L = false;
        if (z11) {
            semaphore.release();
            if (dVar.K == eVar2.a()) {
                return;
            }
            threadPoolExecutor.execute(eVar);
        }
    }

    public final void e() {
        k kVar = this.f21981a;
        if (kVar == null) {
            return;
        }
        j0 j0Var = this.f22002w;
        int i11 = Build.VERSION.SDK_INT;
        boolean z11 = kVar.f21939o;
        int i12 = kVar.f21940p;
        j0Var.getClass();
        int i13 = i0.f21923a[j0Var.ordinal()];
        boolean z12 = false;
        if (i13 != 1 && (i13 == 2 || ((z11 && i11 < 28) || i12 > 4))) {
            z12 = true;
        }
        this.f22003x = z12;
    }

    public final void g(Canvas canvas) {
        re.d dVar = this.f21995p;
        k kVar = this.f21981a;
        if (dVar == null || kVar == null) {
            return;
        }
        Matrix matrix = this.f22004y;
        matrix.reset();
        if (!getBounds().isEmpty()) {
            matrix.preTranslate(r3.left, r3.top);
            matrix.preScale(r3.width() / kVar.f21936k.width(), r3.height() / kVar.f21936k.height());
        }
        dVar.b(canvas, matrix, this.f21996q, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f21996q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        k kVar = this.f21981a;
        if (kVar == null) {
            return -1;
        }
        return kVar.f21936k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        k kVar = this.f21981a;
        if (kVar == null) {
            return -1;
        }
        return kVar.f21936k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(a0 a0Var, boolean z11) {
        boolean zRemove;
        HashSet hashSet = (HashSet) this.f21992m.f39010b;
        if (!z11) {
            zRemove = hashSet.remove(a0Var);
        } else if (Build.VERSION.SDK_INT < a0Var.minRequiredSdkVersion) {
            ve.c.b(String.format("%s is not supported pre SDK %d", a0Var.name(), Integer.valueOf(a0Var.minRequiredSdkVersion)));
            zRemove = false;
        } else {
            zRemove = hashSet.add(a0Var);
        }
        if (this.f21981a == null || !zRemove) {
            return;
        }
        c();
    }

    public final Context i() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.L) {
            return;
        }
        this.L = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ve.e eVar = this.f21982b;
        if (eVar == null) {
            return false;
        }
        return eVar.f42263m;
    }

    public final n1 j() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f21990j == null) {
            Drawable.Callback callback = getCallback();
            n1 n1Var = new n1();
            n1Var.f3499a = new f6.p();
            n1Var.f3500b = new HashMap();
            n1Var.f3501c = new HashMap();
            n1Var.f3503e = ".ttf";
            if (callback instanceof View) {
                n1Var.f3502d = ((View) callback).getContext().getAssets();
            } else {
                ve.c.b("LottieDrawable must be inside of a view for images to work.");
                n1Var.f3502d = null;
            }
            this.f21990j = n1Var;
            String str = this.l;
            if (str != null) {
                n1Var.f3503e = str;
            }
        }
        return this.f21990j;
    }

    public final void l() {
        this.f21987g.clear();
        ve.e eVar = this.f21982b;
        eVar.i(true);
        Iterator it = eVar.f42254c.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(eVar);
        }
        if (isVisible()) {
            return;
        }
        this.f21986f = y.NONE;
    }

    public final void m() {
        if (this.f21995p == null) {
            this.f21987g.add(new v(this, 1));
            return;
        }
        e();
        boolean zB = b(i());
        ve.e eVar = this.f21982b;
        if (zB || eVar.getRepeatCount() == 0) {
            if (isVisible()) {
                eVar.f42263m = true;
                boolean zD = eVar.d();
                Iterator it = eVar.f42253b.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationStart(eVar, zD);
                }
                eVar.j((int) (eVar.d() ? eVar.b() : eVar.c()));
                eVar.f42257f = 0L;
                eVar.f42260i = 0;
                if (eVar.f42263m) {
                    eVar.i(false);
                    Choreographer.getInstance().postFrameCallback(eVar);
                }
                this.f21986f = y.NONE;
            } else {
                this.f21986f = y.PLAY;
            }
        }
        if (b(i())) {
            return;
        }
        Iterator it2 = Q.iterator();
        oe.i iVarD = null;
        while (it2.hasNext()) {
            iVarD = this.f21981a.d((String) it2.next());
            if (iVarD != null) {
                break;
            }
        }
        if (iVarD != null) {
            q((int) iVarD.f32479b);
        } else {
            q((int) (eVar.f42255d < 0.0f ? eVar.c() : eVar.b()));
        }
        eVar.i(true);
        eVar.f(eVar.d());
        if (isVisible()) {
            return;
        }
        this.f21986f = y.NONE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(android.graphics.Canvas r12, re.d r13) {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: he.z.n(android.graphics.Canvas, re.d):void");
    }

    public final void o() {
        if (this.f21995p == null) {
            this.f21987g.add(new v(this, 0));
            return;
        }
        e();
        boolean zB = b(i());
        ve.e eVar = this.f21982b;
        if (zB || eVar.getRepeatCount() == 0) {
            if (isVisible()) {
                eVar.f42263m = true;
                eVar.i(false);
                Choreographer.getInstance().postFrameCallback(eVar);
                eVar.f42257f = 0L;
                if (eVar.d() && eVar.f42259h == eVar.c()) {
                    eVar.j(eVar.b());
                } else if (!eVar.d() && eVar.f42259h == eVar.b()) {
                    eVar.j(eVar.c());
                }
                Iterator it = eVar.f42254c.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(eVar);
                }
                this.f21986f = y.NONE;
            } else {
                this.f21986f = y.RESUME;
            }
        }
        if (b(i())) {
            return;
        }
        q((int) (eVar.f42255d < 0.0f ? eVar.c() : eVar.b()));
        eVar.i(true);
        eVar.f(eVar.d());
        if (isVisible()) {
            return;
        }
        this.f21986f = y.NONE;
    }

    public final boolean p(k kVar) {
        if (this.f21981a == kVar) {
            return false;
        }
        this.L = true;
        d();
        this.f21981a = kVar;
        c();
        ve.e eVar = this.f21982b;
        boolean z11 = eVar.l == null;
        eVar.l = kVar;
        if (z11) {
            eVar.k(Math.max(eVar.f42261j, kVar.l), Math.min(eVar.f42262k, kVar.f21937m));
        } else {
            eVar.k((int) kVar.l, (int) kVar.f21937m);
        }
        float f11 = eVar.f42259h;
        eVar.f42259h = 0.0f;
        eVar.f42258g = 0.0f;
        eVar.j((int) f11);
        eVar.h();
        z(eVar.getAnimatedFraction());
        ArrayList arrayList = this.f21987g;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            x xVar = (x) it.next();
            if (xVar != null) {
                xVar.run();
            }
            it.remove();
        }
        arrayList.clear();
        kVar.f21926a.f21912a = this.f21997r;
        e();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final void q(int i11) {
        if (this.f21981a != null) {
            this.f21982b.j(i11);
        } else {
            this.f21987g.add(new q(this, i11, 0));
        }
    }

    public final void r(int i11) {
        if (this.f21981a == null) {
            this.f21987g.add(new q(this, i11, 1));
        } else {
            ve.e eVar = this.f21982b;
            eVar.k(eVar.f42261j, i11 + 0.99f);
        }
    }

    public final void s(String str) {
        k kVar = this.f21981a;
        if (kVar == null) {
            this.f21987g.add(new p(this, str, 1));
            return;
        }
        oe.i iVarD = kVar.d(str);
        if (iVarD != null) {
            r((int) (iVarD.f32479b + iVarD.f32480c));
        } else {
            i4.a.f(w.a0.p("Cannot find marker with name ", str, "."));
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j9) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j9);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        this.f21996q = i11;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        ve.c.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z11, boolean z12) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z11, z12);
        if (z11) {
            y yVar = this.f21986f;
            if (yVar == y.PLAY) {
                m();
                return visible;
            }
            if (yVar == y.RESUME) {
                o();
                return visible;
            }
        } else {
            if (this.f21982b.f42263m) {
                l();
                this.f21986f = y.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.f21986f = y.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        m();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f21987g.clear();
        ve.e eVar = this.f21982b;
        eVar.i(true);
        eVar.f(eVar.d());
        if (isVisible()) {
            return;
        }
        this.f21986f = y.NONE;
    }

    public final void t(final int i11, final int i12) {
        if (this.f21981a == null) {
            this.f21987g.add(new x() { // from class: he.s
                @Override // he.x
                public final void run() {
                    this.f21965a.t(i11, i12);
                }
            });
        } else {
            this.f21982b.k(i11, i12 + 0.99f);
        }
    }

    public final void u(String str) {
        k kVar = this.f21981a;
        if (kVar == null) {
            this.f21987g.add(new p(this, str, 0));
            return;
        }
        oe.i iVarD = kVar.d(str);
        if (iVarD == null) {
            i4.a.f(w.a0.p("Cannot find marker with name ", str, "."));
        } else {
            int i11 = (int) iVarD.f32479b;
            t(i11, ((int) iVarD.f32480c) + i11);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final void v(final String str, final String str2, final boolean z11) {
        k kVar = this.f21981a;
        if (kVar == null) {
            this.f21987g.add(new x() { // from class: he.w
                @Override // he.x
                public final void run() {
                    this.f21977a.v(str, str2, z11);
                }
            });
            return;
        }
        oe.i iVarD = kVar.d(str);
        if (iVarD == null) {
            i4.a.f(w.a0.p("Cannot find marker with name ", str, "."));
            return;
        }
        int i11 = (int) iVarD.f32479b;
        oe.i iVarD2 = this.f21981a.d(str2);
        if (iVarD2 != null) {
            t(i11, (int) (iVarD2.f32479b + (z11 ? 1.0f : 0.0f)));
        } else {
            i4.a.f(w.a0.p("Cannot find marker with name ", str2, "."));
        }
    }

    public final void w(final float f11, final float f12) {
        k kVar = this.f21981a;
        if (kVar == null) {
            this.f21987g.add(new x() { // from class: he.r
                @Override // he.x
                public final void run() {
                    this.f21962a.w(f11, f12);
                }
            });
        } else {
            int iF = (int) ve.g.f(kVar.l, kVar.f21937m, f11);
            k kVar2 = this.f21981a;
            t(iF, (int) ve.g.f(kVar2.l, kVar2.f21937m, f12));
        }
    }

    public final void x(int i11) {
        if (this.f21981a == null) {
            this.f21987g.add(new q(this, i11, 2));
        } else {
            this.f21982b.k(i11, (int) r0.f42262k);
        }
    }

    public final void y(String str) {
        k kVar = this.f21981a;
        if (kVar == null) {
            this.f21987g.add(new p(this, str, 2));
            return;
        }
        oe.i iVarD = kVar.d(str);
        if (iVarD != null) {
            x((int) iVarD.f32479b);
        } else {
            i4.a.f(w.a0.p("Cannot find marker with name ", str, "."));
        }
    }

    public final void z(float f11) {
        k kVar = this.f21981a;
        if (kVar == null) {
            this.f21987g.add(new u(this, f11, 2));
        } else {
            a aVar = e.f21898a;
            this.f21982b.j(ve.g.f(kVar.l, kVar.f21937m, f11));
        }
    }
}
