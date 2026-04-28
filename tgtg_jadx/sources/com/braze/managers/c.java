package com.braze.managers;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f9951c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f9953b;

    public c(Context context, q0 q0Var) {
        context.getClass();
        q0Var.getClass();
        this.f9952a = context;
        this.f9953b = q0Var;
    }

    public static final String b() {
        return "Registering with ADM server...";
    }

    public final void a() {
        if (((z0) this.f9953b).b() != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new zendesk.ui.android.conversation.textcell.c(this, 4), 6, (Object) null);
            z0 z0Var = (z0) this.f9953b;
            z0Var.a(z0Var.b());
        } else {
            ADM adm = new ADM(this.f9952a);
            if (adm.isSupported()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new zv.b(22), 6, (Object) null);
                adm.startRegister();
            }
        }
    }

    public static final String a(c cVar) {
        return e0.f.k("The device is already registered with the ADM server and is eligible to receive ADM messages.ADM registration id: ", ((z0) cVar.f9953b).b());
    }
}
