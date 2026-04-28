package g3;

import android.content.Context;
import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b3 extends c5.a implements d6.b0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Window f18358i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m3.k1 f18359j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f18360k;

    public b3(Context context, Window window) {
        super(context);
        this.f18358i = window;
        this.f18359j = m3.i.w(s0.f19446d);
    }

    @Override // c5.a
    public final void a(m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(576708319);
        int i12 = (sVar.h(this) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            ((Function2) this.f18359j.getValue()).invoke(sVar, 0);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new y0(this, i11, 1);
        }
    }

    @Override // c5.a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f18360k;
    }

    @Override // d6.b0
    public final Window getWindow() {
        return this.f18358i;
    }

    public final void setContent(@NotNull m3.x xVar, @NotNull Function2<? super m3.n, ? super Integer, Unit> function2) {
        setParentCompositionContext(xVar);
        this.f18359j.setValue(function2);
        this.f18360k = true;
        c();
    }
}
