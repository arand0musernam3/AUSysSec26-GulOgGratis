package ib;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f23755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e6.i f23756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f23757d;

    public /* synthetic */ q(AtomicBoolean atomicBoolean, e6.i iVar, Function0 function0, int i11) {
        this.f23754a = i11;
        this.f23755b = atomicBoolean;
        this.f23756c = iVar;
        this.f23757d = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23754a) {
            case 0:
                e6.i iVar = this.f23756c;
                Function0 function0 = this.f23757d;
                if (!this.f23755b.get()) {
                    try {
                        iVar.b(function0.invoke());
                    } catch (Throwable th2) {
                        iVar.d(th2);
                        return;
                    }
                    break;
                }
                break;
            default:
                e6.i iVar2 = this.f23756c;
                Function0 function02 = this.f23757d;
                if (!this.f23755b.get()) {
                    try {
                        iVar2.b(function02.invoke());
                    } catch (Throwable th3) {
                        iVar2.d(th3);
                    }
                    break;
                }
                break;
        }
    }
}
