package h50;

import java.io.Serializable;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f21484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f21486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21490h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f21491i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i f21492j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f21493k;

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this == jVar) {
            return true;
        }
        return this.f21483a == jVar.f21483a && this.f21484b == jVar.f21484b && this.f21486d.equals(jVar.f21486d) && this.f21488f == jVar.f21488f && this.f21490h == jVar.f21490h && this.f21491i.equals(jVar.f21491i) && this.f21492j == jVar.f21492j && this.f21493k.equals(jVar.f21493k);
    }

    public final int hashCode() {
        return ((this.f21493k.hashCode() + ((this.f21492j.hashCode() + l1.b((((l1.b((Long.valueOf(this.f21484b).hashCode() + ((2173 + this.f21483a) * 53)) * 53, 53, this.f21486d) + (this.f21488f ? 1231 : 1237)) * 53) + this.f21490h) * 53, 53, this.f21491i)) * 53)) * 53) + 1237;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Country Code: ");
        sb2.append(this.f21483a);
        sb2.append(" National Number: ");
        sb2.append(this.f21484b);
        if (this.f21487e && this.f21488f) {
            sb2.append(" Leading Zero(s): true");
        }
        if (this.f21489g) {
            sb2.append(" Number of leading zeros: ");
            sb2.append(this.f21490h);
        }
        if (this.f21485c) {
            sb2.append(" Extension: ");
            sb2.append(this.f21486d);
        }
        return sb2.toString();
    }
}
