package ye;

import android.content.Context;
import com.braze.models.BrazeGeofence;
import java.io.File;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p0;
import q1.h1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f45887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f45889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f45890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final nf.f f45891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final se.d f45892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f45893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final nf.d f45894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c0 f45895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f45896k;
    public final long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f45897m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final nf.f f45898n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ky.p f45899o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f45900p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Boolean f45901q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v f45902r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f45903s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f45904t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public File f45905u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LinkedHashSet f45906v;

    public g(String str, Context context, String str2, c0 c0Var, p0 p0Var) {
        se.d dVar = new se.d(21);
        nf.d dVar2 = nf.d.US;
        Boolean bool = Boolean.FALSE;
        v vVar = new v();
        dVar2.getClass();
        p0Var.getClass();
        this.f45886a = str;
        this.f45887b = context;
        this.f45888c = 30;
        this.f45889d = BrazeGeofence.DEFAULT_NOTIFICATION_RESPONSIVENESS_MS;
        this.f45890e = str2;
        this.f45891f = hf.e.f22020a;
        this.f45892g = dVar;
        this.f45893h = 5;
        this.f45894i = dVar2;
        this.f45895j = c0Var;
        this.f45896k = true;
        this.l = 300000L;
        this.f45897m = 30000L;
        this.f45898n = hf.e.f22022c;
        this.f45899o = hf.e.f22021b;
        this.f45900p = true;
        this.f45901q = bool;
        this.f45902r = vVar;
        this.f45903s = true;
        this.f45904t = true;
        this.f45906v = CollectionsKt.u0(p0Var);
        new i(true, false, false, false).f45911e.add(new h1(this, 10));
    }

    public final File a() {
        if (this.f45905u == null) {
            Context context = this.f45887b;
            File dir = context.getDir("amplitude", 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(context.getPackageName());
            sb2.append('/');
            File file = new File(dir, r8.k.p(sb2, this.f45890e, "/analytics/"));
            this.f45905u = file;
            file.mkdirs();
        }
        File file2 = this.f45905u;
        file2.getClass();
        return file2;
    }
}
