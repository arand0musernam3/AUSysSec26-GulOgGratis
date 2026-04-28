package l9;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.f0;
import androidx.lifecycle.f1;
import androidx.lifecycle.i1;
import g9.l;
import g9.q;
import g9.z;
import java.util.Arrays;
import jb.u;
import kotlin.Pair;
import kotlin.collections.o0;
import kotlin.jvm.internal.Reflection;
import u70.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f27514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f27515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f27516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Lifecycle.State f27517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f27518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f27519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f27520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ea.e f27521h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f27522i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f0 f27523j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Lifecycle.State f27524k;
    public final i1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f27525m;

    public c(l lVar) {
        this.f27514a = lVar;
        this.f27515b = lVar.f20163b;
        this.f27516c = lVar.f20164c;
        this.f27517d = lVar.f20165d;
        this.f27518e = lVar.f20166e;
        this.f27519f = lVar.f20167f;
        this.f27520g = lVar.f20168g;
        this.f27521h = new ea.e(new ga.a(lVar, new cw.b(lVar, 6)));
        t tVarB = u70.l.b(new jq.a(20));
        this.f27523j = new f0(lVar, true);
        this.f27524k = Lifecycle.State.INITIALIZED;
        this.l = (i1) tVarB.getValue();
        this.f27525m = u70.l.b(new jq.a(21));
    }

    public final Bundle a() {
        Bundle bundle = this.f27516c;
        if (bundle == null) {
            return null;
        }
        o0.f26530a.getClass();
        Bundle bundleX = u.x((Pair[]) Arrays.copyOf(new Pair[0], 0));
        bundleX.putAll(bundle);
        return bundleX;
    }

    public final void b() {
        if (!this.f27522i) {
            ea.e eVar = this.f27521h;
            eVar.a();
            this.f27522i = true;
            if (this.f27518e != null) {
                f1.b(this.f27514a);
            }
            eVar.b(this.f27520g);
        }
        int iOrdinal = this.f27517d.ordinal();
        int iOrdinal2 = this.f27524k.ordinal();
        f0 f0Var = this.f27523j;
        if (iOrdinal < iOrdinal2) {
            f0Var.i(this.f27517d);
        } else {
            f0Var.i(this.f27524k);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Reflection.getOrCreateKotlinClass(l.class).getSimpleName());
        sb2.append("(" + this.f27519f + ')');
        sb2.append(" destination=");
        sb2.append(this.f27515b);
        return sb2.toString();
    }
}
