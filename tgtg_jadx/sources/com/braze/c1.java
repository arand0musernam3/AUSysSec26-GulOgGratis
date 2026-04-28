package com.braze;

import com.braze.storage.t2;
import i4.r;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f9583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9584c;

    public /* synthetic */ c1(int i11, long j9, Object obj) {
        this.f9582a = i11;
        this.f9584c = obj;
        this.f9583b = j9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ga0.k kVar;
        switch (this.f9582a) {
            case 0:
                return Braze.schedulePushDelivery$lambda$196((Braze) this.f9584c, this.f9583b);
            case 1:
                ga0.g gVar = (ga0.g) this.f9584c;
                long j9 = this.f9583b;
                synchronized (gVar) {
                    try {
                        if (!gVar.f20305u && (kVar = gVar.f20296k) != null) {
                            int i11 = gVar.f20307w ? gVar.f20306v : -1;
                            gVar.f20306v++;
                            gVar.f20307w = true;
                            if (i11 != -1) {
                                StringBuilder sb2 = new StringBuilder("sent ping but didn't receive pong within ");
                                sb2.append(gVar.f20288c);
                                sb2.append("ms (after ");
                                ga0.g.c(gVar, new SocketTimeoutException(r8.k.i(i11 - 1, " successful ping/pongs)", sb2)), null, 2);
                            } else {
                                try {
                                    ia0.j jVar = ia0.j.f23646d;
                                    jVar.getClass();
                                    kVar.a(9, jVar);
                                } catch (IOException e5) {
                                    ga0.g.c(gVar, e5, null, 2);
                                }
                            }
                            break;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return Long.valueOf(j9);
            case 2:
                return t2.a((Map.Entry) this.f9584c, this.f9583b);
            case 3:
                return com.braze.triggers.managers.h.b((com.braze.triggers.actions.g) this.f9584c, this.f9583b);
            case 4:
                return ((i4.t0) ((r) this.f9584c)).b(this.f9583b);
            default:
                return com.braze.managers.k0.a((com.braze.managers.k0) this.f9584c, this.f9583b);
        }
    }
}
