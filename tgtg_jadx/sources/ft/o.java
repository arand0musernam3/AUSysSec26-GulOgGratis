package ft;

import kotlin.jvm.functions.Function0;
import v80.f0;
import y80.a2;
import y80.h1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h8.e f17948h = new h8.e("accessToken");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h8.e f17949i = new h8.e("refreshToken");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h8.e f17950j = new h8.e("accessTokenExpiresAtUtc");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d8.f f17951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2 f17952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f17953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Function0 f17954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f17955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f17956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f17957g;

    public o(d8.f fVar) {
        fVar.getClass();
        this.f17951a = fVar;
        a2 a2VarC = y80.r.c(Boolean.TRUE);
        this.f17952b = a2VarC;
        this.f17953c = new h1(a2VarC);
    }

    public final boolean a() {
        x70.c cVar = null;
        if (this.f17955e == null) {
            this.f17955e = (String) f0.E(kotlin.coroutines.g.f26549a, new l(this, cVar, 0));
        }
        if (!mv.d.r(this.f17955e)) {
            return false;
        }
        if (this.f17956f == null) {
            this.f17956f = (String) f0.E(kotlin.coroutines.g.f26549a, new l(this, cVar, 3));
        }
        return mv.d.r(this.f17956f);
    }
}
