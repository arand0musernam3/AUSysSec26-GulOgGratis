package r5;

import a3.f2;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import b0.j3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m2.h0;
import m2.j0;
import m5.q0;
import m5.t0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f37652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j30.g f37653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j3 f37654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f37655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Function1 f37656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Function1 f37657f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y f37658g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m f37659h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f37660i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f37661j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f37662k;
    public final c l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o3.e f37663m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m0.l f37664n;

    public c0(View view, c5.y yVar) {
        j30.g gVar = new j30.g(view);
        j3 j3Var = new j3(Choreographer.getInstance(), 1);
        this.f37652a = view;
        this.f37653b = gVar;
        this.f37654c = j3Var;
        this.f37656e = b.f37630d;
        this.f37657f = b.f37631e;
        this.f37658g = new y(4, t0.f29648b, "");
        this.f37659h = m.f37688g;
        this.f37660i = new ArrayList();
        this.f37661j = u70.l.a(u70.m.NONE, new ky.i(this, 12));
        this.l = new c(yVar, gVar);
        this.f37663m = new o3.e(new a0[16], 0);
    }

    @Override // r5.t
    public final void a() {
        i(a0.StartInput);
    }

    @Override // r5.t
    public final void b(h4.c cVar) {
        Rect rect;
        this.f37662k = new Rect(j80.c.b(cVar.f21380a), j80.c.b(cVar.f21381b), j80.c.b(cVar.f21382c), j80.c.b(cVar.f21383d));
        if (!this.f37660i.isEmpty() || (rect = this.f37662k) == null) {
            return;
        }
        this.f37652a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // r5.t
    public final void c() {
        i(a0.ShowKeyboard);
    }

    @Override // r5.t
    public final void d(y yVar, m mVar, h0 h0Var, j0 j0Var) {
        this.f37655d = true;
        this.f37658g = yVar;
        this.f37659h = mVar;
        this.f37656e = h0Var;
        this.f37657f = j0Var;
        i(a0.StartInput);
    }

    @Override // r5.t
    public final void e() {
        this.f37655d = false;
        this.f37656e = b.f37632f;
        this.f37657f = b.f37633g;
        this.f37662k = null;
        i(a0.StopInput);
    }

    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r14v22, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, u70.j] */
    @Override // r5.t
    public final void f(y yVar, y yVar2) {
        boolean z11 = (t0.c(this.f37658g.f37715b, yVar2.f37715b) && Intrinsics.areEqual(this.f37658g.f37716c, yVar2.f37716c)) ? false : true;
        this.f37658g = yVar2;
        int size = this.f37660i.size();
        for (int i11 = 0; i11 < size; i11++) {
            u uVar = (u) ((WeakReference) this.f37660i.get(i11)).get();
            if (uVar != null) {
                uVar.f37703d = yVar2;
            }
        }
        c cVar = this.l;
        synchronized (cVar.f37637c) {
            cVar.f37644j = null;
            cVar.l = null;
            cVar.f37645k = null;
            cVar.f37646m = b.f37628b;
            cVar.f37647n = null;
            cVar.f37648o = null;
        }
        if (Intrinsics.areEqual(yVar, yVar2)) {
            if (z11) {
                j30.g gVar = this.f37653b;
                int iG = t0.g(yVar2.f37715b);
                int iF = t0.f(yVar2.f37715b);
                t0 t0Var = this.f37658g.f37716c;
                int iG2 = t0Var != null ? t0.g(t0Var.f29650a) : -1;
                t0 t0Var2 = this.f37658g.f37716c;
                ((InputMethodManager) gVar.f24503c.getValue()).updateSelection((View) gVar.f24502b, iG, iF, iG2, t0Var2 != null ? t0.f(t0Var2.f29650a) : -1);
                return;
            }
            return;
        }
        if (yVar != null && (!Intrinsics.areEqual(yVar.f37714a.f29538b, yVar2.f37714a.f29538b) || (t0.c(yVar.f37715b, yVar2.f37715b) && !Intrinsics.areEqual(yVar.f37716c, yVar2.f37716c)))) {
            j30.g gVar2 = this.f37653b;
            ((InputMethodManager) gVar2.f24503c.getValue()).restartInput((View) gVar2.f24502b);
            return;
        }
        int size2 = this.f37660i.size();
        for (int i12 = 0; i12 < size2; i12++) {
            u uVar2 = (u) ((WeakReference) this.f37660i.get(i12)).get();
            if (uVar2 != null) {
                y yVar3 = this.f37658g;
                j30.g gVar3 = this.f37653b;
                if (uVar2.f37707h) {
                    uVar2.f37703d = yVar3;
                    if (uVar2.f37705f) {
                        ((InputMethodManager) gVar3.f24503c.getValue()).updateExtractedText((View) gVar3.f24502b, uVar2.f37704e, o30.e0.F(yVar3));
                    }
                    t0 t0Var3 = yVar3.f37716c;
                    long j9 = yVar3.f37715b;
                    int iG3 = t0Var3 != null ? t0.g(t0Var3.f29650a) : -1;
                    t0 t0Var4 = yVar3.f37716c;
                    ((InputMethodManager) gVar3.f24503c.getValue()).updateSelection((View) gVar3.f24502b, t0.g(j9), t0.f(j9), iG3, t0Var4 != null ? t0.f(t0Var4.f29650a) : -1);
                }
            }
        }
    }

    @Override // r5.t
    public final void g() {
        i(a0.HideKeyboard);
    }

    @Override // r5.t
    public final void h(y yVar, s sVar, q0 q0Var, f2 f2Var, h4.c cVar, h4.c cVar2) {
        c cVar3 = this.l;
        synchronized (cVar3.f37637c) {
            try {
                cVar3.f37644j = yVar;
                cVar3.l = sVar;
                cVar3.f37645k = q0Var;
                cVar3.f37646m = f2Var;
                cVar3.f37647n = cVar;
                cVar3.f37648o = cVar2;
                if (cVar3.f37639e || cVar3.f37638d) {
                    cVar3.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(a0 a0Var) {
        this.f37663m.b(a0Var);
        if (this.f37664n == null) {
            m0.l lVar = new m0.l(this, 13);
            this.f37654c.execute(lVar);
            this.f37664n = lVar;
        }
    }
}
