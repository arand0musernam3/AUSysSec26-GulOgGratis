package com.google.firebase;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.d0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p30.h;
import t30.c;
import t30.d;
import u30.a;
import u30.b;
import u30.i;
import u30.o;
import v80.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lu30/b;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFirebase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Firebase.kt\ncom/google/firebase/FirebaseCommonKtxRegistrar\n+ 2 Firebase.kt\ncom/google/firebase/FirebaseKt\n*L\n1#1,82:1\n76#2,6:83\n76#2,6:89\n76#2,6:95\n76#2,6:101\n*S KotlinDebug\n*F\n+ 1 Firebase.kt\ncom/google/firebase/FirebaseCommonKtxRegistrar\n*L\n67#1:83,6\n68#1:89,6\n69#1:95,6\n70#1:101,6\n*E\n"})
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<b> getComponents() {
        a aVarB = b.b(new o(t30.a.class, x.class));
        aVarB.a(new i(new o(t30.a.class, Executor.class), 1, 0));
        aVarB.f40668f = h.f34232b;
        b bVarB = aVarB.b();
        a aVarB2 = b.b(new o(c.class, x.class));
        aVarB2.a(new i(new o(c.class, Executor.class), 1, 0));
        aVarB2.f40668f = h.f34233c;
        b bVarB2 = aVarB2.b();
        a aVarB3 = b.b(new o(t30.b.class, x.class));
        aVarB3.a(new i(new o(t30.b.class, Executor.class), 1, 0));
        aVarB3.f40668f = h.f34234d;
        b bVarB3 = aVarB3.b();
        a aVarB4 = b.b(new o(d.class, x.class));
        aVarB4.a(new i(new o(d.class, Executor.class), 1, 0));
        aVarB4.f40668f = h.f34235e;
        return d0.h(bVarB, bVarB2, bVarB3, aVarB4.b());
    }
}
