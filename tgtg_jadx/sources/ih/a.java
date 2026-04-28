package ih;

import a3.z1;
import com.app.tgtg.feature.badges.ui.BadgesActivity;
import com.app.tgtg.feature.itemview.ui.ItemViewActivity;
import com.app.tgtg.feature.tabprofile.impact.orderList.OrderListActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.notificationsettings.ui.NotificationSettingsActivity;
import com.app.tgtg.model.remote.badge.BadgeCTADestination;
import com.app.tgtg.model.remote.item.response.Item;
import g9.c0;
import jb.u;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import mv.a0;
import mv.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BadgesActivity f23838b;

    public /* synthetic */ a(BadgesActivity badgesActivity, int i11) {
        this.f23837a = i11;
        this.f23838b = badgesActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f23837a;
        BadgesActivity badgesActivity = this.f23838b;
        switch (i11) {
            case 0:
                c0 c0Var = (c0) obj;
                int i12 = BadgesActivity.f8964i;
                c0Var.getClass();
                zz.f.m(c0Var, "screen_overview", new u3.d(new z1(badgesActivity, 6), true, -1435651559));
                break;
            case 1:
                BadgeCTADestination badgeCTADestination = (BadgeCTADestination) obj;
                int i13 = BadgesActivity.f8964i;
                badgeCTADestination.getClass();
                switch (b.$EnumSwitchMapping$0[badgeCTADestination.ordinal()]) {
                    case 1:
                    case 2:
                        f70.g gVar = badgesActivity.a0().f23859g.f14946a;
                        a0 a0Var = new a0();
                        z zVar = z.DISCOVER;
                        zVar.getClass();
                        a0Var.f30138a = zVar;
                        gVar.a(a0Var.b());
                        break;
                    case 3:
                        badgesActivity.a0().f23859g.f14946a.a(new f70.b(NotificationSettingsActivity.class, u.x(new Pair("OPEN_SYSTEM_SETTINGS", Boolean.FALSE)), false, false, false, null, null, null, null, false, 1020));
                        break;
                    case 4:
                        badgesActivity.a0().f23859g.f14946a.a(new f70.b(OrderListActivity.class, null, false, false, false, 1000, null, null, null, false, 990));
                        break;
                    case 5:
                        f70.g gVar2 = badgesActivity.a0().f23859g.f14946a;
                        a0 a0Var2 = new a0();
                        z zVar2 = z.MANUFACTURER;
                        zVar2.getClass();
                        a0Var2.f30138a = zVar2;
                        gVar2.a(a0Var2.b());
                        break;
                    case 6:
                        break;
                    default:
                        e40.a.f();
                        break;
                }
                break;
            default:
                Item item = (Item) obj;
                int i14 = BadgesActivity.f8964i;
                item.getClass();
                i iVarA0 = badgesActivity.a0();
                String strMo340getItemIdFvU5WIY = item.getInformation().mo340getItemIdFvU5WIY();
                f70.i iVar = f70.i.SOLD_OUT;
                strMo340getItemIdFvU5WIY.getClass();
                iVar.getClass();
                dh.a aVar = iVarA0.f23859g;
                aVar.getClass();
                f70.g gVar3 = aVar.f14946a;
                mk.c cVar = new mk.c(strMo340getItemIdFvU5WIY, ItemViewActivity.class);
                cVar.f29986i = iVar;
                gVar3.a(cVar.a());
                break;
        }
        return Unit.f26487a;
    }
}
