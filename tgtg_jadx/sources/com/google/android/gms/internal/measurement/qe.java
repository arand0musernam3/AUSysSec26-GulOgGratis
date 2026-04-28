package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qe implements o30.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ te f11803b;

    public /* synthetic */ qe(te teVar, int i11) {
        this.f11802a = i11;
        this.f11803b = teVar;
    }

    @Override // o30.b0
    public final ListenableFuture apply(Object obj) throws IOException {
        ListenableFuture listenableFuture;
        switch (this.f11802a) {
            case 0:
                te teVar = this.f11803b;
                synchronized (teVar.f11893a) {
                    listenableFuture = (ListenableFuture) teVar.f11896d;
                    break;
                }
                return listenableFuture;
            case 1:
                te teVar2 = this.f11803b;
                return o30.o0.d(teVar2.l((Uri) o30.o0.b((ListenableFuture) teVar2.f11895c)));
            case 2:
                te teVar3 = this.f11803b;
                teVar3.m((Uri) o30.o0.b((ListenableFuture) teVar3.f11895c), obj);
                return o30.r0.f31913b;
            default:
                te teVar4 = this.f11803b;
                Uri uri = (Uri) obj;
                Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".bak")).build();
                try {
                    wd wdVar = (wd) teVar4.f11899g;
                    ud udVarB = wdVar.b(uriBuild);
                    if (udVarB.f11939a.b(udVarB.f11942d)) {
                        ud udVarB2 = wdVar.b(uriBuild);
                        ud udVarB3 = wdVar.b(uri);
                        ke keVar = udVarB2.f11939a;
                        if (keVar != udVarB3.f11939a) {
                            throw new zzsk("Cannot rename file across backends");
                        }
                        keVar.g(udVarB2.f11942d, udVarB3.f11942d);
                    }
                    return o30.r0.f31913b;
                } catch (IOException e5) {
                    return o30.o0.c(e5);
                }
        }
    }
}
