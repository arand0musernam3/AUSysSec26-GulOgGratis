package v1;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import z1.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f41793c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EdgeEffect f41794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EdgeEffect f41795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EdgeEffect f41796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EdgeEffect f41797g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public EdgeEffect f41798h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EdgeEffect f41799i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public EdgeEffect f41800j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EdgeEffect f41801k;

    public n0(Context context, int i11) {
        this.f41791a = context;
        this.f41792b = i11;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? l.b(edgeEffect) : 0.0f) == 0.0f);
    }

    public final EdgeEffect a(h2 h2Var) {
        int i11 = Build.VERSION.SDK_INT;
        Context context = this.f41791a;
        EdgeEffect edgeEffectA = i11 >= 31 ? l.a(context) : new r0(context);
        edgeEffectA.setColor(this.f41792b);
        if (!z5.l.a(this.f41793c, 0L)) {
            h2 h2Var2 = h2.Vertical;
            long j9 = this.f41793c;
            if (h2Var == h2Var2) {
                edgeEffectA.setSize((int) (j9 >> 32), (int) (j9 & 4294967295L));
                return edgeEffectA;
            }
            edgeEffectA.setSize((int) (4294967295L & j9), (int) (j9 >> 32));
        }
        return edgeEffectA;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f41795e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(h2.Vertical);
        this.f41795e = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f41796f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(h2.Horizontal);
        this.f41796f = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.f41797g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(h2.Horizontal);
        this.f41797g = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f41794d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(h2.Vertical);
        this.f41794d = edgeEffectA;
        return edgeEffectA;
    }
}
