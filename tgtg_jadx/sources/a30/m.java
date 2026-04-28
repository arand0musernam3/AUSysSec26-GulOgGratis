package a30;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f662c;

    public /* synthetic */ m(Object obj, int i11) {
        this.f661b = i11;
        this.f662c = obj;
    }

    @Override // a30.k
    public final void a() {
        switch (this.f661b) {
            case 0:
                synchronized (((p) this.f662c).f673f) {
                    try {
                        if (((p) this.f662c).f678k.get() > 0 && ((p) this.f662c).f678k.decrementAndGet() > 0) {
                            ((p) this.f662c).f669b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        p pVar = (p) this.f662c;
                        if (pVar.f679m != null) {
                            pVar.f669b.d("Unbind from service.", new Object[0]);
                            p pVar2 = (p) this.f662c;
                            pVar2.f668a.unbindService(pVar2.l);
                            p pVar3 = (p) this.f662c;
                            pVar3.f674g = false;
                            pVar3.f679m = null;
                            pVar3.l = null;
                        }
                        ((p) this.f662c).d();
                        return;
                    } finally {
                    }
                }
            default:
                p pVar4 = (p) ((o) this.f662c).f666b;
                pVar4.f669b.d("unlinkToDeath", new Object[0]);
                pVar4.f679m.asBinder().unlinkToDeath(pVar4.f677j, 0);
                pVar4.f679m = null;
                pVar4.f674g = false;
                return;
        }
    }
}
