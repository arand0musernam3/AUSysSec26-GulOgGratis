package c40;

import al.u;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import ax.a0;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.common.internal.i0;
import h2.j0;
import h2.p1;
import ia0.h0;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import t1.w1;
import y00.e1;
import z4.y1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f7090f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f7094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f7095e;

    public q(int i11) {
        this.f7091a = i11;
        switch (i11) {
            case 5:
                this.f7093c = new Object();
                this.f7094d = new ArrayList();
                this.f7095e = new ArrayList();
                this.f7092b = true;
                break;
            default:
                tx.j.n();
                tx.d dVar = new tx.d(this, 2);
                this.f7093c = dVar;
                d9.c cVarA = d9.c.a(a0.a());
                cVarA.getClass();
                this.f7094d = cVarA;
                if (!this.f7092b) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
                    cVarA.b(dVar, intentFilter);
                    this.f7092b = true;
                    break;
                }
                break;
        }
    }

    public void a() {
        s90.g gVar = (s90.g) this.f7095e;
        synchronized (gVar) {
            try {
                if (this.f7092b) {
                    throw new IllegalStateException("Check failed.");
                }
                if (Intrinsics.areEqual(((s90.d) this.f7093c).f38922g, this)) {
                    gVar.e(this, false);
                }
                this.f7092b = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b() {
        s90.g gVar = (s90.g) this.f7095e;
        synchronized (gVar) {
            try {
                if (this.f7092b) {
                    throw new IllegalStateException("Check failed.");
                }
                if (Intrinsics.areEqual(((s90.d) this.f7093c).f38922g, this)) {
                    gVar.e(this, true);
                }
                this.f7092b = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(boolean z11) {
        switch (this.f7091a) {
            case 3:
                jd.e eVar = (jd.e) this.f7095e;
                synchronized (eVar.f24973h) {
                    try {
                        if (this.f7092b) {
                            throw new IllegalStateException("editor is closed");
                        }
                        if (Intrinsics.areEqual(((jd.b) this.f7093c).f24959g, this)) {
                            jd.e.a(eVar, this, z11);
                        }
                        this.f7092b = true;
                    } finally {
                    }
                }
                return;
            default:
                rc.e eVar2 = (rc.e) this.f7095e;
                synchronized (eVar2) {
                    try {
                        if (this.f7092b) {
                            throw new IllegalStateException("editor is closed");
                        }
                        if (Intrinsics.areEqual(((rc.b) this.f7093c).f37865g, this)) {
                            rc.e.a(eVar2, this, z11);
                        }
                        this.f7092b = true;
                    } finally {
                    }
                }
                return;
        }
    }

    public void d() {
        s90.d dVar = (s90.d) this.f7093c;
        if (Intrinsics.areEqual(dVar.f38922g, this)) {
            s90.g gVar = (s90.g) this.f7095e;
            if (gVar.l) {
                gVar.e(this, false);
            } else {
                dVar.f38921f = true;
            }
        }
    }

    public ia0.a0 e(int i11) {
        ia0.a0 a0Var;
        ia0.a0 a0Var2;
        switch (this.f7091a) {
            case 3:
                jd.e eVar = (jd.e) this.f7095e;
                synchronized (eVar.f24973h) {
                    if (this.f7092b) {
                        throw new IllegalStateException("editor is closed");
                    }
                    ((boolean[]) this.f7094d)[i11] = true;
                    Object obj = ((jd.b) this.f7093c).f24956d.get(i11);
                    ba0.g.k(eVar.f24981q, (ia0.a0) obj);
                    a0Var = (ia0.a0) obj;
                }
                return a0Var;
            default:
                rc.e eVar2 = (rc.e) this.f7095e;
                synchronized (eVar2) {
                    if (this.f7092b) {
                        throw new IllegalStateException("editor is closed");
                    }
                    ((boolean[]) this.f7094d)[i11] = true;
                    Object obj2 = ((rc.b) this.f7093c).f37862d.get(i11);
                    rc.d dVar = eVar2.f37886p;
                    ia0.a0 a0Var3 = (ia0.a0) obj2;
                    if (!dVar.u(a0Var3)) {
                        ed.k.a(dVar.I(a0Var3, false));
                    }
                    a0Var2 = (ia0.a0) obj2;
                }
                return a0Var2;
        }
    }

    public void f() {
        pg.n nVar = (pg.n) this.f7093c;
        NestedScrollView nestedScrollView = nVar.C;
        nestedScrollView.getClass();
        LinearLayout linearLayout = nVar.f35001t;
        p30.b.i(linearLayout.getHeight(), nestedScrollView);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (((double) linearLayout.getHeight()) * 1.5d), 0.0f);
        translateAnimation.setDuration(500L);
        translateAnimation.setAnimationListener(new c70.a(new sg.c(nVar, 18), new w1(18)));
        new Handler(Looper.getMainLooper()).postDelayed(new v30.a(2, nVar, translateAnimation), 500L);
    }

    public h0 g(int i11) {
        s90.g gVar = (s90.g) this.f7095e;
        synchronized (gVar) {
            try {
                if (this.f7092b) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!Intrinsics.areEqual(((s90.d) this.f7093c).f38922g, this)) {
                    return new ia0.e();
                }
                if (!((s90.d) this.f7093c).f38920e) {
                    boolean[] zArr = (boolean[]) this.f7094d;
                    zArr.getClass();
                    zArr[i11] = true;
                }
                ia0.a0 a0Var = (ia0.a0) ((s90.d) this.f7093c).f38919d.get(i11);
                try {
                    s90.f fVar = gVar.f38936b;
                    fVar.getClass();
                    a0Var.getClass();
                    return new rc.f(fVar.I(a0Var, false), new ry.b(2, gVar, this));
                } catch (FileNotFoundException unused) {
                    return new ia0.e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean h(String str, String str2) {
        synchronized (this) {
            try {
                if (!((e) ((AtomicMarkableReference) this.f7093c).getReference()).b(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.f7093c;
                atomicMarkableReference.set((e) atomicMarkableReference.getReference(), true);
                u uVar = new u(this, 18);
                AtomicReference atomicReference = (AtomicReference) this.f7094d;
                while (!atomicReference.compareAndSet(null, uVar)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((b40.f) ((g40.b) this.f7095e).f20002c).f5743b.a(uVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String i() {
        if (!this.f7092b) {
            this.f7092b = true;
            e1 e1Var = (e1) this.f7095e;
            this.f7094d = e1Var.t().getString((String) this.f7093c, null);
        }
        return (String) this.f7094d;
    }

    public void j(String str) {
        SharedPreferences.Editor editorEdit = ((e1) this.f7095e).t().edit();
        editorEdit.putString((String) this.f7093c, str);
        editorEdit.apply();
        this.f7094d = str;
    }

    public q(pg.n nVar) {
        this.f7091a = 8;
        nVar.getClass();
        this.f7093c = nVar;
    }

    public q(e1 e1Var, String str) {
        this.f7091a = 9;
        this.f7095e = e1Var;
        i0.e(str);
        this.f7093c = str;
    }

    public q(g40.b bVar, boolean z11) {
        this.f7091a = 0;
        this.f7095e = bVar;
        this.f7094d = new AtomicReference(null);
        this.f7092b = z11;
        this.f7093c = new AtomicMarkableReference(new e(z11 ? 8192 : 1024), false);
    }

    public q(j0 j0Var, y1 y1Var, p1 p1Var) {
        this.f7091a = 2;
        this.f7093c = j0Var;
        this.f7094d = y1Var;
        this.f7095e = p1Var;
        this.f7092b = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(LoginButton loginButton) {
        this(1);
        this.f7091a = 1;
        this.f7095e = loginButton;
    }

    public q(jd.e eVar, jd.b bVar) {
        this.f7091a = 3;
        this.f7095e = eVar;
        this.f7093c = bVar;
        this.f7094d = new boolean[2];
    }

    public q(rc.e eVar, rc.b bVar) {
        this.f7091a = 6;
        this.f7095e = eVar;
        this.f7093c = bVar;
        this.f7094d = new boolean[2];
    }

    public q(s90.g gVar, s90.d dVar) {
        boolean[] zArr;
        this.f7091a = 7;
        this.f7095e = gVar;
        this.f7093c = dVar;
        if (dVar.f38920e) {
            zArr = null;
        } else {
            gVar.getClass();
            zArr = new boolean[2];
        }
        this.f7094d = zArr;
    }

    public q(boolean z11, List list, List list2, jg.a0 a0Var) {
        this.f7091a = 4;
        this.f7092b = z11;
        this.f7093c = list;
        this.f7094d = list2;
        this.f7095e = a0Var;
    }
}
