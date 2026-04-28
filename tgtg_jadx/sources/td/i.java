package td;

import android.content.Context;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f39996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f39997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xd.b f39998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f39999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f40000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ia0.m f40001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CoroutineContext f40002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CoroutineContext f40003h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CoroutineContext f40004i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f40005j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f40006k;
    public final b l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Function1 f40007m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Function1 f40008n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Function1 f40009o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ud.i f40010p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ud.g f40011q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ud.d f40012r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final fd.k f40013s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g f40014t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final f f40015u;

    public i(Context context, Object obj, xd.b bVar, h hVar, Map map, ia0.m mVar, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, b bVar2, b bVar3, b bVar4, Function1 function1, Function1 function12, Function1 function13, ud.i iVar, ud.g gVar, ud.d dVar, fd.k kVar, g gVar2, f fVar) {
        this.f39996a = context;
        this.f39997b = obj;
        this.f39998c = bVar;
        this.f39999d = hVar;
        this.f40000e = map;
        this.f40001f = mVar;
        this.f40002g = coroutineContext;
        this.f40003h = coroutineContext2;
        this.f40004i = coroutineContext3;
        this.f40005j = bVar2;
        this.f40006k = bVar3;
        this.l = bVar4;
        this.f40007m = function1;
        this.f40008n = function12;
        this.f40009o = function13;
        this.f40010p = iVar;
        this.f40011q = gVar;
        this.f40012r = dVar;
        this.f40013s = kVar;
        this.f40014t = gVar2;
        this.f40015u = fVar;
    }

    public static e a(i iVar) {
        Context context = iVar.f39996a;
        iVar.getClass();
        return new e(iVar, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f39996a, iVar.f39996a) && Intrinsics.areEqual(this.f39997b, iVar.f39997b) && Intrinsics.areEqual(this.f39998c, iVar.f39998c) && Intrinsics.areEqual(this.f39999d, iVar.f39999d) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f40000e, iVar.f40000e) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f40001f, iVar.f40001f) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f40002g, iVar.f40002g) && Intrinsics.areEqual(this.f40003h, iVar.f40003h) && Intrinsics.areEqual(this.f40004i, iVar.f40004i) && this.f40005j == iVar.f40005j && this.f40006k == iVar.f40006k && this.l == iVar.l && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f40007m, iVar.f40007m) && Intrinsics.areEqual(this.f40008n, iVar.f40008n) && Intrinsics.areEqual(this.f40009o, iVar.f40009o) && Intrinsics.areEqual(this.f40010p, iVar.f40010p) && this.f40011q == iVar.f40011q && this.f40012r == iVar.f40012r && Intrinsics.areEqual(this.f40013s, iVar.f40013s) && Intrinsics.areEqual(this.f40014t, iVar.f40014t) && Intrinsics.areEqual(this.f40015u, iVar.f40015u);
    }

    public final int hashCode() {
        int iHashCode = (this.f39997b.hashCode() + (this.f39996a.hashCode() * 31)) * 31;
        xd.b bVar = this.f39998c;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        h hVar = this.f39999d;
        return this.f40015u.hashCode() + ((this.f40014t.hashCode() + a0.f(this.f40013s.f17570a, (this.f40012r.hashCode() + ((this.f40011q.hashCode() + ((this.f40010p.hashCode() + r8.k.d(r8.k.d(r8.k.d((this.l.hashCode() + ((this.f40006k.hashCode() + ((this.f40005j.hashCode() + ((this.f40004i.hashCode() + ((this.f40003h.hashCode() + ((this.f40002g.hashCode() + ((this.f40001f.hashCode() + a0.f(this.f40000e, (iHashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 961, 961)) * 29791)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961, 31, this.f40007m), 31, this.f40008n), 31, this.f40009o)) * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "ImageRequest(context=" + this.f39996a + ", data=" + this.f39997b + ", target=" + this.f39998c + ", listener=" + this.f39999d + ", memoryCacheKey=null, memoryCacheKeyExtras=" + this.f40000e + ", diskCacheKey=null, fileSystem=" + this.f40001f + ", fetcherFactory=null, decoderFactory=null, interceptorCoroutineContext=" + this.f40002g + ", fetcherCoroutineContext=" + this.f40003h + ", decoderCoroutineContext=" + this.f40004i + ", memoryCachePolicy=" + this.f40005j + ", diskCachePolicy=" + this.f40006k + ", networkCachePolicy=" + this.l + ", placeholderMemoryCacheKey=null, placeholderFactory=" + this.f40007m + ", errorFactory=" + this.f40008n + ", fallbackFactory=" + this.f40009o + ", sizeResolver=" + this.f40010p + ", scale=" + this.f40011q + ", precision=" + this.f40012r + ", extras=" + this.f40013s + ", defined=" + this.f40014t + ", defaults=" + this.f40015u + ")";
    }
}
