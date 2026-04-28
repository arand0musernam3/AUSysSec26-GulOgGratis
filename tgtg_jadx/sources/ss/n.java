package ss;

import ao.f2;
import ao.r3;
import com.app.tgtg.model.remote.specialrewards.SpecialReward;
import com.app.tgtg.model.remote.specialrewards.response.SpecialRewardsResponse;
import com.braze.h2;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f39216j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f39217k;
    public final /* synthetic */ w l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i11, w wVar, x70.c cVar) {
        super(2, cVar);
        this.f39216j = i11;
        this.l = wVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f39216j) {
            case 0:
                return new n(0, this.l, cVar);
            default:
                return new n(1, this.l, cVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f39216j) {
        }
        return ((n) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        int i11 = this.f39216j;
        w wVar = this.l;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f39217k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    f2 f2Var = wVar.f39254b;
                    this.f39217k = 1;
                    objC = f2Var.c(this);
                    if (objC == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                    objC = ((u70.q) obj).f40851a;
                }
                u70.o oVar = u70.q.f40850b;
                if (objC instanceof u70.p) {
                    objC = null;
                }
                SpecialRewardsResponse specialRewardsResponse = (SpecialRewardsResponse) objC;
                List<SpecialReward> specialRewards = specialRewardsResponse != null ? specialRewardsResponse.getSpecialRewards() : null;
                return specialRewards == null ? kotlin.collections.n0.f26529a : specialRewards;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f39217k;
                if (i13 != 0) {
                    if (i13 == 1) {
                        ba0.g.M(obj);
                        return obj;
                    }
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                r3 r3Var = wVar.f39253a;
                this.f39217k = 1;
                Serializable serializableD = r3Var.d(this);
                return serializableD == aVar2 ? aVar2 : serializableD;
        }
    }
}
