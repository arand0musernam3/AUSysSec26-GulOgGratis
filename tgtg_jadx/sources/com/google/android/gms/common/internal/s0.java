package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.adyen.checkout.components.core.PaymentMethodTypes;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s0 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t0 f11194a;

    public /* synthetic */ s0(t0 t0Var) {
        this.f11194a = t0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i11 = message.what;
        if (i11 == 0) {
            t0 t0Var = this.f11194a;
            synchronized (t0Var.f11197d) {
                try {
                    q0 q0Var = (q0) message.obj;
                    r0 r0Var = (r0) t0Var.f11197d.get(q0Var);
                    if (r0Var != null && r0Var.f11182a.isEmpty()) {
                        if (r0Var.f11184c) {
                            q0 q0Var2 = r0Var.f11186e;
                            t0 t0Var2 = r0Var.f11188g;
                            t0Var2.f11199f.removeMessages(1, q0Var2);
                            t0Var2.f11200g.c(t0Var2.f11198e, r0Var);
                            r0Var.f11184c = false;
                            r0Var.f11183b = 2;
                        }
                        t0Var.f11197d.remove(q0Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i11 != 1) {
            return false;
        }
        t0 t0Var3 = this.f11194a;
        synchronized (t0Var3.f11197d) {
            try {
                q0 q0Var3 = (q0) message.obj;
                r0 r0Var2 = (r0) t0Var3.f11197d.get(q0Var3);
                if (r0Var2 != null && r0Var2.f11183b == 3) {
                    String strValueOf = String.valueOf(q0Var3);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 47);
                    sb2.append("Timeout waiting for ServiceConnection callback ");
                    sb2.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb2.toString(), new Exception());
                    ComponentName componentName = r0Var2.f11187f;
                    if (componentName == null) {
                        q0Var3.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = q0Var3.f11177b;
                        i0.h(str);
                        componentName = new ComponentName(str, PaymentMethodTypes.UNKNOWN);
                    }
                    r0Var2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
