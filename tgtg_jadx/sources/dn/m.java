package dn;

import android.widget.ImageView;
import com.app.tgtg.feature.main.fragments.delivery.parcelfeed.compose.vertitems.DeliveryCategoryCarousel;
import com.app.tgtg.model.remote.item.response.SortingChoice;
import com.app.tgtg.model.remote.manufacturer.request.CardsType;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pg.c2;
import ym.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f15023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f15024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f15026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f15028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15029g;

    public m(c2 c2Var, w wVar) {
        c2Var.getClass();
        wVar.getClass();
        this.f15023a = c2Var;
        this.f15024b = wVar;
        this.f15028f = new LinkedHashMap();
    }

    public final void a() {
        LinkedHashMap linkedHashMap = this.f15028f;
        if (linkedHashMap.isEmpty()) {
            return;
        }
        this.f15024b.e(cv.i.TEMP_ACTION_SEE_CAROUSEL_ELEMENT, h0.g.E(new Pair(dv.a.SEEN, new dv.c(CollectionsKt.r0(linkedHashMap.values()))), new Pair(dv.a.HORIZONTAL_POSITION, new dv.c(CollectionsKt.r0(linkedHashMap.keySet()))), new Pair(dv.a.TYPE, new dv.c(CardsType.CATEGORIES.toString()))));
        linkedHashMap.clear();
    }

    public final void b(String str) {
        boolean zAreEqual = Intrinsics.areEqual(str, "");
        c2 c2Var = this.f15023a;
        if (zAreEqual || Intrinsics.areEqual(this.f15026d, str)) {
            c2Var.f34822z.setNewCategory(false);
            return;
        }
        DeliveryCategoryCarousel deliveryCategoryCarousel = c2Var.f34822z;
        DeliveryCategoryCarousel deliveryCategoryCarousel2 = c2Var.f34822z;
        deliveryCategoryCarousel.setSelectedId(str);
        deliveryCategoryCarousel2.setOldIndex(this.f15029g);
        deliveryCategoryCarousel2.setNewCategory(true);
    }

    public final void c(SortingChoice sortingChoice) {
        w wVar = this.f15024b;
        wVar.f46271t = sortingChoice;
        c2 c2Var = this.f15023a;
        ImageView imageView = c2Var.B;
        imageView.getClass();
        imageView.setVisibility((sortingChoice != null ? sortingChoice.getId() : null) != null ? 0 : 8);
        c2Var.J.setSelectedSortingId(sortingChoice != null ? sortingChoice.getId() : null);
        String actionData = sortingChoice != null ? sortingChoice.getActionData() : null;
        if (actionData == null) {
            actionData = "";
        }
        wVar.a(actionData);
    }
}
