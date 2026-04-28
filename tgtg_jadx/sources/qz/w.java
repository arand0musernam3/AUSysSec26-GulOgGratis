package qz;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.internal.measurement.w5;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w extends i implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f37393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f37394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w5 f37395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final GoogleApiAvailability f37396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q1.f f37397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f37398g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(j jVar, g gVar) {
        super(jVar);
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.f11044d;
        this.f37394c = new AtomicReference(null);
        this.f37395d = new w5(Looper.getMainLooper(), 1);
        this.f37396e = googleApiAvailability;
        this.f37397f = new q1.f(0);
        this.f37398g = gVar;
        jVar.h("ConnectionlessLifecycleHelper", this);
    }

    @Override // qz.i
    public final void c(int i11, int i12, Intent intent) {
        AtomicReference atomicReference = this.f37394c;
        p0 p0Var = (p0) atomicReference.get();
        g gVar = this.f37398g;
        if (i11 != 1) {
            if (i11 == 2) {
                int iB = this.f37396e.b(a(), com.google.android.gms.common.a.f11047a);
                if (iB == 0) {
                    atomicReference.set(null);
                    w5 w5Var = gVar.f37348n;
                    w5Var.sendMessage(w5Var.obtainMessage(3));
                    return;
                } else {
                    if (p0Var == null) {
                        return;
                    }
                    if (p0Var.f37383b.f35644b == 18 && iB == 18) {
                        return;
                    }
                }
            }
        } else if (i12 == -1) {
            atomicReference.set(null);
            w5 w5Var2 = gVar.f37348n;
            w5Var2.sendMessage(w5Var2.obtainMessage(3));
            return;
        } else if (i12 == 0) {
            if (p0Var != null) {
                pz.b bVar = new pz.b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, p0Var.f37383b.toString());
                int i13 = p0Var.f37382a;
                atomicReference.set(null);
                gVar.j(bVar, i13);
                return;
            }
            return;
        }
        if (p0Var != null) {
            pz.b bVar2 = p0Var.f37383b;
            int i14 = p0Var.f37382a;
            atomicReference.set(null);
            gVar.j(bVar2, i14);
        }
    }

    @Override // qz.i
    public final void d(Bundle bundle) {
        if (bundle != null) {
            this.f37394c.set(bundle.getBoolean("resolving_error", false) ? new p0(new pz.b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"), null), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // qz.i
    public final void e() {
        if (this.f37397f.isEmpty()) {
            return;
        }
        this.f37398g.f(this);
    }

    @Override // qz.i
    public final void f(Bundle bundle) {
        p0 p0Var = (p0) this.f37394c.get();
        if (p0Var == null) {
            return;
        }
        pz.b bVar = p0Var.f37383b;
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", p0Var.f37382a);
        bundle.putInt("failed_status", bVar.f35644b);
        bundle.putParcelable("failed_resolution", bVar.f35645c);
    }

    @Override // qz.i
    public final void g() {
        this.f37393b = true;
        if (this.f37397f.isEmpty()) {
            return;
        }
        this.f37398g.f(this);
    }

    @Override // qz.i
    public final void h() {
        this.f37393b = false;
        g gVar = this.f37398g;
        gVar.getClass();
        synchronized (g.f37334r) {
            try {
                if (gVar.f37346k == this) {
                    gVar.f37346k = null;
                    gVar.l.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        pz.b bVar = new pz.b(13, null, null);
        AtomicReference atomicReference = this.f37394c;
        p0 p0Var = (p0) atomicReference.get();
        int i11 = p0Var == null ? -1 : p0Var.f37382a;
        atomicReference.set(null);
        this.f37398g.j(bVar, i11);
    }
}
