package ag;

import android.app.Application;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.provider.Settings;
import androidx.core.app.NotificationManagerCompat;
import ao.f2;
import ao.g3;
import ao.m0;
import ao.r1;
import ao.r3;
import ao.v;
import ao.y0;
import ao.z1;
import com.app.tgtg.gateway.local.LocalDatabase;
import com.app.tgtg.model.local.AppConstants;
import com.appsflyer.attribution.RequestError;
import com.braze.h2;
import com.google.firebase.messaging.r;
import e0.h0;
import e0.q1;
import et.z;
import f0.c1;
import f0.d0;
import f0.d1;
import f0.g0;
import f0.g1;
import f0.j1;
import f0.k1;
import f0.l1;
import f0.n1;
import f0.q3;
import f0.v2;
import f0.v3;
import f0.x3;
import ft.o;
import ft.q;
import g3.j5;
import gt.a0;
import gt.w;
import j4.s;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.Pair;
import kotlin.collections.c0;
import kotlin.collections.n0;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kt.p;
import mv.r0;
import mv.u;
import mv.x;
import o00.x0;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.iana.AEADAlgorithm;
import rk.e0;
import v80.b0;
import v80.d2;
import v80.f0;
import v80.i1;
import v80.p0;
import y9.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements s70.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1306c;

    public /* synthetic */ h(Object obj, int i11, int i12) {
        this.f1304a = i12;
        this.f1306c = obj;
        this.f1305b = i11;
    }

    private final Object a() {
        SharedPreferences sharedPreferences;
        Boolean boolValueOf;
        mv.b bVar;
        h8.d dVar = h8.d.f21664a;
        i iVar = (i) this.f1306c;
        int i11 = 27;
        int i12 = 11;
        int i13 = 9;
        int i14 = 28;
        int i15 = 2;
        int i16 = 12;
        int i17 = 10;
        int i18 = 29;
        int i19 = 0;
        int i21 = 1;
        x70.c cVar = null;
        int i22 = this.f1305b;
        switch (i22) {
            case 0:
                return new g(this, 0);
            case 1:
                return new v((kt.b) iVar.f1337o.get(), (o) iVar.f1330k.get(), (jv.e) iVar.f1339p.get());
            case 2:
                n20.f fVar = iVar.f1307a;
                jt.i iVar2 = (jt.i) iVar.f1335n.get();
                iVar2.getClass();
                kt.b bVar2 = (kt.b) ((jt.h) iVar2).b(kt.b.class, jt.c.DEFAULT);
                x0.o(bVar2);
                return bVar2;
            case 3:
                n20.f fVar2 = iVar.f1307a;
                mv.b bVar3 = (mv.b) iVar.f1326i.get();
                jt.a aVar = (jt.a) iVar.f1333m.get();
                bVar3.getClass();
                aVar.getClass();
                return new jt.h(bVar3, aVar);
            case 4:
                return new mv.b(iVar.f1310b.f27469a, (ft.e) iVar.f1324h.get());
            case 5:
                r40.d dVar2 = iVar.f1313c;
                l8.m mVar = iVar.f1310b;
                SharedPreferences sharedPreferencesD = iVar.d();
                SharedPreferences sharedPreferences2 = mVar.f27469a.getSharedPreferences(AppConstants.PREFS_USER_DATA_NAME_PARAM, 0);
                sharedPreferences2.getClass();
                SharedPreferences sharedPreferences3 = mVar.f27469a.getSharedPreferences(AppConstants.PREFS_APP_DATA_NAME_PARAM, 0);
                sharedPreferences3.getClass();
                ft.e eVar = new ft.e();
                ft.e.f17920a = sharedPreferencesD;
                ft.e.f17921b = sharedPreferences2;
                ft.e.f17922c = sharedPreferences3;
                String strY = ft.c.y();
                if (strY != null) {
                    String strConcat = strY.concat("_badgeBannerHistory");
                    SharedPreferences sharedPreferences4 = ft.e.f17922c;
                    if (sharedPreferences4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
                        sharedPreferences = null;
                    } else {
                        sharedPreferences = sharedPreferences4;
                    }
                    SharedPreferences sharedPreferencesX = ft.c.x();
                    String string = sharedPreferences.getString(strConcat, null);
                    if (string != null) {
                        SharedPreferences.Editor editorEdit = sharedPreferencesX.edit();
                        editorEdit.putString(strConcat, string);
                        editorEdit.apply();
                        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                        editorEdit2.remove(strConcat);
                        editorEdit2.apply();
                    }
                    String strConcat2 = strY.concat("_alwaysOnProfileIntroCard");
                    SharedPreferences sharedPreferences5 = ft.e.f17922c;
                    if (sharedPreferences5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
                        sharedPreferences5 = null;
                    }
                    SharedPreferences sharedPreferencesX2 = ft.c.x();
                    String string2 = sharedPreferences5.getString(strConcat2, null);
                    if (string2 != null) {
                        SharedPreferences.Editor editorEdit3 = sharedPreferencesX2.edit();
                        editorEdit3.putString(strConcat2, string2);
                        editorEdit3.apply();
                        SharedPreferences.Editor editorEdit4 = sharedPreferences5.edit();
                        editorEdit4.remove(strConcat2);
                        editorEdit4.apply();
                    }
                    SharedPreferences sharedPreferencesX3 = ft.c.x();
                    String strY2 = ft.c.y();
                    if (strY2 == null) {
                        strY2 = null;
                    }
                    if (sharedPreferencesX3.contains(strY2 + "_userPrefersTranslatedItemDescription")) {
                        SharedPreferences sharedPreferencesX4 = ft.c.x();
                        String strY3 = ft.c.y();
                        if (strY3 == null) {
                            strY3 = null;
                        }
                        boolValueOf = Boolean.valueOf(sharedPreferencesX4.getBoolean(strY3 + "_userPrefersTranslatedItemDescription", true));
                    } else {
                        boolValueOf = null;
                    }
                    if (boolValueOf != null) {
                        ft.c.V((boolValueOf.booleanValue() ? e0.TRANSLATED : e0.ORIGINAL).name());
                        SharedPreferences.Editor editorEdit5 = ft.c.x().edit();
                        String strY4 = ft.c.y();
                        editorEdit5.remove((strY4 == null ? null : strY4) + "_userPrefersTranslatedItemDescription");
                        editorEdit5.apply();
                    }
                    SharedPreferences.Editor editorEdit6 = ft.c.x().edit();
                    editorEdit6.remove(strY.concat("showPhonePrompt"));
                    editorEdit6.apply();
                }
                return eVar;
            case 6:
                n20.f fVar3 = iVar.f1307a;
                Application applicationT = u00.d.t(iVar.f1310b.f27469a);
                o oVar = (o) iVar.f1330k.get();
                mv.b bVar4 = (mv.b) iVar.f1326i.get();
                String str = (String) iVar.l.get();
                oVar.getClass();
                bVar4.getClass();
                str.getClass();
                return new jt.f(applicationT, oVar, str, bVar4);
            case 7:
                return new o((d8.f) iVar.f1328j.get());
            case 8:
                r40.d dVar3 = iVar.f1313c;
                Context context = iVar.f1310b.f27469a;
                e8.a aVar2 = new e8.a(new im.a(i21));
                List listC = c0.c(g8.k.a(context, AppConstants.PREFS_CURRENT_LOGIN_NAME_PARAM, y.W(new String[]{"accessToken", "refreshToken", "accessTokenExpiresAtUtc"})));
                c90.f fVar4 = p0.f42144a;
                a90.d dVarB = f0.b(c90.e.f7834b.plus(f0.d()));
                bo.a aVar3 = new bo.a(context, i16);
                listC.getClass();
                return new h8.c(new h8.c(new d8.y(new d8.c0(dVar, new cp.i(13), new j5(i15, aVar3)), c0.c(new d8.c(listC, (x70.c) null, 0)), aVar2, dVarB)));
            case 9:
                n20.f fVar5 = iVar.f1307a;
                return s.e();
            case 10:
                return new jv.e();
            case 11:
                return new ao.h(iVar.f1310b.f27469a, (b0) iVar.f1343r.get(), (kt.a) iVar.f1345s.get(), (g3) iVar.J.get(), (v) iVar.f1341q.get(), (z) iVar.O.get(), (ao.c) iVar.P.get(), (m0) iVar.R.get(), (gs.a) iVar.T.get(), (rg.d) iVar.W.get(), (ft.s) iVar.A.get(), (cv.b) iVar.E.get(), iVar.f());
            case 12:
                qb.e eVar2 = iVar.f1316d;
                return f0.b(kotlin.coroutines.e.c(f0.d(), p0.f42144a));
            case 13:
                n20.f fVar6 = iVar.f1307a;
                jt.i iVar3 = (jt.i) iVar.f1335n.get();
                iVar3.getClass();
                kt.a aVar4 = (kt.a) ((jt.h) iVar3).b(kt.a.class, jt.c.DEFAULT);
                x0.o(aVar4);
                return aVar4;
            case 14:
                Context context2 = iVar.f1310b.f27469a;
                b0 b0Var = (b0) iVar.f1343r.get();
                kt.o oVar2 = (kt.o) iVar.f1347t.get();
                kt.a aVar5 = (kt.a) iVar.f1345s.get();
                kt.n nVar = (kt.n) iVar.f1348u.get();
                ft.j jVar = (ft.j) iVar.f1352w.get();
                cv.b bVar5 = (cv.b) iVar.E.get();
                LocalDatabase localDatabase = (LocalDatabase) iVar.F.get();
                localDatabase.getClass();
                gt.n nVarU = localDatabase.u();
                x0.o(nVarU);
                w wVarC = iVar.c();
                gt.b bVarA = iVar.a();
                o oVar3 = (o) iVar.f1330k.get();
                mv.b bVar6 = (mv.b) iVar.f1326i.get();
                NotificationManagerCompat notificationManagerCompatF = iVar.f();
                String string3 = Settings.Secure.getString(iVar.f1310b.f27469a.getContentResolver(), "android_id");
                string3.getClass();
                return new g3(context2, b0Var, oVar2, aVar5, nVar, jVar, bVar5, nVarU, wVarC, bVarA, oVar3, bVar6, notificationManagerCompatF, string3, iVar.d(), (u) iVar.G.get(), (x) iVar.H.get(), (gy.d) iVar.I.get(), new b70.c(0), (ft.e) iVar.f1324h.get());
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                n20.f fVar7 = iVar.f1307a;
                jt.i iVar4 = (jt.i) iVar.f1335n.get();
                iVar4.getClass();
                kt.o oVar4 = (kt.o) ((jt.h) iVar4).b(kt.o.class, jt.c.DEFAULT);
                x0.o(oVar4);
                return oVar4;
            case 16:
                n20.f fVar8 = iVar.f1307a;
                jt.i iVar5 = (jt.i) iVar.f1335n.get();
                iVar5.getClass();
                kt.n nVar2 = (kt.n) ((jt.h) iVar5).b(kt.n.class, jt.c.DEFAULT);
                x0.o(nVar2);
                return nVar2;
            case 17:
                return new ft.j(iVar.f1310b.f27469a, (kt.h) iVar.f1350v.get());
            case 18:
                n20.f fVar9 = iVar.f1307a;
                jt.i iVar6 = (jt.i) iVar.f1335n.get();
                iVar6.getClass();
                kt.h hVar = (kt.h) ((jt.h) iVar6).b(kt.h.class, jt.c.DEFAULT);
                x0.o(hVar);
                return hVar;
            case 19:
                ev.a aVar6 = (ev.a) iVar.f1354x.get();
                ev.e eVar3 = (ev.e) iVar.f1356y.get();
                ev.c cVar2 = (ev.c) iVar.B.get();
                ev.h hVar2 = (ev.h) iVar.C.get();
                ft.s sVar = (ft.s) iVar.A.get();
                ev.g gVar = (ev.g) iVar.D.get();
                aVar6.getClass();
                eVar3.getClass();
                cVar2.getClass();
                hVar2.getClass();
                sVar.getClass();
                gVar.getClass();
                cv.b bVar7 = new cv.b();
                bVar7.f13428a = aVar6;
                bVar7.f13429b = eVar3;
                bVar7.f13430c = cVar2;
                bVar7.f13431d = hVar2;
                bVar7.f13432e = sVar;
                bVar7.f13433f = gVar;
                if (((Boolean) f0.E(kotlin.coroutines.g.f26549a, new q(sVar, null, i21))).booleanValue()) {
                    bVar7.f13434g = sVar.a();
                }
                if (bVar7.f13434g) {
                    cVar2.a();
                    hVar2.a();
                }
                return bVar7;
            case 20:
                return new ev.a(iVar.f1310b.f27469a, (String) iVar.l.get(), (mv.b) iVar.f1326i.get());
            case 21:
                return new ev.e(iVar.f1310b.f27469a, (mv.b) iVar.f1326i.get());
            case 22:
                return new ev.c(iVar.f1310b.f27469a, (ft.s) iVar.A.get());
            case 23:
                d8.f fVar10 = (d8.f) iVar.f1358z.get();
                fVar10.getClass();
                ft.s sVar2 = new ft.s();
                sVar2.f17967a = fVar10;
                return sVar2;
            case 24:
                r40.d dVar4 = iVar.f1313c;
                Context context3 = iVar.f1310b.f27469a;
                e8.a aVar7 = new e8.a(new hb0.q(i18));
                List listC2 = c0.c(g8.k.a(context3, AppConstants.PREFS_USER_DATA_NAME_PARAM, y.W(new String[]{"allowMarketingDataCollection", "isTrackingSettingsSaved"})));
                c90.f fVar11 = p0.f42144a;
                a90.d dVarB2 = f0.b(c90.e.f7834b.plus(f0.d()));
                bo.a aVar8 = new bo.a(context3, i17);
                listC2.getClass();
                return new h8.c(new h8.c(new d8.y(new d8.c0(dVar, new cp.i(13), new j5(i15, aVar8)), c0.c(new d8.c(listC2, (x70.c) null, i19)), aVar7, dVarB2)));
            case 25:
                return new ev.h(iVar.f1310b.f27469a, (String) iVar.l.get());
            case 26:
                return new ev.g(iVar.f1310b.f27469a);
            case 27:
                n20.f fVar12 = iVar.f1318e;
                t tVarL = bx.o.L(iVar.f1310b.f27469a, LocalDatabase.class, "receiptdb");
                tVarL.a(ht.b.f22495h, ht.b.f22496i, ht.b.f22497j, ht.b.f22498k, ht.b.l, ht.b.f22499m, ht.b.f22500n, ht.b.f22501o, ht.b.f22502p, ht.b.f22503q, ht.b.f22504r, ht.b.f22505s, ht.b.f22506t, ht.b.f22507u, ht.b.f22508v, ht.b.f22509w, ht.b.f22488a, ht.b.f22489b, ht.b.f22490c, ht.b.f22510x, ht.b.f22491d, ht.b.f22511y, ht.b.f22512z, ht.b.f22492e, ht.b.f22493f, ht.b.f22494g, ht.b.A, ht.b.B, ht.b.C, ht.b.D, ht.b.E, ht.b.F, ht.b.G, ht.b.H, ht.b.I, ht.b.J, ht.b.K, ht.b.L, ht.b.M, ht.b.N, ht.b.O, ht.b.P, ht.b.Q, ht.b.R, ht.b.S, ht.b.T, ht.b.U, ht.b.V, ht.b.W, ht.b.X);
                int[] iArr = {1, 2, 3, 4, 5, 6};
                while (i19 < 6) {
                    tVarL.f45749m.add(Integer.valueOf(iArr[i19]));
                    i19++;
                }
                tVarL.f45752p = true;
                tVarL.f45753q = true;
                return (LocalDatabase) tVarL.b();
            case 28:
                return new u();
            case 29:
                return new x();
            case 30:
                qb.e eVar4 = iVar.f1316d;
                Context context4 = iVar.f1310b.f27469a;
                int i23 = gy.g.f20926a;
                return new gy.d(new gy.e(context4, 6));
            case BERTags.DATE /* 31 */:
                return new z(iVar.f1310b.f27469a, iVar.c(), iVar.b(), (kt.j) iVar.K.get(), (kt.d) iVar.L.get(), (kt.e) iVar.M.get(), (y0) iVar.N.get(), (cv.b) iVar.E.get(), (g3) iVar.J.get());
            case 32:
                n20.f fVar13 = iVar.f1307a;
                jt.i iVar7 = (jt.i) iVar.f1335n.get();
                iVar7.getClass();
                kt.j jVar2 = (kt.j) ((jt.h) iVar7).b(kt.j.class, jt.c.DEFAULT);
                x0.o(jVar2);
                return jVar2;
            case 33:
                n20.f fVar14 = iVar.f1307a;
                jt.i iVar8 = (jt.i) iVar.f1335n.get();
                iVar8.getClass();
                kt.d dVar5 = (kt.d) ((jt.h) iVar8).b(kt.d.class, jt.c.DEFAULT);
                x0.o(dVar5);
                return dVar5;
            case BERTags.DURATION /* 34 */:
                n20.f fVar15 = iVar.f1307a;
                jt.i iVar9 = (jt.i) iVar.f1335n.get();
                iVar9.getClass();
                kt.e eVar5 = (kt.e) ((jt.h) iVar9).b(kt.e.class, jt.c.DEFAULT);
                x0.o(eVar5);
                return eVar5;
            case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                return new y0(iVar.f1310b.f27469a, iVar.c(), (kt.e) iVar.M.get());
            case 36:
                return new ao.c(iVar.d(), (kt.a) iVar.f1345s.get());
            case 37:
                Context context5 = iVar.f1310b.f27469a;
                b0 b0Var2 = (b0) iVar.f1343r.get();
                kt.n nVar3 = (kt.n) iVar.f1348u.get();
                v vVar = (v) iVar.f1341q.get();
                g3 g3Var = (g3) iVar.J.get();
                LocalDatabase localDatabase2 = (LocalDatabase) iVar.F.get();
                localDatabase2.getClass();
                gt.n nVarU2 = localDatabase2.u();
                x0.o(nVarU2);
                return new m0(context5, b0Var2, nVar3, vVar, g3Var, nVarU2, (mv.b) iVar.f1326i.get(), (d8.f) iVar.Q.get());
            case 38:
                r40.d dVar6 = iVar.f1313c;
                Context context6 = iVar.f1310b.f27469a;
                e8.a aVar9 = new e8.a(new hb0.q(i11));
                List listC3 = c0.c(g8.k.a(context6, AppConstants.PREFS_APP_DATA_NAME_PARAM, y.W(new String[]{"heartbeat", "session"})));
                c90.f fVar16 = p0.f42144a;
                a90.d dVarB3 = f0.b(c90.e.f7834b.plus(f0.d()));
                bo.a aVar10 = new bo.a(context6, 8);
                listC3.getClass();
                return new h8.c(new h8.c(new d8.y(new d8.c0(dVar, new cp.i(13), new j5(i15, aVar10)), c0.c(new d8.c(listC3, cVar, i19)), aVar9, dVarB3)));
            case 39:
                Context context7 = iVar.f1310b.f27469a;
                ds.a aVar11 = (ds.a) iVar.S.get();
                aVar11.getClass();
                return new gs.a(context7, aVar11);
            case 40:
                jt.i iVar10 = (jt.i) iVar.f1335n.get();
                iVar10.getClass();
                return new ds.a(iVar10);
            case RequestError.NO_DEV_KEY /* 41 */:
                return new rg.d(iVar.f1310b.f27469a, (kt.c) iVar.U.get(), iVar.g(), (rg.w) iVar.V.get());
            case 42:
                n20.f fVar17 = iVar.f1307a;
                jt.i iVar11 = (jt.i) iVar.f1335n.get();
                iVar11.getClass();
                kt.c cVar3 = (kt.c) ((jt.h) iVar11).b(kt.c.class, jt.c.DEFAULT);
                x0.o(cVar3);
                return cVar3;
            case 43:
                return new rg.w(iVar.f1310b.f27469a);
            case 44:
                return new g(this, 1);
            case 45:
                return new g(this, 2);
            case 46:
                Context context8 = iVar.f1310b.f27469a;
                ip.a aVar12 = (ip.a) iVar.f1308a0.get();
                LocalDatabase localDatabase3 = (LocalDatabase) iVar.F.get();
                localDatabase3.getClass();
                a0 a0VarX = localDatabase3.x();
                x0.o(a0VarX);
                return new jp.q(context8, aVar12, a0VarX);
            case 47:
                jt.i iVar12 = (jt.i) iVar.f1335n.get();
                iVar12.getClass();
                return new ip.a(iVar12);
            case 48:
                return new g(this, 3);
            case 49:
                return new g(this, 4);
            case 50:
                return new e70.c((f70.g) iVar.f1321f0.get(), (av.b) iVar.f1323g0.get());
            case 51:
                return new f70.g((b0) iVar.f1343r.get());
            case 52:
                qb.e eVar6 = iVar.f1320f;
                return new av.b(iVar.f1310b.f27469a);
            case 53:
                mv.e0 e0Var = new mv.e0();
                qb.e eVar7 = iVar.f1316d;
                e0Var.f30179e = new qb.e();
                return e0Var;
            case 54:
                return new gv.b(iVar.f1310b.f27469a, (ao.c) iVar.P.get(), iVar.f());
            case 55:
                return new tg.c((kt.o) iVar.f1347t.get(), (kt.h) iVar.f1350v.get());
            case 56:
                return new gl.o((kt.o) iVar.f1347t.get());
            case 57:
                return new yk.f((kt.o) iVar.f1347t.get(), (x) iVar.H.get());
            case 58:
                iVar.f1336n0.get().getClass();
                org.bouncycastle.jce.provider.a.c();
                return null;
            case 59:
                jt.i iVar13 = (jt.i) iVar.f1335n.get();
                iVar13.getClass();
                if (((jt.h) iVar13).b(yg.a.class, jt.c.DEFAULT) != null) {
                    org.bouncycastle.jce.provider.a.c();
                    return null;
                }
                x0.o(null);
                throw null;
            case 60:
                return new ao.c0((kt.m) iVar.f1340p0.get(), (kt.f) iVar.f1342q0.get());
            case 61:
                n20.f fVar18 = iVar.f1307a;
                jt.i iVar14 = (jt.i) iVar.f1335n.get();
                iVar14.getClass();
                kt.m mVar2 = (kt.m) ((jt.h) iVar14).b(kt.m.class, jt.c.DEFAULT);
                x0.o(mVar2);
                return mVar2;
            case 62:
                n20.f fVar19 = iVar.f1307a;
                jt.i iVar15 = (jt.i) iVar.f1335n.get();
                iVar15.getClass();
                kt.f fVar20 = (kt.f) ((jt.h) iVar15).b(kt.f.class, jt.c.DEFAULT);
                x0.o(fVar20);
                return fVar20;
            case 63:
                eh.a aVar13 = (eh.a) iVar.f1346s0.get();
                aVar13.getClass();
                return new hh.a(aVar13);
            case 64:
                jt.i iVar16 = (jt.i) iVar.f1335n.get();
                iVar16.getClass();
                return new eh.a(iVar16);
            case 65:
                return new r1(iVar.f1310b.f27469a, (kt.f) iVar.f1342q0.get(), (kt.c) iVar.U.get(), (kt.i) iVar.f1349u0.get(), (kt.d) iVar.L.get(), (g3) iVar.J.get(), (ft.j) iVar.f1352w.get(), (wj.d) iVar.f1351v0.get(), (cv.b) iVar.E.get(), (ft.b) iVar.f1353w0.get(), new qb.e());
            case 66:
                n20.f fVar21 = iVar.f1307a;
                jt.i iVar17 = (jt.i) iVar.f1335n.get();
                iVar17.getClass();
                kt.i iVar18 = (kt.i) ((jt.h) iVar17).b(kt.i.class, jt.c.DEFAULT);
                x0.o(iVar18);
                return iVar18;
            case 67:
                return new wj.d(iVar.f1310b.f27469a, (kt.d) iVar.L.get(), (u) iVar.G.get());
            case 68:
                ft.b bVar8 = new ft.b();
                bVar8.f17901a = ft.b.a();
                bVar8.f17902b = n0.f26529a;
                bVar8.f17903c = new LinkedHashSet();
                return bVar8;
            case 69:
                return new z1((kt.c) iVar.U.get(), (ft.j) iVar.f1352w.get(), iVar.f1310b.f27469a);
            case 70:
                return new ij.b();
            case 71:
                return new lh.e0((wj.d) iVar.f1351v0.get(), (rg.d) iVar.W.get(), (r1) iVar.f1355x0.get());
            case 72:
                n20.f fVar22 = iVar.f1307a;
                jt.i iVar19 = (jt.i) iVar.f1335n.get();
                iVar19.getClass();
                kt.k kVar = (kt.k) ((jt.h) iVar19).b(kt.k.class, jt.c.DEFAULT);
                x0.o(kVar);
                return kVar;
            case 73:
                r40.d dVar7 = iVar.f1313c;
                Context context9 = iVar.f1310b.f27469a;
                e8.a aVar14 = new e8.a(new im.a(i19));
                c90.f fVar23 = p0.f42144a;
                return h8.d.d(aVar14, f0.b(c90.e.f7834b.plus(f0.d())), new bo.a(context9, i12));
            case 74:
                n20.f fVar24 = iVar.f1307a;
                jt.i iVar20 = (jt.i) iVar.f1335n.get();
                iVar20.getClass();
                kt.g gVar2 = (kt.g) ((jt.h) iVar20).b(kt.g.class, jt.c.DEFAULT);
                x0.o(gVar2);
                return gVar2;
            case 75:
                return new ln.i((kt.o) iVar.f1347t.get(), (d8.f) iVar.C0.get());
            case 76:
                r40.d dVar8 = iVar.f1313c;
                Context context10 = iVar.f1310b.f27469a;
                e8.a aVar15 = new e8.a(new hb0.q(i14));
                c90.f fVar25 = p0.f42144a;
                return h8.d.d(aVar15, f0.b(c90.e.f7834b.plus(f0.d())), new bo.a(context10, i13));
            case 77:
                qb.e eVar8 = iVar.f1316d;
                String strH = r0.h(iVar.f1310b.f27469a);
                x0.o(strH);
                return strH;
            case 78:
                fm.c cVar4 = (fm.c) iVar.H0.get();
                cVar4.getClass();
                return new gm.b(cVar4);
            case 79:
                jt.i iVar21 = (jt.i) iVar.f1335n.get();
                iVar21.getClass();
                return new fm.c(iVar21);
            case 80:
                zr.a aVar16 = (zr.a) iVar.J0.get();
                aVar16.getClass();
                return new as.b(aVar16);
            case 81:
                jt.i iVar22 = (jt.i) iVar.f1335n.get();
                iVar22.getClass();
                return new zr.a(iVar22);
            case 82:
                Context context11 = iVar.f1310b.f27469a;
                g3 g3Var2 = (g3) iVar.J.get();
                kt.o oVar5 = (kt.o) iVar.f1347t.get();
                ev.c cVar5 = (ev.c) iVar.B.get();
                String string4 = Settings.Secure.getString(iVar.f1310b.f27469a.getContentResolver(), "android_id");
                string4.getClass();
                return new qq.c(context11, g3Var2, oVar5, cVar5, string4);
            case 83:
                ft.j jVar3 = (ft.j) iVar.f1352w.get();
                r1 r1Var = (r1) iVar.f1355x0.get();
                gs.a aVar17 = (gs.a) iVar.T.get();
                rg.d dVar9 = (rg.d) iVar.W.get();
                wj.d dVar10 = (wj.d) iVar.f1351v0.get();
                d8.f fVar26 = (d8.f) iVar.C0.get();
                jVar3.getClass();
                r1Var.getClass();
                aVar17.getClass();
                dVar9.getClass();
                dVar10.getClass();
                fVar26.getClass();
                return new pk.i(jVar3, r1Var, aVar17, dVar9, dVar10, fVar26);
            case 84:
                return new hv.j(iVar.f1310b.f27469a, (g3) iVar.J.get(), (u) iVar.G.get(), (b0) iVar.f1343r.get(), (iv.a) iVar.N0.get(), new se.b((cv.b) iVar.E.get()), (hv.a) iVar.O0.get(), (hv.l) iVar.P0.get());
            case 85:
                mv.b bVar9 = mv.b.f30149d;
                if (bVar9 != null) {
                    bVar = bVar9;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("instance");
                    bVar = null;
                }
                return bVar.f30152c.getProduction() ? new iv.a("eyJzZXR0aW5nc191cmwiOiJodHRwczovL3RndGcuemVuZGVzay5jb20vbW9iaWxlX3Nka19hcGkvc2V0dGluZ3MvMDFLOFgyNU4zNzFUNUJCOEZUTjdQTk1OTlcuanNvbiJ9", "24412033808914", "21257395228818", "31125628452114") : new iv.a("eyJzZXR0aW5nc191cmwiOiJodHRwczovL3RndGcxNzQxMzQzNTIxLnplbmRlc2suY29tL21vYmlsZV9zZGtfYXBpL3NldHRpbmdzLzAxSzk1NDMyOTBIODgxQkRBSzcxUEJSNk1BLmpzb24ifQ==", "25158770024210", "25158785193746", "31121182758930");
            case 86:
                return new hv.f((g3) iVar.J.get());
            case 87:
                return new hv.l(iVar.f1310b.f27469a);
            case 88:
                return new f2((kt.l) iVar.R0.get());
            case 89:
                n20.f fVar27 = iVar.f1307a;
                jt.i iVar23 = (jt.i) iVar.f1335n.get();
                iVar23.getClass();
                kt.l lVar = (kt.l) ((jt.h) iVar23).b(kt.l.class, jt.c.DEFAULT);
                x0.o(lVar);
                return lVar;
            case 90:
                Context context12 = iVar.f1310b.f27469a;
                ip.a aVar18 = (ip.a) iVar.f1308a0.get();
                LocalDatabase localDatabase4 = (LocalDatabase) iVar.F.get();
                localDatabase4.getClass();
                a0 a0VarX2 = localDatabase4.x();
                x0.o(a0VarX2);
                aVar18.getClass();
                return new jp.q(context12, aVar18, a0VarX2);
            case 91:
                n20.f fVar28 = iVar.f1307a;
                return new jt.b();
            case 92:
                rp.a aVar19 = (rp.a) iVar.V0.get();
                aVar19.getClass();
                return new sp.f(aVar19);
            case 93:
                jt.i iVar24 = (jt.i) iVar.f1335n.get();
                iVar24.getClass();
                return new rp.a(iVar24);
            case 94:
                ws.a aVar20 = (ws.a) iVar.X0.get();
                aVar20.getClass();
                return new ys.a(aVar20);
            case 95:
                jt.i iVar25 = (jt.i) iVar.f1335n.get();
                iVar25.getClass();
                return new ws.a(iVar25);
            case 96:
                wp.a aVar21 = (wp.a) iVar.Z0.get();
                aVar21.getClass();
                return new yp.a(aVar21);
            case 97:
                jt.i iVar26 = (jt.i) iVar.f1335n.get();
                iVar26.getClass();
                return new wp.a(iVar26);
            case 98:
                return new r3((p) iVar.f1312b1.get(), (g3) iVar.J.get());
            case 99:
                n20.f fVar29 = iVar.f1307a;
                jt.i iVar27 = (jt.i) iVar.f1335n.get();
                iVar27.getClass();
                p pVar = (p) ((jt.h) iVar27).b(p.class, jt.c.DEFAULT);
                x0.o(pVar);
                return pVar;
            default:
                throw new AssertionError(i22);
        }
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [T, a90.d] */
    /* JADX WARN: Type inference failed for: r9v6, types: [T, a90.d] */
    @Override // t70.a
    public final Object get() {
        Object aVar;
        String string;
        Object hVar;
        switch (this.f1304a) {
            case 0:
                return a();
            default:
                g0.e eVar = (g0.e) this.f1306c;
                int i11 = this.f1305b;
                switch (i11) {
                    case 0:
                        hVar = new j0.h((i1) eVar.f18030d.get());
                        return hVar;
                    case 1:
                        return f0.c();
                    case 2:
                        hVar = new j0.b((j0.a) eVar.f18048w.get());
                        return hVar;
                    case 3:
                        e0.y yVar = (e0.y) eVar.f18027a.f822b;
                        h hVar2 = eVar.f18047v;
                        Context contextA = eVar.a();
                        h0.n nVar = (h0.n) eVar.f18032f.get();
                        j0.h hVar3 = (j0.h) eVar.f18031e.get();
                        hVar2.getClass();
                        nVar.getClass();
                        hVar3.getClass();
                        lz.i iVar = yVar.f15421d;
                        iVar.getClass();
                        Map map = (Map) iVar.f28446b;
                        try {
                            Trace.beginSection("Initialize defaultCameraBackend");
                            e0.e eVar2 = (e0.e) hVar2.get();
                            Trace.endSection();
                            String str = "CXCP-Camera2";
                            if (map.containsKey(new e0.g(str))) {
                                qc.y.j("CameraBackendConfig#cameraBackends should not contain a backend with ", e0.g.a("CXCP-Camera2"), ". Use CameraBackendConfig#internalBackend field instead.");
                            } else {
                                Map mapH = kotlin.collections.x0.h(map, new Pair(new e0.g(str), new g0.a(eVar2)));
                                if (mapH.containsKey(new e0.g(str))) {
                                    aVar = new j0.a("CXCP-Camera2", mapH, contextA, nVar, hVar3);
                                    return aVar;
                                }
                                StringBuilder sb2 = new StringBuilder("Failed to find ");
                                sb2.append((Object) e0.g.a("CXCP-Camera2"));
                                hv.k.a(sb2, " in the list of available CameraPipe backends! Available values are ", mapH.keySet());
                            }
                            return null;
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    case 4:
                        hVar = new g0((h0.n) eVar.f18032f.get(), (c1) eVar.f18037k.get(), (k1) eVar.f18039n.get(), (q3) eVar.f18046u.get(), new lz.i(eVar, 15), eVar.a());
                        return hVar;
                    case 5:
                        g0.g gVar = eVar.f18028b;
                        j0.h hVar4 = (j0.h) eVar.f18031e.get();
                        i1 i1Var = (i1) eVar.f18030d.get();
                        int i12 = gVar.f18059e;
                        hVar4.getClass();
                        i1Var.getClass();
                        ArrayList arrayList = new ArrayList();
                        gVar.f18055a.getClass();
                        ThreadFactory threadFactory = h0.c.f20961b;
                        ScheduledExecutorService scheduledExecutorServiceA = h0.c.a(new h0.a(i12, h0.c.b(threadFactory, "CXCP-IO-")), 8);
                        arrayList.add(scheduledExecutorServiceA);
                        v80.x xVarQ = f0.q(scheduledExecutorServiceA);
                        ScheduledExecutorService scheduledExecutorServiceA2 = h0.c.a(new h0.a(i12, h0.c.b(threadFactory, "CXCP-BG-")), gVar.f18057c);
                        arrayList.add(scheduledExecutorServiceA2);
                        v80.x xVarQ2 = f0.q(scheduledExecutorServiceA2);
                        ScheduledExecutorService scheduledExecutorServiceA3 = h0.c.a(new h0.a(gVar.f18058d, h0.c.b(threadFactory, "CXCP-")), gVar.f18056b);
                        arrayList.add(scheduledExecutorServiceA3);
                        v80.x xVarQ3 = f0.q(scheduledExecutorServiceA3);
                        hVar4.a(j0.e.THREAD, new d1.e(arrayList, 14));
                        g0.f fVar = new g0.f(gVar, hVar4, 0);
                        g0.f fVar2 = new g0.f(gVar, hVar4, 1);
                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                        objectRef.element = f0.b(kotlin.coroutines.e.c(new d2(i1Var), xVarQ3).plus(new v80.a0("CXCP")));
                        objectRef2.element = f0.b(kotlin.coroutines.e.c(new d2(i1Var), new v80.a0("CXCP-Dispatch")));
                        hVar4.a(j0.e.SCOPE, new r(16, objectRef, objectRef2));
                        return new h0.n((b0) objectRef.element, (b0) objectRef2.element, scheduledExecutorServiceA, xVarQ, scheduledExecutorServiceA2, xVarQ2, scheduledExecutorServiceA3, xVarQ3, fVar, fVar2);
                    case 6:
                        hVar = new c1(eVar.f18033g, (h0.n) eVar.f18032f.get(), eVar.a(), (PackageManager) eVar.f18034h.get(), (j1) eVar.f18035i.get(), eVar.f18036j, (j0.h) eVar.f18031e.get(), (i1) eVar.f18030d.get());
                        return hVar;
                    case 7:
                        Object systemService = eVar.a().getSystemService("camera");
                        systemService.getClass();
                        return (CameraManager) systemService;
                    case 8:
                        PackageManager packageManager = eVar.a().getPackageManager();
                        packageManager.getClass();
                        return packageManager;
                    case 9:
                        return new j1();
                    case 10:
                        Context contextA2 = eVar.a();
                        h1.e eVar3 = new h1.e();
                        if (Build.VERSION.SDK_INT >= 35) {
                            eVar3.f21000b = new h1.c(contextA2);
                        }
                        h1.c cVar = null;
                        try {
                            ServiceInfo[] serviceInfoArr = contextA2.getPackageManager().getPackageInfo(contextA2.getPackageName(), AppConstants.RESULT_CODE_FLASH_SALES_SURVEY).services;
                            if (serviceInfoArr != null) {
                                int length = serviceInfoArr.length;
                                int i13 = 0;
                                String str2 = null;
                                while (true) {
                                    if (i13 < length) {
                                        Bundle bundle = serviceInfoArr[i13].metaData;
                                        if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                            if (str2 == null) {
                                                str2 = string;
                                            } else {
                                                h2.b("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                            }
                                        }
                                        i13++;
                                    } else if (str2 != null) {
                                        try {
                                            cVar = (h1.c) Class.forName(str2).getConstructor(Context.class).newInstance(contextA2);
                                        } catch (Exception e5) {
                                            wy.o.k("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e5);
                                        }
                                    }
                                    break;
                                }
                                return null;
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        eVar3.f20999a = cVar;
                        hVar = eVar3;
                        return hVar;
                    case 11:
                        Context contextA3 = eVar.a();
                        h0.n nVar2 = (h0.n) eVar.f18032f.get();
                        h0.h hVar5 = (h0.h) eVar.l.get();
                        dn.k kVar = ((e0.y) eVar.f18027a.f822b).f15420c;
                        x0.o(kVar);
                        return new k1(contextA3, nVar2, hVar5, kVar, (h0.m) eVar.f18038m.get());
                    case 12:
                        hVar = new h0.h(eVar.a());
                        return hVar;
                    case 13:
                        return new h0.m();
                    case 14:
                        return new q3((h0.h) eVar.l.get(), (v3) eVar.f18044s.get(), (d1) eVar.f18045t.get(), (j1) eVar.f18035i.get(), (h0.n) eVar.f18032f.get());
                    case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                        s70.c cVar2 = eVar.f18033g;
                        a50.c cVar3 = eVar.f18027a;
                        dn.k kVar2 = new dn.k(cVar2, (h0.n) eVar.f18032f.get());
                        l1 l1Var = (l1) eVar.f18039n.get();
                        j1 j1Var = (j1) eVar.f18035i.get();
                        n1 n1Var = (n1) eVar.f18041p.get();
                        h0.m mVar = (h0.m) eVar.f18038m.get();
                        e0.x xVar = ((e0.y) cVar3.f822b).f15422e;
                        x0.o(xVar);
                        h0.n nVar3 = (h0.n) eVar.f18032f.get();
                        l1Var.getClass();
                        j1Var.getClass();
                        n1Var.getClass();
                        mVar.getClass();
                        nVar3.getClass();
                        f0.f2 f2Var = new f0.f2();
                        f2Var.f16648a = kVar2;
                        f2Var.f16649b = l1Var;
                        f2Var.f16650c = j1Var;
                        f2Var.f16651d = n1Var;
                        f2Var.f16652e = mVar;
                        f2Var.f16653f = xVar;
                        f2Var.f16654g = nVar3;
                        f2Var.f16655h = new v80.q();
                        j1 j1Var2 = (j1) eVar.f18035i.get();
                        com.google.firebase.messaging.a0 a0Var = new com.google.firebase.messaging.a0(eVar.f18033g, (h0.n) eVar.f18032f.get(), (i1) eVar.f18030d.get());
                        h0.m mVar2 = (h0.m) eVar.f18038m.get();
                        f0.k kVar3 = (f0.k) eVar.f18042q.get();
                        d0 d0Var = (d0) eVar.f18043r.get();
                        e0.x xVar2 = ((e0.y) cVar3.f822b).f15422e;
                        x0.o(xVar2);
                        aVar = new x3(f2Var, j1Var2, a0Var, mVar2, kVar3, d0Var, xVar2, (h0.n) eVar.f18032f.get());
                        return aVar;
                    case 16:
                        hVar = new n1((l1) eVar.f18039n.get(), (q1) eVar.f18040o.get());
                        return hVar;
                    case 17:
                        x0.o(((e0.y) eVar.f18027a.f822b).f15423f);
                        return new q1();
                    case 18:
                        Object systemService2 = eVar.a().getSystemService("device_policy");
                        systemService2.getClass();
                        hVar = new f0.k((DevicePolicyManager) systemService2);
                        return hVar;
                    case 19:
                        hVar = new d0((h0.n) eVar.f18032f.get(), (j0.h) eVar.f18031e.get(), (i1) eVar.f18030d.get());
                        return hVar;
                    case 20:
                        hVar = new g1((h0.n) eVar.f18032f.get(), (n1) eVar.f18041p.get(), (v3) eVar.f18044s.get());
                        return hVar;
                    case 21:
                        eVar.a();
                        h0.n nVar4 = (h0.n) eVar.f18032f.get();
                        j0.a aVar2 = (j0.a) eVar.f18048w.get();
                        nVar4.getClass();
                        aVar2.getClass();
                        return new g0.b();
                    case 22:
                        return new h0();
                    case 23:
                        return new v2();
                    default:
                        throw new AssertionError(i11);
                }
        }
    }
}
