package r5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m f37688g = new m(false, 0, true, 1, 1, t5.c.f39795c);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f37691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f37692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f37693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t5.c f37694f;

    public m(boolean z11, int i11, boolean z12, int i12, int i13, t5.c cVar) {
        this.f37689a = z11;
        this.f37690b = i11;
        this.f37691c = z12;
        this.f37692d = i12;
        this.f37693e = i13;
        this.f37694f = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f37689a == mVar.f37689a && this.f37690b == mVar.f37690b && this.f37691c == mVar.f37691c && this.f37692d == mVar.f37692d && this.f37693e == mVar.f37693e && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f37694f, mVar.f37694f);
    }

    public final int hashCode() {
        return this.f37694f.f39796a.hashCode() + r8.k.b(this.f37693e, r8.k.b(this.f37692d, r8.k.e(r8.k.b(this.f37690b, Boolean.hashCode(this.f37689a) * 31, 31), 31, this.f37691c), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.f37689a + ", capitalization=" + ((Object) n.a(this.f37690b)) + ", autoCorrect=" + this.f37691c + ", keyboardType=" + ((Object) o.a(this.f37692d)) + ", imeAction=" + ((Object) l.a(this.f37693e)) + ", platformImeOptions=null, hintLocales=" + this.f37694f + ')';
    }
}
