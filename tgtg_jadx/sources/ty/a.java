package ty;

import c50.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f40608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f40609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f40610c;

    public a(Object obj, d dVar, b bVar) {
        this.f40608a = obj;
        if (dVar == null) {
            w.l("Null priority");
            throw null;
        }
        this.f40609b = dVar;
        this.f40610c = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f40608a.equals(aVar.f40608a) || !this.f40609b.equals(aVar.f40609b)) {
            return false;
        }
        b bVar = aVar.f40610c;
        b bVar2 = this.f40610c;
        return bVar2 == null ? bVar == null : bVar2.equals(bVar);
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.f40608a.hashCode()) * 1000003) ^ this.f40609b.hashCode()) * 1000003;
        b bVar = this.f40610c;
        return (iHashCode ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f40608a + ", priority=" + this.f40609b + ", productData=" + this.f40610c + ", eventContext=null}";
    }
}
