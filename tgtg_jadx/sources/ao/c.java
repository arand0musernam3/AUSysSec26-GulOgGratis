package ao;

import android.content.SharedPreferences;
import com.app.tgtg.model.remote.AppSettings;
import com.app.tgtg.model.remote.Country;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f4193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kt.a f4194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y80.a2 f4195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y80.h1 f4196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppSettings f4197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final at.o f4198f;

    public c(SharedPreferences sharedPreferences, kt.a aVar) {
        Object pVar;
        AppSettings appSettings;
        aVar.getClass();
        this.f4193a = sharedPreferences;
        this.f4194b = aVar;
        x70.c cVar = null;
        y80.a2 a2VarC = y80.r.c(null);
        this.f4195c = a2VarC;
        this.f4196d = new y80.h1(a2VarC);
        String string = sharedPreferences.getString("appSettings", null);
        if (string != null) {
            try {
                u70.o oVar = u70.q.f40850b;
                pVar = AppSettings.INSTANCE.fromJson(string);
            } catch (Throwable th2) {
                u70.o oVar2 = u70.q.f40850b;
                pVar = new u70.p(th2);
            }
            Throwable thA = u70.q.a(pVar);
            if (thA != null) {
                sa0.a.f38953a.d(thA);
                sharedPreferences.edit().remove("appSettings").apply();
            }
            appSettings = (AppSettings) (pVar instanceof u70.p ? null : pVar);
        } else {
            appSettings = null;
        }
        this.f4197e = appSettings;
        this.f4198f = new at.o(new a3.x1(this, cVar, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(z70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ao.a
            if (r0 == 0) goto L13
            r0 = r5
            ao.a r0 = (ao.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.a r0 = new ao.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4172j
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
            kt.a r5 = r4.f4194b
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            java.lang.Throwable r0 = u70.q.a(r5)
            if (r0 != 0) goto L4c
            com.app.tgtg.model.remote.AppSettings r5 = (com.app.tgtg.model.remote.AppSettings) r5
            r4.d(r5)
            return r5
        L4c:
            com.app.tgtg.model.remote.AppSettings r5 = r4.f4197e
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.c.a(z70.c):java.lang.Object");
    }

    public final boolean b(String str) {
        ArrayList<Country> countries;
        AppSettings appSettings = this.f4197e;
        if (appSettings == null || (countries = appSettings.getCountries()) == null) {
            return true;
        }
        for (Country country : countries) {
            if (kotlin.text.y.k(country.getIso(), str, false)) {
                return country.getPromptForNewOptIn();
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ao.b
            if (r0 == 0) goto L13
            r0 = r6
            ao.b r0 = (ao.b) r0
            int r1 = r0.f4184m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4184m = r1
            goto L18
        L13:
            ao.b r0 = new ao.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f4183k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f4184m
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            java.lang.String r5 = r0.f4182j
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r6 = r6.f40851a
            goto L49
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L34:
            ba0.g.M(r6)
            com.app.tgtg.model.remote.token.PushToken r6 = new com.app.tgtg.model.remote.token.PushToken
            r6.<init>(r5)
            r0.f4182j = r5
            r0.f4184m = r3
            kt.a r2 = r4.f4194b
            java.lang.Object r6 = r2.b(r6, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            u70.o r0 = u70.q.f40850b
            boolean r0 = r6 instanceof u70.p
            if (r0 != 0) goto L54
            q90.r0 r6 = (q90.r0) r6
            ft.c.c0(r5)
        L54:
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.c.c(java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(com.app.tgtg.model.remote.AppSettings r8) {
        /*
            r7 = this;
            r7.f4197e = r8
            java.lang.String r0 = "appSettings"
            android.content.SharedPreferences r1 = r7.f4193a
            r2 = 0
            if (r8 == 0) goto L34
            u70.o r3 = u70.q.f40850b     // Catch: java.lang.Throwable -> L10
            java.lang.String r8 = r8.toJson()     // Catch: java.lang.Throwable -> L10
            goto L19
        L10:
            r8 = move-exception
            u70.o r3 = u70.q.f40850b
            u70.p r3 = new u70.p
            r3.<init>(r8)
            r8 = r3
        L19:
            boolean r3 = r8 instanceof u70.p
            if (r3 == 0) goto L1f
            r8 = r2
        L1f:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L31
            android.content.SharedPreferences$Editor r3 = r1.edit()
            android.content.SharedPreferences$Editor r8 = r3.putString(r0, r8)
            r8.apply()
            kotlin.Unit r8 = kotlin.Unit.f26487a
            goto L32
        L31:
            r8 = r2
        L32:
            if (r8 != 0) goto L3f
        L34:
            android.content.SharedPreferences$Editor r8 = r1.edit()
            android.content.SharedPreferences$Editor r8 = r8.putString(r0, r2)
            r8.apply()
        L3f:
            com.app.tgtg.model.remote.AppSettings r8 = r7.f4197e
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L55
            java.lang.String r8 = r8.getOnAppOpenMessage()
            if (r8 == 0) goto L55
            java.lang.String r3 = "blocking"
            boolean r8 = r8.equalsIgnoreCase(r3)
            if (r8 != r1) goto L55
            r8 = r1
            goto L56
        L55:
            r8 = r0
        L56:
            com.app.tgtg.model.remote.AppSettings r3 = r7.f4197e
            if (r3 == 0) goto L82
            java.lang.String r3 = r3.getOpenMessageUrl()
            if (r3 == 0) goto L82
            int r4 = r3.length()
            if (r4 <= 0) goto L82
            android.content.SharedPreferences r4 = ft.e.f17922c
            if (r4 != 0) goto L70
            java.lang.String r4 = "appDataStorage"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r4 = r2
        L70:
            java.lang.String r5 = "lastSeenServerMessageUrl"
            java.lang.String r6 = ""
            java.lang.String r4 = r4.getString(r5, r6)
            r4.getClass()
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 != 0) goto L82
            r0 = r1
        L82:
            if (r8 != 0) goto L86
            if (r0 == 0) goto L94
        L86:
            ft.a r0 = new ft.a
            com.app.tgtg.model.remote.AppSettings r1 = r7.f4197e
            if (r1 == 0) goto L90
            java.lang.String r2 = r1.getOpenMessageUrl()
        L90:
            r0.<init>(r8, r2)
            r2 = r0
        L94:
            y80.a2 r8 = r7.f4195c
            r8.j(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.c.d(com.app.tgtg.model.remote.AppSettings):void");
    }
}
