package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.components.ComponentRegistrar;
import j4.d;
import java.util.Arrays;
import java.util.List;
import o00.h0;
import ty.f;
import u30.b;
import u30.c;
import u30.i;
import u30.o;
import uy.a;
import wy.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$0(c cVar) {
        p.b((Context) cVar.b(Context.class));
        return p.a().c(a.f41571f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$1(c cVar) {
        p.b((Context) cVar.b(Context.class));
        return p.a().c(a.f41571f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$2(c cVar) {
        p.b((Context) cVar.b(Context.class));
        return p.a().c(a.f41570e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List<b> getComponents() {
        u30.a aVarA = b.a(f.class);
        aVarA.f40663a = LIBRARY_NAME;
        aVarA.a(i.a(Context.class));
        aVarA.f40668f = new d(24);
        b bVarB = aVarA.b();
        u30.a aVarB = b.b(new o(l40.a.class, f.class));
        aVarB.a(i.a(Context.class));
        aVarB.f40668f = new d(25);
        b bVarB2 = aVarB.b();
        u30.a aVarB2 = b.b(new o(l40.b.class, f.class));
        aVarB2.a(i.a(Context.class));
        aVarB2.f40668f = new d(26);
        return Arrays.asList(bVarB, bVarB2, aVarB2.b(), h0.r(LIBRARY_NAME, "19.0.0"));
    }
}
