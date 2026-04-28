package hq;

import a3.m2;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.e2;
import androidx.recyclerview.widget.l1;
import androidx.recyclerview.widget.r2;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import com.app.tgtg.model.remote.profile.response.LoyaltyCardDetails;
import g3.y0;
import hp.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends l1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fn.g f22366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public fn.d f22367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public fn.d f22368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public fn.d f22369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public fn.g f22370i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public fn.e f22371j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public fn.g f22372k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public fn.e f22374n;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public m2 f22379s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public fn.d f22380t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f22362a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e2 f22363b = new e2();
    public Function1 l = new hb0.q(4);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Function0 f22373m = new f0(5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Function1 f22375o = new hb0.q(5);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Function0 f22376p = new f0(6);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Function0 f22377q = new f0(7);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Function0 f22378r = new f0(8);

    public final int a(nq.d dVar) {
        Iterator it = this.f22362a.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((nq.d) it.next()).getClass(), dVar.getClass())) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.l1
    public final int getItemCount() {
        return this.f22362a.size();
    }

    @Override // androidx.recyclerview.widget.l1
    public final int getItemViewType(int i11) {
        return ((nq.d) this.f22362a.get(i11)).getLayoutFile();
    }

    @Override // androidx.recyclerview.widget.l1
    public final void onBindViewHolder(r2 r2Var, int i11) {
        h hVar = (h) r2Var;
        hVar.getClass();
        Object obj = this.f22362a.get(i11);
        obj.getClass();
        nq.d dVar = (nq.d) obj;
        j jVar = hVar.f22361a;
        c cVar = jVar instanceof c ? (c) jVar : null;
        if (cVar != null) {
            cVar.setVerticalPosition(i11);
        }
        if (jVar instanceof c) {
            c cVar2 = (c) jVar;
            cVar2.setShouldShowSpecialRewards(this.f22364c);
            cVar2.setFavoritesCustomReminderEnabled(this.f22365d);
        }
        jVar.setDiscoverRow(dVar);
        if ((dVar instanceof DiscoverBucket) && Intrinsics.areEqual(((DiscoverBucket) dVar).getDisplayType(), "RECOMMENDATIONS")) {
            hVar.setIsRecyclable(false);
        }
    }

    @Override // androidx.recyclerview.widget.l1
    public final r2 onCreateViewHolder(ViewGroup viewGroup, int i11) {
        j eVar;
        viewGroup.getClass();
        if (i11 == R.layout.discover_almost_sold_out_view) {
            Context context = viewGroup.getContext();
            context.getClass();
            eVar = new a(context);
        } else if (i11 == R.layout.discover_nothing_within_distance_view) {
            Context context2 = viewGroup.getContext();
            context2.getClass();
            eVar = new t(context2);
        } else if (i11 == R.layout.discover_not_live_here_view) {
            Context context3 = viewGroup.getContext();
            context3.getClass();
            r rVar = new r(context3);
            rVar.setOnChangeLocationClicked(this.f22374n);
            rVar.setOnInstagramClick(this.f22380t);
            eVar = rVar;
        } else if (i11 == R.layout.discover_rating_compose) {
            Context context4 = viewGroup.getContext();
            context4.getClass();
            w wVar = new w(context4);
            wVar.setSelfRemovalRunnable(new com.google.firebase.messaging.r(20, wVar, this));
            wVar.f22410g = new y0(this, 12);
            eVar = wVar;
        } else if (i11 == R.layout.discover_store_referral) {
            Context context5 = viewGroup.getContext();
            context5.getClass();
            eVar = new y(context5);
        } else {
            final int i12 = 2;
            final int i13 = 1;
            if (i11 == R.layout.discover_flash_sales_view) {
                Context context6 = viewGroup.getContext();
                context6.getClass();
                o oVar = new o(context6, null);
                fn.g gVar = this.f22372k;
                oVar.setFlashSalesConsumer(gVar != null ? new gn.q(2, gVar) : null);
                fn.d dVar = this.f22368g;
                oVar.setFavoriteClickConsumer(dVar != null ? new gn.z(dVar, 1) : null);
                m2 m2Var = this.f22379s;
                eVar = oVar;
                if (m2Var != null) {
                    oVar.setOnFlashSalesBucketClickListener(m2Var);
                    eVar = oVar;
                }
            } else if (i11 == R.layout.discover_delivery_card) {
                Context context7 = viewGroup.getContext();
                context7.getClass();
                eVar = new e(context7);
            } else {
                final int i14 = 0;
                if (i11 == R.layout.discover_quick_filter_bucket_view) {
                    Context context8 = viewGroup.getContext();
                    context8.getClass();
                    u uVar = new u(context8);
                    uVar.setOnFilterClicked(new Function1(this) { // from class: hq.f

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ i f22358b;

                        {
                            this.f22358b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i14) {
                                case 0:
                                    List list = (List) obj;
                                    list.getClass();
                                    this.f22358b.l.invoke(list);
                                    break;
                                case 1:
                                    this.f22358b.f22375o.invoke((LoyaltyCardDetails) obj);
                                    break;
                                default:
                                    cv.e eVar2 = (cv.e) obj;
                                    eVar2.getClass();
                                    fn.d dVar2 = this.f22358b.f22369h;
                                    if (dVar2 != null) {
                                        dVar2.invoke(eVar2);
                                    }
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    });
                    eVar = uVar;
                } else if (i11 == R.layout.discover_filter_no_result_view) {
                    Context context9 = viewGroup.getContext();
                    context9.getClass();
                    l lVar = new l(context9);
                    lVar.setOnRemoveBtnClicked(new Function0(this) { // from class: hq.g

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ i f22360b;

                        {
                            this.f22360b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i14) {
                                case 0:
                                    this.f22360b.f22373m.invoke();
                                    break;
                                case 1:
                                    i iVar = this.f22360b;
                                    ArrayList arrayList = iVar.f22362a;
                                    Iterator it = arrayList.iterator();
                                    int i15 = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            i15 = -1;
                                        } else if (!((nq.d) it.next()).isLoyaltyCardPromo()) {
                                            i15++;
                                        }
                                    }
                                    if (i15 != -1) {
                                        arrayList.remove(i15);
                                        iVar.notifyItemRemoved(i15);
                                        fn.e eVar2 = iVar.f22371j;
                                        if (eVar2 != null) {
                                            eVar2.invoke();
                                        }
                                    }
                                    iVar.f22376p.invoke();
                                    break;
                                default:
                                    this.f22360b.f22377q.invoke();
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    });
                    eVar = lVar;
                } else if (i11 == R.layout.discover_loyaltycard_promo_view) {
                    Context context10 = viewGroup.getContext();
                    context10.getClass();
                    jq.b bVar = new jq.b(context10);
                    bVar.setOnLoyaltyCardPromoClicked(new Function1(this) { // from class: hq.f

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ i f22358b;

                        {
                            this.f22358b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i13) {
                                case 0:
                                    List list = (List) obj;
                                    list.getClass();
                                    this.f22358b.l.invoke(list);
                                    break;
                                case 1:
                                    this.f22358b.f22375o.invoke((LoyaltyCardDetails) obj);
                                    break;
                                default:
                                    cv.e eVar2 = (cv.e) obj;
                                    eVar2.getClass();
                                    fn.d dVar2 = this.f22358b.f22369h;
                                    if (dVar2 != null) {
                                        dVar2.invoke(eVar2);
                                    }
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    });
                    bVar.setOnLoyaltyCardPromoDismissed(new Function0(this) { // from class: hq.g

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ i f22360b;

                        {
                            this.f22360b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i13) {
                                case 0:
                                    this.f22360b.f22373m.invoke();
                                    break;
                                case 1:
                                    i iVar = this.f22360b;
                                    ArrayList arrayList = iVar.f22362a;
                                    Iterator it = arrayList.iterator();
                                    int i15 = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            i15 = -1;
                                        } else if (!((nq.d) it.next()).isLoyaltyCardPromo()) {
                                            i15++;
                                        }
                                    }
                                    if (i15 != -1) {
                                        arrayList.remove(i15);
                                        iVar.notifyItemRemoved(i15);
                                        fn.e eVar2 = iVar.f22371j;
                                        if (eVar2 != null) {
                                            eVar2.invoke();
                                        }
                                    }
                                    iVar.f22376p.invoke();
                                    break;
                                default:
                                    this.f22360b.f22377q.invoke();
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    });
                    eVar = bVar;
                } else if (i11 == R.layout.discover_recipe_generator_promo_view) {
                    Context context11 = viewGroup.getContext();
                    context11.getClass();
                    kp.d dVar2 = new kp.d(context11);
                    dVar2.setOnRecipeGeneratorPromoCardClicked(new Function0(this) { // from class: hq.g

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ i f22360b;

                        {
                            this.f22360b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i12) {
                                case 0:
                                    this.f22360b.f22373m.invoke();
                                    break;
                                case 1:
                                    i iVar = this.f22360b;
                                    ArrayList arrayList = iVar.f22362a;
                                    Iterator it = arrayList.iterator();
                                    int i15 = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            i15 = -1;
                                        } else if (!((nq.d) it.next()).isLoyaltyCardPromo()) {
                                            i15++;
                                        }
                                    }
                                    if (i15 != -1) {
                                        arrayList.remove(i15);
                                        iVar.notifyItemRemoved(i15);
                                        fn.e eVar2 = iVar.f22371j;
                                        if (eVar2 != null) {
                                            eVar2.invoke();
                                        }
                                    }
                                    iVar.f22376p.invoke();
                                    break;
                                default:
                                    this.f22360b.f22377q.invoke();
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    });
                    dVar2.setSelfRemovalRunnable(new com.google.firebase.messaging.r(19, dVar2, this));
                    eVar = dVar2;
                } else {
                    Context context12 = viewGroup.getContext();
                    context12.getClass();
                    c cVar = new c(context12);
                    cVar.setBucketImpressionListener(new Function1(this) { // from class: hq.f

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ i f22358b;

                        {
                            this.f22358b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i12) {
                                case 0:
                                    List list = (List) obj;
                                    list.getClass();
                                    this.f22358b.l.invoke(list);
                                    break;
                                case 1:
                                    this.f22358b.f22375o.invoke((LoyaltyCardDetails) obj);
                                    break;
                                default:
                                    cv.e eVar2 = (cv.e) obj;
                                    eVar2.getClass();
                                    fn.d dVar22 = this.f22358b.f22369h;
                                    if (dVar22 != null) {
                                        dVar22.invoke(eVar2);
                                    }
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    });
                    cVar.setViewPool(this.f22363b);
                    fn.g gVar2 = this.f22366e;
                    cVar.setItemConsumer(gVar2 != null ? new gn.q(1, gVar2) : null);
                    fn.d dVar3 = this.f22368g;
                    cVar.setFavoriteClickConsumer(dVar3 != null ? new gn.z(dVar3, 1) : null);
                    fn.d dVar4 = this.f22367f;
                    cVar.setFavoriteAdapterConsumer(dVar4 != null ? new gn.z(dVar4, 1) : null);
                    eVar = cVar;
                }
            }
        }
        return new h(eVar);
    }
}
