package td;

import ia0.w;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import v80.p0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f f39973o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ia0.m f39974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext f39975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineContext f39976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CoroutineContext f39977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f39978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f39979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f39980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Function1 f39981h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Function1 f39982i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Function1 f39983j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ud.i f39984k;
    public final ud.g l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ud.d f39985m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final fd.k f39986n;

    static {
        w wVar = ia0.m.f23661a;
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f26549a;
        c90.f fVar = p0.f42144a;
        c90.e eVar = c90.e.f7834b;
        b bVar = b.ENABLED;
        ud.e eVar2 = ud.i.f41062a1;
        ud.g gVar2 = ud.g.FIT;
        ud.d dVar = ud.d.EXACT;
        fd.k kVar = fd.k.f17569b;
        ae.n nVar = ae.n.f1261a;
        f39973o = new f(wVar, gVar, eVar, eVar, bVar, bVar, bVar, nVar, nVar, nVar, eVar2, gVar2, dVar, kVar);
    }

    public f(ia0.m mVar, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, b bVar, b bVar2, b bVar3, Function1 function1, Function1 function12, Function1 function13, ud.i iVar, ud.g gVar, ud.d dVar, fd.k kVar) {
        this.f39974a = mVar;
        this.f39975b = coroutineContext;
        this.f39976c = coroutineContext2;
        this.f39977d = coroutineContext3;
        this.f39978e = bVar;
        this.f39979f = bVar2;
        this.f39980g = bVar3;
        this.f39981h = function1;
        this.f39982i = function12;
        this.f39983j = function13;
        this.f39984k = iVar;
        this.l = gVar;
        this.f39985m = dVar;
        this.f39986n = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f39974a, fVar.f39974a) && Intrinsics.areEqual(this.f39975b, fVar.f39975b) && Intrinsics.areEqual(this.f39976c, fVar.f39976c) && Intrinsics.areEqual(this.f39977d, fVar.f39977d) && this.f39978e == fVar.f39978e && this.f39979f == fVar.f39979f && this.f39980g == fVar.f39980g && Intrinsics.areEqual(this.f39981h, fVar.f39981h) && Intrinsics.areEqual(this.f39982i, fVar.f39982i) && Intrinsics.areEqual(this.f39983j, fVar.f39983j) && Intrinsics.areEqual(this.f39984k, fVar.f39984k) && this.l == fVar.l && this.f39985m == fVar.f39985m && Intrinsics.areEqual(this.f39986n, fVar.f39986n);
    }

    public final int hashCode() {
        return this.f39986n.f17570a.hashCode() + ((this.f39985m.hashCode() + ((this.l.hashCode() + ((this.f39984k.hashCode() + r8.k.d(r8.k.d(r8.k.d((this.f39980g.hashCode() + ((this.f39979f.hashCode() + ((this.f39978e.hashCode() + ((this.f39977d.hashCode() + ((this.f39976c.hashCode() + ((this.f39975b.hashCode() + (this.f39974a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f39981h), 31, this.f39982i), 31, this.f39983j)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Defaults(fileSystem=" + this.f39974a + ", interceptorCoroutineContext=" + this.f39975b + ", fetcherCoroutineContext=" + this.f39976c + ", decoderCoroutineContext=" + this.f39977d + ", memoryCachePolicy=" + this.f39978e + ", diskCachePolicy=" + this.f39979f + ", networkCachePolicy=" + this.f39980g + ", placeholderFactory=" + this.f39981h + ", errorFactory=" + this.f39982i + ", fallbackFactory=" + this.f39983j + ", sizeResolver=" + this.f39984k + ", scale=" + this.l + ", precision=" + this.f39985m + ", extras=" + this.f39986n + ")";
    }
}
