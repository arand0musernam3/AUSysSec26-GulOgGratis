package gt;

import com.app.tgtg.model.local.ViewedRecipe;
import com.app.tgtg.model.remote.order.Order;
import ib.d0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends y9.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20863a;

    public m(w wVar) {
        this.f20863a = 1;
    }

    @Override // y9.d
    public final void a(ha.c cVar, Object obj) {
        int i11;
        int i12 = 1;
        switch (this.f20863a) {
            case 0:
                cv.e eVar = (cv.e) obj;
                cVar.getClass();
                eVar.getClass();
                cVar.j(1, eVar.f13452r);
                break;
            case 1:
                Order order = (Order) obj;
                cVar.getClass();
                order.getClass();
                String strM429getOrderIdreIZeYA = order.m429getOrderIdreIZeYA();
                strM429getOrderIdreIZeYA.getClass();
                cVar.C(1, strM429getOrderIdreIZeYA);
                break;
            case 2:
                ViewedRecipe viewedRecipe = (ViewedRecipe) obj;
                cVar.getClass();
                viewedRecipe.getClass();
                cVar.j(1, viewedRecipe.getId());
                cVar.C(2, viewedRecipe.getRecipeJson());
                cVar.C(3, viewedRecipe.getRecipeName());
                cVar.j(4, viewedRecipe.getViewedAt());
                cVar.j(5, viewedRecipe.getId());
                break;
            default:
                qb.o oVar = (qb.o) obj;
                cVar.getClass();
                oVar.getClass();
                String str = oVar.f36828a;
                cVar.C(1, str);
                cVar.j(2, xz.b.K(oVar.f36829b));
                cVar.C(3, oVar.f36830c);
                cVar.C(4, oVar.f36831d);
                ib.h hVar = ib.h.f23726b;
                cVar.k(5, ex.i.L(oVar.f36832e));
                cVar.k(6, ex.i.L(oVar.f36833f));
                cVar.j(7, oVar.f36834g);
                cVar.j(8, oVar.f36835h);
                cVar.j(9, oVar.f36836i);
                cVar.j(10, oVar.f36838k);
                ib.a aVar = oVar.l;
                aVar.getClass();
                int i13 = qb.z.$EnumSwitchMapping$1[aVar.ordinal()];
                if (i13 == 1) {
                    i11 = 0;
                } else if (i13 != 2) {
                    e40.a.f();
                } else {
                    i11 = 1;
                }
                cVar.j(11, i11);
                cVar.j(12, oVar.f36839m);
                cVar.j(13, oVar.f36840n);
                cVar.j(14, oVar.f36841o);
                cVar.j(15, oVar.f36842p);
                cVar.j(16, oVar.f36843q ? 1L : 0L);
                d0 d0Var = oVar.f36844r;
                d0Var.getClass();
                int i14 = qb.z.$EnumSwitchMapping$3[d0Var.ordinal()];
                if (i14 == 1) {
                    i12 = 0;
                } else if (i14 != 2) {
                    e40.a.f();
                }
                cVar.j(17, i12);
                cVar.j(18, oVar.f36845s);
                cVar.j(19, oVar.f36846t);
                cVar.j(20, oVar.f36847u);
                cVar.j(21, oVar.f36848v);
                cVar.j(22, oVar.f36849w);
                String str2 = oVar.f36850x;
                if (str2 == null) {
                    cVar.m(23);
                } else {
                    cVar.C(23, str2);
                }
                Boolean bool = oVar.f36851y;
                if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
                    cVar.m(24);
                } else {
                    cVar.j(24, r1.intValue());
                }
                ib.e eVar2 = oVar.f36837j;
                cVar.j(25, xz.b.G(eVar2.f23711a));
                cVar.k(26, xz.b.s(eVar2.f23712b));
                cVar.j(27, eVar2.f23713c ? 1L : 0L);
                cVar.j(28, eVar2.f23714d ? 1L : 0L);
                cVar.j(29, eVar2.f23715e ? 1L : 0L);
                cVar.j(30, eVar2.f23716f ? 1L : 0L);
                cVar.j(31, eVar2.f23717g);
                cVar.j(32, eVar2.f23718h);
                cVar.k(33, xz.b.J(eVar2.f23719i));
                cVar.C(34, str);
                break;
        }
    }

    @Override // y9.d
    public final String b() {
        switch (this.f20863a) {
            case 0:
                return "DELETE FROM `impressions` WHERE `id` = ?";
            case 1:
                return "DELETE FROM `orders` WHERE `orderId` = ?";
            case 2:
                return "UPDATE OR ABORT `viewed_recipes` SET `id` = ?,`recipe_json` = ?,`recipe_name` = ?,`viewed_at` = ? WHERE `id` = ?";
            default:
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }
    }

    public /* synthetic */ m(int i11) {
        this.f20863a = i11;
    }
}
