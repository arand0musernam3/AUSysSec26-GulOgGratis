package td;

import android.content.Context;
import java.util.Map;
import kotlin.collections.o0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f39957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f39958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f39959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public xd.b f39960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f39961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f39962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map f39963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CoroutineContext f39964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CoroutineContext f39965i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CoroutineContext f39966j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Function1 f39967k;
    public Function1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Function1 f39968m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ud.i f39969n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ud.g f39970o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ud.d f39971p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f39972q;

    public e(i iVar, Context context) {
        this.f39957a = context;
        this.f39958b = iVar.f40015u;
        this.f39959c = iVar.f39997b;
        this.f39960d = iVar.f39998c;
        this.f39961e = iVar.f39999d;
        this.f39963g = iVar.f40000e;
        g gVar = iVar.f40014t;
        this.f39964h = gVar.f39987a;
        this.f39965i = gVar.f39988b;
        this.f39966j = gVar.f39989c;
        this.f39967k = gVar.f39990d;
        this.l = gVar.f39991e;
        this.f39968m = gVar.f39992f;
        this.f39969n = gVar.f39993g;
        this.f39970o = gVar.f39994h;
        this.f39971p = gVar.f39995i;
        this.f39972q = iVar.f40013s;
    }

    public final i a() {
        Map mapM;
        fd.k kVar;
        Object obj = this.f39959c;
        if (obj == null) {
            obj = n.f40029a;
        }
        Object obj2 = obj;
        xd.b bVar = this.f39960d;
        h hVar = this.f39961e;
        Map map = this.f39963g;
        if (Intrinsics.areEqual(map, Boolean.valueOf(this.f39962f))) {
            map.getClass();
            mapM = android.support.v4.media.session.a.M(TypeIntrinsics.asMutableMap(map));
        } else {
            if (!(map instanceof Map)) {
                throw new AssertionError();
            }
            mapM = map;
        }
        Map map2 = mapM;
        map2.getClass();
        f fVar = this.f39958b;
        ia0.m mVar = fVar.f39974a;
        b bVar2 = fVar.f39978e;
        b bVar3 = fVar.f39979f;
        b bVar4 = fVar.f39980g;
        CoroutineContext coroutineContext = this.f39964h;
        if (coroutineContext == null) {
            coroutineContext = fVar.f39975b;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        CoroutineContext coroutineContext3 = this.f39965i;
        if (coroutineContext3 == null) {
            coroutineContext3 = fVar.f39976c;
        }
        CoroutineContext coroutineContext4 = coroutineContext3;
        CoroutineContext coroutineContext5 = this.f39966j;
        if (coroutineContext5 == null) {
            coroutineContext5 = fVar.f39977d;
        }
        CoroutineContext coroutineContext6 = coroutineContext5;
        Function1 function1 = this.f39967k;
        if (function1 == null) {
            function1 = fVar.f39981h;
        }
        Function1 function12 = function1;
        Function1 function13 = this.l;
        if (function13 == null) {
            function13 = fVar.f39982i;
        }
        Function1 function14 = function13;
        Function1 function15 = this.f39968m;
        if (function15 == null) {
            function15 = fVar.f39983j;
        }
        Function1 function16 = function15;
        ud.i iVar = this.f39969n;
        if (iVar == null) {
            iVar = fVar.f39984k;
        }
        ud.i iVar2 = iVar;
        ud.g gVar = this.f39970o;
        if (gVar == null) {
            gVar = fVar.l;
        }
        ud.g gVar2 = gVar;
        ud.d dVar = this.f39971p;
        if (dVar == null) {
            dVar = fVar.f39985m;
        }
        ud.d dVar2 = dVar;
        Object obj3 = this.f39972q;
        if (obj3 instanceof fd.i) {
            kVar = new fd.k(android.support.v4.media.session.a.M(((fd.i) obj3).f17566a));
        } else {
            if (!(obj3 instanceof fd.k)) {
                throw new AssertionError();
            }
            kVar = (fd.k) obj3;
        }
        return new i(this.f39957a, obj2, bVar, hVar, map2, mVar, coroutineContext2, coroutineContext4, coroutineContext6, bVar2, bVar3, bVar4, function12, function14, function16, iVar2, gVar2, dVar2, kVar, new g(this.f39964h, this.f39965i, this.f39966j, this.f39967k, this.l, this.f39968m, this.f39969n, this.f39970o, this.f39971p), this.f39958b);
    }

    public e(Context context) {
        this.f39957a = context;
        this.f39958b = f.f39973o;
        this.f39959c = null;
        this.f39960d = null;
        this.f39961e = null;
        o0 o0Var = o0.f26530a;
        o0Var.getClass();
        this.f39963g = o0Var;
        this.f39964h = null;
        this.f39965i = null;
        this.f39966j = null;
        ae.n nVar = ae.n.f1261a;
        this.f39967k = nVar;
        this.l = nVar;
        this.f39968m = nVar;
        this.f39969n = null;
        this.f39970o = null;
        this.f39971p = null;
        this.f39972q = fd.k.f17569b;
    }
}
