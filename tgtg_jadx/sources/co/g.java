package co;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import m3.b1;
import v80.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f8740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f8741c;

    public /* synthetic */ g(b1 b1Var, b1 b1Var2, int i11) {
        this.f8739a = i11;
        this.f8740b = b1Var;
        this.f8741c = b1Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f8739a) {
            case 0:
                p30.b.c(this.f8740b, true);
                i1 i1Var = (i1) this.f8741c.getValue();
                if (i1Var != null) {
                    i1Var.a(null);
                }
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                this.f8740b.setValue(Boolean.FALSE);
                this.f8741c.setValue(str);
                break;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                if (str2.length() <= 3) {
                    this.f8740b.setValue(Boolean.FALSE);
                    this.f8741c.setValue(str2);
                }
                break;
            case 3:
                String str3 = (String) obj;
                str3.getClass();
                if (str3.length() <= 10) {
                    this.f8740b.setValue(Boolean.FALSE);
                    this.f8741c.setValue(str3);
                }
                break;
            case 4:
                z4.z zVarK = (z4.z) obj;
                zVarK.getClass();
                this.f8740b.setValue(nv.c.c(zVarK));
                h4.c cVarC = nv.c.c(zVarK);
                while (true) {
                    if ((zVarK != null ? zVarK.K() : null) == null) {
                        this.f8741c.setValue(cVarC);
                        break;
                    } else {
                        zVarK = zVarK.K();
                        if (zVarK != null) {
                            cVarC = cVarC.g(nv.c.c(zVarK));
                        }
                    }
                }
                break;
            default:
                String str4 = (String) obj;
                str4.getClass();
                this.f8740b.setValue(null);
                this.f8741c.setValue(str4);
                break;
        }
        return Unit.f26487a;
    }
}
