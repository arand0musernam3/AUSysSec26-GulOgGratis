package ki;

import androidx.lifecycle.c1;
import androidx.lifecycle.m1;
import ao.g3;
import ao.r1;
import at.c0;
import com.app.tgtg.model.remote.item.CharityItemInformation;
import com.app.tgtg.model.remote.item.PickupInterval;
import com.app.tgtg.model.remote.item.response.CharityItem;
import com.app.tgtg.model.remote.user.response.charity.Product;
import com.app.tgtg.model.remote.user.response.charity.ProductCategory;
import en.n;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.o0;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.p0;
import v80.f0;
import xh.k;
import y80.a2;
import y80.r;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lki/i;", "Lmk/a;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCharityItemViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CharityItemViewModel.kt\ncom/app/tgtg/feature/charity/ui/itempage/CharityItemViewModel\n+ 2 SavedStateHandle.kt\nandroidx/navigation/SavedStateHandleKt__SavedStateHandleKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n43#2,3:175\n1#3:178\n*S KotlinDebug\n*F\n+ 1 CharityItemViewModel.kt\ncom/app/tgtg/feature/charity/ui/itempage/CharityItemViewModel\n*L\n39#1:175,3\n*E\n"})
public final class i extends mk.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mk.b f26403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r1 f26404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g3 f26405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xh.c f26406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c0 f26407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a2 f26408h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a2 f26409i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a2 f26410j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a2 f26411k;
    public final a2 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a2 f26412m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(mk.b bVar, r1 r1Var, g3 g3Var, xh.c cVar, c0 c0Var) {
        super(bVar);
        r1Var.getClass();
        g3Var.getClass();
        cVar.getClass();
        c0Var.getClass();
        this.f26403c = bVar;
        this.f26404d = r1Var;
        this.f26405e = g3Var;
        this.f26406f = cVar;
        this.f26407g = c0Var;
        x70.c cVar2 = null;
        a2 a2VarC = r.c(null);
        this.f26408h = a2VarC;
        this.f26409i = a2VarC;
        Boolean bool = Boolean.TRUE;
        a2 a2VarC2 = r.c(bool);
        this.f26410j = a2VarC2;
        this.f26411k = a2VarC2;
        a2 a2VarC3 = r.c(null);
        this.l = a2VarC3;
        this.f26412m = a2VarC3;
        if (f().length() == 0) {
            a2VarC3.k(null, bool);
        }
        a2VarC2.k(null, bool);
        f0.B(m1.d(this), null, null, new n(this, cVar2, 1), 3);
    }

    public final String f() {
        c1 c1Var = this.f26403c.f29974b;
        o0 o0Var = o0.f26530a;
        return ((k) e0.f.f(o0Var, k.class, c1Var, o0Var)).f44333b;
    }

    public final void g(cv.i iVar) {
        Integer numValueOf;
        Boolean boolValueOf;
        PickupInterval pickupIntervalL;
        PickupInterval pickupIntervalL2;
        CharityItemInformation information;
        String collectionInfo;
        CharityItemInformation information2;
        List<ProductCategory> categories;
        CharityItemInformation information3;
        List<Product> products;
        CharityItemInformation information4;
        iVar.getClass();
        CharityItem charityItem = (CharityItem) this.f26409i.getValue();
        String intervalStart = null;
        Pair pair = new Pair(dv.a.ITEM_ID, new dv.c((charityItem == null || (information4 = charityItem.getInformation()) == null) ? null : information4.mo340getItemIdFvU5WIY()));
        Pair pair2 = new Pair(dv.a.ITEM_TYPE, new dv.c(charityItem != null ? charityItem.getItemType().name() : null));
        dv.a aVar = dv.a.DONATION_NUMBER_OF_ITEMS;
        if (charityItem == null || (information3 = charityItem.getInformation()) == null || (products = information3.getProducts()) == null) {
            numValueOf = null;
        } else {
            Iterator<T> it = products.iterator();
            long quantity = 0;
            while (it.hasNext()) {
                quantity += ((Product) it.next()).getQuantity();
            }
            numValueOf = Integer.valueOf((int) quantity);
        }
        Pair pair3 = new Pair(aVar, new dv.c(numValueOf));
        Pair pair4 = new Pair(dv.a.DONATION_FOOD_CATEGORIES, new dv.c((charityItem == null || (information2 = charityItem.getInformation()) == null || (categories = information2.getCategories()) == null) ? null : CollectionsKt.U(categories, MessageLogView.COMMA_SEPARATOR, null, null, new k9.f(2), 30)));
        dv.a aVar2 = dv.a.DONATION_COLLECTION_INSTRUCTIONS;
        if (charityItem == null || (information = charityItem.getInformation()) == null || (collectionInfo = information.getCollectionInfo()) == null) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(collectionInfo.length() > 0);
        }
        Pair pair5 = new Pair(aVar2, new dv.c(boolValueOf));
        Pair pair6 = new Pair(dv.a.DONATION_WINDOW_LENGTH, new dv.c((charityItem == null || (pickupIntervalL2 = mv.d.l(charityItem)) == null) ? null : pickupIntervalL2.getPickupWindowLength()));
        dv.a aVar3 = dv.a.DONATION_COLLECTION_START_TIME;
        if (charityItem != null && (pickupIntervalL = mv.d.l(charityItem)) != null) {
            intervalStart = pickupIntervalL.getIntervalStart();
        }
        d(iVar, h0.g.E(pair, pair2, pair3, pair4, pair5, pair6, new Pair(aVar3, new dv.c(p0.H(intervalStart)))));
    }
}
