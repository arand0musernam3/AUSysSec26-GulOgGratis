package v1;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import z1.z3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f41833j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f41834k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w4.y f41835m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u f41836n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(w4.y yVar, u uVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f41833j = i11;
        this.f41835m = yVar;
        this.f41836n = uVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f41833j) {
            case 0:
                s sVar = new s(this.f41835m, this.f41836n, cVar, 0);
                sVar.l = obj;
                return sVar;
            default:
                s sVar2 = new s(this.f41835m, this.f41836n, cVar, 1);
                sVar2.l = obj;
                return sVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f41833j) {
        }
        return ((s) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f41833j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f41834k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    r rVar = new r((v80.b0) this.l, this.f41836n, null, 0);
                    this.f41834k = 1;
                    if (z3.e(this.f41835m, rVar, this) == aVar) {
                    }
                }
                break;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f41834k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    r rVar2 = new r((v80.b0) this.l, this.f41836n, null, 1);
                    this.f41834k = 1;
                    if (((w4.m0) this.f41835m).L0(rVar2, this) == aVar2) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
