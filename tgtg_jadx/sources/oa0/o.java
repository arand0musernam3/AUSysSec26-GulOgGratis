package oa0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f32354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f32355e;

    public o(m0 m0Var, q90.d0 d0Var, k kVar, f fVar, boolean z11) {
        super(m0Var, d0Var, kVar);
        this.f32354d = fVar;
        this.f32355e = z11;
    }

    @Override // oa0.p
    public final Object a(w wVar, Object[] objArr) {
        d dVar = (d) this.f32354d.l(wVar);
        x70.c cVar = (x70.c) objArr[objArr.length - 1];
        try {
            if (!this.f32355e) {
                return u0.b(dVar, cVar);
            }
            dVar.getClass();
            return u0.c(dVar, cVar);
        } catch (LinkageError e5) {
            throw e5;
        } catch (ThreadDeath e11) {
            throw e11;
        } catch (VirtualMachineError e12) {
            throw e12;
        } catch (Throwable th2) {
            return u0.q(th2, cVar);
        }
    }
}
