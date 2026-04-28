package i30;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d10.g f23227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d30.c f23228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f23229d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(c cVar, d10.g gVar, d10.g gVar2, d30.c cVar2) {
        super(gVar);
        this.f23229d = cVar;
        this.f23227b = gVar2;
        this.f23228c = cVar2;
    }

    @Override // i30.o
    public final void b() {
        synchronized (this.f23229d.f23208f) {
            try {
                c cVar = this.f23229d;
                d10.g gVar = this.f23227b;
                cVar.f23207e.add(gVar);
                gVar.f13697a.addOnCompleteListener(new dn.k(17, cVar, gVar));
                if (this.f23229d.l.getAndIncrement() > 0) {
                    this.f23229d.f23204b.a("Already connected to the service.", new Object[0]);
                }
                c.b(this.f23229d, this.f23228c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
