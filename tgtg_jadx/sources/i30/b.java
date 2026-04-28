package i30;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23201c;

    public /* synthetic */ b(Object obj, int i11) {
        this.f23200b = i11;
        this.f23201c = obj;
    }

    @Override // i30.o
    public final void b() {
        switch (this.f23200b) {
            case 0:
                c cVar = (c) ((a30.o) this.f23201c).f666b;
                cVar.f23204b.a("unlinkToDeath", new Object[0]);
                cVar.f23215n.asBinder().unlinkToDeath(cVar.f23213k, 0);
                cVar.f23215n = null;
                cVar.f23209g = false;
                return;
            default:
                synchronized (((c) this.f23201c).f23208f) {
                    try {
                        if (((c) this.f23201c).l.get() > 0 && ((c) this.f23201c).l.decrementAndGet() > 0) {
                            ((c) this.f23201c).f23204b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        c cVar2 = (c) this.f23201c;
                        if (cVar2.f23215n != null) {
                            cVar2.f23204b.a("Unbind from service.", new Object[0]);
                            c cVar3 = (c) this.f23201c;
                            cVar3.f23203a.unbindService(cVar3.f23214m);
                            c cVar4 = (c) this.f23201c;
                            cVar4.f23209g = false;
                            cVar4.f23215n = null;
                            cVar4.f23214m = null;
                        }
                        ((c) this.f23201c).c();
                        return;
                    } finally {
                    }
                }
        }
    }
}
