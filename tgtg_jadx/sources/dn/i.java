package dn;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y1;
import cj.r0;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.BasketIntroBannerMnu;
import com.app.tgtg.model.remote.item.response.ElementMnuV2;
import com.app.tgtg.model.remote.item.response.HeroCarouselMnu;
import com.app.tgtg.model.remote.item.response.HighlightedItemCardsCarouselMnuV2;
import com.app.tgtg.model.remote.item.response.HighlightedItemMnuV2;
import com.app.tgtg.model.remote.item.response.InfoMnuV2;
import com.app.tgtg.model.remote.item.response.ItemCarouselMnu;
import com.app.tgtg.model.remote.item.response.ItemCarouselMnuV2;
import com.app.tgtg.model.remote.item.response.ItemMnu;
import com.app.tgtg.model.remote.item.response.ItemMnuV2;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.item.response.NpsMnuV2;
import com.app.tgtg.model.remote.item.response.TypedItemCardsCarouselMnu;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import mv.e0;
import mv.f0;
import pg.c2;
import ym.p;
import ym.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f15009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f15010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f15011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cv.g f15012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f15016h;

    public i(c2 c2Var, e0 e0Var, w wVar) {
        c2Var.getClass();
        e0Var.getClass();
        wVar.getClass();
        this.f15009a = c2Var;
        this.f15010b = e0Var;
        this.f15011c = wVar;
        this.f15012d = cv.g.DELIVERY_LIST;
        this.f15016h = new LinkedHashMap();
    }

    public static int b(int i11, List list) {
        p pVar;
        if (i11 > (list != null ? list.size() : 0)) {
            return -1;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            if ((list == null || (pVar = (p) list.get(i13)) == null) ? false : c(pVar)) {
                i12++;
            }
        }
        return i12;
    }

    public static boolean c(p pVar) {
        ElementMnuV2 elementMnuV2 = pVar.f46226a;
        return (elementMnuV2 instanceof ItemMnu) || (elementMnuV2 instanceof ItemMnuV2) || (elementMnuV2 instanceof HighlightedItemMnuV2) || (elementMnuV2 instanceof ItemCarouselMnu) || (elementMnuV2 instanceof TypedItemCardsCarouselMnu) || (elementMnuV2 instanceof HighlightedItemCardsCarouselMnuV2) || (elementMnuV2 instanceof ItemCarouselMnuV2) || (elementMnuV2 instanceof HeroCarouselMnu);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [dn.g] */
    public final void a(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        e0 e0Var = this.f15010b;
        if (list2 != null) {
            c2 c2Var = this.f15009a;
            RecyclerView recyclerView = c2Var.C;
            RecyclerView recyclerView2 = c2Var.C;
            y1 layoutManager = recyclerView.getLayoutManager();
            layoutManager.getClass();
            int iFindFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
            y1 layoutManager2 = recyclerView2.getLayoutManager();
            layoutManager2.getClass();
            int iMin = Math.min(((LinearLayoutManager) layoutManager2).findLastVisibleItemPosition(), list2.size() - 1);
            int iB = b(iFindFirstVisibleItemPosition, list2);
            if (iFindFirstVisibleItemPosition <= iMin) {
                int i11 = iB;
                while (true) {
                    p pVar = (p) list2.get(iFindFirstVisibleItemPosition);
                    ElementMnuV2 elementMnuV2 = pVar.f46226a;
                    boolean z11 = elementMnuV2 instanceof ItemMnu;
                    if (z11 || (elementMnuV2 instanceof ItemMnuV2)) {
                        BaseItemMnuV2 item = z11 ? ((ItemMnu) elementMnuV2).getItem() : ((ItemMnuV2) elementMnuV2).getItem();
                        String strM393getItemIdFvU5WIY = item.m393getItemIdFvU5WIY();
                        Integer numValueOf = Integer.valueOf(item.getAvailableStock());
                        Picture coverPicture = item.getCoverPicture();
                        n nVar = new n(strM393getItemIdFvU5WIY, numValueOf, coverPicture != null ? coverPicture.getPictureId() : null, item.getItemType());
                        y1 layoutManager3 = recyclerView2.getLayoutManager();
                        layoutManager3.getClass();
                        arrayList.add(new o(nVar, ((LinearLayoutManager) layoutManager3).findViewByPosition(iFindFirstVisibleItemPosition), 0, i11, item.getItemType() == ItemType.CATERING ? "CATERING" : null));
                    } else if (elementMnuV2 instanceof HighlightedItemMnuV2) {
                        HighlightedItemMnuV2 highlightedItemMnuV2 = (HighlightedItemMnuV2) elementMnuV2;
                        String strM393getItemIdFvU5WIY2 = highlightedItemMnuV2.getItem().m393getItemIdFvU5WIY();
                        Integer numValueOf2 = Integer.valueOf(highlightedItemMnuV2.getItem().getAvailableStock());
                        Picture coverPicture2 = highlightedItemMnuV2.getItem().getCoverPicture();
                        n nVar2 = new n(strM393getItemIdFvU5WIY2, numValueOf2, coverPicture2 != null ? coverPicture2.getPictureId() : null, highlightedItemMnuV2.getItem().getItemType());
                        y1 layoutManager4 = recyclerView2.getLayoutManager();
                        layoutManager4.getClass();
                        arrayList.add(new o(nVar2, ((LinearLayoutManager) layoutManager4).findViewByPosition(iFindFirstVisibleItemPosition), 0, i11, null));
                    } else if (elementMnuV2 instanceof InfoMnuV2) {
                        y1 layoutManager5 = c2Var.C.getLayoutManager();
                        layoutManager5.getClass();
                        View viewFindViewByPosition = ((LinearLayoutManager) layoutManager5).findViewByPosition(iFindFirstVisibleItemPosition);
                        if (!this.f15013e && viewFindViewByPosition != null) {
                            final int i12 = 3;
                            e0Var.b(viewFindViewByPosition, f0.DELIVERY_PARCEL_STORY, new Function1(this) { // from class: dn.g

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ i f15008b;

                                {
                                    this.f15008b = this;
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    switch (i12) {
                                        case 0:
                                            cv.e eVar = (cv.e) obj;
                                            eVar.getClass();
                                            w wVar = this.f15008b.f15011c;
                                            wVar.getClass();
                                            wVar.f46256d.a(eVar);
                                            break;
                                        case 1:
                                            ((Boolean) obj).booleanValue();
                                            this.f15008b.f15015g = true;
                                            break;
                                        case 2:
                                            ((Boolean) obj).booleanValue();
                                            this.f15008b.f15014f = true;
                                            break;
                                        default:
                                            ((Boolean) obj).booleanValue();
                                            this.f15008b.f15013e = true;
                                            break;
                                    }
                                    return Unit.f26487a;
                                }
                            });
                        }
                    } else if (elementMnuV2 instanceof NpsMnuV2) {
                        y1 layoutManager6 = c2Var.C.getLayoutManager();
                        layoutManager6.getClass();
                        View viewFindViewByPosition2 = ((LinearLayoutManager) layoutManager6).findViewByPosition(iFindFirstVisibleItemPosition);
                        if (!this.f15014f && viewFindViewByPosition2 != null) {
                            final int i13 = 2;
                            e0Var.b(viewFindViewByPosition2, f0.DELIVERY_NPS_VIEW, new Function1(this) { // from class: dn.g

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ i f15008b;

                                {
                                    this.f15008b = this;
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    switch (i13) {
                                        case 0:
                                            cv.e eVar = (cv.e) obj;
                                            eVar.getClass();
                                            w wVar = this.f15008b.f15011c;
                                            wVar.getClass();
                                            wVar.f46256d.a(eVar);
                                            break;
                                        case 1:
                                            ((Boolean) obj).booleanValue();
                                            this.f15008b.f15015g = true;
                                            break;
                                        case 2:
                                            ((Boolean) obj).booleanValue();
                                            this.f15008b.f15014f = true;
                                            break;
                                        default:
                                            ((Boolean) obj).booleanValue();
                                            this.f15008b.f15013e = true;
                                            break;
                                    }
                                    return Unit.f26487a;
                                }
                            });
                        }
                    } else if (elementMnuV2 instanceof BasketIntroBannerMnu) {
                        y1 layoutManager7 = c2Var.C.getLayoutManager();
                        layoutManager7.getClass();
                        View viewFindViewByPosition3 = ((LinearLayoutManager) layoutManager7).findViewByPosition(iFindFirstVisibleItemPosition);
                        if (!this.f15015g && viewFindViewByPosition3 != null) {
                            final int i14 = 1;
                            e0Var.b(viewFindViewByPosition3, f0.DELIVERY_BASKET_INTRO, new Function1(this) { // from class: dn.g

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ i f15008b;

                                {
                                    this.f15008b = this;
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    switch (i14) {
                                        case 0:
                                            cv.e eVar = (cv.e) obj;
                                            eVar.getClass();
                                            w wVar = this.f15008b.f15011c;
                                            wVar.getClass();
                                            wVar.f46256d.a(eVar);
                                            break;
                                        case 1:
                                            ((Boolean) obj).booleanValue();
                                            this.f15008b.f15015g = true;
                                            break;
                                        case 2:
                                            ((Boolean) obj).booleanValue();
                                            this.f15008b.f15014f = true;
                                            break;
                                        default:
                                            ((Boolean) obj).booleanValue();
                                            this.f15008b.f15013e = true;
                                            break;
                                    }
                                    return Unit.f26487a;
                                }
                            });
                        }
                    }
                    if (c(pVar)) {
                        i11++;
                    }
                    if (iFindFirstVisibleItemPosition == iMin) {
                        break;
                    }
                    iFindFirstVisibleItemPosition++;
                    list2 = list;
                }
            }
        }
        final int i15 = 0;
        ?? r52 = new Function1(this) { // from class: dn.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f15008b;

            {
                this.f15008b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        cv.e eVar = (cv.e) obj;
                        eVar.getClass();
                        w wVar = this.f15008b.f15011c;
                        wVar.getClass();
                        wVar.f46256d.a(eVar);
                        break;
                    case 1:
                        ((Boolean) obj).booleanValue();
                        this.f15008b.f15015g = true;
                        break;
                    case 2:
                        ((Boolean) obj).booleanValue();
                        this.f15008b.f15014f = true;
                        break;
                    default:
                        ((Boolean) obj).booleanValue();
                        this.f15008b.f15013e = true;
                        break;
                }
                return Unit.f26487a;
            }
        };
        e0Var.getClass();
        cv.g gVar = this.f15012d;
        gVar.getClass();
        v80.f0.B(e0Var, null, null, new r0(arrayList, e0Var, gVar, r52, null), 3);
    }

    public final void d() {
        LinkedHashMap linkedHashMap = this.f15016h;
        if (linkedHashMap.isEmpty()) {
            return;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            Map map = (Map) entry.getValue();
            this.f15011c.e(cv.i.TEMP_ACTION_SEE_CAROUSEL_ELEMENT, h0.g.E(new Pair(dv.a.SEEN, new dv.c(CollectionsKt.r0(map.values()))), new Pair(dv.a.HORIZONTAL_POSITION, new dv.c(CollectionsKt.r0(map.keySet()))), new Pair(dv.a.TYPE, new dv.c(str))));
        }
        linkedHashMap.clear();
    }
}
