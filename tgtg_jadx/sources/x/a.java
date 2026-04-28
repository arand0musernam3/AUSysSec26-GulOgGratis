package x;

import androidx.camera.core.CameraControl$OperationCanceledException;
import b0.e2;
import b0.o2;
import e0.h1;
import e0.k1;
import f0.n;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import s0.k2;
import v80.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f43595a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f43596b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b0.a f43597c = new b0.a(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q f43598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q f43599e;

    @Override // e0.h1
    public final void L(k1 k1Var, long j9, n nVar) {
        synchronized (this.f43596b) {
            q qVar = this.f43598d;
            if (qVar != null) {
                if (Intrinsics.areEqual(((k2) k1Var.b(e2.f5145a, k2.f38372b)).f38373a.get("Camera2CameraControl.tag"), Integer.valueOf(qVar.hashCode()))) {
                    qVar.R(null);
                    this.f43598d = null;
                    q qVar2 = this.f43599e;
                    if (qVar2 != null) {
                        qVar2.R(null);
                        this.f43599e = null;
                    }
                }
            }
        }
    }

    public final q a(o2 o2Var, boolean z11) {
        b0.b bVarA;
        q qVar = new q();
        synchronized (this.f43595a) {
            bVarA = this.f43597c.a();
        }
        synchronized (this.f43596b) {
            try {
                if (o2Var != null) {
                    q qVar2 = this.f43598d;
                    if (z11) {
                        if (qVar2 != null) {
                            qVar2.h0(new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options."));
                        }
                    } else if (qVar2 != null) {
                        v0.n.C(qVar, qVar2);
                    }
                    this.f43598d = qVar;
                    o2Var.c(bVarA, w0.b(new Pair("Camera2CameraControl.tag", Integer.valueOf(qVar.hashCode()))));
                } else {
                    q qVar3 = this.f43599e;
                    if (qVar3 != null) {
                        qVar3.h0(new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options."));
                    }
                    this.f43599e = qVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }
}
