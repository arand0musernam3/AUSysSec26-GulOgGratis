package e;

import androidx.activity.e0;
import c5.z0;
import com.google.android.gms.internal.measurement.cg;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;
import v80.b0;
import v80.b2;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends c5.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f15290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Function2 f15291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x80.i f15292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b2 f15293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15294g;

    public j(b0 b0Var, o oVar) {
        super(oVar);
        this.f15290c = b0Var;
        this.f15291d = new z0(2, null, 2);
    }

    @Override // c5.b
    public final void o() {
        x80.i iVar = this.f15292e;
        if (iVar != null) {
            iVar.n(new CancellationException("onBack cancelled"), true);
        }
        b2 b2Var = this.f15293f;
        if (b2Var != null) {
            b2Var.a(null);
        }
        this.f15292e = null;
        this.f15293f = null;
        this.f15294g = false;
    }

    @Override // c5.b
    public final void p() {
        if (this.f15292e != null && !this.f15294g) {
            o();
        }
        if (this.f15292e == null) {
            this.f15294g = false;
            this.f15292e = cg.a(-2, x80.a.SUSPEND, null, 4);
            this.f15293f = f0.B(this.f15290c, null, null, new i(this, null), 3);
        }
        x80.i iVar = this.f15292e;
        if (iVar != null) {
            iVar.m(null);
        }
        this.f15294g = false;
    }

    @Override // c5.b
    public final void q(androidx.activity.b bVar) {
        x80.i iVar = this.f15292e;
        if (iVar != null) {
            iVar.h(bVar);
        }
    }

    @Override // c5.b
    public final void r() {
        o();
        if (super.n()) {
            this.f15294g = true;
            this.f15292e = cg.a(-2, x80.a.SUSPEND, null, 4);
            this.f15293f = f0.B(this.f15290c, null, null, new i(this, null), 3);
        }
    }

    public final void z(boolean z11) {
        b2 b2Var;
        if (!z11 && super.n() && (b2Var = this.f15293f) != null && !b2Var.g()) {
            o();
        }
        ((e0) this.f7113a).setEnabled(z11);
        ((f.a) this.f7114b).g(z11);
    }
}
