package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.util.Log;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ea implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Serializable f11378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f11380e;

    public /* synthetic */ ea(Object obj, Serializable serializable, Object obj2, Object obj3, int i11) {
        this.f11376a = i11;
        this.f11377b = obj;
        this.f11378c = serializable;
        this.f11379d = obj2;
        this.f11380e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11376a) {
            case 0:
                o30.b1 b1Var = (o30.b1) this.f11377b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f11378c;
                Context context = (Context) this.f11379d;
                da daVar = (da) this.f11380e;
                if ((b1Var.f31920a instanceof o30.d) && atomicBoolean.compareAndSet(false, true)) {
                    try {
                        context.unregisterReceiver(daVar);
                    } catch (IllegalArgumentException e5) {
                        Log.w("DirectBootUtils", "Failed to unregister receiver", e5);
                        return;
                    }
                    break;
                }
                break;
            default:
                s5 s5Var = ua.f11934a;
                Level level = (Level) this.f11377b;
                v2 v2Var = (v2) s5Var.f11844b;
                boolean zE = v2Var.e(level);
                String str = (String) v2Var.f11956a;
                ((i) d.f11331a).getClass();
                n.f11648b.a(str, level, zE);
                ((ig) ((ig) (!zE ? s5.f11842e : new jg(s5Var, level)).c((Throwable) this.f11378c)).a()).b((String) this.f11379d, (Object[]) this.f11380e);
                break;
        }
    }
}
