package g2;

import h2.h0;
import h2.q0;
import h2.r0;
import h2.s0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f18190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q0 f18191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q0 f18193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0 f18194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f18195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f18197j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k kVar, q0 q0Var, int i11, b0 b0Var, int i12, int i13, long j9) {
        super(0);
        this.f18193f = q0Var;
        this.f18194g = b0Var;
        this.f18195h = i12;
        this.f18196i = i13;
        this.f18197j = j9;
        this.f18190c = kVar;
        this.f18191d = q0Var;
        this.f18192e = i11;
    }

    @Override // h2.s0
    public final r0 i(int i11, int i12, int i13, long j9) {
        return q(i11, i12, i13, this.f18192e, j9);
    }

    public final s q(int i11, int i12, int i13, int i14, long j9) {
        int iJ;
        k kVar = this.f18190c;
        Object objB = kVar.b(i11);
        Object objJ = kVar.f18175b.j(i11);
        List listK = k(this.f18191d, i11, j9);
        if (z5.a.g(j9)) {
            iJ = z5.a.k(j9);
        } else {
            if (!z5.a.f(j9)) {
                c2.a.a("does not have fixed height");
            }
            iJ = z5.a.j(j9);
        }
        int i15 = iJ;
        z5.m layoutDirection = this.f18193f.f21211b.getLayoutDirection();
        h0 h0Var = this.f18194g.f18137m;
        return new s(i11, objB, i15, i14, layoutDirection, this.f18195h, this.f18196i, listK, this.f18197j, objJ, h0Var, j9, i12, i13);
    }
}
