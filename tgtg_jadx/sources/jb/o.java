package jb;

import android.text.TextUtils;
import ib.k0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f24907i = ib.w.f("WorkContinuationImpl");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f24908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ib.m f24910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f24911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f24912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f24913f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f24914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ib.y f24915h;

    public o(s sVar, String str, ib.m mVar, List list, int i11) {
        this.f24908a = sVar;
        this.f24909b = str;
        this.f24910c = mVar;
        this.f24911d = list;
        this.f24912e = new ArrayList(list.size());
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (mVar == ib.m.REPLACE && ((k0) list.get(i12)).f23745b.f36847u != LongCompanionObject.MAX_VALUE) {
                i4.a.f("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
            String string = ((k0) list.get(i12)).f23744a.toString();
            string.getClass();
            this.f24912e.add(string);
            this.f24913f.add(string);
        }
    }

    public static HashSet b(o oVar) {
        HashSet hashSet = new HashSet();
        oVar.getClass();
        return hashSet;
    }

    public final ib.y a() {
        if (this.f24914g) {
            ib.w.d().g(f24907i, "Already enqueued work ids (" + TextUtils.join(", ", this.f24912e) + ")");
        } else {
            s sVar = this.f24908a;
            this.f24915h = jf.e.I(sVar.f24925b.f23703m, "EnqueueRunnable_" + this.f24910c.name(), sVar.f24927d.f38956a, new hi.d(this, 25));
        }
        return this.f24915h;
    }
}
