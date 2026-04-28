package r0;

import android.util.Size;
import c50.w;
import java.util.ArrayList;
import m0.e1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s0.p f37430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e1 f37431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e1 f37432d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Size f37434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f37435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f37436h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f37437i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c1.f f37438j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c1.f f37439k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s0.p f37429a = new j();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e1 f37433e = null;

    public a(Size size, int i11, ArrayList arrayList, boolean z11, c1.f fVar, c1.f fVar2) {
        if (size == null) {
            w.l("Null size");
            throw null;
        }
        this.f37434f = size;
        this.f37435g = i11;
        this.f37436h = arrayList;
        this.f37437i = z11;
        this.f37438j = fVar;
        this.f37439k = fVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f37434f.equals(aVar.f37434f) && this.f37435g == aVar.f37435g && this.f37436h.equals(aVar.f37436h) && this.f37437i == aVar.f37437i && this.f37438j.equals(aVar.f37438j) && this.f37439k.equals(aVar.f37439k);
    }

    public final int hashCode() {
        return ((((((((((this.f37434f.hashCode() ^ 1000003) * 1000003) ^ this.f37435g) * 1000003) ^ this.f37436h.hashCode()) * 1000003) ^ (this.f37437i ? 1231 : 1237)) * 583896283) ^ this.f37438j.hashCode()) * 1000003) ^ this.f37439k.hashCode();
    }

    public final String toString() {
        return "In{size=" + this.f37434f + ", inputFormat=" + this.f37435g + ", outputFormats=" + this.f37436h + ", virtualCamera=" + this.f37437i + ", imageReaderProxyProvider=null, postviewSettings=null, requestEdge=" + this.f37438j + ", errorEdge=" + this.f37439k + "}";
    }
}
