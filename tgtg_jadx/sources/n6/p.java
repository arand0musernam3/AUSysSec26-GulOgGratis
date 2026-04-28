package n6;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p extends m {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f30657x0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f30658y0 = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f30659z0 = 0;
    public int A0 = 0;
    public int B0 = 0;
    public int C0 = 0;
    public boolean D0 = false;
    public int E0 = 0;
    public int F0 = 0;
    public final o6.b G0 = new o6.b();
    public o6.c H0 = null;

    @Override // n6.m
    public final void Y() {
        for (int i11 = 0; i11 < this.f30655w0; i11++) {
            g gVar = this.f30654v0[i11];
            if (gVar != null) {
                gVar.H = true;
            }
        }
    }

    public abstract void Z(int i11, int i12, int i13, int i14);

    public final void a0(g gVar, f fVar, int i11, f fVar2, int i12) {
        o6.c cVar;
        g gVar2;
        while (true) {
            cVar = this.H0;
            if (cVar != null || (gVar2 = this.W) == null) {
                break;
            } else {
                this.H0 = ((h) gVar2).f30623z0;
            }
        }
        o6.b bVar = this.G0;
        bVar.f31992a = fVar;
        bVar.f31993b = fVar2;
        bVar.f31994c = i11;
        bVar.f31995d = i12;
        cVar.b(gVar, bVar);
        gVar.T(bVar.f31996e);
        gVar.O(bVar.f31997f);
        gVar.F = bVar.f31999h;
        gVar.K(bVar.f31998g);
    }
}
