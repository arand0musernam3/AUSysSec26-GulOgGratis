package a3;

import com.app.tgtg.feature.tabprofile.manageaccount.specialrewards.SpecialRewardsActivity;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.RewardId;
import com.app.tgtg.model.remote.Server;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f346b;

    public /* synthetic */ f2() {
        this.f345a = 11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z11 = true;
        switch (this.f345a) {
            case 0:
                if (m2.g0.f28858b.b(((u4.b) obj).f40734a) == m2.y0.COPY) {
                    ((j2) this.f346b).b();
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            case 1:
                e0.k0 k0Var = (e0.k0) obj;
                k0Var.getClass();
                b0.r0 r0Var = (b0.r0) this.f346b;
                f0.o metadata = k0Var.getMetadata();
                b0.l0 l0Var = new b0.l0(metadata, r0Var);
                b0.x xVar = r0Var.f5392n;
                metadata.f16792a.getFrameNumber();
                return Boolean.valueOf(s0.v0.a(new w.y(xVar, l0Var), true));
            case 2:
                BaseItemMnuV2 baseItemMnuV2 = (BaseItemMnuV2) obj;
                baseItemMnuV2.getClass();
                ym.y yVar = (ym.y) this.f346b;
                if (yVar != null) {
                    ((ym.u) yVar).x(baseItemMnuV2);
                }
                return Unit.f26487a;
            case 3:
                ((z5.c) obj).getClass();
                return new z5.j((((long) ((Number) ((m3.c3) this.f346b).getValue()).intValue()) << 32) | (((long) 0) & 4294967295L));
            case 4:
                String str = (String) obj;
                str.getClass();
                if (str.length() == 0 || (str.length() < 10 && Pattern.matches("^\\d+([.,])?\\d{0,2}$", str))) {
                    y80.a2 a2Var = ((ap.n) this.f346b).E;
                    a2Var.getClass();
                    a2Var.k(null, str);
                }
                return Unit.f26487a;
            case 5:
                float[] fArr = ((i4.l0) obj).f23269a;
                z4.z zVar = (z4.z) this.f346b;
                if (zVar.n()) {
                    z4.c0.i(zVar).J(zVar, fArr);
                }
                return Unit.f26487a;
            case 6:
                ((m3.g) this.f346b).cancel();
                return Unit.f26487a;
            case 7:
                Server server = (Server) obj;
                server.getClass();
                y80.a2 a2Var2 = ((ng.d) this.f346b).s().f30842c;
                a2Var2.getClass();
                a2Var2.k(null, server);
                return Unit.f26487a;
            case 8:
                RewardId rewardId = (RewardId) obj;
                String strM265unboximpl = rewardId != null ? rewardId.m265unboximpl() : null;
                ((mn.l) this.f346b).f30027i.f25317a.a(new f70.b(SpecialRewardsActivity.class, jb.u.x(new Pair("REMOTE_SELECTED_REWARD", strM265unboximpl != null ? RewardId.m257boximpl(strM265unboximpl) : null)), false, false, false, null, null, null, null, false, 1020));
                return Unit.f26487a;
            case 9:
                ((u90.n) this.f346b).cancel();
                return Unit.f26487a;
            case 10:
                BaseItemMnuV2 baseItemMnuV22 = (BaseItemMnuV2) obj;
                baseItemMnuV22.getClass();
                ((um.u) this.f346b).j(baseItemMnuV22.m393getItemIdFvU5WIY(), f70.i.WOB_RECOMMENDATION);
                return Unit.f26487a;
            case 11:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                w4.b0 b0Var = (w4.b0) this.f346b;
                if (b0Var != null) {
                    b0Var.f43104c = zBooleanValue;
                }
                return Unit.f26487a;
            case 12:
                v80.l lVar = (v80.l) this.f346b;
                u70.o oVar = u70.q.f40850b;
                Unit unit = Unit.f26487a;
                lVar.resumeWith(unit);
                return unit;
            default:
                String strM205unboximpl = ((ItemId) obj).m205unboximpl();
                strM205unboximpl.getClass();
                g9.p.e((g9.f0) this.f346b, new xh.k(strM205unboximpl));
                return Unit.f26487a;
        }
    }

    public /* synthetic */ f2(Object obj, int i11) {
        this.f345a = i11;
        this.f346b = obj;
    }
}
