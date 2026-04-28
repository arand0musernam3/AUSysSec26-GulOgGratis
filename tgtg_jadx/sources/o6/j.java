package o6;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends t {
    @Override // o6.e
    public final void a(e eVar) {
        g gVar = this.f32036h;
        if (gVar.f32005c && !gVar.f32012j) {
            gVar.d((int) ((((g) gVar.l.get(0)).f32009g * ((n6.l) this.f32030b).f30649v0) + 0.5f));
        }
    }

    @Override // o6.t
    public final void d() {
        n6.g gVar = this.f32030b;
        n6.l lVar = (n6.l) gVar;
        int i11 = lVar.f30650w0;
        int i12 = lVar.f30651x0;
        int i13 = lVar.f30653z0;
        g gVar2 = this.f32036h;
        if (i13 == 1) {
            if (i11 != -1) {
                gVar2.l.add(gVar.W.f30580d.f32036h);
                this.f32030b.W.f30580d.f32036h.f32013k.add(gVar2);
                gVar2.f32008f = i11;
            } else if (i12 != -1) {
                gVar2.l.add(gVar.W.f30580d.f32037i);
                this.f32030b.W.f30580d.f32037i.f32013k.add(gVar2);
                gVar2.f32008f = -i12;
            } else {
                gVar2.f32004b = true;
                gVar2.l.add(gVar.W.f30580d.f32037i);
                this.f32030b.W.f30580d.f32037i.f32013k.add(gVar2);
            }
            m(this.f32030b.f30580d.f32036h);
            m(this.f32030b.f30580d.f32037i);
            return;
        }
        if (i11 != -1) {
            gVar2.l.add(gVar.W.f30582e.f32036h);
            this.f32030b.W.f30582e.f32036h.f32013k.add(gVar2);
            gVar2.f32008f = i11;
        } else if (i12 != -1) {
            gVar2.l.add(gVar.W.f30582e.f32037i);
            this.f32030b.W.f30582e.f32037i.f32013k.add(gVar2);
            gVar2.f32008f = -i12;
        } else {
            gVar2.f32004b = true;
            gVar2.l.add(gVar.W.f30582e.f32037i);
            this.f32030b.W.f30582e.f32037i.f32013k.add(gVar2);
        }
        m(this.f32030b.f30582e.f32036h);
        m(this.f32030b.f30582e.f32037i);
    }

    @Override // o6.t
    public final void e() {
        n6.g gVar = this.f32030b;
        int i11 = ((n6.l) gVar).f30653z0;
        g gVar2 = this.f32036h;
        if (i11 == 1) {
            gVar.f30577b0 = gVar2.f32009g;
        } else {
            gVar.f30579c0 = gVar2.f32009g;
        }
    }

    @Override // o6.t
    public final void f() {
        this.f32036h.c();
    }

    @Override // o6.t
    public final boolean k() {
        return false;
    }

    public final void m(g gVar) {
        g gVar2 = this.f32036h;
        gVar2.f32013k.add(gVar);
        gVar.l.add(gVar2);
    }
}
