package en;

import com.app.tgtg.feature.main.fragments.delivery.parcelitemdetails.ManufacturerItemDetailsActivity;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.item.response.ManufacturerItem;
import com.app.tgtg.model.remote.payment.ExtendedPriceSpecification;
import pg.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2 f16105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f16106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BasketManager f16107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ManufacturerItemDetailsActivity f16108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ManufacturerItem f16109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f16112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ExtendedPriceSpecification f16113i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16114j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f16115k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f16116m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f16117n;

    public b(a2 a2Var, o oVar, ManufacturerItemDetailsActivity manufacturerItemDetailsActivity) {
        BasketManager basketManagerRestoreBasketManager = new BasketManager(null, null, 0L, 0L, 0, null, null, 127, null).restoreBasketManager(String.valueOf(oVar.f16169d.h()), oVar.g());
        a2Var.getClass();
        oVar.getClass();
        this.f16105a = a2Var;
        this.f16106b = oVar;
        this.f16107c = basketManagerRestoreBasketManager;
        this.f16108d = manufacturerItemDetailsActivity;
        this.f16114j = 1;
        this.l = 5;
    }

    public final boolean a() {
        ManufacturerItem manufacturerItem;
        BasketManager basketManager = this.f16107c;
        if (basketManager == null || (manufacturerItem = this.f16109e) == null) {
            return false;
        }
        return basketManager.getQuantity(manufacturerItem.getInformation().mo340getItemIdFvU5WIY()) + (this.f16106b.g() - basketManager.getTotalBasketItems()) == this.f16111g;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: en.b.b():void");
    }
}
