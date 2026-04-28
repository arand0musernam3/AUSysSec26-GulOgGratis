package bn;

import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.b1;
import m3.h1;
import m3.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f6493j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6494k;
    public final /* synthetic */ b1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ym.z f6495m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ BaseItemMnuV2 f6496n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h1 f6497o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i1 f6498p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(b1 b1Var, ym.z zVar, BaseItemMnuV2 baseItemMnuV2, h1 h1Var, i1 i1Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f6493j = i11;
        this.l = b1Var;
        this.f6495m = zVar;
        this.f6496n = baseItemMnuV2;
        this.f6497o = h1Var;
        this.f6498p = i1Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f6493j) {
            case 0:
                return new n(this.l, this.f6495m, this.f6496n, this.f6497o, this.f6498p, cVar, 0);
            default:
                return new n(this.l, this.f6495m, this.f6496n, this.f6497o, this.f6498p, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f6493j) {
        }
        return ((n) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f6493j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f6494k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    long jH = this.f6498p.h();
                    this.f6494k = 1;
                    if (v80.f0.o(jH, this) == aVar) {
                    }
                }
                this.l.setValue(Boolean.FALSE);
                ym.z zVar = this.f6495m;
                if (zVar != null) {
                    zVar.i(this.f6496n.m393getItemIdFvU5WIY(), this.f6497o.h(), true);
                }
                break;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f6494k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    long jH2 = this.f6498p.h();
                    this.f6494k = 1;
                    if (v80.f0.o(jH2, this) == aVar2) {
                    }
                }
                this.l.setValue(Boolean.FALSE);
                ym.z zVar2 = this.f6495m;
                if (zVar2 != null) {
                    zVar2.i(this.f6496n.m393getItemIdFvU5WIY(), this.f6497o.h(), true);
                }
                break;
        }
        return Unit.f26487a;
    }
}
