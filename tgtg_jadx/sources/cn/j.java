package cn;

import a3.r2;
import ao.p2;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.CategoryCard;
import com.app.tgtg.model.remote.item.response.CategoryCarouselMnuV2;
import com.app.tgtg.model.remote.item.response.ElementMnuV2;
import com.app.tgtg.model.remote.item.response.HeroCarouselMnu;
import com.app.tgtg.model.remote.item.response.HighlightedItemCardsCarouselMnuV2;
import com.app.tgtg.model.remote.item.response.ItemCarouselMnu;
import com.app.tgtg.model.remote.item.response.ItemCarouselMnuV2;
import com.app.tgtg.model.remote.manufacturer.request.AdapterItemType;
import d2.g2;
import d2.i2;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import m2.a2;
import m2.w0;
import m2.y1;
import m3.i0;
import z1.h2;
import z4.l1;
import z4.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8549e;

    public /* synthetic */ j(ElementMnuV2 elementMnuV2, int i11, ym.y yVar, String str) {
        this.f8545a = 0;
        this.f8547c = elementMnuV2;
        this.f8546b = i11;
        this.f8548d = yVar;
        this.f8549e = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f8545a) {
            case 0:
                ElementMnuV2 elementMnuV2 = (ElementMnuV2) this.f8547c;
                ym.y yVar = (ym.y) this.f8548d;
                String str = (String) this.f8549e;
                f2.l lVar = (f2.l) obj;
                lVar.getClass();
                boolean z11 = elementMnuV2 instanceof CategoryCarouselMnuV2;
                int i11 = this.f8546b;
                if (z11) {
                    CategoryCarouselMnuV2 categoryCarouselMnuV2 = (CategoryCarouselMnuV2) elementMnuV2;
                    List<CategoryCard> cards = categoryCarouselMnuV2.getCards();
                    lVar.r(cards.size(), new p2(3, new r2(28), cards), new n(cards, 1), new u3.d(new r(cards, yVar, i11, categoryCarouselMnuV2, 0), true, 2039820996));
                } else {
                    boolean z12 = elementMnuV2 instanceof ItemCarouselMnu;
                    if (z12) {
                        List<BaseItemMnuV2> items = ((ItemCarouselMnu) elementMnuV2).getItems();
                        lVar.r(items.size(), new p2(4, new r2(27), items), new n(items, 2), new u3.d(new r(items, yVar, i11, str, 1), true, 2039820996));
                    } else {
                        boolean z13 = elementMnuV2 instanceof ItemCarouselMnuV2;
                        if (z13 || (elementMnuV2 instanceof HeroCarouselMnu) || (elementMnuV2 instanceof HighlightedItemCardsCarouselMnuV2)) {
                            AdapterItemType adapterItemType = z12 ? AdapterItemType.ITEM_CARDS_CAROUSEL : z13 ? AdapterItemType.ITEM_CARDS_CAROUSEL_V2 : elementMnuV2 instanceof HeroCarouselMnu ? AdapterItemType.HERO_CAROUSEL : elementMnuV2 instanceof HighlightedItemCardsCarouselMnuV2 ? AdapterItemType.HIGHLIGHTED_ITEM_CARDS_CAROUSEL : z11 ? AdapterItemType.ITEM_CARDS_CAROUSEL : AdapterItemType.ITEM_CARDS_CAROUSEL;
                            List<BaseItemMnuV2> items2 = z13 ? ((ItemCarouselMnuV2) elementMnuV2).getItems() : elementMnuV2 instanceof HeroCarouselMnu ? ((HeroCarouselMnu) elementMnuV2).getItems() : elementMnuV2 instanceof HighlightedItemCardsCarouselMnuV2 ? ((HighlightedItemCardsCarouselMnuV2) elementMnuV2).getItems() : n0.f26529a;
                            lVar.r(items2.size(), new p2(2, new r2(26), items2), new n(items2, 0), new u3.d(new o(items2, yVar, adapterItemType, i11, elementMnuV2, str), true, 2039820996));
                        }
                    }
                }
                return Unit.f26487a;
            case 1:
                m1[] m1VarArr = (m1[]) this.f8547c;
                i2 i2Var = (i2) this.f8548d;
                int[] iArr = (int[]) this.f8549e;
                l1 l1Var = (l1) obj;
                int length = m1VarArr.length;
                int i12 = 0;
                int i13 = 0;
                while (i12 < length) {
                    m1 m1Var = m1VarArr[i12];
                    int i14 = i13 + 1;
                    m1Var.getClass();
                    Object objG = m1Var.G();
                    g2 g2Var = objG instanceof g2 ? (g2) objG : null;
                    d2.c cVar = g2Var != null ? g2Var.f13795c : null;
                    int i15 = this.f8546b;
                    l1Var.j(m1Var, iArr[i13], cVar != null ? cVar.i(i15, m1Var.f47184b, z5.m.Ltr) : i2Var.f13813b.a(m1Var.f47184b, i15), 0.0f);
                    i12++;
                    i13 = i14;
                }
                return Unit.f26487a;
            case 2:
                w0 w0Var = (w0) this.f8547c;
                z4.w0 w0Var2 = (z4.w0) this.f8548d;
                m1 m1Var2 = (m1) this.f8549e;
                l1 l1Var2 = (l1) obj;
                int i16 = w0Var.f29103b;
                y1 y1Var = w0Var.f29102a;
                r5.e0 e0Var = w0Var.f29104c;
                a2 a2Var = (a2) w0Var.f29105d.invoke();
                y1Var.a(h2.Horizontal, m2.g0.o(l1Var2, i16, e0Var, a2Var != null ? a2Var.f28762a : null, w0Var2.getLayoutDirection() == z5.m.Rtl, m1Var2.f47183a), this.f8546b, m1Var2.f47183a);
                l1.o(l1Var2, m1Var2, Math.round(-y1Var.f29139a.h()), 0);
                return Unit.f26487a;
            default:
                i0 i0Var = (i0) this.f8547c;
                u3.f fVar = (u3.f) this.f8548d;
                q1.n0 n0Var = (q1.n0) this.f8549e;
                if (obj == i0Var) {
                    com.braze.h2.b("A derived state calculation cannot read itself");
                    return null;
                }
                if (obj instanceof z3.d0) {
                    int i17 = fVar.f40654a - this.f8546b;
                    int iA = n0Var.a(obj);
                    n0Var.g(Math.min(i17, iA >= 0 ? n0Var.f35870c[iA] : Integer.MAX_VALUE), obj);
                }
                return Unit.f26487a;
        }
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i11, int i12) {
        this.f8545a = i12;
        this.f8547c = obj;
        this.f8548d = obj2;
        this.f8549e = obj3;
        this.f8546b = i11;
    }

    public /* synthetic */ j(m1[] m1VarArr, i2 i2Var, int i11, int[] iArr) {
        this.f8545a = 1;
        this.f8547c = m1VarArr;
        this.f8548d = i2Var;
        this.f8546b = i11;
        this.f8549e = iArr;
    }
}
