package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o00.h0;
import p30.g;
import qc.y;
import t30.a;
import t30.b;
import u30.c;
import u30.i;
import u30.o;
import u40.d;
import u40.e;
import v30.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static e lambda$getComponents$0(c cVar) {
        return new d((g) cVar.b(g.class), cVar.c(r40.e.class), (ExecutorService) cVar.e(new o(a.class, ExecutorService.class)), new j((Executor) cVar.e(new o(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<u30.b> getComponents() {
        u30.a aVarA = u30.b.a(e.class);
        aVarA.f40663a = LIBRARY_NAME;
        aVarA.a(i.a(g.class));
        aVarA.a(new i(0, 1, r40.e.class));
        aVarA.a(new i(new o(a.class, ExecutorService.class), 1, 0));
        aVarA.a(new i(new o(b.class, Executor.class), 1, 0));
        aVarA.f40668f = new y(14);
        u30.b bVarB = aVarA.b();
        r40.d dVar = new r40.d();
        u30.a aVarA2 = u30.b.a(r40.d.class);
        aVarA2.f40667e = 1;
        aVarA2.f40668f = new mp.a(dVar, 15);
        return Arrays.asList(bVarB, aVarA2.b(), h0.r(LIBRARY_NAME, "19.1.0"));
    }
}
