package yn;

import android.content.res.Resources;
import android.widget.PopupWindow;
import com.app.tgtg.R;
import com.app.tgtg.feature.main.MainActivity;
import com.app.tgtg.model.remote.brief.BriefItemInfo;
import com.app.tgtg.model.remote.brief.BriefOrder;
import com.app.tgtg.model.remote.brief.BriefStoreInfo;
import com.app.tgtg.model.remote.item.BasicItemInformation;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.order.OrderType;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.StringCompanionObject;
import pg.u1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BriefOrder f46311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hm.h f46312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ep.l f46313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BasicItem f46314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ep.l f46315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p f46316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f46317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PopupWindow f46318h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MainActivity f46319i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public us.j f46320j;

    public v(BriefOrder briefOrder, hm.h hVar, ep.l lVar, BasicItem basicItem, ep.l lVar2) {
        briefOrder.getClass();
        this.f46311a = briefOrder;
        this.f46312b = hVar;
        this.f46313c = lVar;
        this.f46314d = basicItem;
        this.f46315e = lVar2;
        this.f46316f = p.ReservationChanged;
        this.f46317g = true;
    }

    public static void g(v vVar, String str, String str2, int i11, Function0 function0, Integer num, boolean z11, int i12) {
        Resources resources;
        Resources resources2;
        String string = null;
        if ((i12 & 8) != 0) {
            function0 = null;
        }
        if ((i12 & 16) != 0) {
            num = null;
        }
        if ((i12 & 32) != 0) {
            z11 = false;
        }
        MainActivity mainActivity = vVar.f46319i;
        bg.l lVar = new bg.l(mainActivity);
        lVar.f6189b = str;
        str2.getClass();
        lVar.f6190c = str2;
        lVar.f6191d = (mainActivity == null || (resources2 = mainActivity.getResources()) == null) ? null : resources2.getString(i11);
        lVar.f6197j = new yk.d(1, function0);
        lVar.f6196i = true;
        if (z11) {
            if (mainActivity != null && (resources = mainActivity.getResources()) != null) {
                string = resources.getString(R.string.main_delegate_collection_cancelled_owner_popup_extra_text);
            }
            lVar.f6192e = string;
        }
        if (num != null) {
            lVar.f6195h = Integer.valueOf(num.intValue());
        }
        vVar.f46318h = lVar.a();
    }

    @Override // yn.o
    public final void a(u1 u1Var) {
        PopupWindow popupWindow;
        u1Var.getClass();
        PopupWindow popupWindow2 = this.f46318h;
        if (popupWindow2 != null) {
            popupWindow2.getClass();
            if (!popupWindow2.isShowing() || (popupWindow = this.f46318h) == null) {
                return;
            }
            popupWindow.dismiss();
        }
    }

    @Override // yn.o
    public final p b() {
        return this.f46316f;
    }

    @Override // yn.o
    public final boolean c() {
        return this.f46317g;
    }

    public final void d(String str) {
        cv.i iVar = cv.i.SCREEN_CANCELLATION_INFO;
        dv.a aVar = dv.a.ITEM_ID;
        if (str == null) {
            str = null;
        }
        this.f46312b.invoke(iVar, h0.g.E(new Pair(aVar, new dv.c(str))));
    }

    public final void e(boolean z11) {
        String str;
        String string;
        BasicItemInformation information;
        MainActivity mainActivity = this.f46319i;
        if (mainActivity != null) {
            BriefOrder briefOrder = this.f46311a;
            OrderType orderType = briefOrder.getOrderType();
            OrderType orderType2 = OrderType.MANUFACTURER;
            String strMo340getItemIdFvU5WIY = null;
            if (orderType == orderType2) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string2 = mainActivity.getString(R.string.collection_changed_popup_title_cancellation_manu);
                string2.getClass();
                BriefItemInfo briefItemInfo = briefOrder.getBriefItemInfo();
                str = String.format(string2, Arrays.copyOf(new Object[]{briefItemInfo != null ? briefItemInfo.getItemName() : null}, 1));
            } else {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String string3 = mainActivity.getString(R.string.collection_changed_popup_title_cancellation);
                string3.getClass();
                BriefStoreInfo briefStoreInfo = briefOrder.getBriefStoreInfo();
                str = String.format(string3, Arrays.copyOf(new Object[]{briefStoreInfo != null ? briefStoreInfo.getStoreDisplayName() : null}, 1));
            }
            String str2 = str;
            if (briefOrder.getOrderType() == orderType2) {
                string = mainActivity.getString(R.string.collection_changed_popup_msg_admin_cancelled_manu);
            } else {
                String string4 = mainActivity.getString(R.string.collection_changed_popup_msg_admin_cancelled);
                string4.getClass();
                BriefStoreInfo briefStoreInfo2 = briefOrder.getBriefStoreInfo();
                string = String.format(string4, Arrays.copyOf(new Object[]{briefStoreInfo2 != null ? briefStoreInfo2.getStoreDisplayName() : null}, 1));
            }
            String str3 = string;
            str3.getClass();
            BasicItem basicItem = this.f46314d;
            if (basicItem != null && (information = basicItem.getInformation()) != null) {
                strMo340getItemIdFvU5WIY = information.mo340getItemIdFvU5WIY();
            }
            d(strMo340getItemIdFvU5WIY);
            boolean z12 = briefOrder.getOrderType() == orderType2;
            if (basicItem == null || briefOrder.getOrderType() == OrderType.CHARITY) {
                g(this, str2, str3, z12 ? R.string.collection_changed_primary_action_browse_parcels : R.string.collection_changed_primary_action_browse_bags, this.f46320j, null, z11, 16);
            } else {
                h(str2, str3, this.f46314d, z11, this.f46315e, z12);
            }
        }
    }

    public final void f(boolean z11) {
        BasicItemInformation information;
        MainActivity mainActivity = this.f46319i;
        if (mainActivity != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = mainActivity.getString(R.string.collection_changed_popup_title_cancellation_store);
            string.getClass();
            BriefOrder briefOrder = this.f46311a;
            BriefStoreInfo briefStoreInfo = briefOrder.getBriefStoreInfo();
            String strMo340getItemIdFvU5WIY = null;
            String str = String.format(string, Arrays.copyOf(new Object[]{briefStoreInfo != null ? briefStoreInfo.getStoreDisplayName() : null}, 1));
            OrderType orderType = briefOrder.getOrderType();
            OrderType orderType2 = OrderType.CHARITY;
            String string2 = orderType == orderType2 ? mainActivity.getString(R.string.collection_changed_popup_msg_store_cancelled_donation) : mainActivity.getString(R.string.collection_changed_popup_msg_store_cancelled);
            string2.getClass();
            BasicItem basicItem = this.f46314d;
            if (basicItem != null && (information = basicItem.getInformation()) != null) {
                strMo340getItemIdFvU5WIY = information.mo340getItemIdFvU5WIY();
            }
            d(strMo340getItemIdFvU5WIY);
            if (basicItem == null || briefOrder.getOrderType() == OrderType.MANUFACTURER || briefOrder.getOrderType() == orderType2) {
                g(this, str, string2, R.string.collection_changed_primary_action_browse_bags, this.f46320j, null, z11, 16);
            } else {
                h(str, string2, this.f46314d, z11, this.f46315e, false);
            }
        }
    }

    public final void h(String str, String str2, BasicItem basicItem, boolean z11, ep.l lVar, boolean z12) {
        Resources resources;
        MainActivity mainActivity = this.f46319i;
        bg.l lVar2 = new bg.l(mainActivity);
        lVar2.f6189b = str;
        str2.getClass();
        lVar2.f6190c = str2;
        basicItem.getClass();
        lVar2.f6193f = basicItem;
        lVar2.f6198k = lVar;
        lVar2.f6194g = z12;
        if (z11) {
            lVar2.f6192e = (mainActivity == null || (resources = mainActivity.getResources()) == null) ? null : resources.getString(R.string.main_delegate_collection_cancelled_owner_popup_extra_text);
        }
        this.f46318h = lVar2.a();
    }
}
