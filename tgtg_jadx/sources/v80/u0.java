package v80;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class u0 extends x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f42163e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f42164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f42165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kotlin.collections.t f42166d;

    public final void A0(boolean z11) {
        long j9 = this.f42164b - (z11 ? 4294967296L : 1L);
        this.f42164b = j9;
        if (j9 <= 0 && this.f42165c) {
            shutdown();
        }
    }

    public final void B0(n0 n0Var) {
        kotlin.collections.t tVar = this.f42166d;
        if (tVar == null) {
            tVar = new kotlin.collections.t();
            this.f42166d = tVar;
        }
        tVar.addLast(n0Var);
    }

    public final void C0(boolean z11) {
        this.f42164b = (z11 ? 4294967296L : 1L) + this.f42164b;
        if (z11) {
            return;
        }
        this.f42165c = true;
    }

    public abstract long D0();

    public final boolean E0() {
        kotlin.collections.t tVar = this.f42166d;
        if (tVar == null) {
            return false;
        }
        n0 n0Var = (n0) (tVar.isEmpty() ? null : tVar.removeFirst());
        if (n0Var == null) {
            return false;
        }
        n0Var.run();
        return true;
    }

    public abstract void shutdown();

    @Override // v80.x
    public final x z0(int i11) {
        a90.g.c(i11);
        return this;
    }
}
