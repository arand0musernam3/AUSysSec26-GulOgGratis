package com.google.firebase.messaging;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.n1;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f12822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f12823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f12824d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f12826f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g0 f12828h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q1.e f12825e = new q1.e(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12827g = false;

    public i0(FirebaseMessaging firebaseMessaging, t tVar, g0 g0Var, q qVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f12824d = firebaseMessaging;
        this.f12822b = tVar;
        this.f12828h = g0Var;
        this.f12823c = qVar;
        this.f12821a = context;
        this.f12826f = scheduledThreadPoolExecutor;
    }

    public static void a(Task task) throws IOException {
        try {
            Tasks.a(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e5) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e5);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e11);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void b(String str) throws IOException {
        String strBlockingGetToken = this.f12824d.blockingGetToken();
        q qVar = this.f12823c;
        qVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(qVar.a(qVar.c(strBlockingGetToken, "/topics/" + str, bundle)));
    }

    public final void c(String str) throws IOException {
        String strBlockingGetToken = this.f12824d.blockingGetToken();
        q qVar = this.f12823c;
        qVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(qVar.a(qVar.c(strBlockingGetToken, "/topics/" + str, bundle)));
    }

    public final d10.o d(f0 f0Var) {
        ArrayDeque arrayDeque;
        g0 g0Var = this.f12828h;
        synchronized (g0Var) {
            n1 n1Var = g0Var.f12808a;
            String str = f0Var.f12803c;
            n1Var.getClass();
            if (!TextUtils.isEmpty(str) && !str.contains((String) n1Var.f3501c)) {
                synchronized (((ArrayDeque) n1Var.f3502d)) {
                    if (((ArrayDeque) n1Var.f3502d).add(str)) {
                        ((ScheduledThreadPoolExecutor) n1Var.f3503e).execute(new al.u(n1Var, 25));
                    }
                }
            }
        }
        d10.g gVar = new d10.g();
        synchronized (this.f12825e) {
            try {
                String str2 = f0Var.f12803c;
                if (this.f12825e.containsKey(str2)) {
                    arrayDeque = (ArrayDeque) this.f12825e.get(str2);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f12825e.put(str2, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(gVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar.f13697a;
    }

    public final synchronized void e(boolean z11) {
        this.f12827g = z11;
    }

    public final void f() {
        boolean z11;
        if (this.f12828h.a() != null) {
            synchronized (this) {
                z11 = this.f12827g;
            }
            if (z11) {
                return;
            }
            h(0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008b A[Catch: IOException -> 0x0062, TryCatch #2 {IOException -> 0x0062, blocks: (B:15:0x002b, B:32:0x008b, B:34:0x0093, B:20:0x003c, B:22:0x0044, B:24:0x004f, B:27:0x0065, B:29:0x006d, B:31:0x0078), top: B:88:0x002b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.i0.g():boolean");
    }

    public final void h(long j9) {
        this.f12826f.schedule(new k0(this, this.f12821a, this.f12822b, Math.min(Math.max(30L, 2 * j9), 28800L)), j9, TimeUnit.SECONDS);
        e(true);
    }
}
