package xy;

import android.content.Context;
import c50.w;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fz.a f44505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fz.a f44506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f44507d;

    public b(Context context, fz.a aVar, fz.a aVar2, String str) {
        if (context == null) {
            w.l("Null applicationContext");
            throw null;
        }
        this.f44504a = context;
        if (aVar == null) {
            w.l("Null wallClock");
            throw null;
        }
        this.f44505b = aVar;
        if (aVar2 == null) {
            w.l("Null monotonicClock");
            throw null;
        }
        this.f44506c = aVar2;
        if (str != null) {
            this.f44507d = str;
        } else {
            w.l("Null backendName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            b bVar = (b) ((d) obj);
            if (this.f44504a.equals(bVar.f44504a) && this.f44505b.equals(bVar.f44505b) && this.f44506c.equals(bVar.f44506c) && this.f44507d.equals(bVar.f44507d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f44504a.hashCode() ^ 1000003) * 1000003) ^ this.f44505b.hashCode()) * 1000003) ^ this.f44506c.hashCode()) * 1000003) ^ this.f44507d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f44504a);
        sb2.append(", wallClock=");
        sb2.append(this.f44505b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f44506c);
        sb2.append(", backendName=");
        return k.p(sb2, this.f44507d, "}");
    }
}
