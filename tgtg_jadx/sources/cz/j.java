package cz;

import a60.b0;
import a60.h0;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.cash.paykit.core.models.analytics.EventStream2Event;
import app.cash.paykit.core.models.analytics.payloads.AnalyticsCustomerRequestPayload;
import app.cash.paykit.core.models.response.AuthFlowTriggers;
import app.cash.paykit.core.models.response.CustomerProfile;
import app.cash.paykit.core.models.response.CustomerResponseData;
import app.cash.paykit.core.models.response.Grant;
import app.cash.paykit.core.models.response.Origin;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsPlatformParams;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.maps.GoogleMapOptions;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KTypeProjection;
import kotlin.text.y;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f13631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f13632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f13633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f13634d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f13636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f13637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f13638h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f13635e = new t10.c(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f13639i = new ArrayList();

    public j(t00.c cVar, Context context, GoogleMapOptions googleMapOptions) {
        this.f13636f = cVar;
        this.f13631a = context;
        this.f13638h = googleMapOptions;
    }

    public static void k(String str, JSONObject jSONObject) {
        StringBuilder sbO = b3.i.o(str);
        sbO.append(jSONObject.toString());
        String string = sbO.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
    }

    public static void n(FrameLayout frameLayout) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.f11044d;
        Context context = frameLayout.getContext();
        int iB = googleApiAvailability.b(context, com.google.android.gms.common.a.f11047a);
        String strB = w.b(context, iB);
        String strC = w.c(context, iB);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(strB);
        linearLayout.addView(textView);
        Intent intentA = googleApiAvailability.a(context, null, iB);
        if (intentA != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(strC);
            linearLayout.addView(button);
            button.setOnClickListener(new x10.e(context, intentA));
        }
    }

    public static String o(yb.j jVar) {
        if (jVar instanceof yb.e) {
            return "approved";
        }
        if (Intrinsics.areEqual(jVar, yb.f.f45815a)) {
            return "redirect";
        }
        if (Intrinsics.areEqual(jVar, yb.h.f45821e)) {
            return "refreshing";
        }
        if (Intrinsics.areEqual(jVar, yb.h.f45817a)) {
            return "create";
        }
        if (Intrinsics.areEqual(jVar, yb.h.f45818b)) {
            return "declined";
        }
        if (Intrinsics.areEqual(jVar, yb.h.f45819c)) {
            return "not_started";
        }
        if (jVar instanceof yb.g) {
            return "paykit_exception";
        }
        if (Intrinsics.areEqual(jVar, yb.h.f45820d)) {
            return "polling";
        }
        if (jVar instanceof yb.i) {
            return "ready_to_authorize";
        }
        if (Intrinsics.areEqual(jVar, yb.h.f45822f)) {
            return "retrieve_existing_customer_request";
        }
        if (Intrinsics.areEqual(jVar, yb.h.f45823g)) {
            return "update";
        }
        e40.a.f();
        return null;
    }

    public void a() {
        Iterator it = ((ArrayList) this.f13635e).iterator();
        while (it.hasNext()) {
            FutureTask futureTask = (FutureTask) it.next();
            if (futureTask.isCancelled() || futureTask.isDone()) {
                ((ub.a) this.f13634d).L("PayKitAnalytics", "Removing task from queue: " + futureTask + " (canceled=" + futureTask.isCancelled() + ", done=" + futureTask.isDone() + ")");
                it.remove();
            }
        }
    }

    public void b() {
        Unit unit;
        ub.a aVar = (ub.a) this.f13634d;
        ExecutorService executorService = (ExecutorService) this.f13637g;
        if (executorService != null) {
            if (executorService.isTerminated() | executorService.isShutdown()) {
                aVar.M("Recreating executor service after previous one was found to be shutdown.");
                this.f13637g = Executors.newSingleThreadExecutor();
            }
            unit = Unit.f26487a;
        } else {
            unit = null;
        }
        if (unit == null) {
            aVar.L("PayKitAnalytics", "Creating executor service.");
            this.f13637g = Executors.newSingleThreadExecutor();
        }
    }

    public void c() {
        Unit unit;
        ub.a aVar = (ub.a) this.f13634d;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f13638h;
        if (scheduledExecutorService != null) {
            if (scheduledExecutorService.isTerminated() | scheduledExecutorService.isShutdown()) {
                aVar.M("Recreating scheduler service after previous one was found to be shutdown.");
                i();
            }
            unit = Unit.f26487a;
        } else {
            unit = null;
        }
        if (unit == null) {
            aVar.L("PayKitAnalytics", "Creating scheduler service.");
            i();
        }
    }

    public AnalyticsCustomerRequestPayload d(CustomerResponseData customerResponseData) {
        Long lValueOf;
        Long lValueOf2;
        CustomerProfile customerProfile;
        CustomerProfile customerProfile2;
        Origin origin;
        Origin origin2;
        g90.b bVar;
        g90.b bVar2;
        long epochMilli;
        AuthFlowTriggers authFlowTriggers;
        String strD = (customerResponseData != null ? customerResponseData.l : null) != null ? h0.a((b0) this.f13637g, Reflection.typeOf(List.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(Grant.class)))).d(customerResponseData.l) : null;
        String str = (String) this.f13631a;
        String str2 = (String) this.f13633c;
        String str3 = (String) this.f13632b;
        String str4 = customerResponseData != null ? customerResponseData.f4690g : null;
        String str5 = (customerResponseData == null || (authFlowTriggers = customerResponseData.f4685b) == null) ? null : authFlowTriggers.f4672a;
        long epochMilli2 = Long.MIN_VALUE;
        if (customerResponseData == null || (bVar2 = customerResponseData.f4691h) == null) {
            lValueOf = null;
        } else {
            Instant instant = bVar2.f20262a;
            try {
                epochMilli = instant.toEpochMilli();
            } catch (ArithmeticException unused) {
                epochMilli = instant.isAfter(Instant.EPOCH) ? Long.MAX_VALUE : Long.MIN_VALUE;
            }
            lValueOf = Long.valueOf(epochMilli);
        }
        if (customerResponseData == null || (bVar = customerResponseData.f4692i) == null) {
            lValueOf2 = null;
        } else {
            Instant instant2 = bVar.f20262a;
            try {
                epochMilli2 = instant2.toEpochMilli();
            } catch (ArithmeticException unused2) {
                if (instant2.isAfter(Instant.EPOCH)) {
                    epochMilli2 = Long.MAX_VALUE;
                }
            }
            lValueOf2 = Long.valueOf(epochMilli2);
        }
        String str6 = (customerResponseData == null || (origin2 = customerResponseData.f4688e) == null) ? null : origin2.f4724b;
        return new AnalyticsCustomerRequestPayload(str, str2, AnalyticsPlatformParams.channel, str3, (String) this.f13634d, null, null, null, null, null, null, str4, "IN_APP", customerResponseData != null ? customerResponseData.f4687d : null, null, str5, null, lValueOf2, lValueOf, (customerResponseData == null || (origin = customerResponseData.f4688e) == null) ? null : origin.f4723a, str6, null, null, null, (customerResponseData == null || (customerProfile2 = customerResponseData.f4694k) == null) ? null : customerProfile2.f4679a, (customerResponseData == null || (customerProfile = customerResponseData.f4694k) == null) ? null : customerProfile.f4680b, null, null, null, null, strD, null, null, null, null, -1126086688, 7, null);
    }

    public void e(yb.j jVar, CustomerResponseData customerResponseData) {
        String strD = h0.a((b0) this.f13637g, Reflection.typeOf(AnalyticsCustomerRequestPayload.class)).d(AnalyticsCustomerRequestPayload.a(d(customerResponseData), o(jVar), null, null, null, null, -33, 7));
        ((n20.f) this.f13638h).getClass();
        String strQ = n20.f.q();
        ((r40.d) this.f13639i).getClass();
        String strD2 = h0.a((b0) this.f13637g, Reflection.typeOf(EventStream2Event.class)).d(new EventStream2Event("paykitsdk-android", "mobile_cap_pk_customer_request", strD, r40.d.l(), strQ));
        j jVar2 = (j) this.f13635e;
        synchronized (jVar2) {
            jVar2.m(strD2);
        }
    }

    public i40.b f(i40.c cVar) {
        i40.b bVar = null;
        try {
            if (!i40.c.SKIP_CACHE_LOOKUP.equals(cVar)) {
                JSONObject jSONObjectG = ((lz.i) this.f13635e).G();
                if (jSONObjectG != null) {
                    i40.b bVarN = ((se.d) this.f13633c).N(jSONObjectG);
                    k("Loaded cached settings: ", jSONObjectG);
                    ((r40.d) this.f13634d).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (i40.c.IGNORE_CACHE_EXPIRATION.equals(cVar) || bVarN.f23343c >= jCurrentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return bVarN;
                        } catch (Exception e5) {
                            e = e5;
                            bVar = bVarN;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return bVar;
                        }
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        return null;
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e11) {
            e = e11;
        }
    }

    public zb.a g(String str) {
        Object next;
        Iterator it = ((ArrayList) this.f13636f).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (y.k(((zb.a) next).f47418d, str, true)) {
                break;
            }
        }
        return (zb.a) next;
    }

    public i40.b h() {
        return (i40.b) ((AtomicReference) this.f13638h).get();
    }

    public void i() {
        ((AtomicBoolean) this.f13639i).set(false);
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        ub.a aVar = (ub.a) this.f13634d;
        Locale locale = Locale.US;
        ub.b bVar = (ub.b) this.f13631a;
        long j9 = bVar.f40983a;
        p80.c cVar = p80.d.f34559b;
        p80.h hVar = p80.h.SECONDS;
        Long lValueOf = Long.valueOf(p80.d.j(j9, hVar));
        long j11 = bVar.f40984b;
        aVar.L("PayKitAnalytics", String.format(locale, "Initializing scheduled executor service | delay:%ds, interval:%ds", Arrays.copyOf(new Object[]{lValueOf, Long.valueOf(p80.d.j(j11, hVar))}, 2)));
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new m0.l(this, 25), p80.d.j(bVar.f40983a, hVar), p80.d.j(j11, hVar), TimeUnit.SECONDS);
        this.f13638h = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    /* JADX WARN: Incorrect condition in loop: B:6:0x002c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(wy.i r46, int r47) {
        /*
            Method dump skipped, instruction units count: 1212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cz.j.j(wy.i, int):void");
    }

    public synchronized void l(zb.a aVar) {
        try {
            aVar.getClass();
            zb.a aVarG = g(aVar.f47418d);
            if (aVarG == null) {
                t5.a aVar2 = (t5.a) this.f13633c;
                ub.a aVar3 = (ub.a) this.f13634d;
                aVar2.getClass();
                aVar3.getClass();
                aVar.f47416b = aVar2;
                aVar.f47415a = aVar3;
                ((ArrayList) this.f13636f).add(aVar);
                ((ub.a) this.f13634d).L("PayKitAnalytics", String.format(Locale.US, "Registering %s as delivery handler for %s", Arrays.copyOf(new Object[]{aVar.getClass().getSimpleName(), aVar.f47418d}, 2)));
            } else {
                ((ub.a) this.f13634d).M(String.format(Locale.US, "Handler for %s deliverable is already registered: %s", Arrays.copyOf(new Object[]{aVar.f47418d, aVarG.getClass()}, 2)));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized ub.c m(String str) {
        ub.c cVar;
        c();
        b();
        zb.a aVarG = g("AnalyticsEventStream2Event");
        if (aVarG == null || !y.k(aVarG.f47418d, "AnalyticsEventStream2Event", true)) {
            ((ub.a) this.f13634d).p("PayKitAnalytics", "No registered handler for deliverable of type: AnalyticsEventStream2Event", null);
            throw new IllegalArgumentException("No registered handler for deliverable of type: AnalyticsEventStream2Event");
        }
        ((ub.a) this.f13634d).L("PayKitAnalytics", "Scheduling AnalyticsEventStream2Event for delivery --- ".concat(str));
        cVar = new ub.c(new com.google.firebase.messaging.g(7, str, this));
        ExecutorService executorService = (ExecutorService) this.f13637g;
        executorService.getClass();
        executorService.execute(cVar);
        return cVar;
    }

    public void p(int i11) {
        while (!((LinkedList) this.f13634d).isEmpty() && ((yz.e) ((LinkedList) this.f13634d).getLast()).a() >= i11) {
            ((LinkedList) this.f13634d).removeLast();
        }
    }

    public void q(Bundle bundle, yz.e eVar) {
        if (((j30.g) this.f13632b) != null) {
            eVar.b();
            return;
        }
        if (((LinkedList) this.f13634d) == null) {
            this.f13634d = new LinkedList();
        }
        ((LinkedList) this.f13634d).add(eVar);
        if (bundle != null) {
            Bundle bundle2 = (Bundle) this.f13633c;
            if (bundle2 == null) {
                this.f13633c = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        t10.c cVar = (t10.c) this.f13635e;
        this.f13637g = cVar;
        if (cVar == null || ((j30.g) this.f13632b) != null) {
            return;
        }
        try {
            Context context = (Context) this.f13631a;
            boolean z11 = t00.e.f39339a;
            synchronized (t00.e.class) {
                t00.e.a(context);
            }
            u00.h hVarP = u00.e.a(context).P(new yz.b(context), (GoogleMapOptions) this.f13638h);
            if (hVarP == null) {
                return;
            }
            ((t10.c) this.f13637g).q(new j30.g((t00.c) this.f13636f, hVarP));
            ArrayList arrayList = (ArrayList) this.f13639i;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((j30.g) this.f13632b).n((rt.e) it.next());
            }
            arrayList.clear();
        } catch (RemoteException e5) {
            qc.y.l(e5);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }
}
