package pi;

import com.app.tgtg.model.remote.user.response.charity.CharityDaySchedule;
import com.app.tgtg.model.remote.user.response.charity.CharityDayScheduleStore;
import com.app.tgtg.model.remote.user.response.charity.CharityPlanCollectorType;
import com.app.tgtg.model.remote.user.response.charity.CharityScheduleResponseKt;
import com.braze.h2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import v80.b2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f35388j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m f35389k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, x70.c cVar) {
        super(2, cVar);
        this.f35389k = mVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new i(this.f35389k, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int size;
        List<CharityDayScheduleStore> stores;
        List<CharityDayScheduleStore> stores2;
        List<CharityDayScheduleStore> stores3;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f35388j;
        m mVar = this.f35389k;
        if (i11 == 0) {
            ba0.g.M(obj);
            b2 b2Var = mVar.f35404g;
            if (b2Var != null) {
                this.f35388j = 1;
                if (b2Var.B(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
        }
        q qVar = (q) mVar.f35411o.getValue();
        if (qVar instanceof p) {
            CharityDaySchedule charityDaySchedule = (CharityDaySchedule) ((p) qVar).f35416a.get(((Number) mVar.f35409m.getValue()).intValue());
            cv.i iVar = cv.i.SCREEN_PLANNED_DONATIONS;
            Pair pair = new Pair(dv.a.WEEK_NUMBER, new dv.c((Integer) mVar.f35406i.getValue()));
            Pair pair2 = new Pair(dv.a.DAY_PLANNED_DONATIONS, new dv.c(charityDaySchedule.getDate()));
            Pair pair3 = new Pair(dv.a.CHARITY_IS_AVAILABLE, new dv.c(Boolean.valueOf(charityDaySchedule instanceof CharityDaySchedule.Available)));
            dv.a aVar2 = dv.a.AVAILABLE_PLANNED_DONATIONS;
            CharityDaySchedule.Available available = CharityScheduleResponseKt.available(charityDaySchedule);
            int size2 = 0;
            Pair pair4 = new Pair(aVar2, new dv.c(new Integer((available == null || (stores3 = available.getStores()) == null) ? 0 : stores3.size())));
            dv.a aVar3 = dv.a.AVAILABLE_PRIMARY_DONATIONS;
            CharityDaySchedule.Available available2 = CharityScheduleResponseKt.available(charityDaySchedule);
            if (available2 == null || (stores2 = available2.getStores()) == null) {
                size = 0;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : stores2) {
                    if (((CharityDayScheduleStore) obj2).getCollectorType() == CharityPlanCollectorType.PRIMARY) {
                        arrayList.add(obj2);
                    }
                }
                size = arrayList.size();
            }
            Pair pair5 = new Pair(aVar3, new dv.c(new Integer(size)));
            dv.a aVar4 = dv.a.AVAILABLE_BACKUP_DONATIONS;
            CharityDaySchedule.Available available3 = CharityScheduleResponseKt.available(charityDaySchedule);
            if (available3 != null && (stores = available3.getStores()) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : stores) {
                    if (((CharityDayScheduleStore) obj3).getCollectorType() == CharityPlanCollectorType.BACKUP) {
                        arrayList2.add(obj3);
                    }
                }
                size2 = arrayList2.size();
            }
            dv.b bVarE = h0.g.E(pair, pair2, pair3, pair4, pair5, new Pair(aVar4, new dv.c(new Integer(size2))));
            iVar.getClass();
            mVar.f35401d.c(iVar, bVarE);
        }
        return Unit.f26487a;
    }
}
