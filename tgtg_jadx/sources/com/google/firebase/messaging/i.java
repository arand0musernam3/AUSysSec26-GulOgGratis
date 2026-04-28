package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f12817c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static o0 f12818d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0.b f12820b = new l0.b(0);

    public i(Context context) {
        this.f12819a = context;
    }

    public static Task a(Context context, Intent intent, boolean z11) {
        o0 o0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f12817c) {
            try {
                if (f12818d == null) {
                    f12818d = new o0(context);
                }
                o0Var = f12818d;
            } finally {
            }
        }
        if (!z11) {
            return o0Var.b(intent).i(new l0.b(0), new c50.w(13));
        }
        if (a0.J().P(context)) {
            synchronized (l0.f12845a) {
                try {
                    l0.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        l0.f12846b.a();
                    }
                    o0Var.b(intent).addOnCompleteListener(new w.z(intent, 21));
                } finally {
                }
            }
        } else {
            o0Var.b(intent);
        }
        return Tasks.d(-1);
    }

    public final Task b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = this.f12819a;
        boolean z11 = context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z12 = (intent.getFlags() & 268435456) != 0;
        if (z11 && !z12) {
            return a(context, intent, z12);
        }
        g gVar = new g(0, context, intent);
        l0.b bVar = this.f12820b;
        return Tasks.b(bVar, gVar).j(bVar, new d10.b() { // from class: com.google.firebase.messaging.h
            @Override // d10.b
            public final Object g(Task task) {
                return ((Integer) task.getResult()).intValue() != 402 ? task : i.a(context, intent, z12).i(new l0.b(0), new c50.w(12));
            }
        });
    }
}
