package com.braze.managers;

import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.location.IBrazeLocationApi;
import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p implements p0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f10060d = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f10061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BrazeConfigurationProvider f10062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.braze.location.b f10063c;

    public p(Context context, r rVar, BrazeConfigurationProvider brazeConfigurationProvider) {
        context.getClass();
        rVar.getClass();
        brazeConfigurationProvider.getClass();
        this.f10061a = rVar;
        this.f10062b = brazeConfigurationProvider;
        com.braze.location.b bVar = new com.braze.location.b(context, f10060d.a(brazeConfigurationProvider), brazeConfigurationProvider);
        this.f10063c = bVar;
        if (bVar.f9903a != null) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new zv.l(12), 6, (Object) null);
    }

    public static final String b(IBrazeLocation iBrazeLocation) {
        return "Invoked manualSetUserLocation for " + iBrazeLocation;
    }

    public static final String c() {
        return "***Location API not found. Please include android-sdk-location module***";
    }

    public static final String e() {
        return "Failed to log location recorded event.";
    }

    public static final String g() {
        return "Automatic location collection is disabled. Not requesting location update.";
    }

    public final boolean a(IBrazeLocation iBrazeLocation) {
        p pVar;
        iBrazeLocation.getClass();
        try {
            pVar = this;
        } catch (Exception e5) {
            e = e5;
            pVar = this;
        }
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) pVar, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new dw.c(iBrazeLocation, 2), 6, (Object) null);
            com.braze.models.k kVarA = com.braze.models.outgoing.event.b.f10176g.a(iBrazeLocation);
            if (kVarA == null) {
                return true;
            }
            pVar = this;
            pVar.f10061a.a(kVarA);
            return true;
        } catch (Exception e11) {
            e = e11;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) pVar, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new zv.l(13), 4, (Object) null);
            return false;
        }
    }

    public final boolean d() {
        if (this.f10062b.isAutomaticLocationCollectionEnabled()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new zv.l(9), 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new zv.l(10), 6, (Object) null);
        return true;
    }

    public final boolean f() {
        if (d()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new zv.l(11), 6, (Object) null);
            return false;
        }
        com.braze.location.b bVar = this.f10063c;
        zendesk.core.android.internal.a aVar = new zendesk.core.android.internal.a(this, 13);
        bVar.getClass();
        IBrazeLocationApi iBrazeLocationApi = bVar.f9903a;
        if (iBrazeLocationApi != null) {
            return iBrazeLocationApi.requestSingleLocationUpdate(aVar);
        }
        return false;
    }

    public static final String b() {
        return "Automatic location collection disabled via sdk configuration.";
    }

    public static final String a() {
        return "Automatic location collection enabled via sdk configuration.";
    }

    public static final Unit a(p pVar, IBrazeLocation iBrazeLocation) {
        iBrazeLocation.getClass();
        pVar.a(iBrazeLocation);
        return Unit.f26487a;
    }
}
