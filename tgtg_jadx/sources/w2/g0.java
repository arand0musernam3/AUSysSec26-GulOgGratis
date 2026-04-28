package w2;

import com.app.tgtg.model.remote.AppSettings;
import com.app.tgtg.model.remote.RewardSurveyInfo;
import com.app.tgtg.model.remote.UserData;
import com.app.tgtg.model.remote.UserSettings;
import com.app.tgtg.model.remote.item.response.BasicItem;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42907a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f42907a) {
            case 0:
                return Unit.f26487a;
            case 1:
                j5.b0 b0Var = (j5.b0) obj;
                b0Var.getClass();
                j5.z.b(b0Var);
                return Unit.f26487a;
            case 2:
                return AppSettings.json$lambda$0((n90.h) obj);
            case 3:
                return RewardSurveyInfo.json$lambda$0((n90.h) obj);
            case 4:
                return UserData.json$lambda$0((n90.h) obj);
            case 5:
                return UserSettings.Companion.fromJson$lambda$0((n90.h) obj);
            case 6:
                return Boolean.valueOf(((h4.c) obj) == null);
            case 7:
                g9.j0 j0Var = (g9.j0) obj;
                j0Var.getClass();
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(xh.c0.class);
                orCreateKotlinClass.getClass();
                j0Var.f20160g = orCreateKotlinClass;
                j0Var.f20158e = false;
                j0Var.a(-1);
                j0Var.f20158e = true;
                j0Var.f20159f = false;
                return Unit.f26487a;
            case 8:
                g9.j0 j0Var2 = (g9.j0) obj;
                j0Var2.getClass();
                xh.f0 f0Var = xh.f0.INSTANCE;
                f0Var.getClass();
                j0Var2.f20161h = f0Var;
                j0Var2.f20158e = false;
                j0Var2.a(-1);
                j0Var2.f20158e = false;
                j0Var2.f20159f = false;
                return Unit.f26487a;
            case 9:
                g9.j0 j0Var3 = (g9.j0) obj;
                j0Var3.getClass();
                xh.v vVar = xh.v.INSTANCE;
                vVar.getClass();
                j0Var3.f20161h = vVar;
                j0Var3.f20158e = false;
                j0Var3.a(-1);
                j0Var3.f20158e = true;
                j0Var3.f20159f = false;
                return Unit.f26487a;
            case 10:
                return new y3.c((Map) obj);
            case 11:
                return obj;
            case 12:
                ((y9.b) obj).getClass();
                throw new u70.n(null, 1, null);
            case 13:
                ha.c cVar = (ha.c) obj;
                cVar.getClass();
                return Boolean.valueOf(cVar.q0());
            case 14:
                ha.c cVar2 = (ha.c) obj;
                cVar2.getClass();
                v70.p pVar = new v70.p();
                while (cVar2.q0()) {
                    pVar.add(Integer.valueOf((int) cVar2.getLong(0)));
                }
                return kotlin.collections.g1.a(pVar);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ((s1.s) obj).getClass();
                return s1.r0.d(null, 3);
            case 16:
                ((s1.s) obj).getClass();
                return s1.r0.e(null, 3);
            case 17:
                ((s1.s) obj).getClass();
                return s1.r0.d(null, 3);
            case 18:
                ((s1.s) obj).getClass();
                return s1.r0.e(null, 3);
            case 19:
                pg.q qVar = (pg.q) obj;
                qVar.getClass();
                qVar.f35078b.getFragment();
                return Unit.f26487a;
            case 20:
                j5.b0 b0Var2 = (j5.b0) obj;
                b0Var2.getClass();
                j5.z.b(b0Var2);
                return Unit.f26487a;
            case 21:
                j5.b0 b0Var3 = (j5.b0) obj;
                b0Var3.getClass();
                j5.z.h("", b0Var3);
                return Unit.f26487a;
            case 22:
                j5.b0 b0Var4 = (j5.b0) obj;
                b0Var4.getClass();
                j5.z.b(b0Var4);
                return Unit.f26487a;
            case 23:
                j5.b0 b0Var5 = (j5.b0) obj;
                b0Var5.getClass();
                j5.z.b(b0Var5);
                return Unit.f26487a;
            case 24:
                j5.b0 b0Var6 = (j5.b0) obj;
                b0Var6.getClass();
                j5.z.h("", b0Var6);
                return Unit.f26487a;
            case 25:
                ((j5.b0) obj).getClass();
                return Unit.f26487a;
            case 26:
                ((j5.b0) obj).getClass();
                return Unit.f26487a;
            case 27:
                BasicItem basicItem = (BasicItem) obj;
                basicItem.getClass();
                return basicItem.getInformation().mo340getItemIdFvU5WIY();
            case 28:
                j5.b0 b0Var7 = (j5.b0) obj;
                b0Var7.getClass();
                j5.z.b(b0Var7);
                return Unit.f26487a;
            default:
                BasicItem basicItem2 = (BasicItem) obj;
                basicItem2.getClass();
                return basicItem2.getInformation().mo340getItemIdFvU5WIY();
        }
    }

    public /* synthetic */ g0(int i11) {
        this.f42907a = i11;
    }
}
