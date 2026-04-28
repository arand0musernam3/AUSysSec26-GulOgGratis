package d4;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.lifecycle.LifecycleOwner;
import b5.n1;
import c5.e3;
import c5.y;
import com.google.android.gms.internal.measurement.cg;
import j5.t;
import j5.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import q1.g0;
import q1.o;
import q1.p;
import x80.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements androidx.lifecycle.h, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f14032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b40.d f14033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f14034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f14035d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f14036e = 100;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f14037f = a.SHOW_ORIGINAL;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14038g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f14039h = cg.a(1, null, null, 6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Handler f14040i = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g0 f14041j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f14042k;
    public final g0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e3 f14043m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14044n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d1.e f14045o;

    public e(y yVar, b40.d dVar) {
        this.f14032a = yVar;
        this.f14033b = dVar;
        g0 g0Var = p.f35804a;
        g0Var.getClass();
        this.f14041j = g0Var;
        this.l = new g0();
        this.f14043m = new e3(yVar.getSemanticsOwner().a(), g0Var);
        this.f14045o = new d1.e(this, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007c -> B:17:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(z70.c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof d4.c
            if (r0 == 0) goto L13
            r0 = r8
            d4.c r0 = (d4.c) r0
            int r1 = r0.f14030m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14030m = r1
            goto L18
        L13:
            d4.c r0 = new d4.c
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f14029k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f14030m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2c
            x80.b r2 = r0.f14028j
            ba0.g.M(r8)
            goto L46
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L33:
            x80.b r2 = r0.f14028j
            ba0.g.M(r8)
            goto L51
        L39:
            ba0.g.M(r8)
            x80.i r8 = r7.f14039h
            r8.getClass()
            x80.b r2 = new x80.b
            r2.<init>(r8)
        L46:
            r0.f14028j = r2
            r0.f14030m = r4
            java.lang.Object r8 = r2.b(r0)
            if (r8 != r1) goto L51
            goto L7e
        L51:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7f
            r2.c()
            boolean r8 = r7.f()
            if (r8 == 0) goto L65
            r7.h()
        L65:
            boolean r8 = r7.f14044n
            if (r8 != 0) goto L72
            r7.f14044n = r4
            android.os.Handler r8 = r7.f14040i
            d1.e r5 = r7.f14045o
            r8.post(r5)
        L72:
            r0.f14028j = r2
            r0.f14030m = r3
            long r5 = r7.f14036e
            java.lang.Object r8 = v80.f0.o(r5, r0)
            if (r8 != r1) goto L46
        L7e:
            return r1
        L7f:
            kotlin.Unit r8 = kotlin.Unit.f26487a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.e.a(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(q1.o r34) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.e.b(q1.o):void");
    }

    public final void c(t tVar, Function2 function2) {
        tVar.getClass();
        List listJ = t.j(4, tVar);
        int size = listJ.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = listJ.get(i12);
            if (d().a(((t) obj).f24699g)) {
                function2.invoke(Integer.valueOf(i11), obj);
                i11++;
            }
        }
    }

    public final o d() {
        if (this.f14038g) {
            this.f14038g = false;
            this.f14041j = w.b(this.f14032a.getSemanticsOwner(), d.f14031a);
            this.f14042k = System.currentTimeMillis();
        }
        return this.f14041j;
    }

    public final boolean f() {
        return this.f14034c != null;
    }

    public final void h() {
        h hVar = this.f14034c;
        if (hVar != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f14035d;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                f fVar = (f) arrayList.get(i11);
                int i12 = b.$EnumSwitchMapping$0[fVar.f14048c.ordinal()];
                if (i12 == 1) {
                    se.b bVar = fVar.f14049d;
                    if (bVar != null) {
                        ((f5.a) hVar).d((ViewStructure) bVar.f39010b);
                    }
                } else {
                    if (i12 != 2) {
                        e40.a.f();
                        return;
                    }
                    f5.a aVar = (f5.a) hVar;
                    AutofillId autofillIdB = aVar.b(fVar.f14046a);
                    if (autofillIdB != null) {
                        aVar.e(autofillIdB);
                    }
                }
            }
            ((f5.a) hVar).a();
            arrayList.clear();
        }
    }

    public final void i(t tVar, e3 e3Var) {
        c(tVar, new n1(2, e3Var, this));
        List listJ = t.j(4, tVar);
        int size = listJ.size();
        for (int i11 = 0; i11 < size; i11++) {
            t tVar2 = (t) listJ.get(i11);
            o oVarD = d();
            int i12 = tVar2.f24699g;
            if (oVarD.a(i12)) {
                g0 g0Var = this.l;
                if (g0Var.a(i12)) {
                    Object objB = g0Var.b(i12);
                    if (objB == null) {
                        throw b3.i.D("node not present in pruned tree before this change");
                    }
                    i(tVar2, (e3) objB);
                } else {
                    continue;
                }
            }
        }
    }

    public final void j(int i11, String str) {
        h hVar;
        if (Build.VERSION.SDK_INT >= 29 && (hVar = this.f14034c) != null) {
            f5.a aVar = (f5.a) hVar;
            AutofillId autofillIdB = aVar.b(i11);
            if (autofillIdB == null) {
                throw b3.i.D("Invalid content capture ID");
            }
            aVar.f(autofillIdB, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a A[PHI: r3
      0x008a: PHI (r3v5 android.view.autofill.AutofillId) = (r3v4 android.view.autofill.AutofillId), (r3v17 android.view.autofill.AutofillId) binds: [B:30:0x007b, B:32:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(int r14, j5.t r15) {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.e.k(int, j5.t):void");
    }

    public final void l(t tVar) {
        if (f()) {
            this.f14035d.add(new f(tVar.f24699g, this.f14042k, g.VIEW_DISAPPEAR, null));
            List listJ = t.j(4, tVar);
            int size = listJ.size();
            for (int i11 = 0; i11 < size; i11++) {
                l((t) listJ.get(i11));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            r17 = this;
            r0 = r17
            q1.g0 r1 = r0.l
            r1.c()
            q1.o r2 = r0.d()
            int[] r3 = r2.f35799b
            java.lang.Object[] r4 = r2.f35800c
            long[] r2 = r2.f35798a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L5e
            r7 = 0
        L17:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L31:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            j5.u r13 = (j5.u) r13
            c5.e3 r15 = new c5.e3
            j5.t r13 = r13.f24700a
            q1.o r6 = r0.d()
            r15.<init>(r13, r6)
            r1.i(r14, r15)
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L31
        L57:
            if (r10 != r11) goto L5e
        L59:
            if (r7 == r5) goto L5e
            int r7 = r7 + 1
            goto L17
        L5e:
            c5.e3 r1 = new c5.e3
            c5.y r2 = r0.f14032a
            j5.v r2 = r2.getSemanticsOwner()
            j5.t r2 = r2.a()
            q1.o r3 = r0.d()
            r1.<init>(r2, r3)
            r0.f14043m = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.e.m():void");
    }

    @Override // androidx.lifecycle.h
    public final void onStart(LifecycleOwner lifecycleOwner) {
        this.f14034c = (h) this.f14033b.invoke();
        k(-1, this.f14032a.getSemanticsOwner().a());
        h();
    }

    @Override // androidx.lifecycle.h
    public final void onStop(LifecycleOwner lifecycleOwner) {
        l(this.f14032a.getSemanticsOwner().a());
        h();
        this.f14034c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f14040i.removeCallbacks(this.f14045o);
        this.f14034c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
