package ao;

import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
import com.app.tgtg.model.remote.FeatureExperiment;
import com.app.tgtg.model.remote.UserData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v80.b0 f4281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kt.a f4282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g3 f4283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f4284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final et.z f4285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f4286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m0 f4287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final gs.a f4288i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final rg.d f4289j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ft.s f4290k;
    public final cv.b l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final NotificationManagerCompat f4291m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4292n;

    public h(Context context, v80.b0 b0Var, kt.a aVar, g3 g3Var, v vVar, et.z zVar, c cVar, m0 m0Var, gs.a aVar2, rg.d dVar, ft.s sVar, cv.b bVar, NotificationManagerCompat notificationManagerCompat) {
        b0Var.getClass();
        aVar.getClass();
        g3Var.getClass();
        vVar.getClass();
        zVar.getClass();
        cVar.getClass();
        m0Var.getClass();
        aVar2.getClass();
        dVar.getClass();
        sVar.getClass();
        bVar.getClass();
        this.f4280a = context;
        this.f4281b = b0Var;
        this.f4282c = aVar;
        this.f4283d = g3Var;
        this.f4284e = vVar;
        this.f4285f = zVar;
        this.f4286g = cVar;
        this.f4287h = m0Var;
        this.f4288i = aVar2;
        this.f4289j = dVar;
        this.f4290k = sVar;
        this.l = bVar;
        this.f4291m = notificationManagerCompat;
        this.f4292n = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x015b, code lost:
    
        if (r13 != r1) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d6 A[Catch: all -> 0x006f, PHI: r2 r3 r12 r13
      0x00d6: PHI (r2v13 java.lang.Object) = (r2v10 java.lang.Object), (r2v16 java.lang.Object) binds: [B:46:0x00d2, B:33:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r3v5 ??) = (r3v9 ??), (r3v10 ??) binds: [B:46:0x00d2, B:33:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r12v16 ??) = (r12v36 ??), (r12v18 ??) binds: [B:46:0x00d2, B:33:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r13v34 int) = (r13v30 int), (r13v39 int) binds: [B:46:0x00d2, B:33:0x0081] A[DONT_GENERATE, DONT_INLINE], TryCatch #6 {all -> 0x006f, blocks: (B:27:0x006a, B:51:0x00ec, B:48:0x00d6, B:45:0x00c0, B:41:0x00ab), top: B:93:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0136 A[Catch: SSLException -> 0x013c, TRY_LEAVE, TryCatch #5 {SSLException -> 0x013c, blocks: (B:67:0x0130, B:69:0x0136), top: B:96:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.common.GoogleApiAvailability, com.google.android.gms.common.a] */
    /* JADX WARN: Type inference failed for: r12v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r12v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r13v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r2v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2, types: [ao.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [ao.h] */
    /* JADX WARN: Type inference failed for: r3v9 */
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
    public final java.lang.Object a(boolean r12, z70.c r13) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.h.a(boolean, z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0121, code lost:
    
        if (kotlin.Unit.f26487a == r1) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bb A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:14:0x002f, B:76:0x0124, B:21:0x0043, B:71:0x0108, B:73:0x010e, B:24:0x0050, B:62:0x00e9, B:64:0x00ef, B:66:0x00f5, B:27:0x005d, B:51:0x00b5, B:53:0x00bb, B:55:0x00c6, B:56:0x00cd, B:30:0x0067, B:33:0x006f, B:34:0x0075, B:36:0x007b, B:37:0x0080, B:39:0x0086, B:42:0x0090, B:45:0x00a5), top: B:80:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ef A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:14:0x002f, B:76:0x0124, B:21:0x0043, B:71:0x0108, B:73:0x010e, B:24:0x0050, B:62:0x00e9, B:64:0x00ef, B:66:0x00f5, B:27:0x005d, B:51:0x00b5, B:53:0x00bb, B:55:0x00c6, B:56:0x00cd, B:30:0x0067, B:33:0x006f, B:34:0x0075, B:36:0x007b, B:37:0x0080, B:39:0x0086, B:42:0x0090, B:45:0x00a5), top: B:80:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010e A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:14:0x002f, B:76:0x0124, B:21:0x0043, B:71:0x0108, B:73:0x010e, B:24:0x0050, B:62:0x00e9, B:64:0x00ef, B:66:0x00f5, B:27:0x005d, B:51:0x00b5, B:53:0x00bb, B:55:0x00c6, B:56:0x00cd, B:30:0x0067, B:33:0x006f, B:34:0x0075, B:36:0x007b, B:37:0x0080, B:39:0x0086, B:42:0x0090, B:45:0x00a5), top: B:80:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
    public final java.lang.Object b(com.app.tgtg.model.remote.user.response.StartupResponse r13, boolean r14, z70.c r15) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.h.b(com.app.tgtg.model.remote.user.response.StartupResponse, boolean, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(z70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ao.f
            if (r0 == 0) goto L13
            r0 = r5
            ao.f r0 = (ao.f) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.f r0 = new ao.f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4239j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r5)
            u70.q r5 = (u70.q) r5
            java.lang.Object r5 = r5.f40851a
            goto L41
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r5)
            r4.f4292n = r3
            r0.l = r3
            r5 = 0
            java.lang.Object r5 = r4.a(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            u70.o r0 = u70.q.f40850b
            boolean r5 = r5 instanceof u70.p
            r0 = r5 ^ 1
            if (r5 != 0) goto L4e
            rg.d r5 = r4.f4289j
            r5.c()
        L4e:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.h.c(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(z70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ao.g
            if (r0 == 0) goto L13
            r0 = r5
            ao.g r0 = (ao.g) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.g r0 = new ao.g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4248j
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
            r4.f4292n = r3
            r0.l = r3
            java.lang.Object r5 = r4.a(r3, r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            u70.o r0 = u70.q.f40850b
            boolean r0 = r5 instanceof u70.p
            if (r0 != 0) goto L4b
            rg.d r0 = r4.f4289j
            r0.c()
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.h.d(z70.c):java.lang.Object");
    }

    public final void e() {
        List<FeatureExperiment> featureExperiments = this.f4283d.n().getFeatureExperiments();
        ArrayList<FeatureExperiment> arrayList = new ArrayList();
        Iterator<T> it = featureExperiments.iterator();
        while (true) {
            boolean z11 = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            FeatureExperiment featureExperiment = (FeatureExperiment) next;
            String name = featureExperiment.getName();
            if ((name != null ? StringsKt.z(name, "apptrk", false) : false) && !Intrinsics.areEqual(featureExperiment.getVariant(), "none")) {
                z11 = true;
            }
            if (z11) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        cv.b bVar = this.l;
        bVar.getClass();
        ev.a aVar = bVar.f13428a;
        aVar.getClass();
        if (!aVar.f16481d) {
            sa0.a.f38953a.i("Not tracking to Amplitude", new Object[0]);
            return;
        }
        oz.m mVar = new oz.m(5);
        for (FeatureExperiment featureExperiment2 : arrayList) {
            String name2 = featureExperiment2.getName();
            if (name2 != null) {
                if (Intrinsics.areEqual(featureExperiment2.getVariant(), "unset_this_property")) {
                    String name3 = featureExperiment2.getName();
                    name3.getClass();
                    mVar.z(pf.c.UNSET, name3, "-");
                    ye.b bVarB = aVar.b();
                    if (bVarB != null) {
                        ye.b.h(bVarB, mVar);
                    }
                } else {
                    String variant = featureExperiment2.getVariant();
                    if (variant == null) {
                        variant = "";
                    }
                    mVar.z(pf.c.SET, name2, variant);
                }
            }
        }
        try {
            ye.b bVarB2 = aVar.b();
            if (bVarB2 != null) {
                ye.b.h(bVarB2, mVar);
            }
        } catch (Throwable th2) {
            aVar.f16481d = false;
            aVar.f16482e = null;
            aVar.f16483f = null;
            sa0.a.f38953a.d(th2);
        }
    }

    public final boolean f(UserData userData, boolean z11) throws Throwable {
        ft.s sVar = this.f4290k;
        sVar.getClass();
        boolean z12 = true;
        boolean z13 = false;
        if (!z11) {
            Boolean dataSharingOptOut = userData.getDataSharingOptOut();
            dataSharingOptOut.getClass();
            if (dataSharingOptOut.booleanValue() && sVar.a()) {
                v80.f0.E(kotlin.coroutines.g.f26549a, new a3.f3(sVar, z13, null, 4));
            }
        } else if (Intrinsics.areEqual(userData.getDataSharingOptOut(), Boolean.valueOf(sVar.a()))) {
            userData.setDataSharingOptOut(Boolean.valueOf(!sVar.a()));
            z13 = true;
        }
        boolean zAreNotificationsEnabled = this.f4291m.areNotificationsEnabled();
        boolean zWantsPushNotifications = userData.wantsPushNotifications();
        cv.b bVar = this.l;
        if (zAreNotificationsEnabled != zWantsPushNotifications) {
            userData.setWantsPushNotifications(zAreNotificationsEnabled);
            bVar.f13429b.f(zAreNotificationsEnabled);
        } else {
            z12 = z13;
        }
        if (!sVar.a()) {
            bVar.f13430c.b();
        }
        bVar.f13429b.a(bVar.f13434g);
        return z12;
    }
}
