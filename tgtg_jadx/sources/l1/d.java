package l1;

import kotlin.jvm.internal.Intrinsics;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f26763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f26764d;

    public d(int i11, int i12, b bVar, String str) {
        this.f26761a = i11;
        this.f26762b = i12;
        this.f26763c = bVar;
        this.f26764d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f26761a == dVar.f26761a && this.f26762b == dVar.f26762b && this.f26763c == dVar.f26763c && Intrinsics.areEqual(this.f26764d, dVar.f26764d);
    }

    public final int hashCode() {
        int iB = k.b(this.f26762b, Integer.hashCode(this.f26761a) * 31, 31);
        b bVar = this.f26763c;
        return this.f26764d.hashCode() + ((iB + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ViewfinderSurfaceRequest(width=");
        sb2.append(this.f26761a);
        sb2.append(", height=");
        sb2.append(this.f26762b);
        sb2.append(", implementationMode=");
        sb2.append(this.f26763c);
        sb2.append(", requestId=");
        return l1.f(sb2, this.f26764d, ')');
    }
}
