package lq;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.l1;
import androidx.recyclerview.widget.r2;
import androidx.recyclerview.widget.v;
import com.app.tgtg.R;
import com.app.tgtg.feature.tabdiscover.discoveritems.DiscoverFavoritesPromoItemView;
import com.app.tgtg.feature.tabdiscover.discoveritems.DiscoverLocalHeroItemView;
import com.app.tgtg.model.remote.item.response.BasicItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends l1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f28135i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f28136a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f28137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f28138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Consumer f28139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Consumer f28140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ep.l f28141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f28142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f28143h;

    public final void a(ArrayList arrayList, String str, String str2, boolean z11, boolean z12) {
        str.getClass();
        str2.getClass();
        this.f28142g = str;
        this.f28143h = str2;
        this.f28137b = z11;
        this.f28138c = z12;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            int i11 = 0;
            if (arrayList2.isEmpty()) {
                arrayList2.add(new mq.b(true));
                arrayList2.add(new mq.b(false));
            } else if (Intrinsics.areEqual(str, "FAVORITES")) {
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i11 = -1;
                        break;
                    }
                    mq.a aVar = (mq.a) it.next();
                    aVar.getClass();
                    if (((BasicItem) aVar).getItemsAvailable() == 0) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 != -1) {
                    arrayList2.add(i11, new mq.d());
                }
            } else if (Intrinsics.areEqual(str2, "LocalHeroes") && ft.c.p() < 3) {
                arrayList2.add(0, new mq.c());
                if (!f28135i) {
                    int iP = ft.c.p() + 1;
                    SharedPreferences.Editor editorEdit = ft.c.x().edit();
                    String strY = ft.c.y();
                    if (strY == null) {
                        strY = null;
                    }
                    editorEdit.putInt(strY + "_localHeroViewCount", iP);
                    editorEdit.apply();
                    f28135i = true;
                }
            }
            ArrayList arrayList3 = this.f28136a;
            v vVarA = androidx.recyclerview.widget.d.a(new g(arrayList3, arrayList2, 1));
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            vVarA.a(new androidx.recyclerview.widget.c(this));
        }
    }

    @Override // androidx.recyclerview.widget.l1
    public final int getItemCount() {
        return this.f28136a.size();
    }

    @Override // androidx.recyclerview.widget.l1
    public final int getItemViewType(int i11) {
        mq.a aVar = (mq.a) this.f28136a.get(i11);
        return aVar instanceof mq.b ? R.layout.discover_empty_favorite_view : aVar instanceof mq.d ? R.layout.discover_promo_favorite_view : aVar instanceof mq.c ? R.layout.discover_local_hero_item_view : R.layout.discover_item_view_compose;
    }

    @Override // androidx.recyclerview.widget.l1
    public final void onBindViewHolder(r2 r2Var, int i11) {
        k kVar = (k) r2Var;
        kVar.getClass();
        m mVar = kVar.f28133a;
        ArrayList arrayList = this.f28136a;
        mVar.setItem((mq.a) arrayList.get(i11));
        if (mVar instanceof bq.k) {
            bq.k kVar2 = (bq.k) mVar;
            pg.b bVar = kVar2.f6614h;
            ((TextView) bVar.f34790k).setVisibility(0);
            ((TextView) bVar.f34785f).setVisibility(0);
            ((LinearLayout) bVar.f34781b).setMinimumHeight(d70.b.a(84));
            if (arrayList.size() % 3 == 0) {
                kVar2.setItemWidth(i11 == arrayList.size() - 1 || i11 == arrayList.size() - 2 || i11 == arrayList.size() + (-3));
            } else if (arrayList.size() % 3 == 2) {
                kVar2.setItemWidth(i11 == arrayList.size() - 1 || i11 == arrayList.size() - 2);
            } else {
                kVar2.setItemWidth(i11 == arrayList.size() - 1);
            }
        }
    }

    @Override // androidx.recyclerview.widget.l1
    public final r2 onCreateViewHolder(ViewGroup viewGroup, int i11) {
        m discoverLocalHeroItemView;
        m pVar;
        viewGroup.getClass();
        if (i11 == R.layout.discover_item_view_compose) {
            Context context = viewGroup.getContext();
            context.getClass();
            s sVar = new s(context);
            sVar.setShouldShowSpecialReward(this.f28137b);
            pVar = sVar;
        } else {
            int i12 = 0;
            int i13 = 6;
            AttributeSet attributeSet = null;
            if (i11 == R.layout.discover_empty_favorite_view) {
                Context context2 = viewGroup.getContext();
                context2.getClass();
                pVar = new a(context2, null, 6, 0);
            } else {
                if (i11 == R.layout.discover_promo_favorite_view) {
                    Context context3 = viewGroup.getContext();
                    context3.getClass();
                    DiscoverFavoritesPromoItemView discoverFavoritesPromoItemView = new DiscoverFavoritesPromoItemView(context3, null, 0, 6, null);
                    discoverFavoritesPromoItemView.setCustomReminderAvailable(this.f28138c);
                    discoverLocalHeroItemView = discoverFavoritesPromoItemView;
                } else if (i11 == R.layout.discover_local_hero_item_view) {
                    Context context4 = viewGroup.getContext();
                    context4.getClass();
                    discoverLocalHeroItemView = new DiscoverLocalHeroItemView(context4, null, 0, this.f28141f, 6, null);
                } else if (i11 == R.layout.store_view_item_view) {
                    Context context5 = viewGroup.getContext();
                    context5.getClass();
                    pVar = new bq.k(context5, null, 6, 0);
                } else if (i11 == R.layout.discover_store_view) {
                    Context context6 = viewGroup.getContext();
                    context6.getClass();
                    pVar = new p(context6, attributeSet, i13, i12);
                } else {
                    Context context7 = viewGroup.getContext();
                    context7.getClass();
                    pVar = new p(context7, attributeSet, i13, i12);
                }
                pVar = discoverLocalHeroItemView;
            }
        }
        return new k(this, pVar);
    }
}
