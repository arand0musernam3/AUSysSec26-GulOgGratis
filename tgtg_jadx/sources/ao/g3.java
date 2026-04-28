package ao;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.app.NotificationManagerCompat;
import com.app.tgtg.feature.main.MainActivity;
import com.app.tgtg.model.remote.FeatureActivation;
import com.app.tgtg.model.remote.FeatureExperiment;
import com.app.tgtg.model.remote.LoyaltyCardResponse;
import com.app.tgtg.model.remote.RewardSurveyInfo;
import com.app.tgtg.model.remote.UserData;
import com.app.tgtg.model.remote.UserSettings;
import com.app.tgtg.model.remote.UserType;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.user.response.C2CReferralResponse;
import com.app.tgtg.model.remote.user.response.charity.CharityUserDetails;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v80.b0 f4258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kt.o f4259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kt.a f4260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kt.n f4261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ft.j f4262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final cv.b f4263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gt.n f4264h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final gt.w f4265i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final gt.b f4266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ft.o f4267k;
    public final mv.b l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final NotificationManagerCompat f4268m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f4269n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SharedPreferences f4270o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mv.u f4271p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mv.x f4272q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final gy.d f4273r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b70.c f4274s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public UserData f4275t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public UserSettings f4276u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a50.c f4277v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f4278w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f4279x;

    public g3(Context context, v80.b0 b0Var, kt.o oVar, kt.a aVar, kt.n nVar, ft.j jVar, cv.b bVar, gt.n nVar2, gt.w wVar, gt.b bVar2, ft.o oVar2, mv.b bVar3, NotificationManagerCompat notificationManagerCompat, String str, SharedPreferences sharedPreferences, mv.u uVar, mv.x xVar, gy.d dVar, b70.c cVar, ft.e eVar) {
        Object pVar;
        UserData userData;
        Object pVar2;
        UserSettings userSettings;
        b0Var.getClass();
        oVar.getClass();
        aVar.getClass();
        nVar.getClass();
        jVar.getClass();
        bVar.getClass();
        oVar2.getClass();
        bVar3.getClass();
        uVar.getClass();
        xVar.getClass();
        dVar.getClass();
        eVar.getClass();
        this.f4257a = context;
        this.f4258b = b0Var;
        this.f4259c = oVar;
        this.f4260d = aVar;
        this.f4261e = nVar;
        this.f4262f = jVar;
        this.f4263g = bVar;
        this.f4264h = nVar2;
        this.f4265i = wVar;
        this.f4266j = bVar2;
        this.f4267k = oVar2;
        this.l = bVar3;
        this.f4268m = notificationManagerCompat;
        this.f4269n = str;
        this.f4270o = sharedPreferences;
        this.f4271p = uVar;
        this.f4272q = xVar;
        this.f4273r = dVar;
        this.f4274s = cVar;
        x70.c cVar2 = null;
        String string = sharedPreferences.getString("currentUser", null);
        if (string != null) {
            try {
                u70.o oVar3 = u70.q.f40850b;
                pVar = UserData.INSTANCE.fromJson(string);
            } catch (Throwable th2) {
                u70.o oVar4 = u70.q.f40850b;
                pVar = new u70.p(th2);
            }
            Throwable thA = u70.q.a(pVar);
            if (thA != null) {
                sa0.a.f38953a.d(thA);
                sharedPreferences.edit().remove("currentUser").apply();
            }
            userData = (UserData) (pVar instanceof u70.p ? null : pVar);
        } else {
            userData = null;
        }
        this.f4275t = userData;
        SharedPreferences sharedPreferences2 = this.f4270o;
        String string2 = sharedPreferences2.getString("userSettingsJson", null);
        if (string2 != null) {
            try {
                u70.o oVar5 = u70.q.f40850b;
                pVar2 = UserSettings.INSTANCE.fromJson(string2);
            } catch (Throwable th3) {
                u70.o oVar6 = u70.q.f40850b;
                pVar2 = new u70.p(th3);
            }
            Throwable thA2 = u70.q.a(pVar2);
            if (thA2 != null) {
                sa0.a.f38953a.d(thA2);
                sharedPreferences2.edit().remove("userSettingsJson").apply();
            }
            userSettings = (UserSettings) (pVar2 instanceof u70.p ? null : pVar2);
        } else {
            userSettings = null;
        }
        this.f4276u = userSettings;
        v80.f0.B(this.f4258b, null, null, new h2(this, cVar2, 0), 3);
        UserData userData2 = this.f4275t;
        if (userData2 != null) {
            ft.c.j0(userData2.m285getUserId8nKqa5U());
            UserSettings userSettings2 = this.f4276u;
            if (userSettings2 != null) {
                mv.u uVar2 = this.f4271p;
                List<FeatureExperiment> featureExperiments = userSettings2.getFeatureExperiments();
                uVar2.getClass();
                featureExperiments.getClass();
                CopyOnWriteArraySet copyOnWriteArraySet = uVar2.f30214a;
                copyOnWriteArraySet.clear();
                copyOnWriteArraySet.addAll(featureExperiments);
                mv.x xVar2 = this.f4272q;
                List<FeatureActivation> featureActivations = userSettings2.getFeatureActivations();
                if (featureActivations != null) {
                    CopyOnWriteArraySet copyOnWriteArraySet2 = xVar2.f30215a;
                    copyOnWriteArraySet2.clear();
                    copyOnWriteArraySet2.addAll(featureActivations);
                } else {
                    xVar2.getClass();
                }
                this.f4263g.a(userData2, userSettings2);
            }
        }
    }

    public static void B(gh.f fVar, gh.c cVar) {
        fVar.f20447c = cVar;
        ft.c.F(n90.c.f30748d.c(gh.f.Companion.serializer(), fVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(z70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ao.z2
            if (r0 == 0) goto L13
            r0 = r5
            ao.z2 r0 = (ao.z2) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.z2 r0 = new ao.z2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4514j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r5)
            u70.q r5 = (u70.q) r5
            java.lang.Object r5 = r5.f40851a
            goto L40
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r5)
            r0.l = r3
            kt.a r5 = r4.f4260d
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            u70.o r0 = u70.q.f40850b
            boolean r0 = r5 instanceof u70.p
            if (r0 != 0) goto L4c
            com.app.tgtg.model.remote.UserSettings r5 = (com.app.tgtg.model.remote.UserSettings) r5
            r0 = 0
            r4.z(r5, r0)
        L4c:
            com.app.tgtg.model.remote.UserSettings r5 = r4.n()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.g3.A(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable C(boolean r5, z70.c r6) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ao.a3
            if (r0 == 0) goto L13
            r0 = r6
            ao.a3 r0 = (ao.a3) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.a3 r0 = new ao.a3
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f4180j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r5 = r6.f40851a
            goto L5a
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            com.app.tgtg.model.remote.UserData r6 = r4.m()
            boolean r6 = r6.wantsNewsletter()
            if (r6 == r5) goto L60
            com.app.tgtg.model.remote.UserData r6 = r4.m()
            r6.setWantsNewsletter(r5)
            cv.b r6 = r4.f4263g
            r6.f(r5)
            com.app.tgtg.model.remote.UserData r5 = r4.m()
            r0.l = r3
            kt.o r6 = r4.f4259c
            java.lang.Object r5 = r6.B(r5, r0)
            if (r5 != r1) goto L5a
            return r1
        L5a:
            u70.q r6 = new u70.q
            r6.<init>(r5)
            return r6
        L60:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.g3.C(boolean, z70.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(boolean r5, z70.c r6) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ao.b3
            if (r0 == 0) goto L13
            r0 = r6
            ao.b3 r0 = (ao.b3) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.b3 r0 = new ao.b3
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f4191j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r5 = r6.f40851a
            goto L52
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            com.app.tgtg.model.remote.UserData r6 = r4.m()
            r6.setWantsPushNotifications(r5)
            cv.b r6 = r4.f4263g
            ev.e r6 = r6.f13429b
            r6.f(r5)
            com.app.tgtg.model.remote.UserData r5 = r4.m()
            r0.l = r3
            kt.o r6 = r4.f4259c
            java.lang.Object r5 = r6.B(r5, r0)
            if (r5 != r1) goto L52
            return r1
        L52:
            u70.o r6 = u70.q.f40850b
            boolean r6 = r5 instanceof u70.p
            if (r6 != 0) goto L5d
            com.app.tgtg.model.remote.UserData r5 = (com.app.tgtg.model.remote.UserData) r5
            r4.u(r5)
        L5d:
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.g3.D(boolean, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(boolean r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ao.c3
            if (r0 == 0) goto L13
            r0 = r6
            ao.c3 r0 = (ao.c3) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.c3 r0 = new ao.c3
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f4205j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r5 = r6.f40851a
            goto L4f
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            com.app.tgtg.model.remote.UserData r6 = r4.f4275t
            if (r6 == 0) goto L51
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r6.setDataSharingOptOut(r5)
            r4.u(r6)
            r0.l = r3
            kt.o r5 = r4.f4259c
            java.lang.Object r5 = r5.B(r6, r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            u70.o r5 = u70.q.f40850b
        L51:
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.g3.E(boolean, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(com.app.tgtg.model.remote.UserData r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ao.d3
            if (r0 == 0) goto L13
            r0 = r6
            ao.d3 r0 = (ao.d3) r0
            int r1 = r0.f4223m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4223m = r1
            goto L18
        L13:
            ao.d3 r0 = new ao.d3
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f4222k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f4223m
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            com.app.tgtg.model.remote.UserData r5 = r0.f4221j
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r6 = r6.f40851a
            goto L44
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L34:
            ba0.g.M(r6)
            r0.f4221j = r5
            r0.f4223m = r3
            kt.o r6 = r4.f4259c
            java.lang.Object r6 = r6.B(r5, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            java.lang.String r5 = r5.getCountryIso()
            java.lang.String r0 = "US"
            boolean r5 = kotlin.text.y.k(r5, r0, r3)
            mv.b r0 = r4.l
            r0.f30151b = r5
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.g3.F(com.app.tgtg.model.remote.UserData, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(z70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ao.e3
            if (r0 == 0) goto L13
            r0 = r5
            ao.e3 r0 = (ao.e3) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.e3 r0 = new ao.e3
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4237j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r5)
            u70.q r5 = (u70.q) r5
            java.lang.Object r5 = r5.f40851a
            goto L40
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r5)
            r0.l = r3
            kt.a r5 = r4.f4260d
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            u70.o r0 = u70.q.f40850b
            boolean r0 = r5 instanceof u70.p
            if (r0 != 0) goto L4d
            r0 = r5
            com.app.tgtg.model.remote.UserSettings r0 = (com.app.tgtg.model.remote.UserSettings) r0
            r1 = 0
            r4.z(r0, r1)
        L4d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.g3.G(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(java.lang.String r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ao.f3
            if (r0 == 0) goto L13
            r0 = r6
            ao.f3 r0 = (ao.f3) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.f3 r0 = new ao.f3
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f4246j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r5 = r6.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            r0.l = r3
            kt.o r6 = r4.f4259c
            java.lang.Object r5 = r6.A(r5, r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.g3.H(java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, java.lang.String r12, java.lang.Boolean r13, java.lang.Boolean r14, z70.c r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof ao.i2
            if (r0 == 0) goto L13
            r0 = r15
            ao.i2 r0 = (ao.i2) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.i2 r0 = new ao.i2
            r0.<init>(r10, r15)
        L18:
            java.lang.Object r15 = r0.f4314j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2c
            ba0.g.M(r15)
            u70.q r15 = (u70.q) r15
            r15.getClass()
            goto L4c
        L2c:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r11)
            r11 = 0
            return r11
        L33:
            ba0.g.M(r15)
            com.app.tgtg.model.remote.item.requests.ConsentScreenEventRequest r4 = new com.app.tgtg.model.remote.item.requests.ConsentScreenEventRequest
            java.lang.String r6 = "AFTER_COOKIE_CONSENT"
            r5 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            r0.l = r3
            kt.n r11 = r10.f4261e
            java.lang.Object r11 = r11.a(r4, r0)
            if (r11 != r1) goto L4c
            return r1
        L4c:
            kotlin.Unit r11 = kotlin.Unit.f26487a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.g3.a(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r11, java.lang.String r12, java.lang.Boolean r13, java.lang.Boolean r14, z70.c r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof ao.j2
            if (r0 == 0) goto L13
            r0 = r15
            ao.j2 r0 = (ao.j2) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.j2 r0 = new ao.j2
            r0.<init>(r10, r15)
        L18:
            java.lang.Object r15 = r0.f4323j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2c
            ba0.g.M(r15)
            u70.q r15 = (u70.q) r15
            r15.getClass()
            goto L4c
        L2c:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r11)
            r11 = 0
            return r11
        L33:
            ba0.g.M(r15)
            com.app.tgtg.model.remote.item.requests.ConsentScreenEventRequest r4 = new com.app.tgtg.model.remote.item.requests.ConsentScreenEventRequest
            java.lang.String r6 = "BEFORE_COOKIE_CONSENT"
            r5 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            r0.l = r3
            kt.n r11 = r10.f4261e
            java.lang.Object r11 = r11.a(r4, r0)
            if (r11 != r1) goto L4c
            return r1
        L4c:
            kotlin.Unit r11 = kotlin.Unit.f26487a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.g3.b(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.app.tgtg.model.remote.privacy.DeleteUserRequest r7, z70.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ao.k2
            if (r0 == 0) goto L13
            r0 = r8
            ao.k2 r0 = (ao.k2) r0
            int r1 = r0.f4336m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4336m = r1
            goto L18
        L13:
            ao.k2 r0 = new ao.k2
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f4335k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f4336m
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            java.lang.Object r7 = r0.f4334j
            ba0.g.M(r8)
            return r7
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            return r3
        L33:
            ba0.g.M(r8)
            u70.q r8 = (u70.q) r8
            java.lang.Object r7 = r8.f40851a
            goto L51
        L3b:
            ba0.g.M(r8)
            com.app.tgtg.model.remote.UserData r8 = r6.m()
            java.lang.String r8 = r8.m285getUserId8nKqa5U()
            r0.f4336m = r5
            kt.o r2 = r6.f4259c
            java.lang.Object r7 = r2.d(r8, r7, r0)
            if (r7 != r1) goto L51
            goto L71
        L51:
            u70.o r8 = u70.q.f40850b
            boolean r8 = r7 instanceof u70.p
            if (r8 != 0) goto L72
            r8 = r7
            q90.r0 r8 = (q90.r0) r8
            ft.o r8 = r6.f4267k
            r8.getClass()
            ft.l r2 = new ft.l
            r2.<init>(r8, r3, r4)
            v80.f0.F(r2)
            r0.f4334j = r7
            r0.f4336m = r4
            java.lang.Object r8 = r6.s(r0)
            if (r8 != r1) goto L72
        L71:
            return r1
        L72:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.g3.c(com.app.tgtg.model.remote.privacy.DeleteUserRequest, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.app.tgtg.model.remote.privacy.ExportUserRequest r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ao.l2
            if (r0 == 0) goto L13
            r0 = r6
            ao.l2 r0 = (ao.l2) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.l2 r0 = new ao.l2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f4343j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r5 = r6.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            com.app.tgtg.model.remote.UserData r6 = r4.m()
            java.lang.String r6 = r6.m285getUserId8nKqa5U()
            r0.l = r3
            kt.o r2 = r4.f4259c
            java.lang.Object r5 = r2.k(r6, r5, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.g3.d(com.app.tgtg.model.remote.privacy.ExportUserRequest, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(z70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ao.m2
            if (r0 == 0) goto L13
            r0 = r5
            ao.m2 r0 = (ao.m2) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.m2 r0 = new ao.m2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4363j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r5)
            u70.q r5 = (u70.q) r5
            java.lang.Object r5 = r5.f40851a
            goto L40
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r5)
            r0.l = r3
            kt.o r5 = r4.f4259c
            java.lang.Object r5 = r5.o(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            u70.o r0 = u70.q.f40850b
            boolean r0 = r5 instanceof u70.p
            if (r0 != 0) goto L4d
            r0 = r5
            com.app.tgtg.model.remote.UserData r0 = (com.app.tgtg.model.remote.UserData) r0
            r1 = 0
            r4.y(r0, r1)
        L4d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.g3.e(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(z70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ao.n2
            if (r0 == 0) goto L13
            r0 = r5
            ao.n2 r0 = (ao.n2) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.n2 r0 = new ao.n2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4375j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r5)
            u70.q r5 = (u70.q) r5
            java.lang.Object r5 = r5.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r5)
            r0.l = r3
            kt.o r5 = r4.f4259c
            java.lang.Object r5 = r5.t(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.g3.f(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(z70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ao.o2
            if (r0 == 0) goto L13
            r0 = r5
            ao.o2 r0 = (ao.o2) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.o2 r0 = new ao.o2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4385j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r5)
            u70.q r5 = (u70.q) r5
            java.lang.Object r5 = r5.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r5)
            r0.l = r3
            kt.o r5 = r4.f4259c
            java.lang.Object r5 = r5.j(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.g3.g(z70.c):java.lang.Object");
    }

    public final String h() {
        return m().getCountryIso();
    }

    public final int i() {
        String lastSuccessfulOrderDate = n().getLastSuccessfulOrderDate();
        if (lastSuccessfulOrderDate != null) {
            return Math.abs((int) mv.p0.a(mv.p0.h(lastSuccessfulOrderDate), true));
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(z70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ao.q2
            if (r0 == 0) goto L13
            r0 = r5
            ao.q2 r0 = (ao.q2) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.q2 r0 = new ao.q2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4409j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r5)
            u70.q r5 = (u70.q) r5
            java.lang.Object r5 = r5.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r5)
            r0.l = r3
            kt.o r5 = r4.f4259c
            java.lang.Object r5 = r5.l(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.g3.j(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(z70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ao.r2
            if (r0 == 0) goto L13
            r0 = r5
            ao.r2 r0 = (ao.r2) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.r2 r0 = new ao.r2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4438j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r5)
            u70.q r5 = (u70.q) r5
            java.lang.Object r5 = r5.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r5)
            r0.l = r3
            kt.o r5 = r4.f4259c
            java.lang.Object r5 = r5.r(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.g3.k(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ao.s2
            if (r0 == 0) goto L13
            r0 = r6
            ao.s2 r0 = (ao.s2) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.s2 r0 = new ao.s2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f4450j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r5 = r6.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            r0.l = r3
            kt.o r6 = r4.f4259c
            java.lang.Object r5 = r6.g(r5, r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.g3.l(java.lang.String, z70.c):java.lang.Object");
    }

    public final UserData m() throws Exception {
        try {
            UserData userData = this.f4275t;
            userData.getClass();
            return userData;
        } catch (Exception e5) {
            ft.o oVar = this.f4267k;
            if (!oVar.a()) {
                throw new Exception("Not authenticated no user", e5);
            }
            v80.f0.E(kotlin.coroutines.g.f26549a, new ft.l(oVar, null, 2));
            throw new Exception("Authenticated but no user", e5);
        }
    }

    public final UserSettings n() {
        UserSettings userSettings = this.f4276u;
        if (userSettings != null) {
            return userSettings;
        }
        return new UserSettings((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (LatLngInfo) null, (LatLngInfo) null, (String) null, (String) null, (String) null, false, false, false, false, (String) null, false, false, false, 0, false, false, (List) null, (List) null, false, (String) null, false, (List) null, (Integer) null, (LoyaltyCardResponse) null, (String) null, (C2CReferralResponse) null, (gh.f) null, (String) null, (UserType) null, (String) null, false, (RewardSurveyInfo) null, (String) null, false, false, false, (CharityUserDetails) null, (String) null, false, -1, 262143, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(z70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ao.t2
            if (r0 == 0) goto L13
            r0 = r5
            ao.t2 r0 = (ao.t2) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.t2 r0 = new ao.t2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4458j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2c
            ba0.g.M(r5)
            u70.q r5 = (u70.q) r5
            r5.getClass()
            goto L3f
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L33:
            ba0.g.M(r5)
            r0.l = r3
            java.lang.Object r5 = r4.G(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            boolean r5 = r4.x()
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.g3.o(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.String r5, java.lang.String r6, java.lang.String r7, z70.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof ao.u2
            if (r0 == 0) goto L13
            r0 = r8
            ao.u2 r0 = (ao.u2) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.u2 r0 = new ao.u2
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f4466j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2c
            ba0.g.M(r8)
            u70.q r8 = (u70.q) r8
            r8.getClass()
            goto L4c
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L33:
            ba0.g.M(r8)
            com.app.tgtg.model.remote.user.requests.LinkC2CReferralCodeRequest r8 = new com.app.tgtg.model.remote.user.requests.LinkC2CReferralCodeRequest
            java.lang.String r2 = r4.f4269n
            com.app.tgtg.model.remote.user.response.C2CReferralType r6 = com.app.tgtg.model.remote.user.response.C2CReferralType.valueOf(r6)
            r8.<init>(r5, r7, r2, r6)
            r0.l = r3
            kt.o r5 = r4.f4259c
            java.lang.Object r5 = r5.c(r8, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.g3.p(java.lang.String, java.lang.String, java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.String r27, z70.c r28) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            boolean r3 = r2 instanceof ao.v2
            if (r3 == 0) goto L19
            r3 = r2
            ao.v2 r3 = (ao.v2) r3
            int r4 = r3.f4479m
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f4479m = r4
            goto L1e
        L19:
            ao.v2 r3 = new ao.v2
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f4478k
            y70.a r4 = y70.a.COROUTINE_SUSPENDED
            int r5 = r3.f4479m
            r6 = 1
            if (r5 == 0) goto L3b
            if (r5 != r6) goto L34
            java.lang.String r1 = r3.f4477j
            ba0.g.M(r2)
            u70.q r2 = (u70.q) r2
            java.lang.Object r2 = r2.f40851a
        L32:
            r8 = r1
            goto L50
        L34:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r1)
            r1 = 0
            return r1
        L3b:
            ba0.g.M(r2)
            com.app.tgtg.model.remote.user.requests.EmailChangeRequest r2 = new com.app.tgtg.model.remote.user.requests.EmailChangeRequest
            r2.<init>(r1)
            r3.f4477j = r1
            r3.f4479m = r6
            kt.o r5 = r0.f4259c
            java.lang.Object r2 = r5.n(r2, r3)
            if (r2 != r4) goto L32
            return r4
        L50:
            u70.o r1 = u70.q.f40850b
            boolean r1 = r2 instanceof u70.p
            if (r1 != 0) goto L82
            r1 = r2
            q90.r0 r1 = (q90.r0) r1
            com.app.tgtg.model.remote.UserData r5 = r0.m()
            r24 = 262139(0x3fffb, float:3.67335E-40)
            r25 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            com.app.tgtg.model.remote.UserData r1 = com.app.tgtg.model.remote.UserData.m281copyW558gQQ$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0.u(r1)
        L82:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.g3.q(java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(ll.e r5, z70.c r6) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ao.w2
            if (r0 == 0) goto L13
            r0 = r6
            ao.w2 r0 = (ao.w2) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.w2 r0 = new ao.w2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f4484j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r5 = r6.f40851a
            goto L4c
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            com.app.tgtg.model.remote.UserData r6 = r4.m()
            ll.e r2 = ll.e.SIGNUP
            if (r5 != r2) goto L41
            r5 = 0
            r6.setUserAddresses(r5)
        L41:
            r0.l = r3
            kt.o r5 = r4.f4259c
            java.lang.Object r5 = r5.B(r6, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            com.app.tgtg.model.remote.UserData r6 = r4.m()
            java.lang.String r6 = r6.getCountryIso()
            java.lang.String r0 = "US"
            boolean r6 = kotlin.text.y.k(r6, r0, r3)
            mv.b r0 = r4.l
            r0.f30151b = r6
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.g3.r(ll.e, z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x010c, code lost:
    
        if (r11 != r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(z70.c r11) throws java.security.NoSuchAlgorithmException, java.io.IOException, java.security.KeyStoreException, java.security.cert.CertificateException {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.g3.s(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(z70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ao.y2
            if (r0 == 0) goto L13
            r0 = r5
            ao.y2 r0 = (ao.y2) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.y2 r0 = new ao.y2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4502j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r5)
            u70.q r5 = (u70.q) r5
            java.lang.Object r5 = r5.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r5)
            r0.l = r3
            kt.o r5 = r4.f4259c
            java.lang.Object r5 = r5.x(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.g3.t(z70.c):java.lang.Object");
    }

    public final void u(UserData userData) {
        Object pVar;
        Unit unit;
        if (userData != null) {
            userData.setWantsPushNotifications(this.f4268m.areNotificationsEnabled());
        }
        this.f4275t = userData;
        SharedPreferences sharedPreferences = this.f4270o;
        if (userData != null) {
            ft.c.j0(userData.m285getUserId8nKqa5U());
            try {
                u70.o oVar = u70.q.f40850b;
                pVar = userData.toJson();
            } catch (Throwable th2) {
                u70.o oVar2 = u70.q.f40850b;
                pVar = new u70.p(th2);
            }
            if (pVar instanceof u70.p) {
                pVar = null;
            }
            String str = (String) pVar;
            if (str != null) {
                sharedPreferences.edit().putString("currentUser", str).apply();
                unit = Unit.f26487a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        sharedPreferences.edit().putString("currentUser", null).apply();
        ft.c.j0(null);
    }

    public final void v(UserSettings userSettings) {
        Object pVar;
        Unit unit;
        this.f4276u = userSettings;
        SharedPreferences sharedPreferences = this.f4270o;
        if (userSettings != null) {
            try {
                u70.o oVar = u70.q.f40850b;
                pVar = userSettings.toJson();
            } catch (Throwable th2) {
                u70.o oVar2 = u70.q.f40850b;
                pVar = new u70.p(th2);
            }
            if (pVar instanceof u70.p) {
                pVar = null;
            }
            String str = (String) pVar;
            if (str != null) {
                sharedPreferences.edit().putString("userSettingsJson", str).apply();
                unit = Unit.f26487a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        sharedPreferences.edit().putString("userSettingsJson", null).apply();
    }

    public final boolean w() {
        return kotlin.text.y.k(m().getCountryIso(), "GB", true);
    }

    public final boolean x() {
        if (n().getShouldVerifyEmail()) {
            return true;
        }
        if (!n().getHasActiveEmailChangeRequest()) {
            return false;
        }
        String panicMessage = n().getPanicMessage();
        return panicMessage == null || panicMessage.length() == 0 || this.f4278w;
    }

    public final void y(UserData userData, boolean z11) {
        userData.getClass();
        u(userData);
        this.l.f30151b = kotlin.text.y.k(userData.getCountryIso(), "US", true);
        if (z11) {
            v80.f0.B(this.f4258b, null, null, new a3.x(this, userData, null, 11), 3);
        }
    }

    public final void z(UserSettings userSettings, boolean z11) {
        userSettings.getClass();
        UserSettings userSettingsN = n();
        if (userSettingsN.getShowManufacturerItems() != userSettings.getShowManufacturerItems() && this.f4277v != null) {
            boolean showManufacturerItems = userSettings.getShowManufacturerItems();
            boolean z12 = userSettingsN.getUseManufacturerBasketFlow() != userSettings.getUseManufacturerBasketFlow();
            a50.c cVar = this.f4277v;
            if (cVar != null) {
                Boolean boolValueOf = Boolean.valueOf(z12);
                MainActivity mainActivity = (MainActivity) cVar.f822b;
                mainActivity.runOnUiThread(new com.google.firebase.messaging.v(mainActivity, showManufacturerItems, boolValueOf, 2));
            }
        }
        List<FeatureExperiment> featureExperiments = userSettings.getFeatureExperiments();
        mv.u uVar = this.f4271p;
        uVar.getClass();
        featureExperiments.getClass();
        CopyOnWriteArraySet copyOnWriteArraySet = uVar.f30214a;
        copyOnWriteArraySet.clear();
        copyOnWriteArraySet.addAll(featureExperiments);
        List<FeatureActivation> featureActivations = userSettings.getFeatureActivations();
        mv.x xVar = this.f4272q;
        if (featureActivations != null) {
            CopyOnWriteArraySet copyOnWriteArraySet2 = xVar.f30215a;
            copyOnWriteArraySet2.clear();
            copyOnWriteArraySet2.addAll(featureActivations);
        } else {
            xVar.getClass();
        }
        v(userSettings);
        if (z11) {
            ft.c.J(userSettings.isBusiness());
        }
    }
}
