package com.app.tgtg.services.notifications;

import ag.i;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import b0.a0;
import cv.b;
import gv.c;
import kotlin.jvm.internal.Intrinsics;
import o00.h0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class NotificationPublisher extends BroadcastReceiver {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f9492d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f9493a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9494b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f9495c;

    public final void a(Context context, Intent intent) {
        if (this.f9493a) {
            return;
        }
        synchronized (this.f9494b) {
            try {
                if (!this.f9493a) {
                    this.f9495c = (b) ((i) ((c) h0.u(context))).E.get();
                    this.f9493a = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a(context, intent);
        context.getClass();
        intent.getClass();
        Object systemService = context.getSystemService("notification");
        systemService.getClass();
        ((NotificationManager) systemService).notify(intent.getIntExtra("notification-id", 0), (Notification) a0.A(intent, "notification", Notification.class));
        b bVar = this.f9495c;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventTrackingManager");
            bVar = null;
        }
        bVar.b(cv.i.NOTIFICATION_RECEIVED);
    }
}
