package d2;

import g3.b6;
import g3.c6;
import g3.g6;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13881a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z4.w0 f13882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f13886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f13887g;

    public /* synthetic */ q(ArrayList arrayList, z4.w0 w0Var, b6 b6Var, int i11, ArrayList arrayList2, int i12) {
        this.f13885e = arrayList;
        this.f13882b = w0Var;
        this.f13886f = b6Var;
        this.f13883c = i11;
        this.f13887g = arrayList2;
        this.f13884d = i12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f13881a) {
            case 0:
                p.b((z4.l1) obj, (z4.m1) this.f13885e, (z4.t0) this.f13886f, this.f13882b.getLayoutDirection(), this.f13883c, this.f13884d, ((s) this.f13887g).f13913a);
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f13885e;
                b6 b6Var = (b6) this.f13886f;
                ArrayList arrayList2 = (ArrayList) this.f13887g;
                z4.l1 l1Var = (z4.l1) obj;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    int i12 = this.f13884d;
                    if (i11 >= size) {
                        float f11 = c6.f18417b;
                        z4.w0 w0Var = this.f13882b;
                        int iQ0 = w0Var.q0(g6.f18680a) + w0Var.q0(f11);
                        t1.b bVar = b6Var.f18370c;
                        int iIntValue = iQ0 + (bVar != null ? ((Number) bVar.d()).intValue() : this.f13883c);
                        int size2 = arrayList2.size();
                        for (int i13 = 0; i13 < size2; i13++) {
                            z4.m1 m1Var = (z4.m1) arrayList2.get(i13);
                            l1Var.j(m1Var, iIntValue, (i12 - m1Var.f47184b) / 2, 0.0f);
                        }
                    } else {
                        z4.m1 m1Var2 = (z4.m1) arrayList.get(i11);
                        l1Var.j(m1Var2, 0, (i12 - m1Var2.f47184b) / 2, 0.0f);
                        i11++;
                    }
                    break;
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ q(z4.m1 m1Var, z4.t0 t0Var, z4.w0 w0Var, int i11, int i12, s sVar) {
        this.f13885e = m1Var;
        this.f13886f = t0Var;
        this.f13882b = w0Var;
        this.f13883c = i11;
        this.f13884d = i12;
        this.f13887g = sVar;
    }
}
