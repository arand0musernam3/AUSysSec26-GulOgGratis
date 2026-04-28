package qo;

import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import ao.f2;
import ao.g3;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.UserData;
import com.app.tgtg.model.remote.item.response.ItemType;
import et.z;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.d0;
import v80.f0;
import y80.g1;
import y80.m1;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqo/h;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f37208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cv.b f37209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f37210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f2 f37211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final so.a f37212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final UserData f37213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f37214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f37215h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f37216i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m1 f37217j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g1 f37218k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m1 f37219m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g1 f37220n;

    public h(c1 c1Var, cv.b bVar, z zVar, g3 g3Var, f2 f2Var, so.a aVar) {
        c1Var.getClass();
        bVar.getClass();
        zVar.getClass();
        g3Var.getClass();
        f2Var.getClass();
        aVar.getClass();
        this.f37208a = c1Var;
        this.f37209b = bVar;
        this.f37210c = zVar;
        this.f37211d = f2Var;
        this.f37212e = aVar;
        this.f37213f = g3Var.m();
        this.f37216i = d0.j(f.ADD_EMAIL, f.ADD_REMINDER, f.ADD_PHONE_NUMBER, f.END);
        m1 m1VarB = r.b(0, 0, null, 7);
        this.f37217j = m1VarB;
        this.f37218k = new g1(m1VarB);
        m1 m1VarB2 = r.b(0, 0, null, 7);
        this.f37219m = m1VarB2;
        this.f37220n = new g1(m1VarB2);
    }

    public static void c(h hVar) {
        x70.c cVar = null;
        if (!hVar.l) {
            f0.B(androidx.lifecycle.m1.d(hVar), null, null, new g(hVar, cVar, 1), 3);
        }
        f0.B(androidx.lifecycle.m1.d(hVar), null, null, new g(hVar, cVar, 2), 3);
    }

    public final ItemType a() {
        ItemType itemType = (ItemType) this.f37208a.a("ITEM_TYPE");
        return itemType == null ? ItemType.UNKNOWN : itemType;
    }

    public final String b() {
        OrderId orderId = (OrderId) this.f37208a.a("ORDER_ID");
        if (orderId != null) {
            return orderId.m217unboximpl();
        }
        return null;
    }
}
