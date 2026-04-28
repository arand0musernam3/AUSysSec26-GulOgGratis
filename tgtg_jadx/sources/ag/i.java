package ag;

import android.content.SharedPreferences;
import androidx.core.app.NotificationManagerCompat;
import com.app.tgtg.gateway.local.LocalDatabase;
import com.app.tgtg.model.local.AppConstants;
import gt.w;
import java.util.UUID;
import o00.x0;
import rg.s;
import rg.t;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements m, s, t, gv.c, m70.a, p70.c, p70.i, r70.a {
    public final s70.c O0;
    public final s70.c P0;
    public final s70.c Y;
    public final s70.c Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n20.f f1307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l8.m f1310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r40.d f1313c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final s70.c f1314c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qb.e f1316d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final s70.c f1317d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n20.f f1318e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final s70.c f1319e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qb.e f1320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f1322g = this;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s70.c f1324h = a0.u(this, 5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s70.c f1326i = a0.u(this, 4);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s70.c f1328j = a0.u(this, 8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s70.c f1330k = a0.u(this, 7);
    public final s70.c l = a0.u(this, 9);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s70.c f1333m = a0.u(this, 6);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final s70.c f1335n = a0.u(this, 3);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final s70.c f1337o = a0.u(this, 2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s70.c f1339p = a0.u(this, 10);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s70.c f1341q = a0.u(this, 1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s70.c f1343r = a0.u(this, 12);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s70.c f1345s = a0.u(this, 13);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s70.c f1347t = a0.u(this, 15);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final s70.c f1348u = a0.u(this, 16);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final s70.c f1350v = a0.u(this, 18);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final s70.c f1352w = a0.u(this, 17);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final s70.c f1354x = a0.u(this, 20);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final s70.c f1356y = a0.u(this, 21);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final s70.c f1358z = a0.u(this, 24);
    public final s70.c A = a0.u(this, 23);
    public final s70.c B = a0.u(this, 22);
    public final s70.c C = a0.u(this, 25);
    public final s70.c D = a0.u(this, 26);
    public final s70.c E = a0.u(this, 19);
    public final s70.c F = a0.u(this, 27);
    public final s70.c G = a0.u(this, 28);
    public final s70.c H = a0.u(this, 29);
    public final s70.c I = a0.u(this, 30);
    public final s70.c J = a0.u(this, 14);
    public final s70.c K = a0.u(this, 32);
    public final s70.c L = a0.u(this, 33);
    public final s70.c M = a0.u(this, 34);
    public final s70.c N = a0.u(this, 35);
    public final s70.c O = a0.u(this, 31);
    public final s70.c P = a0.u(this, 36);
    public final s70.c Q = a0.u(this, 38);
    public final s70.c R = a0.u(this, 37);
    public final s70.c S = a0.u(this, 40);
    public final s70.c T = a0.u(this, 39);
    public final s70.c U = a0.u(this, 42);
    public final s70.c V = a0.u(this, 43);
    public final s70.c W = a0.u(this, 41);
    public final s70.c X = a0.u(this, 11);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final s70.c f1308a0 = a0.u(this, 47);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final s70.c f1311b0 = a0.u(this, 46);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final s70.c f1321f0 = a0.u(this, 51);

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final s70.c f1323g0 = a0.u(this, 52);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final s70.c f1325h0 = a0.u(this, 50);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final s70.c f1327i0 = a0.u(this, 53);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final s70.c f1329j0 = a0.u(this, 54);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final s70.c f1331k0 = a0.u(this, 55);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final s70.c f1332l0 = a0.u(this, 56);

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final s70.c f1334m0 = a0.u(this, 57);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final s70.c f1336n0 = a0.u(this, 59);

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final s70.c f1338o0 = a0.u(this, 58);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final s70.c f1340p0 = a0.u(this, 61);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final s70.c f1342q0 = a0.u(this, 62);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final s70.c f1344r0 = a0.u(this, 60);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final s70.c f1346s0 = a0.u(this, 64);
    public final s70.c t0 = a0.u(this, 63);

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final s70.c f1349u0 = a0.u(this, 66);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final s70.c f1351v0 = a0.u(this, 67);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final s70.c f1353w0 = a0.u(this, 68);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final s70.c f1355x0 = a0.u(this, 65);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final s70.c f1357y0 = a0.u(this, 69);

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final s70.c f1359z0 = a0.u(this, 70);
    public final s70.c A0 = a0.u(this, 71);
    public final s70.c B0 = a0.u(this, 72);
    public final s70.c C0 = a0.u(this, 73);
    public final s70.c D0 = a0.u(this, 74);
    public final s70.c E0 = a0.u(this, 75);
    public final s70.c F0 = a0.u(this, 76);
    public final s70.c G0 = a0.u(this, 77);
    public final s70.c H0 = a0.u(this, 79);
    public final s70.c I0 = a0.u(this, 78);
    public final s70.c J0 = a0.u(this, 81);
    public final s70.c K0 = a0.u(this, 80);
    public final s70.c L0 = a0.u(this, 82);
    public final s70.c M0 = a0.u(this, 83);
    public final s70.c N0 = a0.u(this, 85);
    public final s70.c Q0 = a0.u(this, 84);
    public final s70.c R0 = a0.u(this, 89);
    public final s70.c S0 = a0.u(this, 88);
    public final s70.c T0 = a0.u(this, 90);
    public final s70.c U0 = a0.u(this, 91);
    public final s70.c V0 = a0.u(this, 93);
    public final s70.c W0 = a0.u(this, 92);
    public final s70.c X0 = a0.u(this, 95);
    public final s70.c Y0 = a0.u(this, 94);
    public final s70.c Z0 = a0.u(this, 97);

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final s70.c f1309a1 = a0.u(this, 96);

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final s70.c f1312b1 = a0.u(this, 99);

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final s70.c f1315c1 = a0.u(this, 98);

    public i(l8.m mVar, qb.e eVar, r40.d dVar, n20.f fVar, qb.e eVar2, n20.f fVar2) {
        this.f1307a = fVar2;
        this.f1310b = mVar;
        this.f1313c = dVar;
        this.f1316d = eVar;
        this.f1318e = fVar;
        this.f1320f = eVar2;
        int i11 = 0;
        this.Y = s70.d.a(new h(this, 0, i11));
        this.Z = s70.d.a(new h(this, 44, i11));
        this.f1314c0 = s70.d.a(new h(this, 45, i11));
        this.f1317d0 = s70.d.a(new h(this, 48, i11));
        this.f1319e0 = s70.d.a(new h(this, 49, i11));
        this.O0 = s70.a.a(new h(this, 86, i11));
        this.P0 = s70.a.a(new h(this, 87, i11));
    }

    public final gt.b a() {
        LocalDatabase localDatabase = (LocalDatabase) this.F.get();
        localDatabase.getClass();
        gt.b bVarS = localDatabase.s();
        x0.o(bVarS);
        return bVarS;
    }

    public final gt.j b() {
        LocalDatabase localDatabase = (LocalDatabase) this.F.get();
        localDatabase.getClass();
        gt.j jVarT = localDatabase.t();
        x0.o(jVarT);
        return jVarT;
    }

    public final w c() {
        LocalDatabase localDatabase = (LocalDatabase) this.F.get();
        localDatabase.getClass();
        w wVarV = localDatabase.v();
        x0.o(wVarV);
        return wVarV;
    }

    public final SharedPreferences d() {
        SharedPreferences sharedPreferences = this.f1310b.f27469a.getSharedPreferences(AppConstants.PREFS_CURRENT_LOGIN_NAME_PARAM, 0);
        sharedPreferences.getClass();
        return sharedPreferences;
    }

    public final String e() {
        SharedPreferences sharedPreferences = this.f1310b.f27469a.getSharedPreferences(AppConstants.PREFS_APP_DATA_NAME_PARAM, 0);
        String string = sharedPreferences.getString("consentScreenUUID", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        sharedPreferences.edit().putString("consentScreenUUID", string2).apply();
        string2.getClass();
        return string2;
    }

    public final NotificationManagerCompat f() {
        NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(this.f1310b.f27469a);
        notificationManagerCompatFrom.getClass();
        return notificationManagerCompatFrom;
    }

    public final jb.s g() {
        jb.s sVarD = jb.s.d(this.f1310b.f27469a);
        sVarD.getClass();
        return sVarD;
    }
}
