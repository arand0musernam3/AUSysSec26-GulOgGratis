package b0;

import android.util.Rational;
import android.util.Size;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements m0.d0, s0.n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0.i1 f5038b;

    public a(s0.i1 i1Var) {
        this.f5037a = 1;
        this.f5038b = i1Var;
        s0.g gVar = y0.i.f44570e1;
        Class cls = (Class) i1Var.i(gVar, null);
        if (cls != null && !cls.equals(m0.j0.class)) {
            m0.i1.k("Invalid target class configuration for ", this, ": ", cls);
            throw null;
        }
        i1Var.v(s0.o2.U0, s0.q2.IMAGE_CAPTURE);
        i1Var.v(gVar, m0.j0.class);
        s0.g gVar2 = y0.i.f44569d1;
        if (i1Var.i(gVar2, null) == null) {
            i1Var.v(gVar2, m0.j0.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    public b a() {
        return new b(s0.l1.e(this.f5038b));
    }

    public m0.j0 b() {
        s0.g gVar = s0.b1.f38288e;
        s0.i1 i1Var = this.f5038b;
        Integer num = (Integer) i1Var.i(gVar, null);
        if (num != null) {
            i1Var.v(s0.c1.f38307w0, num);
        } else {
            m0.h0 h0Var = m0.j0.C;
            s0.g gVar2 = s0.b1.f38289f;
            if (Objects.equals(i1Var.i(gVar2, null), 2)) {
                i1Var.v(s0.c1.f38307w0, 32);
            } else if (Objects.equals(i1Var.i(gVar2, null), 3)) {
                i1Var.v(s0.c1.f38307w0, 32);
                i1Var.v(s0.c1.f38308x0, 256);
            } else if (Objects.equals(i1Var.i(gVar2, null), 1)) {
                i1Var.v(s0.c1.f38307w0, 4101);
                i1Var.v(s0.c1.f38309y0, m0.c0.f28477c);
            } else {
                i1Var.v(s0.c1.f38307w0, 256);
            }
        }
        s0.b1 b1Var = new s0.b1(s0.l1.e(i1Var));
        s0.d1.l(b1Var);
        m0.j0 j0Var = new m0.j0(b1Var);
        Size size = (Size) i1Var.i(s0.d1.D0, null);
        if (size != null) {
            j0Var.f28540v = new Rational(size.getWidth(), size.getHeight());
        }
        pd.g.m((Executor) i1Var.i(y0.e.f44558c1, w.b.Q()), "The IO executor can't be null");
        s0.g gVar3 = s0.b1.f38286c;
        if (i1Var.f38383a.containsKey(gVar3)) {
            Integer num2 = (Integer) i1Var.d(gVar3);
            if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                j4.d.o(num2, "The flash mode is not allowed to set: ");
                return null;
            }
            if (num2.intValue() == 3 && i1Var.i(s0.b1.f38294k, null) == null) {
                i4.a.f("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
                return null;
            }
        }
        return j0Var;
    }

    public void c(s0.u0 u0Var) {
        u0Var.getClass();
        for (s0.g gVar : u0Var.c()) {
            gVar.getClass();
            this.f5038b.x(gVar, u0Var.f(gVar), u0Var.d(gVar));
        }
    }

    @Override // m0.d0
    public final s0.i1 d() {
        switch (this.f5037a) {
            case 0:
                throw null;
            default:
                return this.f5038b;
        }
    }

    @Override // s0.n2
    public s0.o2 f() {
        return new s0.b1(s0.l1.e(this.f5038b));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(int i11) {
        this(s0.i1.h());
        this.f5037a = i11;
        switch (i11) {
            case 1:
                break;
            default:
                this.f5038b = s0.i1.h();
                break;
        }
    }
}
