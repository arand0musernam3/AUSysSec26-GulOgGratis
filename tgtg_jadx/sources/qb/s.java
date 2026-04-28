package qb;

import com.app.tgtg.R;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.manufacturer.request.BasketBriefItem;
import ib.g0;
import j5.b0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import mv.r0;
import org.bouncycastle.iana.AEADAlgorithm;
import pg.j1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f36859b;

    public /* synthetic */ s(String str, int i11) {
        this.f36858a = i11;
        this.f36859b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        ha.c cVarV0;
        int i11 = this.f36858a;
        String str = this.f36859b;
        switch (i11) {
            case 0:
                ha.a aVar = (ha.a) obj;
                aVar.getClass();
                cVarV0 = aVar.v0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    cVarV0.C(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (cVarV0.q0()) {
                        arrayList.add(cVarV0.W(0));
                        break;
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                ha.a aVar2 = (ha.a) obj;
                aVar2.getClass();
                cVarV0 = aVar2.v0("UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?");
                try {
                    cVarV0.C(1, str);
                    cVarV0.q0();
                    int iE = ox.h.E(aVar2);
                    cVarV0.close();
                    return Integer.valueOf(iE);
                } finally {
                }
            case 2:
                ha.a aVar3 = (ha.a) obj;
                aVar3.getClass();
                cVarV0 = aVar3.v0("UPDATE workspec SET run_attempt_count=0 WHERE id=?");
                try {
                    cVarV0.C(1, str);
                    cVarV0.q0();
                    int iE2 = ox.h.E(aVar3);
                    cVarV0.close();
                    return Integer.valueOf(iE2);
                } finally {
                }
            case 3:
                ha.a aVar4 = (ha.a) obj;
                aVar4.getClass();
                cVarV0 = aVar4.v0("UPDATE workspec SET period_count=period_count+1 WHERE id=?");
                try {
                    cVarV0.C(1, str);
                    cVarV0.q0();
                    cVarV0.close();
                    return Unit.f26487a;
                } finally {
                }
            case 4:
                ha.a aVar5 = (ha.a) obj;
                aVar5.getClass();
                cVarV0 = aVar5.v0("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                try {
                    cVarV0.C(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarV0.q0()) {
                        byte[] blob = cVarV0.getBlob(0);
                        ib.h hVar = ib.h.f23726b;
                        arrayList2.add(ex.i.t(blob));
                        break;
                    }
                    return arrayList2;
                } finally {
                }
            case 5:
                ha.a aVar6 = (ha.a) obj;
                aVar6.getClass();
                cVarV0 = aVar6.v0("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?");
                try {
                    cVarV0.C(1, str);
                    cVarV0.q0();
                    int iE3 = ox.h.E(aVar6);
                    cVarV0.close();
                    return Integer.valueOf(iE3);
                } finally {
                }
            case 6:
                ha.a aVar7 = (ha.a) obj;
                aVar7.getClass();
                cVarV0 = aVar7.v0("DELETE FROM workspec WHERE id=?");
                try {
                    cVarV0.C(1, str);
                    cVarV0.q0();
                    cVarV0.close();
                    return Unit.f26487a;
                } finally {
                }
            case 7:
                ha.a aVar8 = (ha.a) obj;
                aVar8.getClass();
                cVarV0 = aVar8.v0("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    cVarV0.C(1, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (cVarV0.q0()) {
                        String strW = cVarV0.W(0);
                        g0 g0VarD = xz.b.D((int) cVarV0.getLong(1));
                        strW.getClass();
                        g0VarD.getClass();
                        m mVar = new m();
                        mVar.f36809a = strW;
                        mVar.f36810b = g0VarD;
                        arrayList3.add(mVar);
                        break;
                    }
                    return arrayList3;
                } finally {
                }
            case 8:
                ha.a aVar9 = (ha.a) obj;
                aVar9.getClass();
                cVarV0 = aVar9.v0("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
                try {
                    cVarV0.C(1, str);
                    ArrayList arrayList4 = new ArrayList();
                    while (cVarV0.q0()) {
                        arrayList4.add(cVarV0.W(0));
                        break;
                    }
                    return arrayList4;
                } finally {
                }
            case 9:
                ha.a aVar10 = (ha.a) obj;
                aVar10.getClass();
                cVarV0 = aVar10.v0("DELETE FROM worktag WHERE work_spec_id=?");
                try {
                    cVarV0.C(1, str);
                    cVarV0.q0();
                    cVarV0.close();
                    return Unit.f26487a;
                } finally {
                }
            case 10:
                b0 b0Var = (b0) obj;
                b0Var.getClass();
                j5.z.h(str, b0Var);
                return Unit.f26487a;
            case 11:
                b0 b0Var2 = (b0) obj;
                b0Var2.getClass();
                j5.z.o(str, b0Var2);
                return Unit.f26487a;
            case 12:
                b0 b0Var3 = (b0) obj;
                b0Var3.getClass();
                if (str != null) {
                    j5.z.h(str, b0Var3);
                }
                return Unit.f26487a;
            case 13:
                b0 b0Var4 = (b0) obj;
                b0Var4.getClass();
                j5.z.h(str, b0Var4);
                return Unit.f26487a;
            case 14:
                b0 b0Var5 = (b0) obj;
                b0Var5.getClass();
                j5.z.h(str, b0Var5);
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                b0 b0Var6 = (b0) obj;
                b0Var6.getClass();
                j5.z.h(str, b0Var6);
                return Unit.f26487a;
            case 16:
                b0 b0Var7 = (b0) obj;
                b0Var7.getClass();
                j5.z.h(str, b0Var7);
                return Unit.f26487a;
            case 17:
                b0 b0Var8 = (b0) obj;
                b0Var8.getClass();
                j5.z.h(str, b0Var8);
                return Unit.f26487a;
            case 18:
                b0 b0Var9 = (b0) obj;
                b0Var9.getClass();
                j5.z.h(str, b0Var9);
                return Unit.f26487a;
            case 19:
                b0 b0Var10 = (b0) obj;
                b0Var10.getClass();
                j5.z.h(str, b0Var10);
                return Unit.f26487a;
            case 20:
                b0 b0Var11 = (b0) obj;
                b0Var11.getClass();
                j5.z.h(str, b0Var11);
                return Unit.f26487a;
            case 21:
                b0 b0Var12 = (b0) obj;
                b0Var12.getClass();
                j5.z.h(str, b0Var12);
                return Unit.f26487a;
            case 22:
                j1 j1Var = (j1) obj;
                j1Var.getClass();
                r0.y(str, j1Var.f34924d, R.drawable.default_logo);
                return Unit.f26487a;
            case 23:
                b0 b0Var13 = (b0) obj;
                b0Var13.getClass();
                j5.z.h(str, b0Var13);
                return Unit.f26487a;
            case 24:
                b0 b0Var14 = (b0) obj;
                b0Var14.getClass();
                j5.z.h(str, b0Var14);
                return Unit.f26487a;
            case 25:
                b0 b0Var15 = (b0) obj;
                b0Var15.getClass();
                j5.z.h(str, b0Var15);
                return Unit.f26487a;
            case 26:
                b0 b0Var16 = (b0) obj;
                j5.z.k(b0Var16, 1);
                j5.z.l(str, b0Var16);
                return Unit.f26487a;
            case 27:
                b0 b0Var17 = (b0) obj;
                j5.z.h(str, b0Var17);
                j5.z.m(b0Var17, 5);
                return Unit.f26487a;
            case 28:
                return Boolean.valueOf(BasketManager.addOrRemoveItem$lambda$1(str, (BasketBriefItem) obj));
            default:
                return Boolean.valueOf(BasketManager.setQuantity$lambda$1(str, (BasketBriefItem) obj));
        }
    }
}
