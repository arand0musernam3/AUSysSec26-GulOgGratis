package ym;

import a3.f1;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.l1;
import androidx.recyclerview.widget.m0;
import androidx.recyclerview.widget.r2;
import com.app.tgtg.R;
import com.app.tgtg.customview.npsratingview.NpsRatingView;
import com.app.tgtg.model.remote.item.response.BasketIntroBannerMnu;
import com.app.tgtg.model.remote.item.response.CategoryCarouselMnuV2;
import com.app.tgtg.model.remote.item.response.ElementMnuV2;
import com.app.tgtg.model.remote.item.response.GroupHeaderMnuV2;
import com.app.tgtg.model.remote.item.response.HeaderItem;
import com.app.tgtg.model.remote.item.response.HeroCarouselMnu;
import com.app.tgtg.model.remote.item.response.HighlightedItemCardsCarouselMnuV2;
import com.app.tgtg.model.remote.item.response.HighlightedItemMnuV2;
import com.app.tgtg.model.remote.item.response.InfoMnuV2;
import com.app.tgtg.model.remote.item.response.IntroBanner;
import com.app.tgtg.model.remote.item.response.ItemCarouselMnu;
import com.app.tgtg.model.remote.item.response.ItemCarouselMnuV2;
import com.app.tgtg.model.remote.item.response.ItemMnu;
import com.app.tgtg.model.remote.item.response.ItemMnuV2;
import com.app.tgtg.model.remote.item.response.TextMnu;
import com.app.tgtg.model.remote.item.response.TextMnuV2;
import com.app.tgtg.model.remote.item.response.TypedItemCardsCarouselMnu;
import com.app.tgtg.model.remote.manufacturer.request.AdapterItemType;
import com.google.android.gms.internal.measurement.cg;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import pg.c0;
import pg.d0;
import pg.g0;
import pg.l2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f46201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f46202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f46203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f46204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f46205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f46206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public dn.k f46207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f46208h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f46209i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f46210j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f46211k = 1;
    public final int l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f46212m = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f46213n = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f46214o = 5;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f46215p = 6;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f46216q = 7;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f46217r = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f46218s = 9;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f46219t = 10;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f46220u = 11;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f46221v = 12;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f46222w = 13;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f46223x = 14;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f46224y = 15;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f46225z = 16;
    public final int A = 17;

    public o(u uVar, u uVar2, ArrayList arrayList, int i11, boolean z11, String str) {
        this.f46201a = uVar;
        this.f46202b = uVar2;
        this.f46203c = arrayList;
        this.f46204d = i11;
        this.f46205e = z11;
        this.f46206f = str;
    }

    public static c0 b(ViewGroup viewGroup) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        int i11 = c0.f34808u;
        DataBinderMapperImpl dataBinderMapperImpl = a8.c.f965a;
        c0 c0Var = (c0) a8.k.Z(layoutInflaterFrom, R.layout.delivery_adapter_compose_view, null, false, null);
        c0Var.getClass();
        return c0Var;
    }

    public final void a(p pVar) {
        ArrayList arrayList = this.f46203c;
        arrayList.getClass();
        int size = arrayList.size();
        arrayList.add(pVar);
        notifyItemRangeInserted(size, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c(int r6, int r7, boolean r8) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            if (r6 < 0) goto L7e
            r1 = 0
            java.util.ArrayList r2 = r5.f46203c
            if (r2 == 0) goto Le
            int r3 = r2.size()
            goto Lf
        Le:
            r3 = r1
        Lf:
            if (r6 >= r3) goto L7e
            if (r7 < 0) goto L7e
            if (r2 == 0) goto L19
            int r1 = r2.size()
        L19:
            if (r7 >= r1) goto L7e
            r1 = 0
            if (r8 == 0) goto L4e
            if (r6 > r7) goto L4b
        L20:
            if (r2 == 0) goto L46
            java.lang.Object r8 = r2.get(r7)
            ym.p r8 = (ym.p) r8
            if (r8 == 0) goto L46
            com.app.tgtg.model.remote.item.response.ElementMnuV2 r8 = r8.f46226a
            com.app.tgtg.model.remote.manufacturer.request.AdapterItemType r3 = r8.getElementType()
            com.app.tgtg.model.remote.manufacturer.request.AdapterItemType r4 = com.app.tgtg.model.remote.manufacturer.request.AdapterItemType.GROUP_HEADER
            if (r3 != r4) goto L46
            boolean r6 = r8 instanceof com.app.tgtg.model.remote.item.response.GroupHeaderMnuV2
            if (r6 == 0) goto L3b
            com.app.tgtg.model.remote.item.response.GroupHeaderMnuV2 r8 = (com.app.tgtg.model.remote.item.response.GroupHeaderMnuV2) r8
            goto L3c
        L3b:
            r8 = r1
        L3c:
            if (r8 == 0) goto L42
            java.lang.String r1 = r8.getNavigationKey()
        L42:
            if (r1 != 0) goto L4b
            r1 = r0
            goto L4b
        L46:
            if (r7 == r6) goto L4b
            int r7 = r7 + (-1)
            goto L20
        L4b:
            if (r1 == 0) goto L7e
            return r1
        L4e:
            if (r6 > r7) goto L7b
        L50:
            if (r2 == 0) goto L76
            java.lang.Object r8 = r2.get(r6)
            ym.p r8 = (ym.p) r8
            if (r8 == 0) goto L76
            com.app.tgtg.model.remote.item.response.ElementMnuV2 r8 = r8.f46226a
            com.app.tgtg.model.remote.manufacturer.request.AdapterItemType r3 = r8.getElementType()
            com.app.tgtg.model.remote.manufacturer.request.AdapterItemType r4 = com.app.tgtg.model.remote.manufacturer.request.AdapterItemType.GROUP_HEADER
            if (r3 != r4) goto L76
            boolean r6 = r8 instanceof com.app.tgtg.model.remote.item.response.GroupHeaderMnuV2
            if (r6 == 0) goto L6b
            com.app.tgtg.model.remote.item.response.GroupHeaderMnuV2 r8 = (com.app.tgtg.model.remote.item.response.GroupHeaderMnuV2) r8
            goto L6c
        L6b:
            r8 = r1
        L6c:
            if (r8 == 0) goto L72
            java.lang.String r1 = r8.getNavigationKey()
        L72:
            if (r1 != 0) goto L7b
            r1 = r0
            goto L7b
        L76:
            if (r6 == r7) goto L7b
            int r6 = r6 + 1
            goto L50
        L7b:
            if (r1 == 0) goto L7e
            return r1
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ym.o.c(int, int, boolean):java.lang.String");
    }

    public final Integer d(String str) {
        str.getClass();
        ArrayList arrayList = this.f46203c;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            p pVar = (p) it.next();
            if (pVar.f46226a.getElementType() == AdapterItemType.GROUP_HEADER && Intrinsics.areEqual(((GroupHeaderMnuV2) pVar.f46226a).getNavigationKey(), str)) {
                break;
            }
            i11++;
        }
        return Integer.valueOf(i11);
    }

    public final void e(int i11) {
        ArrayList arrayList = this.f46203c;
        if (cg.q(arrayList)) {
            Integer numValueOf = arrayList != null ? Integer.valueOf(arrayList.size()) : null;
            numValueOf.getClass();
            if (numValueOf.intValue() > i11) {
                arrayList.remove(i11);
            }
        }
        notifyDataSetChanged();
    }

    public final void f(AdapterItemType adapterItemType) {
        Integer numValueOf;
        int iIntValue;
        adapterItemType.getClass();
        ArrayList arrayList = this.f46203c;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                } else if (adapterItemType == ((p) it.next()).f46226a.getElementType()) {
                    break;
                } else {
                    i11++;
                }
            }
            numValueOf = Integer.valueOf(i11);
        } else {
            numValueOf = null;
        }
        if (numValueOf == null || (iIntValue = numValueOf.intValue()) < 0) {
            return;
        }
        e(iIntValue);
    }

    @Override // androidx.recyclerview.widget.l1
    public final int getItemCount() {
        ArrayList arrayList = this.f46203c;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.l1
    public final int getItemViewType(int i11) {
        p pVar;
        ArrayList arrayList = this.f46203c;
        String strValueOf = String.valueOf((arrayList == null || (pVar = (p) arrayList.get(i11)) == null) ? null : pVar.f46226a.getElementType());
        if (Intrinsics.areEqual(strValueOf, AdapterItemType.ITEM.toString())) {
            return this.f46211k;
        }
        if (Intrinsics.areEqual(strValueOf, AdapterItemType.GROUP_HEADER.toString())) {
            return this.l;
        }
        if (Intrinsics.areEqual(strValueOf, AdapterItemType.PARCEL_TEXT.toString()) || Intrinsics.areEqual(strValueOf, AdapterItemType.TEXT.toString())) {
            return this.f46212m;
        }
        if (Intrinsics.areEqual(strValueOf, AdapterItemType.NPS.toString())) {
            return this.f46213n;
        }
        if (Intrinsics.areEqual(strValueOf, AdapterItemType.MANUFACTURER_STORY_CARD.toString())) {
            return this.f46214o;
        }
        if (Intrinsics.areEqual(strValueOf, AdapterItemType.SMALL_CARDS_CAROUSEL.toString())) {
            return this.f46216q;
        }
        if (Intrinsics.areEqual(strValueOf, AdapterItemType.ITEM_CARDS_CAROUSEL.toString())) {
            return this.f46217r;
        }
        if (Intrinsics.areEqual(strValueOf, AdapterItemType.ITEM_CARDS_CAROUSEL_V2.toString())) {
            return this.f46223x;
        }
        if (Intrinsics.areEqual(strValueOf, AdapterItemType.HERO_CAROUSEL.toString())) {
            return this.f46224y;
        }
        if (Intrinsics.areEqual(strValueOf, AdapterItemType.HIGHLIGHTED_ITEM.toString())) {
            return this.f46218s;
        }
        if (Intrinsics.areEqual(strValueOf, AdapterItemType.HIGHLIGHTED_ITEM_CARDS_CAROUSEL.toString())) {
            return this.f46219t;
        }
        if (Intrinsics.areEqual(strValueOf, AdapterItemType.ITEM_V2.toString())) {
            return this.f46220u;
        }
        if (Intrinsics.areEqual(strValueOf, AdapterItemType.HEADER.toString())) {
            return this.f46221v;
        }
        if (Intrinsics.areEqual(strValueOf, AdapterItemType.SEPARATOR.toString())) {
            return this.f46222w;
        }
        if (Intrinsics.areEqual(strValueOf, AdapterItemType.BASKET_INTRO_BANNER.toString())) {
            return this.f46225z;
        }
        if (Intrinsics.areEqual(strValueOf, AdapterItemType.INTRO_BANNER.toString())) {
            return this.A;
        }
        if (Intrinsics.areEqual(strValueOf, AdapterItemType.TYPED_ITEM_CARDS_CAROUSEL.toString())) {
            return this.f46215p;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.l1
    public final void onBindViewHolder(r2 r2Var, int i11) {
        b bVar = (b) r2Var;
        bVar.getClass();
        int itemViewType = getItemViewType(i11);
        int i12 = this.f46211k;
        ArrayList arrayList = this.f46203c;
        if (itemViewType == i12) {
            i iVar = (i) bVar;
            p pVar = arrayList != null ? (p) arrayList.get(i11) : null;
            if ((pVar != null ? pVar.f46226a : null) instanceof ItemMnu) {
                a50.c.o(new a50.c(iVar.f46191a), pVar.f46226a, false, iVar.f46192b, null, 0, null, null, iVar.f46193c, 122);
                return;
            }
            return;
        }
        if (itemViewType == this.l) {
            f fVar = (f) bVar;
            p pVar2 = arrayList != null ? (p) arrayList.get(i11) : null;
            if ((pVar2 != null ? pVar2.f46226a : null) instanceof GroupHeaderMnuV2) {
                a50.c.o(new a50.c(fVar.f46186a), pVar2.f46226a, false, null, null, 0, null, null, null, 254);
                return;
            }
            return;
        }
        if (itemViewType == this.f46221v) {
            k kVar = (k) bVar;
            p pVar3 = arrayList != null ? (p) arrayList.get(i11) : null;
            if ((pVar3 != null ? pVar3.f46226a : null) instanceof HeaderItem) {
                a50.c.o(new a50.c(kVar.f46196a), pVar3.f46226a, false, null, null, 0, null, null, null, 254);
                return;
            }
            return;
        }
        if (itemViewType == this.f46212m) {
            m mVar = (m) bVar;
            p pVar4 = arrayList != null ? (p) arrayList.get(i11) : null;
            if (!((pVar4 != null ? pVar4.f46226a : null) instanceof TextMnuV2)) {
                if (!((pVar4 != null ? pVar4.f46226a : null) instanceof TextMnu)) {
                    return;
                }
            }
            a50.c.o(new a50.c(mVar.f46198a), pVar4.f46226a, mVar.f46199b > 0, null, null, 0, null, null, null, 252);
            return;
        }
        if (itemViewType == this.f46213n) {
            ArrayList arrayList2 = this.f46208h;
            int i13 = this.f46209i;
            dn.k kVar2 = this.f46207g;
            NpsRatingView npsRatingView = ((l) bVar).f46197a.f34977s;
            arrayList2.getClass();
            npsRatingView.a(arrayList2, i13, new x0.e(kVar2, 7));
            return;
        }
        if (itemViewType == this.f46214o) {
            j jVar = (j) bVar;
            p pVar5 = arrayList != null ? (p) arrayList.get(i11) : null;
            if ((pVar5 != null ? pVar5.f46226a : null) instanceof InfoMnuV2) {
                ConstraintLayout constraintLayout = jVar.f46194a.f34834s;
                constraintLayout.getClass();
                mv.d.x(constraintLayout, new sg.c(jVar, 26));
                return;
            }
            return;
        }
        if (itemViewType == this.f46216q || itemViewType == this.f46217r || itemViewType == this.f46223x || itemViewType == this.f46219t || itemViewType == this.f46215p || itemViewType == this.f46224y) {
            e eVar = (e) bVar;
            p pVar6 = arrayList != null ? (p) arrayList.get(i11) : null;
            ElementMnuV2 elementMnuV2 = pVar6 != null ? pVar6.f46226a : null;
            boolean z11 = elementMnuV2 instanceof CategoryCarouselMnuV2;
            if (z11 || (elementMnuV2 instanceof ItemCarouselMnu) || (elementMnuV2 instanceof ItemCarouselMnuV2) || (elementMnuV2 instanceof HighlightedItemCardsCarouselMnuV2) || (elementMnuV2 instanceof TypedItemCardsCarouselMnu) || (elementMnuV2 instanceof HeroCarouselMnu)) {
                if (z11 && ((CategoryCarouselMnuV2) elementMnuV2).getCards().isEmpty()) {
                    return;
                }
                if ((elementMnuV2 instanceof ItemCarouselMnu) && ((ItemCarouselMnu) elementMnuV2).getItems().isEmpty()) {
                    return;
                }
                if ((elementMnuV2 instanceof ItemCarouselMnuV2) && ((ItemCarouselMnuV2) elementMnuV2).getItems().isEmpty()) {
                    return;
                }
                if ((elementMnuV2 instanceof HighlightedItemCardsCarouselMnuV2) && ((HighlightedItemCardsCarouselMnuV2) elementMnuV2).getItems().isEmpty()) {
                    return;
                }
                if ((elementMnuV2 instanceof TypedItemCardsCarouselMnu) && ((TypedItemCardsCarouselMnu) elementMnuV2).getItems().isEmpty()) {
                    return;
                }
                if ((elementMnuV2 instanceof HeroCarouselMnu) && ((HeroCarouselMnu) elementMnuV2).getItems().isEmpty()) {
                    return;
                }
                a50.c.o(new a50.c(eVar.f46180a), pVar6.f46226a, false, eVar.f46183d, eVar.f46184e, i11, eVar.f46181b, eVar.f46182c, eVar.f46185f, 2);
                return;
            }
            return;
        }
        if (itemViewType == this.f46218s) {
            g gVar = (g) bVar;
            p pVar7 = arrayList != null ? (p) arrayList.get(i11) : null;
            if ((pVar7 != null ? pVar7.f46226a : null) instanceof HighlightedItemMnuV2) {
                a50.c.o(new a50.c(gVar.f46187a), pVar7.f46226a, false, gVar.f46188b, null, 0, null, null, null, m0.DEFAULT_SWIPE_ANIMATION_DURATION);
                return;
            }
            return;
        }
        if (itemViewType == this.f46220u) {
            d dVar = (d) bVar;
            p pVar8 = arrayList != null ? (p) arrayList.get(i11) : null;
            if ((pVar8 != null ? pVar8.f46226a : null) instanceof ItemMnuV2) {
                ItemMnuV2 itemMnuV2 = (ItemMnuV2) pVar8.f46226a;
                int i14 = dVar.f46178d;
                boolean z12 = dVar.f46179e;
                g0 g0Var = dVar.f46175a;
                g0Var.f34873s.setContent(new u3.d(new f1(new an.j(itemMnuV2, i14, z12, g0Var, dVar.f46176b, dVar.f46177c), 5), true, 928714117));
                return;
            }
            return;
        }
        if (itemViewType == this.f46222w) {
            ((n) bVar).a(arrayList != null ? (p) arrayList.get(i11) : null);
            return;
        }
        if (itemViewType == this.f46225z) {
            c cVar = (c) bVar;
            p pVar9 = arrayList != null ? (p) arrayList.get(i11) : null;
            if (((pVar9 != null ? pVar9.f46226a : null) instanceof BasketIntroBannerMnu) && ft.c.u()) {
                a50.c.o(new a50.c(cVar.f46174b), pVar9.f46226a, false, cVar.f46173a, null, 0, null, null, null, m0.DEFAULT_SWIPE_ANIMATION_DURATION);
                return;
            }
            return;
        }
        if (itemViewType != this.A) {
            ((n) bVar).a(arrayList != null ? (p) arrayList.get(i11) : null);
            return;
        }
        h hVar = (h) bVar;
        p pVar10 = arrayList != null ? (p) arrayList.get(i11) : null;
        if ((pVar10 != null ? pVar10.f46226a : null) instanceof IntroBanner) {
            ElementMnuV2 elementMnuV22 = pVar10.f46226a;
            ElementMnuV2 elementMnuV23 = pVar10.f46226a;
            if (((IntroBanner) elementMnuV22).getCampaignCode() == null || !ft.c.n0(((IntroBanner) elementMnuV23).getCampaignCode())) {
                return;
            }
            a50.c.o(new a50.c(hVar.f46190b), elementMnuV23, false, hVar.f46189a, null, 0, null, null, null, m0.DEFAULT_SWIPE_ANIMATION_DURATION);
        }
    }

    @Override // androidx.recyclerview.widget.l1
    public final r2 onCreateViewHolder(ViewGroup viewGroup, int i11) {
        viewGroup.getClass();
        int i12 = this.f46211k;
        u uVar = this.f46201a;
        if (i11 == i12) {
            return new i(b(viewGroup), uVar, this.f46206f);
        }
        if (i11 == this.l) {
            return new f(b(viewGroup));
        }
        if (i11 == this.f46221v) {
            return new k(b(viewGroup));
        }
        if (i11 == this.f46212m) {
            return new m(b(viewGroup), this.f46210j);
        }
        if (i11 == this.f46213n) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            int i13 = l2.f34976t;
            DataBinderMapperImpl dataBinderMapperImpl = a8.c.f965a;
            l2 l2Var = (l2) a8.k.Z(layoutInflaterFrom, R.layout.mnu_list_item_nps, null, false, null);
            l2Var.getClass();
            return new l(l2Var);
        }
        if (i11 == this.f46214o) {
            LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(viewGroup.getContext());
            int i14 = d0.f34833t;
            DataBinderMapperImpl dataBinderMapperImpl2 = a8.c.f965a;
            d0 d0Var = (d0) a8.k.Z(layoutInflaterFrom2, R.layout.delivery_adapter_info_item, null, false, null);
            d0Var.getClass();
            return new j(d0Var, uVar);
        }
        if (i11 == this.f46216q || i11 == this.f46217r || i11 == this.f46223x || i11 == this.f46219t || i11 == this.f46215p || i11 == this.f46224y) {
            return new e(b(viewGroup), Integer.valueOf(this.f46204d), Boolean.valueOf(this.f46205e), this.f46201a, this.f46202b, this.f46206f);
        }
        if (i11 == this.f46218s) {
            return new g(b(viewGroup), uVar);
        }
        if (i11 != this.f46220u) {
            return i11 == this.f46222w ? new n(b(viewGroup)) : i11 == this.f46225z ? new c(b(viewGroup), uVar) : i11 == this.A ? new h(b(viewGroup), uVar) : new n(b(viewGroup));
        }
        LayoutInflater layoutInflaterFrom3 = LayoutInflater.from(viewGroup.getContext());
        int i15 = g0.f34872u;
        DataBinderMapperImpl dataBinderMapperImpl3 = a8.c.f965a;
        g0 g0Var = (g0) a8.k.Z(layoutInflaterFrom3, R.layout.delivery_adapter_list_basket_item, null, false, null);
        g0Var.getClass();
        return new d(g0Var, this.f46201a, this.f46202b, this.f46204d, this.f46205e);
    }
}
