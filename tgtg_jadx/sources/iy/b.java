package iy;

import d40.t1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import lz.i;
import u70.p;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q2 f24240b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(q2 q2Var, int i11) {
        super(0);
        this.f24239a = i11;
        this.f24240b = q2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f24239a) {
            case 0:
                Object objH = t1.H(1000L, new defpackage.a((i) this.f24240b.f48334b, 24));
                if (objH instanceof p) {
                    objH = "";
                }
                return new a((String) objH);
            case 1:
                Object objH2 = t1.H(1000L, new defpackage.a((se.b) this.f24240b.f48333a, 25));
                if (objH2 instanceof p) {
                    objH2 = "";
                }
                String str = (String) objH2;
                return new c(str != null ? str : "");
            default:
                Object obj = this.f24240b.f48335c;
                Object objH3 = t1.H(3000L, new hy.a(0));
                if (objH3 instanceof p) {
                    objH3 = null;
                }
                String str2 = (String) objH3;
                if (str2 == null) {
                    str2 = "";
                }
                return new d(str2);
        }
    }
}
