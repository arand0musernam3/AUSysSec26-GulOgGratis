package si;

import androidx.lifecycle.l1;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.h1;
import m3.i;
import m3.k1;
import mn.g;
import v80.f0;
import w2.z;
import y80.a2;
import y80.g1;
import y80.m1;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsi/b;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReservationHistoryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReservationHistoryViewModel.kt\ncom/app/tgtg/feature/charity/ui/reservation/ReservationHistoryViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,63:1\n85#2:64\n117#2,2:65\n78#3:67\n111#3,2:68\n78#3:70\n111#3,2:71\n*S KotlinDebug\n*F\n+ 1 ReservationHistoryViewModel.kt\ncom/app/tgtg/feature/charity/ui/reservation/ReservationHistoryViewModel\n*L\n28#1:64\n28#1:65,2\n29#1:67\n29#1:68,2\n30#1:70\n30#1:71,2\n*E\n"})
public final class b extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f39030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2 f39031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2 f39032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k1 f39033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h1 f39034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h1 f39035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m1 f39036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g1 f39037h;

    public b(cv.b bVar, z zVar) {
        bVar.getClass();
        this.f39030a = zVar;
        a2 a2VarC = r.c(new HashMap());
        this.f39031b = a2VarC;
        this.f39032c = a2VarC;
        this.f39033d = i.w(Boolean.FALSE);
        this.f39034e = new h1(0);
        this.f39035f = new h1(1);
        m1 m1VarB = r.b(0, 0, null, 7);
        this.f39036g = m1VarB;
        this.f39037h = new g1(m1VarB);
        a();
        bVar.b(cv.i.SCREEN_HISTORY_LIST);
    }

    public final void a() {
        k1 k1Var = this.f39033d;
        if (((Boolean) k1Var.getValue()).booleanValue() || this.f39034e.h() >= this.f39035f.h()) {
            return;
        }
        k1Var.setValue(Boolean.TRUE);
        f0.B(androidx.lifecycle.m1.d(this), null, null, new g(this, null, 26), 3);
    }
}
