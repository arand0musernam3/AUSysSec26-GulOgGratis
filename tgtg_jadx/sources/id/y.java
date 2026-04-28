package id;

import android.graphics.ImageDecoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageDecoder.Source f23822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AutoCloseable f23823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final td.o f23824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e90.i f23825d;

    public y(ImageDecoder.Source source, AutoCloseable autoCloseable, td.o oVar, e90.i iVar) {
        this.f23822a = source;
        this.f23823b = autoCloseable;
        this.f23824c = oVar;
        this.f23825d = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // id.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(x70.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof id.w
            if (r0 == 0) goto L13
            r0 = r6
            id.w r0 = (id.w) r0
            int r1 = r0.f23819m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23819m = r1
            goto L1a
        L13:
            id.w r0 = new id.w
            z70.c r6 = (z70.c) r6
            r0.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r0.f23818k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f23819m
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            e90.i r0 = r0.f23817j
            ba0.g.M(r6)
            goto L43
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L32:
            ba0.g.M(r6)
            e90.i r6 = r5.f23825d
            r0.f23817j = r6
            r0.f23819m = r3
            java.lang.Object r0 = r6.b(r0)
            if (r0 != r1) goto L42
            return r1
        L42:
            r0 = r6
        L43:
            java.lang.AutoCloseable r6 = r5.f23823b     // Catch: java.lang.Throwable -> L69
            kotlin.jvm.internal.Ref$BooleanRef r1 = new kotlin.jvm.internal.Ref$BooleanRef     // Catch: java.lang.Throwable -> L6b
            r1.<init>()     // Catch: java.lang.Throwable -> L6b
            android.graphics.ImageDecoder$Source r2 = r5.f23822a     // Catch: java.lang.Throwable -> L6b
            id.x r3 = new id.x     // Catch: java.lang.Throwable -> L6b
            r3.<init>(r5, r1)     // Catch: java.lang.Throwable -> L6b
            android.graphics.Bitmap r2 = android.graphics.ImageDecoder.decodeBitmap(r2, r3)     // Catch: java.lang.Throwable -> L6b
            id.i r3 = new id.i     // Catch: java.lang.Throwable -> L6b
            fd.a r4 = new fd.a     // Catch: java.lang.Throwable -> L6b
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L6b
            boolean r1 = r1.element     // Catch: java.lang.Throwable -> L6b
            r3.<init>(r4, r1)     // Catch: java.lang.Throwable -> L6b
            r1 = 0
            w.b.y(r6, r1)     // Catch: java.lang.Throwable -> L69
            r0.d()
            return r3
        L69:
            r6 = move-exception
            goto L72
        L6b:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L6d
        L6d:
            r2 = move-exception
            w.b.y(r6, r1)     // Catch: java.lang.Throwable -> L69
            throw r2     // Catch: java.lang.Throwable -> L69
        L72:
            r0.d()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: id.y.a(x70.c):java.lang.Object");
    }
}
