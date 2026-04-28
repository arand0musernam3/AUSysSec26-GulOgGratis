package zj;

import androidx.lifecycle.l1;
import androidx.lifecycle.o0;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.local.SearchFilter;
import kotlin.Metadata;
import mv.u;
import u70.l;
import u70.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzj/j;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.b f47948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cv.b f47949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f47950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f47951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f47952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f47953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f47954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f47955h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o0 f47956i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o0 f47957j;

    public j(ft.b bVar, cv.b bVar2, u uVar) {
        bVar.getClass();
        bVar2.getClass();
        uVar.getClass();
        this.f47948a = bVar;
        this.f47949b = bVar2;
        this.f47950c = uVar;
        this.f47951d = l.b(new zendesk.ui.android.conversation.composer.b(10));
        this.f47952e = l.b(new zendesk.ui.android.conversation.composer.b(11));
        this.f47953f = l.b(new zendesk.ui.android.conversation.composer.b(12));
        this.f47954g = l.b(new zendesk.ui.android.conversation.composer.b(13));
        this.f47955h = l.b(new zendesk.ui.android.conversation.composer.b(14));
        o0 o0Var = new o0();
        this.f47956i = o0Var;
        this.f47957j = o0Var;
    }

    public final void a() {
        ft.b bVar = this.f47948a;
        bVar.getClass();
        SearchFilter searchFilter = new SearchFilter(false, null, null, null, null, ft.b.a().getSearchText(), null, false, AppConstants.GO_TO_GPS_SETTINGS, null);
        bVar.getClass();
        bVar.f17901a = searchFilter;
        ((o0) this.f47952e.getValue()).k(searchFilter);
        ((o0) this.f47953f.getValue()).k(searchFilter);
        ((o0) this.f47954g.getValue()).k(searchFilter);
        ((o0) this.f47955h.getValue()).k(searchFilter);
        ((o0) this.f47951d.getValue()).k(searchFilter);
    }
}
