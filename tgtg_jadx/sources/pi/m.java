package pi;

import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import c5.a1;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.p0;
import v80.b2;
import v80.f0;
import w2.z;
import y80.a2;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpi/m;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCharityPlanViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CharityPlanViewModel.kt\ncom/app/tgtg/feature/charity/ui/plan/CharityPlanViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,194:1\n363#2,7:195\n1#3:202\n*S KotlinDebug\n*F\n+ 1 CharityPlanViewModel.kt\ncom/app/tgtg/feature/charity/ui/plan/CharityPlanViewModel\n*L\n103#1:195,7\n*E\n"})
public final class m extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f35398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xh.c f35399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d8.f f35400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cv.b f35401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Calendar f35402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Date f35403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b2 f35404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a2 f35405h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a2 f35406i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a2 f35407j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a2 f35408k;
    public final a2 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a2 f35409m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a2 f35410n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a2 f35411o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SimpleDateFormat f35412p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SimpleDateFormat f35413q;

    public m(z zVar, xh.c cVar, d8.f fVar, cv.b bVar) {
        cVar.getClass();
        fVar.getClass();
        bVar.getClass();
        this.f35398a = zVar;
        this.f35399b = cVar;
        this.f35400c = fVar;
        this.f35401d = bVar;
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(2);
        calendar.setMinimalDaysInFirstWeek(4);
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(7, calendar.getFirstDayOfWeek());
        this.f35402e = calendar;
        Date time = Calendar.getInstance().getTime();
        time.getClass();
        this.f35403f = time;
        a1 a1Var = p0.f30209a;
        a2 a2VarC = r.c(Integer.valueOf(calendar.get(3)));
        this.f35405h = a2VarC;
        this.f35406i = a2VarC;
        a2 a2VarC2 = r.c(p0.x(calendar));
        this.f35407j = a2VarC2;
        this.f35408k = a2VarC2;
        a2 a2VarC3 = r.c(0);
        this.l = a2VarC3;
        this.f35409m = a2VarC3;
        a2 a2VarC4 = r.c(o.f35415a);
        this.f35410n = a2VarC4;
        this.f35411o = a2VarC4;
        this.f35412p = new SimpleDateFormat("yyyy-MM-dd");
        this.f35413q = new SimpleDateFormat("HH:mm");
        a();
    }

    public final void a() {
        b2 b2Var = this.f35404g;
        x70.c cVar = null;
        if (b2Var != null) {
            b2Var.a(null);
        }
        a2 a2Var = this.f35410n;
        a2Var.getClass();
        a2Var.k(null, o.f35415a);
        this.f35404g = f0.B(m1.d(this), null, null, new j(this, cVar, 0), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        if (kotlin.Unit.f26487a == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(z70.c r11) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.m.b(z70.c):java.lang.Object");
    }
}
