package r;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f37422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f37423b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f37424c;

    public d(f fVar) {
        this.f37424c = fVar;
    }

    @Override // r.e
    public final void a(c cVar) {
        c cVar2 = this.f37422a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f37421d;
            this.f37422a = cVar3;
            this.f37423b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f37423b) {
            return this.f37424c.f37425a != null;
        }
        c cVar = this.f37422a;
        return (cVar == null || cVar.f37420c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f37423b) {
            this.f37423b = false;
            this.f37422a = this.f37424c.f37425a;
        } else {
            c cVar = this.f37422a;
            this.f37422a = cVar != null ? cVar.f37420c : null;
        }
        return this.f37422a;
    }
}
