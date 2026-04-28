package r40;

import android.content.Context;
import com.google.android.gms.tasks.Tasks;
import d10.o;
import java.util.Set;
import java.util.concurrent.Executor;
import lx.u;
import u30.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements e, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f37617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f37618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t40.b f37619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f37620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f37621e;

    public c(Context context, String str, Set set, t40.b bVar, Executor executor) {
        this.f37617a = new k(new p30.c(context, str));
        this.f37620d = set;
        this.f37621e = executor;
        this.f37619c = bVar;
        this.f37618b = context;
    }

    public final o a() {
        if (!u.K(this.f37618b)) {
            return Tasks.d("");
        }
        return Tasks.b(this.f37621e, new b(this, 0));
    }

    public final void b() {
        if (this.f37620d.size() <= 0) {
            Tasks.d(null);
        } else if (!u.K(this.f37618b)) {
            Tasks.d(null);
        } else {
            Tasks.b(this.f37621e, new b(this, 1));
        }
    }
}
