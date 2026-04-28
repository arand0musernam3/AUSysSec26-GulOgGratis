package li;

import com.app.tgtg.feature.tabprofile.manageaccount.vouchers.VoucherActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.vouchers.VoucherExperienceActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import m3.b1;
import m5.q0;
import org.bouncycastle.iana.AEADAlgorithm;
import qb.r;
import s1.e0;
import s1.i;
import s1.r0;
import s1.s;
import s1.x0;
import s1.y0;
import ss.d1;
import ss.e1;
import ss.g1;
import ss.k1;
import ss.l1;
import ss.z0;
import z2.o;
import z4.z;
import z5.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f27853b;

    public /* synthetic */ c(k.h hVar, b1 b1Var, int i11) {
        this.f27852a = i11;
        this.f27853b = b1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z11;
        boolean z12;
        int i11 = this.f27852a;
        boolean z13 = true;
        b1 b1Var = this.f27853b;
        switch (i11) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    b1Var.setValue(Boolean.TRUE);
                }
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                b1Var.setValue(bool);
                break;
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                b1Var.setValue(bool2);
                break;
            case 3:
                String str = (String) obj;
                str.getClass();
                if (str.length() <= 3) {
                    b1Var.setValue(str);
                }
                break;
            case 4:
                String str2 = (String) obj;
                str2.getClass();
                if (str2.length() <= 10) {
                    b1Var.setValue(str2);
                }
                break;
            case 5:
                ((h.a) obj).getClass();
                b1Var.setValue(Boolean.TRUE);
                break;
            case 6:
                o oVar = (o) obj;
                b1Var.setValue(oVar.f46888c ? oVar.f46887b : oVar.f46886a);
                break;
            case 7:
                List list = (List) obj;
                if (b1Var != null) {
                    b1Var.setValue(list);
                }
                break;
            case 8:
                ((Function1) b1Var.getValue()).invoke((h4.b) obj);
                break;
            case 9:
                Boolean bool3 = (Boolean) obj;
                bool3.getClass();
                b1Var.setValue(bool3);
                break;
            case 10:
                Boolean bool4 = (Boolean) obj;
                bool4.getClass();
                b1Var.setValue(bool4);
                break;
            case 11:
                Boolean bool5 = (Boolean) obj;
                bool5.getClass();
                b1Var.setValue(bool5);
                break;
            case 12:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                b1Var.setValue(bool6);
                break;
            case 13:
                ((Float) obj).floatValue();
                b1Var.setValue(Boolean.TRUE);
                break;
            case 14:
                ((Float) obj).floatValue();
                b1Var.setValue(Boolean.TRUE);
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ((Float) obj).floatValue();
                b1Var.setValue(Boolean.TRUE);
                break;
            case 16:
                Boolean bool7 = (Boolean) obj;
                bool7.getClass();
                b1Var.setValue(bool7);
                break;
            case 17:
                Boolean bool8 = (Boolean) obj;
                bool8.getClass();
                b1Var.setValue(bool8);
                break;
            case 18:
                Boolean bool9 = (Boolean) obj;
                bool9.getClass();
                b1Var.setValue(bool9);
                break;
            case 19:
                z zVar = (z) obj;
                zVar.getClass();
                b1Var.setValue(new l(zVar.u()));
                break;
            case 20:
                z zVar2 = (z) obj;
                zVar2.getClass();
                if (b1Var != null) {
                    b1Var.setValue(zVar2);
                }
                break;
            case 21:
                z zVar3 = (z) obj;
                zVar3.getClass();
                if (b1Var != null) {
                    b1Var.setValue(zVar3);
                }
                break;
            case 22:
                s sVar = (s) obj;
                int i12 = VoucherActivity.f9440h;
                sVar.getClass();
                l1 l1Var = (l1) sVar.a();
                l1 l1Var2 = (l1) sVar.c();
                l1 l1Var3 = (l1) b1Var.getValue();
                boolean z14 = l1Var2 instanceof k1;
                if ((z14 && VoucherActivity.d0(l1Var)) || (!((z11 = l1Var instanceof g1)) || !z14 ? (!(l1Var instanceof k1) || !VoucherActivity.d0(l1Var2)) && ((!z11 || !VoucherActivity.d0(l1Var2)) && VoucherActivity.a0(l1Var2) <= VoucherActivity.a0(l1Var)) : l1Var3 != null && VoucherActivity.d0(l1Var3))) {
                    z13 = false;
                }
                x0 x0VarK = r0.k(z13 ? new r(13) : new r(14), t1.c.k(300, 0, null, 6));
                y0 y0VarE = r0.e(t1.c.k(300, 0, null, 6), 2);
                int i13 = i.f38614b;
                e0 e0Var = new e0(x0VarK, y0VarE);
                e0Var.f38574c.i(z13 ? 1.0f : 0.0f);
                break;
            case 23:
                s sVar2 = (s) obj;
                int i14 = VoucherExperienceActivity.f9443h;
                sVar2.getClass();
                e1 e1Var = (e1) sVar2.a();
                e1 e1Var2 = (e1) sVar2.c();
                e1 e1Var3 = (e1) b1Var.getValue();
                boolean z15 = e1Var2 instanceof d1;
                if (((z15 || (e1Var2 instanceof ss.b1)) && VoucherExperienceActivity.F(e1Var)) || (!((z12 = e1Var instanceof z0)) || (!z15 && !(e1Var2 instanceof ss.b1)) ? !((((e1Var instanceof d1) || (e1Var instanceof ss.b1)) && VoucherExperienceActivity.F(e1Var2)) || ((z12 && VoucherExperienceActivity.F(e1Var2)) || VoucherExperienceActivity.C(e1Var2) > VoucherExperienceActivity.C(e1Var))) : !(e1Var3 == null || !VoucherExperienceActivity.F(e1Var3)))) {
                    z13 = false;
                }
                x0 x0VarK2 = r0.k(z13 ? new r(16) : new r(17), t1.c.k(300, 0, null, 6));
                y0 y0VarE2 = r0.e(t1.c.k(300, 0, null, 6), 2);
                int i15 = i.f38614b;
                e0 e0Var2 = new e0(x0VarK2, y0VarE2);
                e0Var2.f38574c.i(z13 ? 1.0f : 0.0f);
                break;
            case 24:
                b1Var.setValue((z) obj);
                break;
            case 25:
                b1Var.setValue((z) obj);
                break;
            case 26:
                q0 q0Var = (q0) obj;
                q0Var.getClass();
                b1Var.setValue(q0Var);
                break;
            case 27:
                z zVar4 = (z) obj;
                zVar4.getClass();
                b1Var.setValue(zVar4);
                break;
            case 28:
                String str3 = (String) obj;
                str3.getClass();
                b1Var.setValue(StringsKt.e0(str3).toString());
                break;
            default:
                String str4 = (String) obj;
                str4.getClass();
                b1Var.setValue(StringsKt.e0(str4).toString());
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ c(b1 b1Var, int i11) {
        this.f27852a = i11;
        this.f27853b = b1Var;
    }
}
