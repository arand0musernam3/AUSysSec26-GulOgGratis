package ap;

import a3.b2;
import androidx.lifecycle.m1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;
import v80.f0;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f4537b;

    public /* synthetic */ h(n nVar, int i11) {
        this.f4536a = i11;
        this.f4537b = nVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4536a) {
            case 0:
                n nVar = this.f4537b;
                f0.B(m1.d(nVar), null, null, new b2(nVar, null, 4), 3);
                break;
            case 1:
                this.f4537b.f();
                break;
            case 2:
                this.f4537b.f();
                break;
            case 3:
                this.f4537b.f();
                break;
            case 4:
                this.f4537b.e();
                break;
            case 5:
                this.f4537b.L.j(cp.c.NONE);
                break;
            case 6:
                this.f4537b.J.j(null);
                break;
            case 7:
                this.f4537b.e();
                break;
            case 8:
                n nVar2 = this.f4537b;
                a2 a2Var = nVar2.f4580w;
                Boolean bool = Boolean.TRUE;
                a2Var.getClass();
                a2Var.k(null, bool);
                nVar2.e();
                break;
            case 9:
                n nVar3 = this.f4537b;
                a2 a2Var2 = nVar3.f4582y;
                Boolean bool2 = Boolean.TRUE;
                a2Var2.getClass();
                a2Var2.k(null, bool2);
                nVar3.e();
                break;
            case 10:
                this.f4537b.l(true);
                break;
            case 11:
                n nVar4 = this.f4537b;
                a2 a2Var3 = nVar4.C;
                Boolean bool3 = Boolean.TRUE;
                a2Var3.getClass();
                a2Var3.k(null, bool3);
                nVar4.e();
                break;
            case 12:
                n nVar5 = this.f4537b;
                a2 a2Var4 = nVar5.f4580w;
                Boolean bool4 = Boolean.FALSE;
                a2Var4.getClass();
                a2Var4.k(null, bool4);
                nVar5.e();
                break;
            case 13:
                n nVar6 = this.f4537b;
                a2 a2Var5 = nVar6.f4582y;
                Boolean bool5 = Boolean.FALSE;
                a2Var5.getClass();
                a2Var5.k(null, bool5);
                nVar6.e();
                break;
            case 14:
                this.f4537b.l(false);
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                n nVar7 = this.f4537b;
                a2 a2Var6 = nVar7.C;
                Boolean bool6 = Boolean.FALSE;
                a2Var6.getClass();
                a2Var6.k(null, bool6);
                nVar7.e();
                break;
            case 16:
                this.f4537b.f();
                break;
            case 17:
                this.f4537b.f();
                break;
            default:
                this.f4537b.e();
                break;
        }
        return Unit.f26487a;
    }
}
