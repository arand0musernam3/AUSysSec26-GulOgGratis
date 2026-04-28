package hm;

import com.app.tgtg.model.remote.brief.BriefOrder;
import com.braze.h2;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f22136j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public v f22137k;
    public Iterator l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f22138m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f22139n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ArrayList f22140o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v f22141p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(ArrayList arrayList, v vVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f22136j = i11;
        this.f22140o = arrayList;
        this.f22141p = vVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f22136j) {
            case 0:
                return new r(this.f22140o, this.f22141p, cVar, 0);
            default:
                return new r(this.f22140o, this.f22141p, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f22136j) {
        }
        return ((r) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11;
        v vVar;
        Iterator it;
        int i12;
        v vVar2;
        Iterator it2;
        switch (this.f22136j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f22139n;
                if (i13 == 0) {
                    ba0.g.M(obj);
                    Iterator it3 = this.f22140o.iterator();
                    i11 = 0;
                    vVar = this.f22141p;
                    it = it3;
                } else if (i13 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i11 = this.f22138m;
                    it = this.l;
                    vVar = this.f22137k;
                    ba0.g.M(obj);
                }
                while (it.hasNext()) {
                    BriefOrder briefOrder = (BriefOrder) it.next();
                    et.z zVar = vVar.f22152e;
                    this.f22137k = vVar;
                    this.l = it;
                    this.f22138m = i11;
                    this.f22139n = 1;
                    if (zVar.g(briefOrder, this) == aVar) {
                        break;
                    }
                }
                break;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f22139n;
                if (i14 == 0) {
                    ba0.g.M(obj);
                    Iterator it4 = this.f22140o.iterator();
                    i12 = 0;
                    vVar2 = this.f22141p;
                    it2 = it4;
                } else if (i14 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i12 = this.f22138m;
                    it2 = this.l;
                    vVar2 = this.f22137k;
                    ba0.g.M(obj);
                }
                while (it2.hasNext()) {
                    BriefOrder briefOrder2 = (BriefOrder) it2.next();
                    et.z zVar2 = vVar2.f22152e;
                    this.f22137k = vVar2;
                    this.l = it2;
                    this.f22138m = i12;
                    this.f22139n = 1;
                    if (zVar2.u(briefOrder2, this) == aVar2) {
                        break;
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
