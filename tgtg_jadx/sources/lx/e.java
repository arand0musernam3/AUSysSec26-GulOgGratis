package lx;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f28348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f28349c;

    public /* synthetic */ e(s sVar, Context context, int i11) {
        this.f28347a = i11;
        this.f28348b = sVar;
        this.f28349c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28347a) {
            case 0:
                s sVar = this.f28348b;
                Context context = this.f28349c;
                if (!yx.a.f46339a.contains(f.class)) {
                    try {
                        context.getClass();
                        f fVar = f.f28350a;
                        String packageName = context.getPackageName();
                        packageName.getClass();
                        fVar.a(sVar, packageName);
                    } catch (Throwable th2) {
                        yx.a.a(f.class, th2);
                        return;
                    }
                    break;
                }
                break;
            default:
                s sVar2 = this.f28348b;
                Context context2 = this.f28349c;
                if (!yx.a.f46339a.contains(f.class)) {
                    try {
                        context2.getClass();
                        f fVar2 = f.f28350a;
                        String packageName2 = context2.getPackageName();
                        packageName2.getClass();
                        fVar2.a(sVar2, packageName2);
                    } catch (Throwable th3) {
                        yx.a.a(f.class, th3);
                    }
                    break;
                }
                break;
        }
    }
}
