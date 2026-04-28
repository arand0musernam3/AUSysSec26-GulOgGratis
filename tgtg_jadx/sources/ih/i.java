package ih;

import android.content.Context;
import android.text.format.DateUtils;
import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import ao.g3;
import ao.r1;
import c5.a1;
import ft.j;
import kotlin.Metadata;
import mv.p0;
import y80.a2;
import y80.h1;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lih/i;", "Landroidx/lifecycle/l1;", "ih/e", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f23853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hh.a f23854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f23855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r1 f23856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g3 f23857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final rg.d f23858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dh.a f23859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final cv.b f23860h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a2 f23861i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a2 f23862j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a2 f23863k;
    public final a2 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a2 f23864m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h1 f23865n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a2 f23866o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h1 f23867p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f23868q;

    public i(c1 c1Var, hh.a aVar, j jVar, r1 r1Var, g3 g3Var, rg.d dVar, dh.a aVar2, cv.b bVar) {
        c1Var.getClass();
        aVar.getClass();
        jVar.getClass();
        r1Var.getClass();
        g3Var.getClass();
        dVar.getClass();
        aVar2.getClass();
        bVar.getClass();
        this.f23853a = c1Var;
        this.f23854b = aVar;
        this.f23855c = jVar;
        this.f23856d = r1Var;
        this.f23857e = g3Var;
        this.f23858f = dVar;
        this.f23859g = aVar2;
        this.f23860h = bVar;
        a2 a2VarC = r.c(null);
        this.f23861i = a2VarC;
        this.f23862j = a2VarC;
        a2 a2VarC2 = r.c(null);
        this.f23863k = a2VarC2;
        this.l = a2VarC2;
        Boolean bool = Boolean.FALSE;
        a2 a2VarC3 = r.c(bool);
        this.f23864m = a2VarC3;
        this.f23865n = new h1(a2VarC3);
        a2 a2VarC4 = r.c(bool);
        this.f23866o = a2VarC4;
        this.f23867p = new h1(a2VarC4);
    }

    public final String a(Context context) {
        context.getClass();
        gh.f userBadgeDetails = this.f23857e.n().getUserBadgeDetails();
        String str = userBadgeDetails != null ? userBadgeDetails.f20445a : null;
        if (str == null) {
            return "*";
        }
        a1 a1Var = p0.f30209a;
        context.getClass();
        long jH = p0.h(str);
        if (jH == 0) {
            return "-";
        }
        String dateTime = DateUtils.formatDateTime(context, jH, 131092);
        dateTime.getClass();
        return dateTime;
    }
}
