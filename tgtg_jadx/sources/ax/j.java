package ax;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r40.d f4928f = new r40.d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static j f4929g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d9.c f4930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final se.d f4931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f4932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f4933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Date f4934e;

    public j(d9.c cVar, se.d dVar) {
        cVar.getClass();
        this.f4930a = cVar;
        this.f4931b = dVar;
        this.f4933d = new AtomicBoolean(false);
        this.f4934e = new Date(0L);
    }

    public final void a() {
        b bVar = this.f4932c;
        if (bVar == null) {
            return;
        }
        String str = bVar.f4881k;
        final int i11 = 0;
        final int i12 = 1;
        if (this.f4933d.compareAndSet(false, true)) {
            this.f4934e = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            h hVar = new h();
            final c cVar = new c(0, atomicBoolean, hashSet, hashSet2, hashSet3);
            final d dVar = new d(hVar, i11);
            final e eVar = new e(hVar, bVar, atomicBoolean, hashSet, hashSet2, hashSet3, this);
            Bundle bundle = new Bundle();
            bundle.putString("fields", "permission,status");
            String str2 = h0.f4915j;
            h0 h0VarY = qb.e.y(bVar, "me/permissions", cVar);
            h0VarY.f4920d = bundle;
            l0 l0Var = l0.GET;
            h0VarY.k(l0Var);
            i eVar2 = Intrinsics.areEqual(str == null ? "facebook" : str, "instagram") ? new qb.e() : new n20.f(7);
            Bundle bundle2 = new Bundle();
            bundle2.putString("grant_type", eVar2.i());
            bundle2.putString("client_id", bVar.f4878h);
            bundle2.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            h0 h0VarY2 = qb.e.y(bVar, eVar2.k(), dVar);
            h0VarY2.f4920d = bundle2;
            h0VarY2.k(l0Var);
            if (Intrinsics.areEqual(str, "gaming")) {
                final AtomicInteger atomicInteger = new AtomicInteger(0);
                c0 c0Var = new c0() { // from class: ax.f
                    @Override // ax.c0
                    public final void a(k0 k0Var) throws Throwable {
                        switch (i11) {
                            case 0:
                                c cVar2 = (c) cVar;
                                k0Var.getClass();
                                cVar2.a(k0Var);
                                if (atomicInteger.incrementAndGet() == 2) {
                                    eVar.run();
                                }
                                break;
                            default:
                                d dVar2 = (d) cVar;
                                k0Var.getClass();
                                dVar2.a(k0Var);
                                if (atomicInteger.incrementAndGet() == 2) {
                                    eVar.run();
                                }
                                break;
                        }
                    }
                };
                c0 c0Var2 = new c0() { // from class: ax.f
                    @Override // ax.c0
                    public final void a(k0 k0Var) throws Throwable {
                        switch (i12) {
                            case 0:
                                c cVar2 = (c) dVar;
                                k0Var.getClass();
                                cVar2.a(k0Var);
                                if (atomicInteger.incrementAndGet() == 2) {
                                    eVar.run();
                                }
                                break;
                            default:
                                d dVar2 = (d) dVar;
                                k0Var.getClass();
                                dVar2.a(k0Var);
                                if (atomicInteger.incrementAndGet() == 2) {
                                    eVar.run();
                                }
                                break;
                        }
                    }
                };
                h0VarY.j(c0Var);
                h0VarY2.j(c0Var2);
                h0VarY.d();
                h0VarY2.d();
                return;
            }
            j0 j0Var = new j0(h0VarY, h0VarY2);
            g gVar = new g(eVar);
            ArrayList arrayList = j0Var.f4939d;
            if (!arrayList.contains(gVar)) {
                arrayList.add(gVar);
            }
            tx.j.l(j0Var);
            new i0(j0Var).executeOnExecutor(a0.c(), new Void[0]);
        }
    }

    public final void b(b bVar, b bVar2) {
        Intent intent = new Intent(a0.a(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", bVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", bVar2);
        this.f4930a.c(intent);
    }

    public final void c(b bVar, boolean z11) {
        b bVar2 = this.f4932c;
        String str = bVar2 != null ? bVar2.f4879i : null;
        String str2 = bVar != null ? bVar.f4879i : null;
        if (str != null && !Intrinsics.areEqual(str, str2)) {
            bx.j.d(bx.p.EAGER_FLUSHING_EVENT);
        }
        this.f4932c = bVar;
        this.f4933d.set(false);
        this.f4934e = new Date(0L);
        if (z11) {
            SharedPreferences sharedPreferences = (SharedPreferences) this.f4931b.f39013b;
            if (bVar != null) {
                try {
                    sharedPreferences.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", bVar.a().toString()).apply();
                } catch (JSONException unused) {
                }
            } else {
                sharedPreferences.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
                tx.n0.c(a0.a());
            }
        }
        if (bVar2 == null ? bVar == null : Intrinsics.areEqual(bVar2, bVar)) {
            return;
        }
        b(bVar2, bVar);
        Context contextA = a0.a();
        Date date = b.l;
        b bVarV = pd.g.v();
        AlarmManager alarmManager = (AlarmManager) contextA.getSystemService("alarm");
        if (pd.g.B()) {
            if ((bVarV != null ? bVarV.f4871a : null) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(contextA, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, bVarV.f4871a.getTime(), PendingIntent.getBroadcast(contextA, 0, intent, 67108864));
            } catch (Exception unused2) {
            }
        }
    }
}
