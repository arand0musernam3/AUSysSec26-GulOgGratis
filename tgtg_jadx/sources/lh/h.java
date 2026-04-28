package lh;

import com.app.tgtg.model.remote.discover.request.BucketFillerType;
import com.app.tgtg.model.remote.item.QuickFilter;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.braze.h2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import v80.p0;
import y80.c2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends z70.i implements i80.n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f27794j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27795k;
    public /* synthetic */ y80.j l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f27796m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ w f27797n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(x70.c cVar, w wVar, int i11) {
        super(3, cVar);
        this.f27794j = i11;
        this.f27797n = wVar;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        y80.j jVar = (y80.j) obj;
        x70.c cVar = (x70.c) obj3;
        switch (this.f27794j) {
            case 0:
                h hVar = new h(cVar, this.f27797n, 0);
                hVar.l = jVar;
                hVar.f27796m = obj2;
                return hVar.invokeSuspend(Unit.f26487a);
            default:
                h hVar2 = new h(cVar, this.f27797n, 1);
                hVar2.l = jVar;
                hVar2.f27796m = obj2;
                return hVar2.invokeSuspend(Unit.f26487a);
        }
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        x70.c cVar = null;
        switch (this.f27794j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f27795k;
                if (i11 == 0) {
                    ba0.g.M(obj);
                    y80.j jVar = this.l;
                    b bVar = (b) this.f27796m;
                    boolean z11 = !bVar.f27778e.getFavorite();
                    w wVar = this.f27797n;
                    nh.b bVar2 = wVar.f27830b;
                    BasicItem basicItem = bVar.f27778e;
                    bVar2.getClass();
                    basicItem.getClass();
                    y80.u uVar = new y80.u(new at.o(new h2.a0(bVar2, basicItem, (x70.c) null, 27)), new a70.b(new is.h(bVar2, basicItem, cVar, 9), null, 0));
                    this.l = null;
                    this.f27796m = null;
                    this.f27795k = 1;
                    if (jVar instanceof c2) {
                        throw ((c2) jVar).f45459a;
                    }
                    Object objCollect = uVar.collect(new aa.m(jVar, wVar, z11, bVar, 1), this);
                    if (objCollect != aVar) {
                        objCollect = Unit.f26487a;
                    }
                    if (objCollect != aVar) {
                        objCollect = Unit.f26487a;
                    }
                    if (objCollect == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f27795k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    y80.j jVar2 = this.l;
                    e eVar = (e) this.f27796m;
                    w wVar2 = this.f27797n;
                    nh.b bVar3 = wVar2.f27830b;
                    BucketFillerType bucketFillerType = new BucketFillerType(eVar.f27785e);
                    LinkedHashSet linkedHashSet = wVar2.f27831c.f17903c;
                    int i13 = 10;
                    ArrayList arrayList = new ArrayList(kotlin.collections.e0.o(linkedHashSet, 10));
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((QuickFilter) it.next()).getId());
                    }
                    bVar3.getClass();
                    x70.c cVar2 = null;
                    y80.w wVar3 = new y80.w(new at.o(new al.n(bVar3, bucketFillerType, arrayList, cVar2, 28)), new is.h(bVar3, cVar2, i13), 5);
                    c90.f fVar = p0.f42144a;
                    y80.w wVar4 = new y80.w(new y80.w(new t(2, null, 0), new at.w(8, y80.r.s(wVar3, c90.e.f7834b), wVar2)), new u(3, null, 0));
                    this.l = null;
                    this.f27796m = null;
                    this.f27795k = 1;
                    if (y80.r.n(jVar2, wVar4, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
        }
    }
}
