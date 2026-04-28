package bm;

import android.util.Log;
import cj.q;
import f0.v1;
import ft.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import no.m0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f6377j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f6378k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i11, x70.c cVar, int i12) {
        super(i11, cVar);
        this.f6377j = i12;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f6377j) {
            case 0:
                o oVar = new o(2, cVar, 0);
                oVar.f6378k = obj;
                return oVar;
            case 1:
                o oVar2 = new o(2, cVar, 1);
                oVar2.f6378k = obj;
                return oVar2;
            case 2:
                o oVar3 = new o(2, cVar, 2);
                oVar3.f6378k = obj;
                return oVar3;
            case 3:
                o oVar4 = new o(2, cVar, 3);
                oVar4.f6378k = obj;
                return oVar4;
            case 4:
                o oVar5 = new o(2, cVar, 4);
                oVar5.f6378k = obj;
                return oVar5;
            case 5:
                o oVar6 = new o(2, cVar, 5);
                oVar6.f6378k = obj;
                return oVar6;
            case 6:
                o oVar7 = new o(2, cVar, 6);
                oVar7.f6378k = obj;
                return oVar7;
            case 7:
                o oVar8 = new o(2, cVar, 7);
                oVar8.f6378k = obj;
                return oVar8;
            case 8:
                o oVar9 = new o(2, cVar, 8);
                oVar9.f6378k = obj;
                return oVar9;
            case 9:
                o oVar10 = new o(2, cVar, 9);
                oVar10.f6378k = obj;
                return oVar10;
            case 10:
                o oVar11 = new o(2, cVar, 10);
                oVar11.f6378k = obj;
                return oVar11;
            case 11:
                o oVar12 = new o(2, cVar, 11);
                oVar12.f6378k = obj;
                return oVar12;
            case 12:
                o oVar13 = new o(2, cVar, 12);
                oVar13.f6378k = obj;
                return oVar13;
            case 13:
                o oVar14 = new o(2, cVar, 13);
                oVar14.f6378k = obj;
                return oVar14;
            case 14:
                o oVar15 = new o(2, cVar, 14);
                oVar15.f6378k = obj;
                return oVar15;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                o oVar16 = new o(2, cVar, 15);
                oVar16.f6378k = obj;
                return oVar16;
            case 16:
                o oVar17 = new o(2, cVar, 16);
                oVar17.f6378k = obj;
                return oVar17;
            case 17:
                o oVar18 = new o(2, cVar, 17);
                oVar18.f6378k = obj;
                return oVar18;
            case 18:
                o oVar19 = new o(2, cVar, 18);
                oVar19.f6378k = obj;
                return oVar19;
            case 19:
                o oVar20 = new o(2, cVar, 19);
                oVar20.f6378k = obj;
                return oVar20;
            case 20:
                o oVar21 = new o(2, cVar, 20);
                oVar21.f6378k = obj;
                return oVar21;
            case 21:
                o oVar22 = new o(2, cVar, 21);
                oVar22.f6378k = obj;
                return oVar22;
            case 22:
                o oVar23 = new o(2, cVar, 22);
                oVar23.f6378k = obj;
                return oVar23;
            case 23:
                o oVar24 = new o(2, cVar, 23);
                oVar24.f6378k = obj;
                return oVar24;
            case 24:
                o oVar25 = new o(2, cVar, 24);
                oVar25.f6378k = obj;
                return oVar25;
            case 25:
                o oVar26 = new o(2, cVar, 25);
                oVar26.f6378k = obj;
                return oVar26;
            case 26:
                o oVar27 = new o(2, cVar, 26);
                oVar27.f6378k = obj;
                return oVar27;
            case 27:
                o oVar28 = new o(2, cVar, 27);
                oVar28.f6378k = obj;
                return oVar28;
            default:
                o oVar29 = new o(2, cVar, 28);
                oVar29.f6378k = obj;
                return oVar29;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6377j) {
        }
        return ((o) create((h8.a) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f6377j) {
            case 0:
                h8.a aVar = (h8.a) this.f6378k;
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                aVar.f(im.c.IS_CHARITY_LOGIN.a(), Boolean.TRUE);
                break;
            case 1:
                h8.a aVar3 = (h8.a) this.f6378k;
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                aVar3.f(q.f8330j0, Boolean.TRUE);
                break;
            case 2:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                break;
            case 3:
                h8.a aVar6 = (h8.a) this.f6378k;
                y70.a aVar7 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                aVar6.f(im.c.IS_CHARITY_LOGIN.a(), Boolean.FALSE);
                break;
            case 4:
                y70.a aVar8 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                v1 v1Var = (v1) this.f6378k;
                break;
            case 5:
                y70.a aVar9 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                break;
            case 6:
                y70.a aVar10 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                break;
            case 7:
                y70.a aVar11 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                break;
            case 8:
                y70.a aVar12 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.f6378k));
                break;
            case 9:
                h8.a aVar13 = (h8.a) this.f6378k;
                y70.a aVar14 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                h8.e eVarK = wd.a.k(im.b.HAS_RECIPE_GENERATOR_BEEN_OPENED.a());
                Boolean bool = Boolean.TRUE;
                aVar13.getClass();
                aVar13.g(eVarK, bool);
                break;
            case 10:
                h8.a aVar15 = (h8.a) this.f6378k;
                y70.a aVar16 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                aVar15.d();
                aVar15.f21658a.clear();
                break;
            case 11:
                h8.a aVar17 = (h8.a) this.f6378k;
                y70.a aVar18 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                aVar17.d();
                aVar17.f21658a.clear();
                break;
            case 12:
                h8.a aVar19 = (h8.a) this.f6378k;
                y70.a aVar20 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                aVar19.f(s.f17965c, Boolean.TRUE);
                aVar19.f(s.f17966d, "26.2.0");
                break;
            case 13:
                h8.a aVar21 = (h8.a) this.f6378k;
                y70.a aVar22 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                aVar21.f(im.c.IS_CHARITY_LOGIN.a(), Boolean.FALSE);
                break;
            case 14:
                h8.a aVar23 = (h8.a) this.f6378k;
                y70.a aVar24 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                h8.e eVarK2 = wd.a.k(im.b.HAS_USER_PURCHASED_3_ORDERS.a());
                Boolean bool2 = Boolean.TRUE;
                aVar23.getClass();
                aVar23.g(eVarK2, bool2);
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                h8.a aVar25 = (h8.a) this.f6378k;
                y70.a aVar26 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                h8.e eVarK3 = wd.a.k(im.b.HAS_BLOB_TOOLTIP_BEEN_DISMISSED.a());
                Boolean bool3 = Boolean.TRUE;
                aVar25.getClass();
                aVar25.g(eVarK3, bool3);
                break;
            case 16:
                h8.a aVar27 = (h8.a) this.f6378k;
                y70.a aVar28 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                h8.e eVarK4 = wd.a.k(im.b.HAS_CHARITY_HOME_FIRST_VISIT_COMPLETED.a());
                Boolean bool4 = Boolean.TRUE;
                aVar27.getClass();
                aVar27.g(eVarK4, bool4);
                break;
            case 17:
                h8.a aVar29 = (h8.a) this.f6378k;
                y70.a aVar30 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                h8.e eVarK5 = wd.a.k(im.b.HAS_CHARITY_ENABLE_NOTIFICATIONS_BEEN_DISMISSED.a());
                Boolean bool5 = Boolean.TRUE;
                aVar29.getClass();
                aVar29.g(eVarK5, bool5);
                break;
            case 18:
                h8.a aVar31 = (h8.a) this.f6378k;
                y70.a aVar32 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                h8.e eVarK6 = wd.a.k(im.b.HAS_CHARITY_REVIEW_COLLECTION_DAYS_BEEN_DISMISSED.a());
                Boolean bool6 = Boolean.TRUE;
                aVar31.getClass();
                aVar31.g(eVarK6, bool6);
                break;
            case 19:
                h8.a aVar33 = (h8.a) this.f6378k;
                y70.a aVar34 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                h8.e eVarK7 = wd.a.k(im.b.HAS_BRING_BACK_MAGIC_BEEN_SEEN.a());
                Boolean bool7 = Boolean.TRUE;
                aVar33.getClass();
                aVar33.g(eVarK7, bool7);
                break;
            case 20:
                h8.a aVar35 = (h8.a) this.f6378k;
                y70.a aVar36 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                h8.e eVarK8 = wd.a.k(im.b.HAS_REWARDS_POPUP_BEEN_SEEN.a());
                Boolean bool8 = Boolean.TRUE;
                aVar35.getClass();
                aVar35.g(eVarK8, bool8);
                break;
            case 21:
                y70.a aVar37 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                break;
            case 22:
                h8.a aVar38 = (h8.a) this.f6378k;
                y70.a aVar39 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                h8.e eVarK9 = wd.a.k(im.b.HAS_RECIPE_GENERATOR_BEEN_OPENED.a());
                Boolean bool9 = Boolean.TRUE;
                aVar38.getClass();
                aVar38.g(eVarK9, bool9);
                break;
            case 23:
                h8.a aVar40 = (h8.a) this.f6378k;
                y70.a aVar41 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                h8.e eVarK10 = wd.a.k(im.b.HAS_PROFILE_STORE_SIGNUP_CARD_BEEN_SEEN.a());
                Boolean bool10 = Boolean.TRUE;
                aVar40.getClass();
                aVar40.g(eVarK10, bool10);
                break;
            case 24:
                h8.a aVar42 = (h8.a) this.f6378k;
                y70.a aVar43 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                aVar42.f(m0.f31246v0, Boolean.TRUE);
                break;
            case 25:
                h8.a aVar44 = (h8.a) this.f6378k;
                y70.a aVar45 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                aVar44.f(m0.f31245u0, Boolean.TRUE);
                break;
            case 26:
                h8.a aVar46 = (h8.a) this.f6378k;
                y70.a aVar47 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                h8.e eVarK11 = wd.a.k(im.b.HAS_CHARITY_PLAN_TOOLTIP_BEEN_SEEN.a());
                Boolean bool11 = Boolean.TRUE;
                aVar46.getClass();
                aVar46.g(eVarK11, bool11);
                break;
            case 27:
                h8.a aVar48 = (h8.a) this.f6378k;
                y70.a aVar49 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                h8.e eVarK12 = wd.a.k(im.b.HAS_FAVORITE_TOOLTIP_ON_ITEM_PAGE_BEEN_DISMISSED.a());
                Boolean bool12 = Boolean.TRUE;
                aVar48.getClass();
                aVar48.g(eVarK12, bool12);
                break;
            default:
                h8.a aVar50 = (h8.a) this.f6378k;
                y70.a aVar51 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                h8.e eVarG = wd.a.G(im.b.CHARITY_HOME_WEEKLY_TOOLTIP_LAST_SEEN.a());
                aVar50.getClass();
                aVar50.g(eVarG, "MODIFY");
                break;
        }
        return Unit.f26487a;
    }
}
