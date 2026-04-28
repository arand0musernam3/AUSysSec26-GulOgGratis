package bm;

import co.q;
import com.app.tgtg.feature.orderview.charity.CharityOrderActivity;
import g3.q1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m3.b1;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f6363b;

    public /* synthetic */ j(b1 b1Var, int i11) {
        this.f6362a = i11;
        this.f6363b = b1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f6362a;
        boolean zAreEqual = true;
        b1 b1Var = this.f6363b;
        switch (i11) {
            case 0:
                b1Var.setValue(Boolean.FALSE);
                break;
            case 1:
                b1Var.setValue(Boolean.TRUE);
                break;
            case 2:
                b1Var.setValue(q.MINIMISED);
                break;
            case 3:
                b1Var.setValue(Boolean.TRUE);
                break;
            case 4:
                b1Var.setValue(Boolean.FALSE);
                break;
            case 5:
                b1Var.setValue(Boolean.TRUE);
                break;
            case 6:
                b1Var.setValue(Boolean.FALSE);
                break;
            case 7:
                b1Var.setValue(dm.b.f14969a);
                break;
            case 8:
                b1Var.setValue(dm.c.f14970a);
                break;
            case 9:
                b1Var.setValue(dm.a.f14968a);
                break;
            case 10:
                b1Var.setValue(Boolean.TRUE);
                break;
            case 11:
                b1Var.setValue(null);
                break;
            case 12:
                b1Var.setValue(Boolean.FALSE);
                break;
            case 13:
                b1Var.setValue(Boolean.valueOf(!((Boolean) b1Var.getValue()).booleanValue()));
                break;
            case 14:
                b1Var.setValue(Boolean.FALSE);
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                b1Var.setValue(Boolean.FALSE);
                break;
            case 16:
                break;
            case 17:
                b1Var.setValue(null);
                break;
            case 18:
                break;
            case 19:
                Unit unit = Unit.f26487a;
                b1Var.setValue(unit);
                break;
            case 20:
                ((q1) b1Var.getValue()).getClass();
                if (!Intrinsics.areEqual("PrimaryNotEditable", "PrimaryNotEditable") && !Intrinsics.areEqual("PrimaryNotEditable", "PrimaryEditable")) {
                    zAreEqual = Intrinsics.areEqual("PrimaryNotEditable", "SecondaryEditable") ? Intrinsics.areEqual("PrimaryNotEditable", "SecondaryEditable") : false;
                }
                if (zAreEqual) {
                    b1Var.setValue(new q1());
                }
                break;
            case 21:
                break;
            case 22:
                b1Var.setValue(Boolean.valueOf(!((Boolean) b1Var.getValue()).booleanValue()));
                break;
            case 23:
                int i12 = CharityOrderActivity.f9162o;
                b1Var.setValue(Boolean.TRUE);
                break;
            case 24:
                int i13 = CharityOrderActivity.f9162o;
                b1Var.setValue(Boolean.FALSE);
                break;
            case 25:
                int i14 = CharityOrderActivity.f9162o;
                b1Var.setValue(Boolean.FALSE);
                break;
            case 26:
                int i15 = CharityOrderActivity.f9162o;
                b1Var.setValue(Boolean.FALSE);
                break;
            case 27:
                int i16 = CharityOrderActivity.f9162o;
                b1Var.setValue(Boolean.FALSE);
                break;
            case 28:
                int i17 = CharityOrderActivity.f9162o;
                b1Var.setValue(Boolean.FALSE);
                break;
            default:
                int i18 = CharityOrderActivity.f9162o;
                b1Var.setValue(Boolean.FALSE);
                break;
        }
        return Unit.f26487a;
    }
}
