package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import c50.g1;
import c50.i;
import c50.m;
import c50.n0;
import c50.r;
import c50.s;
import c50.t;
import c50.u;
import c50.v0;
import c50.w;
import c50.x;
import c50.x0;
import c50.y;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.d0;
import kotlin.coroutines.CoroutineContext;
import o00.h0;
import org.jetbrains.annotations.NotNull;
import p30.g;
import t30.a;
import t30.b;
import ty.f;
import u30.c;
import u30.o;
import u40.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lu30/b;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", "c50/x", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    @NotNull
    public static final String LIBRARY_NAME = "fire-sessions";

    @NotNull
    private static final x Companion = new x();

    @NotNull
    private static final o appContext = o.a(Context.class);

    @NotNull
    private static final o firebaseApp = o.a(g.class);

    @NotNull
    private static final o firebaseInstallationsApi = o.a(e.class);

    @NotNull
    private static final o backgroundDispatcher = new o(a.class, v80.x.class);

    @NotNull
    private static final o blockingDispatcher = new o(b.class, v80.x.class);

    @NotNull
    private static final o transportFactory = o.a(f.class);

    @NotNull
    private static final o firebaseSessionsComponent = o.a(r.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final c50.o getComponents$lambda$0(c cVar) {
        return (c50.o) ((i) ((r) cVar.e(firebaseSessionsComponent))).f7588p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r getComponents$lambda$1(c cVar) {
        Object objE = cVar.e(appContext);
        objE.getClass();
        Object objE2 = cVar.e(backgroundDispatcher);
        objE2.getClass();
        Object objE3 = cVar.e(blockingDispatcher);
        objE3.getClass();
        Object objE4 = cVar.e(firebaseApp);
        objE4.getClass();
        Object objE5 = cVar.e(firebaseInstallationsApi);
        objE5.getClass();
        t40.b bVarG = cVar.g(transportFactory);
        bVarG.getClass();
        i iVar = new i();
        iVar.f7574a = n0.a((g) objE4);
        n0 n0VarA = n0.a((Context) objE);
        iVar.f7575b = n0VarA;
        iVar.f7576c = e50.a.a(new m(n0VarA, 2));
        iVar.f7577d = e50.a.a(u.f7632a);
        iVar.f7578e = n0.a((e) objE5);
        iVar.f7579f = e50.a.a(new m(iVar.f7574a, 1));
        n0 n0VarA2 = n0.a((CoroutineContext) objE3);
        iVar.f7580g = n0VarA2;
        iVar.f7581h = e50.a.a(new s(iVar.f7579f, n0VarA2));
        iVar.f7582i = n0.a((CoroutineContext) objE2);
        iVar.f7583j = e50.a.a(new x0(iVar.f7576c, e50.a.a(new v0(iVar.f7577d, iVar.f7578e, iVar.f7579f, iVar.f7581h, e50.a.a(new t(iVar.f7582i, iVar.f7577d, e50.a.a(new s(iVar.f7575b, iVar.f7580g, 0)))))), 1));
        e50.c cVarA = e50.a.a(u.f7633b);
        iVar.f7584k = cVarA;
        iVar.l = e50.a.a(new x0(iVar.f7577d, cVarA, 0));
        int i11 = 0;
        iVar.f7585m = e50.a.a(new v0(iVar.f7574a, iVar.f7578e, iVar.f7583j, e50.a.a(new m(n0.a(bVarG), i11)), iVar.f7582i));
        iVar.f7586n = e50.a.a(new t(iVar.f7575b, iVar.f7580g, e50.a.a(new n0(iVar.l, i11))));
        e50.c cVarA2 = e50.a.a(new g1(iVar.f7583j, iVar.l, iVar.f7585m, iVar.f7577d, iVar.f7586n, e50.a.a(new s(iVar.f7575b, iVar.f7584k, 1)), iVar.f7582i));
        iVar.f7587o = cVarA2;
        iVar.f7588p = e50.a.a(new y(iVar.f7574a, iVar.f7583j, iVar.f7582i, e50.a.a(new n0(cVarA2, 1))));
        return iVar;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<u30.b> getComponents() {
        u30.a aVarA = u30.b.a(c50.o.class);
        aVarA.f40663a = LIBRARY_NAME;
        aVarA.a(u30.i.b(firebaseSessionsComponent));
        aVarA.f40668f = new ax.y(29);
        aVarA.c(2);
        u30.b bVarB = aVarA.b();
        u30.a aVarA2 = u30.b.a(r.class);
        aVarA2.f40663a = "fire-sessions-component";
        aVarA2.a(u30.i.b(appContext));
        aVarA2.a(u30.i.b(backgroundDispatcher));
        aVarA2.a(u30.i.b(blockingDispatcher));
        aVarA2.a(u30.i.b(firebaseApp));
        aVarA2.a(u30.i.b(firebaseInstallationsApi));
        aVarA2.a(new u30.i(transportFactory, 1, 1));
        aVarA2.f40668f = new w(0);
        return d0.h(bVarB, aVarA2.b(), h0.r(LIBRARY_NAME, "3.0.4"));
    }
}
