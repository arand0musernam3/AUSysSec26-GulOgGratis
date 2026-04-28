package r;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f37415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f37416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f37417c;

    public b(c cVar, c cVar2, int i11) {
        this.f37417c = i11;
        this.f37415a = cVar2;
        this.f37416b = cVar;
    }

    @Override // r.e
    public final void a(c cVar) {
        c cVar2;
        c cVarB = null;
        if (this.f37415a == cVar && cVar == this.f37416b) {
            this.f37416b = null;
            this.f37415a = null;
        }
        c cVar3 = this.f37415a;
        if (cVar3 == cVar) {
            switch (this.f37417c) {
                case 0:
                    cVar2 = cVar3.f37421d;
                    break;
                default:
                    cVar2 = cVar3.f37420c;
                    break;
            }
            this.f37415a = cVar2;
        }
        c cVar4 = this.f37416b;
        if (cVar4 == cVar) {
            c cVar5 = this.f37415a;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVarB = b(cVar4);
            }
            this.f37416b = cVarB;
        }
    }

    public final c b(c cVar) {
        switch (this.f37417c) {
            case 0:
                return cVar.f37420c;
            default:
                return cVar.f37421d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f37416b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f37416b;
        c cVar2 = this.f37415a;
        this.f37416b = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
