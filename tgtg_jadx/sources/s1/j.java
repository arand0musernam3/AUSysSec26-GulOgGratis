package s1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import z4.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m1[] f38624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f38625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f38627d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m1[] m1VarArr, k kVar, int i11, int i12) {
        super(1);
        this.f38624a = m1VarArr;
        this.f38625b = kVar;
        this.f38626c = i11;
        this.f38627d = i12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        z4.l1 l1Var = (z4.l1) obj;
        for (m1 m1Var : this.f38624a) {
            if (m1Var != null) {
                long jA = this.f38625b.f38636a.f38674b.a((((long) m1Var.f47183a) << 32) | (((long) m1Var.f47184b) & 4294967295L), (((long) this.f38626c) << 32) | (((long) this.f38627d) & 4294967295L), z5.m.Ltr);
                l1Var.j(m1Var, (int) (jA >> 32), (int) (jA & 4294967295L), 0.0f);
            }
        }
        return Unit.f26487a;
    }
}
