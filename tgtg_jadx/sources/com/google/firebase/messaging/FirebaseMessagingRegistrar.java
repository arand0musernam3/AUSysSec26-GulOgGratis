package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(u30.o oVar, u30.c cVar) {
        p30.g gVar = (p30.g) cVar.b(p30.g.class);
        if (cVar.b(s40.a.class) == null) {
            return new FirebaseMessaging(gVar, null, cVar.c(a50.b.class), cVar.c(r40.g.class), (u40.e) cVar.b(u40.e.class), cVar.g(oVar), (q40.c) cVar.b(q40.c.class));
        }
        org.bouncycastle.jce.provider.a.c();
        return null;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<u30.b> getComponents() {
        u30.o oVar = new u30.o(l40.b.class, ty.f.class);
        u30.a aVarA = u30.b.a(FirebaseMessaging.class);
        aVarA.f40663a = LIBRARY_NAME;
        aVarA.a(u30.i.a(p30.g.class));
        aVarA.a(new u30.i(0, 0, s40.a.class));
        aVarA.a(new u30.i(0, 1, a50.b.class));
        aVarA.a(new u30.i(0, 1, r40.g.class));
        aVarA.a(u30.i.a(u40.e.class));
        aVarA.a(new u30.i(oVar, 0, 1));
        aVarA.a(u30.i.a(q40.c.class));
        aVarA.f40668f = new p(oVar, 0);
        aVarA.c(1);
        return Arrays.asList(aVarA.b(), o00.h0.r(LIBRARY_NAME, "25.0.1"));
    }
}
