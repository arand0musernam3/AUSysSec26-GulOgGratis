package v30;

import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f41963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f41964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m1.a f41965d;

    public /* synthetic */ e(f fVar, Runnable runnable, m1.a aVar, int i11) {
        this.f41962a = i11;
        this.f41963b = fVar;
        this.f41964c = runnable;
        this.f41965d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f41962a) {
            case 0:
                ExecutorService executorService = this.f41963b.f41966a;
                final int i11 = 0;
                final Runnable runnable = this.f41964c;
                final m1.a aVar = this.f41965d;
                executorService.execute(new Runnable() { // from class: v30.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e5) {
                                    ((h) aVar.f28697a).l(e5);
                                    throw e5;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) aVar.f28697a).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) aVar.f28697a;
                                try {
                                    runnable2.run();
                                    hVar.k(null);
                                    return;
                                } catch (Exception e12) {
                                    hVar.l(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.f41963b.f41966a;
                final int i12 = 2;
                final Runnable runnable2 = this.f41964c;
                final m1.a aVar2 = this.f41965d;
                executorService2.execute(new Runnable() { // from class: v30.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i12) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e5) {
                                    ((h) aVar2.f28697a).l(e5);
                                    throw e5;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) aVar2.f28697a).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar = (h) aVar2.f28697a;
                                try {
                                    runnable22.run();
                                    hVar.k(null);
                                    return;
                                } catch (Exception e12) {
                                    hVar.l(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.f41963b.f41966a;
                final int i13 = 1;
                final Runnable runnable3 = this.f41964c;
                final m1.a aVar3 = this.f41965d;
                executorService3.execute(new Runnable() { // from class: v30.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i13) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e5) {
                                    ((h) aVar3.f28697a).l(e5);
                                    throw e5;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) aVar3.f28697a).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar = (h) aVar3.f28697a;
                                try {
                                    runnable22.run();
                                    hVar.k(null);
                                    return;
                                } catch (Exception e12) {
                                    hVar.l(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
