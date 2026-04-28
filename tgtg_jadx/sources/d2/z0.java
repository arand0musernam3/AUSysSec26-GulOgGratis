package d2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z0 extends b4.s implements b5.q2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public y2 f13981o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public y2 f13982p;

    public z0() {
        j0 j0Var = c.f13757c;
        this.f13981o = j0Var;
        this.f13982p = j0Var;
    }

    public abstract y2 L0(y2 y2Var);

    public void M0() {
        this.f13982p = L0(this.f13981o);
        b5.o.q(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new y0(this, 0));
    }

    @Override // b5.q2
    public final Object g() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    @Override // b4.s
    public void onAttach() {
        b5.o.o(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new y0(this, 1));
        M0();
    }

    @Override // b4.s
    public void onDetach() {
        this.f13982p = this.f13981o;
        b5.o.q(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new y0(this, 0));
        super.onDetach();
    }

    @Override // b4.s
    public final void onReset() {
        super.onReset();
        this.f13981o = c.f13757c;
    }
}
