package ej;

import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import gj.c0;
import gj.v;
import gj.w;
import kotlin.Metadata;
import kotlin.jvm.internal.LongCompanionObject;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import y80.a1;
import y80.g1;
import y80.h1;
import y80.r;
import y80.x1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lej/c;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f16043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f16044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jj.c f16045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g1 f16046d;

    public c(w wVar) {
        wVar.getClass();
        this.f16043a = wVar;
        this.f16044b = r.x(new a1(wVar.e(), wVar.f20523c, new v(wVar, null)), m1.d(this), new x1(5000L, LongCompanionObject.MAX_VALUE), new c0(null, false, null, null, null, null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        this.f16045c = new jj.c(wVar);
        this.f16046d = wVar.f20525e;
    }
}
